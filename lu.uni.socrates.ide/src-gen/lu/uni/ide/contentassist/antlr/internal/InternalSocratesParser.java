package lu.uni.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import lu.uni.services.SocratesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSocratesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DIGIT", "RULE_DESCRIPTION", "RULE_ID", "RULE_WS", "RULE_ML_COMMENT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "','", "'<'", "'<='", "'>'", "'>='", "'='", "'!='", "'('", "')'", "'['", "']'", "'not'", "'forall'", "'exists'", "'and'", "'or'", "'implies'", "'iff'", "'inf'", "'in'", "'+'", "'-'", "':'", "'*'", "'/'", "'../'", "'./'", "'Oracle'", "'ModelName:'", "';'", "'ID:'", "'Path:'", "'Description:'", "'Specification:'", "'_'", "'Signals'", "'Constants'", "'{'", "'}'", "'|'", "'||'", "'sin'", "'cos'", "'sqrt'", "'.'"
    };
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


        public InternalSocratesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSocratesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSocratesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSocrates.g"; }


    	private SocratesGrammarAccess grammarAccess;

    	public void setGrammarAccess(SocratesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSocrates"
    // InternalSocrates.g:54:1: entryRuleSocrates : ruleSocrates EOF ;
    public final void entryRuleSocrates() throws RecognitionException {
        try {
            // InternalSocrates.g:55:1: ( ruleSocrates EOF )
            // InternalSocrates.g:56:1: ruleSocrates EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSocratesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSocrates();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSocratesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSocrates"


    // $ANTLR start "ruleSocrates"
    // InternalSocrates.g:63:1: ruleSocrates : ( ( rule__Socrates__OraclesAssignment )* ) ;
    public final void ruleSocrates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:67:2: ( ( ( rule__Socrates__OraclesAssignment )* ) )
            // InternalSocrates.g:68:2: ( ( rule__Socrates__OraclesAssignment )* )
            {
            // InternalSocrates.g:68:2: ( ( rule__Socrates__OraclesAssignment )* )
            // InternalSocrates.g:69:3: ( rule__Socrates__OraclesAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSocratesAccess().getOraclesAssignment()); 
            }
            // InternalSocrates.g:70:3: ( rule__Socrates__OraclesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSocrates.g:70:4: rule__Socrates__OraclesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Socrates__OraclesAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSocratesAccess().getOraclesAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSocrates"


    // $ANTLR start "entryRuleOracle"
    // InternalSocrates.g:79:1: entryRuleOracle : ruleOracle EOF ;
    public final void entryRuleOracle() throws RecognitionException {
        try {
            // InternalSocrates.g:80:1: ( ruleOracle EOF )
            // InternalSocrates.g:81:1: ruleOracle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOracle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOracle"


    // $ANTLR start "ruleOracle"
    // InternalSocrates.g:88:1: ruleOracle : ( ( rule__Oracle__Group__0 ) ) ;
    public final void ruleOracle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:92:2: ( ( ( rule__Oracle__Group__0 ) ) )
            // InternalSocrates.g:93:2: ( ( rule__Oracle__Group__0 ) )
            {
            // InternalSocrates.g:93:2: ( ( rule__Oracle__Group__0 ) )
            // InternalSocrates.g:94:3: ( rule__Oracle__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getGroup()); 
            }
            // InternalSocrates.g:95:3: ( rule__Oracle__Group__0 )
            // InternalSocrates.g:95:4: rule__Oracle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOracle"


    // $ANTLR start "entryRuleRequirement"
    // InternalSocrates.g:104:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // InternalSocrates.g:105:1: ( ruleRequirement EOF )
            // InternalSocrates.g:106:1: ruleRequirement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRequirement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalSocrates.g:113:1: ruleRequirement : ( ( rule__Requirement__Group__0 ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:117:2: ( ( ( rule__Requirement__Group__0 ) ) )
            // InternalSocrates.g:118:2: ( ( rule__Requirement__Group__0 ) )
            {
            // InternalSocrates.g:118:2: ( ( rule__Requirement__Group__0 ) )
            // InternalSocrates.g:119:3: ( rule__Requirement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getGroup()); 
            }
            // InternalSocrates.g:120:3: ( rule__Requirement__Group__0 )
            // InternalSocrates.g:120:4: rule__Requirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleReqId"
    // InternalSocrates.g:129:1: entryRuleReqId : ruleReqId EOF ;
    public final void entryRuleReqId() throws RecognitionException {
        try {
            // InternalSocrates.g:130:1: ( ruleReqId EOF )
            // InternalSocrates.g:131:1: ruleReqId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReqIdRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReqId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReqIdRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReqId"


    // $ANTLR start "ruleReqId"
    // InternalSocrates.g:138:1: ruleReqId : ( ( rule__ReqId__Group__0 ) ) ;
    public final void ruleReqId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:142:2: ( ( ( rule__ReqId__Group__0 ) ) )
            // InternalSocrates.g:143:2: ( ( rule__ReqId__Group__0 ) )
            {
            // InternalSocrates.g:143:2: ( ( rule__ReqId__Group__0 ) )
            // InternalSocrates.g:144:3: ( rule__ReqId__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReqIdAccess().getGroup()); 
            }
            // InternalSocrates.g:145:3: ( rule__ReqId__Group__0 )
            // InternalSocrates.g:145:4: rule__ReqId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReqId__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReqIdAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReqId"


    // $ANTLR start "entryRuleSignalsdefinition"
    // InternalSocrates.g:154:1: entryRuleSignalsdefinition : ruleSignalsdefinition EOF ;
    public final void entryRuleSignalsdefinition() throws RecognitionException {
        try {
            // InternalSocrates.g:155:1: ( ruleSignalsdefinition EOF )
            // InternalSocrates.g:156:1: ruleSignalsdefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSignalsdefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignalsdefinition"


    // $ANTLR start "ruleSignalsdefinition"
    // InternalSocrates.g:163:1: ruleSignalsdefinition : ( ( rule__Signalsdefinition__Group__0 ) ) ;
    public final void ruleSignalsdefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:167:2: ( ( ( rule__Signalsdefinition__Group__0 ) ) )
            // InternalSocrates.g:168:2: ( ( rule__Signalsdefinition__Group__0 ) )
            {
            // InternalSocrates.g:168:2: ( ( rule__Signalsdefinition__Group__0 ) )
            // InternalSocrates.g:169:3: ( rule__Signalsdefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionAccess().getGroup()); 
            }
            // InternalSocrates.g:170:3: ( rule__Signalsdefinition__Group__0 )
            // InternalSocrates.g:170:4: rule__Signalsdefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signalsdefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignalsdefinition"


    // $ANTLR start "entryRuleConstantsDefinition"
    // InternalSocrates.g:179:1: entryRuleConstantsDefinition : ruleConstantsDefinition EOF ;
    public final void entryRuleConstantsDefinition() throws RecognitionException {
        try {
            // InternalSocrates.g:180:1: ( ruleConstantsDefinition EOF )
            // InternalSocrates.g:181:1: ruleConstantsDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstantsDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantsDefinition"


    // $ANTLR start "ruleConstantsDefinition"
    // InternalSocrates.g:188:1: ruleConstantsDefinition : ( ( rule__ConstantsDefinition__Group__0 ) ) ;
    public final void ruleConstantsDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:192:2: ( ( ( rule__ConstantsDefinition__Group__0 ) ) )
            // InternalSocrates.g:193:2: ( ( rule__ConstantsDefinition__Group__0 ) )
            {
            // InternalSocrates.g:193:2: ( ( rule__ConstantsDefinition__Group__0 ) )
            // InternalSocrates.g:194:3: ( rule__ConstantsDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionAccess().getGroup()); 
            }
            // InternalSocrates.g:195:3: ( rule__ConstantsDefinition__Group__0 )
            // InternalSocrates.g:195:4: rule__ConstantsDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantsDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantsDefinition"


    // $ANTLR start "entryRuleConstantDefinition"
    // InternalSocrates.g:204:1: entryRuleConstantDefinition : ruleConstantDefinition EOF ;
    public final void entryRuleConstantDefinition() throws RecognitionException {
        try {
            // InternalSocrates.g:205:1: ( ruleConstantDefinition EOF )
            // InternalSocrates.g:206:1: ruleConstantDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantDefinition"


    // $ANTLR start "ruleConstantDefinition"
    // InternalSocrates.g:213:1: ruleConstantDefinition : ( ( rule__ConstantDefinition__Group__0 ) ) ;
    public final void ruleConstantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:217:2: ( ( ( rule__ConstantDefinition__Group__0 ) ) )
            // InternalSocrates.g:218:2: ( ( rule__ConstantDefinition__Group__0 ) )
            {
            // InternalSocrates.g:218:2: ( ( rule__ConstantDefinition__Group__0 ) )
            // InternalSocrates.g:219:3: ( rule__ConstantDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getGroup()); 
            }
            // InternalSocrates.g:220:3: ( rule__ConstantDefinition__Group__0 )
            // InternalSocrates.g:220:4: rule__ConstantDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantDefinition"


    // $ANTLR start "entryRuleSignalID"
    // InternalSocrates.g:229:1: entryRuleSignalID : ruleSignalID EOF ;
    public final void entryRuleSignalID() throws RecognitionException {
        try {
            // InternalSocrates.g:230:1: ( ruleSignalID EOF )
            // InternalSocrates.g:231:1: ruleSignalID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSignalID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignalID"


    // $ANTLR start "ruleSignalID"
    // InternalSocrates.g:238:1: ruleSignalID : ( ( rule__SignalID__NameAssignment ) ) ;
    public final void ruleSignalID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:242:2: ( ( ( rule__SignalID__NameAssignment ) ) )
            // InternalSocrates.g:243:2: ( ( rule__SignalID__NameAssignment ) )
            {
            // InternalSocrates.g:243:2: ( ( rule__SignalID__NameAssignment ) )
            // InternalSocrates.g:244:3: ( rule__SignalID__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalIDAccess().getNameAssignment()); 
            }
            // InternalSocrates.g:245:3: ( rule__SignalID__NameAssignment )
            // InternalSocrates.g:245:4: rule__SignalID__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SignalID__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalIDAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignalID"


    // $ANTLR start "entryRuleConstantId"
    // InternalSocrates.g:254:1: entryRuleConstantId : ruleConstantId EOF ;
    public final void entryRuleConstantId() throws RecognitionException {
        try {
            // InternalSocrates.g:255:1: ( ruleConstantId EOF )
            // InternalSocrates.g:256:1: ruleConstantId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantIdRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstantId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantIdRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantId"


    // $ANTLR start "ruleConstantId"
    // InternalSocrates.g:263:1: ruleConstantId : ( ( rule__ConstantId__NameAssignment ) ) ;
    public final void ruleConstantId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:267:2: ( ( ( rule__ConstantId__NameAssignment ) ) )
            // InternalSocrates.g:268:2: ( ( rule__ConstantId__NameAssignment ) )
            {
            // InternalSocrates.g:268:2: ( ( rule__ConstantId__NameAssignment ) )
            // InternalSocrates.g:269:3: ( rule__ConstantId__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantIdAccess().getNameAssignment()); 
            }
            // InternalSocrates.g:270:3: ( rule__ConstantId__NameAssignment )
            // InternalSocrates.g:270:4: rule__ConstantId__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConstantId__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantIdAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantId"


    // $ANTLR start "entryRuleForAllformula"
    // InternalSocrates.g:279:1: entryRuleForAllformula : ruleForAllformula EOF ;
    public final void entryRuleForAllformula() throws RecognitionException {
        try {
            // InternalSocrates.g:280:1: ( ruleForAllformula EOF )
            // InternalSocrates.g:281:1: ruleForAllformula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForAllformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForAllformula"


    // $ANTLR start "ruleForAllformula"
    // InternalSocrates.g:288:1: ruleForAllformula : ( ( rule__ForAllformula__Group__0 ) ) ;
    public final void ruleForAllformula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:292:2: ( ( ( rule__ForAllformula__Group__0 ) ) )
            // InternalSocrates.g:293:2: ( ( rule__ForAllformula__Group__0 ) )
            {
            // InternalSocrates.g:293:2: ( ( rule__ForAllformula__Group__0 ) )
            // InternalSocrates.g:294:3: ( rule__ForAllformula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaAccess().getGroup()); 
            }
            // InternalSocrates.g:295:3: ( rule__ForAllformula__Group__0 )
            // InternalSocrates.g:295:4: rule__ForAllformula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForAllformula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForAllformula"


    // $ANTLR start "entryRuleExistsformula"
    // InternalSocrates.g:304:1: entryRuleExistsformula : ruleExistsformula EOF ;
    public final void entryRuleExistsformula() throws RecognitionException {
        try {
            // InternalSocrates.g:305:1: ( ruleExistsformula EOF )
            // InternalSocrates.g:306:1: ruleExistsformula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExistsformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistsformula"


    // $ANTLR start "ruleExistsformula"
    // InternalSocrates.g:313:1: ruleExistsformula : ( ( rule__Existsformula__Group__0 ) ) ;
    public final void ruleExistsformula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:317:2: ( ( ( rule__Existsformula__Group__0 ) ) )
            // InternalSocrates.g:318:2: ( ( rule__Existsformula__Group__0 ) )
            {
            // InternalSocrates.g:318:2: ( ( rule__Existsformula__Group__0 ) )
            // InternalSocrates.g:319:3: ( rule__Existsformula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaAccess().getGroup()); 
            }
            // InternalSocrates.g:320:3: ( rule__Existsformula__Group__0 )
            // InternalSocrates.g:320:4: rule__Existsformula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Existsformula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistsformula"


    // $ANTLR start "entryRuleTvariable"
    // InternalSocrates.g:329:1: entryRuleTvariable : ruleTvariable EOF ;
    public final void entryRuleTvariable() throws RecognitionException {
        try {
            // InternalSocrates.g:330:1: ( ruleTvariable EOF )
            // InternalSocrates.g:331:1: ruleTvariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTvariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTvariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTvariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTvariable"


    // $ANTLR start "ruleTvariable"
    // InternalSocrates.g:338:1: ruleTvariable : ( ( rule__Tvariable__NameAssignment ) ) ;
    public final void ruleTvariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:342:2: ( ( ( rule__Tvariable__NameAssignment ) ) )
            // InternalSocrates.g:343:2: ( ( rule__Tvariable__NameAssignment ) )
            {
            // InternalSocrates.g:343:2: ( ( rule__Tvariable__NameAssignment ) )
            // InternalSocrates.g:344:3: ( rule__Tvariable__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTvariableAccess().getNameAssignment()); 
            }
            // InternalSocrates.g:345:3: ( rule__Tvariable__NameAssignment )
            // InternalSocrates.g:345:4: rule__Tvariable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Tvariable__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTvariableAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTvariable"


    // $ANTLR start "entryRulenegationformula"
    // InternalSocrates.g:354:1: entryRulenegationformula : rulenegationformula EOF ;
    public final void entryRulenegationformula() throws RecognitionException {
        try {
            // InternalSocrates.g:355:1: ( rulenegationformula EOF )
            // InternalSocrates.g:356:1: rulenegationformula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationformulaRule()); 
            }
            pushFollow(FOLLOW_1);
            rulenegationformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationformulaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenegationformula"


    // $ANTLR start "rulenegationformula"
    // InternalSocrates.g:363:1: rulenegationformula : ( ( rule__Negationformula__Group__0 ) ) ;
    public final void rulenegationformula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:367:2: ( ( ( rule__Negationformula__Group__0 ) ) )
            // InternalSocrates.g:368:2: ( ( rule__Negationformula__Group__0 ) )
            {
            // InternalSocrates.g:368:2: ( ( rule__Negationformula__Group__0 ) )
            // InternalSocrates.g:369:3: ( rule__Negationformula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationformulaAccess().getGroup()); 
            }
            // InternalSocrates.g:370:3: ( rule__Negationformula__Group__0 )
            // InternalSocrates.g:370:4: rule__Negationformula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Negationformula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationformulaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenegationformula"


    // $ANTLR start "entryRuleformula"
    // InternalSocrates.g:379:1: entryRuleformula : ruleformula EOF ;
    public final void entryRuleformula() throws RecognitionException {
        try {
            // InternalSocrates.g:380:1: ( ruleformula EOF )
            // InternalSocrates.g:381:1: ruleformula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleformula"


    // $ANTLR start "ruleformula"
    // InternalSocrates.g:388:1: ruleformula : ( ( rule__Formula__Alternatives ) ) ;
    public final void ruleformula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:392:2: ( ( ( rule__Formula__Alternatives ) ) )
            // InternalSocrates.g:393:2: ( ( rule__Formula__Alternatives ) )
            {
            // InternalSocrates.g:393:2: ( ( rule__Formula__Alternatives ) )
            // InternalSocrates.g:394:3: ( rule__Formula__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getAlternatives()); 
            }
            // InternalSocrates.g:395:3: ( rule__Formula__Alternatives )
            // InternalSocrates.g:395:4: rule__Formula__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleformula"


    // $ANTLR start "entryRuleformulab"
    // InternalSocrates.g:404:1: entryRuleformulab : ruleformulab EOF ;
    public final void entryRuleformulab() throws RecognitionException {
        try {
            // InternalSocrates.g:405:1: ( ruleformulab EOF )
            // InternalSocrates.g:406:1: ruleformulab EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleformulab();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleformulab"


    // $ANTLR start "ruleformulab"
    // InternalSocrates.g:413:1: ruleformulab : ( ( rule__Formulab__Group__0 ) ) ;
    public final void ruleformulab() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:417:2: ( ( ( rule__Formulab__Group__0 ) ) )
            // InternalSocrates.g:418:2: ( ( rule__Formulab__Group__0 ) )
            {
            // InternalSocrates.g:418:2: ( ( rule__Formulab__Group__0 ) )
            // InternalSocrates.g:419:3: ( rule__Formulab__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabAccess().getGroup()); 
            }
            // InternalSocrates.g:420:3: ( rule__Formulab__Group__0 )
            // InternalSocrates.g:420:4: rule__Formulab__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formulab__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleformulab"


    // $ANTLR start "entryRuleformulabprime"
    // InternalSocrates.g:429:1: entryRuleformulabprime : ruleformulabprime EOF ;
    public final void entryRuleformulabprime() throws RecognitionException {
        try {
            // InternalSocrates.g:430:1: ( ruleformulabprime EOF )
            // InternalSocrates.g:431:1: ruleformulabprime EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabprimeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleformulabprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabprimeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleformulabprime"


    // $ANTLR start "ruleformulabprime"
    // InternalSocrates.g:438:1: ruleformulabprime : ( ( rule__Formulabprime__Group__0 )? ) ;
    public final void ruleformulabprime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:442:2: ( ( ( rule__Formulabprime__Group__0 )? ) )
            // InternalSocrates.g:443:2: ( ( rule__Formulabprime__Group__0 )? )
            {
            // InternalSocrates.g:443:2: ( ( rule__Formulabprime__Group__0 )? )
            // InternalSocrates.g:444:3: ( rule__Formulabprime__Group__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabprimeAccess().getGroup()); 
            }
            // InternalSocrates.g:445:3: ( rule__Formulabprime__Group__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=28 && LA2_0<=30)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSocrates.g:445:4: rule__Formulabprime__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formulabprime__Group__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabprimeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleformulabprime"


    // $ANTLR start "entryRuleterm"
    // InternalSocrates.g:454:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalSocrates.g:455:1: ( ruleterm EOF )
            // InternalSocrates.g:456:1: ruleterm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalSocrates.g:463:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:467:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalSocrates.g:468:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalSocrates.g:468:2: ( ( rule__Term__Group__0 ) )
            // InternalSocrates.g:469:3: ( rule__Term__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup()); 
            }
            // InternalSocrates.g:470:3: ( rule__Term__Group__0 )
            // InternalSocrates.g:470:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRuletermprime"
    // InternalSocrates.g:479:1: entryRuletermprime : ruletermprime EOF ;
    public final void entryRuletermprime() throws RecognitionException {
        try {
            // InternalSocrates.g:480:1: ( ruletermprime EOF )
            // InternalSocrates.g:481:1: ruletermprime EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermprimeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruletermprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermprimeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletermprime"


    // $ANTLR start "ruletermprime"
    // InternalSocrates.g:488:1: ruletermprime : ( ( rule__Termprime__Group__0 )? ) ;
    public final void ruletermprime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:492:2: ( ( ( rule__Termprime__Group__0 )? ) )
            // InternalSocrates.g:493:2: ( ( rule__Termprime__Group__0 )? )
            {
            // InternalSocrates.g:493:2: ( ( rule__Termprime__Group__0 )? )
            // InternalSocrates.g:494:3: ( rule__Termprime__Group__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermprimeAccess().getGroup()); 
            }
            // InternalSocrates.g:495:3: ( rule__Termprime__Group__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                int LA3_1 = input.LA(2);

                if ( (synpred3_InternalSocrates()) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalSocrates.g:495:4: rule__Termprime__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Termprime__Group__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermprimeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletermprime"


    // $ANTLR start "entryRuleexpression"
    // InternalSocrates.g:504:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalSocrates.g:505:1: ( ruleexpression EOF )
            // InternalSocrates.g:506:1: ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalSocrates.g:513:1: ruleexpression : ( ( rule__Expression__ExpbAssignment ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:517:2: ( ( ( rule__Expression__ExpbAssignment ) ) )
            // InternalSocrates.g:518:2: ( ( rule__Expression__ExpbAssignment ) )
            {
            // InternalSocrates.g:518:2: ( ( rule__Expression__ExpbAssignment ) )
            // InternalSocrates.g:519:3: ( rule__Expression__ExpbAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpbAssignment()); 
            }
            // InternalSocrates.g:520:3: ( rule__Expression__ExpbAssignment )
            // InternalSocrates.g:520:4: rule__Expression__ExpbAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpbAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpbAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleexpressionb"
    // InternalSocrates.g:529:1: entryRuleexpressionb : ruleexpressionb EOF ;
    public final void entryRuleexpressionb() throws RecognitionException {
        try {
            // InternalSocrates.g:530:1: ( ruleexpressionb EOF )
            // InternalSocrates.g:531:1: ruleexpressionb EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpressionb();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpressionb"


    // $ANTLR start "ruleexpressionb"
    // InternalSocrates.g:538:1: ruleexpressionb : ( ( rule__Expressionb__Alternatives ) ) ;
    public final void ruleexpressionb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:542:2: ( ( ( rule__Expressionb__Alternatives ) ) )
            // InternalSocrates.g:543:2: ( ( rule__Expressionb__Alternatives ) )
            {
            // InternalSocrates.g:543:2: ( ( rule__Expressionb__Alternatives ) )
            // InternalSocrates.g:544:3: ( rule__Expressionb__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getAlternatives()); 
            }
            // InternalSocrates.g:545:3: ( rule__Expressionb__Alternatives )
            // InternalSocrates.g:545:4: rule__Expressionb__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expressionb__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpressionb"


    // $ANTLR start "entryRuleexpressionprime"
    // InternalSocrates.g:554:1: entryRuleexpressionprime : ruleexpressionprime EOF ;
    public final void entryRuleexpressionprime() throws RecognitionException {
        try {
            // InternalSocrates.g:555:1: ( ruleexpressionprime EOF )
            // InternalSocrates.g:556:1: ruleexpressionprime EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionprimeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpressionprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionprimeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpressionprime"


    // $ANTLR start "ruleexpressionprime"
    // InternalSocrates.g:563:1: ruleexpressionprime : ( ( rule__Expressionprime__Group__0 )? ) ;
    public final void ruleexpressionprime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:567:2: ( ( ( rule__Expressionprime__Group__0 )? ) )
            // InternalSocrates.g:568:2: ( ( rule__Expressionprime__Group__0 )? )
            {
            // InternalSocrates.g:568:2: ( ( rule__Expressionprime__Group__0 )? )
            // InternalSocrates.g:569:3: ( rule__Expressionprime__Group__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionprimeAccess().getGroup()); 
            }
            // InternalSocrates.g:570:3: ( rule__Expressionprime__Group__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred4_InternalSocrates()) ) {
                    alt4=1;
                }
            }
            else if ( (LA4_0==34) ) {
                int LA4_2 = input.LA(2);

                if ( (synpred4_InternalSocrates()) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalSocrates.g:570:4: rule__Expressionprime__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressionprime__Group__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionprimeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpressionprime"


    // $ANTLR start "entryRuleexpressionterm"
    // InternalSocrates.g:579:1: entryRuleexpressionterm : ruleexpressionterm EOF ;
    public final void entryRuleexpressionterm() throws RecognitionException {
        try {
            // InternalSocrates.g:580:1: ( ruleexpressionterm EOF )
            // InternalSocrates.g:581:1: ruleexpressionterm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpressionterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpressionterm"


    // $ANTLR start "ruleexpressionterm"
    // InternalSocrates.g:588:1: ruleexpressionterm : ( ( rule__Expressionterm__Group__0 ) ) ;
    public final void ruleexpressionterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:592:2: ( ( ( rule__Expressionterm__Group__0 ) ) )
            // InternalSocrates.g:593:2: ( ( rule__Expressionterm__Group__0 ) )
            {
            // InternalSocrates.g:593:2: ( ( rule__Expressionterm__Group__0 ) )
            // InternalSocrates.g:594:3: ( rule__Expressionterm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermAccess().getGroup()); 
            }
            // InternalSocrates.g:595:3: ( rule__Expressionterm__Group__0 )
            // InternalSocrates.g:595:4: rule__Expressionterm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expressionterm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpressionterm"


    // $ANTLR start "entryRuleexpressiontermprime"
    // InternalSocrates.g:604:1: entryRuleexpressiontermprime : ruleexpressiontermprime EOF ;
    public final void entryRuleexpressiontermprime() throws RecognitionException {
        try {
            // InternalSocrates.g:605:1: ( ruleexpressiontermprime EOF )
            // InternalSocrates.g:606:1: ruleexpressiontermprime EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermprimeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpressiontermprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermprimeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpressiontermprime"


    // $ANTLR start "ruleexpressiontermprime"
    // InternalSocrates.g:613:1: ruleexpressiontermprime : ( ( rule__Expressiontermprime__Group__0 )? ) ;
    public final void ruleexpressiontermprime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:617:2: ( ( ( rule__Expressiontermprime__Group__0 )? ) )
            // InternalSocrates.g:618:2: ( ( rule__Expressiontermprime__Group__0 )? )
            {
            // InternalSocrates.g:618:2: ( ( rule__Expressiontermprime__Group__0 )? )
            // InternalSocrates.g:619:3: ( rule__Expressiontermprime__Group__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermprimeAccess().getGroup()); 
            }
            // InternalSocrates.g:620:3: ( rule__Expressiontermprime__Group__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred5_InternalSocrates()) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==37) ) {
                int LA5_2 = input.LA(2);

                if ( (synpred5_InternalSocrates()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalSocrates.g:620:4: rule__Expressiontermprime__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressiontermprime__Group__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermprimeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpressiontermprime"


    // $ANTLR start "entryRuleExpressionAtom"
    // InternalSocrates.g:629:1: entryRuleExpressionAtom : ruleExpressionAtom EOF ;
    public final void entryRuleExpressionAtom() throws RecognitionException {
        try {
            // InternalSocrates.g:630:1: ( ruleExpressionAtom EOF )
            // InternalSocrates.g:631:1: ruleExpressionAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionAtom"


    // $ANTLR start "ruleExpressionAtom"
    // InternalSocrates.g:638:1: ruleExpressionAtom : ( ( rule__ExpressionAtom__Alternatives ) ) ;
    public final void ruleExpressionAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:642:2: ( ( ( rule__ExpressionAtom__Alternatives ) ) )
            // InternalSocrates.g:643:2: ( ( rule__ExpressionAtom__Alternatives ) )
            {
            // InternalSocrates.g:643:2: ( ( rule__ExpressionAtom__Alternatives ) )
            // InternalSocrates.g:644:3: ( rule__ExpressionAtom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getAlternatives()); 
            }
            // InternalSocrates.g:645:3: ( rule__ExpressionAtom__Alternatives )
            // InternalSocrates.g:645:4: rule__ExpressionAtom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionAtom__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionAtom"


    // $ANTLR start "entryRuleBasicexpression"
    // InternalSocrates.g:654:1: entryRuleBasicexpression : ruleBasicexpression EOF ;
    public final void entryRuleBasicexpression() throws RecognitionException {
        try {
            // InternalSocrates.g:655:1: ( ruleBasicexpression EOF )
            // InternalSocrates.g:656:1: ruleBasicexpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicexpression"


    // $ANTLR start "ruleBasicexpression"
    // InternalSocrates.g:663:1: ruleBasicexpression : ( ( rule__Basicexpression__Alternatives ) ) ;
    public final void ruleBasicexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:667:2: ( ( ( rule__Basicexpression__Alternatives ) ) )
            // InternalSocrates.g:668:2: ( ( rule__Basicexpression__Alternatives ) )
            {
            // InternalSocrates.g:668:2: ( ( rule__Basicexpression__Alternatives ) )
            // InternalSocrates.g:669:3: ( rule__Basicexpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getAlternatives()); 
            }
            // InternalSocrates.g:670:3: ( rule__Basicexpression__Alternatives )
            // InternalSocrates.g:670:4: rule__Basicexpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Basicexpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicexpression"


    // $ANTLR start "entryRulebasicformulae"
    // InternalSocrates.g:679:1: entryRulebasicformulae : rulebasicformulae EOF ;
    public final void entryRulebasicformulae() throws RecognitionException {
        try {
            // InternalSocrates.g:680:1: ( rulebasicformulae EOF )
            // InternalSocrates.g:681:1: rulebasicformulae EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicformulaeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulebasicformulae();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicformulaeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebasicformulae"


    // $ANTLR start "rulebasicformulae"
    // InternalSocrates.g:688:1: rulebasicformulae : ( ( rule__Basicformulae__Alternatives ) ) ;
    public final void rulebasicformulae() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:692:2: ( ( ( rule__Basicformulae__Alternatives ) ) )
            // InternalSocrates.g:693:2: ( ( rule__Basicformulae__Alternatives ) )
            {
            // InternalSocrates.g:693:2: ( ( rule__Basicformulae__Alternatives ) )
            // InternalSocrates.g:694:3: ( rule__Basicformulae__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicformulaeAccess().getAlternatives()); 
            }
            // InternalSocrates.g:695:3: ( rule__Basicformulae__Alternatives )
            // InternalSocrates.g:695:4: rule__Basicformulae__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Basicformulae__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicformulaeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebasicformulae"


    // $ANTLR start "entryRuleboundterm"
    // InternalSocrates.g:704:1: entryRuleboundterm : ruleboundterm EOF ;
    public final void entryRuleboundterm() throws RecognitionException {
        try {
            // InternalSocrates.g:705:1: ( ruleboundterm EOF )
            // InternalSocrates.g:706:1: ruleboundterm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleboundterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleboundterm"


    // $ANTLR start "ruleboundterm"
    // InternalSocrates.g:713:1: ruleboundterm : ( ( rule__Boundterm__Group__0 ) ) ;
    public final void ruleboundterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:717:2: ( ( ( rule__Boundterm__Group__0 ) ) )
            // InternalSocrates.g:718:2: ( ( rule__Boundterm__Group__0 ) )
            {
            // InternalSocrates.g:718:2: ( ( rule__Boundterm__Group__0 ) )
            // InternalSocrates.g:719:3: ( rule__Boundterm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getGroup()); 
            }
            // InternalSocrates.g:720:3: ( rule__Boundterm__Group__0 )
            // InternalSocrates.g:720:4: rule__Boundterm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Boundterm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboundterm"


    // $ANTLR start "entryRuletimedterm"
    // InternalSocrates.g:729:1: entryRuletimedterm : ruletimedterm EOF ;
    public final void entryRuletimedterm() throws RecognitionException {
        try {
            // InternalSocrates.g:730:1: ( ruletimedterm EOF )
            // InternalSocrates.g:731:1: ruletimedterm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruletimedterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletimedterm"


    // $ANTLR start "ruletimedterm"
    // InternalSocrates.g:738:1: ruletimedterm : ( ( rule__Timedterm__Alternatives ) ) ;
    public final void ruletimedterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:742:2: ( ( ( rule__Timedterm__Alternatives ) ) )
            // InternalSocrates.g:743:2: ( ( rule__Timedterm__Alternatives ) )
            {
            // InternalSocrates.g:743:2: ( ( rule__Timedterm__Alternatives ) )
            // InternalSocrates.g:744:3: ( rule__Timedterm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getAlternatives()); 
            }
            // InternalSocrates.g:745:3: ( rule__Timedterm__Alternatives )
            // InternalSocrates.g:745:4: rule__Timedterm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Timedterm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletimedterm"


    // $ANTLR start "entryRuleatom"
    // InternalSocrates.g:754:1: entryRuleatom : ruleatom EOF ;
    public final void entryRuleatom() throws RecognitionException {
        try {
            // InternalSocrates.g:755:1: ( ruleatom EOF )
            // InternalSocrates.g:756:1: ruleatom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleatom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleatom"


    // $ANTLR start "ruleatom"
    // InternalSocrates.g:763:1: ruleatom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleatom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:767:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalSocrates.g:768:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalSocrates.g:768:2: ( ( rule__Atom__Alternatives ) )
            // InternalSocrates.g:769:3: ( rule__Atom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // InternalSocrates.g:770:3: ( rule__Atom__Alternatives )
            // InternalSocrates.g:770:4: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleatom"


    // $ANTLR start "entryRulevalue"
    // InternalSocrates.g:779:1: entryRulevalue : rulevalue EOF ;
    public final void entryRulevalue() throws RecognitionException {
        try {
            // InternalSocrates.g:780:1: ( rulevalue EOF )
            // InternalSocrates.g:781:1: rulevalue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevalue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevalue"


    // $ANTLR start "rulevalue"
    // InternalSocrates.g:788:1: rulevalue : ( ( rule__Value__Alternatives ) ) ;
    public final void rulevalue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:792:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalSocrates.g:793:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalSocrates.g:793:2: ( ( rule__Value__Alternatives ) )
            // InternalSocrates.g:794:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalSocrates.g:795:3: ( rule__Value__Alternatives )
            // InternalSocrates.g:795:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevalue"


    // $ANTLR start "entryRuleSignal"
    // InternalSocrates.g:804:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // InternalSocrates.g:805:1: ( ruleSignal EOF )
            // InternalSocrates.g:806:1: ruleSignal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalSocrates.g:813:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:817:2: ( ( ( rule__Signal__Alternatives ) ) )
            // InternalSocrates.g:818:2: ( ( rule__Signal__Alternatives ) )
            {
            // InternalSocrates.g:818:2: ( ( rule__Signal__Alternatives ) )
            // InternalSocrates.g:819:3: ( rule__Signal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getAlternatives()); 
            }
            // InternalSocrates.g:820:3: ( rule__Signal__Alternatives )
            // InternalSocrates.g:820:4: rule__Signal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleAbsEXP"
    // InternalSocrates.g:829:1: entryRuleAbsEXP : ruleAbsEXP EOF ;
    public final void entryRuleAbsEXP() throws RecognitionException {
        try {
            // InternalSocrates.g:830:1: ( ruleAbsEXP EOF )
            // InternalSocrates.g:831:1: ruleAbsEXP EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbsEXPRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbsEXP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbsEXPRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbsEXP"


    // $ANTLR start "ruleAbsEXP"
    // InternalSocrates.g:838:1: ruleAbsEXP : ( ( rule__AbsEXP__Group__0 ) ) ;
    public final void ruleAbsEXP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:842:2: ( ( ( rule__AbsEXP__Group__0 ) ) )
            // InternalSocrates.g:843:2: ( ( rule__AbsEXP__Group__0 ) )
            {
            // InternalSocrates.g:843:2: ( ( rule__AbsEXP__Group__0 ) )
            // InternalSocrates.g:844:3: ( rule__AbsEXP__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbsEXPAccess().getGroup()); 
            }
            // InternalSocrates.g:845:3: ( rule__AbsEXP__Group__0 )
            // InternalSocrates.g:845:4: rule__AbsEXP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbsEXP__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbsEXPAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbsEXP"


    // $ANTLR start "entryRuleNormexp"
    // InternalSocrates.g:854:1: entryRuleNormexp : ruleNormexp EOF ;
    public final void entryRuleNormexp() throws RecognitionException {
        try {
            // InternalSocrates.g:855:1: ( ruleNormexp EOF )
            // InternalSocrates.g:856:1: ruleNormexp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNormexpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNormexp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNormexpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNormexp"


    // $ANTLR start "ruleNormexp"
    // InternalSocrates.g:863:1: ruleNormexp : ( ( rule__Normexp__Group__0 ) ) ;
    public final void ruleNormexp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:867:2: ( ( ( rule__Normexp__Group__0 ) ) )
            // InternalSocrates.g:868:2: ( ( rule__Normexp__Group__0 ) )
            {
            // InternalSocrates.g:868:2: ( ( rule__Normexp__Group__0 ) )
            // InternalSocrates.g:869:3: ( rule__Normexp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNormexpAccess().getGroup()); 
            }
            // InternalSocrates.g:870:3: ( rule__Normexp__Group__0 )
            // InternalSocrates.g:870:4: rule__Normexp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Normexp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNormexpAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormexp"


    // $ANTLR start "entryRuleSin"
    // InternalSocrates.g:879:1: entryRuleSin : ruleSin EOF ;
    public final void entryRuleSin() throws RecognitionException {
        try {
            // InternalSocrates.g:880:1: ( ruleSin EOF )
            // InternalSocrates.g:881:1: ruleSin EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSinRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSinRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSin"


    // $ANTLR start "ruleSin"
    // InternalSocrates.g:888:1: ruleSin : ( ( rule__Sin__Group__0 ) ) ;
    public final void ruleSin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:892:2: ( ( ( rule__Sin__Group__0 ) ) )
            // InternalSocrates.g:893:2: ( ( rule__Sin__Group__0 ) )
            {
            // InternalSocrates.g:893:2: ( ( rule__Sin__Group__0 ) )
            // InternalSocrates.g:894:3: ( rule__Sin__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSinAccess().getGroup()); 
            }
            // InternalSocrates.g:895:3: ( rule__Sin__Group__0 )
            // InternalSocrates.g:895:4: rule__Sin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sin__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSinAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSin"


    // $ANTLR start "entryRuleCos"
    // InternalSocrates.g:904:1: entryRuleCos : ruleCos EOF ;
    public final void entryRuleCos() throws RecognitionException {
        try {
            // InternalSocrates.g:905:1: ( ruleCos EOF )
            // InternalSocrates.g:906:1: ruleCos EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCosRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCos();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCosRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCos"


    // $ANTLR start "ruleCos"
    // InternalSocrates.g:913:1: ruleCos : ( ( rule__Cos__Group__0 ) ) ;
    public final void ruleCos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:917:2: ( ( ( rule__Cos__Group__0 ) ) )
            // InternalSocrates.g:918:2: ( ( rule__Cos__Group__0 ) )
            {
            // InternalSocrates.g:918:2: ( ( rule__Cos__Group__0 ) )
            // InternalSocrates.g:919:3: ( rule__Cos__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCosAccess().getGroup()); 
            }
            // InternalSocrates.g:920:3: ( rule__Cos__Group__0 )
            // InternalSocrates.g:920:4: rule__Cos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cos__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCosAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCos"


    // $ANTLR start "entryRuleSqrt"
    // InternalSocrates.g:929:1: entryRuleSqrt : ruleSqrt EOF ;
    public final void entryRuleSqrt() throws RecognitionException {
        try {
            // InternalSocrates.g:930:1: ( ruleSqrt EOF )
            // InternalSocrates.g:931:1: ruleSqrt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSqrtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSqrt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSqrtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSqrt"


    // $ANTLR start "ruleSqrt"
    // InternalSocrates.g:938:1: ruleSqrt : ( ( rule__Sqrt__Group__0 ) ) ;
    public final void ruleSqrt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:942:2: ( ( ( rule__Sqrt__Group__0 ) ) )
            // InternalSocrates.g:943:2: ( ( rule__Sqrt__Group__0 ) )
            {
            // InternalSocrates.g:943:2: ( ( rule__Sqrt__Group__0 ) )
            // InternalSocrates.g:944:3: ( rule__Sqrt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSqrtAccess().getGroup()); 
            }
            // InternalSocrates.g:945:3: ( rule__Sqrt__Group__0 )
            // InternalSocrates.g:945:4: rule__Sqrt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSqrtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSqrt"


    // $ANTLR start "entryRuleFLOAT"
    // InternalSocrates.g:954:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalSocrates.g:955:1: ( ruleFLOAT EOF )
            // InternalSocrates.g:956:1: ruleFLOAT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFLOATRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFLOATRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalSocrates.g:963:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:967:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalSocrates.g:968:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalSocrates.g:968:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalSocrates.g:969:3: ( rule__FLOAT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getGroup()); 
            }
            // InternalSocrates.g:970:3: ( rule__FLOAT__Group__0 )
            // InternalSocrates.g:970:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRulePATH"
    // InternalSocrates.g:979:1: entryRulePATH : rulePATH EOF ;
    public final void entryRulePATH() throws RecognitionException {
        try {
            // InternalSocrates.g:980:1: ( rulePATH EOF )
            // InternalSocrates.g:981:1: rulePATH EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPATHRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPATHRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePATH"


    // $ANTLR start "rulePATH"
    // InternalSocrates.g:988:1: rulePATH : ( ( rule__PATH__Group__0 ) ) ;
    public final void rulePATH() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:992:2: ( ( ( rule__PATH__Group__0 ) ) )
            // InternalSocrates.g:993:2: ( ( rule__PATH__Group__0 ) )
            {
            // InternalSocrates.g:993:2: ( ( rule__PATH__Group__0 ) )
            // InternalSocrates.g:994:3: ( rule__PATH__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPATHAccess().getGroup()); 
            }
            // InternalSocrates.g:995:3: ( rule__PATH__Group__0 )
            // InternalSocrates.g:995:4: rule__PATH__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PATH__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPATHAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePATH"


    // $ANTLR start "entryRulenumber"
    // InternalSocrates.g:1004:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // InternalSocrates.g:1005:1: ( rulenumber EOF )
            // InternalSocrates.g:1006:1: rulenumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalSocrates.g:1013:1: rulenumber : ( ( rule__Number__Alternatives ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1017:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalSocrates.g:1018:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalSocrates.g:1018:2: ( ( rule__Number__Alternatives ) )
            // InternalSocrates.g:1019:3: ( rule__Number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getAlternatives()); 
            }
            // InternalSocrates.g:1020:3: ( rule__Number__Alternatives )
            // InternalSocrates.g:1020:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleRELOP"
    // InternalSocrates.g:1029:1: entryRuleRELOP : ruleRELOP EOF ;
    public final void entryRuleRELOP() throws RecognitionException {
        try {
            // InternalSocrates.g:1030:1: ( ruleRELOP EOF )
            // InternalSocrates.g:1031:1: ruleRELOP EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRELOPRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRELOP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRELOPRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRELOP"


    // $ANTLR start "ruleRELOP"
    // InternalSocrates.g:1038:1: ruleRELOP : ( ( rule__RELOP__Alternatives ) ) ;
    public final void ruleRELOP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1042:2: ( ( ( rule__RELOP__Alternatives ) ) )
            // InternalSocrates.g:1043:2: ( ( rule__RELOP__Alternatives ) )
            {
            // InternalSocrates.g:1043:2: ( ( rule__RELOP__Alternatives ) )
            // InternalSocrates.g:1044:3: ( rule__RELOP__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRELOPAccess().getAlternatives()); 
            }
            // InternalSocrates.g:1045:3: ( rule__RELOP__Alternatives )
            // InternalSocrates.g:1045:4: rule__RELOP__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RELOP__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRELOPAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRELOP"


    // $ANTLR start "entryRuleCOMMA"
    // InternalSocrates.g:1054:1: entryRuleCOMMA : ruleCOMMA EOF ;
    public final void entryRuleCOMMA() throws RecognitionException {
        try {
            // InternalSocrates.g:1055:1: ( ruleCOMMA EOF )
            // InternalSocrates.g:1056:1: ruleCOMMA EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMMARule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCOMMA();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMMARule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // InternalSocrates.g:1063:1: ruleCOMMA : ( ',' ) ;
    public final void ruleCOMMA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1067:2: ( ( ',' ) )
            // InternalSocrates.g:1068:2: ( ',' )
            {
            // InternalSocrates.g:1068:2: ( ',' )
            // InternalSocrates.g:1069:3: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMMAAccess().getCommaKeyword()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMMAAccess().getCommaKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "entryRuleLE"
    // InternalSocrates.g:1079:1: entryRuleLE : ruleLE EOF ;
    public final void entryRuleLE() throws RecognitionException {
        try {
            // InternalSocrates.g:1080:1: ( ruleLE EOF )
            // InternalSocrates.g:1081:1: ruleLE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLE"


    // $ANTLR start "ruleLE"
    // InternalSocrates.g:1088:1: ruleLE : ( '<' ) ;
    public final void ruleLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1092:2: ( ( '<' ) )
            // InternalSocrates.g:1093:2: ( '<' )
            {
            // InternalSocrates.g:1093:2: ( '<' )
            // InternalSocrates.g:1094:3: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEAccess().getLessThanSignKeyword()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEAccess().getLessThanSignKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLE"


    // $ANTLR start "entryRuleLEQ"
    // InternalSocrates.g:1104:1: entryRuleLEQ : ruleLEQ EOF ;
    public final void entryRuleLEQ() throws RecognitionException {
        try {
            // InternalSocrates.g:1105:1: ( ruleLEQ EOF )
            // InternalSocrates.g:1106:1: ruleLEQ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEQRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLEQ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEQRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLEQ"


    // $ANTLR start "ruleLEQ"
    // InternalSocrates.g:1113:1: ruleLEQ : ( '<=' ) ;
    public final void ruleLEQ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1117:2: ( ( '<=' ) )
            // InternalSocrates.g:1118:2: ( '<=' )
            {
            // InternalSocrates.g:1118:2: ( '<=' )
            // InternalSocrates.g:1119:3: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEQAccess().getLessThanSignEqualsSignKeyword()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEQAccess().getLessThanSignEqualsSignKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLEQ"


    // $ANTLR start "entryRuleGE"
    // InternalSocrates.g:1129:1: entryRuleGE : ruleGE EOF ;
    public final void entryRuleGE() throws RecognitionException {
        try {
            // InternalSocrates.g:1130:1: ( ruleGE EOF )
            // InternalSocrates.g:1131:1: ruleGE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGE"


    // $ANTLR start "ruleGE"
    // InternalSocrates.g:1138:1: ruleGE : ( '>' ) ;
    public final void ruleGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1142:2: ( ( '>' ) )
            // InternalSocrates.g:1143:2: ( '>' )
            {
            // InternalSocrates.g:1143:2: ( '>' )
            // InternalSocrates.g:1144:3: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEAccess().getGreaterThanSignKeyword()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEAccess().getGreaterThanSignKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGE"


    // $ANTLR start "entryRuleGEQ"
    // InternalSocrates.g:1154:1: entryRuleGEQ : ruleGEQ EOF ;
    public final void entryRuleGEQ() throws RecognitionException {
        try {
            // InternalSocrates.g:1155:1: ( ruleGEQ EOF )
            // InternalSocrates.g:1156:1: ruleGEQ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEQRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGEQ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEQRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGEQ"


    // $ANTLR start "ruleGEQ"
    // InternalSocrates.g:1163:1: ruleGEQ : ( '>=' ) ;
    public final void ruleGEQ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1167:2: ( ( '>=' ) )
            // InternalSocrates.g:1168:2: ( '>=' )
            {
            // InternalSocrates.g:1168:2: ( '>=' )
            // InternalSocrates.g:1169:3: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEQAccess().getGreaterThanSignEqualsSignKeyword()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEQAccess().getGreaterThanSignEqualsSignKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEQ"


    // $ANTLR start "entryRuleEQ"
    // InternalSocrates.g:1179:1: entryRuleEQ : ruleEQ EOF ;
    public final void entryRuleEQ() throws RecognitionException {
        try {
            // InternalSocrates.g:1180:1: ( ruleEQ EOF )
            // InternalSocrates.g:1181:1: ruleEQ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEQ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEQ"


    // $ANTLR start "ruleEQ"
    // InternalSocrates.g:1188:1: ruleEQ : ( '=' ) ;
    public final void ruleEQ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1192:2: ( ( '=' ) )
            // InternalSocrates.g:1193:2: ( '=' )
            {
            // InternalSocrates.g:1193:2: ( '=' )
            // InternalSocrates.g:1194:3: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQAccess().getEqualsSignKeyword()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQAccess().getEqualsSignKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEQ"


    // $ANTLR start "entryRuleNEQ"
    // InternalSocrates.g:1204:1: entryRuleNEQ : ruleNEQ EOF ;
    public final void entryRuleNEQ() throws RecognitionException {
        try {
            // InternalSocrates.g:1205:1: ( ruleNEQ EOF )
            // InternalSocrates.g:1206:1: ruleNEQ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNEQRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNEQ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNEQRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNEQ"


    // $ANTLR start "ruleNEQ"
    // InternalSocrates.g:1213:1: ruleNEQ : ( '!=' ) ;
    public final void ruleNEQ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1217:2: ( ( '!=' ) )
            // InternalSocrates.g:1218:2: ( '!=' )
            {
            // InternalSocrates.g:1218:2: ( '!=' )
            // InternalSocrates.g:1219:3: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNEQAccess().getExclamationMarkEqualsSignKeyword()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNEQAccess().getExclamationMarkEqualsSignKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNEQ"


    // $ANTLR start "entryRuleLPAREN"
    // InternalSocrates.g:1229:1: entryRuleLPAREN : ruleLPAREN EOF ;
    public final void entryRuleLPAREN() throws RecognitionException {
        try {
            // InternalSocrates.g:1230:1: ( ruleLPAREN EOF )
            // InternalSocrates.g:1231:1: ruleLPAREN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLPARENRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLPARENRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLPAREN"


    // $ANTLR start "ruleLPAREN"
    // InternalSocrates.g:1238:1: ruleLPAREN : ( '(' ) ;
    public final void ruleLPAREN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1242:2: ( ( '(' ) )
            // InternalSocrates.g:1243:2: ( '(' )
            {
            // InternalSocrates.g:1243:2: ( '(' )
            // InternalSocrates.g:1244:3: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLPARENAccess().getLeftParenthesisKeyword()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLPARENAccess().getLeftParenthesisKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLPAREN"


    // $ANTLR start "entryRuleRPAREN"
    // InternalSocrates.g:1254:1: entryRuleRPAREN : ruleRPAREN EOF ;
    public final void entryRuleRPAREN() throws RecognitionException {
        try {
            // InternalSocrates.g:1255:1: ( ruleRPAREN EOF )
            // InternalSocrates.g:1256:1: ruleRPAREN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPARENRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPARENRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRPAREN"


    // $ANTLR start "ruleRPAREN"
    // InternalSocrates.g:1263:1: ruleRPAREN : ( ')' ) ;
    public final void ruleRPAREN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1267:2: ( ( ')' ) )
            // InternalSocrates.g:1268:2: ( ')' )
            {
            // InternalSocrates.g:1268:2: ( ')' )
            // InternalSocrates.g:1269:3: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRPARENAccess().getRightParenthesisKeyword()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRPARENAccess().getRightParenthesisKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRPAREN"


    // $ANTLR start "entryRuleLSQUARE"
    // InternalSocrates.g:1279:1: entryRuleLSQUARE : ruleLSQUARE EOF ;
    public final void entryRuleLSQUARE() throws RecognitionException {
        try {
            // InternalSocrates.g:1280:1: ( ruleLSQUARE EOF )
            // InternalSocrates.g:1281:1: ruleLSQUARE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLSQUARERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLSQUARERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLSQUARE"


    // $ANTLR start "ruleLSQUARE"
    // InternalSocrates.g:1288:1: ruleLSQUARE : ( '[' ) ;
    public final void ruleLSQUARE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1292:2: ( ( '[' ) )
            // InternalSocrates.g:1293:2: ( '[' )
            {
            // InternalSocrates.g:1293:2: ( '[' )
            // InternalSocrates.g:1294:3: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLSQUAREAccess().getLeftSquareBracketKeyword()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLSQUAREAccess().getLeftSquareBracketKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLSQUARE"


    // $ANTLR start "entryRuleRSQUARE"
    // InternalSocrates.g:1304:1: entryRuleRSQUARE : ruleRSQUARE EOF ;
    public final void entryRuleRSQUARE() throws RecognitionException {
        try {
            // InternalSocrates.g:1305:1: ( ruleRSQUARE EOF )
            // InternalSocrates.g:1306:1: ruleRSQUARE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSQUARERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSQUARERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRSQUARE"


    // $ANTLR start "ruleRSQUARE"
    // InternalSocrates.g:1313:1: ruleRSQUARE : ( ']' ) ;
    public final void ruleRSQUARE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1317:2: ( ( ']' ) )
            // InternalSocrates.g:1318:2: ( ']' )
            {
            // InternalSocrates.g:1318:2: ( ']' )
            // InternalSocrates.g:1319:3: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSQUAREAccess().getRightSquareBracketKeyword()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSQUAREAccess().getRightSquareBracketKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRSQUARE"


    // $ANTLR start "entryRuleNOT"
    // InternalSocrates.g:1329:1: entryRuleNOT : ruleNOT EOF ;
    public final void entryRuleNOT() throws RecognitionException {
        try {
            // InternalSocrates.g:1330:1: ( ruleNOT EOF )
            // InternalSocrates.g:1331:1: ruleNOT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNOTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNOT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNOTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNOT"


    // $ANTLR start "ruleNOT"
    // InternalSocrates.g:1338:1: ruleNOT : ( 'not' ) ;
    public final void ruleNOT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1342:2: ( ( 'not' ) )
            // InternalSocrates.g:1343:2: ( 'not' )
            {
            // InternalSocrates.g:1343:2: ( 'not' )
            // InternalSocrates.g:1344:3: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNOTAccess().getNotKeyword()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNOTAccess().getNotKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNOT"


    // $ANTLR start "entryRuleFORALL"
    // InternalSocrates.g:1354:1: entryRuleFORALL : ruleFORALL EOF ;
    public final void entryRuleFORALL() throws RecognitionException {
        try {
            // InternalSocrates.g:1355:1: ( ruleFORALL EOF )
            // InternalSocrates.g:1356:1: ruleFORALL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFORALLRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFORALL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFORALLRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFORALL"


    // $ANTLR start "ruleFORALL"
    // InternalSocrates.g:1363:1: ruleFORALL : ( 'forall' ) ;
    public final void ruleFORALL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1367:2: ( ( 'forall' ) )
            // InternalSocrates.g:1368:2: ( 'forall' )
            {
            // InternalSocrates.g:1368:2: ( 'forall' )
            // InternalSocrates.g:1369:3: 'forall'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFORALLAccess().getForallKeyword()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFORALLAccess().getForallKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFORALL"


    // $ANTLR start "entryRuleEXISTS"
    // InternalSocrates.g:1379:1: entryRuleEXISTS : ruleEXISTS EOF ;
    public final void entryRuleEXISTS() throws RecognitionException {
        try {
            // InternalSocrates.g:1380:1: ( ruleEXISTS EOF )
            // InternalSocrates.g:1381:1: ruleEXISTS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXISTSRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEXISTS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXISTSRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXISTS"


    // $ANTLR start "ruleEXISTS"
    // InternalSocrates.g:1388:1: ruleEXISTS : ( 'exists' ) ;
    public final void ruleEXISTS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1392:2: ( ( 'exists' ) )
            // InternalSocrates.g:1393:2: ( 'exists' )
            {
            // InternalSocrates.g:1393:2: ( 'exists' )
            // InternalSocrates.g:1394:3: 'exists'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXISTSAccess().getExistsKeyword()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXISTSAccess().getExistsKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXISTS"


    // $ANTLR start "entryRuleCONJ"
    // InternalSocrates.g:1404:1: entryRuleCONJ : ruleCONJ EOF ;
    public final void entryRuleCONJ() throws RecognitionException {
        try {
            // InternalSocrates.g:1405:1: ( ruleCONJ EOF )
            // InternalSocrates.g:1406:1: ruleCONJ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONJRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCONJ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCONJRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCONJ"


    // $ANTLR start "ruleCONJ"
    // InternalSocrates.g:1413:1: ruleCONJ : ( 'and' ) ;
    public final void ruleCONJ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1417:2: ( ( 'and' ) )
            // InternalSocrates.g:1418:2: ( 'and' )
            {
            // InternalSocrates.g:1418:2: ( 'and' )
            // InternalSocrates.g:1419:3: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONJAccess().getAndKeyword()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCONJAccess().getAndKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCONJ"


    // $ANTLR start "entryRuleDISJ"
    // InternalSocrates.g:1429:1: entryRuleDISJ : ruleDISJ EOF ;
    public final void entryRuleDISJ() throws RecognitionException {
        try {
            // InternalSocrates.g:1430:1: ( ruleDISJ EOF )
            // InternalSocrates.g:1431:1: ruleDISJ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDISJRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDISJ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDISJRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDISJ"


    // $ANTLR start "ruleDISJ"
    // InternalSocrates.g:1438:1: ruleDISJ : ( 'or' ) ;
    public final void ruleDISJ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1442:2: ( ( 'or' ) )
            // InternalSocrates.g:1443:2: ( 'or' )
            {
            // InternalSocrates.g:1443:2: ( 'or' )
            // InternalSocrates.g:1444:3: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDISJAccess().getOrKeyword()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDISJAccess().getOrKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDISJ"


    // $ANTLR start "entryRuleIMPL"
    // InternalSocrates.g:1454:1: entryRuleIMPL : ruleIMPL EOF ;
    public final void entryRuleIMPL() throws RecognitionException {
        try {
            // InternalSocrates.g:1455:1: ( ruleIMPL EOF )
            // InternalSocrates.g:1456:1: ruleIMPL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIMPLRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIMPL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIMPLRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIMPL"


    // $ANTLR start "ruleIMPL"
    // InternalSocrates.g:1463:1: ruleIMPL : ( 'implies' ) ;
    public final void ruleIMPL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1467:2: ( ( 'implies' ) )
            // InternalSocrates.g:1468:2: ( 'implies' )
            {
            // InternalSocrates.g:1468:2: ( 'implies' )
            // InternalSocrates.g:1469:3: 'implies'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIMPLAccess().getImpliesKeyword()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIMPLAccess().getImpliesKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIMPL"


    // $ANTLR start "entryRuleBICOND"
    // InternalSocrates.g:1479:1: entryRuleBICOND : ruleBICOND EOF ;
    public final void entryRuleBICOND() throws RecognitionException {
        try {
            // InternalSocrates.g:1480:1: ( ruleBICOND EOF )
            // InternalSocrates.g:1481:1: ruleBICOND EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBICONDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBICOND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBICONDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBICOND"


    // $ANTLR start "ruleBICOND"
    // InternalSocrates.g:1488:1: ruleBICOND : ( 'iff' ) ;
    public final void ruleBICOND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1492:2: ( ( 'iff' ) )
            // InternalSocrates.g:1493:2: ( 'iff' )
            {
            // InternalSocrates.g:1493:2: ( 'iff' )
            // InternalSocrates.g:1494:3: 'iff'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBICONDAccess().getIffKeyword()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBICONDAccess().getIffKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBICOND"


    // $ANTLR start "entryRuleINF"
    // InternalSocrates.g:1504:1: entryRuleINF : ruleINF EOF ;
    public final void entryRuleINF() throws RecognitionException {
        try {
            // InternalSocrates.g:1505:1: ( ruleINF EOF )
            // InternalSocrates.g:1506:1: ruleINF EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINFRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleINF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINFRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINF"


    // $ANTLR start "ruleINF"
    // InternalSocrates.g:1513:1: ruleINF : ( 'inf' ) ;
    public final void ruleINF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1517:2: ( ( 'inf' ) )
            // InternalSocrates.g:1518:2: ( 'inf' )
            {
            // InternalSocrates.g:1518:2: ( 'inf' )
            // InternalSocrates.g:1519:3: 'inf'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINFAccess().getInfKeyword()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINFAccess().getInfKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINF"


    // $ANTLR start "entryRuleIN"
    // InternalSocrates.g:1529:1: entryRuleIN : ruleIN EOF ;
    public final void entryRuleIN() throws RecognitionException {
        try {
            // InternalSocrates.g:1530:1: ( ruleIN EOF )
            // InternalSocrates.g:1531:1: ruleIN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIN"


    // $ANTLR start "ruleIN"
    // InternalSocrates.g:1538:1: ruleIN : ( 'in' ) ;
    public final void ruleIN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1542:2: ( ( 'in' ) )
            // InternalSocrates.g:1543:2: ( 'in' )
            {
            // InternalSocrates.g:1543:2: ( 'in' )
            // InternalSocrates.g:1544:3: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINAccess().getInKeyword()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINAccess().getInKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIN"


    // $ANTLR start "entryRulePLUS"
    // InternalSocrates.g:1554:1: entryRulePLUS : rulePLUS EOF ;
    public final void entryRulePLUS() throws RecognitionException {
        try {
            // InternalSocrates.g:1555:1: ( rulePLUS EOF )
            // InternalSocrates.g:1556:1: rulePLUS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPLUSRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePLUS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPLUSRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePLUS"


    // $ANTLR start "rulePLUS"
    // InternalSocrates.g:1563:1: rulePLUS : ( '+' ) ;
    public final void rulePLUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1567:2: ( ( '+' ) )
            // InternalSocrates.g:1568:2: ( '+' )
            {
            // InternalSocrates.g:1568:2: ( '+' )
            // InternalSocrates.g:1569:3: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPLUSAccess().getPlusSignKeyword()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPLUSAccess().getPlusSignKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePLUS"


    // $ANTLR start "entryRuleMINUS"
    // InternalSocrates.g:1579:1: entryRuleMINUS : ruleMINUS EOF ;
    public final void entryRuleMINUS() throws RecognitionException {
        try {
            // InternalSocrates.g:1580:1: ( ruleMINUS EOF )
            // InternalSocrates.g:1581:1: ruleMINUS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMINUSRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMINUS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMINUSRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMINUS"


    // $ANTLR start "ruleMINUS"
    // InternalSocrates.g:1588:1: ruleMINUS : ( '-' ) ;
    public final void ruleMINUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1592:2: ( ( '-' ) )
            // InternalSocrates.g:1593:2: ( '-' )
            {
            // InternalSocrates.g:1593:2: ( '-' )
            // InternalSocrates.g:1594:3: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMINUSAccess().getHyphenMinusKeyword()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMINUSAccess().getHyphenMinusKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMINUS"


    // $ANTLR start "entryRuleCOLON"
    // InternalSocrates.g:1604:1: entryRuleCOLON : ruleCOLON EOF ;
    public final void entryRuleCOLON() throws RecognitionException {
        try {
            // InternalSocrates.g:1605:1: ( ruleCOLON EOF )
            // InternalSocrates.g:1606:1: ruleCOLON EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOLONRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCOLON();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOLONRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOLON"


    // $ANTLR start "ruleCOLON"
    // InternalSocrates.g:1613:1: ruleCOLON : ( ':' ) ;
    public final void ruleCOLON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1617:2: ( ( ':' ) )
            // InternalSocrates.g:1618:2: ( ':' )
            {
            // InternalSocrates.g:1618:2: ( ':' )
            // InternalSocrates.g:1619:3: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOLONAccess().getColonKeyword()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOLONAccess().getColonKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOLON"


    // $ANTLR start "entryRuleSIGN"
    // InternalSocrates.g:1629:1: entryRuleSIGN : ruleSIGN EOF ;
    public final void entryRuleSIGN() throws RecognitionException {
        try {
            // InternalSocrates.g:1630:1: ( ruleSIGN EOF )
            // InternalSocrates.g:1631:1: ruleSIGN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSIGN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSIGN"


    // $ANTLR start "ruleSIGN"
    // InternalSocrates.g:1638:1: ruleSIGN : ( ( rule__SIGN__Alternatives ) ) ;
    public final void ruleSIGN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1642:2: ( ( ( rule__SIGN__Alternatives ) ) )
            // InternalSocrates.g:1643:2: ( ( rule__SIGN__Alternatives ) )
            {
            // InternalSocrates.g:1643:2: ( ( rule__SIGN__Alternatives ) )
            // InternalSocrates.g:1644:3: ( rule__SIGN__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNAccess().getAlternatives()); 
            }
            // InternalSocrates.g:1645:3: ( rule__SIGN__Alternatives )
            // InternalSocrates.g:1645:4: rule__SIGN__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SIGN__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSIGN"


    // $ANTLR start "rule__Formula__Alternatives"
    // InternalSocrates.g:1653:1: rule__Formula__Alternatives : ( ( ( rule__Formula__FAssignment_0 ) ) | ( ( rule__Formula__FAssignment_1 ) ) );
    public final void rule__Formula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1657:1: ( ( ( rule__Formula__FAssignment_0 ) ) | ( ( rule__Formula__FAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=24 && LA6_0<=26)) ) {
                alt6=1;
            }
            else if ( (LA6_0==20||LA6_0==50) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSocrates.g:1658:2: ( ( rule__Formula__FAssignment_0 ) )
                    {
                    // InternalSocrates.g:1658:2: ( ( rule__Formula__FAssignment_0 ) )
                    // InternalSocrates.g:1659:3: ( rule__Formula__FAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormulaAccess().getFAssignment_0()); 
                    }
                    // InternalSocrates.g:1660:3: ( rule__Formula__FAssignment_0 )
                    // InternalSocrates.g:1660:4: rule__Formula__FAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formula__FAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormulaAccess().getFAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1664:2: ( ( rule__Formula__FAssignment_1 ) )
                    {
                    // InternalSocrates.g:1664:2: ( ( rule__Formula__FAssignment_1 ) )
                    // InternalSocrates.g:1665:3: ( rule__Formula__FAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormulaAccess().getFAssignment_1()); 
                    }
                    // InternalSocrates.g:1666:3: ( rule__Formula__FAssignment_1 )
                    // InternalSocrates.g:1666:4: rule__Formula__FAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formula__FAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormulaAccess().getFAssignment_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Alternatives"


    // $ANTLR start "rule__Formulabprime__OpAlternatives_0_0"
    // InternalSocrates.g:1674:1: rule__Formulabprime__OpAlternatives_0_0 : ( ( 'or' ) | ( 'implies' ) | ( 'iff' ) );
    public final void rule__Formulabprime__OpAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1678:1: ( ( 'or' ) | ( 'implies' ) | ( 'iff' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSocrates.g:1679:2: ( 'or' )
                    {
                    // InternalSocrates.g:1679:2: ( 'or' )
                    // InternalSocrates.g:1680:3: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormulabprimeAccess().getOpOrKeyword_0_0_0()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormulabprimeAccess().getOpOrKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1685:2: ( 'implies' )
                    {
                    // InternalSocrates.g:1685:2: ( 'implies' )
                    // InternalSocrates.g:1686:3: 'implies'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormulabprimeAccess().getOpImpliesKeyword_0_0_1()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormulabprimeAccess().getOpImpliesKeyword_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:1691:2: ( 'iff' )
                    {
                    // InternalSocrates.g:1691:2: ( 'iff' )
                    // InternalSocrates.g:1692:3: 'iff'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormulabprimeAccess().getOpIffKeyword_0_0_2()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormulabprimeAccess().getOpIffKeyword_0_0_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__OpAlternatives_0_0"


    // $ANTLR start "rule__Expressionb__Alternatives"
    // InternalSocrates.g:1701:1: rule__Expressionb__Alternatives : ( ( ( rule__Expressionb__Group_0__0 ) ) | ( ( rule__Expressionb__Group_1__0 ) ) );
    public final void rule__Expressionb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1705:1: ( ( ( rule__Expressionb__Group_0__0 ) ) | ( ( rule__Expressionb__Group_1__0 ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSocrates.g:1706:2: ( ( rule__Expressionb__Group_0__0 ) )
                    {
                    // InternalSocrates.g:1706:2: ( ( rule__Expressionb__Group_0__0 ) )
                    // InternalSocrates.g:1707:3: ( rule__Expressionb__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionbAccess().getGroup_0()); 
                    }
                    // InternalSocrates.g:1708:3: ( rule__Expressionb__Group_0__0 )
                    // InternalSocrates.g:1708:4: rule__Expressionb__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressionb__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionbAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1712:2: ( ( rule__Expressionb__Group_1__0 ) )
                    {
                    // InternalSocrates.g:1712:2: ( ( rule__Expressionb__Group_1__0 ) )
                    // InternalSocrates.g:1713:3: ( rule__Expressionb__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionbAccess().getGroup_1()); 
                    }
                    // InternalSocrates.g:1714:3: ( rule__Expressionb__Group_1__0 )
                    // InternalSocrates.g:1714:4: rule__Expressionb__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressionb__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionbAccess().getGroup_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Alternatives"


    // $ANTLR start "rule__Expressionprime__OpAlternatives_0_0"
    // InternalSocrates.g:1722:1: rule__Expressionprime__OpAlternatives_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Expressionprime__OpAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1726:1: ( ( '+' ) | ( '-' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            else if ( (LA9_0==34) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSocrates.g:1727:2: ( '+' )
                    {
                    // InternalSocrates.g:1727:2: ( '+' )
                    // InternalSocrates.g:1728:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionprimeAccess().getOpPlusSignKeyword_0_0_0()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionprimeAccess().getOpPlusSignKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1733:2: ( '-' )
                    {
                    // InternalSocrates.g:1733:2: ( '-' )
                    // InternalSocrates.g:1734:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionprimeAccess().getOpHyphenMinusKeyword_0_0_1()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionprimeAccess().getOpHyphenMinusKeyword_0_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__OpAlternatives_0_0"


    // $ANTLR start "rule__Expressionterm__TermAlternatives_0_0"
    // InternalSocrates.g:1743:1: rule__Expressionterm__TermAlternatives_0_0 : ( ( ruleExpressionAtom ) | ( ruleBasicexpression ) );
    public final void rule__Expressionterm__TermAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1747:1: ( ( ruleExpressionAtom ) | ( ruleBasicexpression ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalSocrates.g:1748:2: ( ruleExpressionAtom )
                    {
                    // InternalSocrates.g:1748:2: ( ruleExpressionAtom )
                    // InternalSocrates.g:1749:3: ruleExpressionAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressiontermAccess().getTermExpressionAtomParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionAtom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressiontermAccess().getTermExpressionAtomParserRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1754:2: ( ruleBasicexpression )
                    {
                    // InternalSocrates.g:1754:2: ( ruleBasicexpression )
                    // InternalSocrates.g:1755:3: ruleBasicexpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressiontermAccess().getTermBasicexpressionParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicexpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressiontermAccess().getTermBasicexpressionParserRuleCall_0_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionterm__TermAlternatives_0_0"


    // $ANTLR start "rule__Expressiontermprime__OpAlternatives_0_0"
    // InternalSocrates.g:1764:1: rule__Expressiontermprime__OpAlternatives_0_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Expressiontermprime__OpAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1768:1: ( ( '*' ) | ( '/' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            else if ( (LA11_0==37) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSocrates.g:1769:2: ( '*' )
                    {
                    // InternalSocrates.g:1769:2: ( '*' )
                    // InternalSocrates.g:1770:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressiontermprimeAccess().getOpAsteriskKeyword_0_0_0()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressiontermprimeAccess().getOpAsteriskKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1775:2: ( '/' )
                    {
                    // InternalSocrates.g:1775:2: ( '/' )
                    // InternalSocrates.g:1776:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressiontermprimeAccess().getOpSolidusKeyword_0_0_1()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressiontermprimeAccess().getOpSolidusKeyword_0_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__OpAlternatives_0_0"


    // $ANTLR start "rule__ExpressionAtom__Alternatives"
    // InternalSocrates.g:1785:1: rule__ExpressionAtom__Alternatives : ( ( ( rule__ExpressionAtom__ExpAssignment_0 ) ) | ( ( rule__ExpressionAtom__Group_1__0 ) ) | ( ( rule__ExpressionAtom__Group_2__0 ) ) | ( ( rule__ExpressionAtom__ExpAssignment_3 ) ) );
    public final void rule__ExpressionAtom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1789:1: ( ( ( rule__ExpressionAtom__ExpAssignment_0 ) ) | ( ( rule__ExpressionAtom__Group_1__0 ) ) | ( ( rule__ExpressionAtom__Group_2__0 ) ) | ( ( rule__ExpressionAtom__ExpAssignment_3 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred13_InternalSocrates()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred14_InternalSocrates()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
            case 34:
                {
                alt12=3;
                }
                break;
            case RULE_INT:
            case RULE_DIGIT:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSocrates.g:1790:2: ( ( rule__ExpressionAtom__ExpAssignment_0 ) )
                    {
                    // InternalSocrates.g:1790:2: ( ( rule__ExpressionAtom__ExpAssignment_0 ) )
                    // InternalSocrates.g:1791:3: ( rule__ExpressionAtom__ExpAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAtomAccess().getExpAssignment_0()); 
                    }
                    // InternalSocrates.g:1792:3: ( rule__ExpressionAtom__ExpAssignment_0 )
                    // InternalSocrates.g:1792:4: rule__ExpressionAtom__ExpAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionAtom__ExpAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAtomAccess().getExpAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1796:2: ( ( rule__ExpressionAtom__Group_1__0 ) )
                    {
                    // InternalSocrates.g:1796:2: ( ( rule__ExpressionAtom__Group_1__0 ) )
                    // InternalSocrates.g:1797:3: ( rule__ExpressionAtom__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAtomAccess().getGroup_1()); 
                    }
                    // InternalSocrates.g:1798:3: ( rule__ExpressionAtom__Group_1__0 )
                    // InternalSocrates.g:1798:4: rule__ExpressionAtom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionAtom__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAtomAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:1802:2: ( ( rule__ExpressionAtom__Group_2__0 ) )
                    {
                    // InternalSocrates.g:1802:2: ( ( rule__ExpressionAtom__Group_2__0 ) )
                    // InternalSocrates.g:1803:3: ( rule__ExpressionAtom__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAtomAccess().getGroup_2()); 
                    }
                    // InternalSocrates.g:1804:3: ( rule__ExpressionAtom__Group_2__0 )
                    // InternalSocrates.g:1804:4: rule__ExpressionAtom__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionAtom__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAtomAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSocrates.g:1808:2: ( ( rule__ExpressionAtom__ExpAssignment_3 ) )
                    {
                    // InternalSocrates.g:1808:2: ( ( rule__ExpressionAtom__ExpAssignment_3 ) )
                    // InternalSocrates.g:1809:3: ( rule__ExpressionAtom__ExpAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAtomAccess().getExpAssignment_3()); 
                    }
                    // InternalSocrates.g:1810:3: ( rule__ExpressionAtom__ExpAssignment_3 )
                    // InternalSocrates.g:1810:4: rule__ExpressionAtom__ExpAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionAtom__ExpAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAtomAccess().getExpAssignment_3()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Alternatives"


    // $ANTLR start "rule__Basicexpression__Alternatives"
    // InternalSocrates.g:1818:1: rule__Basicexpression__Alternatives : ( ( ( rule__Basicexpression__Group_0__0 ) ) | ( ( rule__Basicexpression__ExpAssignment_1 ) ) | ( ( rule__Basicexpression__ExpAssignment_2 ) ) | ( ( rule__Basicexpression__ExpAssignment_3 ) ) | ( ( rule__Basicexpression__ExpAssignment_4 ) ) | ( ( rule__Basicexpression__ExpAssignment_5 ) ) );
    public final void rule__Basicexpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1822:1: ( ( ( rule__Basicexpression__Group_0__0 ) ) | ( ( rule__Basicexpression__ExpAssignment_1 ) ) | ( ( rule__Basicexpression__ExpAssignment_2 ) ) | ( ( rule__Basicexpression__ExpAssignment_3 ) ) | ( ( rule__Basicexpression__ExpAssignment_4 ) ) | ( ( rule__Basicexpression__ExpAssignment_5 ) ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 52:
                {
                alt13=2;
                }
                break;
            case 53:
                {
                alt13=3;
                }
                break;
            case 54:
                {
                alt13=4;
                }
                break;
            case 55:
                {
                alt13=5;
                }
                break;
            case 56:
                {
                alt13=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSocrates.g:1823:2: ( ( rule__Basicexpression__Group_0__0 ) )
                    {
                    // InternalSocrates.g:1823:2: ( ( rule__Basicexpression__Group_0__0 ) )
                    // InternalSocrates.g:1824:3: ( rule__Basicexpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicexpressionAccess().getGroup_0()); 
                    }
                    // InternalSocrates.g:1825:3: ( rule__Basicexpression__Group_0__0 )
                    // InternalSocrates.g:1825:4: rule__Basicexpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basicexpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicexpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1829:2: ( ( rule__Basicexpression__ExpAssignment_1 ) )
                    {
                    // InternalSocrates.g:1829:2: ( ( rule__Basicexpression__ExpAssignment_1 ) )
                    // InternalSocrates.g:1830:3: ( rule__Basicexpression__ExpAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicexpressionAccess().getExpAssignment_1()); 
                    }
                    // InternalSocrates.g:1831:3: ( rule__Basicexpression__ExpAssignment_1 )
                    // InternalSocrates.g:1831:4: rule__Basicexpression__ExpAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basicexpression__ExpAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicexpressionAccess().getExpAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:1835:2: ( ( rule__Basicexpression__ExpAssignment_2 ) )
                    {
                    // InternalSocrates.g:1835:2: ( ( rule__Basicexpression__ExpAssignment_2 ) )
                    // InternalSocrates.g:1836:3: ( rule__Basicexpression__ExpAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicexpressionAccess().getExpAssignment_2()); 
                    }
                    // InternalSocrates.g:1837:3: ( rule__Basicexpression__ExpAssignment_2 )
                    // InternalSocrates.g:1837:4: rule__Basicexpression__ExpAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basicexpression__ExpAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicexpressionAccess().getExpAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSocrates.g:1841:2: ( ( rule__Basicexpression__ExpAssignment_3 ) )
                    {
                    // InternalSocrates.g:1841:2: ( ( rule__Basicexpression__ExpAssignment_3 ) )
                    // InternalSocrates.g:1842:3: ( rule__Basicexpression__ExpAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicexpressionAccess().getExpAssignment_3()); 
                    }
                    // InternalSocrates.g:1843:3: ( rule__Basicexpression__ExpAssignment_3 )
                    // InternalSocrates.g:1843:4: rule__Basicexpression__ExpAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basicexpression__ExpAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicexpressionAccess().getExpAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSocrates.g:1847:2: ( ( rule__Basicexpression__ExpAssignment_4 ) )
                    {
                    // InternalSocrates.g:1847:2: ( ( rule__Basicexpression__ExpAssignment_4 ) )
                    // InternalSocrates.g:1848:3: ( rule__Basicexpression__ExpAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicexpressionAccess().getExpAssignment_4()); 
                    }
                    // InternalSocrates.g:1849:3: ( rule__Basicexpression__ExpAssignment_4 )
                    // InternalSocrates.g:1849:4: rule__Basicexpression__ExpAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basicexpression__ExpAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicexpressionAccess().getExpAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSocrates.g:1853:2: ( ( rule__Basicexpression__ExpAssignment_5 ) )
                    {
                    // InternalSocrates.g:1853:2: ( ( rule__Basicexpression__ExpAssignment_5 ) )
                    // InternalSocrates.g:1854:3: ( rule__Basicexpression__ExpAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicexpressionAccess().getExpAssignment_5()); 
                    }
                    // InternalSocrates.g:1855:3: ( rule__Basicexpression__ExpAssignment_5 )
                    // InternalSocrates.g:1855:4: rule__Basicexpression__ExpAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basicexpression__ExpAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicexpressionAccess().getExpAssignment_5()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__Alternatives"


    // $ANTLR start "rule__Basicformulae__Alternatives"
    // InternalSocrates.g:1863:1: rule__Basicformulae__Alternatives : ( ( ( rule__Basicformulae__FAssignment_0 ) ) | ( ( rule__Basicformulae__FAssignment_1 ) ) | ( ( rule__Basicformulae__FAssignment_2 ) ) );
    public final void rule__Basicformulae__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1867:1: ( ( ( rule__Basicformulae__FAssignment_0 ) ) | ( ( rule__Basicformulae__FAssignment_1 ) ) | ( ( rule__Basicformulae__FAssignment_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt14=1;
                }
                break;
            case 25:
                {
                alt14=2;
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSocrates.g:1868:2: ( ( rule__Basicformulae__FAssignment_0 ) )
                    {
                    // InternalSocrates.g:1868:2: ( ( rule__Basicformulae__FAssignment_0 ) )
                    // InternalSocrates.g:1869:3: ( rule__Basicformulae__FAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicformulaeAccess().getFAssignment_0()); 
                    }
                    // InternalSocrates.g:1870:3: ( rule__Basicformulae__FAssignment_0 )
                    // InternalSocrates.g:1870:4: rule__Basicformulae__FAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basicformulae__FAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicformulaeAccess().getFAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1874:2: ( ( rule__Basicformulae__FAssignment_1 ) )
                    {
                    // InternalSocrates.g:1874:2: ( ( rule__Basicformulae__FAssignment_1 ) )
                    // InternalSocrates.g:1875:3: ( rule__Basicformulae__FAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicformulaeAccess().getFAssignment_1()); 
                    }
                    // InternalSocrates.g:1876:3: ( rule__Basicformulae__FAssignment_1 )
                    // InternalSocrates.g:1876:4: rule__Basicformulae__FAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basicformulae__FAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicformulaeAccess().getFAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:1880:2: ( ( rule__Basicformulae__FAssignment_2 ) )
                    {
                    // InternalSocrates.g:1880:2: ( ( rule__Basicformulae__FAssignment_2 ) )
                    // InternalSocrates.g:1881:3: ( rule__Basicformulae__FAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicformulaeAccess().getFAssignment_2()); 
                    }
                    // InternalSocrates.g:1882:3: ( rule__Basicformulae__FAssignment_2 )
                    // InternalSocrates.g:1882:4: rule__Basicformulae__FAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Basicformulae__FAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicformulaeAccess().getFAssignment_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicformulae__Alternatives"


    // $ANTLR start "rule__Boundterm__Alternatives_2"
    // InternalSocrates.g:1890:1: rule__Boundterm__Alternatives_2 : ( ( ( rule__Boundterm__LAssignment_2_0 ) ) | ( ( rule__Boundterm__LAssignment_2_1 ) ) );
    public final void rule__Boundterm__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1894:1: ( ( ( rule__Boundterm__LAssignment_2_0 ) ) | ( ( rule__Boundterm__LAssignment_2_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSocrates.g:1895:2: ( ( rule__Boundterm__LAssignment_2_0 ) )
                    {
                    // InternalSocrates.g:1895:2: ( ( rule__Boundterm__LAssignment_2_0 ) )
                    // InternalSocrates.g:1896:3: ( rule__Boundterm__LAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoundtermAccess().getLAssignment_2_0()); 
                    }
                    // InternalSocrates.g:1897:3: ( rule__Boundterm__LAssignment_2_0 )
                    // InternalSocrates.g:1897:4: rule__Boundterm__LAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boundterm__LAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoundtermAccess().getLAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1901:2: ( ( rule__Boundterm__LAssignment_2_1 ) )
                    {
                    // InternalSocrates.g:1901:2: ( ( rule__Boundterm__LAssignment_2_1 ) )
                    // InternalSocrates.g:1902:3: ( rule__Boundterm__LAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoundtermAccess().getLAssignment_2_1()); 
                    }
                    // InternalSocrates.g:1903:3: ( rule__Boundterm__LAssignment_2_1 )
                    // InternalSocrates.g:1903:4: rule__Boundterm__LAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boundterm__LAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoundtermAccess().getLAssignment_2_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Alternatives_2"


    // $ANTLR start "rule__Boundterm__Alternatives_6"
    // InternalSocrates.g:1911:1: rule__Boundterm__Alternatives_6 : ( ( ( rule__Boundterm__RAssignment_6_0 ) ) | ( ( rule__Boundterm__RAssignment_6_1 ) ) );
    public final void rule__Boundterm__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1915:1: ( ( ( rule__Boundterm__RAssignment_6_0 ) ) | ( ( rule__Boundterm__RAssignment_6_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            else if ( (LA16_0==21) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSocrates.g:1916:2: ( ( rule__Boundterm__RAssignment_6_0 ) )
                    {
                    // InternalSocrates.g:1916:2: ( ( rule__Boundterm__RAssignment_6_0 ) )
                    // InternalSocrates.g:1917:3: ( rule__Boundterm__RAssignment_6_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoundtermAccess().getRAssignment_6_0()); 
                    }
                    // InternalSocrates.g:1918:3: ( rule__Boundterm__RAssignment_6_0 )
                    // InternalSocrates.g:1918:4: rule__Boundterm__RAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boundterm__RAssignment_6_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoundtermAccess().getRAssignment_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1922:2: ( ( rule__Boundterm__RAssignment_6_1 ) )
                    {
                    // InternalSocrates.g:1922:2: ( ( rule__Boundterm__RAssignment_6_1 ) )
                    // InternalSocrates.g:1923:3: ( rule__Boundterm__RAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoundtermAccess().getRAssignment_6_1()); 
                    }
                    // InternalSocrates.g:1924:3: ( rule__Boundterm__RAssignment_6_1 )
                    // InternalSocrates.g:1924:4: rule__Boundterm__RAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boundterm__RAssignment_6_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoundtermAccess().getRAssignment_6_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Alternatives_6"


    // $ANTLR start "rule__Timedterm__Alternatives"
    // InternalSocrates.g:1932:1: rule__Timedterm__Alternatives : ( ( ( rule__Timedterm__InfAssignment_0 ) ) | ( ( rule__Timedterm__NumberAssignment_1 ) ) | ( ( rule__Timedterm__Group_2__0 ) ) );
    public final void rule__Timedterm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1936:1: ( ( ( rule__Timedterm__InfAssignment_0 ) ) | ( ( rule__Timedterm__NumberAssignment_1 ) ) | ( ( rule__Timedterm__Group_2__0 ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
            case RULE_DIGIT:
                {
                alt17=2;
                }
                break;
            case RULE_ID:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSocrates.g:1937:2: ( ( rule__Timedterm__InfAssignment_0 ) )
                    {
                    // InternalSocrates.g:1937:2: ( ( rule__Timedterm__InfAssignment_0 ) )
                    // InternalSocrates.g:1938:3: ( rule__Timedterm__InfAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimedtermAccess().getInfAssignment_0()); 
                    }
                    // InternalSocrates.g:1939:3: ( rule__Timedterm__InfAssignment_0 )
                    // InternalSocrates.g:1939:4: rule__Timedterm__InfAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Timedterm__InfAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimedtermAccess().getInfAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1943:2: ( ( rule__Timedterm__NumberAssignment_1 ) )
                    {
                    // InternalSocrates.g:1943:2: ( ( rule__Timedterm__NumberAssignment_1 ) )
                    // InternalSocrates.g:1944:3: ( rule__Timedterm__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimedtermAccess().getNumberAssignment_1()); 
                    }
                    // InternalSocrates.g:1945:3: ( rule__Timedterm__NumberAssignment_1 )
                    // InternalSocrates.g:1945:4: rule__Timedterm__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Timedterm__NumberAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimedtermAccess().getNumberAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:1949:2: ( ( rule__Timedterm__Group_2__0 ) )
                    {
                    // InternalSocrates.g:1949:2: ( ( rule__Timedterm__Group_2__0 ) )
                    // InternalSocrates.g:1950:3: ( rule__Timedterm__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimedtermAccess().getGroup_2()); 
                    }
                    // InternalSocrates.g:1951:3: ( rule__Timedterm__Group_2__0 )
                    // InternalSocrates.g:1951:4: rule__Timedterm__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Timedterm__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimedtermAccess().getGroup_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Alternatives"


    // $ANTLR start "rule__Timedterm__Alternatives_2_0"
    // InternalSocrates.g:1959:1: rule__Timedterm__Alternatives_2_0 : ( ( ( rule__Timedterm__RefAssignment_2_0_0 ) ) | ( ( rule__Timedterm__RefAssignment_2_0_1 ) ) );
    public final void rule__Timedterm__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1963:1: ( ( ( rule__Timedterm__RefAssignment_2_0_0 ) ) | ( ( rule__Timedterm__RefAssignment_2_0_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred27_InternalSocrates()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSocrates.g:1964:2: ( ( rule__Timedterm__RefAssignment_2_0_0 ) )
                    {
                    // InternalSocrates.g:1964:2: ( ( rule__Timedterm__RefAssignment_2_0_0 ) )
                    // InternalSocrates.g:1965:3: ( rule__Timedterm__RefAssignment_2_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimedtermAccess().getRefAssignment_2_0_0()); 
                    }
                    // InternalSocrates.g:1966:3: ( rule__Timedterm__RefAssignment_2_0_0 )
                    // InternalSocrates.g:1966:4: rule__Timedterm__RefAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Timedterm__RefAssignment_2_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimedtermAccess().getRefAssignment_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1970:2: ( ( rule__Timedterm__RefAssignment_2_0_1 ) )
                    {
                    // InternalSocrates.g:1970:2: ( ( rule__Timedterm__RefAssignment_2_0_1 ) )
                    // InternalSocrates.g:1971:3: ( rule__Timedterm__RefAssignment_2_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimedtermAccess().getRefAssignment_2_0_1()); 
                    }
                    // InternalSocrates.g:1972:3: ( rule__Timedterm__RefAssignment_2_0_1 )
                    // InternalSocrates.g:1972:4: rule__Timedterm__RefAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Timedterm__RefAssignment_2_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimedtermAccess().getRefAssignment_2_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Alternatives_2_0"


    // $ANTLR start "rule__Timedterm__OpAlternatives_2_1_0_0"
    // InternalSocrates.g:1980:1: rule__Timedterm__OpAlternatives_2_1_0_0 : ( ( rulePLUS ) | ( ruleMINUS ) );
    public final void rule__Timedterm__OpAlternatives_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:1984:1: ( ( rulePLUS ) | ( ruleMINUS ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSocrates.g:1985:2: ( rulePLUS )
                    {
                    // InternalSocrates.g:1985:2: ( rulePLUS )
                    // InternalSocrates.g:1986:3: rulePLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimedtermAccess().getOpPLUSParserRuleCall_2_1_0_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePLUS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimedtermAccess().getOpPLUSParserRuleCall_2_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1991:2: ( ruleMINUS )
                    {
                    // InternalSocrates.g:1991:2: ( ruleMINUS )
                    // InternalSocrates.g:1992:3: ruleMINUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimedtermAccess().getOpMINUSParserRuleCall_2_1_0_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMINUS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimedtermAccess().getOpMINUSParserRuleCall_2_1_0_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__OpAlternatives_2_1_0_0"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalSocrates.g:2001:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2005:1: ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            else if ( (LA20_0==50) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSocrates.g:2006:2: ( ( rule__Atom__Group_0__0 ) )
                    {
                    // InternalSocrates.g:2006:2: ( ( rule__Atom__Group_0__0 ) )
                    // InternalSocrates.g:2007:3: ( rule__Atom__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_0()); 
                    }
                    // InternalSocrates.g:2008:3: ( rule__Atom__Group_0__0 )
                    // InternalSocrates.g:2008:4: rule__Atom__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2012:2: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // InternalSocrates.g:2012:2: ( ( rule__Atom__Group_1__0 ) )
                    // InternalSocrates.g:2013:3: ( rule__Atom__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_1()); 
                    }
                    // InternalSocrates.g:2014:3: ( rule__Atom__Group_1__0 )
                    // InternalSocrates.g:2014:4: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalSocrates.g:2022:1: rule__Value__Alternatives : ( ( ( rule__Value__Group_0__0 ) ) | ( ( rule__Value__NumberAssignment_1 ) ) | ( ( rule__Value__RefAssignment_2 ) ) | ( ( rule__Value__FloatAssignment_3 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2026:1: ( ( ( rule__Value__Group_0__0 ) ) | ( ( rule__Value__NumberAssignment_1 ) ) | ( ( rule__Value__RefAssignment_2 ) ) | ( ( rule__Value__FloatAssignment_3 ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt21=1;
                }
                break;
            case RULE_INT:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==57) ) {
                    alt21=4;
                }
                else if ( (LA21_2==EOF||(LA21_2>=13 && LA21_2<=19)||LA21_2==21||LA21_2==23||(LA21_2>=33 && LA21_2<=34)||(LA21_2>=36 && LA21_2<=37)||(LA21_2>=51 && LA21_2<=53)) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DIGIT:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==EOF||(LA21_3>=13 && LA21_3<=19)||LA21_3==21||LA21_3==23||(LA21_3>=33 && LA21_3<=34)||(LA21_3>=36 && LA21_3<=37)||(LA21_3>=51 && LA21_3<=53)) ) {
                    alt21=2;
                }
                else if ( (LA21_3==57) ) {
                    alt21=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSocrates.g:2027:2: ( ( rule__Value__Group_0__0 ) )
                    {
                    // InternalSocrates.g:2027:2: ( ( rule__Value__Group_0__0 ) )
                    // InternalSocrates.g:2028:3: ( rule__Value__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getGroup_0()); 
                    }
                    // InternalSocrates.g:2029:3: ( rule__Value__Group_0__0 )
                    // InternalSocrates.g:2029:4: rule__Value__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2033:2: ( ( rule__Value__NumberAssignment_1 ) )
                    {
                    // InternalSocrates.g:2033:2: ( ( rule__Value__NumberAssignment_1 ) )
                    // InternalSocrates.g:2034:3: ( rule__Value__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNumberAssignment_1()); 
                    }
                    // InternalSocrates.g:2035:3: ( rule__Value__NumberAssignment_1 )
                    // InternalSocrates.g:2035:4: rule__Value__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__NumberAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNumberAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:2039:2: ( ( rule__Value__RefAssignment_2 ) )
                    {
                    // InternalSocrates.g:2039:2: ( ( rule__Value__RefAssignment_2 ) )
                    // InternalSocrates.g:2040:3: ( rule__Value__RefAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getRefAssignment_2()); 
                    }
                    // InternalSocrates.g:2041:3: ( rule__Value__RefAssignment_2 )
                    // InternalSocrates.g:2041:4: rule__Value__RefAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__RefAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getRefAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSocrates.g:2045:2: ( ( rule__Value__FloatAssignment_3 ) )
                    {
                    // InternalSocrates.g:2045:2: ( ( rule__Value__FloatAssignment_3 ) )
                    // InternalSocrates.g:2046:3: ( rule__Value__FloatAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getFloatAssignment_3()); 
                    }
                    // InternalSocrates.g:2047:3: ( rule__Value__FloatAssignment_3 )
                    // InternalSocrates.g:2047:4: rule__Value__FloatAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__FloatAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getFloatAssignment_3()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Signal__Alternatives"
    // InternalSocrates.g:2055:1: rule__Signal__Alternatives : ( ( ( rule__Signal__Group_0__0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2059:1: ( ( ( rule__Signal__Group_0__0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==20) ) {
                    alt22=1;
                }
                else if ( (LA22_1==22) ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==RULE_INT) ) {
                        int LA22_4 = input.LA(4);

                        if ( (LA22_4==23) ) {
                            int LA22_6 = input.LA(5);

                            if ( (LA22_6==22) ) {
                                alt22=3;
                            }
                            else if ( (LA22_6==20) ) {
                                alt22=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA22_3==RULE_DIGIT) ) {
                        int LA22_5 = input.LA(4);

                        if ( (LA22_5==23) ) {
                            int LA22_6 = input.LA(5);

                            if ( (LA22_6==22) ) {
                                alt22=3;
                            }
                            else if ( (LA22_6==20) ) {
                                alt22=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSocrates.g:2060:2: ( ( rule__Signal__Group_0__0 ) )
                    {
                    // InternalSocrates.g:2060:2: ( ( rule__Signal__Group_0__0 ) )
                    // InternalSocrates.g:2061:3: ( rule__Signal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSignalAccess().getGroup_0()); 
                    }
                    // InternalSocrates.g:2062:3: ( rule__Signal__Group_0__0 )
                    // InternalSocrates.g:2062:4: rule__Signal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signal__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSignalAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2066:2: ( ( rule__Signal__Group_1__0 ) )
                    {
                    // InternalSocrates.g:2066:2: ( ( rule__Signal__Group_1__0 ) )
                    // InternalSocrates.g:2067:3: ( rule__Signal__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSignalAccess().getGroup_1()); 
                    }
                    // InternalSocrates.g:2068:3: ( rule__Signal__Group_1__0 )
                    // InternalSocrates.g:2068:4: rule__Signal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signal__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSignalAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:2072:2: ( ( rule__Signal__Group_2__0 ) )
                    {
                    // InternalSocrates.g:2072:2: ( ( rule__Signal__Group_2__0 ) )
                    // InternalSocrates.g:2073:3: ( rule__Signal__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSignalAccess().getGroup_2()); 
                    }
                    // InternalSocrates.g:2074:3: ( rule__Signal__Group_2__0 )
                    // InternalSocrates.g:2074:4: rule__Signal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signal__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSignalAccess().getGroup_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Alternatives"


    // $ANTLR start "rule__PATH__Alternatives_0"
    // InternalSocrates.g:2082:1: rule__PATH__Alternatives_0 : ( ( ( '../' )* ) | ( './' ) );
    public final void rule__PATH__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2086:1: ( ( ( '../' )* ) | ( './' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==EOF||LA24_0==RULE_ID||LA24_0==38||LA24_0==42) ) {
                alt24=1;
            }
            else if ( (LA24_0==39) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSocrates.g:2087:2: ( ( '../' )* )
                    {
                    // InternalSocrates.g:2087:2: ( ( '../' )* )
                    // InternalSocrates.g:2088:3: ( '../' )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPATHAccess().getFullStopFullStopSolidusKeyword_0_0()); 
                    }
                    // InternalSocrates.g:2089:3: ( '../' )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==38) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSocrates.g:2089:4: '../'
                    	    {
                    	    match(input,38,FOLLOW_4); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPATHAccess().getFullStopFullStopSolidusKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2093:2: ( './' )
                    {
                    // InternalSocrates.g:2093:2: ( './' )
                    // InternalSocrates.g:2094:3: './'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPATHAccess().getFullStopSolidusKeyword_0_1()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPATHAccess().getFullStopSolidusKeyword_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PATH__Alternatives_0"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalSocrates.g:2103:1: rule__Number__Alternatives : ( ( RULE_INT ) | ( RULE_DIGIT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2107:1: ( ( RULE_INT ) | ( RULE_DIGIT ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_DIGIT) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSocrates.g:2108:2: ( RULE_INT )
                    {
                    // InternalSocrates.g:2108:2: ( RULE_INT )
                    // InternalSocrates.g:2109:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2114:2: ( RULE_DIGIT )
                    {
                    // InternalSocrates.g:2114:2: ( RULE_DIGIT )
                    // InternalSocrates.g:2115:3: RULE_DIGIT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberAccess().getDIGITTerminalRuleCall_1()); 
                    }
                    match(input,RULE_DIGIT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumberAccess().getDIGITTerminalRuleCall_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__RELOP__Alternatives"
    // InternalSocrates.g:2124:1: rule__RELOP__Alternatives : ( ( ruleGE ) | ( ruleLE ) | ( ruleEQ ) | ( ruleLEQ ) | ( ruleGEQ ) | ( ruleNEQ ) );
    public final void rule__RELOP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2128:1: ( ( ruleGE ) | ( ruleLE ) | ( ruleEQ ) | ( ruleLEQ ) | ( ruleGEQ ) | ( ruleNEQ ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt26=1;
                }
                break;
            case 14:
                {
                alt26=2;
                }
                break;
            case 18:
                {
                alt26=3;
                }
                break;
            case 15:
                {
                alt26=4;
                }
                break;
            case 17:
                {
                alt26=5;
                }
                break;
            case 19:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSocrates.g:2129:2: ( ruleGE )
                    {
                    // InternalSocrates.g:2129:2: ( ruleGE )
                    // InternalSocrates.g:2130:3: ruleGE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRELOPAccess().getGEParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRELOPAccess().getGEParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2135:2: ( ruleLE )
                    {
                    // InternalSocrates.g:2135:2: ( ruleLE )
                    // InternalSocrates.g:2136:3: ruleLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRELOPAccess().getLEParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRELOPAccess().getLEParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:2141:2: ( ruleEQ )
                    {
                    // InternalSocrates.g:2141:2: ( ruleEQ )
                    // InternalSocrates.g:2142:3: ruleEQ
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRELOPAccess().getEQParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEQ();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRELOPAccess().getEQParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSocrates.g:2147:2: ( ruleLEQ )
                    {
                    // InternalSocrates.g:2147:2: ( ruleLEQ )
                    // InternalSocrates.g:2148:3: ruleLEQ
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRELOPAccess().getLEQParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLEQ();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRELOPAccess().getLEQParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSocrates.g:2153:2: ( ruleGEQ )
                    {
                    // InternalSocrates.g:2153:2: ( ruleGEQ )
                    // InternalSocrates.g:2154:3: ruleGEQ
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRELOPAccess().getGEQParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGEQ();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRELOPAccess().getGEQParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSocrates.g:2159:2: ( ruleNEQ )
                    {
                    // InternalSocrates.g:2159:2: ( ruleNEQ )
                    // InternalSocrates.g:2160:3: ruleNEQ
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRELOPAccess().getNEQParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNEQ();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRELOPAccess().getNEQParserRuleCall_5()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RELOP__Alternatives"


    // $ANTLR start "rule__SIGN__Alternatives"
    // InternalSocrates.g:2169:1: rule__SIGN__Alternatives : ( ( rulePLUS ) | ( ruleMINUS ) );
    public final void rule__SIGN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2173:1: ( ( rulePLUS ) | ( ruleMINUS ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            else if ( (LA27_0==34) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSocrates.g:2174:2: ( rulePLUS )
                    {
                    // InternalSocrates.g:2174:2: ( rulePLUS )
                    // InternalSocrates.g:2175:3: rulePLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSIGNAccess().getPLUSParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePLUS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSIGNAccess().getPLUSParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2180:2: ( ruleMINUS )
                    {
                    // InternalSocrates.g:2180:2: ( ruleMINUS )
                    // InternalSocrates.g:2181:3: ruleMINUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSIGNAccess().getMINUSParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMINUS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSIGNAccess().getMINUSParserRuleCall_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGN__Alternatives"


    // $ANTLR start "rule__Oracle__Group__0"
    // InternalSocrates.g:2190:1: rule__Oracle__Group__0 : rule__Oracle__Group__0__Impl rule__Oracle__Group__1 ;
    public final void rule__Oracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2194:1: ( rule__Oracle__Group__0__Impl rule__Oracle__Group__1 )
            // InternalSocrates.g:2195:2: rule__Oracle__Group__0__Impl rule__Oracle__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Oracle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__0"


    // $ANTLR start "rule__Oracle__Group__0__Impl"
    // InternalSocrates.g:2202:1: rule__Oracle__Group__0__Impl : ( 'Oracle' ) ;
    public final void rule__Oracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2206:1: ( ( 'Oracle' ) )
            // InternalSocrates.g:2207:1: ( 'Oracle' )
            {
            // InternalSocrates.g:2207:1: ( 'Oracle' )
            // InternalSocrates.g:2208:2: 'Oracle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getOracleKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getOracleKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__0__Impl"


    // $ANTLR start "rule__Oracle__Group__1"
    // InternalSocrates.g:2217:1: rule__Oracle__Group__1 : rule__Oracle__Group__1__Impl rule__Oracle__Group__2 ;
    public final void rule__Oracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2221:1: ( rule__Oracle__Group__1__Impl rule__Oracle__Group__2 )
            // InternalSocrates.g:2222:2: rule__Oracle__Group__1__Impl rule__Oracle__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Oracle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__1"


    // $ANTLR start "rule__Oracle__Group__1__Impl"
    // InternalSocrates.g:2229:1: rule__Oracle__Group__1__Impl : ( 'ModelName:' ) ;
    public final void rule__Oracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2233:1: ( ( 'ModelName:' ) )
            // InternalSocrates.g:2234:1: ( 'ModelName:' )
            {
            // InternalSocrates.g:2234:1: ( 'ModelName:' )
            // InternalSocrates.g:2235:2: 'ModelName:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getModelNameKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getModelNameKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__1__Impl"


    // $ANTLR start "rule__Oracle__Group__2"
    // InternalSocrates.g:2244:1: rule__Oracle__Group__2 : rule__Oracle__Group__2__Impl rule__Oracle__Group__3 ;
    public final void rule__Oracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2248:1: ( rule__Oracle__Group__2__Impl rule__Oracle__Group__3 )
            // InternalSocrates.g:2249:2: rule__Oracle__Group__2__Impl rule__Oracle__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Oracle__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__2"


    // $ANTLR start "rule__Oracle__Group__2__Impl"
    // InternalSocrates.g:2256:1: rule__Oracle__Group__2__Impl : ( ( rule__Oracle__ModelNameAssignment_2 ) ) ;
    public final void rule__Oracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2260:1: ( ( ( rule__Oracle__ModelNameAssignment_2 ) ) )
            // InternalSocrates.g:2261:1: ( ( rule__Oracle__ModelNameAssignment_2 ) )
            {
            // InternalSocrates.g:2261:1: ( ( rule__Oracle__ModelNameAssignment_2 ) )
            // InternalSocrates.g:2262:2: ( rule__Oracle__ModelNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getModelNameAssignment_2()); 
            }
            // InternalSocrates.g:2263:2: ( rule__Oracle__ModelNameAssignment_2 )
            // InternalSocrates.g:2263:3: rule__Oracle__ModelNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__ModelNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getModelNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__2__Impl"


    // $ANTLR start "rule__Oracle__Group__3"
    // InternalSocrates.g:2271:1: rule__Oracle__Group__3 : rule__Oracle__Group__3__Impl rule__Oracle__Group__4 ;
    public final void rule__Oracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2275:1: ( rule__Oracle__Group__3__Impl rule__Oracle__Group__4 )
            // InternalSocrates.g:2276:2: rule__Oracle__Group__3__Impl rule__Oracle__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Oracle__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__3"


    // $ANTLR start "rule__Oracle__Group__3__Impl"
    // InternalSocrates.g:2283:1: rule__Oracle__Group__3__Impl : ( ';' ) ;
    public final void rule__Oracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2287:1: ( ( ';' ) )
            // InternalSocrates.g:2288:1: ( ';' )
            {
            // InternalSocrates.g:2288:1: ( ';' )
            // InternalSocrates.g:2289:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getSemicolonKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__3__Impl"


    // $ANTLR start "rule__Oracle__Group__4"
    // InternalSocrates.g:2298:1: rule__Oracle__Group__4 : rule__Oracle__Group__4__Impl rule__Oracle__Group__5 ;
    public final void rule__Oracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2302:1: ( rule__Oracle__Group__4__Impl rule__Oracle__Group__5 )
            // InternalSocrates.g:2303:2: rule__Oracle__Group__4__Impl rule__Oracle__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Oracle__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__4"


    // $ANTLR start "rule__Oracle__Group__4__Impl"
    // InternalSocrates.g:2310:1: rule__Oracle__Group__4__Impl : ( ( rule__Oracle__Group_4__0 )? ) ;
    public final void rule__Oracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2314:1: ( ( ( rule__Oracle__Group_4__0 )? ) )
            // InternalSocrates.g:2315:1: ( ( rule__Oracle__Group_4__0 )? )
            {
            // InternalSocrates.g:2315:1: ( ( rule__Oracle__Group_4__0 )? )
            // InternalSocrates.g:2316:2: ( rule__Oracle__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getGroup_4()); 
            }
            // InternalSocrates.g:2317:2: ( rule__Oracle__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSocrates.g:2317:3: rule__Oracle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oracle__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__4__Impl"


    // $ANTLR start "rule__Oracle__Group__5"
    // InternalSocrates.g:2325:1: rule__Oracle__Group__5 : rule__Oracle__Group__5__Impl rule__Oracle__Group__6 ;
    public final void rule__Oracle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2329:1: ( rule__Oracle__Group__5__Impl rule__Oracle__Group__6 )
            // InternalSocrates.g:2330:2: rule__Oracle__Group__5__Impl rule__Oracle__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Oracle__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__5"


    // $ANTLR start "rule__Oracle__Group__5__Impl"
    // InternalSocrates.g:2337:1: rule__Oracle__Group__5__Impl : ( 'ID:' ) ;
    public final void rule__Oracle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2341:1: ( ( 'ID:' ) )
            // InternalSocrates.g:2342:1: ( 'ID:' )
            {
            // InternalSocrates.g:2342:1: ( 'ID:' )
            // InternalSocrates.g:2343:2: 'ID:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getIDKeyword_5()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getIDKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__5__Impl"


    // $ANTLR start "rule__Oracle__Group__6"
    // InternalSocrates.g:2352:1: rule__Oracle__Group__6 : rule__Oracle__Group__6__Impl rule__Oracle__Group__7 ;
    public final void rule__Oracle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2356:1: ( rule__Oracle__Group__6__Impl rule__Oracle__Group__7 )
            // InternalSocrates.g:2357:2: rule__Oracle__Group__6__Impl rule__Oracle__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Oracle__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__6"


    // $ANTLR start "rule__Oracle__Group__6__Impl"
    // InternalSocrates.g:2364:1: rule__Oracle__Group__6__Impl : ( ( rule__Oracle__ReqnameAssignment_6 ) ) ;
    public final void rule__Oracle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2368:1: ( ( ( rule__Oracle__ReqnameAssignment_6 ) ) )
            // InternalSocrates.g:2369:1: ( ( rule__Oracle__ReqnameAssignment_6 ) )
            {
            // InternalSocrates.g:2369:1: ( ( rule__Oracle__ReqnameAssignment_6 ) )
            // InternalSocrates.g:2370:2: ( rule__Oracle__ReqnameAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getReqnameAssignment_6()); 
            }
            // InternalSocrates.g:2371:2: ( rule__Oracle__ReqnameAssignment_6 )
            // InternalSocrates.g:2371:3: rule__Oracle__ReqnameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__ReqnameAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getReqnameAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__6__Impl"


    // $ANTLR start "rule__Oracle__Group__7"
    // InternalSocrates.g:2379:1: rule__Oracle__Group__7 : rule__Oracle__Group__7__Impl rule__Oracle__Group__8 ;
    public final void rule__Oracle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2383:1: ( rule__Oracle__Group__7__Impl rule__Oracle__Group__8 )
            // InternalSocrates.g:2384:2: rule__Oracle__Group__7__Impl rule__Oracle__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Oracle__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__7"


    // $ANTLR start "rule__Oracle__Group__7__Impl"
    // InternalSocrates.g:2391:1: rule__Oracle__Group__7__Impl : ( ';' ) ;
    public final void rule__Oracle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2395:1: ( ( ';' ) )
            // InternalSocrates.g:2396:1: ( ';' )
            {
            // InternalSocrates.g:2396:1: ( ';' )
            // InternalSocrates.g:2397:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getSemicolonKeyword_7()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__7__Impl"


    // $ANTLR start "rule__Oracle__Group__8"
    // InternalSocrates.g:2406:1: rule__Oracle__Group__8 : rule__Oracle__Group__8__Impl rule__Oracle__Group__9 ;
    public final void rule__Oracle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2410:1: ( rule__Oracle__Group__8__Impl rule__Oracle__Group__9 )
            // InternalSocrates.g:2411:2: rule__Oracle__Group__8__Impl rule__Oracle__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Oracle__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__8"


    // $ANTLR start "rule__Oracle__Group__8__Impl"
    // InternalSocrates.g:2418:1: rule__Oracle__Group__8__Impl : ( ( rule__Oracle__SigndefAssignment_8 ) ) ;
    public final void rule__Oracle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2422:1: ( ( ( rule__Oracle__SigndefAssignment_8 ) ) )
            // InternalSocrates.g:2423:1: ( ( rule__Oracle__SigndefAssignment_8 ) )
            {
            // InternalSocrates.g:2423:1: ( ( rule__Oracle__SigndefAssignment_8 ) )
            // InternalSocrates.g:2424:2: ( rule__Oracle__SigndefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getSigndefAssignment_8()); 
            }
            // InternalSocrates.g:2425:2: ( rule__Oracle__SigndefAssignment_8 )
            // InternalSocrates.g:2425:3: rule__Oracle__SigndefAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__SigndefAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getSigndefAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__8__Impl"


    // $ANTLR start "rule__Oracle__Group__9"
    // InternalSocrates.g:2433:1: rule__Oracle__Group__9 : rule__Oracle__Group__9__Impl rule__Oracle__Group__10 ;
    public final void rule__Oracle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2437:1: ( rule__Oracle__Group__9__Impl rule__Oracle__Group__10 )
            // InternalSocrates.g:2438:2: rule__Oracle__Group__9__Impl rule__Oracle__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Oracle__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__9"


    // $ANTLR start "rule__Oracle__Group__9__Impl"
    // InternalSocrates.g:2445:1: rule__Oracle__Group__9__Impl : ( ( rule__Oracle__ConstantDefinitionsAssignment_9 )? ) ;
    public final void rule__Oracle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2449:1: ( ( ( rule__Oracle__ConstantDefinitionsAssignment_9 )? ) )
            // InternalSocrates.g:2450:1: ( ( rule__Oracle__ConstantDefinitionsAssignment_9 )? )
            {
            // InternalSocrates.g:2450:1: ( ( rule__Oracle__ConstantDefinitionsAssignment_9 )? )
            // InternalSocrates.g:2451:2: ( rule__Oracle__ConstantDefinitionsAssignment_9 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getConstantDefinitionsAssignment_9()); 
            }
            // InternalSocrates.g:2452:2: ( rule__Oracle__ConstantDefinitionsAssignment_9 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSocrates.g:2452:3: rule__Oracle__ConstantDefinitionsAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oracle__ConstantDefinitionsAssignment_9();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getConstantDefinitionsAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__9__Impl"


    // $ANTLR start "rule__Oracle__Group__10"
    // InternalSocrates.g:2460:1: rule__Oracle__Group__10 : rule__Oracle__Group__10__Impl ;
    public final void rule__Oracle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2464:1: ( rule__Oracle__Group__10__Impl )
            // InternalSocrates.g:2465:2: rule__Oracle__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__10"


    // $ANTLR start "rule__Oracle__Group__10__Impl"
    // InternalSocrates.g:2471:1: rule__Oracle__Group__10__Impl : ( ( rule__Oracle__RequirementAssignment_10 ) ) ;
    public final void rule__Oracle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2475:1: ( ( ( rule__Oracle__RequirementAssignment_10 ) ) )
            // InternalSocrates.g:2476:1: ( ( rule__Oracle__RequirementAssignment_10 ) )
            {
            // InternalSocrates.g:2476:1: ( ( rule__Oracle__RequirementAssignment_10 ) )
            // InternalSocrates.g:2477:2: ( rule__Oracle__RequirementAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getRequirementAssignment_10()); 
            }
            // InternalSocrates.g:2478:2: ( rule__Oracle__RequirementAssignment_10 )
            // InternalSocrates.g:2478:3: rule__Oracle__RequirementAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__RequirementAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getRequirementAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__10__Impl"


    // $ANTLR start "rule__Oracle__Group_4__0"
    // InternalSocrates.g:2487:1: rule__Oracle__Group_4__0 : rule__Oracle__Group_4__0__Impl rule__Oracle__Group_4__1 ;
    public final void rule__Oracle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2491:1: ( rule__Oracle__Group_4__0__Impl rule__Oracle__Group_4__1 )
            // InternalSocrates.g:2492:2: rule__Oracle__Group_4__0__Impl rule__Oracle__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Oracle__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group_4__0"


    // $ANTLR start "rule__Oracle__Group_4__0__Impl"
    // InternalSocrates.g:2499:1: rule__Oracle__Group_4__0__Impl : ( 'Path:' ) ;
    public final void rule__Oracle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2503:1: ( ( 'Path:' ) )
            // InternalSocrates.g:2504:1: ( 'Path:' )
            {
            // InternalSocrates.g:2504:1: ( 'Path:' )
            // InternalSocrates.g:2505:2: 'Path:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getPathKeyword_4_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getPathKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group_4__0__Impl"


    // $ANTLR start "rule__Oracle__Group_4__1"
    // InternalSocrates.g:2514:1: rule__Oracle__Group_4__1 : rule__Oracle__Group_4__1__Impl rule__Oracle__Group_4__2 ;
    public final void rule__Oracle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2518:1: ( rule__Oracle__Group_4__1__Impl rule__Oracle__Group_4__2 )
            // InternalSocrates.g:2519:2: rule__Oracle__Group_4__1__Impl rule__Oracle__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Oracle__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oracle__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group_4__1"


    // $ANTLR start "rule__Oracle__Group_4__1__Impl"
    // InternalSocrates.g:2526:1: rule__Oracle__Group_4__1__Impl : ( ( rule__Oracle__PathAssignment_4_1 ) ) ;
    public final void rule__Oracle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2530:1: ( ( ( rule__Oracle__PathAssignment_4_1 ) ) )
            // InternalSocrates.g:2531:1: ( ( rule__Oracle__PathAssignment_4_1 ) )
            {
            // InternalSocrates.g:2531:1: ( ( rule__Oracle__PathAssignment_4_1 ) )
            // InternalSocrates.g:2532:2: ( rule__Oracle__PathAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getPathAssignment_4_1()); 
            }
            // InternalSocrates.g:2533:2: ( rule__Oracle__PathAssignment_4_1 )
            // InternalSocrates.g:2533:3: rule__Oracle__PathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__PathAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getPathAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group_4__1__Impl"


    // $ANTLR start "rule__Oracle__Group_4__2"
    // InternalSocrates.g:2541:1: rule__Oracle__Group_4__2 : rule__Oracle__Group_4__2__Impl ;
    public final void rule__Oracle__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2545:1: ( rule__Oracle__Group_4__2__Impl )
            // InternalSocrates.g:2546:2: rule__Oracle__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group_4__2"


    // $ANTLR start "rule__Oracle__Group_4__2__Impl"
    // InternalSocrates.g:2552:1: rule__Oracle__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Oracle__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2556:1: ( ( ';' ) )
            // InternalSocrates.g:2557:1: ( ';' )
            {
            // InternalSocrates.g:2557:1: ( ';' )
            // InternalSocrates.g:2558:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getSemicolonKeyword_4_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getSemicolonKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group_4__2__Impl"


    // $ANTLR start "rule__Requirement__Group__0"
    // InternalSocrates.g:2568:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2572:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // InternalSocrates.g:2573:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Requirement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0"


    // $ANTLR start "rule__Requirement__Group__0__Impl"
    // InternalSocrates.g:2580:1: rule__Requirement__Group__0__Impl : ( 'Description:' ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2584:1: ( ( 'Description:' ) )
            // InternalSocrates.g:2585:1: ( 'Description:' )
            {
            // InternalSocrates.g:2585:1: ( 'Description:' )
            // InternalSocrates.g:2586:2: 'Description:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getDescriptionKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getDescriptionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0__Impl"


    // $ANTLR start "rule__Requirement__Group__1"
    // InternalSocrates.g:2595:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2599:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // InternalSocrates.g:2600:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Requirement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1"


    // $ANTLR start "rule__Requirement__Group__1__Impl"
    // InternalSocrates.g:2607:1: rule__Requirement__Group__1__Impl : ( RULE_DESCRIPTION ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2611:1: ( ( RULE_DESCRIPTION ) )
            // InternalSocrates.g:2612:1: ( RULE_DESCRIPTION )
            {
            // InternalSocrates.g:2612:1: ( RULE_DESCRIPTION )
            // InternalSocrates.g:2613:2: RULE_DESCRIPTION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getDESCRIPTIONTerminalRuleCall_1()); 
            }
            match(input,RULE_DESCRIPTION,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getDESCRIPTIONTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1__Impl"


    // $ANTLR start "rule__Requirement__Group__2"
    // InternalSocrates.g:2622:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl rule__Requirement__Group__3 ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2626:1: ( rule__Requirement__Group__2__Impl rule__Requirement__Group__3 )
            // InternalSocrates.g:2627:2: rule__Requirement__Group__2__Impl rule__Requirement__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Requirement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2"


    // $ANTLR start "rule__Requirement__Group__2__Impl"
    // InternalSocrates.g:2634:1: rule__Requirement__Group__2__Impl : ( ';' ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2638:1: ( ( ';' ) )
            // InternalSocrates.g:2639:1: ( ';' )
            {
            // InternalSocrates.g:2639:1: ( ';' )
            // InternalSocrates.g:2640:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getSemicolonKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2__Impl"


    // $ANTLR start "rule__Requirement__Group__3"
    // InternalSocrates.g:2649:1: rule__Requirement__Group__3 : rule__Requirement__Group__3__Impl rule__Requirement__Group__4 ;
    public final void rule__Requirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2653:1: ( rule__Requirement__Group__3__Impl rule__Requirement__Group__4 )
            // InternalSocrates.g:2654:2: rule__Requirement__Group__3__Impl rule__Requirement__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Requirement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__3"


    // $ANTLR start "rule__Requirement__Group__3__Impl"
    // InternalSocrates.g:2661:1: rule__Requirement__Group__3__Impl : ( 'Specification:' ) ;
    public final void rule__Requirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2665:1: ( ( 'Specification:' ) )
            // InternalSocrates.g:2666:1: ( 'Specification:' )
            {
            // InternalSocrates.g:2666:1: ( 'Specification:' )
            // InternalSocrates.g:2667:2: 'Specification:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getSpecificationKeyword_3()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getSpecificationKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__3__Impl"


    // $ANTLR start "rule__Requirement__Group__4"
    // InternalSocrates.g:2676:1: rule__Requirement__Group__4 : rule__Requirement__Group__4__Impl rule__Requirement__Group__5 ;
    public final void rule__Requirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2680:1: ( rule__Requirement__Group__4__Impl rule__Requirement__Group__5 )
            // InternalSocrates.g:2681:2: rule__Requirement__Group__4__Impl rule__Requirement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Requirement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__4"


    // $ANTLR start "rule__Requirement__Group__4__Impl"
    // InternalSocrates.g:2688:1: rule__Requirement__Group__4__Impl : ( ( rule__Requirement__FormulaAssignment_4 ) ) ;
    public final void rule__Requirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2692:1: ( ( ( rule__Requirement__FormulaAssignment_4 ) ) )
            // InternalSocrates.g:2693:1: ( ( rule__Requirement__FormulaAssignment_4 ) )
            {
            // InternalSocrates.g:2693:1: ( ( rule__Requirement__FormulaAssignment_4 ) )
            // InternalSocrates.g:2694:2: ( rule__Requirement__FormulaAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getFormulaAssignment_4()); 
            }
            // InternalSocrates.g:2695:2: ( rule__Requirement__FormulaAssignment_4 )
            // InternalSocrates.g:2695:3: rule__Requirement__FormulaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__FormulaAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getFormulaAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__4__Impl"


    // $ANTLR start "rule__Requirement__Group__5"
    // InternalSocrates.g:2703:1: rule__Requirement__Group__5 : rule__Requirement__Group__5__Impl ;
    public final void rule__Requirement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2707:1: ( rule__Requirement__Group__5__Impl )
            // InternalSocrates.g:2708:2: rule__Requirement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__5"


    // $ANTLR start "rule__Requirement__Group__5__Impl"
    // InternalSocrates.g:2714:1: rule__Requirement__Group__5__Impl : ( ';' ) ;
    public final void rule__Requirement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2718:1: ( ( ';' ) )
            // InternalSocrates.g:2719:1: ( ';' )
            {
            // InternalSocrates.g:2719:1: ( ';' )
            // InternalSocrates.g:2720:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getSemicolonKeyword_5()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__5__Impl"


    // $ANTLR start "rule__ReqId__Group__0"
    // InternalSocrates.g:2730:1: rule__ReqId__Group__0 : rule__ReqId__Group__0__Impl rule__ReqId__Group__1 ;
    public final void rule__ReqId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2734:1: ( rule__ReqId__Group__0__Impl rule__ReqId__Group__1 )
            // InternalSocrates.g:2735:2: rule__ReqId__Group__0__Impl rule__ReqId__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ReqId__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReqId__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group__0"


    // $ANTLR start "rule__ReqId__Group__0__Impl"
    // InternalSocrates.g:2742:1: rule__ReqId__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ReqId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2746:1: ( ( RULE_ID ) )
            // InternalSocrates.g:2747:1: ( RULE_ID )
            {
            // InternalSocrates.g:2747:1: ( RULE_ID )
            // InternalSocrates.g:2748:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReqIdAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReqIdAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group__0__Impl"


    // $ANTLR start "rule__ReqId__Group__1"
    // InternalSocrates.g:2757:1: rule__ReqId__Group__1 : rule__ReqId__Group__1__Impl ;
    public final void rule__ReqId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2761:1: ( rule__ReqId__Group__1__Impl )
            // InternalSocrates.g:2762:2: rule__ReqId__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReqId__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group__1"


    // $ANTLR start "rule__ReqId__Group__1__Impl"
    // InternalSocrates.g:2768:1: rule__ReqId__Group__1__Impl : ( ( rule__ReqId__Group_1__0 )? ) ;
    public final void rule__ReqId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2772:1: ( ( ( rule__ReqId__Group_1__0 )? ) )
            // InternalSocrates.g:2773:1: ( ( rule__ReqId__Group_1__0 )? )
            {
            // InternalSocrates.g:2773:1: ( ( rule__ReqId__Group_1__0 )? )
            // InternalSocrates.g:2774:2: ( rule__ReqId__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReqIdAccess().getGroup_1()); 
            }
            // InternalSocrates.g:2775:2: ( rule__ReqId__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSocrates.g:2775:3: rule__ReqId__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReqId__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReqIdAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group__1__Impl"


    // $ANTLR start "rule__ReqId__Group_1__0"
    // InternalSocrates.g:2784:1: rule__ReqId__Group_1__0 : rule__ReqId__Group_1__0__Impl rule__ReqId__Group_1__1 ;
    public final void rule__ReqId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2788:1: ( rule__ReqId__Group_1__0__Impl rule__ReqId__Group_1__1 )
            // InternalSocrates.g:2789:2: rule__ReqId__Group_1__0__Impl rule__ReqId__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ReqId__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReqId__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1__0"


    // $ANTLR start "rule__ReqId__Group_1__0__Impl"
    // InternalSocrates.g:2796:1: rule__ReqId__Group_1__0__Impl : ( '_' ) ;
    public final void rule__ReqId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2800:1: ( ( '_' ) )
            // InternalSocrates.g:2801:1: ( '_' )
            {
            // InternalSocrates.g:2801:1: ( '_' )
            // InternalSocrates.g:2802:2: '_'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReqIdAccess().get_Keyword_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReqIdAccess().get_Keyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1__0__Impl"


    // $ANTLR start "rule__ReqId__Group_1__1"
    // InternalSocrates.g:2811:1: rule__ReqId__Group_1__1 : rule__ReqId__Group_1__1__Impl rule__ReqId__Group_1__2 ;
    public final void rule__ReqId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2815:1: ( rule__ReqId__Group_1__1__Impl rule__ReqId__Group_1__2 )
            // InternalSocrates.g:2816:2: rule__ReqId__Group_1__1__Impl rule__ReqId__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__ReqId__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReqId__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1__1"


    // $ANTLR start "rule__ReqId__Group_1__1__Impl"
    // InternalSocrates.g:2823:1: rule__ReqId__Group_1__1__Impl : ( rulenumber ) ;
    public final void rule__ReqId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2827:1: ( ( rulenumber ) )
            // InternalSocrates.g:2828:1: ( rulenumber )
            {
            // InternalSocrates.g:2828:1: ( rulenumber )
            // InternalSocrates.g:2829:2: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReqIdAccess().getNumberParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReqIdAccess().getNumberParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1__1__Impl"


    // $ANTLR start "rule__ReqId__Group_1__2"
    // InternalSocrates.g:2838:1: rule__ReqId__Group_1__2 : rule__ReqId__Group_1__2__Impl ;
    public final void rule__ReqId__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2842:1: ( rule__ReqId__Group_1__2__Impl )
            // InternalSocrates.g:2843:2: rule__ReqId__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReqId__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1__2"


    // $ANTLR start "rule__ReqId__Group_1__2__Impl"
    // InternalSocrates.g:2849:1: rule__ReqId__Group_1__2__Impl : ( ( rule__ReqId__Group_1_2__0 )* ) ;
    public final void rule__ReqId__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2853:1: ( ( ( rule__ReqId__Group_1_2__0 )* ) )
            // InternalSocrates.g:2854:1: ( ( rule__ReqId__Group_1_2__0 )* )
            {
            // InternalSocrates.g:2854:1: ( ( rule__ReqId__Group_1_2__0 )* )
            // InternalSocrates.g:2855:2: ( rule__ReqId__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReqIdAccess().getGroup_1_2()); 
            }
            // InternalSocrates.g:2856:2: ( rule__ReqId__Group_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSocrates.g:2856:3: rule__ReqId__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ReqId__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReqIdAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1__2__Impl"


    // $ANTLR start "rule__ReqId__Group_1_2__0"
    // InternalSocrates.g:2865:1: rule__ReqId__Group_1_2__0 : rule__ReqId__Group_1_2__0__Impl rule__ReqId__Group_1_2__1 ;
    public final void rule__ReqId__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2869:1: ( rule__ReqId__Group_1_2__0__Impl rule__ReqId__Group_1_2__1 )
            // InternalSocrates.g:2870:2: rule__ReqId__Group_1_2__0__Impl rule__ReqId__Group_1_2__1
            {
            pushFollow(FOLLOW_16);
            rule__ReqId__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReqId__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1_2__0"


    // $ANTLR start "rule__ReqId__Group_1_2__0__Impl"
    // InternalSocrates.g:2877:1: rule__ReqId__Group_1_2__0__Impl : ( '_' ) ;
    public final void rule__ReqId__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2881:1: ( ( '_' ) )
            // InternalSocrates.g:2882:1: ( '_' )
            {
            // InternalSocrates.g:2882:1: ( '_' )
            // InternalSocrates.g:2883:2: '_'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReqIdAccess().get_Keyword_1_2_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReqIdAccess().get_Keyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1_2__0__Impl"


    // $ANTLR start "rule__ReqId__Group_1_2__1"
    // InternalSocrates.g:2892:1: rule__ReqId__Group_1_2__1 : rule__ReqId__Group_1_2__1__Impl ;
    public final void rule__ReqId__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2896:1: ( rule__ReqId__Group_1_2__1__Impl )
            // InternalSocrates.g:2897:2: rule__ReqId__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReqId__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1_2__1"


    // $ANTLR start "rule__ReqId__Group_1_2__1__Impl"
    // InternalSocrates.g:2903:1: rule__ReqId__Group_1_2__1__Impl : ( rulenumber ) ;
    public final void rule__ReqId__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2907:1: ( ( rulenumber ) )
            // InternalSocrates.g:2908:1: ( rulenumber )
            {
            // InternalSocrates.g:2908:1: ( rulenumber )
            // InternalSocrates.g:2909:2: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReqIdAccess().getNumberParserRuleCall_1_2_1()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReqIdAccess().getNumberParserRuleCall_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqId__Group_1_2__1__Impl"


    // $ANTLR start "rule__Signalsdefinition__Group__0"
    // InternalSocrates.g:2919:1: rule__Signalsdefinition__Group__0 : rule__Signalsdefinition__Group__0__Impl rule__Signalsdefinition__Group__1 ;
    public final void rule__Signalsdefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2923:1: ( rule__Signalsdefinition__Group__0__Impl rule__Signalsdefinition__Group__1 )
            // InternalSocrates.g:2924:2: rule__Signalsdefinition__Group__0__Impl rule__Signalsdefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Signalsdefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signalsdefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group__0"


    // $ANTLR start "rule__Signalsdefinition__Group__0__Impl"
    // InternalSocrates.g:2931:1: rule__Signalsdefinition__Group__0__Impl : ( 'Signals' ) ;
    public final void rule__Signalsdefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2935:1: ( ( 'Signals' ) )
            // InternalSocrates.g:2936:1: ( 'Signals' )
            {
            // InternalSocrates.g:2936:1: ( 'Signals' )
            // InternalSocrates.g:2937:2: 'Signals'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionAccess().getSignalsKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionAccess().getSignalsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group__0__Impl"


    // $ANTLR start "rule__Signalsdefinition__Group__1"
    // InternalSocrates.g:2946:1: rule__Signalsdefinition__Group__1 : rule__Signalsdefinition__Group__1__Impl rule__Signalsdefinition__Group__2 ;
    public final void rule__Signalsdefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2950:1: ( rule__Signalsdefinition__Group__1__Impl rule__Signalsdefinition__Group__2 )
            // InternalSocrates.g:2951:2: rule__Signalsdefinition__Group__1__Impl rule__Signalsdefinition__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Signalsdefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signalsdefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group__1"


    // $ANTLR start "rule__Signalsdefinition__Group__1__Impl"
    // InternalSocrates.g:2958:1: rule__Signalsdefinition__Group__1__Impl : ( ( rule__Signalsdefinition__SignalsAssignment_1 ) ) ;
    public final void rule__Signalsdefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2962:1: ( ( ( rule__Signalsdefinition__SignalsAssignment_1 ) ) )
            // InternalSocrates.g:2963:1: ( ( rule__Signalsdefinition__SignalsAssignment_1 ) )
            {
            // InternalSocrates.g:2963:1: ( ( rule__Signalsdefinition__SignalsAssignment_1 ) )
            // InternalSocrates.g:2964:2: ( rule__Signalsdefinition__SignalsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionAccess().getSignalsAssignment_1()); 
            }
            // InternalSocrates.g:2965:2: ( rule__Signalsdefinition__SignalsAssignment_1 )
            // InternalSocrates.g:2965:3: rule__Signalsdefinition__SignalsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signalsdefinition__SignalsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionAccess().getSignalsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group__1__Impl"


    // $ANTLR start "rule__Signalsdefinition__Group__2"
    // InternalSocrates.g:2973:1: rule__Signalsdefinition__Group__2 : rule__Signalsdefinition__Group__2__Impl rule__Signalsdefinition__Group__3 ;
    public final void rule__Signalsdefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2977:1: ( rule__Signalsdefinition__Group__2__Impl rule__Signalsdefinition__Group__3 )
            // InternalSocrates.g:2978:2: rule__Signalsdefinition__Group__2__Impl rule__Signalsdefinition__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Signalsdefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signalsdefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group__2"


    // $ANTLR start "rule__Signalsdefinition__Group__2__Impl"
    // InternalSocrates.g:2985:1: rule__Signalsdefinition__Group__2__Impl : ( ( rule__Signalsdefinition__Group_2__0 )* ) ;
    public final void rule__Signalsdefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:2989:1: ( ( ( rule__Signalsdefinition__Group_2__0 )* ) )
            // InternalSocrates.g:2990:1: ( ( rule__Signalsdefinition__Group_2__0 )* )
            {
            // InternalSocrates.g:2990:1: ( ( rule__Signalsdefinition__Group_2__0 )* )
            // InternalSocrates.g:2991:2: ( rule__Signalsdefinition__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionAccess().getGroup_2()); 
            }
            // InternalSocrates.g:2992:2: ( rule__Signalsdefinition__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==13) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSocrates.g:2992:3: rule__Signalsdefinition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Signalsdefinition__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group__2__Impl"


    // $ANTLR start "rule__Signalsdefinition__Group__3"
    // InternalSocrates.g:3000:1: rule__Signalsdefinition__Group__3 : rule__Signalsdefinition__Group__3__Impl ;
    public final void rule__Signalsdefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3004:1: ( rule__Signalsdefinition__Group__3__Impl )
            // InternalSocrates.g:3005:2: rule__Signalsdefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signalsdefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group__3"


    // $ANTLR start "rule__Signalsdefinition__Group__3__Impl"
    // InternalSocrates.g:3011:1: rule__Signalsdefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__Signalsdefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3015:1: ( ( ';' ) )
            // InternalSocrates.g:3016:1: ( ';' )
            {
            // InternalSocrates.g:3016:1: ( ';' )
            // InternalSocrates.g:3017:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionAccess().getSemicolonKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group__3__Impl"


    // $ANTLR start "rule__Signalsdefinition__Group_2__0"
    // InternalSocrates.g:3027:1: rule__Signalsdefinition__Group_2__0 : rule__Signalsdefinition__Group_2__0__Impl rule__Signalsdefinition__Group_2__1 ;
    public final void rule__Signalsdefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3031:1: ( rule__Signalsdefinition__Group_2__0__Impl rule__Signalsdefinition__Group_2__1 )
            // InternalSocrates.g:3032:2: rule__Signalsdefinition__Group_2__0__Impl rule__Signalsdefinition__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Signalsdefinition__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signalsdefinition__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group_2__0"


    // $ANTLR start "rule__Signalsdefinition__Group_2__0__Impl"
    // InternalSocrates.g:3039:1: rule__Signalsdefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Signalsdefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3043:1: ( ( ',' ) )
            // InternalSocrates.g:3044:1: ( ',' )
            {
            // InternalSocrates.g:3044:1: ( ',' )
            // InternalSocrates.g:3045:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionAccess().getCommaKeyword_2_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group_2__0__Impl"


    // $ANTLR start "rule__Signalsdefinition__Group_2__1"
    // InternalSocrates.g:3054:1: rule__Signalsdefinition__Group_2__1 : rule__Signalsdefinition__Group_2__1__Impl ;
    public final void rule__Signalsdefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3058:1: ( rule__Signalsdefinition__Group_2__1__Impl )
            // InternalSocrates.g:3059:2: rule__Signalsdefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signalsdefinition__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group_2__1"


    // $ANTLR start "rule__Signalsdefinition__Group_2__1__Impl"
    // InternalSocrates.g:3065:1: rule__Signalsdefinition__Group_2__1__Impl : ( ( rule__Signalsdefinition__SignalsAssignment_2_1 ) ) ;
    public final void rule__Signalsdefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3069:1: ( ( ( rule__Signalsdefinition__SignalsAssignment_2_1 ) ) )
            // InternalSocrates.g:3070:1: ( ( rule__Signalsdefinition__SignalsAssignment_2_1 ) )
            {
            // InternalSocrates.g:3070:1: ( ( rule__Signalsdefinition__SignalsAssignment_2_1 ) )
            // InternalSocrates.g:3071:2: ( rule__Signalsdefinition__SignalsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionAccess().getSignalsAssignment_2_1()); 
            }
            // InternalSocrates.g:3072:2: ( rule__Signalsdefinition__SignalsAssignment_2_1 )
            // InternalSocrates.g:3072:3: rule__Signalsdefinition__SignalsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Signalsdefinition__SignalsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionAccess().getSignalsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__Group_2__1__Impl"


    // $ANTLR start "rule__ConstantsDefinition__Group__0"
    // InternalSocrates.g:3081:1: rule__ConstantsDefinition__Group__0 : rule__ConstantsDefinition__Group__0__Impl rule__ConstantsDefinition__Group__1 ;
    public final void rule__ConstantsDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3085:1: ( rule__ConstantsDefinition__Group__0__Impl rule__ConstantsDefinition__Group__1 )
            // InternalSocrates.g:3086:2: rule__ConstantsDefinition__Group__0__Impl rule__ConstantsDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ConstantsDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantsDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group__0"


    // $ANTLR start "rule__ConstantsDefinition__Group__0__Impl"
    // InternalSocrates.g:3093:1: rule__ConstantsDefinition__Group__0__Impl : ( 'Constants' ) ;
    public final void rule__ConstantsDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3097:1: ( ( 'Constants' ) )
            // InternalSocrates.g:3098:1: ( 'Constants' )
            {
            // InternalSocrates.g:3098:1: ( 'Constants' )
            // InternalSocrates.g:3099:2: 'Constants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionAccess().getConstantsKeyword_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionAccess().getConstantsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group__0__Impl"


    // $ANTLR start "rule__ConstantsDefinition__Group__1"
    // InternalSocrates.g:3108:1: rule__ConstantsDefinition__Group__1 : rule__ConstantsDefinition__Group__1__Impl rule__ConstantsDefinition__Group__2 ;
    public final void rule__ConstantsDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3112:1: ( rule__ConstantsDefinition__Group__1__Impl rule__ConstantsDefinition__Group__2 )
            // InternalSocrates.g:3113:2: rule__ConstantsDefinition__Group__1__Impl rule__ConstantsDefinition__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ConstantsDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantsDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group__1"


    // $ANTLR start "rule__ConstantsDefinition__Group__1__Impl"
    // InternalSocrates.g:3120:1: rule__ConstantsDefinition__Group__1__Impl : ( ( rule__ConstantsDefinition__ConstantsAssignment_1 ) ) ;
    public final void rule__ConstantsDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3124:1: ( ( ( rule__ConstantsDefinition__ConstantsAssignment_1 ) ) )
            // InternalSocrates.g:3125:1: ( ( rule__ConstantsDefinition__ConstantsAssignment_1 ) )
            {
            // InternalSocrates.g:3125:1: ( ( rule__ConstantsDefinition__ConstantsAssignment_1 ) )
            // InternalSocrates.g:3126:2: ( rule__ConstantsDefinition__ConstantsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionAccess().getConstantsAssignment_1()); 
            }
            // InternalSocrates.g:3127:2: ( rule__ConstantsDefinition__ConstantsAssignment_1 )
            // InternalSocrates.g:3127:3: rule__ConstantsDefinition__ConstantsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantsDefinition__ConstantsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionAccess().getConstantsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group__1__Impl"


    // $ANTLR start "rule__ConstantsDefinition__Group__2"
    // InternalSocrates.g:3135:1: rule__ConstantsDefinition__Group__2 : rule__ConstantsDefinition__Group__2__Impl rule__ConstantsDefinition__Group__3 ;
    public final void rule__ConstantsDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3139:1: ( rule__ConstantsDefinition__Group__2__Impl rule__ConstantsDefinition__Group__3 )
            // InternalSocrates.g:3140:2: rule__ConstantsDefinition__Group__2__Impl rule__ConstantsDefinition__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ConstantsDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantsDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group__2"


    // $ANTLR start "rule__ConstantsDefinition__Group__2__Impl"
    // InternalSocrates.g:3147:1: rule__ConstantsDefinition__Group__2__Impl : ( ( rule__ConstantsDefinition__Group_2__0 )* ) ;
    public final void rule__ConstantsDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3151:1: ( ( ( rule__ConstantsDefinition__Group_2__0 )* ) )
            // InternalSocrates.g:3152:1: ( ( rule__ConstantsDefinition__Group_2__0 )* )
            {
            // InternalSocrates.g:3152:1: ( ( rule__ConstantsDefinition__Group_2__0 )* )
            // InternalSocrates.g:3153:2: ( rule__ConstantsDefinition__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionAccess().getGroup_2()); 
            }
            // InternalSocrates.g:3154:2: ( rule__ConstantsDefinition__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==13) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSocrates.g:3154:3: rule__ConstantsDefinition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ConstantsDefinition__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group__2__Impl"


    // $ANTLR start "rule__ConstantsDefinition__Group__3"
    // InternalSocrates.g:3162:1: rule__ConstantsDefinition__Group__3 : rule__ConstantsDefinition__Group__3__Impl ;
    public final void rule__ConstantsDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3166:1: ( rule__ConstantsDefinition__Group__3__Impl )
            // InternalSocrates.g:3167:2: rule__ConstantsDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantsDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group__3"


    // $ANTLR start "rule__ConstantsDefinition__Group__3__Impl"
    // InternalSocrates.g:3173:1: rule__ConstantsDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__ConstantsDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3177:1: ( ( ';' ) )
            // InternalSocrates.g:3178:1: ( ';' )
            {
            // InternalSocrates.g:3178:1: ( ';' )
            // InternalSocrates.g:3179:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionAccess().getSemicolonKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group__3__Impl"


    // $ANTLR start "rule__ConstantsDefinition__Group_2__0"
    // InternalSocrates.g:3189:1: rule__ConstantsDefinition__Group_2__0 : rule__ConstantsDefinition__Group_2__0__Impl rule__ConstantsDefinition__Group_2__1 ;
    public final void rule__ConstantsDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3193:1: ( rule__ConstantsDefinition__Group_2__0__Impl rule__ConstantsDefinition__Group_2__1 )
            // InternalSocrates.g:3194:2: rule__ConstantsDefinition__Group_2__0__Impl rule__ConstantsDefinition__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ConstantsDefinition__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantsDefinition__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group_2__0"


    // $ANTLR start "rule__ConstantsDefinition__Group_2__0__Impl"
    // InternalSocrates.g:3201:1: rule__ConstantsDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ConstantsDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3205:1: ( ( ',' ) )
            // InternalSocrates.g:3206:1: ( ',' )
            {
            // InternalSocrates.g:3206:1: ( ',' )
            // InternalSocrates.g:3207:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionAccess().getCommaKeyword_2_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__ConstantsDefinition__Group_2__1"
    // InternalSocrates.g:3216:1: rule__ConstantsDefinition__Group_2__1 : rule__ConstantsDefinition__Group_2__1__Impl ;
    public final void rule__ConstantsDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3220:1: ( rule__ConstantsDefinition__Group_2__1__Impl )
            // InternalSocrates.g:3221:2: rule__ConstantsDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantsDefinition__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group_2__1"


    // $ANTLR start "rule__ConstantsDefinition__Group_2__1__Impl"
    // InternalSocrates.g:3227:1: rule__ConstantsDefinition__Group_2__1__Impl : ( ( rule__ConstantsDefinition__ConstantsAssignment_2_1 ) ) ;
    public final void rule__ConstantsDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3231:1: ( ( ( rule__ConstantsDefinition__ConstantsAssignment_2_1 ) ) )
            // InternalSocrates.g:3232:1: ( ( rule__ConstantsDefinition__ConstantsAssignment_2_1 ) )
            {
            // InternalSocrates.g:3232:1: ( ( rule__ConstantsDefinition__ConstantsAssignment_2_1 ) )
            // InternalSocrates.g:3233:2: ( rule__ConstantsDefinition__ConstantsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionAccess().getConstantsAssignment_2_1()); 
            }
            // InternalSocrates.g:3234:2: ( rule__ConstantsDefinition__ConstantsAssignment_2_1 )
            // InternalSocrates.g:3234:3: rule__ConstantsDefinition__ConstantsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantsDefinition__ConstantsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionAccess().getConstantsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__ConstantDefinition__Group__0"
    // InternalSocrates.g:3243:1: rule__ConstantDefinition__Group__0 : rule__ConstantDefinition__Group__0__Impl rule__ConstantDefinition__Group__1 ;
    public final void rule__ConstantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3247:1: ( rule__ConstantDefinition__Group__0__Impl rule__ConstantDefinition__Group__1 )
            // InternalSocrates.g:3248:2: rule__ConstantDefinition__Group__0__Impl rule__ConstantDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ConstantDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__0"


    // $ANTLR start "rule__ConstantDefinition__Group__0__Impl"
    // InternalSocrates.g:3255:1: rule__ConstantDefinition__Group__0__Impl : ( ( rule__ConstantDefinition__ConstantidAssignment_0 ) ) ;
    public final void rule__ConstantDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3259:1: ( ( ( rule__ConstantDefinition__ConstantidAssignment_0 ) ) )
            // InternalSocrates.g:3260:1: ( ( rule__ConstantDefinition__ConstantidAssignment_0 ) )
            {
            // InternalSocrates.g:3260:1: ( ( rule__ConstantDefinition__ConstantidAssignment_0 ) )
            // InternalSocrates.g:3261:2: ( rule__ConstantDefinition__ConstantidAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getConstantidAssignment_0()); 
            }
            // InternalSocrates.g:3262:2: ( rule__ConstantDefinition__ConstantidAssignment_0 )
            // InternalSocrates.g:3262:3: rule__ConstantDefinition__ConstantidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDefinition__ConstantidAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getConstantidAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__0__Impl"


    // $ANTLR start "rule__ConstantDefinition__Group__1"
    // InternalSocrates.g:3270:1: rule__ConstantDefinition__Group__1 : rule__ConstantDefinition__Group__1__Impl rule__ConstantDefinition__Group__2 ;
    public final void rule__ConstantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3274:1: ( rule__ConstantDefinition__Group__1__Impl rule__ConstantDefinition__Group__2 )
            // InternalSocrates.g:3275:2: rule__ConstantDefinition__Group__1__Impl rule__ConstantDefinition__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ConstantDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__1"


    // $ANTLR start "rule__ConstantDefinition__Group__1__Impl"
    // InternalSocrates.g:3282:1: rule__ConstantDefinition__Group__1__Impl : ( ruleEQ ) ;
    public final void rule__ConstantDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3286:1: ( ( ruleEQ ) )
            // InternalSocrates.g:3287:1: ( ruleEQ )
            {
            // InternalSocrates.g:3287:1: ( ruleEQ )
            // InternalSocrates.g:3288:2: ruleEQ
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getEQParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEQ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getEQParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__1__Impl"


    // $ANTLR start "rule__ConstantDefinition__Group__2"
    // InternalSocrates.g:3297:1: rule__ConstantDefinition__Group__2 : rule__ConstantDefinition__Group__2__Impl rule__ConstantDefinition__Group__3 ;
    public final void rule__ConstantDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3301:1: ( rule__ConstantDefinition__Group__2__Impl rule__ConstantDefinition__Group__3 )
            // InternalSocrates.g:3302:2: rule__ConstantDefinition__Group__2__Impl rule__ConstantDefinition__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ConstantDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__2"


    // $ANTLR start "rule__ConstantDefinition__Group__2__Impl"
    // InternalSocrates.g:3309:1: rule__ConstantDefinition__Group__2__Impl : ( ( ruleSIGN )? ) ;
    public final void rule__ConstantDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3313:1: ( ( ( ruleSIGN )? ) )
            // InternalSocrates.g:3314:1: ( ( ruleSIGN )? )
            {
            // InternalSocrates.g:3314:1: ( ( ruleSIGN )? )
            // InternalSocrates.g:3315:2: ( ruleSIGN )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getSIGNParserRuleCall_2()); 
            }
            // InternalSocrates.g:3316:2: ( ruleSIGN )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=33 && LA34_0<=34)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSocrates.g:3316:3: ruleSIGN
                    {
                    pushFollow(FOLLOW_2);
                    ruleSIGN();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getSIGNParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__2__Impl"


    // $ANTLR start "rule__ConstantDefinition__Group__3"
    // InternalSocrates.g:3324:1: rule__ConstantDefinition__Group__3 : rule__ConstantDefinition__Group__3__Impl ;
    public final void rule__ConstantDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3328:1: ( rule__ConstantDefinition__Group__3__Impl )
            // InternalSocrates.g:3329:2: rule__ConstantDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__3"


    // $ANTLR start "rule__ConstantDefinition__Group__3__Impl"
    // InternalSocrates.g:3335:1: rule__ConstantDefinition__Group__3__Impl : ( ( rule__ConstantDefinition__ValueAssignment_3 ) ) ;
    public final void rule__ConstantDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3339:1: ( ( ( rule__ConstantDefinition__ValueAssignment_3 ) ) )
            // InternalSocrates.g:3340:1: ( ( rule__ConstantDefinition__ValueAssignment_3 ) )
            {
            // InternalSocrates.g:3340:1: ( ( rule__ConstantDefinition__ValueAssignment_3 ) )
            // InternalSocrates.g:3341:2: ( rule__ConstantDefinition__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getValueAssignment_3()); 
            }
            // InternalSocrates.g:3342:2: ( rule__ConstantDefinition__ValueAssignment_3 )
            // InternalSocrates.g:3342:3: rule__ConstantDefinition__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDefinition__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__3__Impl"


    // $ANTLR start "rule__ForAllformula__Group__0"
    // InternalSocrates.g:3351:1: rule__ForAllformula__Group__0 : rule__ForAllformula__Group__0__Impl rule__ForAllformula__Group__1 ;
    public final void rule__ForAllformula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3355:1: ( rule__ForAllformula__Group__0__Impl rule__ForAllformula__Group__1 )
            // InternalSocrates.g:3356:2: rule__ForAllformula__Group__0__Impl rule__ForAllformula__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ForAllformula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForAllformula__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__0"


    // $ANTLR start "rule__ForAllformula__Group__0__Impl"
    // InternalSocrates.g:3363:1: rule__ForAllformula__Group__0__Impl : ( ruleFORALL ) ;
    public final void rule__ForAllformula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3367:1: ( ( ruleFORALL ) )
            // InternalSocrates.g:3368:1: ( ruleFORALL )
            {
            // InternalSocrates.g:3368:1: ( ruleFORALL )
            // InternalSocrates.g:3369:2: ruleFORALL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaAccess().getFORALLParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFORALL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaAccess().getFORALLParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__0__Impl"


    // $ANTLR start "rule__ForAllformula__Group__1"
    // InternalSocrates.g:3378:1: rule__ForAllformula__Group__1 : rule__ForAllformula__Group__1__Impl rule__ForAllformula__Group__2 ;
    public final void rule__ForAllformula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3382:1: ( rule__ForAllformula__Group__1__Impl rule__ForAllformula__Group__2 )
            // InternalSocrates.g:3383:2: rule__ForAllformula__Group__1__Impl rule__ForAllformula__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ForAllformula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForAllformula__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__1"


    // $ANTLR start "rule__ForAllformula__Group__1__Impl"
    // InternalSocrates.g:3390:1: rule__ForAllformula__Group__1__Impl : ( ( rule__ForAllformula__BoundAssignment_1 ) ) ;
    public final void rule__ForAllformula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3394:1: ( ( ( rule__ForAllformula__BoundAssignment_1 ) ) )
            // InternalSocrates.g:3395:1: ( ( rule__ForAllformula__BoundAssignment_1 ) )
            {
            // InternalSocrates.g:3395:1: ( ( rule__ForAllformula__BoundAssignment_1 ) )
            // InternalSocrates.g:3396:2: ( rule__ForAllformula__BoundAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaAccess().getBoundAssignment_1()); 
            }
            // InternalSocrates.g:3397:2: ( rule__ForAllformula__BoundAssignment_1 )
            // InternalSocrates.g:3397:3: rule__ForAllformula__BoundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForAllformula__BoundAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaAccess().getBoundAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__1__Impl"


    // $ANTLR start "rule__ForAllformula__Group__2"
    // InternalSocrates.g:3405:1: rule__ForAllformula__Group__2 : rule__ForAllformula__Group__2__Impl rule__ForAllformula__Group__3 ;
    public final void rule__ForAllformula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3409:1: ( rule__ForAllformula__Group__2__Impl rule__ForAllformula__Group__3 )
            // InternalSocrates.g:3410:2: rule__ForAllformula__Group__2__Impl rule__ForAllformula__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ForAllformula__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForAllformula__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__2"


    // $ANTLR start "rule__ForAllformula__Group__2__Impl"
    // InternalSocrates.g:3417:1: rule__ForAllformula__Group__2__Impl : ( ruleCOLON ) ;
    public final void rule__ForAllformula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3421:1: ( ( ruleCOLON ) )
            // InternalSocrates.g:3422:1: ( ruleCOLON )
            {
            // InternalSocrates.g:3422:1: ( ruleCOLON )
            // InternalSocrates.g:3423:2: ruleCOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaAccess().getCOLONParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleCOLON();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaAccess().getCOLONParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__2__Impl"


    // $ANTLR start "rule__ForAllformula__Group__3"
    // InternalSocrates.g:3432:1: rule__ForAllformula__Group__3 : rule__ForAllformula__Group__3__Impl rule__ForAllformula__Group__4 ;
    public final void rule__ForAllformula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3436:1: ( rule__ForAllformula__Group__3__Impl rule__ForAllformula__Group__4 )
            // InternalSocrates.g:3437:2: rule__ForAllformula__Group__3__Impl rule__ForAllformula__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ForAllformula__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForAllformula__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__3"


    // $ANTLR start "rule__ForAllformula__Group__3__Impl"
    // InternalSocrates.g:3444:1: rule__ForAllformula__Group__3__Impl : ( ruleLPAREN ) ;
    public final void rule__ForAllformula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3448:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:3449:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:3449:1: ( ruleLPAREN )
            // InternalSocrates.g:3450:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaAccess().getLPARENParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaAccess().getLPARENParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__3__Impl"


    // $ANTLR start "rule__ForAllformula__Group__4"
    // InternalSocrates.g:3459:1: rule__ForAllformula__Group__4 : rule__ForAllformula__Group__4__Impl rule__ForAllformula__Group__5 ;
    public final void rule__ForAllformula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3463:1: ( rule__ForAllformula__Group__4__Impl rule__ForAllformula__Group__5 )
            // InternalSocrates.g:3464:2: rule__ForAllformula__Group__4__Impl rule__ForAllformula__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ForAllformula__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForAllformula__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__4"


    // $ANTLR start "rule__ForAllformula__Group__4__Impl"
    // InternalSocrates.g:3471:1: rule__ForAllformula__Group__4__Impl : ( ( rule__ForAllformula__ForallchildAssignment_4 ) ) ;
    public final void rule__ForAllformula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3475:1: ( ( ( rule__ForAllformula__ForallchildAssignment_4 ) ) )
            // InternalSocrates.g:3476:1: ( ( rule__ForAllformula__ForallchildAssignment_4 ) )
            {
            // InternalSocrates.g:3476:1: ( ( rule__ForAllformula__ForallchildAssignment_4 ) )
            // InternalSocrates.g:3477:2: ( rule__ForAllformula__ForallchildAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaAccess().getForallchildAssignment_4()); 
            }
            // InternalSocrates.g:3478:2: ( rule__ForAllformula__ForallchildAssignment_4 )
            // InternalSocrates.g:3478:3: rule__ForAllformula__ForallchildAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForAllformula__ForallchildAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaAccess().getForallchildAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__4__Impl"


    // $ANTLR start "rule__ForAllformula__Group__5"
    // InternalSocrates.g:3486:1: rule__ForAllformula__Group__5 : rule__ForAllformula__Group__5__Impl ;
    public final void rule__ForAllformula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3490:1: ( rule__ForAllformula__Group__5__Impl )
            // InternalSocrates.g:3491:2: rule__ForAllformula__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForAllformula__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__5"


    // $ANTLR start "rule__ForAllformula__Group__5__Impl"
    // InternalSocrates.g:3497:1: rule__ForAllformula__Group__5__Impl : ( ruleRPAREN ) ;
    public final void rule__ForAllformula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3501:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:3502:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:3502:1: ( ruleRPAREN )
            // InternalSocrates.g:3503:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaAccess().getRPARENParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaAccess().getRPARENParserRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__Group__5__Impl"


    // $ANTLR start "rule__Existsformula__Group__0"
    // InternalSocrates.g:3513:1: rule__Existsformula__Group__0 : rule__Existsformula__Group__0__Impl rule__Existsformula__Group__1 ;
    public final void rule__Existsformula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3517:1: ( rule__Existsformula__Group__0__Impl rule__Existsformula__Group__1 )
            // InternalSocrates.g:3518:2: rule__Existsformula__Group__0__Impl rule__Existsformula__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Existsformula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Existsformula__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__0"


    // $ANTLR start "rule__Existsformula__Group__0__Impl"
    // InternalSocrates.g:3525:1: rule__Existsformula__Group__0__Impl : ( ruleEXISTS ) ;
    public final void rule__Existsformula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3529:1: ( ( ruleEXISTS ) )
            // InternalSocrates.g:3530:1: ( ruleEXISTS )
            {
            // InternalSocrates.g:3530:1: ( ruleEXISTS )
            // InternalSocrates.g:3531:2: ruleEXISTS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaAccess().getEXISTSParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXISTS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaAccess().getEXISTSParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__0__Impl"


    // $ANTLR start "rule__Existsformula__Group__1"
    // InternalSocrates.g:3540:1: rule__Existsformula__Group__1 : rule__Existsformula__Group__1__Impl rule__Existsformula__Group__2 ;
    public final void rule__Existsformula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3544:1: ( rule__Existsformula__Group__1__Impl rule__Existsformula__Group__2 )
            // InternalSocrates.g:3545:2: rule__Existsformula__Group__1__Impl rule__Existsformula__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Existsformula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Existsformula__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__1"


    // $ANTLR start "rule__Existsformula__Group__1__Impl"
    // InternalSocrates.g:3552:1: rule__Existsformula__Group__1__Impl : ( ( rule__Existsformula__BoundAssignment_1 ) ) ;
    public final void rule__Existsformula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3556:1: ( ( ( rule__Existsformula__BoundAssignment_1 ) ) )
            // InternalSocrates.g:3557:1: ( ( rule__Existsformula__BoundAssignment_1 ) )
            {
            // InternalSocrates.g:3557:1: ( ( rule__Existsformula__BoundAssignment_1 ) )
            // InternalSocrates.g:3558:2: ( rule__Existsformula__BoundAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaAccess().getBoundAssignment_1()); 
            }
            // InternalSocrates.g:3559:2: ( rule__Existsformula__BoundAssignment_1 )
            // InternalSocrates.g:3559:3: rule__Existsformula__BoundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Existsformula__BoundAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaAccess().getBoundAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__1__Impl"


    // $ANTLR start "rule__Existsformula__Group__2"
    // InternalSocrates.g:3567:1: rule__Existsformula__Group__2 : rule__Existsformula__Group__2__Impl rule__Existsformula__Group__3 ;
    public final void rule__Existsformula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3571:1: ( rule__Existsformula__Group__2__Impl rule__Existsformula__Group__3 )
            // InternalSocrates.g:3572:2: rule__Existsformula__Group__2__Impl rule__Existsformula__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Existsformula__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Existsformula__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__2"


    // $ANTLR start "rule__Existsformula__Group__2__Impl"
    // InternalSocrates.g:3579:1: rule__Existsformula__Group__2__Impl : ( ruleCOLON ) ;
    public final void rule__Existsformula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3583:1: ( ( ruleCOLON ) )
            // InternalSocrates.g:3584:1: ( ruleCOLON )
            {
            // InternalSocrates.g:3584:1: ( ruleCOLON )
            // InternalSocrates.g:3585:2: ruleCOLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaAccess().getCOLONParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleCOLON();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaAccess().getCOLONParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__2__Impl"


    // $ANTLR start "rule__Existsformula__Group__3"
    // InternalSocrates.g:3594:1: rule__Existsformula__Group__3 : rule__Existsformula__Group__3__Impl rule__Existsformula__Group__4 ;
    public final void rule__Existsformula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3598:1: ( rule__Existsformula__Group__3__Impl rule__Existsformula__Group__4 )
            // InternalSocrates.g:3599:2: rule__Existsformula__Group__3__Impl rule__Existsformula__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Existsformula__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Existsformula__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__3"


    // $ANTLR start "rule__Existsformula__Group__3__Impl"
    // InternalSocrates.g:3606:1: rule__Existsformula__Group__3__Impl : ( ruleLPAREN ) ;
    public final void rule__Existsformula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3610:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:3611:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:3611:1: ( ruleLPAREN )
            // InternalSocrates.g:3612:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaAccess().getLPARENParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaAccess().getLPARENParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__3__Impl"


    // $ANTLR start "rule__Existsformula__Group__4"
    // InternalSocrates.g:3621:1: rule__Existsformula__Group__4 : rule__Existsformula__Group__4__Impl rule__Existsformula__Group__5 ;
    public final void rule__Existsformula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3625:1: ( rule__Existsformula__Group__4__Impl rule__Existsformula__Group__5 )
            // InternalSocrates.g:3626:2: rule__Existsformula__Group__4__Impl rule__Existsformula__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Existsformula__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Existsformula__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__4"


    // $ANTLR start "rule__Existsformula__Group__4__Impl"
    // InternalSocrates.g:3633:1: rule__Existsformula__Group__4__Impl : ( ( rule__Existsformula__ExistschildAssignment_4 ) ) ;
    public final void rule__Existsformula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3637:1: ( ( ( rule__Existsformula__ExistschildAssignment_4 ) ) )
            // InternalSocrates.g:3638:1: ( ( rule__Existsformula__ExistschildAssignment_4 ) )
            {
            // InternalSocrates.g:3638:1: ( ( rule__Existsformula__ExistschildAssignment_4 ) )
            // InternalSocrates.g:3639:2: ( rule__Existsformula__ExistschildAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaAccess().getExistschildAssignment_4()); 
            }
            // InternalSocrates.g:3640:2: ( rule__Existsformula__ExistschildAssignment_4 )
            // InternalSocrates.g:3640:3: rule__Existsformula__ExistschildAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Existsformula__ExistschildAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaAccess().getExistschildAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__4__Impl"


    // $ANTLR start "rule__Existsformula__Group__5"
    // InternalSocrates.g:3648:1: rule__Existsformula__Group__5 : rule__Existsformula__Group__5__Impl ;
    public final void rule__Existsformula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3652:1: ( rule__Existsformula__Group__5__Impl )
            // InternalSocrates.g:3653:2: rule__Existsformula__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Existsformula__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__5"


    // $ANTLR start "rule__Existsformula__Group__5__Impl"
    // InternalSocrates.g:3659:1: rule__Existsformula__Group__5__Impl : ( ruleRPAREN ) ;
    public final void rule__Existsformula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3663:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:3664:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:3664:1: ( ruleRPAREN )
            // InternalSocrates.g:3665:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaAccess().getRPARENParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaAccess().getRPARENParserRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__Group__5__Impl"


    // $ANTLR start "rule__Negationformula__Group__0"
    // InternalSocrates.g:3675:1: rule__Negationformula__Group__0 : rule__Negationformula__Group__0__Impl rule__Negationformula__Group__1 ;
    public final void rule__Negationformula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3679:1: ( rule__Negationformula__Group__0__Impl rule__Negationformula__Group__1 )
            // InternalSocrates.g:3680:2: rule__Negationformula__Group__0__Impl rule__Negationformula__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Negationformula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Negationformula__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negationformula__Group__0"


    // $ANTLR start "rule__Negationformula__Group__0__Impl"
    // InternalSocrates.g:3687:1: rule__Negationformula__Group__0__Impl : ( ruleNOT ) ;
    public final void rule__Negationformula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3691:1: ( ( ruleNOT ) )
            // InternalSocrates.g:3692:1: ( ruleNOT )
            {
            // InternalSocrates.g:3692:1: ( ruleNOT )
            // InternalSocrates.g:3693:2: ruleNOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationformulaAccess().getNOTParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNOT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationformulaAccess().getNOTParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negationformula__Group__0__Impl"


    // $ANTLR start "rule__Negationformula__Group__1"
    // InternalSocrates.g:3702:1: rule__Negationformula__Group__1 : rule__Negationformula__Group__1__Impl ;
    public final void rule__Negationformula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3706:1: ( rule__Negationformula__Group__1__Impl )
            // InternalSocrates.g:3707:2: rule__Negationformula__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negationformula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negationformula__Group__1"


    // $ANTLR start "rule__Negationformula__Group__1__Impl"
    // InternalSocrates.g:3713:1: rule__Negationformula__Group__1__Impl : ( ( rule__Negationformula__NegationchildAssignment_1 ) ) ;
    public final void rule__Negationformula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3717:1: ( ( ( rule__Negationformula__NegationchildAssignment_1 ) ) )
            // InternalSocrates.g:3718:1: ( ( rule__Negationformula__NegationchildAssignment_1 ) )
            {
            // InternalSocrates.g:3718:1: ( ( rule__Negationformula__NegationchildAssignment_1 ) )
            // InternalSocrates.g:3719:2: ( rule__Negationformula__NegationchildAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationformulaAccess().getNegationchildAssignment_1()); 
            }
            // InternalSocrates.g:3720:2: ( rule__Negationformula__NegationchildAssignment_1 )
            // InternalSocrates.g:3720:3: rule__Negationformula__NegationchildAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Negationformula__NegationchildAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationformulaAccess().getNegationchildAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negationformula__Group__1__Impl"


    // $ANTLR start "rule__Formulab__Group__0"
    // InternalSocrates.g:3729:1: rule__Formulab__Group__0 : rule__Formulab__Group__0__Impl rule__Formulab__Group__1 ;
    public final void rule__Formulab__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3733:1: ( rule__Formulab__Group__0__Impl rule__Formulab__Group__1 )
            // InternalSocrates.g:3734:2: rule__Formulab__Group__0__Impl rule__Formulab__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Formulab__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formulab__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulab__Group__0"


    // $ANTLR start "rule__Formulab__Group__0__Impl"
    // InternalSocrates.g:3741:1: rule__Formulab__Group__0__Impl : ( ( rule__Formulab__AAssignment_0 ) ) ;
    public final void rule__Formulab__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3745:1: ( ( ( rule__Formulab__AAssignment_0 ) ) )
            // InternalSocrates.g:3746:1: ( ( rule__Formulab__AAssignment_0 ) )
            {
            // InternalSocrates.g:3746:1: ( ( rule__Formulab__AAssignment_0 ) )
            // InternalSocrates.g:3747:2: ( rule__Formulab__AAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabAccess().getAAssignment_0()); 
            }
            // InternalSocrates.g:3748:2: ( rule__Formulab__AAssignment_0 )
            // InternalSocrates.g:3748:3: rule__Formulab__AAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Formulab__AAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabAccess().getAAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulab__Group__0__Impl"


    // $ANTLR start "rule__Formulab__Group__1"
    // InternalSocrates.g:3756:1: rule__Formulab__Group__1 : rule__Formulab__Group__1__Impl ;
    public final void rule__Formulab__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3760:1: ( rule__Formulab__Group__1__Impl )
            // InternalSocrates.g:3761:2: rule__Formulab__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formulab__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulab__Group__1"


    // $ANTLR start "rule__Formulab__Group__1__Impl"
    // InternalSocrates.g:3767:1: rule__Formulab__Group__1__Impl : ( ( rule__Formulab__TAssignment_1 ) ) ;
    public final void rule__Formulab__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3771:1: ( ( ( rule__Formulab__TAssignment_1 ) ) )
            // InternalSocrates.g:3772:1: ( ( rule__Formulab__TAssignment_1 ) )
            {
            // InternalSocrates.g:3772:1: ( ( rule__Formulab__TAssignment_1 ) )
            // InternalSocrates.g:3773:2: ( rule__Formulab__TAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabAccess().getTAssignment_1()); 
            }
            // InternalSocrates.g:3774:2: ( rule__Formulab__TAssignment_1 )
            // InternalSocrates.g:3774:3: rule__Formulab__TAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Formulab__TAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabAccess().getTAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulab__Group__1__Impl"


    // $ANTLR start "rule__Formulabprime__Group__0"
    // InternalSocrates.g:3783:1: rule__Formulabprime__Group__0 : rule__Formulabprime__Group__0__Impl rule__Formulabprime__Group__1 ;
    public final void rule__Formulabprime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3787:1: ( rule__Formulabprime__Group__0__Impl rule__Formulabprime__Group__1 )
            // InternalSocrates.g:3788:2: rule__Formulabprime__Group__0__Impl rule__Formulabprime__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Formulabprime__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formulabprime__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__Group__0"


    // $ANTLR start "rule__Formulabprime__Group__0__Impl"
    // InternalSocrates.g:3795:1: rule__Formulabprime__Group__0__Impl : ( ( rule__Formulabprime__OpAssignment_0 ) ) ;
    public final void rule__Formulabprime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3799:1: ( ( ( rule__Formulabprime__OpAssignment_0 ) ) )
            // InternalSocrates.g:3800:1: ( ( rule__Formulabprime__OpAssignment_0 ) )
            {
            // InternalSocrates.g:3800:1: ( ( rule__Formulabprime__OpAssignment_0 ) )
            // InternalSocrates.g:3801:2: ( rule__Formulabprime__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabprimeAccess().getOpAssignment_0()); 
            }
            // InternalSocrates.g:3802:2: ( rule__Formulabprime__OpAssignment_0 )
            // InternalSocrates.g:3802:3: rule__Formulabprime__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Formulabprime__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabprimeAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__Group__0__Impl"


    // $ANTLR start "rule__Formulabprime__Group__1"
    // InternalSocrates.g:3810:1: rule__Formulabprime__Group__1 : rule__Formulabprime__Group__1__Impl rule__Formulabprime__Group__2 ;
    public final void rule__Formulabprime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3814:1: ( rule__Formulabprime__Group__1__Impl rule__Formulabprime__Group__2 )
            // InternalSocrates.g:3815:2: rule__Formulabprime__Group__1__Impl rule__Formulabprime__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Formulabprime__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formulabprime__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__Group__1"


    // $ANTLR start "rule__Formulabprime__Group__1__Impl"
    // InternalSocrates.g:3822:1: rule__Formulabprime__Group__1__Impl : ( ( rule__Formulabprime__T2Assignment_1 ) ) ;
    public final void rule__Formulabprime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3826:1: ( ( ( rule__Formulabprime__T2Assignment_1 ) ) )
            // InternalSocrates.g:3827:1: ( ( rule__Formulabprime__T2Assignment_1 ) )
            {
            // InternalSocrates.g:3827:1: ( ( rule__Formulabprime__T2Assignment_1 ) )
            // InternalSocrates.g:3828:2: ( rule__Formulabprime__T2Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabprimeAccess().getT2Assignment_1()); 
            }
            // InternalSocrates.g:3829:2: ( rule__Formulabprime__T2Assignment_1 )
            // InternalSocrates.g:3829:3: rule__Formulabprime__T2Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Formulabprime__T2Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabprimeAccess().getT2Assignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__Group__1__Impl"


    // $ANTLR start "rule__Formulabprime__Group__2"
    // InternalSocrates.g:3837:1: rule__Formulabprime__Group__2 : rule__Formulabprime__Group__2__Impl ;
    public final void rule__Formulabprime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3841:1: ( rule__Formulabprime__Group__2__Impl )
            // InternalSocrates.g:3842:2: rule__Formulabprime__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formulabprime__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__Group__2"


    // $ANTLR start "rule__Formulabprime__Group__2__Impl"
    // InternalSocrates.g:3848:1: rule__Formulabprime__Group__2__Impl : ( ( rule__Formulabprime__FAssignment_2 ) ) ;
    public final void rule__Formulabprime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3852:1: ( ( ( rule__Formulabprime__FAssignment_2 ) ) )
            // InternalSocrates.g:3853:1: ( ( rule__Formulabprime__FAssignment_2 ) )
            {
            // InternalSocrates.g:3853:1: ( ( rule__Formulabprime__FAssignment_2 ) )
            // InternalSocrates.g:3854:2: ( rule__Formulabprime__FAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabprimeAccess().getFAssignment_2()); 
            }
            // InternalSocrates.g:3855:2: ( rule__Formulabprime__FAssignment_2 )
            // InternalSocrates.g:3855:3: rule__Formulabprime__FAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Formulabprime__FAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabprimeAccess().getFAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__Group__2__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalSocrates.g:3864:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3868:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalSocrates.g:3869:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Term__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalSocrates.g:3876:1: rule__Term__Group__0__Impl : ( ( rule__Term__AAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3880:1: ( ( ( rule__Term__AAssignment_0 ) ) )
            // InternalSocrates.g:3881:1: ( ( rule__Term__AAssignment_0 ) )
            {
            // InternalSocrates.g:3881:1: ( ( rule__Term__AAssignment_0 ) )
            // InternalSocrates.g:3882:2: ( rule__Term__AAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAAssignment_0()); 
            }
            // InternalSocrates.g:3883:2: ( rule__Term__AAssignment_0 )
            // InternalSocrates.g:3883:3: rule__Term__AAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__AAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalSocrates.g:3891:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3895:1: ( rule__Term__Group__1__Impl )
            // InternalSocrates.g:3896:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalSocrates.g:3902:1: rule__Term__Group__1__Impl : ( ( rule__Term__TAssignment_1 ) ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3906:1: ( ( ( rule__Term__TAssignment_1 ) ) )
            // InternalSocrates.g:3907:1: ( ( rule__Term__TAssignment_1 ) )
            {
            // InternalSocrates.g:3907:1: ( ( rule__Term__TAssignment_1 ) )
            // InternalSocrates.g:3908:2: ( rule__Term__TAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTAssignment_1()); 
            }
            // InternalSocrates.g:3909:2: ( rule__Term__TAssignment_1 )
            // InternalSocrates.g:3909:3: rule__Term__TAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__TAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Termprime__Group__0"
    // InternalSocrates.g:3918:1: rule__Termprime__Group__0 : rule__Termprime__Group__0__Impl rule__Termprime__Group__1 ;
    public final void rule__Termprime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3922:1: ( rule__Termprime__Group__0__Impl rule__Termprime__Group__1 )
            // InternalSocrates.g:3923:2: rule__Termprime__Group__0__Impl rule__Termprime__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Termprime__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Termprime__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Termprime__Group__0"


    // $ANTLR start "rule__Termprime__Group__0__Impl"
    // InternalSocrates.g:3930:1: rule__Termprime__Group__0__Impl : ( ( rule__Termprime__OpAssignment_0 ) ) ;
    public final void rule__Termprime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3934:1: ( ( ( rule__Termprime__OpAssignment_0 ) ) )
            // InternalSocrates.g:3935:1: ( ( rule__Termprime__OpAssignment_0 ) )
            {
            // InternalSocrates.g:3935:1: ( ( rule__Termprime__OpAssignment_0 ) )
            // InternalSocrates.g:3936:2: ( rule__Termprime__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermprimeAccess().getOpAssignment_0()); 
            }
            // InternalSocrates.g:3937:2: ( rule__Termprime__OpAssignment_0 )
            // InternalSocrates.g:3937:3: rule__Termprime__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Termprime__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermprimeAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Termprime__Group__0__Impl"


    // $ANTLR start "rule__Termprime__Group__1"
    // InternalSocrates.g:3945:1: rule__Termprime__Group__1 : rule__Termprime__Group__1__Impl rule__Termprime__Group__2 ;
    public final void rule__Termprime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3949:1: ( rule__Termprime__Group__1__Impl rule__Termprime__Group__2 )
            // InternalSocrates.g:3950:2: rule__Termprime__Group__1__Impl rule__Termprime__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Termprime__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Termprime__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Termprime__Group__1"


    // $ANTLR start "rule__Termprime__Group__1__Impl"
    // InternalSocrates.g:3957:1: rule__Termprime__Group__1__Impl : ( ( rule__Termprime__TAssignment_1 ) ) ;
    public final void rule__Termprime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3961:1: ( ( ( rule__Termprime__TAssignment_1 ) ) )
            // InternalSocrates.g:3962:1: ( ( rule__Termprime__TAssignment_1 ) )
            {
            // InternalSocrates.g:3962:1: ( ( rule__Termprime__TAssignment_1 ) )
            // InternalSocrates.g:3963:2: ( rule__Termprime__TAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermprimeAccess().getTAssignment_1()); 
            }
            // InternalSocrates.g:3964:2: ( rule__Termprime__TAssignment_1 )
            // InternalSocrates.g:3964:3: rule__Termprime__TAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Termprime__TAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermprimeAccess().getTAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Termprime__Group__1__Impl"


    // $ANTLR start "rule__Termprime__Group__2"
    // InternalSocrates.g:3972:1: rule__Termprime__Group__2 : rule__Termprime__Group__2__Impl ;
    public final void rule__Termprime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3976:1: ( rule__Termprime__Group__2__Impl )
            // InternalSocrates.g:3977:2: rule__Termprime__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Termprime__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Termprime__Group__2"


    // $ANTLR start "rule__Termprime__Group__2__Impl"
    // InternalSocrates.g:3983:1: rule__Termprime__Group__2__Impl : ( ( rule__Termprime__F1Assignment_2 ) ) ;
    public final void rule__Termprime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:3987:1: ( ( ( rule__Termprime__F1Assignment_2 ) ) )
            // InternalSocrates.g:3988:1: ( ( rule__Termprime__F1Assignment_2 ) )
            {
            // InternalSocrates.g:3988:1: ( ( rule__Termprime__F1Assignment_2 ) )
            // InternalSocrates.g:3989:2: ( rule__Termprime__F1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermprimeAccess().getF1Assignment_2()); 
            }
            // InternalSocrates.g:3990:2: ( rule__Termprime__F1Assignment_2 )
            // InternalSocrates.g:3990:3: rule__Termprime__F1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Termprime__F1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermprimeAccess().getF1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Termprime__Group__2__Impl"


    // $ANTLR start "rule__Expressionb__Group_0__0"
    // InternalSocrates.g:3999:1: rule__Expressionb__Group_0__0 : rule__Expressionb__Group_0__0__Impl rule__Expressionb__Group_0__1 ;
    public final void rule__Expressionb__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4003:1: ( rule__Expressionb__Group_0__0__Impl rule__Expressionb__Group_0__1 )
            // InternalSocrates.g:4004:2: rule__Expressionb__Group_0__0__Impl rule__Expressionb__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Expressionb__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expressionb__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_0__0"


    // $ANTLR start "rule__Expressionb__Group_0__0__Impl"
    // InternalSocrates.g:4011:1: rule__Expressionb__Group_0__0__Impl : ( ( rule__Expressionb__TermAssignment_0_0 ) ) ;
    public final void rule__Expressionb__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4015:1: ( ( ( rule__Expressionb__TermAssignment_0_0 ) ) )
            // InternalSocrates.g:4016:1: ( ( rule__Expressionb__TermAssignment_0_0 ) )
            {
            // InternalSocrates.g:4016:1: ( ( rule__Expressionb__TermAssignment_0_0 ) )
            // InternalSocrates.g:4017:2: ( rule__Expressionb__TermAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getTermAssignment_0_0()); 
            }
            // InternalSocrates.g:4018:2: ( rule__Expressionb__TermAssignment_0_0 )
            // InternalSocrates.g:4018:3: rule__Expressionb__TermAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressionb__TermAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getTermAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_0__0__Impl"


    // $ANTLR start "rule__Expressionb__Group_0__1"
    // InternalSocrates.g:4026:1: rule__Expressionb__Group_0__1 : rule__Expressionb__Group_0__1__Impl ;
    public final void rule__Expressionb__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4030:1: ( rule__Expressionb__Group_0__1__Impl )
            // InternalSocrates.g:4031:2: rule__Expressionb__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expressionb__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_0__1"


    // $ANTLR start "rule__Expressionb__Group_0__1__Impl"
    // InternalSocrates.g:4037:1: rule__Expressionb__Group_0__1__Impl : ( ( rule__Expressionb__ExpprimeAssignment_0_1 ) ) ;
    public final void rule__Expressionb__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4041:1: ( ( ( rule__Expressionb__ExpprimeAssignment_0_1 ) ) )
            // InternalSocrates.g:4042:1: ( ( rule__Expressionb__ExpprimeAssignment_0_1 ) )
            {
            // InternalSocrates.g:4042:1: ( ( rule__Expressionb__ExpprimeAssignment_0_1 ) )
            // InternalSocrates.g:4043:2: ( rule__Expressionb__ExpprimeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getExpprimeAssignment_0_1()); 
            }
            // InternalSocrates.g:4044:2: ( rule__Expressionb__ExpprimeAssignment_0_1 )
            // InternalSocrates.g:4044:3: rule__Expressionb__ExpprimeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expressionb__ExpprimeAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getExpprimeAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_0__1__Impl"


    // $ANTLR start "rule__Expressionb__Group_1__0"
    // InternalSocrates.g:4053:1: rule__Expressionb__Group_1__0 : rule__Expressionb__Group_1__0__Impl rule__Expressionb__Group_1__1 ;
    public final void rule__Expressionb__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4057:1: ( rule__Expressionb__Group_1__0__Impl rule__Expressionb__Group_1__1 )
            // InternalSocrates.g:4058:2: rule__Expressionb__Group_1__0__Impl rule__Expressionb__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Expressionb__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expressionb__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_1__0"


    // $ANTLR start "rule__Expressionb__Group_1__0__Impl"
    // InternalSocrates.g:4065:1: rule__Expressionb__Group_1__0__Impl : ( ruleLPAREN ) ;
    public final void rule__Expressionb__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4069:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:4070:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:4070:1: ( ruleLPAREN )
            // InternalSocrates.g:4071:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getLPARENParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getLPARENParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_1__0__Impl"


    // $ANTLR start "rule__Expressionb__Group_1__1"
    // InternalSocrates.g:4080:1: rule__Expressionb__Group_1__1 : rule__Expressionb__Group_1__1__Impl rule__Expressionb__Group_1__2 ;
    public final void rule__Expressionb__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4084:1: ( rule__Expressionb__Group_1__1__Impl rule__Expressionb__Group_1__2 )
            // InternalSocrates.g:4085:2: rule__Expressionb__Group_1__1__Impl rule__Expressionb__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Expressionb__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expressionb__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_1__1"


    // $ANTLR start "rule__Expressionb__Group_1__1__Impl"
    // InternalSocrates.g:4092:1: rule__Expressionb__Group_1__1__Impl : ( ( rule__Expressionb__TermAssignment_1_1 ) ) ;
    public final void rule__Expressionb__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4096:1: ( ( ( rule__Expressionb__TermAssignment_1_1 ) ) )
            // InternalSocrates.g:4097:1: ( ( rule__Expressionb__TermAssignment_1_1 ) )
            {
            // InternalSocrates.g:4097:1: ( ( rule__Expressionb__TermAssignment_1_1 ) )
            // InternalSocrates.g:4098:2: ( rule__Expressionb__TermAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getTermAssignment_1_1()); 
            }
            // InternalSocrates.g:4099:2: ( rule__Expressionb__TermAssignment_1_1 )
            // InternalSocrates.g:4099:3: rule__Expressionb__TermAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expressionb__TermAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getTermAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_1__1__Impl"


    // $ANTLR start "rule__Expressionb__Group_1__2"
    // InternalSocrates.g:4107:1: rule__Expressionb__Group_1__2 : rule__Expressionb__Group_1__2__Impl rule__Expressionb__Group_1__3 ;
    public final void rule__Expressionb__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4111:1: ( rule__Expressionb__Group_1__2__Impl rule__Expressionb__Group_1__3 )
            // InternalSocrates.g:4112:2: rule__Expressionb__Group_1__2__Impl rule__Expressionb__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__Expressionb__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expressionb__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_1__2"


    // $ANTLR start "rule__Expressionb__Group_1__2__Impl"
    // InternalSocrates.g:4119:1: rule__Expressionb__Group_1__2__Impl : ( ruleRPAREN ) ;
    public final void rule__Expressionb__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4123:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:4124:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:4124:1: ( ruleRPAREN )
            // InternalSocrates.g:4125:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getRPARENParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getRPARENParserRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_1__2__Impl"


    // $ANTLR start "rule__Expressionb__Group_1__3"
    // InternalSocrates.g:4134:1: rule__Expressionb__Group_1__3 : rule__Expressionb__Group_1__3__Impl ;
    public final void rule__Expressionb__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4138:1: ( rule__Expressionb__Group_1__3__Impl )
            // InternalSocrates.g:4139:2: rule__Expressionb__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expressionb__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_1__3"


    // $ANTLR start "rule__Expressionb__Group_1__3__Impl"
    // InternalSocrates.g:4145:1: rule__Expressionb__Group_1__3__Impl : ( ( rule__Expressionb__ExpprimeAssignment_1_3 ) ) ;
    public final void rule__Expressionb__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4149:1: ( ( ( rule__Expressionb__ExpprimeAssignment_1_3 ) ) )
            // InternalSocrates.g:4150:1: ( ( rule__Expressionb__ExpprimeAssignment_1_3 ) )
            {
            // InternalSocrates.g:4150:1: ( ( rule__Expressionb__ExpprimeAssignment_1_3 ) )
            // InternalSocrates.g:4151:2: ( rule__Expressionb__ExpprimeAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getExpprimeAssignment_1_3()); 
            }
            // InternalSocrates.g:4152:2: ( rule__Expressionb__ExpprimeAssignment_1_3 )
            // InternalSocrates.g:4152:3: rule__Expressionb__ExpprimeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Expressionb__ExpprimeAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getExpprimeAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__Group_1__3__Impl"


    // $ANTLR start "rule__Expressionprime__Group__0"
    // InternalSocrates.g:4161:1: rule__Expressionprime__Group__0 : rule__Expressionprime__Group__0__Impl rule__Expressionprime__Group__1 ;
    public final void rule__Expressionprime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4165:1: ( rule__Expressionprime__Group__0__Impl rule__Expressionprime__Group__1 )
            // InternalSocrates.g:4166:2: rule__Expressionprime__Group__0__Impl rule__Expressionprime__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Expressionprime__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expressionprime__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__Group__0"


    // $ANTLR start "rule__Expressionprime__Group__0__Impl"
    // InternalSocrates.g:4173:1: rule__Expressionprime__Group__0__Impl : ( ( rule__Expressionprime__OpAssignment_0 ) ) ;
    public final void rule__Expressionprime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4177:1: ( ( ( rule__Expressionprime__OpAssignment_0 ) ) )
            // InternalSocrates.g:4178:1: ( ( rule__Expressionprime__OpAssignment_0 ) )
            {
            // InternalSocrates.g:4178:1: ( ( rule__Expressionprime__OpAssignment_0 ) )
            // InternalSocrates.g:4179:2: ( rule__Expressionprime__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionprimeAccess().getOpAssignment_0()); 
            }
            // InternalSocrates.g:4180:2: ( rule__Expressionprime__OpAssignment_0 )
            // InternalSocrates.g:4180:3: rule__Expressionprime__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressionprime__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionprimeAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__Group__0__Impl"


    // $ANTLR start "rule__Expressionprime__Group__1"
    // InternalSocrates.g:4188:1: rule__Expressionprime__Group__1 : rule__Expressionprime__Group__1__Impl rule__Expressionprime__Group__2 ;
    public final void rule__Expressionprime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4192:1: ( rule__Expressionprime__Group__1__Impl rule__Expressionprime__Group__2 )
            // InternalSocrates.g:4193:2: rule__Expressionprime__Group__1__Impl rule__Expressionprime__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Expressionprime__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expressionprime__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__Group__1"


    // $ANTLR start "rule__Expressionprime__Group__1__Impl"
    // InternalSocrates.g:4200:1: rule__Expressionprime__Group__1__Impl : ( ( rule__Expressionprime__T2Assignment_1 ) ) ;
    public final void rule__Expressionprime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4204:1: ( ( ( rule__Expressionprime__T2Assignment_1 ) ) )
            // InternalSocrates.g:4205:1: ( ( rule__Expressionprime__T2Assignment_1 ) )
            {
            // InternalSocrates.g:4205:1: ( ( rule__Expressionprime__T2Assignment_1 ) )
            // InternalSocrates.g:4206:2: ( rule__Expressionprime__T2Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionprimeAccess().getT2Assignment_1()); 
            }
            // InternalSocrates.g:4207:2: ( rule__Expressionprime__T2Assignment_1 )
            // InternalSocrates.g:4207:3: rule__Expressionprime__T2Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expressionprime__T2Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionprimeAccess().getT2Assignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__Group__1__Impl"


    // $ANTLR start "rule__Expressionprime__Group__2"
    // InternalSocrates.g:4215:1: rule__Expressionprime__Group__2 : rule__Expressionprime__Group__2__Impl ;
    public final void rule__Expressionprime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4219:1: ( rule__Expressionprime__Group__2__Impl )
            // InternalSocrates.g:4220:2: rule__Expressionprime__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expressionprime__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__Group__2"


    // $ANTLR start "rule__Expressionprime__Group__2__Impl"
    // InternalSocrates.g:4226:1: rule__Expressionprime__Group__2__Impl : ( ( rule__Expressionprime__FAssignment_2 ) ) ;
    public final void rule__Expressionprime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4230:1: ( ( ( rule__Expressionprime__FAssignment_2 ) ) )
            // InternalSocrates.g:4231:1: ( ( rule__Expressionprime__FAssignment_2 ) )
            {
            // InternalSocrates.g:4231:1: ( ( rule__Expressionprime__FAssignment_2 ) )
            // InternalSocrates.g:4232:2: ( rule__Expressionprime__FAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionprimeAccess().getFAssignment_2()); 
            }
            // InternalSocrates.g:4233:2: ( rule__Expressionprime__FAssignment_2 )
            // InternalSocrates.g:4233:3: rule__Expressionprime__FAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expressionprime__FAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionprimeAccess().getFAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__Group__2__Impl"


    // $ANTLR start "rule__Expressionterm__Group__0"
    // InternalSocrates.g:4242:1: rule__Expressionterm__Group__0 : rule__Expressionterm__Group__0__Impl rule__Expressionterm__Group__1 ;
    public final void rule__Expressionterm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4246:1: ( rule__Expressionterm__Group__0__Impl rule__Expressionterm__Group__1 )
            // InternalSocrates.g:4247:2: rule__Expressionterm__Group__0__Impl rule__Expressionterm__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Expressionterm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expressionterm__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionterm__Group__0"


    // $ANTLR start "rule__Expressionterm__Group__0__Impl"
    // InternalSocrates.g:4254:1: rule__Expressionterm__Group__0__Impl : ( ( rule__Expressionterm__TermAssignment_0 ) ) ;
    public final void rule__Expressionterm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4258:1: ( ( ( rule__Expressionterm__TermAssignment_0 ) ) )
            // InternalSocrates.g:4259:1: ( ( rule__Expressionterm__TermAssignment_0 ) )
            {
            // InternalSocrates.g:4259:1: ( ( rule__Expressionterm__TermAssignment_0 ) )
            // InternalSocrates.g:4260:2: ( rule__Expressionterm__TermAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermAccess().getTermAssignment_0()); 
            }
            // InternalSocrates.g:4261:2: ( rule__Expressionterm__TermAssignment_0 )
            // InternalSocrates.g:4261:3: rule__Expressionterm__TermAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressionterm__TermAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermAccess().getTermAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionterm__Group__0__Impl"


    // $ANTLR start "rule__Expressionterm__Group__1"
    // InternalSocrates.g:4269:1: rule__Expressionterm__Group__1 : rule__Expressionterm__Group__1__Impl ;
    public final void rule__Expressionterm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4273:1: ( rule__Expressionterm__Group__1__Impl )
            // InternalSocrates.g:4274:2: rule__Expressionterm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expressionterm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionterm__Group__1"


    // $ANTLR start "rule__Expressionterm__Group__1__Impl"
    // InternalSocrates.g:4280:1: rule__Expressionterm__Group__1__Impl : ( ( rule__Expressionterm__ExpprimeAssignment_1 ) ) ;
    public final void rule__Expressionterm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4284:1: ( ( ( rule__Expressionterm__ExpprimeAssignment_1 ) ) )
            // InternalSocrates.g:4285:1: ( ( rule__Expressionterm__ExpprimeAssignment_1 ) )
            {
            // InternalSocrates.g:4285:1: ( ( rule__Expressionterm__ExpprimeAssignment_1 ) )
            // InternalSocrates.g:4286:2: ( rule__Expressionterm__ExpprimeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermAccess().getExpprimeAssignment_1()); 
            }
            // InternalSocrates.g:4287:2: ( rule__Expressionterm__ExpprimeAssignment_1 )
            // InternalSocrates.g:4287:3: rule__Expressionterm__ExpprimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expressionterm__ExpprimeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermAccess().getExpprimeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionterm__Group__1__Impl"


    // $ANTLR start "rule__Expressiontermprime__Group__0"
    // InternalSocrates.g:4296:1: rule__Expressiontermprime__Group__0 : rule__Expressiontermprime__Group__0__Impl rule__Expressiontermprime__Group__1 ;
    public final void rule__Expressiontermprime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4300:1: ( rule__Expressiontermprime__Group__0__Impl rule__Expressiontermprime__Group__1 )
            // InternalSocrates.g:4301:2: rule__Expressiontermprime__Group__0__Impl rule__Expressiontermprime__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Expressiontermprime__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expressiontermprime__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__Group__0"


    // $ANTLR start "rule__Expressiontermprime__Group__0__Impl"
    // InternalSocrates.g:4308:1: rule__Expressiontermprime__Group__0__Impl : ( ( rule__Expressiontermprime__OpAssignment_0 ) ) ;
    public final void rule__Expressiontermprime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4312:1: ( ( ( rule__Expressiontermprime__OpAssignment_0 ) ) )
            // InternalSocrates.g:4313:1: ( ( rule__Expressiontermprime__OpAssignment_0 ) )
            {
            // InternalSocrates.g:4313:1: ( ( rule__Expressiontermprime__OpAssignment_0 ) )
            // InternalSocrates.g:4314:2: ( rule__Expressiontermprime__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermprimeAccess().getOpAssignment_0()); 
            }
            // InternalSocrates.g:4315:2: ( rule__Expressiontermprime__OpAssignment_0 )
            // InternalSocrates.g:4315:3: rule__Expressiontermprime__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressiontermprime__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermprimeAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__Group__0__Impl"


    // $ANTLR start "rule__Expressiontermprime__Group__1"
    // InternalSocrates.g:4323:1: rule__Expressiontermprime__Group__1 : rule__Expressiontermprime__Group__1__Impl rule__Expressiontermprime__Group__2 ;
    public final void rule__Expressiontermprime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4327:1: ( rule__Expressiontermprime__Group__1__Impl rule__Expressiontermprime__Group__2 )
            // InternalSocrates.g:4328:2: rule__Expressiontermprime__Group__1__Impl rule__Expressiontermprime__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Expressiontermprime__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expressiontermprime__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__Group__1"


    // $ANTLR start "rule__Expressiontermprime__Group__1__Impl"
    // InternalSocrates.g:4335:1: rule__Expressiontermprime__Group__1__Impl : ( ( rule__Expressiontermprime__T2Assignment_1 ) ) ;
    public final void rule__Expressiontermprime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4339:1: ( ( ( rule__Expressiontermprime__T2Assignment_1 ) ) )
            // InternalSocrates.g:4340:1: ( ( rule__Expressiontermprime__T2Assignment_1 ) )
            {
            // InternalSocrates.g:4340:1: ( ( rule__Expressiontermprime__T2Assignment_1 ) )
            // InternalSocrates.g:4341:2: ( rule__Expressiontermprime__T2Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermprimeAccess().getT2Assignment_1()); 
            }
            // InternalSocrates.g:4342:2: ( rule__Expressiontermprime__T2Assignment_1 )
            // InternalSocrates.g:4342:3: rule__Expressiontermprime__T2Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expressiontermprime__T2Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermprimeAccess().getT2Assignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__Group__1__Impl"


    // $ANTLR start "rule__Expressiontermprime__Group__2"
    // InternalSocrates.g:4350:1: rule__Expressiontermprime__Group__2 : rule__Expressiontermprime__Group__2__Impl ;
    public final void rule__Expressiontermprime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4354:1: ( rule__Expressiontermprime__Group__2__Impl )
            // InternalSocrates.g:4355:2: rule__Expressiontermprime__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expressiontermprime__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__Group__2"


    // $ANTLR start "rule__Expressiontermprime__Group__2__Impl"
    // InternalSocrates.g:4361:1: rule__Expressiontermprime__Group__2__Impl : ( ( rule__Expressiontermprime__FAssignment_2 ) ) ;
    public final void rule__Expressiontermprime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4365:1: ( ( ( rule__Expressiontermprime__FAssignment_2 ) ) )
            // InternalSocrates.g:4366:1: ( ( rule__Expressiontermprime__FAssignment_2 ) )
            {
            // InternalSocrates.g:4366:1: ( ( rule__Expressiontermprime__FAssignment_2 ) )
            // InternalSocrates.g:4367:2: ( rule__Expressiontermprime__FAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermprimeAccess().getFAssignment_2()); 
            }
            // InternalSocrates.g:4368:2: ( rule__Expressiontermprime__FAssignment_2 )
            // InternalSocrates.g:4368:3: rule__Expressiontermprime__FAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expressiontermprime__FAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermprimeAccess().getFAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__Group__2__Impl"


    // $ANTLR start "rule__ExpressionAtom__Group_1__0"
    // InternalSocrates.g:4377:1: rule__ExpressionAtom__Group_1__0 : rule__ExpressionAtom__Group_1__0__Impl rule__ExpressionAtom__Group_1__1 ;
    public final void rule__ExpressionAtom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4381:1: ( rule__ExpressionAtom__Group_1__0__Impl rule__ExpressionAtom__Group_1__1 )
            // InternalSocrates.g:4382:2: rule__ExpressionAtom__Group_1__0__Impl rule__ExpressionAtom__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionAtom__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionAtom__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_1__0"


    // $ANTLR start "rule__ExpressionAtom__Group_1__0__Impl"
    // InternalSocrates.g:4389:1: rule__ExpressionAtom__Group_1__0__Impl : ( ruleLPAREN ) ;
    public final void rule__ExpressionAtom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4393:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:4394:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:4394:1: ( ruleLPAREN )
            // InternalSocrates.g:4395:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getLPARENParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getLPARENParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionAtom__Group_1__1"
    // InternalSocrates.g:4404:1: rule__ExpressionAtom__Group_1__1 : rule__ExpressionAtom__Group_1__1__Impl rule__ExpressionAtom__Group_1__2 ;
    public final void rule__ExpressionAtom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4408:1: ( rule__ExpressionAtom__Group_1__1__Impl rule__ExpressionAtom__Group_1__2 )
            // InternalSocrates.g:4409:2: rule__ExpressionAtom__Group_1__1__Impl rule__ExpressionAtom__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionAtom__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionAtom__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_1__1"


    // $ANTLR start "rule__ExpressionAtom__Group_1__1__Impl"
    // InternalSocrates.g:4416:1: rule__ExpressionAtom__Group_1__1__Impl : ( ( rule__ExpressionAtom__ExpAssignment_1_1 ) ) ;
    public final void rule__ExpressionAtom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4420:1: ( ( ( rule__ExpressionAtom__ExpAssignment_1_1 ) ) )
            // InternalSocrates.g:4421:1: ( ( rule__ExpressionAtom__ExpAssignment_1_1 ) )
            {
            // InternalSocrates.g:4421:1: ( ( rule__ExpressionAtom__ExpAssignment_1_1 ) )
            // InternalSocrates.g:4422:2: ( rule__ExpressionAtom__ExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getExpAssignment_1_1()); 
            }
            // InternalSocrates.g:4423:2: ( rule__ExpressionAtom__ExpAssignment_1_1 )
            // InternalSocrates.g:4423:3: rule__ExpressionAtom__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionAtom__ExpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getExpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionAtom__Group_1__2"
    // InternalSocrates.g:4431:1: rule__ExpressionAtom__Group_1__2 : rule__ExpressionAtom__Group_1__2__Impl ;
    public final void rule__ExpressionAtom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4435:1: ( rule__ExpressionAtom__Group_1__2__Impl )
            // InternalSocrates.g:4436:2: rule__ExpressionAtom__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionAtom__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_1__2"


    // $ANTLR start "rule__ExpressionAtom__Group_1__2__Impl"
    // InternalSocrates.g:4442:1: rule__ExpressionAtom__Group_1__2__Impl : ( ruleRPAREN ) ;
    public final void rule__ExpressionAtom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4446:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:4447:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:4447:1: ( ruleRPAREN )
            // InternalSocrates.g:4448:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getRPARENParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getRPARENParserRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionAtom__Group_2__0"
    // InternalSocrates.g:4458:1: rule__ExpressionAtom__Group_2__0 : rule__ExpressionAtom__Group_2__0__Impl rule__ExpressionAtom__Group_2__1 ;
    public final void rule__ExpressionAtom__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4462:1: ( rule__ExpressionAtom__Group_2__0__Impl rule__ExpressionAtom__Group_2__1 )
            // InternalSocrates.g:4463:2: rule__ExpressionAtom__Group_2__0__Impl rule__ExpressionAtom__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionAtom__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionAtom__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_2__0"


    // $ANTLR start "rule__ExpressionAtom__Group_2__0__Impl"
    // InternalSocrates.g:4470:1: rule__ExpressionAtom__Group_2__0__Impl : ( ( rule__ExpressionAtom__OpAssignment_2_0 ) ) ;
    public final void rule__ExpressionAtom__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4474:1: ( ( ( rule__ExpressionAtom__OpAssignment_2_0 ) ) )
            // InternalSocrates.g:4475:1: ( ( rule__ExpressionAtom__OpAssignment_2_0 ) )
            {
            // InternalSocrates.g:4475:1: ( ( rule__ExpressionAtom__OpAssignment_2_0 ) )
            // InternalSocrates.g:4476:2: ( rule__ExpressionAtom__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getOpAssignment_2_0()); 
            }
            // InternalSocrates.g:4477:2: ( rule__ExpressionAtom__OpAssignment_2_0 )
            // InternalSocrates.g:4477:3: rule__ExpressionAtom__OpAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionAtom__OpAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getOpAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_2__0__Impl"


    // $ANTLR start "rule__ExpressionAtom__Group_2__1"
    // InternalSocrates.g:4485:1: rule__ExpressionAtom__Group_2__1 : rule__ExpressionAtom__Group_2__1__Impl ;
    public final void rule__ExpressionAtom__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4489:1: ( rule__ExpressionAtom__Group_2__1__Impl )
            // InternalSocrates.g:4490:2: rule__ExpressionAtom__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionAtom__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_2__1"


    // $ANTLR start "rule__ExpressionAtom__Group_2__1__Impl"
    // InternalSocrates.g:4496:1: rule__ExpressionAtom__Group_2__1__Impl : ( ( rule__ExpressionAtom__ExpAssignment_2_1 ) ) ;
    public final void rule__ExpressionAtom__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4500:1: ( ( ( rule__ExpressionAtom__ExpAssignment_2_1 ) ) )
            // InternalSocrates.g:4501:1: ( ( rule__ExpressionAtom__ExpAssignment_2_1 ) )
            {
            // InternalSocrates.g:4501:1: ( ( rule__ExpressionAtom__ExpAssignment_2_1 ) )
            // InternalSocrates.g:4502:2: ( rule__ExpressionAtom__ExpAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getExpAssignment_2_1()); 
            }
            // InternalSocrates.g:4503:2: ( rule__ExpressionAtom__ExpAssignment_2_1 )
            // InternalSocrates.g:4503:3: rule__ExpressionAtom__ExpAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionAtom__ExpAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getExpAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__Group_2__1__Impl"


    // $ANTLR start "rule__Basicexpression__Group_0__0"
    // InternalSocrates.g:4512:1: rule__Basicexpression__Group_0__0 : rule__Basicexpression__Group_0__0__Impl rule__Basicexpression__Group_0__1 ;
    public final void rule__Basicexpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4516:1: ( rule__Basicexpression__Group_0__0__Impl rule__Basicexpression__Group_0__1 )
            // InternalSocrates.g:4517:2: rule__Basicexpression__Group_0__0__Impl rule__Basicexpression__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Basicexpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Basicexpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__Group_0__0"


    // $ANTLR start "rule__Basicexpression__Group_0__0__Impl"
    // InternalSocrates.g:4524:1: rule__Basicexpression__Group_0__0__Impl : ( ruleLPAREN ) ;
    public final void rule__Basicexpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4528:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:4529:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:4529:1: ( ruleLPAREN )
            // InternalSocrates.g:4530:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getLPARENParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getLPARENParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__Group_0__0__Impl"


    // $ANTLR start "rule__Basicexpression__Group_0__1"
    // InternalSocrates.g:4539:1: rule__Basicexpression__Group_0__1 : rule__Basicexpression__Group_0__1__Impl rule__Basicexpression__Group_0__2 ;
    public final void rule__Basicexpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4543:1: ( rule__Basicexpression__Group_0__1__Impl rule__Basicexpression__Group_0__2 )
            // InternalSocrates.g:4544:2: rule__Basicexpression__Group_0__1__Impl rule__Basicexpression__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Basicexpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Basicexpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__Group_0__1"


    // $ANTLR start "rule__Basicexpression__Group_0__1__Impl"
    // InternalSocrates.g:4551:1: rule__Basicexpression__Group_0__1__Impl : ( ( rule__Basicexpression__ExpAssignment_0_1 ) ) ;
    public final void rule__Basicexpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4555:1: ( ( ( rule__Basicexpression__ExpAssignment_0_1 ) ) )
            // InternalSocrates.g:4556:1: ( ( rule__Basicexpression__ExpAssignment_0_1 ) )
            {
            // InternalSocrates.g:4556:1: ( ( rule__Basicexpression__ExpAssignment_0_1 ) )
            // InternalSocrates.g:4557:2: ( rule__Basicexpression__ExpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getExpAssignment_0_1()); 
            }
            // InternalSocrates.g:4558:2: ( rule__Basicexpression__ExpAssignment_0_1 )
            // InternalSocrates.g:4558:3: rule__Basicexpression__ExpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Basicexpression__ExpAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getExpAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__Group_0__1__Impl"


    // $ANTLR start "rule__Basicexpression__Group_0__2"
    // InternalSocrates.g:4566:1: rule__Basicexpression__Group_0__2 : rule__Basicexpression__Group_0__2__Impl ;
    public final void rule__Basicexpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4570:1: ( rule__Basicexpression__Group_0__2__Impl )
            // InternalSocrates.g:4571:2: rule__Basicexpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Basicexpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__Group_0__2"


    // $ANTLR start "rule__Basicexpression__Group_0__2__Impl"
    // InternalSocrates.g:4577:1: rule__Basicexpression__Group_0__2__Impl : ( ruleRPAREN ) ;
    public final void rule__Basicexpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4581:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:4582:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:4582:1: ( ruleRPAREN )
            // InternalSocrates.g:4583:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getRPARENParserRuleCall_0_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getRPARENParserRuleCall_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__Group_0__2__Impl"


    // $ANTLR start "rule__Boundterm__Group__0"
    // InternalSocrates.g:4593:1: rule__Boundterm__Group__0 : rule__Boundterm__Group__0__Impl rule__Boundterm__Group__1 ;
    public final void rule__Boundterm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4597:1: ( rule__Boundterm__Group__0__Impl rule__Boundterm__Group__1 )
            // InternalSocrates.g:4598:2: rule__Boundterm__Group__0__Impl rule__Boundterm__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Boundterm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Boundterm__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__0"


    // $ANTLR start "rule__Boundterm__Group__0__Impl"
    // InternalSocrates.g:4605:1: rule__Boundterm__Group__0__Impl : ( ( rule__Boundterm__RefAssignment_0 ) ) ;
    public final void rule__Boundterm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4609:1: ( ( ( rule__Boundterm__RefAssignment_0 ) ) )
            // InternalSocrates.g:4610:1: ( ( rule__Boundterm__RefAssignment_0 ) )
            {
            // InternalSocrates.g:4610:1: ( ( rule__Boundterm__RefAssignment_0 ) )
            // InternalSocrates.g:4611:2: ( rule__Boundterm__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getRefAssignment_0()); 
            }
            // InternalSocrates.g:4612:2: ( rule__Boundterm__RefAssignment_0 )
            // InternalSocrates.g:4612:3: rule__Boundterm__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Boundterm__RefAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getRefAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__0__Impl"


    // $ANTLR start "rule__Boundterm__Group__1"
    // InternalSocrates.g:4620:1: rule__Boundterm__Group__1 : rule__Boundterm__Group__1__Impl rule__Boundterm__Group__2 ;
    public final void rule__Boundterm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4624:1: ( rule__Boundterm__Group__1__Impl rule__Boundterm__Group__2 )
            // InternalSocrates.g:4625:2: rule__Boundterm__Group__1__Impl rule__Boundterm__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Boundterm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Boundterm__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__1"


    // $ANTLR start "rule__Boundterm__Group__1__Impl"
    // InternalSocrates.g:4632:1: rule__Boundterm__Group__1__Impl : ( ruleIN ) ;
    public final void rule__Boundterm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4636:1: ( ( ruleIN ) )
            // InternalSocrates.g:4637:1: ( ruleIN )
            {
            // InternalSocrates.g:4637:1: ( ruleIN )
            // InternalSocrates.g:4638:2: ruleIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getINParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleIN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getINParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__1__Impl"


    // $ANTLR start "rule__Boundterm__Group__2"
    // InternalSocrates.g:4647:1: rule__Boundterm__Group__2 : rule__Boundterm__Group__2__Impl rule__Boundterm__Group__3 ;
    public final void rule__Boundterm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4651:1: ( rule__Boundterm__Group__2__Impl rule__Boundterm__Group__3 )
            // InternalSocrates.g:4652:2: rule__Boundterm__Group__2__Impl rule__Boundterm__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Boundterm__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Boundterm__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__2"


    // $ANTLR start "rule__Boundterm__Group__2__Impl"
    // InternalSocrates.g:4659:1: rule__Boundterm__Group__2__Impl : ( ( rule__Boundterm__Alternatives_2 ) ) ;
    public final void rule__Boundterm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4663:1: ( ( ( rule__Boundterm__Alternatives_2 ) ) )
            // InternalSocrates.g:4664:1: ( ( rule__Boundterm__Alternatives_2 ) )
            {
            // InternalSocrates.g:4664:1: ( ( rule__Boundterm__Alternatives_2 ) )
            // InternalSocrates.g:4665:2: ( rule__Boundterm__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getAlternatives_2()); 
            }
            // InternalSocrates.g:4666:2: ( rule__Boundterm__Alternatives_2 )
            // InternalSocrates.g:4666:3: rule__Boundterm__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Boundterm__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__2__Impl"


    // $ANTLR start "rule__Boundterm__Group__3"
    // InternalSocrates.g:4674:1: rule__Boundterm__Group__3 : rule__Boundterm__Group__3__Impl rule__Boundterm__Group__4 ;
    public final void rule__Boundterm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4678:1: ( rule__Boundterm__Group__3__Impl rule__Boundterm__Group__4 )
            // InternalSocrates.g:4679:2: rule__Boundterm__Group__3__Impl rule__Boundterm__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Boundterm__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Boundterm__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__3"


    // $ANTLR start "rule__Boundterm__Group__3__Impl"
    // InternalSocrates.g:4686:1: rule__Boundterm__Group__3__Impl : ( ( rule__Boundterm__LeftboundAssignment_3 ) ) ;
    public final void rule__Boundterm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4690:1: ( ( ( rule__Boundterm__LeftboundAssignment_3 ) ) )
            // InternalSocrates.g:4691:1: ( ( rule__Boundterm__LeftboundAssignment_3 ) )
            {
            // InternalSocrates.g:4691:1: ( ( rule__Boundterm__LeftboundAssignment_3 ) )
            // InternalSocrates.g:4692:2: ( rule__Boundterm__LeftboundAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getLeftboundAssignment_3()); 
            }
            // InternalSocrates.g:4693:2: ( rule__Boundterm__LeftboundAssignment_3 )
            // InternalSocrates.g:4693:3: rule__Boundterm__LeftboundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Boundterm__LeftboundAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getLeftboundAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__3__Impl"


    // $ANTLR start "rule__Boundterm__Group__4"
    // InternalSocrates.g:4701:1: rule__Boundterm__Group__4 : rule__Boundterm__Group__4__Impl rule__Boundterm__Group__5 ;
    public final void rule__Boundterm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4705:1: ( rule__Boundterm__Group__4__Impl rule__Boundterm__Group__5 )
            // InternalSocrates.g:4706:2: rule__Boundterm__Group__4__Impl rule__Boundterm__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Boundterm__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Boundterm__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__4"


    // $ANTLR start "rule__Boundterm__Group__4__Impl"
    // InternalSocrates.g:4713:1: rule__Boundterm__Group__4__Impl : ( ruleCOMMA ) ;
    public final void rule__Boundterm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4717:1: ( ( ruleCOMMA ) )
            // InternalSocrates.g:4718:1: ( ruleCOMMA )
            {
            // InternalSocrates.g:4718:1: ( ruleCOMMA )
            // InternalSocrates.g:4719:2: ruleCOMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getCOMMAParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getCOMMAParserRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__4__Impl"


    // $ANTLR start "rule__Boundterm__Group__5"
    // InternalSocrates.g:4728:1: rule__Boundterm__Group__5 : rule__Boundterm__Group__5__Impl rule__Boundterm__Group__6 ;
    public final void rule__Boundterm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4732:1: ( rule__Boundterm__Group__5__Impl rule__Boundterm__Group__6 )
            // InternalSocrates.g:4733:2: rule__Boundterm__Group__5__Impl rule__Boundterm__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Boundterm__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Boundterm__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__5"


    // $ANTLR start "rule__Boundterm__Group__5__Impl"
    // InternalSocrates.g:4740:1: rule__Boundterm__Group__5__Impl : ( ( rule__Boundterm__RightboundAssignment_5 ) ) ;
    public final void rule__Boundterm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4744:1: ( ( ( rule__Boundterm__RightboundAssignment_5 ) ) )
            // InternalSocrates.g:4745:1: ( ( rule__Boundterm__RightboundAssignment_5 ) )
            {
            // InternalSocrates.g:4745:1: ( ( rule__Boundterm__RightboundAssignment_5 ) )
            // InternalSocrates.g:4746:2: ( rule__Boundterm__RightboundAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getRightboundAssignment_5()); 
            }
            // InternalSocrates.g:4747:2: ( rule__Boundterm__RightboundAssignment_5 )
            // InternalSocrates.g:4747:3: rule__Boundterm__RightboundAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Boundterm__RightboundAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getRightboundAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__5__Impl"


    // $ANTLR start "rule__Boundterm__Group__6"
    // InternalSocrates.g:4755:1: rule__Boundterm__Group__6 : rule__Boundterm__Group__6__Impl ;
    public final void rule__Boundterm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4759:1: ( rule__Boundterm__Group__6__Impl )
            // InternalSocrates.g:4760:2: rule__Boundterm__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boundterm__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__6"


    // $ANTLR start "rule__Boundterm__Group__6__Impl"
    // InternalSocrates.g:4766:1: rule__Boundterm__Group__6__Impl : ( ( rule__Boundterm__Alternatives_6 ) ) ;
    public final void rule__Boundterm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4770:1: ( ( ( rule__Boundterm__Alternatives_6 ) ) )
            // InternalSocrates.g:4771:1: ( ( rule__Boundterm__Alternatives_6 ) )
            {
            // InternalSocrates.g:4771:1: ( ( rule__Boundterm__Alternatives_6 ) )
            // InternalSocrates.g:4772:2: ( rule__Boundterm__Alternatives_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getAlternatives_6()); 
            }
            // InternalSocrates.g:4773:2: ( rule__Boundterm__Alternatives_6 )
            // InternalSocrates.g:4773:3: rule__Boundterm__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Boundterm__Alternatives_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getAlternatives_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__Group__6__Impl"


    // $ANTLR start "rule__Timedterm__Group_2__0"
    // InternalSocrates.g:4782:1: rule__Timedterm__Group_2__0 : rule__Timedterm__Group_2__0__Impl rule__Timedterm__Group_2__1 ;
    public final void rule__Timedterm__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4786:1: ( rule__Timedterm__Group_2__0__Impl rule__Timedterm__Group_2__1 )
            // InternalSocrates.g:4787:2: rule__Timedterm__Group_2__0__Impl rule__Timedterm__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Timedterm__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Timedterm__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Group_2__0"


    // $ANTLR start "rule__Timedterm__Group_2__0__Impl"
    // InternalSocrates.g:4794:1: rule__Timedterm__Group_2__0__Impl : ( ( rule__Timedterm__Alternatives_2_0 ) ) ;
    public final void rule__Timedterm__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4798:1: ( ( ( rule__Timedterm__Alternatives_2_0 ) ) )
            // InternalSocrates.g:4799:1: ( ( rule__Timedterm__Alternatives_2_0 ) )
            {
            // InternalSocrates.g:4799:1: ( ( rule__Timedterm__Alternatives_2_0 ) )
            // InternalSocrates.g:4800:2: ( rule__Timedterm__Alternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getAlternatives_2_0()); 
            }
            // InternalSocrates.g:4801:2: ( rule__Timedterm__Alternatives_2_0 )
            // InternalSocrates.g:4801:3: rule__Timedterm__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Timedterm__Alternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Group_2__0__Impl"


    // $ANTLR start "rule__Timedterm__Group_2__1"
    // InternalSocrates.g:4809:1: rule__Timedterm__Group_2__1 : rule__Timedterm__Group_2__1__Impl ;
    public final void rule__Timedterm__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4813:1: ( rule__Timedterm__Group_2__1__Impl )
            // InternalSocrates.g:4814:2: rule__Timedterm__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Timedterm__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Group_2__1"


    // $ANTLR start "rule__Timedterm__Group_2__1__Impl"
    // InternalSocrates.g:4820:1: rule__Timedterm__Group_2__1__Impl : ( ( rule__Timedterm__Group_2_1__0 )? ) ;
    public final void rule__Timedterm__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4824:1: ( ( ( rule__Timedterm__Group_2_1__0 )? ) )
            // InternalSocrates.g:4825:1: ( ( rule__Timedterm__Group_2_1__0 )? )
            {
            // InternalSocrates.g:4825:1: ( ( rule__Timedterm__Group_2_1__0 )? )
            // InternalSocrates.g:4826:2: ( rule__Timedterm__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getGroup_2_1()); 
            }
            // InternalSocrates.g:4827:2: ( rule__Timedterm__Group_2_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=33 && LA35_0<=34)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSocrates.g:4827:3: rule__Timedterm__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Timedterm__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Group_2__1__Impl"


    // $ANTLR start "rule__Timedterm__Group_2_1__0"
    // InternalSocrates.g:4836:1: rule__Timedterm__Group_2_1__0 : rule__Timedterm__Group_2_1__0__Impl rule__Timedterm__Group_2_1__1 ;
    public final void rule__Timedterm__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4840:1: ( rule__Timedterm__Group_2_1__0__Impl rule__Timedterm__Group_2_1__1 )
            // InternalSocrates.g:4841:2: rule__Timedterm__Group_2_1__0__Impl rule__Timedterm__Group_2_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Timedterm__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Timedterm__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Group_2_1__0"


    // $ANTLR start "rule__Timedterm__Group_2_1__0__Impl"
    // InternalSocrates.g:4848:1: rule__Timedterm__Group_2_1__0__Impl : ( ( rule__Timedterm__OpAssignment_2_1_0 ) ) ;
    public final void rule__Timedterm__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4852:1: ( ( ( rule__Timedterm__OpAssignment_2_1_0 ) ) )
            // InternalSocrates.g:4853:1: ( ( rule__Timedterm__OpAssignment_2_1_0 ) )
            {
            // InternalSocrates.g:4853:1: ( ( rule__Timedterm__OpAssignment_2_1_0 ) )
            // InternalSocrates.g:4854:2: ( rule__Timedterm__OpAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getOpAssignment_2_1_0()); 
            }
            // InternalSocrates.g:4855:2: ( rule__Timedterm__OpAssignment_2_1_0 )
            // InternalSocrates.g:4855:3: rule__Timedterm__OpAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Timedterm__OpAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getOpAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Group_2_1__0__Impl"


    // $ANTLR start "rule__Timedterm__Group_2_1__1"
    // InternalSocrates.g:4863:1: rule__Timedterm__Group_2_1__1 : rule__Timedterm__Group_2_1__1__Impl ;
    public final void rule__Timedterm__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4867:1: ( rule__Timedterm__Group_2_1__1__Impl )
            // InternalSocrates.g:4868:2: rule__Timedterm__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Timedterm__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Group_2_1__1"


    // $ANTLR start "rule__Timedterm__Group_2_1__1__Impl"
    // InternalSocrates.g:4874:1: rule__Timedterm__Group_2_1__1__Impl : ( ( rule__Timedterm__ValueAssignment_2_1_1 ) ) ;
    public final void rule__Timedterm__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4878:1: ( ( ( rule__Timedterm__ValueAssignment_2_1_1 ) ) )
            // InternalSocrates.g:4879:1: ( ( rule__Timedterm__ValueAssignment_2_1_1 ) )
            {
            // InternalSocrates.g:4879:1: ( ( rule__Timedterm__ValueAssignment_2_1_1 ) )
            // InternalSocrates.g:4880:2: ( rule__Timedterm__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getValueAssignment_2_1_1()); 
            }
            // InternalSocrates.g:4881:2: ( rule__Timedterm__ValueAssignment_2_1_1 )
            // InternalSocrates.g:4881:3: rule__Timedterm__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Timedterm__ValueAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getValueAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__Group_2_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_0__0"
    // InternalSocrates.g:4890:1: rule__Atom__Group_0__0 : rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1 ;
    public final void rule__Atom__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4894:1: ( rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1 )
            // InternalSocrates.g:4895:2: rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Atom__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_0__0"


    // $ANTLR start "rule__Atom__Group_0__0__Impl"
    // InternalSocrates.g:4902:1: rule__Atom__Group_0__0__Impl : ( ruleLPAREN ) ;
    public final void rule__Atom__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4906:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:4907:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:4907:1: ( ruleLPAREN )
            // InternalSocrates.g:4908:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLPARENParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLPARENParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_0__0__Impl"


    // $ANTLR start "rule__Atom__Group_0__1"
    // InternalSocrates.g:4917:1: rule__Atom__Group_0__1 : rule__Atom__Group_0__1__Impl rule__Atom__Group_0__2 ;
    public final void rule__Atom__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4921:1: ( rule__Atom__Group_0__1__Impl rule__Atom__Group_0__2 )
            // InternalSocrates.g:4922:2: rule__Atom__Group_0__1__Impl rule__Atom__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Atom__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_0__1"


    // $ANTLR start "rule__Atom__Group_0__1__Impl"
    // InternalSocrates.g:4929:1: rule__Atom__Group_0__1__Impl : ( ( rule__Atom__FAssignment_0_1 ) ) ;
    public final void rule__Atom__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4933:1: ( ( ( rule__Atom__FAssignment_0_1 ) ) )
            // InternalSocrates.g:4934:1: ( ( rule__Atom__FAssignment_0_1 ) )
            {
            // InternalSocrates.g:4934:1: ( ( rule__Atom__FAssignment_0_1 ) )
            // InternalSocrates.g:4935:2: ( rule__Atom__FAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getFAssignment_0_1()); 
            }
            // InternalSocrates.g:4936:2: ( rule__Atom__FAssignment_0_1 )
            // InternalSocrates.g:4936:3: rule__Atom__FAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atom__FAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getFAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_0__1__Impl"


    // $ANTLR start "rule__Atom__Group_0__2"
    // InternalSocrates.g:4944:1: rule__Atom__Group_0__2 : rule__Atom__Group_0__2__Impl ;
    public final void rule__Atom__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4948:1: ( rule__Atom__Group_0__2__Impl )
            // InternalSocrates.g:4949:2: rule__Atom__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_0__2"


    // $ANTLR start "rule__Atom__Group_0__2__Impl"
    // InternalSocrates.g:4955:1: rule__Atom__Group_0__2__Impl : ( ruleRPAREN ) ;
    public final void rule__Atom__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4959:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:4960:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:4960:1: ( ruleRPAREN )
            // InternalSocrates.g:4961:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRPARENParserRuleCall_0_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRPARENParserRuleCall_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_0__2__Impl"


    // $ANTLR start "rule__Atom__Group_1__0"
    // InternalSocrates.g:4971:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4975:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // InternalSocrates.g:4976:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Atom__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__0"


    // $ANTLR start "rule__Atom__Group_1__0__Impl"
    // InternalSocrates.g:4983:1: rule__Atom__Group_1__0__Impl : ( '{' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:4987:1: ( ( '{' ) )
            // InternalSocrates.g:4988:1: ( '{' )
            {
            // InternalSocrates.g:4988:1: ( '{' )
            // InternalSocrates.g:4989:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftCurlyBracketKeyword_1_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLeftCurlyBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1__1"
    // InternalSocrates.g:4998:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5002:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // InternalSocrates.g:5003:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_36);
            rule__Atom__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__1"


    // $ANTLR start "rule__Atom__Group_1__1__Impl"
    // InternalSocrates.g:5010:1: rule__Atom__Group_1__1__Impl : ( ( rule__Atom__S1Assignment_1_1 ) ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5014:1: ( ( ( rule__Atom__S1Assignment_1_1 ) ) )
            // InternalSocrates.g:5015:1: ( ( rule__Atom__S1Assignment_1_1 ) )
            {
            // InternalSocrates.g:5015:1: ( ( rule__Atom__S1Assignment_1_1 ) )
            // InternalSocrates.g:5016:2: ( rule__Atom__S1Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getS1Assignment_1_1()); 
            }
            // InternalSocrates.g:5017:2: ( rule__Atom__S1Assignment_1_1 )
            // InternalSocrates.g:5017:3: rule__Atom__S1Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atom__S1Assignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getS1Assignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__2"
    // InternalSocrates.g:5025:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5029:1: ( rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 )
            // InternalSocrates.g:5030:2: rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__Atom__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__2"


    // $ANTLR start "rule__Atom__Group_1__2__Impl"
    // InternalSocrates.g:5037:1: rule__Atom__Group_1__2__Impl : ( ( rule__Atom__OpAssignment_1_2 ) ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5041:1: ( ( ( rule__Atom__OpAssignment_1_2 ) ) )
            // InternalSocrates.g:5042:1: ( ( rule__Atom__OpAssignment_1_2 ) )
            {
            // InternalSocrates.g:5042:1: ( ( rule__Atom__OpAssignment_1_2 ) )
            // InternalSocrates.g:5043:2: ( rule__Atom__OpAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getOpAssignment_1_2()); 
            }
            // InternalSocrates.g:5044:2: ( rule__Atom__OpAssignment_1_2 )
            // InternalSocrates.g:5044:3: rule__Atom__OpAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Atom__OpAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getOpAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__2__Impl"


    // $ANTLR start "rule__Atom__Group_1__3"
    // InternalSocrates.g:5052:1: rule__Atom__Group_1__3 : rule__Atom__Group_1__3__Impl rule__Atom__Group_1__4 ;
    public final void rule__Atom__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5056:1: ( rule__Atom__Group_1__3__Impl rule__Atom__Group_1__4 )
            // InternalSocrates.g:5057:2: rule__Atom__Group_1__3__Impl rule__Atom__Group_1__4
            {
            pushFollow(FOLLOW_37);
            rule__Atom__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__3"


    // $ANTLR start "rule__Atom__Group_1__3__Impl"
    // InternalSocrates.g:5064:1: rule__Atom__Group_1__3__Impl : ( ( rule__Atom__S2Assignment_1_3 ) ) ;
    public final void rule__Atom__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5068:1: ( ( ( rule__Atom__S2Assignment_1_3 ) ) )
            // InternalSocrates.g:5069:1: ( ( rule__Atom__S2Assignment_1_3 ) )
            {
            // InternalSocrates.g:5069:1: ( ( rule__Atom__S2Assignment_1_3 ) )
            // InternalSocrates.g:5070:2: ( rule__Atom__S2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getS2Assignment_1_3()); 
            }
            // InternalSocrates.g:5071:2: ( rule__Atom__S2Assignment_1_3 )
            // InternalSocrates.g:5071:3: rule__Atom__S2Assignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Atom__S2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getS2Assignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__3__Impl"


    // $ANTLR start "rule__Atom__Group_1__4"
    // InternalSocrates.g:5079:1: rule__Atom__Group_1__4 : rule__Atom__Group_1__4__Impl ;
    public final void rule__Atom__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5083:1: ( rule__Atom__Group_1__4__Impl )
            // InternalSocrates.g:5084:2: rule__Atom__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__4"


    // $ANTLR start "rule__Atom__Group_1__4__Impl"
    // InternalSocrates.g:5090:1: rule__Atom__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Atom__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5094:1: ( ( '}' ) )
            // InternalSocrates.g:5095:1: ( '}' )
            {
            // InternalSocrates.g:5095:1: ( '}' )
            // InternalSocrates.g:5096:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightCurlyBracketKeyword_1_4()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRightCurlyBracketKeyword_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__4__Impl"


    // $ANTLR start "rule__Value__Group_0__0"
    // InternalSocrates.g:5106:1: rule__Value__Group_0__0 : rule__Value__Group_0__0__Impl rule__Value__Group_0__1 ;
    public final void rule__Value__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5110:1: ( rule__Value__Group_0__0__Impl rule__Value__Group_0__1 )
            // InternalSocrates.g:5111:2: rule__Value__Group_0__0__Impl rule__Value__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Value__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Value__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__0"


    // $ANTLR start "rule__Value__Group_0__0__Impl"
    // InternalSocrates.g:5118:1: rule__Value__Group_0__0__Impl : ( ruleLPAREN ) ;
    public final void rule__Value__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5122:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:5123:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:5123:1: ( ruleLPAREN )
            // InternalSocrates.g:5124:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getLPARENParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getLPARENParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__0__Impl"


    // $ANTLR start "rule__Value__Group_0__1"
    // InternalSocrates.g:5133:1: rule__Value__Group_0__1 : rule__Value__Group_0__1__Impl rule__Value__Group_0__2 ;
    public final void rule__Value__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5137:1: ( rule__Value__Group_0__1__Impl rule__Value__Group_0__2 )
            // InternalSocrates.g:5138:2: rule__Value__Group_0__1__Impl rule__Value__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Value__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Value__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__1"


    // $ANTLR start "rule__Value__Group_0__1__Impl"
    // InternalSocrates.g:5145:1: rule__Value__Group_0__1__Impl : ( ( rule__Value__ExpAssignment_0_1 ) ) ;
    public final void rule__Value__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5149:1: ( ( ( rule__Value__ExpAssignment_0_1 ) ) )
            // InternalSocrates.g:5150:1: ( ( rule__Value__ExpAssignment_0_1 ) )
            {
            // InternalSocrates.g:5150:1: ( ( rule__Value__ExpAssignment_0_1 ) )
            // InternalSocrates.g:5151:2: ( rule__Value__ExpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getExpAssignment_0_1()); 
            }
            // InternalSocrates.g:5152:2: ( rule__Value__ExpAssignment_0_1 )
            // InternalSocrates.g:5152:3: rule__Value__ExpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__ExpAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getExpAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__1__Impl"


    // $ANTLR start "rule__Value__Group_0__2"
    // InternalSocrates.g:5160:1: rule__Value__Group_0__2 : rule__Value__Group_0__2__Impl ;
    public final void rule__Value__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5164:1: ( rule__Value__Group_0__2__Impl )
            // InternalSocrates.g:5165:2: rule__Value__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__2"


    // $ANTLR start "rule__Value__Group_0__2__Impl"
    // InternalSocrates.g:5171:1: rule__Value__Group_0__2__Impl : ( ruleRPAREN ) ;
    public final void rule__Value__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5175:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:5176:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:5176:1: ( ruleRPAREN )
            // InternalSocrates.g:5177:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getRPARENParserRuleCall_0_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getRPARENParserRuleCall_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__2__Impl"


    // $ANTLR start "rule__Signal__Group_0__0"
    // InternalSocrates.g:5187:1: rule__Signal__Group_0__0 : rule__Signal__Group_0__0__Impl rule__Signal__Group_0__1 ;
    public final void rule__Signal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5191:1: ( rule__Signal__Group_0__0__Impl rule__Signal__Group_0__1 )
            // InternalSocrates.g:5192:2: rule__Signal__Group_0__0__Impl rule__Signal__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Signal__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_0__0"


    // $ANTLR start "rule__Signal__Group_0__0__Impl"
    // InternalSocrates.g:5199:1: rule__Signal__Group_0__0__Impl : ( ( rule__Signal__SignalidAssignment_0_0 ) ) ;
    public final void rule__Signal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5203:1: ( ( ( rule__Signal__SignalidAssignment_0_0 ) ) )
            // InternalSocrates.g:5204:1: ( ( rule__Signal__SignalidAssignment_0_0 ) )
            {
            // InternalSocrates.g:5204:1: ( ( rule__Signal__SignalidAssignment_0_0 ) )
            // InternalSocrates.g:5205:2: ( rule__Signal__SignalidAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSignalidAssignment_0_0()); 
            }
            // InternalSocrates.g:5206:2: ( rule__Signal__SignalidAssignment_0_0 )
            // InternalSocrates.g:5206:3: rule__Signal__SignalidAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Signal__SignalidAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSignalidAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_0__0__Impl"


    // $ANTLR start "rule__Signal__Group_0__1"
    // InternalSocrates.g:5214:1: rule__Signal__Group_0__1 : rule__Signal__Group_0__1__Impl rule__Signal__Group_0__2 ;
    public final void rule__Signal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5218:1: ( rule__Signal__Group_0__1__Impl rule__Signal__Group_0__2 )
            // InternalSocrates.g:5219:2: rule__Signal__Group_0__1__Impl rule__Signal__Group_0__2
            {
            pushFollow(FOLLOW_32);
            rule__Signal__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_0__1"


    // $ANTLR start "rule__Signal__Group_0__1__Impl"
    // InternalSocrates.g:5226:1: rule__Signal__Group_0__1__Impl : ( ruleLPAREN ) ;
    public final void rule__Signal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5230:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:5231:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:5231:1: ( ruleLPAREN )
            // InternalSocrates.g:5232:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getLPARENParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getLPARENParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_0__1__Impl"


    // $ANTLR start "rule__Signal__Group_0__2"
    // InternalSocrates.g:5241:1: rule__Signal__Group_0__2 : rule__Signal__Group_0__2__Impl rule__Signal__Group_0__3 ;
    public final void rule__Signal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5245:1: ( rule__Signal__Group_0__2__Impl rule__Signal__Group_0__3 )
            // InternalSocrates.g:5246:2: rule__Signal__Group_0__2__Impl rule__Signal__Group_0__3
            {
            pushFollow(FOLLOW_24);
            rule__Signal__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_0__2"


    // $ANTLR start "rule__Signal__Group_0__2__Impl"
    // InternalSocrates.g:5253:1: rule__Signal__Group_0__2__Impl : ( ( rule__Signal__TimdedtermAssignment_0_2 ) ) ;
    public final void rule__Signal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5257:1: ( ( ( rule__Signal__TimdedtermAssignment_0_2 ) ) )
            // InternalSocrates.g:5258:1: ( ( rule__Signal__TimdedtermAssignment_0_2 ) )
            {
            // InternalSocrates.g:5258:1: ( ( rule__Signal__TimdedtermAssignment_0_2 ) )
            // InternalSocrates.g:5259:2: ( rule__Signal__TimdedtermAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getTimdedtermAssignment_0_2()); 
            }
            // InternalSocrates.g:5260:2: ( rule__Signal__TimdedtermAssignment_0_2 )
            // InternalSocrates.g:5260:3: rule__Signal__TimdedtermAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Signal__TimdedtermAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getTimdedtermAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_0__2__Impl"


    // $ANTLR start "rule__Signal__Group_0__3"
    // InternalSocrates.g:5268:1: rule__Signal__Group_0__3 : rule__Signal__Group_0__3__Impl ;
    public final void rule__Signal__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5272:1: ( rule__Signal__Group_0__3__Impl )
            // InternalSocrates.g:5273:2: rule__Signal__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_0__3"


    // $ANTLR start "rule__Signal__Group_0__3__Impl"
    // InternalSocrates.g:5279:1: rule__Signal__Group_0__3__Impl : ( ruleRPAREN ) ;
    public final void rule__Signal__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5283:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:5284:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:5284:1: ( ruleRPAREN )
            // InternalSocrates.g:5285:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getRPARENParserRuleCall_0_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getRPARENParserRuleCall_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_0__3__Impl"


    // $ANTLR start "rule__Signal__Group_1__0"
    // InternalSocrates.g:5295:1: rule__Signal__Group_1__0 : rule__Signal__Group_1__0__Impl rule__Signal__Group_1__1 ;
    public final void rule__Signal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5299:1: ( rule__Signal__Group_1__0__Impl rule__Signal__Group_1__1 )
            // InternalSocrates.g:5300:2: rule__Signal__Group_1__0__Impl rule__Signal__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Signal__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__0"


    // $ANTLR start "rule__Signal__Group_1__0__Impl"
    // InternalSocrates.g:5307:1: rule__Signal__Group_1__0__Impl : ( ( rule__Signal__SignalidAssignment_1_0 ) ) ;
    public final void rule__Signal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5311:1: ( ( ( rule__Signal__SignalidAssignment_1_0 ) ) )
            // InternalSocrates.g:5312:1: ( ( rule__Signal__SignalidAssignment_1_0 ) )
            {
            // InternalSocrates.g:5312:1: ( ( rule__Signal__SignalidAssignment_1_0 ) )
            // InternalSocrates.g:5313:2: ( rule__Signal__SignalidAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSignalidAssignment_1_0()); 
            }
            // InternalSocrates.g:5314:2: ( rule__Signal__SignalidAssignment_1_0 )
            // InternalSocrates.g:5314:3: rule__Signal__SignalidAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Signal__SignalidAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSignalidAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__0__Impl"


    // $ANTLR start "rule__Signal__Group_1__1"
    // InternalSocrates.g:5322:1: rule__Signal__Group_1__1 : rule__Signal__Group_1__1__Impl rule__Signal__Group_1__2 ;
    public final void rule__Signal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5326:1: ( rule__Signal__Group_1__1__Impl rule__Signal__Group_1__2 )
            // InternalSocrates.g:5327:2: rule__Signal__Group_1__1__Impl rule__Signal__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Signal__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__1"


    // $ANTLR start "rule__Signal__Group_1__1__Impl"
    // InternalSocrates.g:5334:1: rule__Signal__Group_1__1__Impl : ( ruleLSQUARE ) ;
    public final void rule__Signal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5338:1: ( ( ruleLSQUARE ) )
            // InternalSocrates.g:5339:1: ( ruleLSQUARE )
            {
            // InternalSocrates.g:5339:1: ( ruleLSQUARE )
            // InternalSocrates.g:5340:2: ruleLSQUARE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getLSQUAREParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleLSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getLSQUAREParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__1__Impl"


    // $ANTLR start "rule__Signal__Group_1__2"
    // InternalSocrates.g:5349:1: rule__Signal__Group_1__2 : rule__Signal__Group_1__2__Impl rule__Signal__Group_1__3 ;
    public final void rule__Signal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5353:1: ( rule__Signal__Group_1__2__Impl rule__Signal__Group_1__3 )
            // InternalSocrates.g:5354:2: rule__Signal__Group_1__2__Impl rule__Signal__Group_1__3
            {
            pushFollow(FOLLOW_39);
            rule__Signal__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__2"


    // $ANTLR start "rule__Signal__Group_1__2__Impl"
    // InternalSocrates.g:5361:1: rule__Signal__Group_1__2__Impl : ( ( rule__Signal__Indx1Assignment_1_2 ) ) ;
    public final void rule__Signal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5365:1: ( ( ( rule__Signal__Indx1Assignment_1_2 ) ) )
            // InternalSocrates.g:5366:1: ( ( rule__Signal__Indx1Assignment_1_2 ) )
            {
            // InternalSocrates.g:5366:1: ( ( rule__Signal__Indx1Assignment_1_2 ) )
            // InternalSocrates.g:5367:2: ( rule__Signal__Indx1Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getIndx1Assignment_1_2()); 
            }
            // InternalSocrates.g:5368:2: ( rule__Signal__Indx1Assignment_1_2 )
            // InternalSocrates.g:5368:3: rule__Signal__Indx1Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Indx1Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getIndx1Assignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__2__Impl"


    // $ANTLR start "rule__Signal__Group_1__3"
    // InternalSocrates.g:5376:1: rule__Signal__Group_1__3 : rule__Signal__Group_1__3__Impl rule__Signal__Group_1__4 ;
    public final void rule__Signal__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5380:1: ( rule__Signal__Group_1__3__Impl rule__Signal__Group_1__4 )
            // InternalSocrates.g:5381:2: rule__Signal__Group_1__3__Impl rule__Signal__Group_1__4
            {
            pushFollow(FOLLOW_23);
            rule__Signal__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__3"


    // $ANTLR start "rule__Signal__Group_1__3__Impl"
    // InternalSocrates.g:5388:1: rule__Signal__Group_1__3__Impl : ( ruleRSQUARE ) ;
    public final void rule__Signal__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5392:1: ( ( ruleRSQUARE ) )
            // InternalSocrates.g:5393:1: ( ruleRSQUARE )
            {
            // InternalSocrates.g:5393:1: ( ruleRSQUARE )
            // InternalSocrates.g:5394:2: ruleRSQUARE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getRSQUAREParserRuleCall_1_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleRSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getRSQUAREParserRuleCall_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__3__Impl"


    // $ANTLR start "rule__Signal__Group_1__4"
    // InternalSocrates.g:5403:1: rule__Signal__Group_1__4 : rule__Signal__Group_1__4__Impl rule__Signal__Group_1__5 ;
    public final void rule__Signal__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5407:1: ( rule__Signal__Group_1__4__Impl rule__Signal__Group_1__5 )
            // InternalSocrates.g:5408:2: rule__Signal__Group_1__4__Impl rule__Signal__Group_1__5
            {
            pushFollow(FOLLOW_32);
            rule__Signal__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__4"


    // $ANTLR start "rule__Signal__Group_1__4__Impl"
    // InternalSocrates.g:5415:1: rule__Signal__Group_1__4__Impl : ( ruleLPAREN ) ;
    public final void rule__Signal__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5419:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:5420:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:5420:1: ( ruleLPAREN )
            // InternalSocrates.g:5421:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getLPARENParserRuleCall_1_4()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getLPARENParserRuleCall_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__4__Impl"


    // $ANTLR start "rule__Signal__Group_1__5"
    // InternalSocrates.g:5430:1: rule__Signal__Group_1__5 : rule__Signal__Group_1__5__Impl rule__Signal__Group_1__6 ;
    public final void rule__Signal__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5434:1: ( rule__Signal__Group_1__5__Impl rule__Signal__Group_1__6 )
            // InternalSocrates.g:5435:2: rule__Signal__Group_1__5__Impl rule__Signal__Group_1__6
            {
            pushFollow(FOLLOW_24);
            rule__Signal__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_1__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__5"


    // $ANTLR start "rule__Signal__Group_1__5__Impl"
    // InternalSocrates.g:5442:1: rule__Signal__Group_1__5__Impl : ( ( rule__Signal__TimdedtermAssignment_1_5 ) ) ;
    public final void rule__Signal__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5446:1: ( ( ( rule__Signal__TimdedtermAssignment_1_5 ) ) )
            // InternalSocrates.g:5447:1: ( ( rule__Signal__TimdedtermAssignment_1_5 ) )
            {
            // InternalSocrates.g:5447:1: ( ( rule__Signal__TimdedtermAssignment_1_5 ) )
            // InternalSocrates.g:5448:2: ( rule__Signal__TimdedtermAssignment_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getTimdedtermAssignment_1_5()); 
            }
            // InternalSocrates.g:5449:2: ( rule__Signal__TimdedtermAssignment_1_5 )
            // InternalSocrates.g:5449:3: rule__Signal__TimdedtermAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Signal__TimdedtermAssignment_1_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getTimdedtermAssignment_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__5__Impl"


    // $ANTLR start "rule__Signal__Group_1__6"
    // InternalSocrates.g:5457:1: rule__Signal__Group_1__6 : rule__Signal__Group_1__6__Impl ;
    public final void rule__Signal__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5461:1: ( rule__Signal__Group_1__6__Impl )
            // InternalSocrates.g:5462:2: rule__Signal__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__6"


    // $ANTLR start "rule__Signal__Group_1__6__Impl"
    // InternalSocrates.g:5468:1: rule__Signal__Group_1__6__Impl : ( ruleRPAREN ) ;
    public final void rule__Signal__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5472:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:5473:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:5473:1: ( ruleRPAREN )
            // InternalSocrates.g:5474:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getRPARENParserRuleCall_1_6()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getRPARENParserRuleCall_1_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__6__Impl"


    // $ANTLR start "rule__Signal__Group_2__0"
    // InternalSocrates.g:5484:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5488:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // InternalSocrates.g:5489:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
            {
            pushFollow(FOLLOW_38);
            rule__Signal__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__0"


    // $ANTLR start "rule__Signal__Group_2__0__Impl"
    // InternalSocrates.g:5496:1: rule__Signal__Group_2__0__Impl : ( ( rule__Signal__SignalidAssignment_2_0 ) ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5500:1: ( ( ( rule__Signal__SignalidAssignment_2_0 ) ) )
            // InternalSocrates.g:5501:1: ( ( rule__Signal__SignalidAssignment_2_0 ) )
            {
            // InternalSocrates.g:5501:1: ( ( rule__Signal__SignalidAssignment_2_0 ) )
            // InternalSocrates.g:5502:2: ( rule__Signal__SignalidAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSignalidAssignment_2_0()); 
            }
            // InternalSocrates.g:5503:2: ( rule__Signal__SignalidAssignment_2_0 )
            // InternalSocrates.g:5503:3: rule__Signal__SignalidAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Signal__SignalidAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSignalidAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__0__Impl"


    // $ANTLR start "rule__Signal__Group_2__1"
    // InternalSocrates.g:5511:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5515:1: ( rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 )
            // InternalSocrates.g:5516:2: rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Signal__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__1"


    // $ANTLR start "rule__Signal__Group_2__1__Impl"
    // InternalSocrates.g:5523:1: rule__Signal__Group_2__1__Impl : ( ruleLSQUARE ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5527:1: ( ( ruleLSQUARE ) )
            // InternalSocrates.g:5528:1: ( ruleLSQUARE )
            {
            // InternalSocrates.g:5528:1: ( ruleLSQUARE )
            // InternalSocrates.g:5529:2: ruleLSQUARE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getLSQUAREParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleLSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getLSQUAREParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__1__Impl"


    // $ANTLR start "rule__Signal__Group_2__2"
    // InternalSocrates.g:5538:1: rule__Signal__Group_2__2 : rule__Signal__Group_2__2__Impl rule__Signal__Group_2__3 ;
    public final void rule__Signal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5542:1: ( rule__Signal__Group_2__2__Impl rule__Signal__Group_2__3 )
            // InternalSocrates.g:5543:2: rule__Signal__Group_2__2__Impl rule__Signal__Group_2__3
            {
            pushFollow(FOLLOW_39);
            rule__Signal__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__2"


    // $ANTLR start "rule__Signal__Group_2__2__Impl"
    // InternalSocrates.g:5550:1: rule__Signal__Group_2__2__Impl : ( ( rule__Signal__Indx1Assignment_2_2 ) ) ;
    public final void rule__Signal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5554:1: ( ( ( rule__Signal__Indx1Assignment_2_2 ) ) )
            // InternalSocrates.g:5555:1: ( ( rule__Signal__Indx1Assignment_2_2 ) )
            {
            // InternalSocrates.g:5555:1: ( ( rule__Signal__Indx1Assignment_2_2 ) )
            // InternalSocrates.g:5556:2: ( rule__Signal__Indx1Assignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getIndx1Assignment_2_2()); 
            }
            // InternalSocrates.g:5557:2: ( rule__Signal__Indx1Assignment_2_2 )
            // InternalSocrates.g:5557:3: rule__Signal__Indx1Assignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Indx1Assignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getIndx1Assignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__2__Impl"


    // $ANTLR start "rule__Signal__Group_2__3"
    // InternalSocrates.g:5565:1: rule__Signal__Group_2__3 : rule__Signal__Group_2__3__Impl rule__Signal__Group_2__4 ;
    public final void rule__Signal__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5569:1: ( rule__Signal__Group_2__3__Impl rule__Signal__Group_2__4 )
            // InternalSocrates.g:5570:2: rule__Signal__Group_2__3__Impl rule__Signal__Group_2__4
            {
            pushFollow(FOLLOW_38);
            rule__Signal__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__3"


    // $ANTLR start "rule__Signal__Group_2__3__Impl"
    // InternalSocrates.g:5577:1: rule__Signal__Group_2__3__Impl : ( ruleRSQUARE ) ;
    public final void rule__Signal__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5581:1: ( ( ruleRSQUARE ) )
            // InternalSocrates.g:5582:1: ( ruleRSQUARE )
            {
            // InternalSocrates.g:5582:1: ( ruleRSQUARE )
            // InternalSocrates.g:5583:2: ruleRSQUARE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getRSQUAREParserRuleCall_2_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleRSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getRSQUAREParserRuleCall_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__3__Impl"


    // $ANTLR start "rule__Signal__Group_2__4"
    // InternalSocrates.g:5592:1: rule__Signal__Group_2__4 : rule__Signal__Group_2__4__Impl rule__Signal__Group_2__5 ;
    public final void rule__Signal__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5596:1: ( rule__Signal__Group_2__4__Impl rule__Signal__Group_2__5 )
            // InternalSocrates.g:5597:2: rule__Signal__Group_2__4__Impl rule__Signal__Group_2__5
            {
            pushFollow(FOLLOW_16);
            rule__Signal__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__4"


    // $ANTLR start "rule__Signal__Group_2__4__Impl"
    // InternalSocrates.g:5604:1: rule__Signal__Group_2__4__Impl : ( ruleLSQUARE ) ;
    public final void rule__Signal__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5608:1: ( ( ruleLSQUARE ) )
            // InternalSocrates.g:5609:1: ( ruleLSQUARE )
            {
            // InternalSocrates.g:5609:1: ( ruleLSQUARE )
            // InternalSocrates.g:5610:2: ruleLSQUARE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getLSQUAREParserRuleCall_2_4()); 
            }
            pushFollow(FOLLOW_2);
            ruleLSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getLSQUAREParserRuleCall_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__4__Impl"


    // $ANTLR start "rule__Signal__Group_2__5"
    // InternalSocrates.g:5619:1: rule__Signal__Group_2__5 : rule__Signal__Group_2__5__Impl rule__Signal__Group_2__6 ;
    public final void rule__Signal__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5623:1: ( rule__Signal__Group_2__5__Impl rule__Signal__Group_2__6 )
            // InternalSocrates.g:5624:2: rule__Signal__Group_2__5__Impl rule__Signal__Group_2__6
            {
            pushFollow(FOLLOW_39);
            rule__Signal__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__5"


    // $ANTLR start "rule__Signal__Group_2__5__Impl"
    // InternalSocrates.g:5631:1: rule__Signal__Group_2__5__Impl : ( ( rule__Signal__Indx2Assignment_2_5 ) ) ;
    public final void rule__Signal__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5635:1: ( ( ( rule__Signal__Indx2Assignment_2_5 ) ) )
            // InternalSocrates.g:5636:1: ( ( rule__Signal__Indx2Assignment_2_5 ) )
            {
            // InternalSocrates.g:5636:1: ( ( rule__Signal__Indx2Assignment_2_5 ) )
            // InternalSocrates.g:5637:2: ( rule__Signal__Indx2Assignment_2_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getIndx2Assignment_2_5()); 
            }
            // InternalSocrates.g:5638:2: ( rule__Signal__Indx2Assignment_2_5 )
            // InternalSocrates.g:5638:3: rule__Signal__Indx2Assignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Indx2Assignment_2_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getIndx2Assignment_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__5__Impl"


    // $ANTLR start "rule__Signal__Group_2__6"
    // InternalSocrates.g:5646:1: rule__Signal__Group_2__6 : rule__Signal__Group_2__6__Impl rule__Signal__Group_2__7 ;
    public final void rule__Signal__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5650:1: ( rule__Signal__Group_2__6__Impl rule__Signal__Group_2__7 )
            // InternalSocrates.g:5651:2: rule__Signal__Group_2__6__Impl rule__Signal__Group_2__7
            {
            pushFollow(FOLLOW_23);
            rule__Signal__Group_2__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__6"


    // $ANTLR start "rule__Signal__Group_2__6__Impl"
    // InternalSocrates.g:5658:1: rule__Signal__Group_2__6__Impl : ( ruleRSQUARE ) ;
    public final void rule__Signal__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5662:1: ( ( ruleRSQUARE ) )
            // InternalSocrates.g:5663:1: ( ruleRSQUARE )
            {
            // InternalSocrates.g:5663:1: ( ruleRSQUARE )
            // InternalSocrates.g:5664:2: ruleRSQUARE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getRSQUAREParserRuleCall_2_6()); 
            }
            pushFollow(FOLLOW_2);
            ruleRSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getRSQUAREParserRuleCall_2_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__6__Impl"


    // $ANTLR start "rule__Signal__Group_2__7"
    // InternalSocrates.g:5673:1: rule__Signal__Group_2__7 : rule__Signal__Group_2__7__Impl rule__Signal__Group_2__8 ;
    public final void rule__Signal__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5677:1: ( rule__Signal__Group_2__7__Impl rule__Signal__Group_2__8 )
            // InternalSocrates.g:5678:2: rule__Signal__Group_2__7__Impl rule__Signal__Group_2__8
            {
            pushFollow(FOLLOW_32);
            rule__Signal__Group_2__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__7"


    // $ANTLR start "rule__Signal__Group_2__7__Impl"
    // InternalSocrates.g:5685:1: rule__Signal__Group_2__7__Impl : ( ruleLPAREN ) ;
    public final void rule__Signal__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5689:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:5690:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:5690:1: ( ruleLPAREN )
            // InternalSocrates.g:5691:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getLPARENParserRuleCall_2_7()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getLPARENParserRuleCall_2_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__7__Impl"


    // $ANTLR start "rule__Signal__Group_2__8"
    // InternalSocrates.g:5700:1: rule__Signal__Group_2__8 : rule__Signal__Group_2__8__Impl rule__Signal__Group_2__9 ;
    public final void rule__Signal__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5704:1: ( rule__Signal__Group_2__8__Impl rule__Signal__Group_2__9 )
            // InternalSocrates.g:5705:2: rule__Signal__Group_2__8__Impl rule__Signal__Group_2__9
            {
            pushFollow(FOLLOW_24);
            rule__Signal__Group_2__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__8"


    // $ANTLR start "rule__Signal__Group_2__8__Impl"
    // InternalSocrates.g:5712:1: rule__Signal__Group_2__8__Impl : ( ( rule__Signal__TimdedtermAssignment_2_8 ) ) ;
    public final void rule__Signal__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5716:1: ( ( ( rule__Signal__TimdedtermAssignment_2_8 ) ) )
            // InternalSocrates.g:5717:1: ( ( rule__Signal__TimdedtermAssignment_2_8 ) )
            {
            // InternalSocrates.g:5717:1: ( ( rule__Signal__TimdedtermAssignment_2_8 ) )
            // InternalSocrates.g:5718:2: ( rule__Signal__TimdedtermAssignment_2_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getTimdedtermAssignment_2_8()); 
            }
            // InternalSocrates.g:5719:2: ( rule__Signal__TimdedtermAssignment_2_8 )
            // InternalSocrates.g:5719:3: rule__Signal__TimdedtermAssignment_2_8
            {
            pushFollow(FOLLOW_2);
            rule__Signal__TimdedtermAssignment_2_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getTimdedtermAssignment_2_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__8__Impl"


    // $ANTLR start "rule__Signal__Group_2__9"
    // InternalSocrates.g:5727:1: rule__Signal__Group_2__9 : rule__Signal__Group_2__9__Impl ;
    public final void rule__Signal__Group_2__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5731:1: ( rule__Signal__Group_2__9__Impl )
            // InternalSocrates.g:5732:2: rule__Signal__Group_2__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__9"


    // $ANTLR start "rule__Signal__Group_2__9__Impl"
    // InternalSocrates.g:5738:1: rule__Signal__Group_2__9__Impl : ( ruleRPAREN ) ;
    public final void rule__Signal__Group_2__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5742:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:5743:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:5743:1: ( ruleRPAREN )
            // InternalSocrates.g:5744:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getRPARENParserRuleCall_2_9()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getRPARENParserRuleCall_2_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__9__Impl"


    // $ANTLR start "rule__AbsEXP__Group__0"
    // InternalSocrates.g:5754:1: rule__AbsEXP__Group__0 : rule__AbsEXP__Group__0__Impl rule__AbsEXP__Group__1 ;
    public final void rule__AbsEXP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5758:1: ( rule__AbsEXP__Group__0__Impl rule__AbsEXP__Group__1 )
            // InternalSocrates.g:5759:2: rule__AbsEXP__Group__0__Impl rule__AbsEXP__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AbsEXP__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbsEXP__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsEXP__Group__0"


    // $ANTLR start "rule__AbsEXP__Group__0__Impl"
    // InternalSocrates.g:5766:1: rule__AbsEXP__Group__0__Impl : ( '|' ) ;
    public final void rule__AbsEXP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5770:1: ( ( '|' ) )
            // InternalSocrates.g:5771:1: ( '|' )
            {
            // InternalSocrates.g:5771:1: ( '|' )
            // InternalSocrates.g:5772:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbsEXPAccess().getVerticalLineKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbsEXPAccess().getVerticalLineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsEXP__Group__0__Impl"


    // $ANTLR start "rule__AbsEXP__Group__1"
    // InternalSocrates.g:5781:1: rule__AbsEXP__Group__1 : rule__AbsEXP__Group__1__Impl rule__AbsEXP__Group__2 ;
    public final void rule__AbsEXP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5785:1: ( rule__AbsEXP__Group__1__Impl rule__AbsEXP__Group__2 )
            // InternalSocrates.g:5786:2: rule__AbsEXP__Group__1__Impl rule__AbsEXP__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__AbsEXP__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbsEXP__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsEXP__Group__1"


    // $ANTLR start "rule__AbsEXP__Group__1__Impl"
    // InternalSocrates.g:5793:1: rule__AbsEXP__Group__1__Impl : ( ( rule__AbsEXP__Exp1Assignment_1 ) ) ;
    public final void rule__AbsEXP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5797:1: ( ( ( rule__AbsEXP__Exp1Assignment_1 ) ) )
            // InternalSocrates.g:5798:1: ( ( rule__AbsEXP__Exp1Assignment_1 ) )
            {
            // InternalSocrates.g:5798:1: ( ( rule__AbsEXP__Exp1Assignment_1 ) )
            // InternalSocrates.g:5799:2: ( rule__AbsEXP__Exp1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbsEXPAccess().getExp1Assignment_1()); 
            }
            // InternalSocrates.g:5800:2: ( rule__AbsEXP__Exp1Assignment_1 )
            // InternalSocrates.g:5800:3: rule__AbsEXP__Exp1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AbsEXP__Exp1Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbsEXPAccess().getExp1Assignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsEXP__Group__1__Impl"


    // $ANTLR start "rule__AbsEXP__Group__2"
    // InternalSocrates.g:5808:1: rule__AbsEXP__Group__2 : rule__AbsEXP__Group__2__Impl ;
    public final void rule__AbsEXP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5812:1: ( rule__AbsEXP__Group__2__Impl )
            // InternalSocrates.g:5813:2: rule__AbsEXP__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbsEXP__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsEXP__Group__2"


    // $ANTLR start "rule__AbsEXP__Group__2__Impl"
    // InternalSocrates.g:5819:1: rule__AbsEXP__Group__2__Impl : ( '|' ) ;
    public final void rule__AbsEXP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5823:1: ( ( '|' ) )
            // InternalSocrates.g:5824:1: ( '|' )
            {
            // InternalSocrates.g:5824:1: ( '|' )
            // InternalSocrates.g:5825:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbsEXPAccess().getVerticalLineKeyword_2()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbsEXPAccess().getVerticalLineKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsEXP__Group__2__Impl"


    // $ANTLR start "rule__Normexp__Group__0"
    // InternalSocrates.g:5835:1: rule__Normexp__Group__0 : rule__Normexp__Group__0__Impl rule__Normexp__Group__1 ;
    public final void rule__Normexp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5839:1: ( rule__Normexp__Group__0__Impl rule__Normexp__Group__1 )
            // InternalSocrates.g:5840:2: rule__Normexp__Group__0__Impl rule__Normexp__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Normexp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Normexp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normexp__Group__0"


    // $ANTLR start "rule__Normexp__Group__0__Impl"
    // InternalSocrates.g:5847:1: rule__Normexp__Group__0__Impl : ( '||' ) ;
    public final void rule__Normexp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5851:1: ( ( '||' ) )
            // InternalSocrates.g:5852:1: ( '||' )
            {
            // InternalSocrates.g:5852:1: ( '||' )
            // InternalSocrates.g:5853:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNormexpAccess().getVerticalLineVerticalLineKeyword_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNormexpAccess().getVerticalLineVerticalLineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normexp__Group__0__Impl"


    // $ANTLR start "rule__Normexp__Group__1"
    // InternalSocrates.g:5862:1: rule__Normexp__Group__1 : rule__Normexp__Group__1__Impl rule__Normexp__Group__2 ;
    public final void rule__Normexp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5866:1: ( rule__Normexp__Group__1__Impl rule__Normexp__Group__2 )
            // InternalSocrates.g:5867:2: rule__Normexp__Group__1__Impl rule__Normexp__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Normexp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Normexp__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normexp__Group__1"


    // $ANTLR start "rule__Normexp__Group__1__Impl"
    // InternalSocrates.g:5874:1: rule__Normexp__Group__1__Impl : ( ( rule__Normexp__Exp1Assignment_1 ) ) ;
    public final void rule__Normexp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5878:1: ( ( ( rule__Normexp__Exp1Assignment_1 ) ) )
            // InternalSocrates.g:5879:1: ( ( rule__Normexp__Exp1Assignment_1 ) )
            {
            // InternalSocrates.g:5879:1: ( ( rule__Normexp__Exp1Assignment_1 ) )
            // InternalSocrates.g:5880:2: ( rule__Normexp__Exp1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNormexpAccess().getExp1Assignment_1()); 
            }
            // InternalSocrates.g:5881:2: ( rule__Normexp__Exp1Assignment_1 )
            // InternalSocrates.g:5881:3: rule__Normexp__Exp1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Normexp__Exp1Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNormexpAccess().getExp1Assignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normexp__Group__1__Impl"


    // $ANTLR start "rule__Normexp__Group__2"
    // InternalSocrates.g:5889:1: rule__Normexp__Group__2 : rule__Normexp__Group__2__Impl ;
    public final void rule__Normexp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5893:1: ( rule__Normexp__Group__2__Impl )
            // InternalSocrates.g:5894:2: rule__Normexp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Normexp__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normexp__Group__2"


    // $ANTLR start "rule__Normexp__Group__2__Impl"
    // InternalSocrates.g:5900:1: rule__Normexp__Group__2__Impl : ( '||' ) ;
    public final void rule__Normexp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5904:1: ( ( '||' ) )
            // InternalSocrates.g:5905:1: ( '||' )
            {
            // InternalSocrates.g:5905:1: ( '||' )
            // InternalSocrates.g:5906:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNormexpAccess().getVerticalLineVerticalLineKeyword_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNormexpAccess().getVerticalLineVerticalLineKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normexp__Group__2__Impl"


    // $ANTLR start "rule__Sin__Group__0"
    // InternalSocrates.g:5916:1: rule__Sin__Group__0 : rule__Sin__Group__0__Impl rule__Sin__Group__1 ;
    public final void rule__Sin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5920:1: ( rule__Sin__Group__0__Impl rule__Sin__Group__1 )
            // InternalSocrates.g:5921:2: rule__Sin__Group__0__Impl rule__Sin__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Sin__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sin__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__0"


    // $ANTLR start "rule__Sin__Group__0__Impl"
    // InternalSocrates.g:5928:1: rule__Sin__Group__0__Impl : ( 'sin' ) ;
    public final void rule__Sin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5932:1: ( ( 'sin' ) )
            // InternalSocrates.g:5933:1: ( 'sin' )
            {
            // InternalSocrates.g:5933:1: ( 'sin' )
            // InternalSocrates.g:5934:2: 'sin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSinAccess().getSinKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSinAccess().getSinKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__0__Impl"


    // $ANTLR start "rule__Sin__Group__1"
    // InternalSocrates.g:5943:1: rule__Sin__Group__1 : rule__Sin__Group__1__Impl rule__Sin__Group__2 ;
    public final void rule__Sin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5947:1: ( rule__Sin__Group__1__Impl rule__Sin__Group__2 )
            // InternalSocrates.g:5948:2: rule__Sin__Group__1__Impl rule__Sin__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Sin__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sin__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__1"


    // $ANTLR start "rule__Sin__Group__1__Impl"
    // InternalSocrates.g:5955:1: rule__Sin__Group__1__Impl : ( ruleLPAREN ) ;
    public final void rule__Sin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5959:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:5960:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:5960:1: ( ruleLPAREN )
            // InternalSocrates.g:5961:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSinAccess().getLPARENParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSinAccess().getLPARENParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__1__Impl"


    // $ANTLR start "rule__Sin__Group__2"
    // InternalSocrates.g:5970:1: rule__Sin__Group__2 : rule__Sin__Group__2__Impl rule__Sin__Group__3 ;
    public final void rule__Sin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5974:1: ( rule__Sin__Group__2__Impl rule__Sin__Group__3 )
            // InternalSocrates.g:5975:2: rule__Sin__Group__2__Impl rule__Sin__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Sin__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sin__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__2"


    // $ANTLR start "rule__Sin__Group__2__Impl"
    // InternalSocrates.g:5982:1: rule__Sin__Group__2__Impl : ( ( rule__Sin__Exp1Assignment_2 ) ) ;
    public final void rule__Sin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:5986:1: ( ( ( rule__Sin__Exp1Assignment_2 ) ) )
            // InternalSocrates.g:5987:1: ( ( rule__Sin__Exp1Assignment_2 ) )
            {
            // InternalSocrates.g:5987:1: ( ( rule__Sin__Exp1Assignment_2 ) )
            // InternalSocrates.g:5988:2: ( rule__Sin__Exp1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSinAccess().getExp1Assignment_2()); 
            }
            // InternalSocrates.g:5989:2: ( rule__Sin__Exp1Assignment_2 )
            // InternalSocrates.g:5989:3: rule__Sin__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sin__Exp1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSinAccess().getExp1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__2__Impl"


    // $ANTLR start "rule__Sin__Group__3"
    // InternalSocrates.g:5997:1: rule__Sin__Group__3 : rule__Sin__Group__3__Impl ;
    public final void rule__Sin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6001:1: ( rule__Sin__Group__3__Impl )
            // InternalSocrates.g:6002:2: rule__Sin__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sin__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__3"


    // $ANTLR start "rule__Sin__Group__3__Impl"
    // InternalSocrates.g:6008:1: rule__Sin__Group__3__Impl : ( ruleRPAREN ) ;
    public final void rule__Sin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6012:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:6013:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:6013:1: ( ruleRPAREN )
            // InternalSocrates.g:6014:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSinAccess().getRPARENParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSinAccess().getRPARENParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__3__Impl"


    // $ANTLR start "rule__Cos__Group__0"
    // InternalSocrates.g:6024:1: rule__Cos__Group__0 : rule__Cos__Group__0__Impl rule__Cos__Group__1 ;
    public final void rule__Cos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6028:1: ( rule__Cos__Group__0__Impl rule__Cos__Group__1 )
            // InternalSocrates.g:6029:2: rule__Cos__Group__0__Impl rule__Cos__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Cos__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Cos__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__0"


    // $ANTLR start "rule__Cos__Group__0__Impl"
    // InternalSocrates.g:6036:1: rule__Cos__Group__0__Impl : ( 'cos' ) ;
    public final void rule__Cos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6040:1: ( ( 'cos' ) )
            // InternalSocrates.g:6041:1: ( 'cos' )
            {
            // InternalSocrates.g:6041:1: ( 'cos' )
            // InternalSocrates.g:6042:2: 'cos'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCosAccess().getCosKeyword_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCosAccess().getCosKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__0__Impl"


    // $ANTLR start "rule__Cos__Group__1"
    // InternalSocrates.g:6051:1: rule__Cos__Group__1 : rule__Cos__Group__1__Impl rule__Cos__Group__2 ;
    public final void rule__Cos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6055:1: ( rule__Cos__Group__1__Impl rule__Cos__Group__2 )
            // InternalSocrates.g:6056:2: rule__Cos__Group__1__Impl rule__Cos__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Cos__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Cos__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__1"


    // $ANTLR start "rule__Cos__Group__1__Impl"
    // InternalSocrates.g:6063:1: rule__Cos__Group__1__Impl : ( ruleLPAREN ) ;
    public final void rule__Cos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6067:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:6068:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:6068:1: ( ruleLPAREN )
            // InternalSocrates.g:6069:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCosAccess().getLPARENParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCosAccess().getLPARENParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__1__Impl"


    // $ANTLR start "rule__Cos__Group__2"
    // InternalSocrates.g:6078:1: rule__Cos__Group__2 : rule__Cos__Group__2__Impl rule__Cos__Group__3 ;
    public final void rule__Cos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6082:1: ( rule__Cos__Group__2__Impl rule__Cos__Group__3 )
            // InternalSocrates.g:6083:2: rule__Cos__Group__2__Impl rule__Cos__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Cos__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Cos__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__2"


    // $ANTLR start "rule__Cos__Group__2__Impl"
    // InternalSocrates.g:6090:1: rule__Cos__Group__2__Impl : ( ( rule__Cos__Exp1Assignment_2 ) ) ;
    public final void rule__Cos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6094:1: ( ( ( rule__Cos__Exp1Assignment_2 ) ) )
            // InternalSocrates.g:6095:1: ( ( rule__Cos__Exp1Assignment_2 ) )
            {
            // InternalSocrates.g:6095:1: ( ( rule__Cos__Exp1Assignment_2 ) )
            // InternalSocrates.g:6096:2: ( rule__Cos__Exp1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCosAccess().getExp1Assignment_2()); 
            }
            // InternalSocrates.g:6097:2: ( rule__Cos__Exp1Assignment_2 )
            // InternalSocrates.g:6097:3: rule__Cos__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cos__Exp1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCosAccess().getExp1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__2__Impl"


    // $ANTLR start "rule__Cos__Group__3"
    // InternalSocrates.g:6105:1: rule__Cos__Group__3 : rule__Cos__Group__3__Impl ;
    public final void rule__Cos__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6109:1: ( rule__Cos__Group__3__Impl )
            // InternalSocrates.g:6110:2: rule__Cos__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cos__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__3"


    // $ANTLR start "rule__Cos__Group__3__Impl"
    // InternalSocrates.g:6116:1: rule__Cos__Group__3__Impl : ( ruleRPAREN ) ;
    public final void rule__Cos__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6120:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:6121:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:6121:1: ( ruleRPAREN )
            // InternalSocrates.g:6122:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCosAccess().getRPARENParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCosAccess().getRPARENParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__3__Impl"


    // $ANTLR start "rule__Sqrt__Group__0"
    // InternalSocrates.g:6132:1: rule__Sqrt__Group__0 : rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1 ;
    public final void rule__Sqrt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6136:1: ( rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1 )
            // InternalSocrates.g:6137:2: rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Sqrt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__0"


    // $ANTLR start "rule__Sqrt__Group__0__Impl"
    // InternalSocrates.g:6144:1: rule__Sqrt__Group__0__Impl : ( 'sqrt' ) ;
    public final void rule__Sqrt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6148:1: ( ( 'sqrt' ) )
            // InternalSocrates.g:6149:1: ( 'sqrt' )
            {
            // InternalSocrates.g:6149:1: ( 'sqrt' )
            // InternalSocrates.g:6150:2: 'sqrt'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSqrtAccess().getSqrtKeyword_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSqrtAccess().getSqrtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__0__Impl"


    // $ANTLR start "rule__Sqrt__Group__1"
    // InternalSocrates.g:6159:1: rule__Sqrt__Group__1 : rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2 ;
    public final void rule__Sqrt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6163:1: ( rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2 )
            // InternalSocrates.g:6164:2: rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Sqrt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__1"


    // $ANTLR start "rule__Sqrt__Group__1__Impl"
    // InternalSocrates.g:6171:1: rule__Sqrt__Group__1__Impl : ( ruleLPAREN ) ;
    public final void rule__Sqrt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6175:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:6176:1: ( ruleLPAREN )
            {
            // InternalSocrates.g:6176:1: ( ruleLPAREN )
            // InternalSocrates.g:6177:2: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSqrtAccess().getLPARENParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSqrtAccess().getLPARENParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__1__Impl"


    // $ANTLR start "rule__Sqrt__Group__2"
    // InternalSocrates.g:6186:1: rule__Sqrt__Group__2 : rule__Sqrt__Group__2__Impl rule__Sqrt__Group__3 ;
    public final void rule__Sqrt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6190:1: ( rule__Sqrt__Group__2__Impl rule__Sqrt__Group__3 )
            // InternalSocrates.g:6191:2: rule__Sqrt__Group__2__Impl rule__Sqrt__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Sqrt__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__2"


    // $ANTLR start "rule__Sqrt__Group__2__Impl"
    // InternalSocrates.g:6198:1: rule__Sqrt__Group__2__Impl : ( ( rule__Sqrt__Exp1Assignment_2 ) ) ;
    public final void rule__Sqrt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6202:1: ( ( ( rule__Sqrt__Exp1Assignment_2 ) ) )
            // InternalSocrates.g:6203:1: ( ( rule__Sqrt__Exp1Assignment_2 ) )
            {
            // InternalSocrates.g:6203:1: ( ( rule__Sqrt__Exp1Assignment_2 ) )
            // InternalSocrates.g:6204:2: ( rule__Sqrt__Exp1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSqrtAccess().getExp1Assignment_2()); 
            }
            // InternalSocrates.g:6205:2: ( rule__Sqrt__Exp1Assignment_2 )
            // InternalSocrates.g:6205:3: rule__Sqrt__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sqrt__Exp1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSqrtAccess().getExp1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__2__Impl"


    // $ANTLR start "rule__Sqrt__Group__3"
    // InternalSocrates.g:6213:1: rule__Sqrt__Group__3 : rule__Sqrt__Group__3__Impl ;
    public final void rule__Sqrt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6217:1: ( rule__Sqrt__Group__3__Impl )
            // InternalSocrates.g:6218:2: rule__Sqrt__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__3"


    // $ANTLR start "rule__Sqrt__Group__3__Impl"
    // InternalSocrates.g:6224:1: rule__Sqrt__Group__3__Impl : ( ruleRPAREN ) ;
    public final void rule__Sqrt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6228:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:6229:1: ( ruleRPAREN )
            {
            // InternalSocrates.g:6229:1: ( ruleRPAREN )
            // InternalSocrates.g:6230:2: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSqrtAccess().getRPARENParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSqrtAccess().getRPARENParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__3__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalSocrates.g:6240:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6244:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalSocrates.g:6245:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalSocrates.g:6252:1: rule__FLOAT__Group__0__Impl : ( rulenumber ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6256:1: ( ( rulenumber ) )
            // InternalSocrates.g:6257:1: ( rulenumber )
            {
            // InternalSocrates.g:6257:1: ( rulenumber )
            // InternalSocrates.g:6258:2: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getNumberParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getNumberParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalSocrates.g:6267:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6271:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalSocrates.g:6272:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalSocrates.g:6279:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6283:1: ( ( '.' ) )
            // InternalSocrates.g:6284:1: ( '.' )
            {
            // InternalSocrates.g:6284:1: ( '.' )
            // InternalSocrates.g:6285:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalSocrates.g:6294:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6298:1: ( rule__FLOAT__Group__2__Impl )
            // InternalSocrates.g:6299:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalSocrates.g:6305:1: rule__FLOAT__Group__2__Impl : ( rulenumber ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6309:1: ( ( rulenumber ) )
            // InternalSocrates.g:6310:1: ( rulenumber )
            {
            // InternalSocrates.g:6310:1: ( rulenumber )
            // InternalSocrates.g:6311:2: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getNumberParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getNumberParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__PATH__Group__0"
    // InternalSocrates.g:6321:1: rule__PATH__Group__0 : rule__PATH__Group__0__Impl rule__PATH__Group__1 ;
    public final void rule__PATH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6325:1: ( rule__PATH__Group__0__Impl rule__PATH__Group__1 )
            // InternalSocrates.g:6326:2: rule__PATH__Group__0__Impl rule__PATH__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PATH__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PATH__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PATH__Group__0"


    // $ANTLR start "rule__PATH__Group__0__Impl"
    // InternalSocrates.g:6333:1: rule__PATH__Group__0__Impl : ( ( rule__PATH__Alternatives_0 ) ) ;
    public final void rule__PATH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6337:1: ( ( ( rule__PATH__Alternatives_0 ) ) )
            // InternalSocrates.g:6338:1: ( ( rule__PATH__Alternatives_0 ) )
            {
            // InternalSocrates.g:6338:1: ( ( rule__PATH__Alternatives_0 ) )
            // InternalSocrates.g:6339:2: ( rule__PATH__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPATHAccess().getAlternatives_0()); 
            }
            // InternalSocrates.g:6340:2: ( rule__PATH__Alternatives_0 )
            // InternalSocrates.g:6340:3: rule__PATH__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PATH__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPATHAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PATH__Group__0__Impl"


    // $ANTLR start "rule__PATH__Group__1"
    // InternalSocrates.g:6348:1: rule__PATH__Group__1 : rule__PATH__Group__1__Impl ;
    public final void rule__PATH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6352:1: ( rule__PATH__Group__1__Impl )
            // InternalSocrates.g:6353:2: rule__PATH__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PATH__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PATH__Group__1"


    // $ANTLR start "rule__PATH__Group__1__Impl"
    // InternalSocrates.g:6359:1: rule__PATH__Group__1__Impl : ( ( rule__PATH__Group_1__0 )* ) ;
    public final void rule__PATH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6363:1: ( ( ( rule__PATH__Group_1__0 )* ) )
            // InternalSocrates.g:6364:1: ( ( rule__PATH__Group_1__0 )* )
            {
            // InternalSocrates.g:6364:1: ( ( rule__PATH__Group_1__0 )* )
            // InternalSocrates.g:6365:2: ( rule__PATH__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPATHAccess().getGroup_1()); 
            }
            // InternalSocrates.g:6366:2: ( rule__PATH__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSocrates.g:6366:3: rule__PATH__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__PATH__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPATHAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PATH__Group__1__Impl"


    // $ANTLR start "rule__PATH__Group_1__0"
    // InternalSocrates.g:6375:1: rule__PATH__Group_1__0 : rule__PATH__Group_1__0__Impl rule__PATH__Group_1__1 ;
    public final void rule__PATH__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6379:1: ( rule__PATH__Group_1__0__Impl rule__PATH__Group_1__1 )
            // InternalSocrates.g:6380:2: rule__PATH__Group_1__0__Impl rule__PATH__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__PATH__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PATH__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PATH__Group_1__0"


    // $ANTLR start "rule__PATH__Group_1__0__Impl"
    // InternalSocrates.g:6387:1: rule__PATH__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__PATH__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6391:1: ( ( RULE_ID ) )
            // InternalSocrates.g:6392:1: ( RULE_ID )
            {
            // InternalSocrates.g:6392:1: ( RULE_ID )
            // InternalSocrates.g:6393:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PATH__Group_1__0__Impl"


    // $ANTLR start "rule__PATH__Group_1__1"
    // InternalSocrates.g:6402:1: rule__PATH__Group_1__1 : rule__PATH__Group_1__1__Impl ;
    public final void rule__PATH__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6406:1: ( rule__PATH__Group_1__1__Impl )
            // InternalSocrates.g:6407:2: rule__PATH__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PATH__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PATH__Group_1__1"


    // $ANTLR start "rule__PATH__Group_1__1__Impl"
    // InternalSocrates.g:6413:1: rule__PATH__Group_1__1__Impl : ( '/' ) ;
    public final void rule__PATH__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6417:1: ( ( '/' ) )
            // InternalSocrates.g:6418:1: ( '/' )
            {
            // InternalSocrates.g:6418:1: ( '/' )
            // InternalSocrates.g:6419:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPATHAccess().getSolidusKeyword_1_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPATHAccess().getSolidusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PATH__Group_1__1__Impl"


    // $ANTLR start "rule__Socrates__OraclesAssignment"
    // InternalSocrates.g:6429:1: rule__Socrates__OraclesAssignment : ( ruleOracle ) ;
    public final void rule__Socrates__OraclesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6433:1: ( ( ruleOracle ) )
            // InternalSocrates.g:6434:2: ( ruleOracle )
            {
            // InternalSocrates.g:6434:2: ( ruleOracle )
            // InternalSocrates.g:6435:3: ruleOracle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSocratesAccess().getOraclesOracleParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOracle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSocratesAccess().getOraclesOracleParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Socrates__OraclesAssignment"


    // $ANTLR start "rule__Oracle__ModelNameAssignment_2"
    // InternalSocrates.g:6444:1: rule__Oracle__ModelNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Oracle__ModelNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6448:1: ( ( RULE_ID ) )
            // InternalSocrates.g:6449:2: ( RULE_ID )
            {
            // InternalSocrates.g:6449:2: ( RULE_ID )
            // InternalSocrates.g:6450:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getModelNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getModelNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__ModelNameAssignment_2"


    // $ANTLR start "rule__Oracle__PathAssignment_4_1"
    // InternalSocrates.g:6459:1: rule__Oracle__PathAssignment_4_1 : ( rulePATH ) ;
    public final void rule__Oracle__PathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6463:1: ( ( rulePATH ) )
            // InternalSocrates.g:6464:2: ( rulePATH )
            {
            // InternalSocrates.g:6464:2: ( rulePATH )
            // InternalSocrates.g:6465:3: rulePATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getPathPATHParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getPathPATHParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__PathAssignment_4_1"


    // $ANTLR start "rule__Oracle__ReqnameAssignment_6"
    // InternalSocrates.g:6474:1: rule__Oracle__ReqnameAssignment_6 : ( ruleReqId ) ;
    public final void rule__Oracle__ReqnameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6478:1: ( ( ruleReqId ) )
            // InternalSocrates.g:6479:2: ( ruleReqId )
            {
            // InternalSocrates.g:6479:2: ( ruleReqId )
            // InternalSocrates.g:6480:3: ruleReqId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getReqnameReqIdParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReqId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getReqnameReqIdParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__ReqnameAssignment_6"


    // $ANTLR start "rule__Oracle__SigndefAssignment_8"
    // InternalSocrates.g:6489:1: rule__Oracle__SigndefAssignment_8 : ( ruleSignalsdefinition ) ;
    public final void rule__Oracle__SigndefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6493:1: ( ( ruleSignalsdefinition ) )
            // InternalSocrates.g:6494:2: ( ruleSignalsdefinition )
            {
            // InternalSocrates.g:6494:2: ( ruleSignalsdefinition )
            // InternalSocrates.g:6495:3: ruleSignalsdefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getSigndefSignalsdefinitionParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignalsdefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getSigndefSignalsdefinitionParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__SigndefAssignment_8"


    // $ANTLR start "rule__Oracle__ConstantDefinitionsAssignment_9"
    // InternalSocrates.g:6504:1: rule__Oracle__ConstantDefinitionsAssignment_9 : ( ruleConstantsDefinition ) ;
    public final void rule__Oracle__ConstantDefinitionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6508:1: ( ( ruleConstantsDefinition ) )
            // InternalSocrates.g:6509:2: ( ruleConstantsDefinition )
            {
            // InternalSocrates.g:6509:2: ( ruleConstantsDefinition )
            // InternalSocrates.g:6510:3: ruleConstantsDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getConstantDefinitionsConstantsDefinitionParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstantsDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getConstantDefinitionsConstantsDefinitionParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__ConstantDefinitionsAssignment_9"


    // $ANTLR start "rule__Oracle__RequirementAssignment_10"
    // InternalSocrates.g:6519:1: rule__Oracle__RequirementAssignment_10 : ( ruleRequirement ) ;
    public final void rule__Oracle__RequirementAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6523:1: ( ( ruleRequirement ) )
            // InternalSocrates.g:6524:2: ( ruleRequirement )
            {
            // InternalSocrates.g:6524:2: ( ruleRequirement )
            // InternalSocrates.g:6525:3: ruleRequirement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOracleAccess().getRequirementRequirementParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOracleAccess().getRequirementRequirementParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__RequirementAssignment_10"


    // $ANTLR start "rule__Requirement__FormulaAssignment_4"
    // InternalSocrates.g:6534:1: rule__Requirement__FormulaAssignment_4 : ( ruleformula ) ;
    public final void rule__Requirement__FormulaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6538:1: ( ( ruleformula ) )
            // InternalSocrates.g:6539:2: ( ruleformula )
            {
            // InternalSocrates.g:6539:2: ( ruleformula )
            // InternalSocrates.g:6540:3: ruleformula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getFormulaFormulaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getFormulaFormulaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__FormulaAssignment_4"


    // $ANTLR start "rule__Signalsdefinition__SignalsAssignment_1"
    // InternalSocrates.g:6549:1: rule__Signalsdefinition__SignalsAssignment_1 : ( ruleSignalID ) ;
    public final void rule__Signalsdefinition__SignalsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6553:1: ( ( ruleSignalID ) )
            // InternalSocrates.g:6554:2: ( ruleSignalID )
            {
            // InternalSocrates.g:6554:2: ( ruleSignalID )
            // InternalSocrates.g:6555:3: ruleSignalID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionAccess().getSignalsSignalIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignalID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionAccess().getSignalsSignalIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__SignalsAssignment_1"


    // $ANTLR start "rule__Signalsdefinition__SignalsAssignment_2_1"
    // InternalSocrates.g:6564:1: rule__Signalsdefinition__SignalsAssignment_2_1 : ( ruleSignalID ) ;
    public final void rule__Signalsdefinition__SignalsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6568:1: ( ( ruleSignalID ) )
            // InternalSocrates.g:6569:2: ( ruleSignalID )
            {
            // InternalSocrates.g:6569:2: ( ruleSignalID )
            // InternalSocrates.g:6570:3: ruleSignalID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalsdefinitionAccess().getSignalsSignalIDParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignalID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalsdefinitionAccess().getSignalsSignalIDParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signalsdefinition__SignalsAssignment_2_1"


    // $ANTLR start "rule__ConstantsDefinition__ConstantsAssignment_1"
    // InternalSocrates.g:6579:1: rule__ConstantsDefinition__ConstantsAssignment_1 : ( ruleConstantDefinition ) ;
    public final void rule__ConstantsDefinition__ConstantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6583:1: ( ( ruleConstantDefinition ) )
            // InternalSocrates.g:6584:2: ( ruleConstantDefinition )
            {
            // InternalSocrates.g:6584:2: ( ruleConstantDefinition )
            // InternalSocrates.g:6585:3: ruleConstantDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionAccess().getConstantsConstantDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionAccess().getConstantsConstantDefinitionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__ConstantsAssignment_1"


    // $ANTLR start "rule__ConstantsDefinition__ConstantsAssignment_2_1"
    // InternalSocrates.g:6594:1: rule__ConstantsDefinition__ConstantsAssignment_2_1 : ( ruleConstantDefinition ) ;
    public final void rule__ConstantsDefinition__ConstantsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6598:1: ( ( ruleConstantDefinition ) )
            // InternalSocrates.g:6599:2: ( ruleConstantDefinition )
            {
            // InternalSocrates.g:6599:2: ( ruleConstantDefinition )
            // InternalSocrates.g:6600:3: ruleConstantDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantsDefinitionAccess().getConstantsConstantDefinitionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantsDefinitionAccess().getConstantsConstantDefinitionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantsDefinition__ConstantsAssignment_2_1"


    // $ANTLR start "rule__ConstantDefinition__ConstantidAssignment_0"
    // InternalSocrates.g:6609:1: rule__ConstantDefinition__ConstantidAssignment_0 : ( ruleConstantId ) ;
    public final void rule__ConstantDefinition__ConstantidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6613:1: ( ( ruleConstantId ) )
            // InternalSocrates.g:6614:2: ( ruleConstantId )
            {
            // InternalSocrates.g:6614:2: ( ruleConstantId )
            // InternalSocrates.g:6615:3: ruleConstantId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getConstantidConstantIdParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstantId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getConstantidConstantIdParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__ConstantidAssignment_0"


    // $ANTLR start "rule__ConstantDefinition__ValueAssignment_3"
    // InternalSocrates.g:6624:1: rule__ConstantDefinition__ValueAssignment_3 : ( rulenumber ) ;
    public final void rule__ConstantDefinition__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6628:1: ( ( rulenumber ) )
            // InternalSocrates.g:6629:2: ( rulenumber )
            {
            // InternalSocrates.g:6629:2: ( rulenumber )
            // InternalSocrates.g:6630:3: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getValueNumberParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getValueNumberParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__ValueAssignment_3"


    // $ANTLR start "rule__SignalID__NameAssignment"
    // InternalSocrates.g:6639:1: rule__SignalID__NameAssignment : ( RULE_ID ) ;
    public final void rule__SignalID__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6643:1: ( ( RULE_ID ) )
            // InternalSocrates.g:6644:2: ( RULE_ID )
            {
            // InternalSocrates.g:6644:2: ( RULE_ID )
            // InternalSocrates.g:6645:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalIDAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalIDAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalID__NameAssignment"


    // $ANTLR start "rule__ConstantId__NameAssignment"
    // InternalSocrates.g:6654:1: rule__ConstantId__NameAssignment : ( RULE_ID ) ;
    public final void rule__ConstantId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6658:1: ( ( RULE_ID ) )
            // InternalSocrates.g:6659:2: ( RULE_ID )
            {
            // InternalSocrates.g:6659:2: ( RULE_ID )
            // InternalSocrates.g:6660:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantIdAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantIdAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantId__NameAssignment"


    // $ANTLR start "rule__ForAllformula__BoundAssignment_1"
    // InternalSocrates.g:6669:1: rule__ForAllformula__BoundAssignment_1 : ( ruleboundterm ) ;
    public final void rule__ForAllformula__BoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6673:1: ( ( ruleboundterm ) )
            // InternalSocrates.g:6674:2: ( ruleboundterm )
            {
            // InternalSocrates.g:6674:2: ( ruleboundterm )
            // InternalSocrates.g:6675:3: ruleboundterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaAccess().getBoundBoundtermParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleboundterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaAccess().getBoundBoundtermParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__BoundAssignment_1"


    // $ANTLR start "rule__ForAllformula__ForallchildAssignment_4"
    // InternalSocrates.g:6684:1: rule__ForAllformula__ForallchildAssignment_4 : ( ruleformula ) ;
    public final void rule__ForAllformula__ForallchildAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6688:1: ( ( ruleformula ) )
            // InternalSocrates.g:6689:2: ( ruleformula )
            {
            // InternalSocrates.g:6689:2: ( ruleformula )
            // InternalSocrates.g:6690:3: ruleformula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAllformulaAccess().getForallchildFormulaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAllformulaAccess().getForallchildFormulaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAllformula__ForallchildAssignment_4"


    // $ANTLR start "rule__Existsformula__BoundAssignment_1"
    // InternalSocrates.g:6699:1: rule__Existsformula__BoundAssignment_1 : ( ruleboundterm ) ;
    public final void rule__Existsformula__BoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6703:1: ( ( ruleboundterm ) )
            // InternalSocrates.g:6704:2: ( ruleboundterm )
            {
            // InternalSocrates.g:6704:2: ( ruleboundterm )
            // InternalSocrates.g:6705:3: ruleboundterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaAccess().getBoundBoundtermParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleboundterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaAccess().getBoundBoundtermParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__BoundAssignment_1"


    // $ANTLR start "rule__Existsformula__ExistschildAssignment_4"
    // InternalSocrates.g:6714:1: rule__Existsformula__ExistschildAssignment_4 : ( ruleformula ) ;
    public final void rule__Existsformula__ExistschildAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6718:1: ( ( ruleformula ) )
            // InternalSocrates.g:6719:2: ( ruleformula )
            {
            // InternalSocrates.g:6719:2: ( ruleformula )
            // InternalSocrates.g:6720:3: ruleformula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistsformulaAccess().getExistschildFormulaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistsformulaAccess().getExistschildFormulaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Existsformula__ExistschildAssignment_4"


    // $ANTLR start "rule__Tvariable__NameAssignment"
    // InternalSocrates.g:6729:1: rule__Tvariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Tvariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6733:1: ( ( RULE_ID ) )
            // InternalSocrates.g:6734:2: ( RULE_ID )
            {
            // InternalSocrates.g:6734:2: ( RULE_ID )
            // InternalSocrates.g:6735:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTvariableAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTvariableAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tvariable__NameAssignment"


    // $ANTLR start "rule__Negationformula__NegationchildAssignment_1"
    // InternalSocrates.g:6744:1: rule__Negationformula__NegationchildAssignment_1 : ( ruleformula ) ;
    public final void rule__Negationformula__NegationchildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6748:1: ( ( ruleformula ) )
            // InternalSocrates.g:6749:2: ( ruleformula )
            {
            // InternalSocrates.g:6749:2: ( ruleformula )
            // InternalSocrates.g:6750:3: ruleformula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationformulaAccess().getNegationchildFormulaParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationformulaAccess().getNegationchildFormulaParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negationformula__NegationchildAssignment_1"


    // $ANTLR start "rule__Formula__FAssignment_0"
    // InternalSocrates.g:6759:1: rule__Formula__FAssignment_0 : ( rulebasicformulae ) ;
    public final void rule__Formula__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6763:1: ( ( rulebasicformulae ) )
            // InternalSocrates.g:6764:2: ( rulebasicformulae )
            {
            // InternalSocrates.g:6764:2: ( rulebasicformulae )
            // InternalSocrates.g:6765:3: rulebasicformulae
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getFBasicformulaeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulebasicformulae();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getFBasicformulaeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__FAssignment_0"


    // $ANTLR start "rule__Formula__FAssignment_1"
    // InternalSocrates.g:6774:1: rule__Formula__FAssignment_1 : ( ruleformulab ) ;
    public final void rule__Formula__FAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6778:1: ( ( ruleformulab ) )
            // InternalSocrates.g:6779:2: ( ruleformulab )
            {
            // InternalSocrates.g:6779:2: ( ruleformulab )
            // InternalSocrates.g:6780:3: ruleformulab
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getFFormulabParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformulab();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getFFormulabParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__FAssignment_1"


    // $ANTLR start "rule__Formulab__AAssignment_0"
    // InternalSocrates.g:6789:1: rule__Formulab__AAssignment_0 : ( ruleterm ) ;
    public final void rule__Formulab__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6793:1: ( ( ruleterm ) )
            // InternalSocrates.g:6794:2: ( ruleterm )
            {
            // InternalSocrates.g:6794:2: ( ruleterm )
            // InternalSocrates.g:6795:3: ruleterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabAccess().getATermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabAccess().getATermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulab__AAssignment_0"


    // $ANTLR start "rule__Formulab__TAssignment_1"
    // InternalSocrates.g:6804:1: rule__Formulab__TAssignment_1 : ( ruleformulabprime ) ;
    public final void rule__Formulab__TAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6808:1: ( ( ruleformulabprime ) )
            // InternalSocrates.g:6809:2: ( ruleformulabprime )
            {
            // InternalSocrates.g:6809:2: ( ruleformulabprime )
            // InternalSocrates.g:6810:3: ruleformulabprime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabAccess().getTFormulabprimeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformulabprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabAccess().getTFormulabprimeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulab__TAssignment_1"


    // $ANTLR start "rule__Formulabprime__OpAssignment_0"
    // InternalSocrates.g:6819:1: rule__Formulabprime__OpAssignment_0 : ( ( rule__Formulabprime__OpAlternatives_0_0 ) ) ;
    public final void rule__Formulabprime__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6823:1: ( ( ( rule__Formulabprime__OpAlternatives_0_0 ) ) )
            // InternalSocrates.g:6824:2: ( ( rule__Formulabprime__OpAlternatives_0_0 ) )
            {
            // InternalSocrates.g:6824:2: ( ( rule__Formulabprime__OpAlternatives_0_0 ) )
            // InternalSocrates.g:6825:3: ( rule__Formulabprime__OpAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabprimeAccess().getOpAlternatives_0_0()); 
            }
            // InternalSocrates.g:6826:3: ( rule__Formulabprime__OpAlternatives_0_0 )
            // InternalSocrates.g:6826:4: rule__Formulabprime__OpAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Formulabprime__OpAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabprimeAccess().getOpAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__OpAssignment_0"


    // $ANTLR start "rule__Formulabprime__T2Assignment_1"
    // InternalSocrates.g:6834:1: rule__Formulabprime__T2Assignment_1 : ( ruleterm ) ;
    public final void rule__Formulabprime__T2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6838:1: ( ( ruleterm ) )
            // InternalSocrates.g:6839:2: ( ruleterm )
            {
            // InternalSocrates.g:6839:2: ( ruleterm )
            // InternalSocrates.g:6840:3: ruleterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabprimeAccess().getT2TermParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabprimeAccess().getT2TermParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__T2Assignment_1"


    // $ANTLR start "rule__Formulabprime__FAssignment_2"
    // InternalSocrates.g:6849:1: rule__Formulabprime__FAssignment_2 : ( ruleformulabprime ) ;
    public final void rule__Formulabprime__FAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6853:1: ( ( ruleformulabprime ) )
            // InternalSocrates.g:6854:2: ( ruleformulabprime )
            {
            // InternalSocrates.g:6854:2: ( ruleformulabprime )
            // InternalSocrates.g:6855:3: ruleformulabprime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulabprimeAccess().getFFormulabprimeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformulabprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulabprimeAccess().getFFormulabprimeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulabprime__FAssignment_2"


    // $ANTLR start "rule__Term__AAssignment_0"
    // InternalSocrates.g:6864:1: rule__Term__AAssignment_0 : ( ruleatom ) ;
    public final void rule__Term__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6868:1: ( ( ruleatom ) )
            // InternalSocrates.g:6869:2: ( ruleatom )
            {
            // InternalSocrates.g:6869:2: ( ruleatom )
            // InternalSocrates.g:6870:3: ruleatom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAAtomParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleatom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAAtomParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__AAssignment_0"


    // $ANTLR start "rule__Term__TAssignment_1"
    // InternalSocrates.g:6879:1: rule__Term__TAssignment_1 : ( ruletermprime ) ;
    public final void rule__Term__TAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6883:1: ( ( ruletermprime ) )
            // InternalSocrates.g:6884:2: ( ruletermprime )
            {
            // InternalSocrates.g:6884:2: ( ruletermprime )
            // InternalSocrates.g:6885:3: ruletermprime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTTermprimeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletermprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTTermprimeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TAssignment_1"


    // $ANTLR start "rule__Termprime__OpAssignment_0"
    // InternalSocrates.g:6894:1: rule__Termprime__OpAssignment_0 : ( ( 'and' ) ) ;
    public final void rule__Termprime__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6898:1: ( ( ( 'and' ) ) )
            // InternalSocrates.g:6899:2: ( ( 'and' ) )
            {
            // InternalSocrates.g:6899:2: ( ( 'and' ) )
            // InternalSocrates.g:6900:3: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermprimeAccess().getOpAndKeyword_0_0()); 
            }
            // InternalSocrates.g:6901:3: ( 'and' )
            // InternalSocrates.g:6902:4: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermprimeAccess().getOpAndKeyword_0_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermprimeAccess().getOpAndKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermprimeAccess().getOpAndKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Termprime__OpAssignment_0"


    // $ANTLR start "rule__Termprime__TAssignment_1"
    // InternalSocrates.g:6913:1: rule__Termprime__TAssignment_1 : ( ruleterm ) ;
    public final void rule__Termprime__TAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6917:1: ( ( ruleterm ) )
            // InternalSocrates.g:6918:2: ( ruleterm )
            {
            // InternalSocrates.g:6918:2: ( ruleterm )
            // InternalSocrates.g:6919:3: ruleterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermprimeAccess().getTTermParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermprimeAccess().getTTermParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Termprime__TAssignment_1"


    // $ANTLR start "rule__Termprime__F1Assignment_2"
    // InternalSocrates.g:6928:1: rule__Termprime__F1Assignment_2 : ( ruletermprime ) ;
    public final void rule__Termprime__F1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6932:1: ( ( ruletermprime ) )
            // InternalSocrates.g:6933:2: ( ruletermprime )
            {
            // InternalSocrates.g:6933:2: ( ruletermprime )
            // InternalSocrates.g:6934:3: ruletermprime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermprimeAccess().getF1TermprimeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletermprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermprimeAccess().getF1TermprimeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Termprime__F1Assignment_2"


    // $ANTLR start "rule__Expression__ExpbAssignment"
    // InternalSocrates.g:6943:1: rule__Expression__ExpbAssignment : ( ruleexpressionb ) ;
    public final void rule__Expression__ExpbAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6947:1: ( ( ruleexpressionb ) )
            // InternalSocrates.g:6948:2: ( ruleexpressionb )
            {
            // InternalSocrates.g:6948:2: ( ruleexpressionb )
            // InternalSocrates.g:6949:3: ruleexpressionb
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpbExpressionbParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionb();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpbExpressionbParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpbAssignment"


    // $ANTLR start "rule__Expressionb__TermAssignment_0_0"
    // InternalSocrates.g:6958:1: rule__Expressionb__TermAssignment_0_0 : ( ruleexpressionterm ) ;
    public final void rule__Expressionb__TermAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6962:1: ( ( ruleexpressionterm ) )
            // InternalSocrates.g:6963:2: ( ruleexpressionterm )
            {
            // InternalSocrates.g:6963:2: ( ruleexpressionterm )
            // InternalSocrates.g:6964:3: ruleexpressionterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getTermExpressiontermParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getTermExpressiontermParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__TermAssignment_0_0"


    // $ANTLR start "rule__Expressionb__ExpprimeAssignment_0_1"
    // InternalSocrates.g:6973:1: rule__Expressionb__ExpprimeAssignment_0_1 : ( ruleexpressionprime ) ;
    public final void rule__Expressionb__ExpprimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6977:1: ( ( ruleexpressionprime ) )
            // InternalSocrates.g:6978:2: ( ruleexpressionprime )
            {
            // InternalSocrates.g:6978:2: ( ruleexpressionprime )
            // InternalSocrates.g:6979:3: ruleexpressionprime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getExpprimeExpressionprimeParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getExpprimeExpressionprimeParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__ExpprimeAssignment_0_1"


    // $ANTLR start "rule__Expressionb__TermAssignment_1_1"
    // InternalSocrates.g:6988:1: rule__Expressionb__TermAssignment_1_1 : ( ruleexpressionterm ) ;
    public final void rule__Expressionb__TermAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:6992:1: ( ( ruleexpressionterm ) )
            // InternalSocrates.g:6993:2: ( ruleexpressionterm )
            {
            // InternalSocrates.g:6993:2: ( ruleexpressionterm )
            // InternalSocrates.g:6994:3: ruleexpressionterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getTermExpressiontermParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getTermExpressiontermParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__TermAssignment_1_1"


    // $ANTLR start "rule__Expressionb__ExpprimeAssignment_1_3"
    // InternalSocrates.g:7003:1: rule__Expressionb__ExpprimeAssignment_1_3 : ( ruleexpressionprime ) ;
    public final void rule__Expressionb__ExpprimeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7007:1: ( ( ruleexpressionprime ) )
            // InternalSocrates.g:7008:2: ( ruleexpressionprime )
            {
            // InternalSocrates.g:7008:2: ( ruleexpressionprime )
            // InternalSocrates.g:7009:3: ruleexpressionprime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionbAccess().getExpprimeExpressionprimeParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionbAccess().getExpprimeExpressionprimeParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionb__ExpprimeAssignment_1_3"


    // $ANTLR start "rule__Expressionprime__OpAssignment_0"
    // InternalSocrates.g:7018:1: rule__Expressionprime__OpAssignment_0 : ( ( rule__Expressionprime__OpAlternatives_0_0 ) ) ;
    public final void rule__Expressionprime__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7022:1: ( ( ( rule__Expressionprime__OpAlternatives_0_0 ) ) )
            // InternalSocrates.g:7023:2: ( ( rule__Expressionprime__OpAlternatives_0_0 ) )
            {
            // InternalSocrates.g:7023:2: ( ( rule__Expressionprime__OpAlternatives_0_0 ) )
            // InternalSocrates.g:7024:3: ( rule__Expressionprime__OpAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionprimeAccess().getOpAlternatives_0_0()); 
            }
            // InternalSocrates.g:7025:3: ( rule__Expressionprime__OpAlternatives_0_0 )
            // InternalSocrates.g:7025:4: rule__Expressionprime__OpAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressionprime__OpAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionprimeAccess().getOpAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__OpAssignment_0"


    // $ANTLR start "rule__Expressionprime__T2Assignment_1"
    // InternalSocrates.g:7033:1: rule__Expressionprime__T2Assignment_1 : ( ruleexpressionterm ) ;
    public final void rule__Expressionprime__T2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7037:1: ( ( ruleexpressionterm ) )
            // InternalSocrates.g:7038:2: ( ruleexpressionterm )
            {
            // InternalSocrates.g:7038:2: ( ruleexpressionterm )
            // InternalSocrates.g:7039:3: ruleexpressionterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionprimeAccess().getT2ExpressiontermParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionprimeAccess().getT2ExpressiontermParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__T2Assignment_1"


    // $ANTLR start "rule__Expressionprime__FAssignment_2"
    // InternalSocrates.g:7048:1: rule__Expressionprime__FAssignment_2 : ( ruleexpressionprime ) ;
    public final void rule__Expressionprime__FAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7052:1: ( ( ruleexpressionprime ) )
            // InternalSocrates.g:7053:2: ( ruleexpressionprime )
            {
            // InternalSocrates.g:7053:2: ( ruleexpressionprime )
            // InternalSocrates.g:7054:3: ruleexpressionprime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionprimeAccess().getFExpressionprimeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionprimeAccess().getFExpressionprimeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionprime__FAssignment_2"


    // $ANTLR start "rule__Expressionterm__TermAssignment_0"
    // InternalSocrates.g:7063:1: rule__Expressionterm__TermAssignment_0 : ( ( rule__Expressionterm__TermAlternatives_0_0 ) ) ;
    public final void rule__Expressionterm__TermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7067:1: ( ( ( rule__Expressionterm__TermAlternatives_0_0 ) ) )
            // InternalSocrates.g:7068:2: ( ( rule__Expressionterm__TermAlternatives_0_0 ) )
            {
            // InternalSocrates.g:7068:2: ( ( rule__Expressionterm__TermAlternatives_0_0 ) )
            // InternalSocrates.g:7069:3: ( rule__Expressionterm__TermAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermAccess().getTermAlternatives_0_0()); 
            }
            // InternalSocrates.g:7070:3: ( rule__Expressionterm__TermAlternatives_0_0 )
            // InternalSocrates.g:7070:4: rule__Expressionterm__TermAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressionterm__TermAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermAccess().getTermAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionterm__TermAssignment_0"


    // $ANTLR start "rule__Expressionterm__ExpprimeAssignment_1"
    // InternalSocrates.g:7078:1: rule__Expressionterm__ExpprimeAssignment_1 : ( ruleexpressiontermprime ) ;
    public final void rule__Expressionterm__ExpprimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7082:1: ( ( ruleexpressiontermprime ) )
            // InternalSocrates.g:7083:2: ( ruleexpressiontermprime )
            {
            // InternalSocrates.g:7083:2: ( ruleexpressiontermprime )
            // InternalSocrates.g:7084:3: ruleexpressiontermprime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermAccess().getExpprimeExpressiontermprimeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressiontermprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermAccess().getExpprimeExpressiontermprimeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressionterm__ExpprimeAssignment_1"


    // $ANTLR start "rule__Expressiontermprime__OpAssignment_0"
    // InternalSocrates.g:7093:1: rule__Expressiontermprime__OpAssignment_0 : ( ( rule__Expressiontermprime__OpAlternatives_0_0 ) ) ;
    public final void rule__Expressiontermprime__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7097:1: ( ( ( rule__Expressiontermprime__OpAlternatives_0_0 ) ) )
            // InternalSocrates.g:7098:2: ( ( rule__Expressiontermprime__OpAlternatives_0_0 ) )
            {
            // InternalSocrates.g:7098:2: ( ( rule__Expressiontermprime__OpAlternatives_0_0 ) )
            // InternalSocrates.g:7099:3: ( rule__Expressiontermprime__OpAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermprimeAccess().getOpAlternatives_0_0()); 
            }
            // InternalSocrates.g:7100:3: ( rule__Expressiontermprime__OpAlternatives_0_0 )
            // InternalSocrates.g:7100:4: rule__Expressiontermprime__OpAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressiontermprime__OpAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermprimeAccess().getOpAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__OpAssignment_0"


    // $ANTLR start "rule__Expressiontermprime__T2Assignment_1"
    // InternalSocrates.g:7108:1: rule__Expressiontermprime__T2Assignment_1 : ( ruleexpressionterm ) ;
    public final void rule__Expressiontermprime__T2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7112:1: ( ( ruleexpressionterm ) )
            // InternalSocrates.g:7113:2: ( ruleexpressionterm )
            {
            // InternalSocrates.g:7113:2: ( ruleexpressionterm )
            // InternalSocrates.g:7114:3: ruleexpressionterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermprimeAccess().getT2ExpressiontermParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermprimeAccess().getT2ExpressiontermParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__T2Assignment_1"


    // $ANTLR start "rule__Expressiontermprime__FAssignment_2"
    // InternalSocrates.g:7123:1: rule__Expressiontermprime__FAssignment_2 : ( ruleexpressiontermprime ) ;
    public final void rule__Expressiontermprime__FAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7127:1: ( ( ruleexpressiontermprime ) )
            // InternalSocrates.g:7128:2: ( ruleexpressiontermprime )
            {
            // InternalSocrates.g:7128:2: ( ruleexpressiontermprime )
            // InternalSocrates.g:7129:3: ruleexpressiontermprime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressiontermprimeAccess().getFExpressiontermprimeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressiontermprime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressiontermprimeAccess().getFExpressiontermprimeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressiontermprime__FAssignment_2"


    // $ANTLR start "rule__ExpressionAtom__ExpAssignment_0"
    // InternalSocrates.g:7138:1: rule__ExpressionAtom__ExpAssignment_0 : ( ruleSignal ) ;
    public final void rule__ExpressionAtom__ExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7142:1: ( ( ruleSignal ) )
            // InternalSocrates.g:7143:2: ( ruleSignal )
            {
            // InternalSocrates.g:7143:2: ( ruleSignal )
            // InternalSocrates.g:7144:3: ruleSignal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getExpSignalParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getExpSignalParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__ExpAssignment_0"


    // $ANTLR start "rule__ExpressionAtom__ExpAssignment_1_1"
    // InternalSocrates.g:7153:1: rule__ExpressionAtom__ExpAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__ExpressionAtom__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7157:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7158:2: ( ruleexpression )
            {
            // InternalSocrates.g:7158:2: ( ruleexpression )
            // InternalSocrates.g:7159:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getExpExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getExpExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__ExpAssignment_1_1"


    // $ANTLR start "rule__ExpressionAtom__OpAssignment_2_0"
    // InternalSocrates.g:7168:1: rule__ExpressionAtom__OpAssignment_2_0 : ( ruleSIGN ) ;
    public final void rule__ExpressionAtom__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7172:1: ( ( ruleSIGN ) )
            // InternalSocrates.g:7173:2: ( ruleSIGN )
            {
            // InternalSocrates.g:7173:2: ( ruleSIGN )
            // InternalSocrates.g:7174:3: ruleSIGN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getOpSIGNParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSIGN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getOpSIGNParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__OpAssignment_2_0"


    // $ANTLR start "rule__ExpressionAtom__ExpAssignment_2_1"
    // InternalSocrates.g:7183:1: rule__ExpressionAtom__ExpAssignment_2_1 : ( ruleexpression ) ;
    public final void rule__ExpressionAtom__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7187:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7188:2: ( ruleexpression )
            {
            // InternalSocrates.g:7188:2: ( ruleexpression )
            // InternalSocrates.g:7189:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getExpExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getExpExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__ExpAssignment_2_1"


    // $ANTLR start "rule__ExpressionAtom__ExpAssignment_3"
    // InternalSocrates.g:7198:1: rule__ExpressionAtom__ExpAssignment_3 : ( rulevalue ) ;
    public final void rule__ExpressionAtom__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7202:1: ( ( rulevalue ) )
            // InternalSocrates.g:7203:2: ( rulevalue )
            {
            // InternalSocrates.g:7203:2: ( rulevalue )
            // InternalSocrates.g:7204:3: rulevalue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAtomAccess().getExpValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevalue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAtomAccess().getExpValueParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAtom__ExpAssignment_3"


    // $ANTLR start "rule__Basicexpression__ExpAssignment_0_1"
    // InternalSocrates.g:7213:1: rule__Basicexpression__ExpAssignment_0_1 : ( ruleBasicexpression ) ;
    public final void rule__Basicexpression__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7217:1: ( ( ruleBasicexpression ) )
            // InternalSocrates.g:7218:2: ( ruleBasicexpression )
            {
            // InternalSocrates.g:7218:2: ( ruleBasicexpression )
            // InternalSocrates.g:7219:3: ruleBasicexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getExpBasicexpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getExpBasicexpressionParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__ExpAssignment_0_1"


    // $ANTLR start "rule__Basicexpression__ExpAssignment_1"
    // InternalSocrates.g:7228:1: rule__Basicexpression__ExpAssignment_1 : ( ruleAbsEXP ) ;
    public final void rule__Basicexpression__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7232:1: ( ( ruleAbsEXP ) )
            // InternalSocrates.g:7233:2: ( ruleAbsEXP )
            {
            // InternalSocrates.g:7233:2: ( ruleAbsEXP )
            // InternalSocrates.g:7234:3: ruleAbsEXP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getExpAbsEXPParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbsEXP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getExpAbsEXPParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__ExpAssignment_1"


    // $ANTLR start "rule__Basicexpression__ExpAssignment_2"
    // InternalSocrates.g:7243:1: rule__Basicexpression__ExpAssignment_2 : ( ruleNormexp ) ;
    public final void rule__Basicexpression__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7247:1: ( ( ruleNormexp ) )
            // InternalSocrates.g:7248:2: ( ruleNormexp )
            {
            // InternalSocrates.g:7248:2: ( ruleNormexp )
            // InternalSocrates.g:7249:3: ruleNormexp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getExpNormexpParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNormexp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getExpNormexpParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__ExpAssignment_2"


    // $ANTLR start "rule__Basicexpression__ExpAssignment_3"
    // InternalSocrates.g:7258:1: rule__Basicexpression__ExpAssignment_3 : ( ruleSin ) ;
    public final void rule__Basicexpression__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7262:1: ( ( ruleSin ) )
            // InternalSocrates.g:7263:2: ( ruleSin )
            {
            // InternalSocrates.g:7263:2: ( ruleSin )
            // InternalSocrates.g:7264:3: ruleSin
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getExpSinParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getExpSinParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__ExpAssignment_3"


    // $ANTLR start "rule__Basicexpression__ExpAssignment_4"
    // InternalSocrates.g:7273:1: rule__Basicexpression__ExpAssignment_4 : ( ruleCos ) ;
    public final void rule__Basicexpression__ExpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7277:1: ( ( ruleCos ) )
            // InternalSocrates.g:7278:2: ( ruleCos )
            {
            // InternalSocrates.g:7278:2: ( ruleCos )
            // InternalSocrates.g:7279:3: ruleCos
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getExpCosParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCos();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getExpCosParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__ExpAssignment_4"


    // $ANTLR start "rule__Basicexpression__ExpAssignment_5"
    // InternalSocrates.g:7288:1: rule__Basicexpression__ExpAssignment_5 : ( ruleSqrt ) ;
    public final void rule__Basicexpression__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7292:1: ( ( ruleSqrt ) )
            // InternalSocrates.g:7293:2: ( ruleSqrt )
            {
            // InternalSocrates.g:7293:2: ( ruleSqrt )
            // InternalSocrates.g:7294:3: ruleSqrt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicexpressionAccess().getExpSqrtParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSqrt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicexpressionAccess().getExpSqrtParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicexpression__ExpAssignment_5"


    // $ANTLR start "rule__Basicformulae__FAssignment_0"
    // InternalSocrates.g:7303:1: rule__Basicformulae__FAssignment_0 : ( rulenegationformula ) ;
    public final void rule__Basicformulae__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7307:1: ( ( rulenegationformula ) )
            // InternalSocrates.g:7308:2: ( rulenegationformula )
            {
            // InternalSocrates.g:7308:2: ( rulenegationformula )
            // InternalSocrates.g:7309:3: rulenegationformula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicformulaeAccess().getFNegationformulaParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenegationformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicformulaeAccess().getFNegationformulaParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicformulae__FAssignment_0"


    // $ANTLR start "rule__Basicformulae__FAssignment_1"
    // InternalSocrates.g:7318:1: rule__Basicformulae__FAssignment_1 : ( ruleForAllformula ) ;
    public final void rule__Basicformulae__FAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7322:1: ( ( ruleForAllformula ) )
            // InternalSocrates.g:7323:2: ( ruleForAllformula )
            {
            // InternalSocrates.g:7323:2: ( ruleForAllformula )
            // InternalSocrates.g:7324:3: ruleForAllformula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicformulaeAccess().getFForAllformulaParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleForAllformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicformulaeAccess().getFForAllformulaParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicformulae__FAssignment_1"


    // $ANTLR start "rule__Basicformulae__FAssignment_2"
    // InternalSocrates.g:7333:1: rule__Basicformulae__FAssignment_2 : ( ruleExistsformula ) ;
    public final void rule__Basicformulae__FAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7337:1: ( ( ruleExistsformula ) )
            // InternalSocrates.g:7338:2: ( ruleExistsformula )
            {
            // InternalSocrates.g:7338:2: ( ruleExistsformula )
            // InternalSocrates.g:7339:3: ruleExistsformula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicformulaeAccess().getFExistsformulaParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExistsformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicformulaeAccess().getFExistsformulaParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Basicformulae__FAssignment_2"


    // $ANTLR start "rule__Boundterm__RefAssignment_0"
    // InternalSocrates.g:7348:1: rule__Boundterm__RefAssignment_0 : ( ruleTvariable ) ;
    public final void rule__Boundterm__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7352:1: ( ( ruleTvariable ) )
            // InternalSocrates.g:7353:2: ( ruleTvariable )
            {
            // InternalSocrates.g:7353:2: ( ruleTvariable )
            // InternalSocrates.g:7354:3: ruleTvariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getRefTvariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTvariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getRefTvariableParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__RefAssignment_0"


    // $ANTLR start "rule__Boundterm__LAssignment_2_0"
    // InternalSocrates.g:7363:1: rule__Boundterm__LAssignment_2_0 : ( ruleLSQUARE ) ;
    public final void rule__Boundterm__LAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7367:1: ( ( ruleLSQUARE ) )
            // InternalSocrates.g:7368:2: ( ruleLSQUARE )
            {
            // InternalSocrates.g:7368:2: ( ruleLSQUARE )
            // InternalSocrates.g:7369:3: ruleLSQUARE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getLLSQUAREParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getLLSQUAREParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__LAssignment_2_0"


    // $ANTLR start "rule__Boundterm__LAssignment_2_1"
    // InternalSocrates.g:7378:1: rule__Boundterm__LAssignment_2_1 : ( ruleLPAREN ) ;
    public final void rule__Boundterm__LAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7382:1: ( ( ruleLPAREN ) )
            // InternalSocrates.g:7383:2: ( ruleLPAREN )
            {
            // InternalSocrates.g:7383:2: ( ruleLPAREN )
            // InternalSocrates.g:7384:3: ruleLPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getLLPARENParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getLLPARENParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__LAssignment_2_1"


    // $ANTLR start "rule__Boundterm__LeftboundAssignment_3"
    // InternalSocrates.g:7393:1: rule__Boundterm__LeftboundAssignment_3 : ( ruletimedterm ) ;
    public final void rule__Boundterm__LeftboundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7397:1: ( ( ruletimedterm ) )
            // InternalSocrates.g:7398:2: ( ruletimedterm )
            {
            // InternalSocrates.g:7398:2: ( ruletimedterm )
            // InternalSocrates.g:7399:3: ruletimedterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getLeftboundTimedtermParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletimedterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getLeftboundTimedtermParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__LeftboundAssignment_3"


    // $ANTLR start "rule__Boundterm__RightboundAssignment_5"
    // InternalSocrates.g:7408:1: rule__Boundterm__RightboundAssignment_5 : ( ruletimedterm ) ;
    public final void rule__Boundterm__RightboundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7412:1: ( ( ruletimedterm ) )
            // InternalSocrates.g:7413:2: ( ruletimedterm )
            {
            // InternalSocrates.g:7413:2: ( ruletimedterm )
            // InternalSocrates.g:7414:3: ruletimedterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getRightboundTimedtermParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletimedterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getRightboundTimedtermParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__RightboundAssignment_5"


    // $ANTLR start "rule__Boundterm__RAssignment_6_0"
    // InternalSocrates.g:7423:1: rule__Boundterm__RAssignment_6_0 : ( ruleRSQUARE ) ;
    public final void rule__Boundterm__RAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7427:1: ( ( ruleRSQUARE ) )
            // InternalSocrates.g:7428:2: ( ruleRSQUARE )
            {
            // InternalSocrates.g:7428:2: ( ruleRSQUARE )
            // InternalSocrates.g:7429:3: ruleRSQUARE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getRRSQUAREParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRSQUARE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getRRSQUAREParserRuleCall_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__RAssignment_6_0"


    // $ANTLR start "rule__Boundterm__RAssignment_6_1"
    // InternalSocrates.g:7438:1: rule__Boundterm__RAssignment_6_1 : ( ruleRPAREN ) ;
    public final void rule__Boundterm__RAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7442:1: ( ( ruleRPAREN ) )
            // InternalSocrates.g:7443:2: ( ruleRPAREN )
            {
            // InternalSocrates.g:7443:2: ( ruleRPAREN )
            // InternalSocrates.g:7444:3: ruleRPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundtermAccess().getRRPARENParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundtermAccess().getRRPARENParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boundterm__RAssignment_6_1"


    // $ANTLR start "rule__Timedterm__InfAssignment_0"
    // InternalSocrates.g:7453:1: rule__Timedterm__InfAssignment_0 : ( ruleINF ) ;
    public final void rule__Timedterm__InfAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7457:1: ( ( ruleINF ) )
            // InternalSocrates.g:7458:2: ( ruleINF )
            {
            // InternalSocrates.g:7458:2: ( ruleINF )
            // InternalSocrates.g:7459:3: ruleINF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getInfINFParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleINF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getInfINFParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__InfAssignment_0"


    // $ANTLR start "rule__Timedterm__NumberAssignment_1"
    // InternalSocrates.g:7468:1: rule__Timedterm__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Timedterm__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7472:1: ( ( rulenumber ) )
            // InternalSocrates.g:7473:2: ( rulenumber )
            {
            // InternalSocrates.g:7473:2: ( rulenumber )
            // InternalSocrates.g:7474:3: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getNumberNumberParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getNumberNumberParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__NumberAssignment_1"


    // $ANTLR start "rule__Timedterm__RefAssignment_2_0_0"
    // InternalSocrates.g:7483:1: rule__Timedterm__RefAssignment_2_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Timedterm__RefAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7487:1: ( ( ( RULE_ID ) ) )
            // InternalSocrates.g:7488:2: ( ( RULE_ID ) )
            {
            // InternalSocrates.g:7488:2: ( ( RULE_ID ) )
            // InternalSocrates.g:7489:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getRefConstantIdCrossReference_2_0_0_0()); 
            }
            // InternalSocrates.g:7490:3: ( RULE_ID )
            // InternalSocrates.g:7491:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getRefConstantIdIDTerminalRuleCall_2_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getRefConstantIdIDTerminalRuleCall_2_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getRefConstantIdCrossReference_2_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__RefAssignment_2_0_0"


    // $ANTLR start "rule__Timedterm__RefAssignment_2_0_1"
    // InternalSocrates.g:7502:1: rule__Timedterm__RefAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Timedterm__RefAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7506:1: ( ( ( RULE_ID ) ) )
            // InternalSocrates.g:7507:2: ( ( RULE_ID ) )
            {
            // InternalSocrates.g:7507:2: ( ( RULE_ID ) )
            // InternalSocrates.g:7508:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getRefTvariableCrossReference_2_0_1_0()); 
            }
            // InternalSocrates.g:7509:3: ( RULE_ID )
            // InternalSocrates.g:7510:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getRefTvariableIDTerminalRuleCall_2_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getRefTvariableIDTerminalRuleCall_2_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getRefTvariableCrossReference_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__RefAssignment_2_0_1"


    // $ANTLR start "rule__Timedterm__OpAssignment_2_1_0"
    // InternalSocrates.g:7521:1: rule__Timedterm__OpAssignment_2_1_0 : ( ( rule__Timedterm__OpAlternatives_2_1_0_0 ) ) ;
    public final void rule__Timedterm__OpAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7525:1: ( ( ( rule__Timedterm__OpAlternatives_2_1_0_0 ) ) )
            // InternalSocrates.g:7526:2: ( ( rule__Timedterm__OpAlternatives_2_1_0_0 ) )
            {
            // InternalSocrates.g:7526:2: ( ( rule__Timedterm__OpAlternatives_2_1_0_0 ) )
            // InternalSocrates.g:7527:3: ( rule__Timedterm__OpAlternatives_2_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getOpAlternatives_2_1_0_0()); 
            }
            // InternalSocrates.g:7528:3: ( rule__Timedterm__OpAlternatives_2_1_0_0 )
            // InternalSocrates.g:7528:4: rule__Timedterm__OpAlternatives_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Timedterm__OpAlternatives_2_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getOpAlternatives_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__OpAssignment_2_1_0"


    // $ANTLR start "rule__Timedterm__ValueAssignment_2_1_1"
    // InternalSocrates.g:7536:1: rule__Timedterm__ValueAssignment_2_1_1 : ( rulevalue ) ;
    public final void rule__Timedterm__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7540:1: ( ( rulevalue ) )
            // InternalSocrates.g:7541:2: ( rulevalue )
            {
            // InternalSocrates.g:7541:2: ( rulevalue )
            // InternalSocrates.g:7542:3: rulevalue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimedtermAccess().getValueValueParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevalue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimedtermAccess().getValueValueParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timedterm__ValueAssignment_2_1_1"


    // $ANTLR start "rule__Atom__FAssignment_0_1"
    // InternalSocrates.g:7551:1: rule__Atom__FAssignment_0_1 : ( ruleformula ) ;
    public final void rule__Atom__FAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7555:1: ( ( ruleformula ) )
            // InternalSocrates.g:7556:2: ( ruleformula )
            {
            // InternalSocrates.g:7556:2: ( ruleformula )
            // InternalSocrates.g:7557:3: ruleformula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getFFormulaParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getFFormulaParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__FAssignment_0_1"


    // $ANTLR start "rule__Atom__S1Assignment_1_1"
    // InternalSocrates.g:7566:1: rule__Atom__S1Assignment_1_1 : ( ruleexpression ) ;
    public final void rule__Atom__S1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7570:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7571:2: ( ruleexpression )
            {
            // InternalSocrates.g:7571:2: ( ruleexpression )
            // InternalSocrates.g:7572:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getS1ExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getS1ExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__S1Assignment_1_1"


    // $ANTLR start "rule__Atom__OpAssignment_1_2"
    // InternalSocrates.g:7581:1: rule__Atom__OpAssignment_1_2 : ( ruleRELOP ) ;
    public final void rule__Atom__OpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7585:1: ( ( ruleRELOP ) )
            // InternalSocrates.g:7586:2: ( ruleRELOP )
            {
            // InternalSocrates.g:7586:2: ( ruleRELOP )
            // InternalSocrates.g:7587:3: ruleRELOP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getOpRELOPParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRELOP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getOpRELOPParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__OpAssignment_1_2"


    // $ANTLR start "rule__Atom__S2Assignment_1_3"
    // InternalSocrates.g:7596:1: rule__Atom__S2Assignment_1_3 : ( ruleexpression ) ;
    public final void rule__Atom__S2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7600:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7601:2: ( ruleexpression )
            {
            // InternalSocrates.g:7601:2: ( ruleexpression )
            // InternalSocrates.g:7602:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getS2ExpressionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getS2ExpressionParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__S2Assignment_1_3"


    // $ANTLR start "rule__Value__ExpAssignment_0_1"
    // InternalSocrates.g:7611:1: rule__Value__ExpAssignment_0_1 : ( ruleexpression ) ;
    public final void rule__Value__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7615:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7616:2: ( ruleexpression )
            {
            // InternalSocrates.g:7616:2: ( ruleexpression )
            // InternalSocrates.g:7617:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getExpExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getExpExpressionParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ExpAssignment_0_1"


    // $ANTLR start "rule__Value__NumberAssignment_1"
    // InternalSocrates.g:7626:1: rule__Value__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Value__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7630:1: ( ( rulenumber ) )
            // InternalSocrates.g:7631:2: ( rulenumber )
            {
            // InternalSocrates.g:7631:2: ( rulenumber )
            // InternalSocrates.g:7632:3: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getNumberNumberParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getNumberNumberParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__NumberAssignment_1"


    // $ANTLR start "rule__Value__RefAssignment_2"
    // InternalSocrates.g:7641:1: rule__Value__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Value__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7645:1: ( ( ( RULE_ID ) ) )
            // InternalSocrates.g:7646:2: ( ( RULE_ID ) )
            {
            // InternalSocrates.g:7646:2: ( ( RULE_ID ) )
            // InternalSocrates.g:7647:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getRefConstantIdCrossReference_2_0()); 
            }
            // InternalSocrates.g:7648:3: ( RULE_ID )
            // InternalSocrates.g:7649:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getRefConstantIdIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getRefConstantIdIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getRefConstantIdCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__RefAssignment_2"


    // $ANTLR start "rule__Value__FloatAssignment_3"
    // InternalSocrates.g:7660:1: rule__Value__FloatAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Value__FloatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7664:1: ( ( ruleFLOAT ) )
            // InternalSocrates.g:7665:2: ( ruleFLOAT )
            {
            // InternalSocrates.g:7665:2: ( ruleFLOAT )
            // InternalSocrates.g:7666:3: ruleFLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getFloatFLOATParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getFloatFLOATParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__FloatAssignment_3"


    // $ANTLR start "rule__Signal__SignalidAssignment_0_0"
    // InternalSocrates.g:7675:1: rule__Signal__SignalidAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Signal__SignalidAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7679:1: ( ( ( RULE_ID ) ) )
            // InternalSocrates.g:7680:2: ( ( RULE_ID ) )
            {
            // InternalSocrates.g:7680:2: ( ( RULE_ID ) )
            // InternalSocrates.g:7681:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSignalidSignalIDCrossReference_0_0_0()); 
            }
            // InternalSocrates.g:7682:3: ( RULE_ID )
            // InternalSocrates.g:7683:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSignalidSignalIDIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSignalidSignalIDIDTerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSignalidSignalIDCrossReference_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__SignalidAssignment_0_0"


    // $ANTLR start "rule__Signal__TimdedtermAssignment_0_2"
    // InternalSocrates.g:7694:1: rule__Signal__TimdedtermAssignment_0_2 : ( ruletimedterm ) ;
    public final void rule__Signal__TimdedtermAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7698:1: ( ( ruletimedterm ) )
            // InternalSocrates.g:7699:2: ( ruletimedterm )
            {
            // InternalSocrates.g:7699:2: ( ruletimedterm )
            // InternalSocrates.g:7700:3: ruletimedterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getTimdedtermTimedtermParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletimedterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getTimdedtermTimedtermParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__TimdedtermAssignment_0_2"


    // $ANTLR start "rule__Signal__SignalidAssignment_1_0"
    // InternalSocrates.g:7709:1: rule__Signal__SignalidAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Signal__SignalidAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7713:1: ( ( ( RULE_ID ) ) )
            // InternalSocrates.g:7714:2: ( ( RULE_ID ) )
            {
            // InternalSocrates.g:7714:2: ( ( RULE_ID ) )
            // InternalSocrates.g:7715:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSignalidSignalIDCrossReference_1_0_0()); 
            }
            // InternalSocrates.g:7716:3: ( RULE_ID )
            // InternalSocrates.g:7717:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSignalidSignalIDIDTerminalRuleCall_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSignalidSignalIDIDTerminalRuleCall_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSignalidSignalIDCrossReference_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__SignalidAssignment_1_0"


    // $ANTLR start "rule__Signal__Indx1Assignment_1_2"
    // InternalSocrates.g:7728:1: rule__Signal__Indx1Assignment_1_2 : ( rulenumber ) ;
    public final void rule__Signal__Indx1Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7732:1: ( ( rulenumber ) )
            // InternalSocrates.g:7733:2: ( rulenumber )
            {
            // InternalSocrates.g:7733:2: ( rulenumber )
            // InternalSocrates.g:7734:3: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getIndx1NumberParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getIndx1NumberParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Indx1Assignment_1_2"


    // $ANTLR start "rule__Signal__TimdedtermAssignment_1_5"
    // InternalSocrates.g:7743:1: rule__Signal__TimdedtermAssignment_1_5 : ( ruletimedterm ) ;
    public final void rule__Signal__TimdedtermAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7747:1: ( ( ruletimedterm ) )
            // InternalSocrates.g:7748:2: ( ruletimedterm )
            {
            // InternalSocrates.g:7748:2: ( ruletimedterm )
            // InternalSocrates.g:7749:3: ruletimedterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getTimdedtermTimedtermParserRuleCall_1_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletimedterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getTimdedtermTimedtermParserRuleCall_1_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__TimdedtermAssignment_1_5"


    // $ANTLR start "rule__Signal__SignalidAssignment_2_0"
    // InternalSocrates.g:7758:1: rule__Signal__SignalidAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Signal__SignalidAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7762:1: ( ( ( RULE_ID ) ) )
            // InternalSocrates.g:7763:2: ( ( RULE_ID ) )
            {
            // InternalSocrates.g:7763:2: ( ( RULE_ID ) )
            // InternalSocrates.g:7764:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSignalidSignalIDCrossReference_2_0_0()); 
            }
            // InternalSocrates.g:7765:3: ( RULE_ID )
            // InternalSocrates.g:7766:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSignalidSignalIDIDTerminalRuleCall_2_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSignalidSignalIDIDTerminalRuleCall_2_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSignalidSignalIDCrossReference_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__SignalidAssignment_2_0"


    // $ANTLR start "rule__Signal__Indx1Assignment_2_2"
    // InternalSocrates.g:7777:1: rule__Signal__Indx1Assignment_2_2 : ( rulenumber ) ;
    public final void rule__Signal__Indx1Assignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7781:1: ( ( rulenumber ) )
            // InternalSocrates.g:7782:2: ( rulenumber )
            {
            // InternalSocrates.g:7782:2: ( rulenumber )
            // InternalSocrates.g:7783:3: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getIndx1NumberParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getIndx1NumberParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Indx1Assignment_2_2"


    // $ANTLR start "rule__Signal__Indx2Assignment_2_5"
    // InternalSocrates.g:7792:1: rule__Signal__Indx2Assignment_2_5 : ( rulenumber ) ;
    public final void rule__Signal__Indx2Assignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7796:1: ( ( rulenumber ) )
            // InternalSocrates.g:7797:2: ( rulenumber )
            {
            // InternalSocrates.g:7797:2: ( rulenumber )
            // InternalSocrates.g:7798:3: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getIndx2NumberParserRuleCall_2_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getIndx2NumberParserRuleCall_2_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Indx2Assignment_2_5"


    // $ANTLR start "rule__Signal__TimdedtermAssignment_2_8"
    // InternalSocrates.g:7807:1: rule__Signal__TimdedtermAssignment_2_8 : ( ruletimedterm ) ;
    public final void rule__Signal__TimdedtermAssignment_2_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7811:1: ( ( ruletimedterm ) )
            // InternalSocrates.g:7812:2: ( ruletimedterm )
            {
            // InternalSocrates.g:7812:2: ( ruletimedterm )
            // InternalSocrates.g:7813:3: ruletimedterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getTimdedtermTimedtermParserRuleCall_2_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletimedterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getTimdedtermTimedtermParserRuleCall_2_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__TimdedtermAssignment_2_8"


    // $ANTLR start "rule__AbsEXP__Exp1Assignment_1"
    // InternalSocrates.g:7822:1: rule__AbsEXP__Exp1Assignment_1 : ( ruleexpression ) ;
    public final void rule__AbsEXP__Exp1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7826:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7827:2: ( ruleexpression )
            {
            // InternalSocrates.g:7827:2: ( ruleexpression )
            // InternalSocrates.g:7828:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbsEXPAccess().getExp1ExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbsEXPAccess().getExp1ExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsEXP__Exp1Assignment_1"


    // $ANTLR start "rule__Normexp__Exp1Assignment_1"
    // InternalSocrates.g:7837:1: rule__Normexp__Exp1Assignment_1 : ( ruleexpression ) ;
    public final void rule__Normexp__Exp1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7841:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7842:2: ( ruleexpression )
            {
            // InternalSocrates.g:7842:2: ( ruleexpression )
            // InternalSocrates.g:7843:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNormexpAccess().getExp1ExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNormexpAccess().getExp1ExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normexp__Exp1Assignment_1"


    // $ANTLR start "rule__Sin__Exp1Assignment_2"
    // InternalSocrates.g:7852:1: rule__Sin__Exp1Assignment_2 : ( ruleexpression ) ;
    public final void rule__Sin__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7856:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7857:2: ( ruleexpression )
            {
            // InternalSocrates.g:7857:2: ( ruleexpression )
            // InternalSocrates.g:7858:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSinAccess().getExp1ExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSinAccess().getExp1ExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Exp1Assignment_2"


    // $ANTLR start "rule__Cos__Exp1Assignment_2"
    // InternalSocrates.g:7867:1: rule__Cos__Exp1Assignment_2 : ( ruleexpression ) ;
    public final void rule__Cos__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7871:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7872:2: ( ruleexpression )
            {
            // InternalSocrates.g:7872:2: ( ruleexpression )
            // InternalSocrates.g:7873:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCosAccess().getExp1ExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCosAccess().getExp1ExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Exp1Assignment_2"


    // $ANTLR start "rule__Sqrt__Exp1Assignment_2"
    // InternalSocrates.g:7882:1: rule__Sqrt__Exp1Assignment_2 : ( ruleexpression ) ;
    public final void rule__Sqrt__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSocrates.g:7886:1: ( ( ruleexpression ) )
            // InternalSocrates.g:7887:2: ( ruleexpression )
            {
            // InternalSocrates.g:7887:2: ( ruleexpression )
            // InternalSocrates.g:7888:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSqrtAccess().getExp1ExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSqrtAccess().getExp1ExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Exp1Assignment_2"

    // $ANTLR start synpred3_InternalSocrates
    public final void synpred3_InternalSocrates_fragment() throws RecognitionException {   
        // InternalSocrates.g:495:4: ( rule__Termprime__Group__0 )
        // InternalSocrates.g:495:4: rule__Termprime__Group__0
        {
        pushFollow(FOLLOW_2);
        rule__Termprime__Group__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSocrates

    // $ANTLR start synpred4_InternalSocrates
    public final void synpred4_InternalSocrates_fragment() throws RecognitionException {   
        // InternalSocrates.g:570:4: ( rule__Expressionprime__Group__0 )
        // InternalSocrates.g:570:4: rule__Expressionprime__Group__0
        {
        pushFollow(FOLLOW_2);
        rule__Expressionprime__Group__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalSocrates

    // $ANTLR start synpred5_InternalSocrates
    public final void synpred5_InternalSocrates_fragment() throws RecognitionException {   
        // InternalSocrates.g:620:4: ( rule__Expressiontermprime__Group__0 )
        // InternalSocrates.g:620:4: rule__Expressiontermprime__Group__0
        {
        pushFollow(FOLLOW_2);
        rule__Expressiontermprime__Group__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalSocrates

    // $ANTLR start synpred9_InternalSocrates
    public final void synpred9_InternalSocrates_fragment() throws RecognitionException {   
        // InternalSocrates.g:1706:2: ( ( ( rule__Expressionb__Group_0__0 ) ) )
        // InternalSocrates.g:1706:2: ( ( rule__Expressionb__Group_0__0 ) )
        {
        // InternalSocrates.g:1706:2: ( ( rule__Expressionb__Group_0__0 ) )
        // InternalSocrates.g:1707:3: ( rule__Expressionb__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionbAccess().getGroup_0()); 
        }
        // InternalSocrates.g:1708:3: ( rule__Expressionb__Group_0__0 )
        // InternalSocrates.g:1708:4: rule__Expressionb__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__Expressionb__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalSocrates

    // $ANTLR start synpred11_InternalSocrates
    public final void synpred11_InternalSocrates_fragment() throws RecognitionException {   
        // InternalSocrates.g:1748:2: ( ( ruleExpressionAtom ) )
        // InternalSocrates.g:1748:2: ( ruleExpressionAtom )
        {
        // InternalSocrates.g:1748:2: ( ruleExpressionAtom )
        // InternalSocrates.g:1749:3: ruleExpressionAtom
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressiontermAccess().getTermExpressionAtomParserRuleCall_0_0_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleExpressionAtom();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSocrates

    // $ANTLR start synpred13_InternalSocrates
    public final void synpred13_InternalSocrates_fragment() throws RecognitionException {   
        // InternalSocrates.g:1790:2: ( ( ( rule__ExpressionAtom__ExpAssignment_0 ) ) )
        // InternalSocrates.g:1790:2: ( ( rule__ExpressionAtom__ExpAssignment_0 ) )
        {
        // InternalSocrates.g:1790:2: ( ( rule__ExpressionAtom__ExpAssignment_0 ) )
        // InternalSocrates.g:1791:3: ( rule__ExpressionAtom__ExpAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAtomAccess().getExpAssignment_0()); 
        }
        // InternalSocrates.g:1792:3: ( rule__ExpressionAtom__ExpAssignment_0 )
        // InternalSocrates.g:1792:4: rule__ExpressionAtom__ExpAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__ExpressionAtom__ExpAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalSocrates

    // $ANTLR start synpred14_InternalSocrates
    public final void synpred14_InternalSocrates_fragment() throws RecognitionException {   
        // InternalSocrates.g:1796:2: ( ( ( rule__ExpressionAtom__Group_1__0 ) ) )
        // InternalSocrates.g:1796:2: ( ( rule__ExpressionAtom__Group_1__0 ) )
        {
        // InternalSocrates.g:1796:2: ( ( rule__ExpressionAtom__Group_1__0 ) )
        // InternalSocrates.g:1797:3: ( rule__ExpressionAtom__Group_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAtomAccess().getGroup_1()); 
        }
        // InternalSocrates.g:1798:3: ( rule__ExpressionAtom__Group_1__0 )
        // InternalSocrates.g:1798:4: rule__ExpressionAtom__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ExpressionAtom__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSocrates

    // $ANTLR start synpred27_InternalSocrates
    public final void synpred27_InternalSocrates_fragment() throws RecognitionException {   
        // InternalSocrates.g:1964:2: ( ( ( rule__Timedterm__RefAssignment_2_0_0 ) ) )
        // InternalSocrates.g:1964:2: ( ( rule__Timedterm__RefAssignment_2_0_0 ) )
        {
        // InternalSocrates.g:1964:2: ( ( rule__Timedterm__RefAssignment_2_0_0 ) )
        // InternalSocrates.g:1965:3: ( rule__Timedterm__RefAssignment_2_0_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTimedtermAccess().getRefAssignment_2_0_0()); 
        }
        // InternalSocrates.g:1966:3: ( rule__Timedterm__RefAssignment_2_0_0 )
        // InternalSocrates.g:1966:4: rule__Timedterm__RefAssignment_2_0_0
        {
        pushFollow(FOLLOW_2);
        rule__Timedterm__RefAssignment_2_0_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalSocrates

    // Delegated rules

    public final boolean synpred3_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\0\12\uffff";
    static final String dfa_3s = "\1\70\1\uffff\1\0\12\uffff";
    static final String dfa_4s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_5s = "\2\uffff\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\2\1\1\uffff\1\1\14\uffff\1\2\14\uffff\2\1\21\uffff\5\1",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1701:1: rule__Expressionb__Alternatives : ( ( ( rule__Expressionb__Group_0__0 ) ) | ( ( rule__Expressionb__Group_1__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSocrates()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\0\11\uffff";
    static final String dfa_9s = "\1\70\1\uffff\1\0\11\uffff";
    static final String dfa_10s = "\1\uffff\1\1\5\uffff\1\2\4\uffff";
    static final String dfa_11s = "\2\uffff\1\0\11\uffff}>";
    static final String[] dfa_12s = {
            "\2\1\1\uffff\1\1\14\uffff\1\2\14\uffff\2\1\21\uffff\5\7",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1743:1: rule__Expressionterm__TermAlternatives_0_0 : ( ( ruleExpressionAtom ) | ( ruleBasicexpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSocrates()) ) {s = 1;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000007100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000600000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x01F00006001000B0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000800000B0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000006001000B0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000000L});

}