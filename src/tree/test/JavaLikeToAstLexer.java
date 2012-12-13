package tree.test;
// $ANTLR 3.4 /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g 2012-12-13 09:38:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaLikeToAstLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public JavaLikeToAstLexer() {} 
    public JavaLikeToAstLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaLikeToAstLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g"; }

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:23:9: ( 'var' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:23:11: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:24:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:24:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:24:30: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:25:9: ( ( '0' .. '9' )+ )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:25:11: ( '0' .. '9' )+
            {
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:25:11: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:26:9: ( ',' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:26:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:27:9: ( ';' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:27:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "LCUR"
    public final void mLCUR() throws RecognitionException {
        try {
            int _type = LCUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:28:9: ( '{' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:28:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCUR"

    // $ANTLR start "RCUR"
    public final void mRCUR() throws RecognitionException {
        try {
            int _type = RCUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:29:9: ( '}' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:29:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCUR"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
        try {
            int _type = LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:30:9: ( '(' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:30:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
        try {
            int _type = RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:31:9: ( ')' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:31:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAR"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:32:9: ( '=' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:32:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:33:9: ( '+' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:33:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:34:9: ( '-' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:34:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:35:9: ( '*' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:35:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:36:9: ( '/' )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:36:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:37:9: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' ) )
            // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:37:11: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:8: ( VAR | ID | INT | COMMA | SEMI | LCUR | RCUR | LPAR | RPAR | EQ | PLUS | MINUS | STAR | DIV | WS )
        int alt3=15;
        switch ( input.LA(1) ) {
        case 'v':
            {
            int LA3_1 = input.LA(2);

            if ( (LA3_1=='a') ) {
                int LA3_16 = input.LA(3);

                if ( (LA3_16=='r') ) {
                    int LA3_17 = input.LA(4);

                    if ( ((LA3_17 >= '0' && LA3_17 <= '9')||(LA3_17 >= 'A' && LA3_17 <= 'Z')||LA3_17=='_'||(LA3_17 >= 'a' && LA3_17 <= 'z')) ) {
                        alt3=2;
                    }
                    else {
                        alt3=1;
                    }
                }
                else {
                    alt3=2;
                }
            }
            else {
                alt3=2;
            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=2;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt3=3;
            }
            break;
        case ',':
            {
            alt3=4;
            }
            break;
        case ';':
            {
            alt3=5;
            }
            break;
        case '{':
            {
            alt3=6;
            }
            break;
        case '}':
            {
            alt3=7;
            }
            break;
        case '(':
            {
            alt3=8;
            }
            break;
        case ')':
            {
            alt3=9;
            }
            break;
        case '=':
            {
            alt3=10;
            }
            break;
        case '+':
            {
            alt3=11;
            }
            break;
        case '-':
            {
            alt3=12;
            }
            break;
        case '*':
            {
            alt3=13;
            }
            break;
        case '/':
            {
            alt3=14;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt3=15;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:10: VAR
                {
                mVAR(); 


                }
                break;
            case 2 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:14: ID
                {
                mID(); 


                }
                break;
            case 3 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:17: INT
                {
                mINT(); 


                }
                break;
            case 4 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:21: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 5 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:27: SEMI
                {
                mSEMI(); 


                }
                break;
            case 6 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:32: LCUR
                {
                mLCUR(); 


                }
                break;
            case 7 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:37: RCUR
                {
                mRCUR(); 


                }
                break;
            case 8 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:42: LPAR
                {
                mLPAR(); 


                }
                break;
            case 9 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:47: RPAR
                {
                mRPAR(); 


                }
                break;
            case 10 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:52: EQ
                {
                mEQ(); 


                }
                break;
            case 11 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:55: PLUS
                {
                mPLUS(); 


                }
                break;
            case 12 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:60: MINUS
                {
                mMINUS(); 


                }
                break;
            case 13 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:66: STAR
                {
                mSTAR(); 


                }
                break;
            case 14 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:71: DIV
                {
                mDIV(); 


                }
                break;
            case 15 :
                // /Users/lorenzo/Documents/Environment/Workspace/Adverto-Workspace/JavaLikeTest/resources/JavaLikeToAst.g:1:75: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}