tree grammar AstToFlatAstParser;


options { 
    output = AST;
    tokenVocab = JavaLikeToAst;
    ASTLabelType = CommonTree;
    filter = true;
}

@header { 
    import java.util.HashMap;
}

@members {
    private int currentId = 0;
    private HashMap<Integer, Object> exprs = new HashMap<Integer, Object>();
    private boolean newDecls = false;

    private int nextId() { 
        return currentId++;
    }

    private Object generateId(int id) { 
        return adaptor.create(ID, "var" + id);
    }  

    private void saveExpr(int id, Object expr){
        newDecls = true;
        exprs.put(id, expr);
    }

    private Object buildNewDecls() {
        Object newDecls = adaptor.nil();

        for (int i = 0; i < currentId; ++i){
            if (!exprs.containsKey(i)){
                continue; //This id was generated but not used.
            }

            Object expr = exprs.get(i);
            Object decl = adaptor.create(DECL, tokenNames[DECL]);
            adaptor.addChild(decl, adaptor.create(ID, "var" + i));
            adaptor.addChild(decl, expr);
            adaptor.addChild(newDecls, decl);
        }

        exprs.clear();

        return newDecls;
    }
}

bottomup
    : exit_program
    | exit_op
    ;

exit_op
    @init {
        int myId = nextId();
    }
    : ^(binary_op reduced reduced)
        {$start.parent != null && $start.parent.getType() != DECL}? 
        {saveExpr(myId, $start);} 
        -> {generateId(myId)}
    | ^(CALL ID .*) 
        {$start.parent != null && $start.parent.getType() != DECL}? 
        {saveExpr(myId, $start);} 
        -> {generateId(myId)}
    ;   

binary_op       : STAR | DIV | PLUS | MINUS;

reduced         : ID | INT; 

exit_program
    //Only rebuild PROGRAM if a new declaration is going to be built, that is, when "newDecls" is true.
    //Otherwise PROGRAM is considered changed when it isn't and the processing never ends.
    : {newDecls}? ^(PROGRAM old+=.*) {newDecls = false;} 
        -> ^(PROGRAM {buildNewDecls()} $old*)
    ;