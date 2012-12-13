package tree.test;
// $ANTLR 3.4 /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g 2012-12-13 09:38:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaLikeToAstParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public JavaLikeToAstParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaLikeToAstParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return JavaLikeToAstParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g"; }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compilationUnit"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:12:1: compilationUnit : ( statement )* EOF -> ^( PROGRAM ( statement )* ) ;
    public final JavaLikeToAstParser.compilationUnit_return compilationUnit() throws RecognitionException {
        JavaLikeToAstParser.compilationUnit_return retval = new JavaLikeToAstParser.compilationUnit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        JavaLikeToAstParser.statement_return statement1 =null;


        Object EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:12:17: ( ( statement )* EOF -> ^( PROGRAM ( statement )* ) )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:12:19: ( statement )* EOF
            {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:12:19: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==VAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:12:19: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compilationUnit48);
            	    statement1=statement();

            	    state._fsp--;

            	    stream_statement.add(statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_compilationUnit51);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 12:34: -> ^( PROGRAM ( statement )* )
            {
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:12:37: ^( PROGRAM ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:12:47: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:13:1: statement : decl ;
    public final JavaLikeToAstParser.statement_return statement() throws RecognitionException {
        JavaLikeToAstParser.statement_return retval = new JavaLikeToAstParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaLikeToAstParser.decl_return decl3 =null;



        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:13:17: ( decl )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:13:19: decl
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_decl_in_statement73);
            decl3=decl();

            state._fsp--;

            adaptor.addChild(root_0, decl3.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decl"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:14:1: decl : VAR ID EQ expr -> ^( DECL ID expr ) ;
    public final JavaLikeToAstParser.decl_return decl() throws RecognitionException {
        JavaLikeToAstParser.decl_return retval = new JavaLikeToAstParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR4=null;
        Token ID5=null;
        Token EQ6=null;
        JavaLikeToAstParser.expr_return expr7 =null;


        Object VAR4_tree=null;
        Object ID5_tree=null;
        Object EQ6_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:14:17: ( VAR ID EQ expr -> ^( DECL ID expr ) )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:14:19: VAR ID EQ expr
            {
            VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_decl91);  
            stream_VAR.add(VAR4);


            ID5=(Token)match(input,ID,FOLLOW_ID_in_decl93);  
            stream_ID.add(ID5);


            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_decl95);  
            stream_EQ.add(EQ6);


            pushFollow(FOLLOW_expr_in_decl97);
            expr7=expr();

            state._fsp--;

            stream_expr.add(expr7.getTree());

            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 14:34: -> ^( DECL ID expr )
            {
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:14:37: ^( DECL ID expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECL, "DECL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decl"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:15:1: expr : add_expr ;
    public final JavaLikeToAstParser.expr_return expr() throws RecognitionException {
        JavaLikeToAstParser.expr_return retval = new JavaLikeToAstParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaLikeToAstParser.add_expr_return add_expr8 =null;



        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:15:17: ( add_expr )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:15:19: add_expr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_add_expr_in_expr125);
            add_expr8=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr8.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class add_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add_expr"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:16:1: add_expr : mul_expr ( ( PLUS | MINUS ) ^ mul_expr )* ;
    public final JavaLikeToAstParser.add_expr_return add_expr() throws RecognitionException {
        JavaLikeToAstParser.add_expr_return retval = new JavaLikeToAstParser.add_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set10=null;
        JavaLikeToAstParser.mul_expr_return mul_expr9 =null;

        JavaLikeToAstParser.mul_expr_return mul_expr11 =null;


        Object set10_tree=null;

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:16:17: ( mul_expr ( ( PLUS | MINUS ) ^ mul_expr )* )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:16:19: mul_expr ( ( PLUS | MINUS ) ^ mul_expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_mul_expr_in_add_expr139);
            mul_expr9=mul_expr();

            state._fsp--;

            adaptor.addChild(root_0, mul_expr9.getTree());

            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:16:28: ( ( PLUS | MINUS ) ^ mul_expr )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= MINUS && LA2_0 <= PLUS)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:16:29: ( PLUS | MINUS ) ^ mul_expr
            	    {
            	    set10=(Token)input.LT(1);

            	    set10=(Token)input.LT(1);

            	    if ( (input.LA(1) >= MINUS && input.LA(1) <= PLUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set10)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_expr_in_add_expr149);
            	    mul_expr11=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_expr11.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add_expr"


    public static class mul_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul_expr"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:17:1: mul_expr : call_expr ( ( STAR | DIV ) ^ call_expr )* ;
    public final JavaLikeToAstParser.mul_expr_return mul_expr() throws RecognitionException {
        JavaLikeToAstParser.mul_expr_return retval = new JavaLikeToAstParser.mul_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set13=null;
        JavaLikeToAstParser.call_expr_return call_expr12 =null;

        JavaLikeToAstParser.call_expr_return call_expr14 =null;


        Object set13_tree=null;

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:17:17: ( call_expr ( ( STAR | DIV ) ^ call_expr )* )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:17:19: call_expr ( ( STAR | DIV ) ^ call_expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_call_expr_in_mul_expr165);
            call_expr12=call_expr();

            state._fsp--;

            adaptor.addChild(root_0, call_expr12.getTree());

            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:17:29: ( ( STAR | DIV ) ^ call_expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DIV||LA3_0==STAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:17:30: ( STAR | DIV ) ^ call_expr
            	    {
            	    set13=(Token)input.LT(1);

            	    set13=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==STAR ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set13)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_call_expr_in_mul_expr175);
            	    call_expr14=call_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call_expr14.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mul_expr"


    public static class call_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call_expr"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:18:1: call_expr : ( ID LPAR ( arglist )? RPAR -> ^( CALL ID ( arglist )? ) | primary_expr );
    public final JavaLikeToAstParser.call_expr_return call_expr() throws RecognitionException {
        JavaLikeToAstParser.call_expr_return retval = new JavaLikeToAstParser.call_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID15=null;
        Token LPAR16=null;
        Token RPAR18=null;
        JavaLikeToAstParser.arglist_return arglist17 =null;

        JavaLikeToAstParser.primary_expr_return primary_expr19 =null;


        Object ID15_tree=null;
        Object LPAR16_tree=null;
        Object RPAR18_tree=null;
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arglist=new RewriteRuleSubtreeStream(adaptor,"rule arglist");
        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:18:17: ( ID LPAR ( arglist )? RPAR -> ^( CALL ID ( arglist )? ) | primary_expr )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==LPAR) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||LA5_1==COMMA||LA5_1==DIV||(LA5_1 >= MINUS && LA5_1 <= PLUS)||LA5_1==RPAR||(LA5_1 >= STAR && LA5_1 <= VAR)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0==INT||LA5_0==LPAR) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:18:19: ID LPAR ( arglist )? RPAR
                    {
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_call_expr190);  
                    stream_ID.add(ID15);


                    LPAR16=(Token)match(input,LPAR,FOLLOW_LPAR_in_call_expr192);  
                    stream_LPAR.add(LPAR16);


                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:18:27: ( arglist )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0 >= ID && LA4_0 <= INT)||LA4_0==LPAR) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:18:27: arglist
                            {
                            pushFollow(FOLLOW_arglist_in_call_expr194);
                            arglist17=arglist();

                            state._fsp--;

                            stream_arglist.add(arglist17.getTree());

                            }
                            break;

                    }


                    RPAR18=(Token)match(input,RPAR,FOLLOW_RPAR_in_call_expr197);  
                    stream_RPAR.add(RPAR18);


                    // AST REWRITE
                    // elements: arglist, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 18:41: -> ^( CALL ID ( arglist )? )
                    {
                        // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:18:44: ^( CALL ID ( arglist )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:18:54: ( arglist )?
                        if ( stream_arglist.hasNext() ) {
                            adaptor.addChild(root_1, stream_arglist.nextTree());

                        }
                        stream_arglist.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:19:19: primary_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primary_expr_in_call_expr228);
                    primary_expr19=primary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, primary_expr19.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "call_expr"


    public static class arglist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arglist"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:20:1: arglist : expr ( COMMA ! expr )* ;
    public final JavaLikeToAstParser.arglist_return arglist() throws RecognitionException {
        JavaLikeToAstParser.arglist_return retval = new JavaLikeToAstParser.arglist_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA21=null;
        JavaLikeToAstParser.expr_return expr20 =null;

        JavaLikeToAstParser.expr_return expr22 =null;


        Object COMMA21_tree=null;

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:20:17: ( expr ( COMMA ! expr )* )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:20:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_arglist243);
            expr20=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr20.getTree());

            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:20:24: ( COMMA ! expr )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:20:25: COMMA ! expr
            	    {
            	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_arglist246); 

            	    pushFollow(FOLLOW_expr_in_arglist249);
            	    expr22=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr22.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arglist"


    public static class primary_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expr"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:21:1: primary_expr : ( ID | INT | LPAR ! expr RPAR !);
    public final JavaLikeToAstParser.primary_expr_return primary_expr() throws RecognitionException {
        JavaLikeToAstParser.primary_expr_return retval = new JavaLikeToAstParser.primary_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID23=null;
        Token INT24=null;
        Token LPAR25=null;
        Token RPAR27=null;
        JavaLikeToAstParser.expr_return expr26 =null;


        Object ID23_tree=null;
        Object INT24_tree=null;
        Object LPAR25_tree=null;
        Object RPAR27_tree=null;

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:21:17: ( ID | INT | LPAR ! expr RPAR !)
            int alt7=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt7=1;
                }
                break;
            case INT:
                {
                alt7=2;
                }
                break;
            case LPAR:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:21:19: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID23=(Token)match(input,ID,FOLLOW_ID_in_primary_expr261); 
                    ID23_tree = 
                    (Object)adaptor.create(ID23)
                    ;
                    adaptor.addChild(root_0, ID23_tree);


                    }
                    break;
                case 2 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:21:24: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT24=(Token)match(input,INT,FOLLOW_INT_in_primary_expr265); 
                    INT24_tree = 
                    (Object)adaptor.create(INT24)
                    ;
                    adaptor.addChild(root_0, INT24_tree);


                    }
                    break;
                case 3 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:21:30: LPAR ! expr RPAR !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAR25=(Token)match(input,LPAR,FOLLOW_LPAR_in_primary_expr269); 

                    pushFollow(FOLLOW_expr_in_primary_expr272);
                    expr26=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr26.getTree());

                    RPAR27=(Token)match(input,RPAR,FOLLOW_RPAR_in_primary_expr274); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary_expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_compilationUnit48 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_statement73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl91 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_decl93 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_decl95 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_expr_in_decl97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_expr125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr139 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_set_in_add_expr142 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr149 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_call_expr_in_mul_expr165 = new BitSet(new long[]{0x0000000000080082L});
    public static final BitSet FOLLOW_set_in_mul_expr168 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_call_expr_in_mul_expr175 = new BitSet(new long[]{0x0000000000080082L});
    public static final BitSet FOLLOW_ID_in_call_expr190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_call_expr192 = new BitSet(new long[]{0x0000000000021600L});
    public static final BitSet FOLLOW_arglist_in_call_expr194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAR_in_call_expr197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_call_expr228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_arglist243 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_arglist246 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_expr_in_arglist249 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_primary_expr261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_expr265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_primary_expr269 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_expr_in_primary_expr272 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAR_in_primary_expr274 = new BitSet(new long[]{0x0000000000000002L});

}