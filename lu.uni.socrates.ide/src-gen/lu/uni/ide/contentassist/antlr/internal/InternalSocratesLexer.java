package lu.uni.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSocratesLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=7;
    public static final int RULE_DESCRIPTION=6;
    public static final int RULE_DIGIT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalSocratesLexer() {;} 
    public InternalSocratesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSocratesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSocrates.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:11:7: ( ',' )
            // InternalSocrates.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:12:7: ( '<' )
            // InternalSocrates.g:12:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:13:7: ( '<=' )
            // InternalSocrates.g:13:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:14:7: ( '>' )
            // InternalSocrates.g:14:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:15:7: ( '>=' )
            // InternalSocrates.g:15:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:16:7: ( '=' )
            // InternalSocrates.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:17:7: ( '!=' )
            // InternalSocrates.g:17:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:18:7: ( '(' )
            // InternalSocrates.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:19:7: ( ')' )
            // InternalSocrates.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:20:7: ( '[' )
            // InternalSocrates.g:20:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:21:7: ( ']' )
            // InternalSocrates.g:21:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:22:7: ( 'not' )
            // InternalSocrates.g:22:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:23:7: ( 'forall' )
            // InternalSocrates.g:23:9: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:24:7: ( 'exists' )
            // InternalSocrates.g:24:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:25:7: ( 'and' )
            // InternalSocrates.g:25:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:26:7: ( 'or' )
            // InternalSocrates.g:26:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:27:7: ( 'implies' )
            // InternalSocrates.g:27:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:28:7: ( 'iff' )
            // InternalSocrates.g:28:9: 'iff'
            {
            match("iff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:29:7: ( 'inf' )
            // InternalSocrates.g:29:9: 'inf'
            {
            match("inf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:30:7: ( 'in' )
            // InternalSocrates.g:30:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:31:7: ( '+' )
            // InternalSocrates.g:31:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:32:7: ( '-' )
            // InternalSocrates.g:32:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:33:7: ( ':' )
            // InternalSocrates.g:33:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:34:7: ( '*' )
            // InternalSocrates.g:34:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:35:7: ( '/' )
            // InternalSocrates.g:35:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:36:7: ( '../' )
            // InternalSocrates.g:36:9: '../'
            {
            match("../"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:37:7: ( './' )
            // InternalSocrates.g:37:9: './'
            {
            match("./"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:38:7: ( 'Oracle' )
            // InternalSocrates.g:38:9: 'Oracle'
            {
            match("Oracle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:39:7: ( 'ModelName:' )
            // InternalSocrates.g:39:9: 'ModelName:'
            {
            match("ModelName:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:40:7: ( ';' )
            // InternalSocrates.g:40:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:41:7: ( 'ID:' )
            // InternalSocrates.g:41:9: 'ID:'
            {
            match("ID:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:42:7: ( 'Path:' )
            // InternalSocrates.g:42:9: 'Path:'
            {
            match("Path:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:43:7: ( 'Description:' )
            // InternalSocrates.g:43:9: 'Description:'
            {
            match("Description:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:44:7: ( 'Specification:' )
            // InternalSocrates.g:44:9: 'Specification:'
            {
            match("Specification:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:45:7: ( '_' )
            // InternalSocrates.g:45:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:46:7: ( 'Signals' )
            // InternalSocrates.g:46:9: 'Signals'
            {
            match("Signals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:47:7: ( 'Constants' )
            // InternalSocrates.g:47:9: 'Constants'
            {
            match("Constants"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:48:7: ( '{' )
            // InternalSocrates.g:48:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:49:7: ( '}' )
            // InternalSocrates.g:49:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:50:7: ( '|' )
            // InternalSocrates.g:50:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:51:7: ( '||' )
            // InternalSocrates.g:51:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:52:7: ( 'sin' )
            // InternalSocrates.g:52:9: 'sin'
            {
            match("sin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:53:7: ( 'cos' )
            // InternalSocrates.g:53:9: 'cos'
            {
            match("cos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:54:7: ( 'sqrt' )
            // InternalSocrates.g:54:9: 'sqrt'
            {
            match("sqrt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:55:7: ( '.' )
            // InternalSocrates.g:55:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "RULE_DESCRIPTION"
    public final void mRULE_DESCRIPTION() throws RecognitionException {
        try {
            int _type = RULE_DESCRIPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:7897:18: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalSocrates.g:7897:20: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalSocrates.g:7897:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSocrates.g:7897:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DESCRIPTION"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:7899:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // InternalSocrates.g:7899:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:7901:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSocrates.g:7901:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSocrates.g:7901:24: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSocrates.g:7901:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:7903:12: ( '0' .. '9' )
            // InternalSocrates.g:7903:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:7905:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSocrates.g:7905:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSocrates.g:7905:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSocrates.g:7905:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSocrates.g:7905:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSocrates.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:7907:10: ( ( '0' .. '9' )+ )
            // InternalSocrates.g:7907:12: ( '0' .. '9' )+
            {
            // InternalSocrates.g:7907:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSocrates.g:7907:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:7909:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSocrates.g:7909:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSocrates.g:7909:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSocrates.g:7909:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSocrates.g:7909:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSocrates.g:7909:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocrates.g:7909:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSocrates.g:7909:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSocrates.g:7909:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSocrates.g:7909:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSocrates.g:7909:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:7911:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSocrates.g:7911:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSocrates.g:7911:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSocrates.g:7911:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalSocrates.g:7911:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSocrates.g:7911:41: ( '\\r' )? '\\n'
                    {
                    // InternalSocrates.g:7911:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSocrates.g:7911:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSocrates.g:7913:16: ( . )
            // InternalSocrates.g:7913:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSocrates.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_DESCRIPTION | RULE_WS | RULE_ML_COMMENT | RULE_DIGIT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt12=54;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSocrates.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalSocrates.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalSocrates.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalSocrates.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalSocrates.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalSocrates.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalSocrates.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalSocrates.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalSocrates.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalSocrates.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalSocrates.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalSocrates.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalSocrates.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalSocrates.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalSocrates.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalSocrates.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalSocrates.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalSocrates.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalSocrates.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalSocrates.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalSocrates.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalSocrates.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalSocrates.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalSocrates.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalSocrates.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalSocrates.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalSocrates.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalSocrates.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalSocrates.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalSocrates.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalSocrates.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalSocrates.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalSocrates.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalSocrates.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalSocrates.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalSocrates.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalSocrates.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalSocrates.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalSocrates.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalSocrates.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalSocrates.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalSocrates.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalSocrates.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalSocrates.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalSocrates.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalSocrates.g:1:280: RULE_DESCRIPTION
                {
                mRULE_DESCRIPTION(); 

                }
                break;
            case 47 :
                // InternalSocrates.g:1:297: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // InternalSocrates.g:1:305: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 49 :
                // InternalSocrates.g:1:321: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 50 :
                // InternalSocrates.g:1:332: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalSocrates.g:1:340: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // InternalSocrates.g:1:349: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalSocrates.g:1:361: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalSocrates.g:1:377: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\55\1\57\1\uffff\1\52\4\uffff\6\67\4\uffff\1\105\1\110\2\67\1\uffff\4\67\1\121\1\67\2\uffff\1\126\2\67\1\52\1\uffff\1\136\1\52\1\uffff\1\52\14\uffff\1\67\1\uffff\3\67\1\145\2\67\1\151\12\uffff\2\67\1\uffff\5\67\1\uffff\1\67\4\uffff\3\67\7\uffff\1\170\2\67\1\173\1\uffff\1\67\1\175\1\176\1\uffff\2\67\1\uffff\5\67\1\u0086\1\67\1\u0088\1\uffff\1\165\2\uffff\2\67\1\uffff\1\67\2\uffff\7\67\1\uffff\1\u0093\1\uffff\5\67\1\uffff\4\67\1\uffff\1\u009d\1\u009e\1\67\1\u00a0\5\67\2\uffff\1\u00a6\1\uffff\3\67\1\u00aa\1\67\1\uffff\3\67\1\uffff\4\67\1\u00b3\1\uffff\2\67\1\uffff\2\67\1\uffff\2\67\1\uffff";
    static final String DFA12_eofS =
        "\u00ba\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\2\75\1\uffff\1\75\4\uffff\2\157\1\170\1\156\1\162\1\146\4\uffff\1\52\1\56\1\162\1\157\1\uffff\1\104\1\141\1\145\1\151\1\60\1\157\2\uffff\1\174\1\151\1\157\1\0\1\uffff\1\60\1\101\1\uffff\1\0\14\uffff\1\164\1\uffff\1\162\1\151\1\144\1\60\1\160\1\146\1\60\12\uffff\1\141\1\144\1\uffff\1\72\1\164\1\163\1\145\1\147\1\uffff\1\156\4\uffff\1\156\1\162\1\163\1\uffff\2\0\4\uffff\1\60\1\141\1\163\1\60\1\uffff\1\154\2\60\1\uffff\1\143\1\145\1\uffff\1\150\2\143\1\156\1\163\1\60\1\164\1\60\1\uffff\2\0\1\uffff\1\154\1\164\1\uffff\1\151\2\uffff\2\154\1\72\1\162\1\151\1\141\1\164\1\uffff\1\60\1\uffff\1\154\1\163\2\145\1\116\1\uffff\1\151\1\146\1\154\1\141\1\uffff\2\60\1\163\1\60\1\141\1\160\1\151\1\163\1\156\2\uffff\1\60\1\uffff\1\155\1\164\1\143\1\60\1\164\1\uffff\1\145\1\151\1\141\1\uffff\1\163\1\72\1\157\1\164\1\60\1\uffff\1\156\1\151\1\uffff\1\72\1\157\1\uffff\1\156\1\72\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\2\75\1\uffff\1\75\4\uffff\2\157\1\170\1\156\1\162\1\156\4\uffff\2\57\1\162\1\157\1\uffff\1\104\1\141\1\145\1\160\1\172\1\157\2\uffff\1\174\1\161\1\157\1\uffff\1\uffff\1\71\1\172\1\uffff\1\uffff\14\uffff\1\164\1\uffff\1\162\1\151\1\144\1\172\1\160\1\146\1\172\12\uffff\1\141\1\144\1\uffff\1\72\1\164\1\163\1\145\1\147\1\uffff\1\156\4\uffff\1\156\1\162\1\163\1\uffff\2\uffff\4\uffff\1\172\1\141\1\163\1\172\1\uffff\1\154\2\172\1\uffff\1\143\1\145\1\uffff\1\150\2\143\1\156\1\163\1\172\1\164\1\172\1\uffff\2\uffff\1\uffff\1\154\1\164\1\uffff\1\151\2\uffff\2\154\1\72\1\162\1\151\1\141\1\164\1\uffff\1\172\1\uffff\1\154\1\163\2\145\1\116\1\uffff\1\151\1\146\1\154\1\141\1\uffff\2\172\1\163\1\172\1\141\1\160\1\151\1\163\1\156\2\uffff\1\172\1\uffff\1\155\1\164\1\143\1\172\1\164\1\uffff\1\145\1\151\1\141\1\uffff\1\163\1\72\1\157\1\164\1\172\1\uffff\1\156\1\151\1\uffff\1\72\1\157\1\uffff\1\156\1\72\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\1\uffff\1\10\1\11\1\12\1\13\6\uffff\1\25\1\26\1\27\1\30\4\uffff\1\36\6\uffff\1\46\1\47\4\uffff\1\57\2\uffff\1\62\1\uffff\1\66\1\1\1\3\1\2\1\5\1\4\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff\1\62\7\uffff\1\25\1\26\1\27\1\30\1\60\1\65\1\31\1\32\1\33\1\55\2\uffff\1\36\5\uffff\1\43\1\uffff\1\46\1\47\1\51\1\50\3\uffff\1\56\2\uffff\1\57\1\61\1\63\1\64\4\uffff\1\20\3\uffff\1\24\2\uffff\1\37\10\uffff\1\56\2\uffff\1\14\2\uffff\1\17\1\uffff\1\22\1\23\7\uffff\1\52\1\uffff\1\53\5\uffff\1\40\4\uffff\1\54\11\uffff\1\15\1\16\1\uffff\1\34\5\uffff\1\21\3\uffff\1\44\5\uffff\1\35\2\uffff\1\45\2\uffff\1\41\2\uffff\1\42";
    static final String DFA12_specialS =
        "\1\5\43\uffff\1\4\4\uffff\1\0\61\uffff\1\6\1\3\31\uffff\1\1\1\2\102\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\52\2\45\2\52\1\45\22\52\1\45\1\5\1\44\4\52\1\51\1\6\1\7\1\23\1\20\1\1\1\21\1\25\1\24\12\46\1\22\1\30\1\2\1\4\1\3\2\52\2\50\1\36\1\33\4\50\1\31\3\50\1\27\1\50\1\26\1\32\2\50\1\34\7\50\1\10\1\52\1\11\1\47\1\35\1\52\1\15\1\50\1\43\1\50\1\14\1\13\2\50\1\17\4\50\1\12\1\16\3\50\1\42\7\50\1\37\1\41\1\40\uff82\52",
            "",
            "\1\54",
            "\1\56",
            "",
            "\1\61",
            "",
            "",
            "",
            "",
            "\1\66",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\75\6\uffff\1\74\1\76",
            "",
            "",
            "",
            "",
            "\1\103\4\uffff\1\104",
            "\1\106\1\107",
            "\1\111",
            "\1\112",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\120\6\uffff\1\117",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\122",
            "",
            "",
            "\1\125",
            "\1\127\7\uffff\1\130",
            "\1\131",
            "\42\134\1\132\71\134\1\133\uffa3\134",
            "",
            "\12\137",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\0\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\146",
            "\1\147",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\5\67\1\150\24\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\42\167\1\166\uffdd\167",
            "\42\134\1\132\71\134\1\133\uffa3\134",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\171",
            "\1\172",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\174",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0087",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\42\134\1\132\71\134\1\133\uffa3\134",
            "\42\134\1\132\71\134\1\133\uffa3\134",
            "",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u009f",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_DESCRIPTION | RULE_WS | RULE_ML_COMMENT | RULE_DIGIT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( ((LA12_41>='\u0000' && LA12_41<='\uFFFF')) ) {s = 96;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_118 = input.LA(1);

                        s = -1;
                        if ( (LA12_118=='\"') ) {s = 90;}

                        else if ( (LA12_118=='\\') ) {s = 91;}

                        else if ( ((LA12_118>='\u0000' && LA12_118<='!')||(LA12_118>='#' && LA12_118<='[')||(LA12_118>=']' && LA12_118<='\uFFFF')) ) {s = 92;}

                        else s = 117;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='\"') ) {s = 90;}

                        else if ( (LA12_119=='\\') ) {s = 91;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='!')||(LA12_119>='#' && LA12_119<='[')||(LA12_119>=']' && LA12_119<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_92 = input.LA(1);

                        s = -1;
                        if ( (LA12_92=='\"') ) {s = 90;}

                        else if ( (LA12_92=='\\') ) {s = 91;}

                        else if ( ((LA12_92>='\u0000' && LA12_92<='!')||(LA12_92>='#' && LA12_92<='[')||(LA12_92>=']' && LA12_92<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( (LA12_36=='\"') ) {s = 90;}

                        else if ( (LA12_36=='\\') ) {s = 91;}

                        else if ( ((LA12_36>='\u0000' && LA12_36<='!')||(LA12_36>='#' && LA12_36<='[')||(LA12_36>=']' && LA12_36<='\uFFFF')) ) {s = 92;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0==',') ) {s = 1;}

                        else if ( (LA12_0=='<') ) {s = 2;}

                        else if ( (LA12_0=='>') ) {s = 3;}

                        else if ( (LA12_0=='=') ) {s = 4;}

                        else if ( (LA12_0=='!') ) {s = 5;}

                        else if ( (LA12_0=='(') ) {s = 6;}

                        else if ( (LA12_0==')') ) {s = 7;}

                        else if ( (LA12_0=='[') ) {s = 8;}

                        else if ( (LA12_0==']') ) {s = 9;}

                        else if ( (LA12_0=='n') ) {s = 10;}

                        else if ( (LA12_0=='f') ) {s = 11;}

                        else if ( (LA12_0=='e') ) {s = 12;}

                        else if ( (LA12_0=='a') ) {s = 13;}

                        else if ( (LA12_0=='o') ) {s = 14;}

                        else if ( (LA12_0=='i') ) {s = 15;}

                        else if ( (LA12_0=='+') ) {s = 16;}

                        else if ( (LA12_0=='-') ) {s = 17;}

                        else if ( (LA12_0==':') ) {s = 18;}

                        else if ( (LA12_0=='*') ) {s = 19;}

                        else if ( (LA12_0=='/') ) {s = 20;}

                        else if ( (LA12_0=='.') ) {s = 21;}

                        else if ( (LA12_0=='O') ) {s = 22;}

                        else if ( (LA12_0=='M') ) {s = 23;}

                        else if ( (LA12_0==';') ) {s = 24;}

                        else if ( (LA12_0=='I') ) {s = 25;}

                        else if ( (LA12_0=='P') ) {s = 26;}

                        else if ( (LA12_0=='D') ) {s = 27;}

                        else if ( (LA12_0=='S') ) {s = 28;}

                        else if ( (LA12_0=='_') ) {s = 29;}

                        else if ( (LA12_0=='C') ) {s = 30;}

                        else if ( (LA12_0=='{') ) {s = 31;}

                        else if ( (LA12_0=='}') ) {s = 32;}

                        else if ( (LA12_0=='|') ) {s = 33;}

                        else if ( (LA12_0=='s') ) {s = 34;}

                        else if ( (LA12_0=='c') ) {s = 35;}

                        else if ( (LA12_0=='\"') ) {s = 36;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 37;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 38;}

                        else if ( (LA12_0=='^') ) {s = 39;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='E' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='L')||LA12_0=='N'||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='b'||LA12_0=='d'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='p' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {s = 40;}

                        else if ( (LA12_0=='\'') ) {s = 41;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_91 = input.LA(1);

                        s = -1;
                        if ( (LA12_91=='\"') ) {s = 118;}

                        else if ( ((LA12_91>='\u0000' && LA12_91<='!')||(LA12_91>='#' && LA12_91<='\uFFFF')) ) {s = 119;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}