package tree.test;
// $ANTLR 3.4 /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g 2012-12-13 09:38:24

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AstToTemplateParser extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public AstToTemplateParser(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public AstToTemplateParser(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("AstToTemplateParserTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return AstToTemplateParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g"; }


    public static class program_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "program"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:10:1: program : ^( PROGRAM (decls+= decl )+ ) -> write(text=$decls);
    public final AstToTemplateParser.program_return program() throws RecognitionException {
        AstToTemplateParser.program_return retval = new AstToTemplateParser.program_return();
        retval.start = input.LT(1);


        List list_decls=null;
        RuleReturnScope decls = null;
        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:11:5: ( ^( PROGRAM (decls+= decl )+ ) -> write(text=$decls))
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:11:7: ^( PROGRAM (decls+= decl )+ )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program57); 

            match(input, Token.DOWN, null); 
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:11:22: (decls+= decl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:11:22: decls+= decl
            	    {
            	    pushFollow(FOLLOW_decl_in_program61);
            	    decls=decl();

            	    state._fsp--;

            	    if (list_decls==null) list_decls=new ArrayList();
            	    list_decls.add(decls.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 11:31: -> write(text=$decls)
            {
                retval.st = templateLib.getInstanceOf("write",new STAttrMap().put("text", list_decls));
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
    // $ANTLR end "program"


    public static class decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "decl"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:14:1: decl : ( ^( DECL ID ^( op (args+= arg )* ) ) -> assign(name=$ID.textop=$op.stargs=$args)| ^( DECL ID ^( CALL method (args+= arg )* ) ) -> assign(name=$ID.textop=$method.stargs=$args));
    public final AstToTemplateParser.decl_return decl() throws RecognitionException {
        AstToTemplateParser.decl_return retval = new AstToTemplateParser.decl_return();
        retval.start = input.LT(1);


        CommonTree ID1=null;
        CommonTree ID3=null;
        List list_args=null;
        AstToTemplateParser.op_return op2 =null;

        AstToTemplateParser.method_return method4 =null;

        RuleReturnScope args = null;
        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:15:5: ( ^( DECL ID ^( op (args+= arg )* ) ) -> assign(name=$ID.textop=$op.stargs=$args)| ^( DECL ID ^( CALL method (args+= arg )* ) ) -> assign(name=$ID.textop=$method.stargs=$args))
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DECL) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==DOWN) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==ID) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==CALL) ) {
                            alt4=2;
                        }
                        else if ( (LA4_3==DIV||(LA4_3 >= MINUS && LA4_3 <= PLUS)||LA4_3==STAR) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:15:7: ^( DECL ID ^( op (args+= arg )* ) )
                    {
                    match(input,DECL,FOLLOW_DECL_in_decl90); 

                    match(input, Token.DOWN, null); 
                    ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_decl92); 

                    pushFollow(FOLLOW_op_in_decl95);
                    op2=op();

                    state._fsp--;


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:15:26: (args+= arg )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( ((LA2_0 >= ID && LA2_0 <= INT)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:15:26: args+= arg
                        	    {
                        	    pushFollow(FOLLOW_arg_in_decl99);
                        	    args=arg();

                        	    state._fsp--;

                        	    if (list_args==null) list_args=new ArrayList();
                        	    list_args.add(args.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop2;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 15:35: -> assign(name=$ID.textop=$op.stargs=$args)
                    {
                        retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("name", (ID1!=null?ID1.getText():null)).put("op", (op2!=null?op2.st:null)).put("args", list_args));
                    }



                    }
                    break;
                case 2 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:16:7: ^( DECL ID ^( CALL method (args+= arg )* ) )
                    {
                    match(input,DECL,FOLLOW_DECL_in_decl130); 

                    match(input, Token.DOWN, null); 
                    ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_decl132); 

                    match(input,CALL,FOLLOW_CALL_in_decl135); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_method_in_decl137);
                    method4=method();

                    state._fsp--;


                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:16:35: (args+= arg )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= ID && LA3_0 <= INT)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:16:35: args+= arg
                    	    {
                    	    pushFollow(FOLLOW_arg_in_decl141);
                    	    args=arg();

                    	    state._fsp--;

                    	    if (list_args==null) list_args=new ArrayList();
                    	    list_args.add(args.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    match(input, Token.UP, null); 


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 16:44: -> assign(name=$ID.textop=$method.stargs=$args)
                    {
                        retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("name", (ID3!=null?ID3.getText():null)).put("op", (method4!=null?method4.st:null)).put("args", list_args));
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
    // $ANTLR end "decl"


    public static class arg_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "arg"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:19:1: arg : ( ID -> write(text=$ID.text)| INT -> write(text=$INT.text));
    public final AstToTemplateParser.arg_return arg() throws RecognitionException {
        AstToTemplateParser.arg_return retval = new AstToTemplateParser.arg_return();
        retval.start = input.LT(1);


        CommonTree ID5=null;
        CommonTree INT6=null;

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:20:5: ( ID -> write(text=$ID.text)| INT -> write(text=$INT.text))
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:20:7: ID
                    {
                    ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_arg181); 

                    // TEMPLATE REWRITE
                    // 20:10: -> write(text=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("write",new STAttrMap().put("text", (ID5!=null?ID5.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:21:7: INT
                    {
                    INT6=(CommonTree)match(input,INT,FOLLOW_INT_in_arg198); 

                    // TEMPLATE REWRITE
                    // 21:11: -> write(text=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("write",new STAttrMap().put("text", (INT6!=null?INT6.getText():null)));
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
    // $ANTLR end "arg"


    public static class method_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "method"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:24:1: method : ID -> op(name=$ID.text);
    public final AstToTemplateParser.method_return method() throws RecognitionException {
        AstToTemplateParser.method_return retval = new AstToTemplateParser.method_return();
        retval.start = input.LT(1);


        CommonTree ID7=null;

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:25:5: ( ID -> op(name=$ID.text))
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:25:7: ID
            {
            ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_method224); 

            // TEMPLATE REWRITE
            // 25:10: -> op(name=$ID.text)
            {
                retval.st = templateLib.getInstanceOf("op",new STAttrMap().put("name", (ID7!=null?ID7.getText():null)));
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
    // $ANTLR end "method"


    public static class op_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "op"
    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:28:1: op : ( STAR -> op(name=$STAR.text)| DIV -> op(name=$DIV.text)| PLUS -> op(name=$PLUS.text)| MINUS -> op(name=$MINUS.text));
    public final AstToTemplateParser.op_return op() throws RecognitionException {
        AstToTemplateParser.op_return retval = new AstToTemplateParser.op_return();
        retval.start = input.LT(1);


        CommonTree STAR8=null;
        CommonTree DIV9=null;
        CommonTree PLUS10=null;
        CommonTree MINUS11=null;

        try {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:28:5: ( STAR -> op(name=$STAR.text)| DIV -> op(name=$DIV.text)| PLUS -> op(name=$PLUS.text)| MINUS -> op(name=$MINUS.text))
            int alt6=4;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt6=1;
                }
                break;
            case DIV:
                {
                alt6=2;
                }
                break;
            case PLUS:
                {
                alt6=3;
                }
                break;
            case MINUS:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:28:7: STAR
                    {
                    STAR8=(CommonTree)match(input,STAR,FOLLOW_STAR_in_op247); 

                    // TEMPLATE REWRITE
                    // 28:13: -> op(name=$STAR.text)
                    {
                        retval.st = templateLib.getInstanceOf("op",new STAttrMap().put("name", (STAR8!=null?STAR8.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:29:7: DIV
                    {
                    DIV9=(CommonTree)match(input,DIV,FOLLOW_DIV_in_op265); 

                    // TEMPLATE REWRITE
                    // 29:13: -> op(name=$DIV.text)
                    {
                        retval.st = templateLib.getInstanceOf("op",new STAttrMap().put("name", (DIV9!=null?DIV9.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:30:7: PLUS
                    {
                    PLUS10=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_op284); 

                    // TEMPLATE REWRITE
                    // 30:13: -> op(name=$PLUS.text)
                    {
                        retval.st = templateLib.getInstanceOf("op",new STAttrMap().put("name", (PLUS10!=null?PLUS10.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/AstToTemplateParser.g:31:7: MINUS
                    {
                    MINUS11=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_op302); 

                    // TEMPLATE REWRITE
                    // 31:13: -> op(name=$MINUS.text)
                    {
                        retval.st = templateLib.getInstanceOf("op",new STAttrMap().put("name", (MINUS11!=null?MINUS11.getText():null)));
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
    // $ANTLR end "op"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_program57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_decl_in_program61 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_DECL_in_decl90 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_decl92 = new BitSet(new long[]{0x0000000000086080L});
    public static final BitSet FOLLOW_op_in_decl95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_in_decl99 = new BitSet(new long[]{0x0000000000000608L});
    public static final BitSet FOLLOW_DECL_in_decl130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_decl132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CALL_in_decl135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_in_decl137 = new BitSet(new long[]{0x0000000000000608L});
    public static final BitSet FOLLOW_arg_in_decl141 = new BitSet(new long[]{0x0000000000000608L});
    public static final BitSet FOLLOW_ID_in_arg181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_arg198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_op247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_op265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_op284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_op302 = new BitSet(new long[]{0x0000000000000002L});

}