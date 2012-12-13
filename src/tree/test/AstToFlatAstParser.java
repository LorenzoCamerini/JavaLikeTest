package tree.test;
// $ANTLR 3.4 /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g 2012-12-13 09:38:48
 
    import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AstToFlatAstParser extends TreeRewriter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "COMMA", "DECL", "DIV", "EQ", "ID", "INT", "LCUR", "LPAR", "MINUS", "PLUS", "PROGRAM", "RCUR", "RPAR", "SEMI", "STAR", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int CALL=4;
    public static final int COMMA=5;
    public static final int DECL=6;
    public static final int DIV=7;
    public static final int EQ=8;
    public static final int ID=9;
    public static final int INT=10;
    public static final int LCUR=11;
    public static final int LPAR=12;
    public static final int MINUS=13;
    public static final int PLUS=14;
    public static final int PROGRAM=15;
    public static final int RCUR=16;
    public static final int RPAR=17;
    public static final int SEMI=18;
    public static final int STAR=19;
    public static final int VAR=20;
    public static final int WS=21;

    // delegates
    public TreeRewriter[] getDelegates() {
        return new TreeRewriter[] {};
    }

    // delegators


    public AstToFlatAstParser(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public AstToFlatAstParser(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AstToFlatAstParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g"; }


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


    public static class bottomup_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bottomup"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:54:1: bottomup : ( exit_program | exit_op );
    public final AstToFlatAstParser.bottomup_return bottomup() throws RecognitionException {
        AstToFlatAstParser.bottomup_return retval = new AstToFlatAstParser.bottomup_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        AstToFlatAstParser.exit_program_return exit_program1 =null;

        AstToFlatAstParser.exit_op_return exit_op2 =null;



        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:55:5: ( exit_program | exit_op )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PROGRAM) ) {
                alt1=1;
            }
            else if ( (LA1_0==CALL||LA1_0==DIV||(LA1_0 >= MINUS && LA1_0 <= PLUS)||LA1_0==STAR) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:55:7: exit_program
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_exit_program_in_bottomup79);
                    exit_program1=exit_program();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = exit_program1.tree;


                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
                    }
                    }
                    break;
                case 2 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:56:7: exit_op
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_exit_op_in_bottomup87);
                    exit_op2=exit_op();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = exit_op2.tree;


                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
                    }
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bottomup"


    public static class exit_op_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exit_op"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:59:1: exit_op : ( ^( binary_op reduced reduced ) {...}? ->| ^( CALL ID ( . )* ) {...}? ->);
    public final AstToFlatAstParser.exit_op_return exit_op() throws RecognitionException {
        AstToFlatAstParser.exit_op_return retval = new AstToFlatAstParser.exit_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CALL6=null;
        CommonTree ID7=null;
        CommonTree wildcard8=null;
        AstToFlatAstParser.binary_op_return binary_op3 =null;

        AstToFlatAstParser.reduced_return reduced4 =null;

        AstToFlatAstParser.reduced_return reduced5 =null;


        CommonTree CALL6_tree=null;
        CommonTree ID7_tree=null;
        CommonTree wildcard8_tree=null;
        RewriteRuleNodeStream stream_CALL=new RewriteRuleNodeStream(adaptor,"token CALL");
        RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_reduced=new RewriteRuleSubtreeStream(adaptor,"rule reduced");
        RewriteRuleSubtreeStream stream_binary_op=new RewriteRuleSubtreeStream(adaptor,"rule binary_op");

                int myId = nextId();
            
        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:63:5: ( ^( binary_op reduced reduced ) {...}? ->| ^( CALL ID ( . )* ) {...}? ->)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DIV||(LA3_0 >= MINUS && LA3_0 <= PLUS)||LA3_0==STAR) ) {
                alt3=1;
            }
            else if ( (LA3_0==CALL) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:63:7: ^( binary_op reduced reduced ) {...}?
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_binary_op_in_exit_op114);
                    binary_op3=binary_op();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_binary_op.add(binary_op3.getTree());

                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = binary_op3.tree;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_reduced_in_exit_op116);
                    reduced4=reduced();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_reduced.add(reduced4.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_reduced_in_exit_op118);
                    reduced5=reduced();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_reduced.add(reduced5.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;
                    _last = _save_last_1;
                    }


                    if ( !((((CommonTree)retval.start).parent != null && ((CommonTree)retval.start).parent.getType() != DECL)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "exit_op", "$start.parent != null && $start.parent.getType() != DECL");
                    }

                    if ( state.backtracking==1 ) {saveExpr(myId, ((CommonTree)retval.start));}

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 66:9: ->
                    {
                        adaptor.addChild(root_0, generateId(myId));

                    }


                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:67:7: ^( CALL ID ( . )* ) {...}?
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    CALL6=(CommonTree)match(input,CALL,FOLLOW_CALL_in_exit_op162); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_CALL.add(CALL6);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = CALL6;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_exit_op164); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_ID.add(ID7);


                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:67:17: ( . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= CALL && LA2_0 <= WS)) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0==UP) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:67:17: .
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    wildcard8=(CommonTree)input.LT(1);

                    	    matchAny(input); if (state.failed) return retval;
                    	     
                    	    if ( state.backtracking==1 )
                    	    if ( _first_1==null ) _first_1 = wildcard8;


                    	    if ( state.backtracking==1 ) {
                    	    retval.tree = (CommonTree)_first_0;
                    	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                    	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    _last = _save_last_1;
                    }


                    if ( !((((CommonTree)retval.start).parent != null && ((CommonTree)retval.start).parent.getType() != DECL)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "exit_op", "$start.parent != null && $start.parent.getType() != DECL");
                    }

                    if ( state.backtracking==1 ) {saveExpr(myId, ((CommonTree)retval.start));}

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:9: ->
                    {
                        adaptor.addChild(root_0, generateId(myId));

                    }


                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exit_op"


    public static class binary_op_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binary_op"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:73:1: binary_op : ( STAR | DIV | PLUS | MINUS );
    public final AstToFlatAstParser.binary_op_return binary_op() throws RecognitionException {
        AstToFlatAstParser.binary_op_return retval = new AstToFlatAstParser.binary_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:73:17: ( STAR | DIV | PLUS | MINUS )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:
            {
            _last = (CommonTree)input.LT(1);
            set9=(CommonTree)input.LT(1);

            if ( input.LA(1)==DIV||(input.LA(1) >= MINUS && input.LA(1) <= PLUS)||input.LA(1)==STAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==1 ) {
            retval.tree = (CommonTree)_first_0;
            if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            } 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binary_op"


    public static class reduced_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reduced"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:75:1: reduced : ( ID | INT );
    public final AstToFlatAstParser.reduced_return reduced() throws RecognitionException {
        AstToFlatAstParser.reduced_return retval = new AstToFlatAstParser.reduced_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:75:17: ( ID | INT )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:
            {
            _last = (CommonTree)input.LT(1);
            set10=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==1 ) {
            retval.tree = (CommonTree)_first_0;
            if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            } 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "reduced"


    public static class exit_program_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exit_program"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:77:1: exit_program :{...}? ^( PROGRAM (old+= . )* ) -> ^( PROGRAM ( $old)* ) ;
    public final AstToFlatAstParser.exit_program_return exit_program() throws RecognitionException {
        AstToFlatAstParser.exit_program_return retval = new AstToFlatAstParser.exit_program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PROGRAM11=null;
        CommonTree old=null;
        List list_old=null;

        CommonTree PROGRAM11_tree=null;
        CommonTree old_tree=null;
        RewriteRuleNodeStream stream_PROGRAM=new RewriteRuleNodeStream(adaptor,"token PROGRAM");

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:80:5: ({...}? ^( PROGRAM (old+= . )* ) -> ^( PROGRAM ( $old)* ) )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:80:7: {...}? ^( PROGRAM (old+= . )* )
            {
            if ( !((newDecls)) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "exit_program", "newDecls");
            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            PROGRAM11=(CommonTree)match(input,PROGRAM,FOLLOW_PROGRAM_in_exit_program283); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_PROGRAM.add(PROGRAM11);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = PROGRAM11;
            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:80:32: (old+= . )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0 >= CALL && LA4_0 <= WS)) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:80:32: old+= .
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    old=(CommonTree)input.LT(1);

                	    matchAny(input); if (state.failed) return retval;
                	     
                	    if ( state.backtracking==1 )
                	    if ( _first_1==null ) _first_1 = old;

                	    if (list_old==null) list_old=new ArrayList();
                	    list_old.add(old);


                	    if ( state.backtracking==1 ) {
                	    retval.tree = (CommonTree)_first_0;
                	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
                	    }
                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            _last = _save_last_1;
            }


            if ( state.backtracking==1 ) {newDecls = false;}

            // AST REWRITE
            // elements: PROGRAM, old
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: old
            if ( state.backtracking==1 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_old=new RewriteRuleSubtreeStream(adaptor,"wildcard old",list_old);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 81:9: -> ^( PROGRAM ( $old)* )
            {
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:81:12: ^( PROGRAM ( $old)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_PROGRAM.nextNode()
                , root_1);

                adaptor.addChild(root_1, buildNewDecls());

                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToFlatAstParser.g:81:41: ( $old)*
                while ( stream_old.hasNext() ) {
                    adaptor.addChild(root_1, stream_old.nextTree());

                }
                stream_old.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exit_program"

    // Delegated rules


 

    public static final BitSet FOLLOW_exit_program_in_bottomup79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_op_in_bottomup87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_op_in_exit_op114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reduced_in_exit_op116 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_reduced_in_exit_op118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_exit_op162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_exit_op164 = new BitSet(new long[]{0x00000000003FFFF8L});
    public static final BitSet FOLLOW_PROGRAM_in_exit_program283 = new BitSet(new long[]{0x0000000000000004L});

}