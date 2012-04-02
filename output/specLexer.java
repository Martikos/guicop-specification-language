// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g 2012-04-02 19:05:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class specLexer extends Lexer {
    public static final int WS=7;
    public static final int NEWLINE=9;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__13=13;
    public static final int OPERATOR=4;
    public static final int T__10=10;
    public static final int TAB=8;
    public static final int INT=5;
    public static final int ID=6;
    public static final int EOF=-1;

    // delegates
    // delegators

    public specLexer() {;} 
    public specLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public specLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:3:7: ( 'specobject' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:3:9: 'specobject'
            {
            match("specobject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:4:7: ( 'variables' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:4:9: 'variables'
            {
            match("variables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:5:7: ( 'properties' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:5:9: 'properties'
            {
            match("properties"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:6:7: ( 'constraints' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:6:9: 'constraints'
            {
            match("constraints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:12:9: ( 'leftto' | 'rightto' | 'above' | 'below' | 'contains' | 'over' | 'smaller' | 'leftaligned' | 'rightaligned' | 'topaligned' | 'bottomaligned' | 'textsubstring' | 'textsmaller' | 'textconcatenate' | 'and' | 'or' | 'xor' | '+' | '-' | '*' | '/' | '=' | '.' )
            int alt1=23;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:14:3: 'leftto'
                    {
                    match("leftto"); 


                    }
                    break;
                case 2 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:15:4: 'rightto'
                    {
                    match("rightto"); 


                    }
                    break;
                case 3 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:16:4: 'above'
                    {
                    match("above"); 


                    }
                    break;
                case 4 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:17:4: 'below'
                    {
                    match("below"); 


                    }
                    break;
                case 5 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:18:4: 'contains'
                    {
                    match("contains"); 


                    }
                    break;
                case 6 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:19:4: 'over'
                    {
                    match("over"); 


                    }
                    break;
                case 7 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:20:4: 'smaller'
                    {
                    match("smaller"); 


                    }
                    break;
                case 8 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:21:4: 'leftaligned'
                    {
                    match("leftaligned"); 


                    }
                    break;
                case 9 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:22:4: 'rightaligned'
                    {
                    match("rightaligned"); 


                    }
                    break;
                case 10 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:23:4: 'topaligned'
                    {
                    match("topaligned"); 


                    }
                    break;
                case 11 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:24:4: 'bottomaligned'
                    {
                    match("bottomaligned"); 


                    }
                    break;
                case 12 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:27:4: 'textsubstring'
                    {
                    match("textsubstring"); 


                    }
                    break;
                case 13 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:28:4: 'textsmaller'
                    {
                    match("textsmaller"); 


                    }
                    break;
                case 14 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:29:4: 'textconcatenate'
                    {
                    match("textconcatenate"); 


                    }
                    break;
                case 15 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:32:4: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 16 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:33:4: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 17 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:34:4: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 18 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:37:4: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 19 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:38:4: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 20 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:39:4: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 21 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:40:4: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 22 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:43:4: '='
                    {
                    match('='); 

                    }
                    break;
                case 23 :
                    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:44:4: '.'
                    {
                    match('.'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:48:5: ( ( '1' .. '9' )+ )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:48:7: ( '1' .. '9' )+
            {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:48:7: ( '1' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:48:8: '1' .. '9'
            	    {
            	    matchRange('1','9'); 

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
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:52:4: ( ( 'a' .. 'z' | '\\_' ) ( 'a' .. 'z' | '0' .. '9' | '\\_' )+ )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:52:6: ( 'a' .. 'z' | '\\_' ) ( 'a' .. 'z' | '0' .. '9' | '\\_' )+
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:52:22: ( 'a' .. 'z' | '0' .. '9' | '\\_' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:56:4: ( ' ' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:56:6: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "TAB"
    public final void mTAB() throws RecognitionException {
        try {
            int _type = TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:59:5: ( '\\t' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:59:7: '\\t'
            {
            match('\t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAB"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:62:9: ( '\\n' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:62:11: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:8: ( T__10 | T__11 | T__12 | T__13 | OPERATOR | INT | ID | WS | TAB | NEWLINE )
        int alt4=10;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:34: OPERATOR
                {
                mOPERATOR(); 

                }
                break;
            case 6 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:43: INT
                {
                mINT(); 

                }
                break;
            case 7 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:47: ID
                {
                mID(); 

                }
                break;
            case 8 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:50: WS
                {
                mWS(); 

                }
                break;
            case 9 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:53: TAB
                {
                mTAB(); 

                }
                break;
            case 10 :
                // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:1:57: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA1_eotS =
        "\51\uffff";
    static final String DFA1_eofS =
        "\51\uffff";
    static final String DFA1_minS =
        "\1\52\1\145\1\151\1\142\1\145\1\uffff\1\162\1\uffff\1\145\7\uffff"+
        "\1\146\1\147\7\uffff\1\170\1\164\1\150\1\164\1\141\1\164\1\143\2"+
        "\uffff\1\141\1\155\5\uffff";
    static final String DFA1_maxS =
        "\1\170\1\145\1\151\1\156\1\157\1\uffff\1\166\1\uffff\1\157\7\uffff"+
        "\1\146\1\147\7\uffff\1\170\1\164\1\150\3\164\1\163\2\uffff\1\164"+
        "\1\165\5\uffff";
    static final String DFA1_acceptS =
        "\5\uffff\1\5\1\uffff\1\7\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1"+
        "\27\2\uffff\1\3\1\17\1\4\1\13\1\6\1\20\1\12\7\uffff\1\1\1\10\2\uffff"+
        "\1\16\1\2\1\11\1\14\1\15";
    static final String DFA1_specialS =
        "\51\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\14\1\12\1\uffff\1\13\1\17\1\15\15\uffff\1\16\43\uffff\1\3"+
            "\1\4\1\5\10\uffff\1\1\2\uffff\1\6\2\uffff\1\2\1\7\1\10\3\uffff"+
            "\1\11",
            "\1\20",
            "\1\21",
            "\1\22\13\uffff\1\23",
            "\1\24\11\uffff\1\25",
            "",
            "\1\27\3\uffff\1\26",
            "",
            "\1\31\11\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\41\22\uffff\1\40",
            "\1\42",
            "\1\44\17\uffff\1\43",
            "",
            "",
            "\1\46\22\uffff\1\45",
            "\1\50\7\uffff\1\47",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "12:1: OPERATOR : ( 'leftto' | 'rightto' | 'above' | 'below' | 'contains' | 'over' | 'smaller' | 'leftaligned' | 'rightaligned' | 'topaligned' | 'bottomaligned' | 'textsubstring' | 'textsmaller' | 'textconcatenate' | 'and' | 'or' | 'xor' | '+' | '-' | '*' | '/' | '=' | '.' );";
        }
    }
    static final String DFA4_eotS =
        "\22\uffff\14\16\1\14\13\16\1\14\5\16\1\14\13\16\1\14\13\16\2\14"+
        "\12\16\1\14\11\16\1\14\5\16\1\14\12\16\1\14\10\16\1\u0083\11\16"+
        "\1\u008d\1\uffff\1\u008e\4\16\1\14\3\16\2\uffff\1\u0096\1\14\3\16"+
        "\1\14\1\16\1\uffff\1\14\3\16\2\14\2\16\1\14";
    static final String DFA4_eofS =
        "\u00a0\uffff";
    static final String DFA4_minS =
        "\1\11\13\60\6\uffff\1\145\1\141\1\162\1\157\1\156\1\146\1\147\1"+
        "\157\1\144\1\154\1\164\1\145\1\60\1\160\1\170\1\162\1\143\1\154"+
        "\1\151\1\160\1\163\1\164\1\150\1\166\1\60\1\157\1\164\1\162\1\141"+
        "\1\164\1\60\1\157\1\154\1\141\1\145\1\164\2\141\1\164\1\145\1\167"+
        "\1\157\1\60\1\154\1\143\1\142\1\145\1\142\2\162\1\151\1\157\1\154"+
        "\1\141\2\60\1\155\1\151\1\155\1\157\1\152\1\162\1\154\1\164\1\141"+
        "\1\156\1\60\1\151\1\157\1\154\1\141\1\147\1\142\1\141\1\156\1\145"+
        "\1\60\1\145\2\151\1\163\1\147\1\60\1\151\1\154\1\156\1\163\1\154"+
        "\2\143\1\163\1\145\1\156\1\60\1\156\1\147\1\151\1\145\1\164\1\154"+
        "\1\141\1\164\1\60\1\163\1\164\1\145\1\156\1\147\1\144\1\162\1\145"+
        "\1\164\1\60\1\uffff\1\60\1\163\1\144\1\145\1\156\1\60\1\151\1\162"+
        "\1\145\2\uffff\2\60\1\144\1\145\1\156\1\60\1\156\1\uffff\1\60\1"+
        "\144\1\147\1\141\2\60\1\164\1\145\1\60";
    static final String DFA4_maxS =
        "\14\172\6\uffff\1\145\1\141\1\162\1\157\1\156\1\146\1\147\1\157"+
        "\1\144\1\154\1\164\1\145\1\172\1\160\1\170\1\162\1\143\1\154\1\151"+
        "\1\160\2\164\1\150\1\166\1\172\1\157\1\164\1\162\1\141\1\164\1\172"+
        "\1\157\1\154\1\141\1\145\1\164\1\141\2\164\1\145\1\167\1\157\1\172"+
        "\1\154\1\163\1\142\1\145\1\142\2\162\1\151\1\157\1\154\1\164\2\172"+
        "\1\155\1\151\1\165\1\157\1\152\1\162\1\154\1\164\1\141\1\156\1\172"+
        "\1\151\1\157\1\154\1\141\1\147\1\142\1\141\1\156\1\145\1\172\1\145"+
        "\2\151\1\163\1\147\1\172\1\151\1\154\1\156\1\163\1\154\2\143\1\163"+
        "\1\145\1\156\1\172\1\156\1\147\1\151\1\145\1\164\1\154\1\141\1\164"+
        "\1\172\1\163\1\164\1\145\1\156\1\147\1\144\1\162\1\145\1\164\1\172"+
        "\1\uffff\1\172\1\163\1\144\1\145\1\156\1\172\1\151\1\162\1\145\2"+
        "\uffff\2\172\1\144\1\145\1\156\1\172\1\156\1\uffff\1\172\1\144\1"+
        "\147\1\141\2\172\1\164\1\145\1\172";
    static final String DFA4_acceptS =
        "\14\uffff\1\5\1\6\1\7\1\10\1\11\1\12\161\uffff\1\2\11\uffff\1\1"+
        "\1\3\7\uffff\1\4\11\uffff";
    static final String DFA4_specialS =
        "\u00a0\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\20\1\21\25\uffff\1\17\11\uffff\2\14\1\uffff\3\14\1\uffff"+
            "\11\15\3\uffff\1\14\41\uffff\1\16\1\uffff\1\7\1\10\1\4\10\16"+
            "\1\5\2\16\1\11\1\3\1\16\1\6\1\1\1\12\1\16\1\2\1\16\1\13\2\16",
            "\12\16\45\uffff\1\16\1\uffff\14\16\1\23\2\16\1\22\12\16",
            "\12\16\45\uffff\1\16\1\uffff\1\24\31\16",
            "\12\16\45\uffff\1\16\1\uffff\21\16\1\25\10\16",
            "\12\16\45\uffff\1\16\1\uffff\16\16\1\26\13\16",
            "\12\16\45\uffff\1\16\1\uffff\4\16\1\27\25\16",
            "\12\16\45\uffff\1\16\1\uffff\10\16\1\30\21\16",
            "\12\16\45\uffff\1\16\1\uffff\1\16\1\31\13\16\1\32\14\16",
            "\12\16\45\uffff\1\16\1\uffff\4\16\1\33\11\16\1\34\13\16",
            "\12\16\45\uffff\1\16\1\uffff\21\16\1\36\3\16\1\35\4\16",
            "\12\16\45\uffff\1\16\1\uffff\4\16\1\40\11\16\1\37\13\16",
            "\12\16\45\uffff\1\16\1\uffff\16\16\1\41\13\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106\22\uffff\1\105",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\113",
            "\1\115\17\uffff\1\114",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\127\22\uffff\1\126",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\130",
            "\1\131",
            "\1\133\7\uffff\1\132",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\u009a",
            "",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\12\16\45\uffff\1\16\1\uffff\32\16",
            "\1\u009e",
            "\1\u009f",
            "\12\16\45\uffff\1\16\1\uffff\32\16"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | OPERATOR | INT | ID | WS | TAB | NEWLINE );";
        }
    }
 

}