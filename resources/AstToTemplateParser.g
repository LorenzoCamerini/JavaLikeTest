tree grammar AstToTemplateParser;

options { 
    output = template;
    tokenVocab = JavaLikeToAst;
    ASTLabelType = CommonTree;
}


program
    : ^(PROGRAM decls+=decl+) -> write(text={$decls})
    ;

decl
    : ^(DECL ID ^(op args+=arg*)) -> assign(name={$ID.text}, op={$op.st}, args={$args})
    | ^(DECL ID ^(CALL method args+=arg*)) -> assign(name={$ID.text}, op={$method.st}, args={$args})
    ;

arg 
    : ID -> write(text={$ID.text})
    | INT -> write(text={$INT.text})
    ;

method
    : ID -> op(name={$ID.text})
    ;

op  : STAR  -> op(name={$STAR.text})
    | DIV   -> op(name={$DIV.text})
    | PLUS  -> op(name={$PLUS.text})
    | MINUS -> op(name={$MINUS.text})
    ;