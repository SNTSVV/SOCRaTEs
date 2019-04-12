package lu.uni.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lu.uni.services.SocratesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSocratesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DESCRIPTION", "RULE_INT", "RULE_DIGIT", "RULE_WS", "RULE_ML_COMMENT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'Oracle'", "'ModelName:'", "';'", "'Path:'", "'ID:'", "'Description:'", "'Specification:'", "'_'", "'Signals'", "','", "'Constants'", "'or'", "'implies'", "'iff'", "'and'", "'+'", "'-'", "'*'", "'/'", "'{'", "'}'", "'|'", "'||'", "'sin'", "'cos'", "'sqrt'", "'.'", "'../'", "'./'", "'<'", "'<='", "'>'", "'>='", "'='", "'!='", "'('", "')'", "'['", "']'", "'not'", "'forall'", "'exists'", "'inf'", "'in'", "':'"
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
    public static final int RULE_ID=4;
    public static final int RULE_DESCRIPTION=5;
    public static final int RULE_DIGIT=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private SocratesGrammarAccess grammarAccess;

        public InternalSocratesParser(TokenStream input, SocratesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Socrates";
       	}

       	@Override
       	protected SocratesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSocrates"
    // InternalSocrates.g:70:1: entryRuleSocrates returns [EObject current=null] : iv_ruleSocrates= ruleSocrates EOF ;
    public final EObject entryRuleSocrates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSocrates = null;


        try {
            // InternalSocrates.g:70:49: (iv_ruleSocrates= ruleSocrates EOF )
            // InternalSocrates.g:71:2: iv_ruleSocrates= ruleSocrates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSocratesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSocrates=ruleSocrates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSocrates; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSocrates"


    // $ANTLR start "ruleSocrates"
    // InternalSocrates.g:77:1: ruleSocrates returns [EObject current=null] : ( (lv_oracles_0_0= ruleOracle ) )* ;
    public final EObject ruleSocrates() throws RecognitionException {
        EObject current = null;

        EObject lv_oracles_0_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:83:2: ( ( (lv_oracles_0_0= ruleOracle ) )* )
            // InternalSocrates.g:84:2: ( (lv_oracles_0_0= ruleOracle ) )*
            {
            // InternalSocrates.g:84:2: ( (lv_oracles_0_0= ruleOracle ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSocrates.g:85:3: (lv_oracles_0_0= ruleOracle )
            	    {
            	    // InternalSocrates.g:85:3: (lv_oracles_0_0= ruleOracle )
            	    // InternalSocrates.g:86:4: lv_oracles_0_0= ruleOracle
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSocratesAccess().getOraclesOracleParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_oracles_0_0=ruleOracle();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getSocratesRule());
            	      				}
            	      				add(
            	      					current,
            	      					"oracles",
            	      					lv_oracles_0_0,
            	      					"lu.uni.Socrates.Oracle");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSocrates"


    // $ANTLR start "entryRuleOracle"
    // InternalSocrates.g:106:1: entryRuleOracle returns [EObject current=null] : iv_ruleOracle= ruleOracle EOF ;
    public final EObject entryRuleOracle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracle = null;


        try {
            // InternalSocrates.g:106:47: (iv_ruleOracle= ruleOracle EOF )
            // InternalSocrates.g:107:2: iv_ruleOracle= ruleOracle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOracleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOracle=ruleOracle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOracle; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOracle"


    // $ANTLR start "ruleOracle"
    // InternalSocrates.g:113:1: ruleOracle returns [EObject current=null] : (otherlv_0= 'Oracle' otherlv_1= 'ModelName:' ( (lv_modelName_2_0= RULE_ID ) ) otherlv_3= ';' (otherlv_4= 'Path:' ( (lv_path_5_0= rulePATH ) ) otherlv_6= ';' )? otherlv_7= 'ID:' ( (lv_reqname_8_0= ruleReqId ) ) otherlv_9= ';' ( (lv_signdef_10_0= ruleSignalsdefinition ) ) ( (lv_constantDefinitions_11_0= ruleConstantsDefinition ) )? ( (lv_requirement_12_0= ruleRequirement ) ) ) ;
    public final EObject ruleOracle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_modelName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_path_5_0 = null;

        AntlrDatatypeRuleToken lv_reqname_8_0 = null;

        EObject lv_signdef_10_0 = null;

        EObject lv_constantDefinitions_11_0 = null;

        EObject lv_requirement_12_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:119:2: ( (otherlv_0= 'Oracle' otherlv_1= 'ModelName:' ( (lv_modelName_2_0= RULE_ID ) ) otherlv_3= ';' (otherlv_4= 'Path:' ( (lv_path_5_0= rulePATH ) ) otherlv_6= ';' )? otherlv_7= 'ID:' ( (lv_reqname_8_0= ruleReqId ) ) otherlv_9= ';' ( (lv_signdef_10_0= ruleSignalsdefinition ) ) ( (lv_constantDefinitions_11_0= ruleConstantsDefinition ) )? ( (lv_requirement_12_0= ruleRequirement ) ) ) )
            // InternalSocrates.g:120:2: (otherlv_0= 'Oracle' otherlv_1= 'ModelName:' ( (lv_modelName_2_0= RULE_ID ) ) otherlv_3= ';' (otherlv_4= 'Path:' ( (lv_path_5_0= rulePATH ) ) otherlv_6= ';' )? otherlv_7= 'ID:' ( (lv_reqname_8_0= ruleReqId ) ) otherlv_9= ';' ( (lv_signdef_10_0= ruleSignalsdefinition ) ) ( (lv_constantDefinitions_11_0= ruleConstantsDefinition ) )? ( (lv_requirement_12_0= ruleRequirement ) ) )
            {
            // InternalSocrates.g:120:2: (otherlv_0= 'Oracle' otherlv_1= 'ModelName:' ( (lv_modelName_2_0= RULE_ID ) ) otherlv_3= ';' (otherlv_4= 'Path:' ( (lv_path_5_0= rulePATH ) ) otherlv_6= ';' )? otherlv_7= 'ID:' ( (lv_reqname_8_0= ruleReqId ) ) otherlv_9= ';' ( (lv_signdef_10_0= ruleSignalsdefinition ) ) ( (lv_constantDefinitions_11_0= ruleConstantsDefinition ) )? ( (lv_requirement_12_0= ruleRequirement ) ) )
            // InternalSocrates.g:121:3: otherlv_0= 'Oracle' otherlv_1= 'ModelName:' ( (lv_modelName_2_0= RULE_ID ) ) otherlv_3= ';' (otherlv_4= 'Path:' ( (lv_path_5_0= rulePATH ) ) otherlv_6= ';' )? otherlv_7= 'ID:' ( (lv_reqname_8_0= ruleReqId ) ) otherlv_9= ';' ( (lv_signdef_10_0= ruleSignalsdefinition ) ) ( (lv_constantDefinitions_11_0= ruleConstantsDefinition ) )? ( (lv_requirement_12_0= ruleRequirement ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOracleAccess().getOracleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOracleAccess().getModelNameKeyword_1());
              		
            }
            // InternalSocrates.g:129:3: ( (lv_modelName_2_0= RULE_ID ) )
            // InternalSocrates.g:130:4: (lv_modelName_2_0= RULE_ID )
            {
            // InternalSocrates.g:130:4: (lv_modelName_2_0= RULE_ID )
            // InternalSocrates.g:131:5: lv_modelName_2_0= RULE_ID
            {
            lv_modelName_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_modelName_2_0, grammarAccess.getOracleAccess().getModelNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOracleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"modelName",
              						lv_modelName_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getOracleAccess().getSemicolonKeyword_3());
              		
            }
            // InternalSocrates.g:151:3: (otherlv_4= 'Path:' ( (lv_path_5_0= rulePATH ) ) otherlv_6= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSocrates.g:152:4: otherlv_4= 'Path:' ( (lv_path_5_0= rulePATH ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getOracleAccess().getPathKeyword_4_0());
                      			
                    }
                    // InternalSocrates.g:156:4: ( (lv_path_5_0= rulePATH ) )
                    // InternalSocrates.g:157:5: (lv_path_5_0= rulePATH )
                    {
                    // InternalSocrates.g:157:5: (lv_path_5_0= rulePATH )
                    // InternalSocrates.g:158:6: lv_path_5_0= rulePATH
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOracleAccess().getPathPATHParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_path_5_0=rulePATH();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOracleRule());
                      						}
                      						set(
                      							current,
                      							"path",
                      							lv_path_5_0,
                      							"lu.uni.Socrates.PATH");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOracleAccess().getSemicolonKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOracleAccess().getIDKeyword_5());
              		
            }
            // InternalSocrates.g:184:3: ( (lv_reqname_8_0= ruleReqId ) )
            // InternalSocrates.g:185:4: (lv_reqname_8_0= ruleReqId )
            {
            // InternalSocrates.g:185:4: (lv_reqname_8_0= ruleReqId )
            // InternalSocrates.g:186:5: lv_reqname_8_0= ruleReqId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOracleAccess().getReqnameReqIdParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_reqname_8_0=ruleReqId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOracleRule());
              					}
              					set(
              						current,
              						"reqname",
              						lv_reqname_8_0,
              						"lu.uni.Socrates.ReqId");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getOracleAccess().getSemicolonKeyword_7());
              		
            }
            // InternalSocrates.g:207:3: ( (lv_signdef_10_0= ruleSignalsdefinition ) )
            // InternalSocrates.g:208:4: (lv_signdef_10_0= ruleSignalsdefinition )
            {
            // InternalSocrates.g:208:4: (lv_signdef_10_0= ruleSignalsdefinition )
            // InternalSocrates.g:209:5: lv_signdef_10_0= ruleSignalsdefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOracleAccess().getSigndefSignalsdefinitionParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_signdef_10_0=ruleSignalsdefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOracleRule());
              					}
              					set(
              						current,
              						"signdef",
              						lv_signdef_10_0,
              						"lu.uni.Socrates.Signalsdefinition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSocrates.g:226:3: ( (lv_constantDefinitions_11_0= ruleConstantsDefinition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSocrates.g:227:4: (lv_constantDefinitions_11_0= ruleConstantsDefinition )
                    {
                    // InternalSocrates.g:227:4: (lv_constantDefinitions_11_0= ruleConstantsDefinition )
                    // InternalSocrates.g:228:5: lv_constantDefinitions_11_0= ruleConstantsDefinition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOracleAccess().getConstantDefinitionsConstantsDefinitionParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_constantDefinitions_11_0=ruleConstantsDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOracleRule());
                      					}
                      					set(
                      						current,
                      						"constantDefinitions",
                      						lv_constantDefinitions_11_0,
                      						"lu.uni.Socrates.ConstantsDefinition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSocrates.g:245:3: ( (lv_requirement_12_0= ruleRequirement ) )
            // InternalSocrates.g:246:4: (lv_requirement_12_0= ruleRequirement )
            {
            // InternalSocrates.g:246:4: (lv_requirement_12_0= ruleRequirement )
            // InternalSocrates.g:247:5: lv_requirement_12_0= ruleRequirement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOracleAccess().getRequirementRequirementParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_requirement_12_0=ruleRequirement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOracleRule());
              					}
              					set(
              						current,
              						"requirement",
              						lv_requirement_12_0,
              						"lu.uni.Socrates.Requirement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOracle"


    // $ANTLR start "entryRuleRequirement"
    // InternalSocrates.g:268:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalSocrates.g:268:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalSocrates.g:269:2: iv_ruleRequirement= ruleRequirement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequirementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequirement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalSocrates.g:275:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'Description:' this_DESCRIPTION_1= RULE_DESCRIPTION otherlv_2= ';' otherlv_3= 'Specification:' ( (lv_formula_4_0= ruleformula ) ) otherlv_5= ';' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DESCRIPTION_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_formula_4_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:281:2: ( (otherlv_0= 'Description:' this_DESCRIPTION_1= RULE_DESCRIPTION otherlv_2= ';' otherlv_3= 'Specification:' ( (lv_formula_4_0= ruleformula ) ) otherlv_5= ';' ) )
            // InternalSocrates.g:282:2: (otherlv_0= 'Description:' this_DESCRIPTION_1= RULE_DESCRIPTION otherlv_2= ';' otherlv_3= 'Specification:' ( (lv_formula_4_0= ruleformula ) ) otherlv_5= ';' )
            {
            // InternalSocrates.g:282:2: (otherlv_0= 'Description:' this_DESCRIPTION_1= RULE_DESCRIPTION otherlv_2= ';' otherlv_3= 'Specification:' ( (lv_formula_4_0= ruleformula ) ) otherlv_5= ';' )
            // InternalSocrates.g:283:3: otherlv_0= 'Description:' this_DESCRIPTION_1= RULE_DESCRIPTION otherlv_2= ';' otherlv_3= 'Specification:' ( (lv_formula_4_0= ruleformula ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getDescriptionKeyword_0());
              		
            }
            this_DESCRIPTION_1=(Token)match(input,RULE_DESCRIPTION,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DESCRIPTION_1, grammarAccess.getRequirementAccess().getDESCRIPTIONTerminalRuleCall_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getSemicolonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getSpecificationKeyword_3());
              		
            }
            // InternalSocrates.g:299:3: ( (lv_formula_4_0= ruleformula ) )
            // InternalSocrates.g:300:4: (lv_formula_4_0= ruleformula )
            {
            // InternalSocrates.g:300:4: (lv_formula_4_0= ruleformula )
            // InternalSocrates.g:301:5: lv_formula_4_0= ruleformula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRequirementAccess().getFormulaFormulaParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_formula_4_0=ruleformula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRequirementRule());
              					}
              					set(
              						current,
              						"formula",
              						lv_formula_4_0,
              						"lu.uni.Socrates.formula");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleReqId"
    // InternalSocrates.g:326:1: entryRuleReqId returns [String current=null] : iv_ruleReqId= ruleReqId EOF ;
    public final String entryRuleReqId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReqId = null;


        try {
            // InternalSocrates.g:326:45: (iv_ruleReqId= ruleReqId EOF )
            // InternalSocrates.g:327:2: iv_ruleReqId= ruleReqId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReqIdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReqId=ruleReqId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReqId.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReqId"


    // $ANTLR start "ruleReqId"
    // InternalSocrates.g:333:1: ruleReqId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '_' this_number_2= rulenumber (kw= '_' this_number_4= rulenumber )* )? ) ;
    public final AntlrDatatypeRuleToken ruleReqId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_number_2 = null;

        AntlrDatatypeRuleToken this_number_4 = null;



        	enterRule();

        try {
            // InternalSocrates.g:339:2: ( (this_ID_0= RULE_ID (kw= '_' this_number_2= rulenumber (kw= '_' this_number_4= rulenumber )* )? ) )
            // InternalSocrates.g:340:2: (this_ID_0= RULE_ID (kw= '_' this_number_2= rulenumber (kw= '_' this_number_4= rulenumber )* )? )
            {
            // InternalSocrates.g:340:2: (this_ID_0= RULE_ID (kw= '_' this_number_2= rulenumber (kw= '_' this_number_4= rulenumber )* )? )
            // InternalSocrates.g:341:3: this_ID_0= RULE_ID (kw= '_' this_number_2= rulenumber (kw= '_' this_number_4= rulenumber )* )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getReqIdAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalSocrates.g:348:3: (kw= '_' this_number_2= rulenumber (kw= '_' this_number_4= rulenumber )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSocrates.g:349:4: kw= '_' this_number_2= rulenumber (kw= '_' this_number_4= rulenumber )*
                    {
                    kw=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getReqIdAccess().get_Keyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReqIdAccess().getNumberParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_number_2=rulenumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_number_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:364:4: (kw= '_' this_number_4= rulenumber )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSocrates.g:365:5: kw= '_' this_number_4= rulenumber
                    	    {
                    	    kw=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getReqIdAccess().get_Keyword_1_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getReqIdAccess().getNumberParserRuleCall_1_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    this_number_4=rulenumber();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_number_4);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReqId"


    // $ANTLR start "entryRuleSignalsdefinition"
    // InternalSocrates.g:386:1: entryRuleSignalsdefinition returns [EObject current=null] : iv_ruleSignalsdefinition= ruleSignalsdefinition EOF ;
    public final EObject entryRuleSignalsdefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalsdefinition = null;


        try {
            // InternalSocrates.g:386:58: (iv_ruleSignalsdefinition= ruleSignalsdefinition EOF )
            // InternalSocrates.g:387:2: iv_ruleSignalsdefinition= ruleSignalsdefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalsdefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignalsdefinition=ruleSignalsdefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalsdefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalsdefinition"


    // $ANTLR start "ruleSignalsdefinition"
    // InternalSocrates.g:393:1: ruleSignalsdefinition returns [EObject current=null] : (otherlv_0= 'Signals' ( (lv_signals_1_0= ruleSignalID ) ) (otherlv_2= ',' ( (lv_signals_3_0= ruleSignalID ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleSignalsdefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_signals_1_0 = null;

        EObject lv_signals_3_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:399:2: ( (otherlv_0= 'Signals' ( (lv_signals_1_0= ruleSignalID ) ) (otherlv_2= ',' ( (lv_signals_3_0= ruleSignalID ) ) )* otherlv_4= ';' ) )
            // InternalSocrates.g:400:2: (otherlv_0= 'Signals' ( (lv_signals_1_0= ruleSignalID ) ) (otherlv_2= ',' ( (lv_signals_3_0= ruleSignalID ) ) )* otherlv_4= ';' )
            {
            // InternalSocrates.g:400:2: (otherlv_0= 'Signals' ( (lv_signals_1_0= ruleSignalID ) ) (otherlv_2= ',' ( (lv_signals_3_0= ruleSignalID ) ) )* otherlv_4= ';' )
            // InternalSocrates.g:401:3: otherlv_0= 'Signals' ( (lv_signals_1_0= ruleSignalID ) ) (otherlv_2= ',' ( (lv_signals_3_0= ruleSignalID ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSignalsdefinitionAccess().getSignalsKeyword_0());
              		
            }
            // InternalSocrates.g:405:3: ( (lv_signals_1_0= ruleSignalID ) )
            // InternalSocrates.g:406:4: (lv_signals_1_0= ruleSignalID )
            {
            // InternalSocrates.g:406:4: (lv_signals_1_0= ruleSignalID )
            // InternalSocrates.g:407:5: lv_signals_1_0= ruleSignalID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignalsdefinitionAccess().getSignalsSignalIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_signals_1_0=ruleSignalID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSignalsdefinitionRule());
              					}
              					add(
              						current,
              						"signals",
              						lv_signals_1_0,
              						"lu.uni.Socrates.SignalID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSocrates.g:424:3: (otherlv_2= ',' ( (lv_signals_3_0= ruleSignalID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSocrates.g:425:4: otherlv_2= ',' ( (lv_signals_3_0= ruleSignalID ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSignalsdefinitionAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalSocrates.g:429:4: ( (lv_signals_3_0= ruleSignalID ) )
            	    // InternalSocrates.g:430:5: (lv_signals_3_0= ruleSignalID )
            	    {
            	    // InternalSocrates.g:430:5: (lv_signals_3_0= ruleSignalID )
            	    // InternalSocrates.g:431:6: lv_signals_3_0= ruleSignalID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSignalsdefinitionAccess().getSignalsSignalIDParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_signals_3_0=ruleSignalID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSignalsdefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"signals",
            	      							lv_signals_3_0,
            	      							"lu.uni.Socrates.SignalID");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSignalsdefinitionAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignalsdefinition"


    // $ANTLR start "entryRuleConstantsDefinition"
    // InternalSocrates.g:457:1: entryRuleConstantsDefinition returns [EObject current=null] : iv_ruleConstantsDefinition= ruleConstantsDefinition EOF ;
    public final EObject entryRuleConstantsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantsDefinition = null;


        try {
            // InternalSocrates.g:457:60: (iv_ruleConstantsDefinition= ruleConstantsDefinition EOF )
            // InternalSocrates.g:458:2: iv_ruleConstantsDefinition= ruleConstantsDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantsDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantsDefinition=ruleConstantsDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantsDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantsDefinition"


    // $ANTLR start "ruleConstantsDefinition"
    // InternalSocrates.g:464:1: ruleConstantsDefinition returns [EObject current=null] : (otherlv_0= 'Constants' ( (lv_constants_1_0= ruleConstantDefinition ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstantDefinition ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleConstantsDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constants_1_0 = null;

        EObject lv_constants_3_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:470:2: ( (otherlv_0= 'Constants' ( (lv_constants_1_0= ruleConstantDefinition ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstantDefinition ) ) )* otherlv_4= ';' ) )
            // InternalSocrates.g:471:2: (otherlv_0= 'Constants' ( (lv_constants_1_0= ruleConstantDefinition ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstantDefinition ) ) )* otherlv_4= ';' )
            {
            // InternalSocrates.g:471:2: (otherlv_0= 'Constants' ( (lv_constants_1_0= ruleConstantDefinition ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstantDefinition ) ) )* otherlv_4= ';' )
            // InternalSocrates.g:472:3: otherlv_0= 'Constants' ( (lv_constants_1_0= ruleConstantDefinition ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstantDefinition ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantsDefinitionAccess().getConstantsKeyword_0());
              		
            }
            // InternalSocrates.g:476:3: ( (lv_constants_1_0= ruleConstantDefinition ) )
            // InternalSocrates.g:477:4: (lv_constants_1_0= ruleConstantDefinition )
            {
            // InternalSocrates.g:477:4: (lv_constants_1_0= ruleConstantDefinition )
            // InternalSocrates.g:478:5: lv_constants_1_0= ruleConstantDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantsDefinitionAccess().getConstantsConstantDefinitionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_constants_1_0=ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstantsDefinitionRule());
              					}
              					add(
              						current,
              						"constants",
              						lv_constants_1_0,
              						"lu.uni.Socrates.ConstantDefinition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSocrates.g:495:3: (otherlv_2= ',' ( (lv_constants_3_0= ruleConstantDefinition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSocrates.g:496:4: otherlv_2= ',' ( (lv_constants_3_0= ruleConstantDefinition ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConstantsDefinitionAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalSocrates.g:500:4: ( (lv_constants_3_0= ruleConstantDefinition ) )
            	    // InternalSocrates.g:501:5: (lv_constants_3_0= ruleConstantDefinition )
            	    {
            	    // InternalSocrates.g:501:5: (lv_constants_3_0= ruleConstantDefinition )
            	    // InternalSocrates.g:502:6: lv_constants_3_0= ruleConstantDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConstantsDefinitionAccess().getConstantsConstantDefinitionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_constants_3_0=ruleConstantDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConstantsDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constants",
            	      							lv_constants_3_0,
            	      							"lu.uni.Socrates.ConstantDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConstantsDefinitionAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantsDefinition"


    // $ANTLR start "entryRuleConstantDefinition"
    // InternalSocrates.g:528:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // InternalSocrates.g:528:59: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // InternalSocrates.g:529:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantDefinition=ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantDefinition"


    // $ANTLR start "ruleConstantDefinition"
    // InternalSocrates.g:535:1: ruleConstantDefinition returns [EObject current=null] : ( ( (lv_constantid_0_0= ruleConstantId ) ) ruleEQ ( ruleSIGN )? ( (lv_value_3_0= rulenumber ) ) ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_constantid_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:541:2: ( ( ( (lv_constantid_0_0= ruleConstantId ) ) ruleEQ ( ruleSIGN )? ( (lv_value_3_0= rulenumber ) ) ) )
            // InternalSocrates.g:542:2: ( ( (lv_constantid_0_0= ruleConstantId ) ) ruleEQ ( ruleSIGN )? ( (lv_value_3_0= rulenumber ) ) )
            {
            // InternalSocrates.g:542:2: ( ( (lv_constantid_0_0= ruleConstantId ) ) ruleEQ ( ruleSIGN )? ( (lv_value_3_0= rulenumber ) ) )
            // InternalSocrates.g:543:3: ( (lv_constantid_0_0= ruleConstantId ) ) ruleEQ ( ruleSIGN )? ( (lv_value_3_0= rulenumber ) )
            {
            // InternalSocrates.g:543:3: ( (lv_constantid_0_0= ruleConstantId ) )
            // InternalSocrates.g:544:4: (lv_constantid_0_0= ruleConstantId )
            {
            // InternalSocrates.g:544:4: (lv_constantid_0_0= ruleConstantId )
            // InternalSocrates.g:545:5: lv_constantid_0_0= ruleConstantId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantDefinitionAccess().getConstantidConstantIdParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_constantid_0_0=ruleConstantId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstantDefinitionRule());
              					}
              					set(
              						current,
              						"constantid",
              						lv_constantid_0_0,
              						"lu.uni.Socrates.ConstantId");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConstantDefinitionAccess().getEQParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_19);
            ruleEQ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:572:3: ( ruleSIGN )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=28 && LA8_0<=29)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSocrates.g:573:4: ruleSIGN
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConstantDefinitionAccess().getSIGNParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    ruleSIGN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSocrates.g:584:3: ( (lv_value_3_0= rulenumber ) )
            // InternalSocrates.g:585:4: (lv_value_3_0= rulenumber )
            {
            // InternalSocrates.g:585:4: (lv_value_3_0= rulenumber )
            // InternalSocrates.g:586:5: lv_value_3_0= rulenumber
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantDefinitionAccess().getValueNumberParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=rulenumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstantDefinitionRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"lu.uni.Socrates.number");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDefinition"


    // $ANTLR start "entryRuleSignalID"
    // InternalSocrates.g:607:1: entryRuleSignalID returns [EObject current=null] : iv_ruleSignalID= ruleSignalID EOF ;
    public final EObject entryRuleSignalID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalID = null;


        try {
            // InternalSocrates.g:607:49: (iv_ruleSignalID= ruleSignalID EOF )
            // InternalSocrates.g:608:2: iv_ruleSignalID= ruleSignalID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignalID=ruleSignalID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalID; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalID"


    // $ANTLR start "ruleSignalID"
    // InternalSocrates.g:614:1: ruleSignalID returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSignalID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSocrates.g:620:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSocrates.g:621:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSocrates.g:621:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSocrates.g:622:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSocrates.g:622:3: (lv_name_0_0= RULE_ID )
            // InternalSocrates.g:623:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getSignalIDAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSignalIDRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignalID"


    // $ANTLR start "entryRuleConstantId"
    // InternalSocrates.g:642:1: entryRuleConstantId returns [EObject current=null] : iv_ruleConstantId= ruleConstantId EOF ;
    public final EObject entryRuleConstantId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantId = null;


        try {
            // InternalSocrates.g:642:51: (iv_ruleConstantId= ruleConstantId EOF )
            // InternalSocrates.g:643:2: iv_ruleConstantId= ruleConstantId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantIdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantId=ruleConstantId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantId; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantId"


    // $ANTLR start "ruleConstantId"
    // InternalSocrates.g:649:1: ruleConstantId returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConstantId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSocrates.g:655:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSocrates.g:656:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSocrates.g:656:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSocrates.g:657:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSocrates.g:657:3: (lv_name_0_0= RULE_ID )
            // InternalSocrates.g:658:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getConstantIdAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getConstantIdRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantId"


    // $ANTLR start "entryRuleTvariable"
    // InternalSocrates.g:677:1: entryRuleTvariable returns [EObject current=null] : iv_ruleTvariable= ruleTvariable EOF ;
    public final EObject entryRuleTvariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTvariable = null;


        try {
            // InternalSocrates.g:677:50: (iv_ruleTvariable= ruleTvariable EOF )
            // InternalSocrates.g:678:2: iv_ruleTvariable= ruleTvariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTvariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTvariable=ruleTvariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTvariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTvariable"


    // $ANTLR start "ruleTvariable"
    // InternalSocrates.g:684:1: ruleTvariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTvariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSocrates.g:690:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSocrates.g:691:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSocrates.g:691:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSocrates.g:692:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSocrates.g:692:3: (lv_name_0_0= RULE_ID )
            // InternalSocrates.g:693:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getTvariableAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTvariableRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTvariable"


    // $ANTLR start "entryRulenegationformula"
    // InternalSocrates.g:712:1: entryRulenegationformula returns [EObject current=null] : iv_rulenegationformula= rulenegationformula EOF ;
    public final EObject entryRulenegationformula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenegationformula = null;


        try {
            // InternalSocrates.g:712:56: (iv_rulenegationformula= rulenegationformula EOF )
            // InternalSocrates.g:713:2: iv_rulenegationformula= rulenegationformula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationformulaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenegationformula=rulenegationformula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenegationformula; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenegationformula"


    // $ANTLR start "rulenegationformula"
    // InternalSocrates.g:719:1: rulenegationformula returns [EObject current=null] : ( ruleNOT ( (lv_negationchild_1_0= ruleformula ) ) ) ;
    public final EObject rulenegationformula() throws RecognitionException {
        EObject current = null;

        EObject lv_negationchild_1_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:725:2: ( ( ruleNOT ( (lv_negationchild_1_0= ruleformula ) ) ) )
            // InternalSocrates.g:726:2: ( ruleNOT ( (lv_negationchild_1_0= ruleformula ) ) )
            {
            // InternalSocrates.g:726:2: ( ruleNOT ( (lv_negationchild_1_0= ruleformula ) ) )
            // InternalSocrates.g:727:3: ruleNOT ( (lv_negationchild_1_0= ruleformula ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNegationformulaAccess().getNOTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            ruleNOT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:737:3: ( (lv_negationchild_1_0= ruleformula ) )
            // InternalSocrates.g:738:4: (lv_negationchild_1_0= ruleformula )
            {
            // InternalSocrates.g:738:4: (lv_negationchild_1_0= ruleformula )
            // InternalSocrates.g:739:5: lv_negationchild_1_0= ruleformula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNegationformulaAccess().getNegationchildFormulaParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_negationchild_1_0=ruleformula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNegationformulaRule());
              					}
              					set(
              						current,
              						"negationchild",
              						lv_negationchild_1_0,
              						"lu.uni.Socrates.formula");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenegationformula"


    // $ANTLR start "entryRuleforAllformula"
    // InternalSocrates.g:760:1: entryRuleforAllformula returns [EObject current=null] : iv_ruleforAllformula= ruleforAllformula EOF ;
    public final EObject entryRuleforAllformula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleforAllformula = null;


        try {
            // InternalSocrates.g:760:54: (iv_ruleforAllformula= ruleforAllformula EOF )
            // InternalSocrates.g:761:2: iv_ruleforAllformula= ruleforAllformula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForAllformulaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleforAllformula=ruleforAllformula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleforAllformula; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleforAllformula"


    // $ANTLR start "ruleforAllformula"
    // InternalSocrates.g:767:1: ruleforAllformula returns [EObject current=null] : ( ruleFORALL ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_forallchild_4_0= ruleformula ) ) ruleRPAREN ) ;
    public final EObject ruleforAllformula() throws RecognitionException {
        EObject current = null;

        EObject lv_bound_1_0 = null;

        EObject lv_forallchild_4_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:773:2: ( ( ruleFORALL ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_forallchild_4_0= ruleformula ) ) ruleRPAREN ) )
            // InternalSocrates.g:774:2: ( ruleFORALL ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_forallchild_4_0= ruleformula ) ) ruleRPAREN )
            {
            // InternalSocrates.g:774:2: ( ruleFORALL ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_forallchild_4_0= ruleformula ) ) ruleRPAREN )
            // InternalSocrates.g:775:3: ruleFORALL ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_forallchild_4_0= ruleformula ) ) ruleRPAREN
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForAllformulaAccess().getFORALLParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_5);
            ruleFORALL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:785:3: ( (lv_bound_1_0= ruleboundterm ) )
            // InternalSocrates.g:786:4: (lv_bound_1_0= ruleboundterm )
            {
            // InternalSocrates.g:786:4: (lv_bound_1_0= ruleboundterm )
            // InternalSocrates.g:787:5: lv_bound_1_0= ruleboundterm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAllformulaAccess().getBoundBoundtermParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_bound_1_0=ruleboundterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForAllformulaRule());
              					}
              					set(
              						current,
              						"bound",
              						lv_bound_1_0,
              						"lu.uni.Socrates.boundterm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForAllformulaAccess().getCOLONParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_21);
            ruleCOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForAllformulaAccess().getLPARENParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_14);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:824:3: ( (lv_forallchild_4_0= ruleformula ) )
            // InternalSocrates.g:825:4: (lv_forallchild_4_0= ruleformula )
            {
            // InternalSocrates.g:825:4: (lv_forallchild_4_0= ruleformula )
            // InternalSocrates.g:826:5: lv_forallchild_4_0= ruleformula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAllformulaAccess().getForallchildFormulaParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_forallchild_4_0=ruleformula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForAllformulaRule());
              					}
              					set(
              						current,
              						"forallchild",
              						lv_forallchild_4_0,
              						"lu.uni.Socrates.formula");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForAllformulaAccess().getRPARENParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleforAllformula"


    // $ANTLR start "entryRuleexistsformula"
    // InternalSocrates.g:857:1: entryRuleexistsformula returns [EObject current=null] : iv_ruleexistsformula= ruleexistsformula EOF ;
    public final EObject entryRuleexistsformula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexistsformula = null;


        try {
            // InternalSocrates.g:857:54: (iv_ruleexistsformula= ruleexistsformula EOF )
            // InternalSocrates.g:858:2: iv_ruleexistsformula= ruleexistsformula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsformulaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexistsformula=ruleexistsformula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexistsformula; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexistsformula"


    // $ANTLR start "ruleexistsformula"
    // InternalSocrates.g:864:1: ruleexistsformula returns [EObject current=null] : ( ruleEXISTS ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_existschild_4_0= ruleformula ) ) ruleRPAREN ) ;
    public final EObject ruleexistsformula() throws RecognitionException {
        EObject current = null;

        EObject lv_bound_1_0 = null;

        EObject lv_existschild_4_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:870:2: ( ( ruleEXISTS ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_existschild_4_0= ruleformula ) ) ruleRPAREN ) )
            // InternalSocrates.g:871:2: ( ruleEXISTS ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_existschild_4_0= ruleformula ) ) ruleRPAREN )
            {
            // InternalSocrates.g:871:2: ( ruleEXISTS ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_existschild_4_0= ruleformula ) ) ruleRPAREN )
            // InternalSocrates.g:872:3: ruleEXISTS ( (lv_bound_1_0= ruleboundterm ) ) ruleCOLON ruleLPAREN ( (lv_existschild_4_0= ruleformula ) ) ruleRPAREN
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExistsformulaAccess().getEXISTSParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_5);
            ruleEXISTS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:882:3: ( (lv_bound_1_0= ruleboundterm ) )
            // InternalSocrates.g:883:4: (lv_bound_1_0= ruleboundterm )
            {
            // InternalSocrates.g:883:4: (lv_bound_1_0= ruleboundterm )
            // InternalSocrates.g:884:5: lv_bound_1_0= ruleboundterm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExistsformulaAccess().getBoundBoundtermParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_bound_1_0=ruleboundterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExistsformulaRule());
              					}
              					set(
              						current,
              						"bound",
              						lv_bound_1_0,
              						"lu.uni.Socrates.boundterm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExistsformulaAccess().getCOLONParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_21);
            ruleCOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExistsformulaAccess().getLPARENParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_14);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:921:3: ( (lv_existschild_4_0= ruleformula ) )
            // InternalSocrates.g:922:4: (lv_existschild_4_0= ruleformula )
            {
            // InternalSocrates.g:922:4: (lv_existschild_4_0= ruleformula )
            // InternalSocrates.g:923:5: lv_existschild_4_0= ruleformula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExistsformulaAccess().getExistschildFormulaParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_existschild_4_0=ruleformula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExistsformulaRule());
              					}
              					set(
              						current,
              						"existschild",
              						lv_existschild_4_0,
              						"lu.uni.Socrates.formula");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExistsformulaAccess().getRPARENParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexistsformula"


    // $ANTLR start "entryRuleformula"
    // InternalSocrates.g:954:1: entryRuleformula returns [EObject current=null] : iv_ruleformula= ruleformula EOF ;
    public final EObject entryRuleformula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformula = null;


        try {
            // InternalSocrates.g:954:48: (iv_ruleformula= ruleformula EOF )
            // InternalSocrates.g:955:2: iv_ruleformula= ruleformula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormulaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformula=ruleformula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformula; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformula"


    // $ANTLR start "ruleformula"
    // InternalSocrates.g:961:1: ruleformula returns [EObject current=null] : ( ( (lv_f_0_0= rulebasicformulae ) ) | ( (lv_f_1_0= ruleformulab ) ) ) ;
    public final EObject ruleformula() throws RecognitionException {
        EObject current = null;

        EObject lv_f_0_0 = null;

        EObject lv_f_1_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:967:2: ( ( ( (lv_f_0_0= rulebasicformulae ) ) | ( (lv_f_1_0= ruleformulab ) ) ) )
            // InternalSocrates.g:968:2: ( ( (lv_f_0_0= rulebasicformulae ) ) | ( (lv_f_1_0= ruleformulab ) ) )
            {
            // InternalSocrates.g:968:2: ( ( (lv_f_0_0= rulebasicformulae ) ) | ( (lv_f_1_0= ruleformulab ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=52 && LA9_0<=54)) ) {
                alt9=1;
            }
            else if ( (LA9_0==32||LA9_0==48) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSocrates.g:969:3: ( (lv_f_0_0= rulebasicformulae ) )
                    {
                    // InternalSocrates.g:969:3: ( (lv_f_0_0= rulebasicformulae ) )
                    // InternalSocrates.g:970:4: (lv_f_0_0= rulebasicformulae )
                    {
                    // InternalSocrates.g:970:4: (lv_f_0_0= rulebasicformulae )
                    // InternalSocrates.g:971:5: lv_f_0_0= rulebasicformulae
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormulaAccess().getFBasicformulaeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_f_0_0=rulebasicformulae();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormulaRule());
                      					}
                      					set(
                      						current,
                      						"f",
                      						lv_f_0_0,
                      						"lu.uni.Socrates.basicformulae");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:989:3: ( (lv_f_1_0= ruleformulab ) )
                    {
                    // InternalSocrates.g:989:3: ( (lv_f_1_0= ruleformulab ) )
                    // InternalSocrates.g:990:4: (lv_f_1_0= ruleformulab )
                    {
                    // InternalSocrates.g:990:4: (lv_f_1_0= ruleformulab )
                    // InternalSocrates.g:991:5: lv_f_1_0= ruleformulab
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormulaAccess().getFFormulabParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_f_1_0=ruleformulab();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormulaRule());
                      					}
                      					set(
                      						current,
                      						"f",
                      						lv_f_1_0,
                      						"lu.uni.Socrates.formulab");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformula"


    // $ANTLR start "entryRuleformulab"
    // InternalSocrates.g:1012:1: entryRuleformulab returns [EObject current=null] : iv_ruleformulab= ruleformulab EOF ;
    public final EObject entryRuleformulab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformulab = null;


        try {
            // InternalSocrates.g:1012:49: (iv_ruleformulab= ruleformulab EOF )
            // InternalSocrates.g:1013:2: iv_ruleformulab= ruleformulab EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormulabRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformulab=ruleformulab();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformulab; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformulab"


    // $ANTLR start "ruleformulab"
    // InternalSocrates.g:1019:1: ruleformulab returns [EObject current=null] : ( ( (lv_a_0_0= ruleterm ) ) ( (lv_t_1_0= ruleformulabprime ) ) ) ;
    public final EObject ruleformulab() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        EObject lv_t_1_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1025:2: ( ( ( (lv_a_0_0= ruleterm ) ) ( (lv_t_1_0= ruleformulabprime ) ) ) )
            // InternalSocrates.g:1026:2: ( ( (lv_a_0_0= ruleterm ) ) ( (lv_t_1_0= ruleformulabprime ) ) )
            {
            // InternalSocrates.g:1026:2: ( ( (lv_a_0_0= ruleterm ) ) ( (lv_t_1_0= ruleformulabprime ) ) )
            // InternalSocrates.g:1027:3: ( (lv_a_0_0= ruleterm ) ) ( (lv_t_1_0= ruleformulabprime ) )
            {
            // InternalSocrates.g:1027:3: ( (lv_a_0_0= ruleterm ) )
            // InternalSocrates.g:1028:4: (lv_a_0_0= ruleterm )
            {
            // InternalSocrates.g:1028:4: (lv_a_0_0= ruleterm )
            // InternalSocrates.g:1029:5: lv_a_0_0= ruleterm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormulabAccess().getATermParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_a_0_0=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFormulabRule());
              					}
              					set(
              						current,
              						"a",
              						lv_a_0_0,
              						"lu.uni.Socrates.term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSocrates.g:1046:3: ( (lv_t_1_0= ruleformulabprime ) )
            // InternalSocrates.g:1047:4: (lv_t_1_0= ruleformulabprime )
            {
            // InternalSocrates.g:1047:4: (lv_t_1_0= ruleformulabprime )
            // InternalSocrates.g:1048:5: lv_t_1_0= ruleformulabprime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormulabAccess().getTFormulabprimeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_t_1_0=ruleformulabprime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFormulabRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_1_0,
              						"lu.uni.Socrates.formulabprime");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformulab"


    // $ANTLR start "entryRuleformulabprime"
    // InternalSocrates.g:1069:1: entryRuleformulabprime returns [EObject current=null] : iv_ruleformulabprime= ruleformulabprime EOF ;
    public final EObject entryRuleformulabprime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformulabprime = null;


        try {
            // InternalSocrates.g:1069:54: (iv_ruleformulabprime= ruleformulabprime EOF )
            // InternalSocrates.g:1070:2: iv_ruleformulabprime= ruleformulabprime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormulabprimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformulabprime=ruleformulabprime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformulabprime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformulabprime"


    // $ANTLR start "ruleformulabprime"
    // InternalSocrates.g:1076:1: ruleformulabprime returns [EObject current=null] : ( ( ( (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' ) ) ) ( (lv_t2_1_0= ruleterm ) ) ( (lv_f_2_0= ruleformulabprime ) ) )? ;
    public final EObject ruleformulabprime() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        EObject lv_t2_1_0 = null;

        EObject lv_f_2_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1082:2: ( ( ( ( (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' ) ) ) ( (lv_t2_1_0= ruleterm ) ) ( (lv_f_2_0= ruleformulabprime ) ) )? )
            // InternalSocrates.g:1083:2: ( ( ( (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' ) ) ) ( (lv_t2_1_0= ruleterm ) ) ( (lv_f_2_0= ruleformulabprime ) ) )?
            {
            // InternalSocrates.g:1083:2: ( ( ( (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' ) ) ) ( (lv_t2_1_0= ruleterm ) ) ( (lv_f_2_0= ruleformulabprime ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=26)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSocrates.g:1084:3: ( ( (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' ) ) ) ( (lv_t2_1_0= ruleterm ) ) ( (lv_f_2_0= ruleformulabprime ) )
                    {
                    // InternalSocrates.g:1084:3: ( ( (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' ) ) )
                    // InternalSocrates.g:1085:4: ( (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' ) )
                    {
                    // InternalSocrates.g:1085:4: ( (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' ) )
                    // InternalSocrates.g:1086:5: (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' )
                    {
                    // InternalSocrates.g:1086:5: (lv_op_0_1= 'or' | lv_op_0_2= 'implies' | lv_op_0_3= 'iff' )
                    int alt10=3;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt10=1;
                        }
                        break;
                    case 25:
                        {
                        alt10=2;
                        }
                        break;
                    case 26:
                        {
                        alt10=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // InternalSocrates.g:1087:6: lv_op_0_1= 'or'
                            {
                            lv_op_0_1=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_op_0_1, grammarAccess.getFormulabprimeAccess().getOpOrKeyword_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getFormulabprimeRule());
                              						}
                              						setWithLastConsumed(current, "op", lv_op_0_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSocrates.g:1098:6: lv_op_0_2= 'implies'
                            {
                            lv_op_0_2=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_op_0_2, grammarAccess.getFormulabprimeAccess().getOpImpliesKeyword_0_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getFormulabprimeRule());
                              						}
                              						setWithLastConsumed(current, "op", lv_op_0_2, null);
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalSocrates.g:1109:6: lv_op_0_3= 'iff'
                            {
                            lv_op_0_3=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_op_0_3, grammarAccess.getFormulabprimeAccess().getOpIffKeyword_0_0_2());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getFormulabprimeRule());
                              						}
                              						setWithLastConsumed(current, "op", lv_op_0_3, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalSocrates.g:1122:3: ( (lv_t2_1_0= ruleterm ) )
                    // InternalSocrates.g:1123:4: (lv_t2_1_0= ruleterm )
                    {
                    // InternalSocrates.g:1123:4: (lv_t2_1_0= ruleterm )
                    // InternalSocrates.g:1124:5: lv_t2_1_0= ruleterm
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormulabprimeAccess().getT2TermParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_t2_1_0=ruleterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormulabprimeRule());
                      					}
                      					set(
                      						current,
                      						"t2",
                      						lv_t2_1_0,
                      						"lu.uni.Socrates.term");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }

                    // InternalSocrates.g:1141:3: ( (lv_f_2_0= ruleformulabprime ) )
                    // InternalSocrates.g:1142:4: (lv_f_2_0= ruleformulabprime )
                    {
                    // InternalSocrates.g:1142:4: (lv_f_2_0= ruleformulabprime )
                    // InternalSocrates.g:1143:5: lv_f_2_0= ruleformulabprime
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormulabprimeAccess().getFFormulabprimeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_f_2_0=ruleformulabprime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormulabprimeRule());
                      					}
                      					set(
                      						current,
                      						"f",
                      						lv_f_2_0,
                      						"lu.uni.Socrates.formulabprime");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformulabprime"


    // $ANTLR start "entryRuleterm"
    // InternalSocrates.g:1164:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalSocrates.g:1164:45: (iv_ruleterm= ruleterm EOF )
            // InternalSocrates.g:1165:2: iv_ruleterm= ruleterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalSocrates.g:1171:1: ruleterm returns [EObject current=null] : ( ( (lv_a_0_0= ruleatom ) ) ( (lv_t_1_0= ruletermprime ) ) ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_a_0_0 = null;

        EObject lv_t_1_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1177:2: ( ( ( (lv_a_0_0= ruleatom ) ) ( (lv_t_1_0= ruletermprime ) ) ) )
            // InternalSocrates.g:1178:2: ( ( (lv_a_0_0= ruleatom ) ) ( (lv_t_1_0= ruletermprime ) ) )
            {
            // InternalSocrates.g:1178:2: ( ( (lv_a_0_0= ruleatom ) ) ( (lv_t_1_0= ruletermprime ) ) )
            // InternalSocrates.g:1179:3: ( (lv_a_0_0= ruleatom ) ) ( (lv_t_1_0= ruletermprime ) )
            {
            // InternalSocrates.g:1179:3: ( (lv_a_0_0= ruleatom ) )
            // InternalSocrates.g:1180:4: (lv_a_0_0= ruleatom )
            {
            // InternalSocrates.g:1180:4: (lv_a_0_0= ruleatom )
            // InternalSocrates.g:1181:5: lv_a_0_0= ruleatom
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getAAtomParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_a_0_0=ruleatom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermRule());
              					}
              					set(
              						current,
              						"a",
              						lv_a_0_0,
              						"lu.uni.Socrates.atom");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSocrates.g:1198:3: ( (lv_t_1_0= ruletermprime ) )
            // InternalSocrates.g:1199:4: (lv_t_1_0= ruletermprime )
            {
            // InternalSocrates.g:1199:4: (lv_t_1_0= ruletermprime )
            // InternalSocrates.g:1200:5: lv_t_1_0= ruletermprime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getTTermprimeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_t_1_0=ruletermprime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_1_0,
              						"lu.uni.Socrates.termprime");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRuletermprime"
    // InternalSocrates.g:1221:1: entryRuletermprime returns [EObject current=null] : iv_ruletermprime= ruletermprime EOF ;
    public final EObject entryRuletermprime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermprime = null;


        try {
            // InternalSocrates.g:1221:50: (iv_ruletermprime= ruletermprime EOF )
            // InternalSocrates.g:1222:2: iv_ruletermprime= ruletermprime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermprimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletermprime=ruletermprime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermprime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermprime"


    // $ANTLR start "ruletermprime"
    // InternalSocrates.g:1228:1: ruletermprime returns [EObject current=null] : ( ( (lv_op_0_0= 'and' ) ) ( (lv_t_1_0= ruleterm ) ) ( (lv_f1_2_0= ruletermprime ) ) )? ;
    public final EObject ruletermprime() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_t_1_0 = null;

        EObject lv_f1_2_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1234:2: ( ( ( (lv_op_0_0= 'and' ) ) ( (lv_t_1_0= ruleterm ) ) ( (lv_f1_2_0= ruletermprime ) ) )? )
            // InternalSocrates.g:1235:2: ( ( (lv_op_0_0= 'and' ) ) ( (lv_t_1_0= ruleterm ) ) ( (lv_f1_2_0= ruletermprime ) ) )?
            {
            // InternalSocrates.g:1235:2: ( ( (lv_op_0_0= 'and' ) ) ( (lv_t_1_0= ruleterm ) ) ( (lv_f1_2_0= ruletermprime ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred13_InternalSocrates()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalSocrates.g:1236:3: ( (lv_op_0_0= 'and' ) ) ( (lv_t_1_0= ruleterm ) ) ( (lv_f1_2_0= ruletermprime ) )
                    {
                    // InternalSocrates.g:1236:3: ( (lv_op_0_0= 'and' ) )
                    // InternalSocrates.g:1237:4: (lv_op_0_0= 'and' )
                    {
                    // InternalSocrates.g:1237:4: (lv_op_0_0= 'and' )
                    // InternalSocrates.g:1238:5: lv_op_0_0= 'and'
                    {
                    lv_op_0_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_0, grammarAccess.getTermprimeAccess().getOpAndKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTermprimeRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_0, "and");
                      				
                    }

                    }


                    }

                    // InternalSocrates.g:1250:3: ( (lv_t_1_0= ruleterm ) )
                    // InternalSocrates.g:1251:4: (lv_t_1_0= ruleterm )
                    {
                    // InternalSocrates.g:1251:4: (lv_t_1_0= ruleterm )
                    // InternalSocrates.g:1252:5: lv_t_1_0= ruleterm
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTermprimeAccess().getTTermParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    lv_t_1_0=ruleterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTermprimeRule());
                      					}
                      					set(
                      						current,
                      						"t",
                      						lv_t_1_0,
                      						"lu.uni.Socrates.term");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }

                    // InternalSocrates.g:1269:3: ( (lv_f1_2_0= ruletermprime ) )
                    // InternalSocrates.g:1270:4: (lv_f1_2_0= ruletermprime )
                    {
                    // InternalSocrates.g:1270:4: (lv_f1_2_0= ruletermprime )
                    // InternalSocrates.g:1271:5: lv_f1_2_0= ruletermprime
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTermprimeAccess().getF1TermprimeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_f1_2_0=ruletermprime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTermprimeRule());
                      					}
                      					set(
                      						current,
                      						"f1",
                      						lv_f1_2_0,
                      						"lu.uni.Socrates.termprime");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermprime"


    // $ANTLR start "entryRuleexpression"
    // InternalSocrates.g:1292:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalSocrates.g:1292:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalSocrates.g:1293:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalSocrates.g:1299:1: ruleexpression returns [EObject current=null] : ( (lv_expb_0_0= ruleexpressionb ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expb_0_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1305:2: ( ( (lv_expb_0_0= ruleexpressionb ) ) )
            // InternalSocrates.g:1306:2: ( (lv_expb_0_0= ruleexpressionb ) )
            {
            // InternalSocrates.g:1306:2: ( (lv_expb_0_0= ruleexpressionb ) )
            // InternalSocrates.g:1307:3: (lv_expb_0_0= ruleexpressionb )
            {
            // InternalSocrates.g:1307:3: (lv_expb_0_0= ruleexpressionb )
            // InternalSocrates.g:1308:4: lv_expb_0_0= ruleexpressionb
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getExpressionAccess().getExpbExpressionbParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_expb_0_0=ruleexpressionb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getExpressionRule());
              				}
              				set(
              					current,
              					"expb",
              					lv_expb_0_0,
              					"lu.uni.Socrates.expressionb");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleexpressionb"
    // InternalSocrates.g:1328:1: entryRuleexpressionb returns [EObject current=null] : iv_ruleexpressionb= ruleexpressionb EOF ;
    public final EObject entryRuleexpressionb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpressionb = null;


        try {
            // InternalSocrates.g:1328:52: (iv_ruleexpressionb= ruleexpressionb EOF )
            // InternalSocrates.g:1329:2: iv_ruleexpressionb= ruleexpressionb EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionbRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpressionb=ruleexpressionb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpressionb; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpressionb"


    // $ANTLR start "ruleexpressionb"
    // InternalSocrates.g:1335:1: ruleexpressionb returns [EObject current=null] : ( ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) ) | ( ruleLPAREN ( (lv_term_3_0= ruleexpressionterm ) ) ruleRPAREN ( (lv_expprime_5_0= ruleexpressionprime ) ) ) ) ;
    public final EObject ruleexpressionb() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_0 = null;

        EObject lv_expprime_1_0 = null;

        EObject lv_term_3_0 = null;

        EObject lv_expprime_5_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1341:2: ( ( ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) ) | ( ruleLPAREN ( (lv_term_3_0= ruleexpressionterm ) ) ruleRPAREN ( (lv_expprime_5_0= ruleexpressionprime ) ) ) ) )
            // InternalSocrates.g:1342:2: ( ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) ) | ( ruleLPAREN ( (lv_term_3_0= ruleexpressionterm ) ) ruleRPAREN ( (lv_expprime_5_0= ruleexpressionprime ) ) ) )
            {
            // InternalSocrates.g:1342:2: ( ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) ) | ( ruleLPAREN ( (lv_term_3_0= ruleexpressionterm ) ) ruleRPAREN ( (lv_expprime_5_0= ruleexpressionprime ) ) ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalSocrates.g:1343:3: ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) )
                    {
                    // InternalSocrates.g:1343:3: ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) )
                    // InternalSocrates.g:1344:4: ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) )
                    {
                    // InternalSocrates.g:1344:4: ( (lv_term_0_0= ruleexpressionterm ) )
                    // InternalSocrates.g:1345:5: (lv_term_0_0= ruleexpressionterm )
                    {
                    // InternalSocrates.g:1345:5: (lv_term_0_0= ruleexpressionterm )
                    // InternalSocrates.g:1346:6: lv_term_0_0= ruleexpressionterm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionbAccess().getTermExpressiontermParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_term_0_0=ruleexpressionterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionbRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_0_0,
                      							"lu.uni.Socrates.expressionterm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSocrates.g:1363:4: ( (lv_expprime_1_0= ruleexpressionprime ) )
                    // InternalSocrates.g:1364:5: (lv_expprime_1_0= ruleexpressionprime )
                    {
                    // InternalSocrates.g:1364:5: (lv_expprime_1_0= ruleexpressionprime )
                    // InternalSocrates.g:1365:6: lv_expprime_1_0= ruleexpressionprime
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionbAccess().getExpprimeExpressionprimeParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expprime_1_0=ruleexpressionprime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionbRule());
                      						}
                      						set(
                      							current,
                      							"expprime",
                      							lv_expprime_1_0,
                      							"lu.uni.Socrates.expressionprime");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1384:3: ( ruleLPAREN ( (lv_term_3_0= ruleexpressionterm ) ) ruleRPAREN ( (lv_expprime_5_0= ruleexpressionprime ) ) )
                    {
                    // InternalSocrates.g:1384:3: ( ruleLPAREN ( (lv_term_3_0= ruleexpressionterm ) ) ruleRPAREN ( (lv_expprime_5_0= ruleexpressionprime ) ) )
                    // InternalSocrates.g:1385:4: ruleLPAREN ( (lv_term_3_0= ruleexpressionterm ) ) ruleRPAREN ( (lv_expprime_5_0= ruleexpressionprime ) )
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionbAccess().getLPARENParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    ruleLPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:1395:4: ( (lv_term_3_0= ruleexpressionterm ) )
                    // InternalSocrates.g:1396:5: (lv_term_3_0= ruleexpressionterm )
                    {
                    // InternalSocrates.g:1396:5: (lv_term_3_0= ruleexpressionterm )
                    // InternalSocrates.g:1397:6: lv_term_3_0= ruleexpressionterm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionbAccess().getTermExpressiontermParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_term_3_0=ruleexpressionterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionbRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_3_0,
                      							"lu.uni.Socrates.expressionterm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionbAccess().getRPARENParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    ruleRPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:1424:4: ( (lv_expprime_5_0= ruleexpressionprime ) )
                    // InternalSocrates.g:1425:5: (lv_expprime_5_0= ruleexpressionprime )
                    {
                    // InternalSocrates.g:1425:5: (lv_expprime_5_0= ruleexpressionprime )
                    // InternalSocrates.g:1426:6: lv_expprime_5_0= ruleexpressionprime
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionbAccess().getExpprimeExpressionprimeParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expprime_5_0=ruleexpressionprime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionbRule());
                      						}
                      						set(
                      							current,
                      							"expprime",
                      							lv_expprime_5_0,
                      							"lu.uni.Socrates.expressionprime");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpressionb"


    // $ANTLR start "entryRuleexpressionprime"
    // InternalSocrates.g:1448:1: entryRuleexpressionprime returns [EObject current=null] : iv_ruleexpressionprime= ruleexpressionprime EOF ;
    public final EObject entryRuleexpressionprime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpressionprime = null;


        try {
            // InternalSocrates.g:1448:56: (iv_ruleexpressionprime= ruleexpressionprime EOF )
            // InternalSocrates.g:1449:2: iv_ruleexpressionprime= ruleexpressionprime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionprimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpressionprime=ruleexpressionprime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpressionprime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpressionprime"


    // $ANTLR start "ruleexpressionprime"
    // InternalSocrates.g:1455:1: ruleexpressionprime returns [EObject current=null] : ( ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressionprime ) ) )? ;
    public final EObject ruleexpressionprime() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        EObject lv_t2_1_0 = null;

        EObject lv_f_2_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1461:2: ( ( ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressionprime ) ) )? )
            // InternalSocrates.g:1462:2: ( ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressionprime ) ) )?
            {
            // InternalSocrates.g:1462:2: ( ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressionprime ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred16_InternalSocrates()) ) {
                    alt15=1;
                }
            }
            else if ( (LA15_0==29) ) {
                int LA15_2 = input.LA(2);

                if ( (synpred16_InternalSocrates()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalSocrates.g:1463:3: ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressionprime ) )
                    {
                    // InternalSocrates.g:1463:3: ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) ) )
                    // InternalSocrates.g:1464:4: ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) )
                    {
                    // InternalSocrates.g:1464:4: ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) )
                    // InternalSocrates.g:1465:5: (lv_op_0_1= '+' | lv_op_0_2= '-' )
                    {
                    // InternalSocrates.g:1465:5: (lv_op_0_1= '+' | lv_op_0_2= '-' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==29) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSocrates.g:1466:6: lv_op_0_1= '+'
                            {
                            lv_op_0_1=(Token)match(input,28,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_op_0_1, grammarAccess.getExpressionprimeAccess().getOpPlusSignKeyword_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getExpressionprimeRule());
                              						}
                              						setWithLastConsumed(current, "op", lv_op_0_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSocrates.g:1477:6: lv_op_0_2= '-'
                            {
                            lv_op_0_2=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_op_0_2, grammarAccess.getExpressionprimeAccess().getOpHyphenMinusKeyword_0_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getExpressionprimeRule());
                              						}
                              						setWithLastConsumed(current, "op", lv_op_0_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalSocrates.g:1490:3: ( (lv_t2_1_0= ruleexpressionterm ) )
                    // InternalSocrates.g:1491:4: (lv_t2_1_0= ruleexpressionterm )
                    {
                    // InternalSocrates.g:1491:4: (lv_t2_1_0= ruleexpressionterm )
                    // InternalSocrates.g:1492:5: lv_t2_1_0= ruleexpressionterm
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionprimeAccess().getT2ExpressiontermParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
                    lv_t2_1_0=ruleexpressionterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionprimeRule());
                      					}
                      					set(
                      						current,
                      						"t2",
                      						lv_t2_1_0,
                      						"lu.uni.Socrates.expressionterm");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }

                    // InternalSocrates.g:1509:3: ( (lv_f_2_0= ruleexpressionprime ) )
                    // InternalSocrates.g:1510:4: (lv_f_2_0= ruleexpressionprime )
                    {
                    // InternalSocrates.g:1510:4: (lv_f_2_0= ruleexpressionprime )
                    // InternalSocrates.g:1511:5: lv_f_2_0= ruleexpressionprime
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionprimeAccess().getFExpressionprimeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_f_2_0=ruleexpressionprime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionprimeRule());
                      					}
                      					set(
                      						current,
                      						"f",
                      						lv_f_2_0,
                      						"lu.uni.Socrates.expressionprime");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpressionprime"


    // $ANTLR start "entryRuleexpressionterm"
    // InternalSocrates.g:1532:1: entryRuleexpressionterm returns [EObject current=null] : iv_ruleexpressionterm= ruleexpressionterm EOF ;
    public final EObject entryRuleexpressionterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpressionterm = null;


        try {
            // InternalSocrates.g:1532:55: (iv_ruleexpressionterm= ruleexpressionterm EOF )
            // InternalSocrates.g:1533:2: iv_ruleexpressionterm= ruleexpressionterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressiontermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpressionterm=ruleexpressionterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpressionterm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpressionterm"


    // $ANTLR start "ruleexpressionterm"
    // InternalSocrates.g:1539:1: ruleexpressionterm returns [EObject current=null] : ( ( ( (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression ) ) ) ( (lv_expprime_1_0= ruleexpressiontermprime ) ) ) ;
    public final EObject ruleexpressionterm() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_1 = null;

        EObject lv_term_0_2 = null;

        EObject lv_expprime_1_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1545:2: ( ( ( ( (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression ) ) ) ( (lv_expprime_1_0= ruleexpressiontermprime ) ) ) )
            // InternalSocrates.g:1546:2: ( ( ( (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression ) ) ) ( (lv_expprime_1_0= ruleexpressiontermprime ) ) )
            {
            // InternalSocrates.g:1546:2: ( ( ( (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression ) ) ) ( (lv_expprime_1_0= ruleexpressiontermprime ) ) )
            // InternalSocrates.g:1547:3: ( ( (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression ) ) ) ( (lv_expprime_1_0= ruleexpressiontermprime ) )
            {
            // InternalSocrates.g:1547:3: ( ( (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression ) ) )
            // InternalSocrates.g:1548:4: ( (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression ) )
            {
            // InternalSocrates.g:1548:4: ( (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression ) )
            // InternalSocrates.g:1549:5: (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression )
            {
            // InternalSocrates.g:1549:5: (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalSocrates.g:1550:6: lv_term_0_1= ruleExpressionAtom
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressiontermAccess().getTermExpressionAtomParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_term_0_1=ruleExpressionAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressiontermRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_0_1,
                      							"lu.uni.Socrates.ExpressionAtom");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1566:6: lv_term_0_2= ruleBasicexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressiontermAccess().getTermBasicexpressionParserRuleCall_0_0_1());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_term_0_2=ruleBasicexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressiontermRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_0_2,
                      							"lu.uni.Socrates.Basicexpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSocrates.g:1584:3: ( (lv_expprime_1_0= ruleexpressiontermprime ) )
            // InternalSocrates.g:1585:4: (lv_expprime_1_0= ruleexpressiontermprime )
            {
            // InternalSocrates.g:1585:4: (lv_expprime_1_0= ruleexpressiontermprime )
            // InternalSocrates.g:1586:5: lv_expprime_1_0= ruleexpressiontermprime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressiontermAccess().getExpprimeExpressiontermprimeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expprime_1_0=ruleexpressiontermprime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressiontermRule());
              					}
              					set(
              						current,
              						"expprime",
              						lv_expprime_1_0,
              						"lu.uni.Socrates.expressiontermprime");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpressionterm"


    // $ANTLR start "entryRuleexpressiontermprime"
    // InternalSocrates.g:1607:1: entryRuleexpressiontermprime returns [EObject current=null] : iv_ruleexpressiontermprime= ruleexpressiontermprime EOF ;
    public final EObject entryRuleexpressiontermprime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpressiontermprime = null;


        try {
            // InternalSocrates.g:1607:60: (iv_ruleexpressiontermprime= ruleexpressiontermprime EOF )
            // InternalSocrates.g:1608:2: iv_ruleexpressiontermprime= ruleexpressiontermprime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressiontermprimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpressiontermprime=ruleexpressiontermprime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpressiontermprime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpressiontermprime"


    // $ANTLR start "ruleexpressiontermprime"
    // InternalSocrates.g:1614:1: ruleexpressiontermprime returns [EObject current=null] : ( ( ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressiontermprime ) ) )? ;
    public final EObject ruleexpressiontermprime() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        EObject lv_t2_1_0 = null;

        EObject lv_f_2_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1620:2: ( ( ( ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressiontermprime ) ) )? )
            // InternalSocrates.g:1621:2: ( ( ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressiontermprime ) ) )?
            {
            // InternalSocrates.g:1621:2: ( ( ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressiontermprime ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred19_InternalSocrates()) ) {
                    alt18=1;
                }
            }
            else if ( (LA18_0==31) ) {
                int LA18_2 = input.LA(2);

                if ( (synpred19_InternalSocrates()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalSocrates.g:1622:3: ( ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressiontermprime ) )
                    {
                    // InternalSocrates.g:1622:3: ( ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) ) )
                    // InternalSocrates.g:1623:4: ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) )
                    {
                    // InternalSocrates.g:1623:4: ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) )
                    // InternalSocrates.g:1624:5: (lv_op_0_1= '*' | lv_op_0_2= '/' )
                    {
                    // InternalSocrates.g:1624:5: (lv_op_0_1= '*' | lv_op_0_2= '/' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==30) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==31) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSocrates.g:1625:6: lv_op_0_1= '*'
                            {
                            lv_op_0_1=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_op_0_1, grammarAccess.getExpressiontermprimeAccess().getOpAsteriskKeyword_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getExpressiontermprimeRule());
                              						}
                              						setWithLastConsumed(current, "op", lv_op_0_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSocrates.g:1636:6: lv_op_0_2= '/'
                            {
                            lv_op_0_2=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_op_0_2, grammarAccess.getExpressiontermprimeAccess().getOpSolidusKeyword_0_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getExpressiontermprimeRule());
                              						}
                              						setWithLastConsumed(current, "op", lv_op_0_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalSocrates.g:1649:3: ( (lv_t2_1_0= ruleexpressionterm ) )
                    // InternalSocrates.g:1650:4: (lv_t2_1_0= ruleexpressionterm )
                    {
                    // InternalSocrates.g:1650:4: (lv_t2_1_0= ruleexpressionterm )
                    // InternalSocrates.g:1651:5: lv_t2_1_0= ruleexpressionterm
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressiontermprimeAccess().getT2ExpressiontermParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
                    lv_t2_1_0=ruleexpressionterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressiontermprimeRule());
                      					}
                      					set(
                      						current,
                      						"t2",
                      						lv_t2_1_0,
                      						"lu.uni.Socrates.expressionterm");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }

                    // InternalSocrates.g:1668:3: ( (lv_f_2_0= ruleexpressiontermprime ) )
                    // InternalSocrates.g:1669:4: (lv_f_2_0= ruleexpressiontermprime )
                    {
                    // InternalSocrates.g:1669:4: (lv_f_2_0= ruleexpressiontermprime )
                    // InternalSocrates.g:1670:5: lv_f_2_0= ruleexpressiontermprime
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressiontermprimeAccess().getFExpressiontermprimeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_f_2_0=ruleexpressiontermprime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressiontermprimeRule());
                      					}
                      					set(
                      						current,
                      						"f",
                      						lv_f_2_0,
                      						"lu.uni.Socrates.expressiontermprime");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpressiontermprime"


    // $ANTLR start "entryRuleExpressionAtom"
    // InternalSocrates.g:1691:1: entryRuleExpressionAtom returns [EObject current=null] : iv_ruleExpressionAtom= ruleExpressionAtom EOF ;
    public final EObject entryRuleExpressionAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionAtom = null;


        try {
            // InternalSocrates.g:1691:55: (iv_ruleExpressionAtom= ruleExpressionAtom EOF )
            // InternalSocrates.g:1692:2: iv_ruleExpressionAtom= ruleExpressionAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionAtom=ruleExpressionAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAtom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionAtom"


    // $ANTLR start "ruleExpressionAtom"
    // InternalSocrates.g:1698:1: ruleExpressionAtom returns [EObject current=null] : ( ( (lv_exp_0_0= ruleSignal ) ) | ( ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN ) | ( ( (lv_op_4_0= ruleSIGN ) ) ( (lv_exp_5_0= ruleexpression ) ) ) | ( (lv_exp_6_0= rulevalue ) ) ) ;
    public final EObject ruleExpressionAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;

        AntlrDatatypeRuleToken lv_op_4_0 = null;

        EObject lv_exp_5_0 = null;

        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1704:2: ( ( ( (lv_exp_0_0= ruleSignal ) ) | ( ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN ) | ( ( (lv_op_4_0= ruleSIGN ) ) ( (lv_exp_5_0= ruleexpression ) ) ) | ( (lv_exp_6_0= rulevalue ) ) ) )
            // InternalSocrates.g:1705:2: ( ( (lv_exp_0_0= ruleSignal ) ) | ( ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN ) | ( ( (lv_op_4_0= ruleSIGN ) ) ( (lv_exp_5_0= ruleexpression ) ) ) | ( (lv_exp_6_0= rulevalue ) ) )
            {
            // InternalSocrates.g:1705:2: ( ( (lv_exp_0_0= ruleSignal ) ) | ( ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN ) | ( ( (lv_op_4_0= ruleSIGN ) ) ( (lv_exp_5_0= ruleexpression ) ) ) | ( (lv_exp_6_0= rulevalue ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA19_1 = input.LA(2);

                if ( (synpred20_InternalSocrates()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA19_2 = input.LA(2);

                if ( (synpred21_InternalSocrates()) ) {
                    alt19=2;
                }
                else if ( (true) ) {
                    alt19=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 29:
                {
                alt19=3;
                }
                break;
            case RULE_INT:
            case RULE_DIGIT:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSocrates.g:1706:3: ( (lv_exp_0_0= ruleSignal ) )
                    {
                    // InternalSocrates.g:1706:3: ( (lv_exp_0_0= ruleSignal ) )
                    // InternalSocrates.g:1707:4: (lv_exp_0_0= ruleSignal )
                    {
                    // InternalSocrates.g:1707:4: (lv_exp_0_0= ruleSignal )
                    // InternalSocrates.g:1708:5: lv_exp_0_0= ruleSignal
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionAtomAccess().getExpSignalParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_0_0=ruleSignal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionAtomRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_0_0,
                      						"lu.uni.Socrates.Signal");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1726:3: ( ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN )
                    {
                    // InternalSocrates.g:1726:3: ( ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN )
                    // InternalSocrates.g:1727:4: ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAtomAccess().getLPARENParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    ruleLPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:1737:4: ( (lv_exp_2_0= ruleexpression ) )
                    // InternalSocrates.g:1738:5: (lv_exp_2_0= ruleexpression )
                    {
                    // InternalSocrates.g:1738:5: (lv_exp_2_0= ruleexpression )
                    // InternalSocrates.g:1739:6: lv_exp_2_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAtomAccess().getExpExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_exp_2_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionAtomRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_2_0,
                      							"lu.uni.Socrates.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAtomAccess().getRPARENParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleRPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:1768:3: ( ( (lv_op_4_0= ruleSIGN ) ) ( (lv_exp_5_0= ruleexpression ) ) )
                    {
                    // InternalSocrates.g:1768:3: ( ( (lv_op_4_0= ruleSIGN ) ) ( (lv_exp_5_0= ruleexpression ) ) )
                    // InternalSocrates.g:1769:4: ( (lv_op_4_0= ruleSIGN ) ) ( (lv_exp_5_0= ruleexpression ) )
                    {
                    // InternalSocrates.g:1769:4: ( (lv_op_4_0= ruleSIGN ) )
                    // InternalSocrates.g:1770:5: (lv_op_4_0= ruleSIGN )
                    {
                    // InternalSocrates.g:1770:5: (lv_op_4_0= ruleSIGN )
                    // InternalSocrates.g:1771:6: lv_op_4_0= ruleSIGN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAtomAccess().getOpSIGNParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_op_4_0=ruleSIGN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionAtomRule());
                      						}
                      						set(
                      							current,
                      							"op",
                      							lv_op_4_0,
                      							"lu.uni.Socrates.SIGN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSocrates.g:1788:4: ( (lv_exp_5_0= ruleexpression ) )
                    // InternalSocrates.g:1789:5: (lv_exp_5_0= ruleexpression )
                    {
                    // InternalSocrates.g:1789:5: (lv_exp_5_0= ruleexpression )
                    // InternalSocrates.g:1790:6: lv_exp_5_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAtomAccess().getExpExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_5_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionAtomRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_5_0,
                      							"lu.uni.Socrates.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSocrates.g:1809:3: ( (lv_exp_6_0= rulevalue ) )
                    {
                    // InternalSocrates.g:1809:3: ( (lv_exp_6_0= rulevalue ) )
                    // InternalSocrates.g:1810:4: (lv_exp_6_0= rulevalue )
                    {
                    // InternalSocrates.g:1810:4: (lv_exp_6_0= rulevalue )
                    // InternalSocrates.g:1811:5: lv_exp_6_0= rulevalue
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionAtomAccess().getExpValueParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_6_0=rulevalue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionAtomRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_6_0,
                      						"lu.uni.Socrates.value");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionAtom"


    // $ANTLR start "entryRuleBasicexpression"
    // InternalSocrates.g:1832:1: entryRuleBasicexpression returns [EObject current=null] : iv_ruleBasicexpression= ruleBasicexpression EOF ;
    public final EObject entryRuleBasicexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicexpression = null;


        try {
            // InternalSocrates.g:1832:56: (iv_ruleBasicexpression= ruleBasicexpression EOF )
            // InternalSocrates.g:1833:2: iv_ruleBasicexpression= ruleBasicexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicexpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicexpression=ruleBasicexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicexpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicexpression"


    // $ANTLR start "ruleBasicexpression"
    // InternalSocrates.g:1839:1: ruleBasicexpression returns [EObject current=null] : ( ( ruleLPAREN ( (lv_exp_1_0= ruleBasicexpression ) ) ruleRPAREN ) | ( (lv_exp_3_0= ruleAbsEXP ) ) | ( (lv_exp_4_0= ruleNormexp ) ) | ( (lv_exp_5_0= ruleSin ) ) | ( (lv_exp_6_0= ruleCos ) ) | ( (lv_exp_7_0= ruleSqrt ) ) ) ;
    public final EObject ruleBasicexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_1_0 = null;

        EObject lv_exp_3_0 = null;

        EObject lv_exp_4_0 = null;

        EObject lv_exp_5_0 = null;

        EObject lv_exp_6_0 = null;

        EObject lv_exp_7_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:1845:2: ( ( ( ruleLPAREN ( (lv_exp_1_0= ruleBasicexpression ) ) ruleRPAREN ) | ( (lv_exp_3_0= ruleAbsEXP ) ) | ( (lv_exp_4_0= ruleNormexp ) ) | ( (lv_exp_5_0= ruleSin ) ) | ( (lv_exp_6_0= ruleCos ) ) | ( (lv_exp_7_0= ruleSqrt ) ) ) )
            // InternalSocrates.g:1846:2: ( ( ruleLPAREN ( (lv_exp_1_0= ruleBasicexpression ) ) ruleRPAREN ) | ( (lv_exp_3_0= ruleAbsEXP ) ) | ( (lv_exp_4_0= ruleNormexp ) ) | ( (lv_exp_5_0= ruleSin ) ) | ( (lv_exp_6_0= ruleCos ) ) | ( (lv_exp_7_0= ruleSqrt ) ) )
            {
            // InternalSocrates.g:1846:2: ( ( ruleLPAREN ( (lv_exp_1_0= ruleBasicexpression ) ) ruleRPAREN ) | ( (lv_exp_3_0= ruleAbsEXP ) ) | ( (lv_exp_4_0= ruleNormexp ) ) | ( (lv_exp_5_0= ruleSin ) ) | ( (lv_exp_6_0= ruleCos ) ) | ( (lv_exp_7_0= ruleSqrt ) ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                alt20=2;
                }
                break;
            case 35:
                {
                alt20=3;
                }
                break;
            case 36:
                {
                alt20=4;
                }
                break;
            case 37:
                {
                alt20=5;
                }
                break;
            case 38:
                {
                alt20=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalSocrates.g:1847:3: ( ruleLPAREN ( (lv_exp_1_0= ruleBasicexpression ) ) ruleRPAREN )
                    {
                    // InternalSocrates.g:1847:3: ( ruleLPAREN ( (lv_exp_1_0= ruleBasicexpression ) ) ruleRPAREN )
                    // InternalSocrates.g:1848:4: ruleLPAREN ( (lv_exp_1_0= ruleBasicexpression ) ) ruleRPAREN
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBasicexpressionAccess().getLPARENParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    ruleLPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:1858:4: ( (lv_exp_1_0= ruleBasicexpression ) )
                    // InternalSocrates.g:1859:5: (lv_exp_1_0= ruleBasicexpression )
                    {
                    // InternalSocrates.g:1859:5: (lv_exp_1_0= ruleBasicexpression )
                    // InternalSocrates.g:1860:6: lv_exp_1_0= ruleBasicexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBasicexpressionAccess().getExpBasicexpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_exp_1_0=ruleBasicexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBasicexpressionRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_1_0,
                      							"lu.uni.Socrates.Basicexpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBasicexpressionAccess().getRPARENParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleRPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:1889:3: ( (lv_exp_3_0= ruleAbsEXP ) )
                    {
                    // InternalSocrates.g:1889:3: ( (lv_exp_3_0= ruleAbsEXP ) )
                    // InternalSocrates.g:1890:4: (lv_exp_3_0= ruleAbsEXP )
                    {
                    // InternalSocrates.g:1890:4: (lv_exp_3_0= ruleAbsEXP )
                    // InternalSocrates.g:1891:5: lv_exp_3_0= ruleAbsEXP
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicexpressionAccess().getExpAbsEXPParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_3_0=ruleAbsEXP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicexpressionRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_3_0,
                      						"lu.uni.Socrates.AbsEXP");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:1909:3: ( (lv_exp_4_0= ruleNormexp ) )
                    {
                    // InternalSocrates.g:1909:3: ( (lv_exp_4_0= ruleNormexp ) )
                    // InternalSocrates.g:1910:4: (lv_exp_4_0= ruleNormexp )
                    {
                    // InternalSocrates.g:1910:4: (lv_exp_4_0= ruleNormexp )
                    // InternalSocrates.g:1911:5: lv_exp_4_0= ruleNormexp
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicexpressionAccess().getExpNormexpParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_4_0=ruleNormexp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicexpressionRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_4_0,
                      						"lu.uni.Socrates.Normexp");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSocrates.g:1929:3: ( (lv_exp_5_0= ruleSin ) )
                    {
                    // InternalSocrates.g:1929:3: ( (lv_exp_5_0= ruleSin ) )
                    // InternalSocrates.g:1930:4: (lv_exp_5_0= ruleSin )
                    {
                    // InternalSocrates.g:1930:4: (lv_exp_5_0= ruleSin )
                    // InternalSocrates.g:1931:5: lv_exp_5_0= ruleSin
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicexpressionAccess().getExpSinParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_5_0=ruleSin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicexpressionRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_5_0,
                      						"lu.uni.Socrates.Sin");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSocrates.g:1949:3: ( (lv_exp_6_0= ruleCos ) )
                    {
                    // InternalSocrates.g:1949:3: ( (lv_exp_6_0= ruleCos ) )
                    // InternalSocrates.g:1950:4: (lv_exp_6_0= ruleCos )
                    {
                    // InternalSocrates.g:1950:4: (lv_exp_6_0= ruleCos )
                    // InternalSocrates.g:1951:5: lv_exp_6_0= ruleCos
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicexpressionAccess().getExpCosParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_6_0=ruleCos();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicexpressionRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_6_0,
                      						"lu.uni.Socrates.Cos");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSocrates.g:1969:3: ( (lv_exp_7_0= ruleSqrt ) )
                    {
                    // InternalSocrates.g:1969:3: ( (lv_exp_7_0= ruleSqrt ) )
                    // InternalSocrates.g:1970:4: (lv_exp_7_0= ruleSqrt )
                    {
                    // InternalSocrates.g:1970:4: (lv_exp_7_0= ruleSqrt )
                    // InternalSocrates.g:1971:5: lv_exp_7_0= ruleSqrt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicexpressionAccess().getExpSqrtParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_7_0=ruleSqrt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicexpressionRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_7_0,
                      						"lu.uni.Socrates.Sqrt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicexpression"


    // $ANTLR start "entryRulebasicformulae"
    // InternalSocrates.g:1992:1: entryRulebasicformulae returns [EObject current=null] : iv_rulebasicformulae= rulebasicformulae EOF ;
    public final EObject entryRulebasicformulae() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebasicformulae = null;


        try {
            // InternalSocrates.g:1992:54: (iv_rulebasicformulae= rulebasicformulae EOF )
            // InternalSocrates.g:1993:2: iv_rulebasicformulae= rulebasicformulae EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicformulaeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebasicformulae=rulebasicformulae();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebasicformulae; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebasicformulae"


    // $ANTLR start "rulebasicformulae"
    // InternalSocrates.g:1999:1: rulebasicformulae returns [EObject current=null] : ( ( (lv_f_0_0= rulenegationformula ) ) | ( (lv_f_1_0= ruleforAllformula ) ) | ( (lv_f_2_0= ruleexistsformula ) ) ) ;
    public final EObject rulebasicformulae() throws RecognitionException {
        EObject current = null;

        EObject lv_f_0_0 = null;

        EObject lv_f_1_0 = null;

        EObject lv_f_2_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:2005:2: ( ( ( (lv_f_0_0= rulenegationformula ) ) | ( (lv_f_1_0= ruleforAllformula ) ) | ( (lv_f_2_0= ruleexistsformula ) ) ) )
            // InternalSocrates.g:2006:2: ( ( (lv_f_0_0= rulenegationformula ) ) | ( (lv_f_1_0= ruleforAllformula ) ) | ( (lv_f_2_0= ruleexistsformula ) ) )
            {
            // InternalSocrates.g:2006:2: ( ( (lv_f_0_0= rulenegationformula ) ) | ( (lv_f_1_0= ruleforAllformula ) ) | ( (lv_f_2_0= ruleexistsformula ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt21=1;
                }
                break;
            case 53:
                {
                alt21=2;
                }
                break;
            case 54:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSocrates.g:2007:3: ( (lv_f_0_0= rulenegationformula ) )
                    {
                    // InternalSocrates.g:2007:3: ( (lv_f_0_0= rulenegationformula ) )
                    // InternalSocrates.g:2008:4: (lv_f_0_0= rulenegationformula )
                    {
                    // InternalSocrates.g:2008:4: (lv_f_0_0= rulenegationformula )
                    // InternalSocrates.g:2009:5: lv_f_0_0= rulenegationformula
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicformulaeAccess().getFNegationformulaParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_f_0_0=rulenegationformula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicformulaeRule());
                      					}
                      					set(
                      						current,
                      						"f",
                      						lv_f_0_0,
                      						"lu.uni.Socrates.negationformula");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2027:3: ( (lv_f_1_0= ruleforAllformula ) )
                    {
                    // InternalSocrates.g:2027:3: ( (lv_f_1_0= ruleforAllformula ) )
                    // InternalSocrates.g:2028:4: (lv_f_1_0= ruleforAllformula )
                    {
                    // InternalSocrates.g:2028:4: (lv_f_1_0= ruleforAllformula )
                    // InternalSocrates.g:2029:5: lv_f_1_0= ruleforAllformula
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicformulaeAccess().getFForAllformulaParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_f_1_0=ruleforAllformula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicformulaeRule());
                      					}
                      					set(
                      						current,
                      						"f",
                      						lv_f_1_0,
                      						"lu.uni.Socrates.forAllformula");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:2047:3: ( (lv_f_2_0= ruleexistsformula ) )
                    {
                    // InternalSocrates.g:2047:3: ( (lv_f_2_0= ruleexistsformula ) )
                    // InternalSocrates.g:2048:4: (lv_f_2_0= ruleexistsformula )
                    {
                    // InternalSocrates.g:2048:4: (lv_f_2_0= ruleexistsformula )
                    // InternalSocrates.g:2049:5: lv_f_2_0= ruleexistsformula
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicformulaeAccess().getFExistsformulaParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_f_2_0=ruleexistsformula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicformulaeRule());
                      					}
                      					set(
                      						current,
                      						"f",
                      						lv_f_2_0,
                      						"lu.uni.Socrates.existsformula");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebasicformulae"


    // $ANTLR start "entryRuleboundterm"
    // InternalSocrates.g:2070:1: entryRuleboundterm returns [EObject current=null] : iv_ruleboundterm= ruleboundterm EOF ;
    public final EObject entryRuleboundterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboundterm = null;


        try {
            // InternalSocrates.g:2070:50: (iv_ruleboundterm= ruleboundterm EOF )
            // InternalSocrates.g:2071:2: iv_ruleboundterm= ruleboundterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundtermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleboundterm=ruleboundterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboundterm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleboundterm"


    // $ANTLR start "ruleboundterm"
    // InternalSocrates.g:2077:1: ruleboundterm returns [EObject current=null] : ( ( (lv_ref_0_0= ruleTvariable ) ) ruleIN ( ( (lv_l_2_0= ruleLSQUARE ) ) | ( (lv_l_3_0= ruleLPAREN ) ) ) ( (lv_leftbound_4_0= ruletimedterm ) ) ruleCOMMA ( (lv_rightbound_6_0= ruletimedterm ) ) ( ( (lv_r_7_0= ruleRSQUARE ) ) | ( (lv_r_8_0= ruleRPAREN ) ) ) ) ;
    public final EObject ruleboundterm() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;

        AntlrDatatypeRuleToken lv_l_2_0 = null;

        AntlrDatatypeRuleToken lv_l_3_0 = null;

        EObject lv_leftbound_4_0 = null;

        EObject lv_rightbound_6_0 = null;

        AntlrDatatypeRuleToken lv_r_7_0 = null;

        AntlrDatatypeRuleToken lv_r_8_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:2083:2: ( ( ( (lv_ref_0_0= ruleTvariable ) ) ruleIN ( ( (lv_l_2_0= ruleLSQUARE ) ) | ( (lv_l_3_0= ruleLPAREN ) ) ) ( (lv_leftbound_4_0= ruletimedterm ) ) ruleCOMMA ( (lv_rightbound_6_0= ruletimedterm ) ) ( ( (lv_r_7_0= ruleRSQUARE ) ) | ( (lv_r_8_0= ruleRPAREN ) ) ) ) )
            // InternalSocrates.g:2084:2: ( ( (lv_ref_0_0= ruleTvariable ) ) ruleIN ( ( (lv_l_2_0= ruleLSQUARE ) ) | ( (lv_l_3_0= ruleLPAREN ) ) ) ( (lv_leftbound_4_0= ruletimedterm ) ) ruleCOMMA ( (lv_rightbound_6_0= ruletimedterm ) ) ( ( (lv_r_7_0= ruleRSQUARE ) ) | ( (lv_r_8_0= ruleRPAREN ) ) ) )
            {
            // InternalSocrates.g:2084:2: ( ( (lv_ref_0_0= ruleTvariable ) ) ruleIN ( ( (lv_l_2_0= ruleLSQUARE ) ) | ( (lv_l_3_0= ruleLPAREN ) ) ) ( (lv_leftbound_4_0= ruletimedterm ) ) ruleCOMMA ( (lv_rightbound_6_0= ruletimedterm ) ) ( ( (lv_r_7_0= ruleRSQUARE ) ) | ( (lv_r_8_0= ruleRPAREN ) ) ) )
            // InternalSocrates.g:2085:3: ( (lv_ref_0_0= ruleTvariable ) ) ruleIN ( ( (lv_l_2_0= ruleLSQUARE ) ) | ( (lv_l_3_0= ruleLPAREN ) ) ) ( (lv_leftbound_4_0= ruletimedterm ) ) ruleCOMMA ( (lv_rightbound_6_0= ruletimedterm ) ) ( ( (lv_r_7_0= ruleRSQUARE ) ) | ( (lv_r_8_0= ruleRPAREN ) ) )
            {
            // InternalSocrates.g:2085:3: ( (lv_ref_0_0= ruleTvariable ) )
            // InternalSocrates.g:2086:4: (lv_ref_0_0= ruleTvariable )
            {
            // InternalSocrates.g:2086:4: (lv_ref_0_0= ruleTvariable )
            // InternalSocrates.g:2087:5: lv_ref_0_0= ruleTvariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBoundtermAccess().getRefTvariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_ref_0_0=ruleTvariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBoundtermRule());
              					}
              					set(
              						current,
              						"ref",
              						lv_ref_0_0,
              						"lu.uni.Socrates.Tvariable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoundtermAccess().getINParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_29);
            ruleIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:2114:3: ( ( (lv_l_2_0= ruleLSQUARE ) ) | ( (lv_l_3_0= ruleLPAREN ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            else if ( (LA22_0==48) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSocrates.g:2115:4: ( (lv_l_2_0= ruleLSQUARE ) )
                    {
                    // InternalSocrates.g:2115:4: ( (lv_l_2_0= ruleLSQUARE ) )
                    // InternalSocrates.g:2116:5: (lv_l_2_0= ruleLSQUARE )
                    {
                    // InternalSocrates.g:2116:5: (lv_l_2_0= ruleLSQUARE )
                    // InternalSocrates.g:2117:6: lv_l_2_0= ruleLSQUARE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBoundtermAccess().getLLSQUAREParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_l_2_0=ruleLSQUARE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBoundtermRule());
                      						}
                      						set(
                      							current,
                      							"l",
                      							lv_l_2_0,
                      							"lu.uni.Socrates.LSQUARE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2135:4: ( (lv_l_3_0= ruleLPAREN ) )
                    {
                    // InternalSocrates.g:2135:4: ( (lv_l_3_0= ruleLPAREN ) )
                    // InternalSocrates.g:2136:5: (lv_l_3_0= ruleLPAREN )
                    {
                    // InternalSocrates.g:2136:5: (lv_l_3_0= ruleLPAREN )
                    // InternalSocrates.g:2137:6: lv_l_3_0= ruleLPAREN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBoundtermAccess().getLLPARENParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_l_3_0=ruleLPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBoundtermRule());
                      						}
                      						set(
                      							current,
                      							"l",
                      							lv_l_3_0,
                      							"lu.uni.Socrates.LPAREN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSocrates.g:2155:3: ( (lv_leftbound_4_0= ruletimedterm ) )
            // InternalSocrates.g:2156:4: (lv_leftbound_4_0= ruletimedterm )
            {
            // InternalSocrates.g:2156:4: (lv_leftbound_4_0= ruletimedterm )
            // InternalSocrates.g:2157:5: lv_leftbound_4_0= ruletimedterm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBoundtermAccess().getLeftboundTimedtermParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_leftbound_4_0=ruletimedterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBoundtermRule());
              					}
              					set(
              						current,
              						"leftbound",
              						lv_leftbound_4_0,
              						"lu.uni.Socrates.timedterm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoundtermAccess().getCOMMAParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_30);
            ruleCOMMA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:2184:3: ( (lv_rightbound_6_0= ruletimedterm ) )
            // InternalSocrates.g:2185:4: (lv_rightbound_6_0= ruletimedterm )
            {
            // InternalSocrates.g:2185:4: (lv_rightbound_6_0= ruletimedterm )
            // InternalSocrates.g:2186:5: lv_rightbound_6_0= ruletimedterm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBoundtermAccess().getRightboundTimedtermParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_rightbound_6_0=ruletimedterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBoundtermRule());
              					}
              					set(
              						current,
              						"rightbound",
              						lv_rightbound_6_0,
              						"lu.uni.Socrates.timedterm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSocrates.g:2203:3: ( ( (lv_r_7_0= ruleRSQUARE ) ) | ( (lv_r_8_0= ruleRPAREN ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            else if ( (LA23_0==49) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSocrates.g:2204:4: ( (lv_r_7_0= ruleRSQUARE ) )
                    {
                    // InternalSocrates.g:2204:4: ( (lv_r_7_0= ruleRSQUARE ) )
                    // InternalSocrates.g:2205:5: (lv_r_7_0= ruleRSQUARE )
                    {
                    // InternalSocrates.g:2205:5: (lv_r_7_0= ruleRSQUARE )
                    // InternalSocrates.g:2206:6: lv_r_7_0= ruleRSQUARE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBoundtermAccess().getRRSQUAREParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_r_7_0=ruleRSQUARE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBoundtermRule());
                      						}
                      						set(
                      							current,
                      							"r",
                      							lv_r_7_0,
                      							"lu.uni.Socrates.RSQUARE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2224:4: ( (lv_r_8_0= ruleRPAREN ) )
                    {
                    // InternalSocrates.g:2224:4: ( (lv_r_8_0= ruleRPAREN ) )
                    // InternalSocrates.g:2225:5: (lv_r_8_0= ruleRPAREN )
                    {
                    // InternalSocrates.g:2225:5: (lv_r_8_0= ruleRPAREN )
                    // InternalSocrates.g:2226:6: lv_r_8_0= ruleRPAREN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBoundtermAccess().getRRPARENParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_r_8_0=ruleRPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBoundtermRule());
                      						}
                      						set(
                      							current,
                      							"r",
                      							lv_r_8_0,
                      							"lu.uni.Socrates.RPAREN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboundterm"


    // $ANTLR start "entryRuletimedterm"
    // InternalSocrates.g:2248:1: entryRuletimedterm returns [EObject current=null] : iv_ruletimedterm= ruletimedterm EOF ;
    public final EObject entryRuletimedterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletimedterm = null;


        try {
            // InternalSocrates.g:2248:50: (iv_ruletimedterm= ruletimedterm EOF )
            // InternalSocrates.g:2249:2: iv_ruletimedterm= ruletimedterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimedtermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletimedterm=ruletimedterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletimedterm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletimedterm"


    // $ANTLR start "ruletimedterm"
    // InternalSocrates.g:2255:1: ruletimedterm returns [EObject current=null] : ( ( (lv_inf_0_0= ruleINF ) ) | ( (lv_number_1_0= rulenumber ) ) | ( ( ( (otherlv_2= RULE_ID ) ) | ( (otherlv_3= RULE_ID ) ) ) ( ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) ) ( (lv_value_5_0= rulevalue ) ) )? ) ) ;
    public final EObject ruletimedterm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_inf_0_0 = null;

        AntlrDatatypeRuleToken lv_number_1_0 = null;

        AntlrDatatypeRuleToken lv_op_4_1 = null;

        AntlrDatatypeRuleToken lv_op_4_2 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:2261:2: ( ( ( (lv_inf_0_0= ruleINF ) ) | ( (lv_number_1_0= rulenumber ) ) | ( ( ( (otherlv_2= RULE_ID ) ) | ( (otherlv_3= RULE_ID ) ) ) ( ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) ) ( (lv_value_5_0= rulevalue ) ) )? ) ) )
            // InternalSocrates.g:2262:2: ( ( (lv_inf_0_0= ruleINF ) ) | ( (lv_number_1_0= rulenumber ) ) | ( ( ( (otherlv_2= RULE_ID ) ) | ( (otherlv_3= RULE_ID ) ) ) ( ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) ) ( (lv_value_5_0= rulevalue ) ) )? ) )
            {
            // InternalSocrates.g:2262:2: ( ( (lv_inf_0_0= ruleINF ) ) | ( (lv_number_1_0= rulenumber ) ) | ( ( ( (otherlv_2= RULE_ID ) ) | ( (otherlv_3= RULE_ID ) ) ) ( ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) ) ( (lv_value_5_0= rulevalue ) ) )? ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt27=1;
                }
                break;
            case RULE_INT:
            case RULE_DIGIT:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSocrates.g:2263:3: ( (lv_inf_0_0= ruleINF ) )
                    {
                    // InternalSocrates.g:2263:3: ( (lv_inf_0_0= ruleINF ) )
                    // InternalSocrates.g:2264:4: (lv_inf_0_0= ruleINF )
                    {
                    // InternalSocrates.g:2264:4: (lv_inf_0_0= ruleINF )
                    // InternalSocrates.g:2265:5: lv_inf_0_0= ruleINF
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTimedtermAccess().getInfINFParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_inf_0_0=ruleINF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTimedtermRule());
                      					}
                      					set(
                      						current,
                      						"inf",
                      						lv_inf_0_0,
                      						"lu.uni.Socrates.INF");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2283:3: ( (lv_number_1_0= rulenumber ) )
                    {
                    // InternalSocrates.g:2283:3: ( (lv_number_1_0= rulenumber ) )
                    // InternalSocrates.g:2284:4: (lv_number_1_0= rulenumber )
                    {
                    // InternalSocrates.g:2284:4: (lv_number_1_0= rulenumber )
                    // InternalSocrates.g:2285:5: lv_number_1_0= rulenumber
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTimedtermAccess().getNumberNumberParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=rulenumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTimedtermRule());
                      					}
                      					set(
                      						current,
                      						"number",
                      						lv_number_1_0,
                      						"lu.uni.Socrates.number");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:2303:3: ( ( ( (otherlv_2= RULE_ID ) ) | ( (otherlv_3= RULE_ID ) ) ) ( ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) ) ( (lv_value_5_0= rulevalue ) ) )? )
                    {
                    // InternalSocrates.g:2303:3: ( ( ( (otherlv_2= RULE_ID ) ) | ( (otherlv_3= RULE_ID ) ) ) ( ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) ) ( (lv_value_5_0= rulevalue ) ) )? )
                    // InternalSocrates.g:2304:4: ( ( (otherlv_2= RULE_ID ) ) | ( (otherlv_3= RULE_ID ) ) ) ( ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) ) ( (lv_value_5_0= rulevalue ) ) )?
                    {
                    // InternalSocrates.g:2304:4: ( ( (otherlv_2= RULE_ID ) ) | ( (otherlv_3= RULE_ID ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        int LA24_1 = input.LA(2);

                        if ( (synpred34_InternalSocrates()) ) {
                            alt24=1;
                        }
                        else if ( (true) ) {
                            alt24=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalSocrates.g:2305:5: ( (otherlv_2= RULE_ID ) )
                            {
                            // InternalSocrates.g:2305:5: ( (otherlv_2= RULE_ID ) )
                            // InternalSocrates.g:2306:6: (otherlv_2= RULE_ID )
                            {
                            // InternalSocrates.g:2306:6: (otherlv_2= RULE_ID )
                            // InternalSocrates.g:2307:7: otherlv_2= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              							/* */
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTimedtermRule());
                              							}
                              						
                            }
                            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_2, grammarAccess.getTimedtermAccess().getRefConstantIdCrossReference_2_0_0_0());
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSocrates.g:2322:5: ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalSocrates.g:2322:5: ( (otherlv_3= RULE_ID ) )
                            // InternalSocrates.g:2323:6: (otherlv_3= RULE_ID )
                            {
                            // InternalSocrates.g:2323:6: (otherlv_3= RULE_ID )
                            // InternalSocrates.g:2324:7: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              							/* */
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTimedtermRule());
                              							}
                              						
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_3, grammarAccess.getTimedtermAccess().getRefTvariableCrossReference_2_0_1_0());
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSocrates.g:2339:4: ( ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) ) ( (lv_value_5_0= rulevalue ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=28 && LA26_0<=29)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSocrates.g:2340:5: ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) ) ( (lv_value_5_0= rulevalue ) )
                            {
                            // InternalSocrates.g:2340:5: ( ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) ) )
                            // InternalSocrates.g:2341:6: ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) )
                            {
                            // InternalSocrates.g:2341:6: ( (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS ) )
                            // InternalSocrates.g:2342:7: (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS )
                            {
                            // InternalSocrates.g:2342:7: (lv_op_4_1= rulePLUS | lv_op_4_2= ruleMINUS )
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==28) ) {
                                alt25=1;
                            }
                            else if ( (LA25_0==29) ) {
                                alt25=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 0, input);

                                throw nvae;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalSocrates.g:2343:8: lv_op_4_1= rulePLUS
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getTimedtermAccess().getOpPLUSParserRuleCall_2_1_0_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_34);
                                    lv_op_4_1=rulePLUS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getTimedtermRule());
                                      								}
                                      								set(
                                      									current,
                                      									"op",
                                      									lv_op_4_1,
                                      									"lu.uni.Socrates.PLUS");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalSocrates.g:2359:8: lv_op_4_2= ruleMINUS
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getTimedtermAccess().getOpMINUSParserRuleCall_2_1_0_0_1());
                                      							
                                    }
                                    pushFollow(FOLLOW_34);
                                    lv_op_4_2=ruleMINUS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getTimedtermRule());
                                      								}
                                      								set(
                                      									current,
                                      									"op",
                                      									lv_op_4_2,
                                      									"lu.uni.Socrates.MINUS");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalSocrates.g:2377:5: ( (lv_value_5_0= rulevalue ) )
                            // InternalSocrates.g:2378:6: (lv_value_5_0= rulevalue )
                            {
                            // InternalSocrates.g:2378:6: (lv_value_5_0= rulevalue )
                            // InternalSocrates.g:2379:7: lv_value_5_0= rulevalue
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTimedtermAccess().getValueValueParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_value_5_0=rulevalue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTimedtermRule());
                              							}
                              							set(
                              								current,
                              								"value",
                              								lv_value_5_0,
                              								"lu.uni.Socrates.value");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletimedterm"


    // $ANTLR start "entryRuleatom"
    // InternalSocrates.g:2402:1: entryRuleatom returns [EObject current=null] : iv_ruleatom= ruleatom EOF ;
    public final EObject entryRuleatom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleatom = null;


        try {
            // InternalSocrates.g:2402:45: (iv_ruleatom= ruleatom EOF )
            // InternalSocrates.g:2403:2: iv_ruleatom= ruleatom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleatom=ruleatom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleatom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleatom"


    // $ANTLR start "ruleatom"
    // InternalSocrates.g:2409:1: ruleatom returns [EObject current=null] : ( ( ruleLPAREN ( (lv_f_1_0= ruleformula ) ) ruleRPAREN ) | (otherlv_3= '{' ( (lv_s1_4_0= ruleexpression ) ) ( (lv_op_5_0= ruleRELOP ) ) ( (lv_s2_6_0= ruleexpression ) ) otherlv_7= '}' ) ) ;
    public final EObject ruleatom() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_f_1_0 = null;

        EObject lv_s1_4_0 = null;

        AntlrDatatypeRuleToken lv_op_5_0 = null;

        EObject lv_s2_6_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:2415:2: ( ( ( ruleLPAREN ( (lv_f_1_0= ruleformula ) ) ruleRPAREN ) | (otherlv_3= '{' ( (lv_s1_4_0= ruleexpression ) ) ( (lv_op_5_0= ruleRELOP ) ) ( (lv_s2_6_0= ruleexpression ) ) otherlv_7= '}' ) ) )
            // InternalSocrates.g:2416:2: ( ( ruleLPAREN ( (lv_f_1_0= ruleformula ) ) ruleRPAREN ) | (otherlv_3= '{' ( (lv_s1_4_0= ruleexpression ) ) ( (lv_op_5_0= ruleRELOP ) ) ( (lv_s2_6_0= ruleexpression ) ) otherlv_7= '}' ) )
            {
            // InternalSocrates.g:2416:2: ( ( ruleLPAREN ( (lv_f_1_0= ruleformula ) ) ruleRPAREN ) | (otherlv_3= '{' ( (lv_s1_4_0= ruleexpression ) ) ( (lv_op_5_0= ruleRELOP ) ) ( (lv_s2_6_0= ruleexpression ) ) otherlv_7= '}' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            else if ( (LA28_0==32) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSocrates.g:2417:3: ( ruleLPAREN ( (lv_f_1_0= ruleformula ) ) ruleRPAREN )
                    {
                    // InternalSocrates.g:2417:3: ( ruleLPAREN ( (lv_f_1_0= ruleformula ) ) ruleRPAREN )
                    // InternalSocrates.g:2418:4: ruleLPAREN ( (lv_f_1_0= ruleformula ) ) ruleRPAREN
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomAccess().getLPARENParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    ruleLPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:2428:4: ( (lv_f_1_0= ruleformula ) )
                    // InternalSocrates.g:2429:5: (lv_f_1_0= ruleformula )
                    {
                    // InternalSocrates.g:2429:5: (lv_f_1_0= ruleformula )
                    // InternalSocrates.g:2430:6: lv_f_1_0= ruleformula
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomAccess().getFFormulaParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_f_1_0=ruleformula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomRule());
                      						}
                      						set(
                      							current,
                      							"f",
                      							lv_f_1_0,
                      							"lu.uni.Socrates.formula");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomAccess().getRPARENParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleRPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2459:3: (otherlv_3= '{' ( (lv_s1_4_0= ruleexpression ) ) ( (lv_op_5_0= ruleRELOP ) ) ( (lv_s2_6_0= ruleexpression ) ) otherlv_7= '}' )
                    {
                    // InternalSocrates.g:2459:3: (otherlv_3= '{' ( (lv_s1_4_0= ruleexpression ) ) ( (lv_op_5_0= ruleRELOP ) ) ( (lv_s2_6_0= ruleexpression ) ) otherlv_7= '}' )
                    // InternalSocrates.g:2460:4: otherlv_3= '{' ( (lv_s1_4_0= ruleexpression ) ) ( (lv_op_5_0= ruleRELOP ) ) ( (lv_s2_6_0= ruleexpression ) ) otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    // InternalSocrates.g:2464:4: ( (lv_s1_4_0= ruleexpression ) )
                    // InternalSocrates.g:2465:5: (lv_s1_4_0= ruleexpression )
                    {
                    // InternalSocrates.g:2465:5: (lv_s1_4_0= ruleexpression )
                    // InternalSocrates.g:2466:6: lv_s1_4_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomAccess().getS1ExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_s1_4_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomRule());
                      						}
                      						set(
                      							current,
                      							"s1",
                      							lv_s1_4_0,
                      							"lu.uni.Socrates.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSocrates.g:2483:4: ( (lv_op_5_0= ruleRELOP ) )
                    // InternalSocrates.g:2484:5: (lv_op_5_0= ruleRELOP )
                    {
                    // InternalSocrates.g:2484:5: (lv_op_5_0= ruleRELOP )
                    // InternalSocrates.g:2485:6: lv_op_5_0= ruleRELOP
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomAccess().getOpRELOPParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_op_5_0=ruleRELOP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomRule());
                      						}
                      						set(
                      							current,
                      							"op",
                      							lv_op_5_0,
                      							"lu.uni.Socrates.RELOP");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSocrates.g:2502:4: ( (lv_s2_6_0= ruleexpression ) )
                    // InternalSocrates.g:2503:5: (lv_s2_6_0= ruleexpression )
                    {
                    // InternalSocrates.g:2503:5: (lv_s2_6_0= ruleexpression )
                    // InternalSocrates.g:2504:6: lv_s2_6_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomAccess().getS2ExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_s2_6_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomRule());
                      						}
                      						set(
                      							current,
                      							"s2",
                      							lv_s2_6_0,
                      							"lu.uni.Socrates.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAtomAccess().getRightCurlyBracketKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleatom"


    // $ANTLR start "entryRulevalue"
    // InternalSocrates.g:2530:1: entryRulevalue returns [EObject current=null] : iv_rulevalue= rulevalue EOF ;
    public final EObject entryRulevalue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue = null;


        try {
            // InternalSocrates.g:2530:46: (iv_rulevalue= rulevalue EOF )
            // InternalSocrates.g:2531:2: iv_rulevalue= rulevalue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevalue=rulevalue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevalue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue"


    // $ANTLR start "rulevalue"
    // InternalSocrates.g:2537:1: rulevalue returns [EObject current=null] : ( ( ruleLPAREN ( (lv_exp_1_0= ruleexpression ) ) ruleRPAREN ) | ( (lv_number_3_0= rulenumber ) ) | ( (otherlv_4= RULE_ID ) ) | ( (lv_float_5_0= ruleFLOAT ) ) ) ;
    public final EObject rulevalue() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_exp_1_0 = null;

        AntlrDatatypeRuleToken lv_number_3_0 = null;

        AntlrDatatypeRuleToken lv_float_5_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:2543:2: ( ( ( ruleLPAREN ( (lv_exp_1_0= ruleexpression ) ) ruleRPAREN ) | ( (lv_number_3_0= rulenumber ) ) | ( (otherlv_4= RULE_ID ) ) | ( (lv_float_5_0= ruleFLOAT ) ) ) )
            // InternalSocrates.g:2544:2: ( ( ruleLPAREN ( (lv_exp_1_0= ruleexpression ) ) ruleRPAREN ) | ( (lv_number_3_0= rulenumber ) ) | ( (otherlv_4= RULE_ID ) ) | ( (lv_float_5_0= ruleFLOAT ) ) )
            {
            // InternalSocrates.g:2544:2: ( ( ruleLPAREN ( (lv_exp_1_0= ruleexpression ) ) ruleRPAREN ) | ( (lv_number_3_0= rulenumber ) ) | ( (otherlv_4= RULE_ID ) ) | ( (lv_float_5_0= ruleFLOAT ) ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt29=1;
                }
                break;
            case RULE_INT:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==39) ) {
                    alt29=4;
                }
                else if ( (LA29_2==EOF||LA29_2==22||(LA29_2>=28 && LA29_2<=31)||(LA29_2>=33 && LA29_2<=35)||(LA29_2>=42 && LA29_2<=47)||LA29_2==49||LA29_2==51) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DIGIT:
                {
                int LA29_3 = input.LA(2);

                if ( (LA29_3==EOF||LA29_3==22||(LA29_3>=28 && LA29_3<=31)||(LA29_3>=33 && LA29_3<=35)||(LA29_3>=42 && LA29_3<=47)||LA29_3==49||LA29_3==51) ) {
                    alt29=2;
                }
                else if ( (LA29_3==39) ) {
                    alt29=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSocrates.g:2545:3: ( ruleLPAREN ( (lv_exp_1_0= ruleexpression ) ) ruleRPAREN )
                    {
                    // InternalSocrates.g:2545:3: ( ruleLPAREN ( (lv_exp_1_0= ruleexpression ) ) ruleRPAREN )
                    // InternalSocrates.g:2546:4: ruleLPAREN ( (lv_exp_1_0= ruleexpression ) ) ruleRPAREN
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getValueAccess().getLPARENParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    ruleLPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:2556:4: ( (lv_exp_1_0= ruleexpression ) )
                    // InternalSocrates.g:2557:5: (lv_exp_1_0= ruleexpression )
                    {
                    // InternalSocrates.g:2557:5: (lv_exp_1_0= ruleexpression )
                    // InternalSocrates.g:2558:6: lv_exp_1_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValueAccess().getExpExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_exp_1_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getValueRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_1_0,
                      							"lu.uni.Socrates.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getValueAccess().getRPARENParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleRPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2587:3: ( (lv_number_3_0= rulenumber ) )
                    {
                    // InternalSocrates.g:2587:3: ( (lv_number_3_0= rulenumber ) )
                    // InternalSocrates.g:2588:4: (lv_number_3_0= rulenumber )
                    {
                    // InternalSocrates.g:2588:4: (lv_number_3_0= rulenumber )
                    // InternalSocrates.g:2589:5: lv_number_3_0= rulenumber
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getValueAccess().getNumberNumberParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_number_3_0=rulenumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getValueRule());
                      					}
                      					set(
                      						current,
                      						"number",
                      						lv_number_3_0,
                      						"lu.uni.Socrates.number");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:2607:3: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalSocrates.g:2607:3: ( (otherlv_4= RULE_ID ) )
                    // InternalSocrates.g:2608:4: (otherlv_4= RULE_ID )
                    {
                    // InternalSocrates.g:2608:4: (otherlv_4= RULE_ID )
                    // InternalSocrates.g:2609:5: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getValueRule());
                      					}
                      				
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getValueAccess().getRefConstantIdCrossReference_2_0());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSocrates.g:2624:3: ( (lv_float_5_0= ruleFLOAT ) )
                    {
                    // InternalSocrates.g:2624:3: ( (lv_float_5_0= ruleFLOAT ) )
                    // InternalSocrates.g:2625:4: (lv_float_5_0= ruleFLOAT )
                    {
                    // InternalSocrates.g:2625:4: (lv_float_5_0= ruleFLOAT )
                    // InternalSocrates.g:2626:5: lv_float_5_0= ruleFLOAT
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getValueAccess().getFloatFLOATParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_float_5_0=ruleFLOAT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getValueRule());
                      					}
                      					set(
                      						current,
                      						"float",
                      						lv_float_5_0,
                      						"lu.uni.Socrates.FLOAT");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue"


    // $ANTLR start "entryRuleSignal"
    // InternalSocrates.g:2647:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalSocrates.g:2647:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalSocrates.g:2648:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalSocrates.g:2654:1: ruleSignal returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ruleLPAREN ( (lv_timdedterm_2_0= ruletimedterm ) ) ruleRPAREN ) | ( ( (otherlv_4= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_6_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_9_0= ruletimedterm ) ) ruleRPAREN ) | ( ( (otherlv_11= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_13_0= rulenumber ) ) ruleRSQUARE ruleLSQUARE ( (lv_indx2_16_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_19_0= ruletimedterm ) ) ruleRPAREN ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_11=null;
        EObject lv_timdedterm_2_0 = null;

        AntlrDatatypeRuleToken lv_indx1_6_0 = null;

        EObject lv_timdedterm_9_0 = null;

        AntlrDatatypeRuleToken lv_indx1_13_0 = null;

        AntlrDatatypeRuleToken lv_indx2_16_0 = null;

        EObject lv_timdedterm_19_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:2660:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ruleLPAREN ( (lv_timdedterm_2_0= ruletimedterm ) ) ruleRPAREN ) | ( ( (otherlv_4= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_6_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_9_0= ruletimedterm ) ) ruleRPAREN ) | ( ( (otherlv_11= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_13_0= rulenumber ) ) ruleRSQUARE ruleLSQUARE ( (lv_indx2_16_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_19_0= ruletimedterm ) ) ruleRPAREN ) ) )
            // InternalSocrates.g:2661:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleLPAREN ( (lv_timdedterm_2_0= ruletimedterm ) ) ruleRPAREN ) | ( ( (otherlv_4= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_6_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_9_0= ruletimedterm ) ) ruleRPAREN ) | ( ( (otherlv_11= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_13_0= rulenumber ) ) ruleRSQUARE ruleLSQUARE ( (lv_indx2_16_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_19_0= ruletimedterm ) ) ruleRPAREN ) )
            {
            // InternalSocrates.g:2661:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleLPAREN ( (lv_timdedterm_2_0= ruletimedterm ) ) ruleRPAREN ) | ( ( (otherlv_4= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_6_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_9_0= ruletimedterm ) ) ruleRPAREN ) | ( ( (otherlv_11= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_13_0= rulenumber ) ) ruleRSQUARE ruleLSQUARE ( (lv_indx2_16_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_19_0= ruletimedterm ) ) ruleRPAREN ) )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==50) ) {
                    int LA30_2 = input.LA(3);

                    if ( (LA30_2==RULE_INT) ) {
                        int LA30_4 = input.LA(4);

                        if ( (LA30_4==51) ) {
                            int LA30_6 = input.LA(5);

                            if ( (LA30_6==50) ) {
                                alt30=3;
                            }
                            else if ( (LA30_6==48) ) {
                                alt30=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA30_2==RULE_DIGIT) ) {
                        int LA30_5 = input.LA(4);

                        if ( (LA30_5==51) ) {
                            int LA30_6 = input.LA(5);

                            if ( (LA30_6==50) ) {
                                alt30=3;
                            }
                            else if ( (LA30_6==48) ) {
                                alt30=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA30_1==48) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSocrates.g:2662:3: ( ( (otherlv_0= RULE_ID ) ) ruleLPAREN ( (lv_timdedterm_2_0= ruletimedterm ) ) ruleRPAREN )
                    {
                    // InternalSocrates.g:2662:3: ( ( (otherlv_0= RULE_ID ) ) ruleLPAREN ( (lv_timdedterm_2_0= ruletimedterm ) ) ruleRPAREN )
                    // InternalSocrates.g:2663:4: ( (otherlv_0= RULE_ID ) ) ruleLPAREN ( (lv_timdedterm_2_0= ruletimedterm ) ) ruleRPAREN
                    {
                    // InternalSocrates.g:2663:4: ( (otherlv_0= RULE_ID ) )
                    // InternalSocrates.g:2664:5: (otherlv_0= RULE_ID )
                    {
                    // InternalSocrates.g:2664:5: (otherlv_0= RULE_ID )
                    // InternalSocrates.g:2665:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSignalRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getSignalidSignalIDCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getLPARENParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    ruleLPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:2689:4: ( (lv_timdedterm_2_0= ruletimedterm ) )
                    // InternalSocrates.g:2690:5: (lv_timdedterm_2_0= ruletimedterm )
                    {
                    // InternalSocrates.g:2690:5: (lv_timdedterm_2_0= ruletimedterm )
                    // InternalSocrates.g:2691:6: lv_timdedterm_2_0= ruletimedterm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSignalAccess().getTimdedtermTimedtermParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_timdedterm_2_0=ruletimedterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSignalRule());
                      						}
                      						set(
                      							current,
                      							"timdedterm",
                      							lv_timdedterm_2_0,
                      							"lu.uni.Socrates.timedterm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getRPARENParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleRPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:2720:3: ( ( (otherlv_4= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_6_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_9_0= ruletimedterm ) ) ruleRPAREN )
                    {
                    // InternalSocrates.g:2720:3: ( ( (otherlv_4= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_6_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_9_0= ruletimedterm ) ) ruleRPAREN )
                    // InternalSocrates.g:2721:4: ( (otherlv_4= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_6_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_9_0= ruletimedterm ) ) ruleRPAREN
                    {
                    // InternalSocrates.g:2721:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSocrates.g:2722:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSocrates.g:2722:5: (otherlv_4= RULE_ID )
                    // InternalSocrates.g:2723:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSignalRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getSignalAccess().getSignalidSignalIDCrossReference_1_0_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getLSQUAREParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    ruleLSQUARE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:2747:4: ( (lv_indx1_6_0= rulenumber ) )
                    // InternalSocrates.g:2748:5: (lv_indx1_6_0= rulenumber )
                    {
                    // InternalSocrates.g:2748:5: (lv_indx1_6_0= rulenumber )
                    // InternalSocrates.g:2749:6: lv_indx1_6_0= rulenumber
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSignalAccess().getIndx1NumberParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_indx1_6_0=rulenumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSignalRule());
                      						}
                      						set(
                      							current,
                      							"indx1",
                      							lv_indx1_6_0,
                      							"lu.uni.Socrates.number");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getRSQUAREParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    ruleRSQUARE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getLPARENParserRuleCall_1_4());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    ruleLPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:2786:4: ( (lv_timdedterm_9_0= ruletimedterm ) )
                    // InternalSocrates.g:2787:5: (lv_timdedterm_9_0= ruletimedterm )
                    {
                    // InternalSocrates.g:2787:5: (lv_timdedterm_9_0= ruletimedterm )
                    // InternalSocrates.g:2788:6: lv_timdedterm_9_0= ruletimedterm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSignalAccess().getTimdedtermTimedtermParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_timdedterm_9_0=ruletimedterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSignalRule());
                      						}
                      						set(
                      							current,
                      							"timdedterm",
                      							lv_timdedterm_9_0,
                      							"lu.uni.Socrates.timedterm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getRPARENParserRuleCall_1_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleRPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSocrates.g:2817:3: ( ( (otherlv_11= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_13_0= rulenumber ) ) ruleRSQUARE ruleLSQUARE ( (lv_indx2_16_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_19_0= ruletimedterm ) ) ruleRPAREN )
                    {
                    // InternalSocrates.g:2817:3: ( ( (otherlv_11= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_13_0= rulenumber ) ) ruleRSQUARE ruleLSQUARE ( (lv_indx2_16_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_19_0= ruletimedterm ) ) ruleRPAREN )
                    // InternalSocrates.g:2818:4: ( (otherlv_11= RULE_ID ) ) ruleLSQUARE ( (lv_indx1_13_0= rulenumber ) ) ruleRSQUARE ruleLSQUARE ( (lv_indx2_16_0= rulenumber ) ) ruleRSQUARE ruleLPAREN ( (lv_timdedterm_19_0= ruletimedterm ) ) ruleRPAREN
                    {
                    // InternalSocrates.g:2818:4: ( (otherlv_11= RULE_ID ) )
                    // InternalSocrates.g:2819:5: (otherlv_11= RULE_ID )
                    {
                    // InternalSocrates.g:2819:5: (otherlv_11= RULE_ID )
                    // InternalSocrates.g:2820:6: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSignalRule());
                      						}
                      					
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getSignalAccess().getSignalidSignalIDCrossReference_2_0_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getLSQUAREParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    ruleLSQUARE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:2844:4: ( (lv_indx1_13_0= rulenumber ) )
                    // InternalSocrates.g:2845:5: (lv_indx1_13_0= rulenumber )
                    {
                    // InternalSocrates.g:2845:5: (lv_indx1_13_0= rulenumber )
                    // InternalSocrates.g:2846:6: lv_indx1_13_0= rulenumber
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSignalAccess().getIndx1NumberParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_indx1_13_0=rulenumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSignalRule());
                      						}
                      						set(
                      							current,
                      							"indx1",
                      							lv_indx1_13_0,
                      							"lu.uni.Socrates.number");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getRSQUAREParserRuleCall_2_3());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    ruleRSQUARE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getLSQUAREParserRuleCall_2_4());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    ruleLSQUARE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:2883:4: ( (lv_indx2_16_0= rulenumber ) )
                    // InternalSocrates.g:2884:5: (lv_indx2_16_0= rulenumber )
                    {
                    // InternalSocrates.g:2884:5: (lv_indx2_16_0= rulenumber )
                    // InternalSocrates.g:2885:6: lv_indx2_16_0= rulenumber
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSignalAccess().getIndx2NumberParserRuleCall_2_5_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_indx2_16_0=rulenumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSignalRule());
                      						}
                      						set(
                      							current,
                      							"indx2",
                      							lv_indx2_16_0,
                      							"lu.uni.Socrates.number");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getRSQUAREParserRuleCall_2_6());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    ruleRSQUARE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getLPARENParserRuleCall_2_7());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    ruleLPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSocrates.g:2922:4: ( (lv_timdedterm_19_0= ruletimedterm ) )
                    // InternalSocrates.g:2923:5: (lv_timdedterm_19_0= ruletimedterm )
                    {
                    // InternalSocrates.g:2923:5: (lv_timdedterm_19_0= ruletimedterm )
                    // InternalSocrates.g:2924:6: lv_timdedterm_19_0= ruletimedterm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSignalAccess().getTimdedtermTimedtermParserRuleCall_2_8_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_timdedterm_19_0=ruletimedterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSignalRule());
                      						}
                      						set(
                      							current,
                      							"timdedterm",
                      							lv_timdedterm_19_0,
                      							"lu.uni.Socrates.timedterm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignalAccess().getRPARENParserRuleCall_2_9());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleRPAREN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleAbsEXP"
    // InternalSocrates.g:2956:1: entryRuleAbsEXP returns [EObject current=null] : iv_ruleAbsEXP= ruleAbsEXP EOF ;
    public final EObject entryRuleAbsEXP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsEXP = null;


        try {
            // InternalSocrates.g:2956:47: (iv_ruleAbsEXP= ruleAbsEXP EOF )
            // InternalSocrates.g:2957:2: iv_ruleAbsEXP= ruleAbsEXP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsEXPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbsEXP=ruleAbsEXP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsEXP; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbsEXP"


    // $ANTLR start "ruleAbsEXP"
    // InternalSocrates.g:2963:1: ruleAbsEXP returns [EObject current=null] : (otherlv_0= '|' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '|' ) ;
    public final EObject ruleAbsEXP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp1_1_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:2969:2: ( (otherlv_0= '|' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '|' ) )
            // InternalSocrates.g:2970:2: (otherlv_0= '|' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '|' )
            {
            // InternalSocrates.g:2970:2: (otherlv_0= '|' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '|' )
            // InternalSocrates.g:2971:3: otherlv_0= '|' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '|'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAbsEXPAccess().getVerticalLineKeyword_0());
              		
            }
            // InternalSocrates.g:2975:3: ( (lv_exp1_1_0= ruleexpression ) )
            // InternalSocrates.g:2976:4: (lv_exp1_1_0= ruleexpression )
            {
            // InternalSocrates.g:2976:4: (lv_exp1_1_0= ruleexpression )
            // InternalSocrates.g:2977:5: lv_exp1_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAbsEXPAccess().getExp1ExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_exp1_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAbsEXPRule());
              					}
              					set(
              						current,
              						"exp1",
              						lv_exp1_1_0,
              						"lu.uni.Socrates.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAbsEXPAccess().getVerticalLineKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbsEXP"


    // $ANTLR start "entryRuleNormexp"
    // InternalSocrates.g:3002:1: entryRuleNormexp returns [EObject current=null] : iv_ruleNormexp= ruleNormexp EOF ;
    public final EObject entryRuleNormexp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormexp = null;


        try {
            // InternalSocrates.g:3002:48: (iv_ruleNormexp= ruleNormexp EOF )
            // InternalSocrates.g:3003:2: iv_ruleNormexp= ruleNormexp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormexpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormexp=ruleNormexp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormexp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormexp"


    // $ANTLR start "ruleNormexp"
    // InternalSocrates.g:3009:1: ruleNormexp returns [EObject current=null] : (otherlv_0= '||' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '||' ) ;
    public final EObject ruleNormexp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp1_1_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:3015:2: ( (otherlv_0= '||' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '||' ) )
            // InternalSocrates.g:3016:2: (otherlv_0= '||' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '||' )
            {
            // InternalSocrates.g:3016:2: (otherlv_0= '||' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '||' )
            // InternalSocrates.g:3017:3: otherlv_0= '||' ( (lv_exp1_1_0= ruleexpression ) ) otherlv_2= '||'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormexpAccess().getVerticalLineVerticalLineKeyword_0());
              		
            }
            // InternalSocrates.g:3021:3: ( (lv_exp1_1_0= ruleexpression ) )
            // InternalSocrates.g:3022:4: (lv_exp1_1_0= ruleexpression )
            {
            // InternalSocrates.g:3022:4: (lv_exp1_1_0= ruleexpression )
            // InternalSocrates.g:3023:5: lv_exp1_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormexpAccess().getExp1ExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_exp1_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormexpRule());
              					}
              					set(
              						current,
              						"exp1",
              						lv_exp1_1_0,
              						"lu.uni.Socrates.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNormexpAccess().getVerticalLineVerticalLineKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormexp"


    // $ANTLR start "entryRuleSin"
    // InternalSocrates.g:3048:1: entryRuleSin returns [EObject current=null] : iv_ruleSin= ruleSin EOF ;
    public final EObject entryRuleSin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSin = null;


        try {
            // InternalSocrates.g:3048:44: (iv_ruleSin= ruleSin EOF )
            // InternalSocrates.g:3049:2: iv_ruleSin= ruleSin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSin=ruleSin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSin; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSin"


    // $ANTLR start "ruleSin"
    // InternalSocrates.g:3055:1: ruleSin returns [EObject current=null] : (otherlv_0= 'sin' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN ) ;
    public final EObject ruleSin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp1_2_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:3061:2: ( (otherlv_0= 'sin' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN ) )
            // InternalSocrates.g:3062:2: (otherlv_0= 'sin' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN )
            {
            // InternalSocrates.g:3062:2: (otherlv_0= 'sin' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN )
            // InternalSocrates.g:3063:3: otherlv_0= 'sin' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN
            {
            otherlv_0=(Token)match(input,36,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSinAccess().getSinKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSinAccess().getLPARENParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_26);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:3077:3: ( (lv_exp1_2_0= ruleexpression ) )
            // InternalSocrates.g:3078:4: (lv_exp1_2_0= ruleexpression )
            {
            // InternalSocrates.g:3078:4: (lv_exp1_2_0= ruleexpression )
            // InternalSocrates.g:3079:5: lv_exp1_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSinAccess().getExp1ExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_exp1_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSinRule());
              					}
              					set(
              						current,
              						"exp1",
              						lv_exp1_2_0,
              						"lu.uni.Socrates.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSinAccess().getRPARENParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSin"


    // $ANTLR start "entryRuleCos"
    // InternalSocrates.g:3110:1: entryRuleCos returns [EObject current=null] : iv_ruleCos= ruleCos EOF ;
    public final EObject entryRuleCos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCos = null;


        try {
            // InternalSocrates.g:3110:44: (iv_ruleCos= ruleCos EOF )
            // InternalSocrates.g:3111:2: iv_ruleCos= ruleCos EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCosRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCos=ruleCos();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCos; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCos"


    // $ANTLR start "ruleCos"
    // InternalSocrates.g:3117:1: ruleCos returns [EObject current=null] : (otherlv_0= 'cos' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN ) ;
    public final EObject ruleCos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp1_2_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:3123:2: ( (otherlv_0= 'cos' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN ) )
            // InternalSocrates.g:3124:2: (otherlv_0= 'cos' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN )
            {
            // InternalSocrates.g:3124:2: (otherlv_0= 'cos' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN )
            // InternalSocrates.g:3125:3: otherlv_0= 'cos' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN
            {
            otherlv_0=(Token)match(input,37,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCosAccess().getCosKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCosAccess().getLPARENParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_26);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:3139:3: ( (lv_exp1_2_0= ruleexpression ) )
            // InternalSocrates.g:3140:4: (lv_exp1_2_0= ruleexpression )
            {
            // InternalSocrates.g:3140:4: (lv_exp1_2_0= ruleexpression )
            // InternalSocrates.g:3141:5: lv_exp1_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCosAccess().getExp1ExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_exp1_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCosRule());
              					}
              					set(
              						current,
              						"exp1",
              						lv_exp1_2_0,
              						"lu.uni.Socrates.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCosAccess().getRPARENParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCos"


    // $ANTLR start "entryRuleSqrt"
    // InternalSocrates.g:3172:1: entryRuleSqrt returns [EObject current=null] : iv_ruleSqrt= ruleSqrt EOF ;
    public final EObject entryRuleSqrt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqrt = null;


        try {
            // InternalSocrates.g:3172:45: (iv_ruleSqrt= ruleSqrt EOF )
            // InternalSocrates.g:3173:2: iv_ruleSqrt= ruleSqrt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqrtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqrt=ruleSqrt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqrt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqrt"


    // $ANTLR start "ruleSqrt"
    // InternalSocrates.g:3179:1: ruleSqrt returns [EObject current=null] : (otherlv_0= 'sqrt' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN ) ;
    public final EObject ruleSqrt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp1_2_0 = null;



        	enterRule();

        try {
            // InternalSocrates.g:3185:2: ( (otherlv_0= 'sqrt' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN ) )
            // InternalSocrates.g:3186:2: (otherlv_0= 'sqrt' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN )
            {
            // InternalSocrates.g:3186:2: (otherlv_0= 'sqrt' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN )
            // InternalSocrates.g:3187:3: otherlv_0= 'sqrt' ruleLPAREN ( (lv_exp1_2_0= ruleexpression ) ) ruleRPAREN
            {
            otherlv_0=(Token)match(input,38,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqrtAccess().getSqrtKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSqrtAccess().getLPARENParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_26);
            ruleLPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSocrates.g:3201:3: ( (lv_exp1_2_0= ruleexpression ) )
            // InternalSocrates.g:3202:4: (lv_exp1_2_0= ruleexpression )
            {
            // InternalSocrates.g:3202:4: (lv_exp1_2_0= ruleexpression )
            // InternalSocrates.g:3203:5: lv_exp1_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqrtAccess().getExp1ExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_exp1_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqrtRule());
              					}
              					set(
              						current,
              						"exp1",
              						lv_exp1_2_0,
              						"lu.uni.Socrates.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSqrtAccess().getRPARENParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleRPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqrt"


    // $ANTLR start "entryRuleFLOAT"
    // InternalSocrates.g:3234:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalSocrates.g:3234:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalSocrates.g:3235:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFLOATRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFLOAT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalSocrates.g:3241:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_number_0= rulenumber kw= '.' this_number_2= rulenumber ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_number_0 = null;

        AntlrDatatypeRuleToken this_number_2 = null;



        	enterRule();

        try {
            // InternalSocrates.g:3247:2: ( (this_number_0= rulenumber kw= '.' this_number_2= rulenumber ) )
            // InternalSocrates.g:3248:2: (this_number_0= rulenumber kw= '.' this_number_2= rulenumber )
            {
            // InternalSocrates.g:3248:2: (this_number_0= rulenumber kw= '.' this_number_2= rulenumber )
            // InternalSocrates.g:3249:3: this_number_0= rulenumber kw= '.' this_number_2= rulenumber
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFLOATAccess().getNumberParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_number_0=rulenumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_number_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,39,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFLOATAccess().getNumberParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_number_2=rulenumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_number_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRulePATH"
    // InternalSocrates.g:3278:1: entryRulePATH returns [String current=null] : iv_rulePATH= rulePATH EOF ;
    public final String entryRulePATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePATH = null;


        try {
            // InternalSocrates.g:3278:44: (iv_rulePATH= rulePATH EOF )
            // InternalSocrates.g:3279:2: iv_rulePATH= rulePATH EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPATHRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePATH=rulePATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePATH.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePATH"


    // $ANTLR start "rulePATH"
    // InternalSocrates.g:3285:1: rulePATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '../' )* | kw= './' ) (this_ID_2= RULE_ID kw= '/' )* ) ;
    public final AntlrDatatypeRuleToken rulePATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSocrates.g:3291:2: ( ( ( (kw= '../' )* | kw= './' ) (this_ID_2= RULE_ID kw= '/' )* ) )
            // InternalSocrates.g:3292:2: ( ( (kw= '../' )* | kw= './' ) (this_ID_2= RULE_ID kw= '/' )* )
            {
            // InternalSocrates.g:3292:2: ( ( (kw= '../' )* | kw= './' ) (this_ID_2= RULE_ID kw= '/' )* )
            // InternalSocrates.g:3293:3: ( (kw= '../' )* | kw= './' ) (this_ID_2= RULE_ID kw= '/' )*
            {
            // InternalSocrates.g:3293:3: ( (kw= '../' )* | kw= './' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==EOF||LA32_0==RULE_ID||LA32_0==15||LA32_0==40) ) {
                alt32=1;
            }
            else if ( (LA32_0==41) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalSocrates.g:3294:4: (kw= '../' )*
                    {
                    // InternalSocrates.g:3294:4: (kw= '../' )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==40) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSocrates.g:3295:5: kw= '../'
                    	    {
                    	    kw=(Token)match(input,40,FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopFullStopSolidusKeyword_0_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalSocrates.g:3302:4: kw= './'
                    {
                    kw=(Token)match(input,41,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopSolidusKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSocrates.g:3308:3: (this_ID_2= RULE_ID kw= '/' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSocrates.g:3309:4: this_ID_2= RULE_ID kw= '/'
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_0());
            	      			
            	    }
            	    kw=(Token)match(input,31,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePATH"


    // $ANTLR start "entryRulenumber"
    // InternalSocrates.g:3326:1: entryRulenumber returns [String current=null] : iv_rulenumber= rulenumber EOF ;
    public final String entryRulenumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumber = null;


        try {
            // InternalSocrates.g:3326:46: (iv_rulenumber= rulenumber EOF )
            // InternalSocrates.g:3327:2: iv_rulenumber= rulenumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenumber=rulenumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumber.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalSocrates.g:3333:1: rulenumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DIGIT_1= RULE_DIGIT ) ;
    public final AntlrDatatypeRuleToken rulenumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DIGIT_1=null;


        	enterRule();

        try {
            // InternalSocrates.g:3339:2: ( (this_INT_0= RULE_INT | this_DIGIT_1= RULE_DIGIT ) )
            // InternalSocrates.g:3340:2: (this_INT_0= RULE_INT | this_DIGIT_1= RULE_DIGIT )
            {
            // InternalSocrates.g:3340:2: (this_INT_0= RULE_INT | this_DIGIT_1= RULE_DIGIT )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_DIGIT) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSocrates.g:3341:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSocrates.g:3349:3: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DIGIT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DIGIT_1, grammarAccess.getNumberAccess().getDIGITTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleRELOP"
    // InternalSocrates.g:3360:1: entryRuleRELOP returns [String current=null] : iv_ruleRELOP= ruleRELOP EOF ;
    public final String entryRuleRELOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRELOP = null;


        try {
            // InternalSocrates.g:3360:45: (iv_ruleRELOP= ruleRELOP EOF )
            // InternalSocrates.g:3361:2: iv_ruleRELOP= ruleRELOP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRELOPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRELOP=ruleRELOP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRELOP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRELOP"


    // $ANTLR start "ruleRELOP"
    // InternalSocrates.g:3367:1: ruleRELOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_GE_0= ruleGE | this_LE_1= ruleLE | this_EQ_2= ruleEQ | this_LEQ_3= ruleLEQ | this_GEQ_4= ruleGEQ | this_NEQ_5= ruleNEQ ) ;
    public final AntlrDatatypeRuleToken ruleRELOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_GE_0 = null;

        AntlrDatatypeRuleToken this_LE_1 = null;

        AntlrDatatypeRuleToken this_EQ_2 = null;

        AntlrDatatypeRuleToken this_LEQ_3 = null;

        AntlrDatatypeRuleToken this_GEQ_4 = null;

        AntlrDatatypeRuleToken this_NEQ_5 = null;



        	enterRule();

        try {
            // InternalSocrates.g:3373:2: ( (this_GE_0= ruleGE | this_LE_1= ruleLE | this_EQ_2= ruleEQ | this_LEQ_3= ruleLEQ | this_GEQ_4= ruleGEQ | this_NEQ_5= ruleNEQ ) )
            // InternalSocrates.g:3374:2: (this_GE_0= ruleGE | this_LE_1= ruleLE | this_EQ_2= ruleEQ | this_LEQ_3= ruleLEQ | this_GEQ_4= ruleGEQ | this_NEQ_5= ruleNEQ )
            {
            // InternalSocrates.g:3374:2: (this_GE_0= ruleGE | this_LE_1= ruleLE | this_EQ_2= ruleEQ | this_LEQ_3= ruleLEQ | this_GEQ_4= ruleGEQ | this_NEQ_5= ruleNEQ )
            int alt35=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt35=1;
                }
                break;
            case 42:
                {
                alt35=2;
                }
                break;
            case 46:
                {
                alt35=3;
                }
                break;
            case 43:
                {
                alt35=4;
                }
                break;
            case 45:
                {
                alt35=5;
                }
                break;
            case 47:
                {
                alt35=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSocrates.g:3375:3: this_GE_0= ruleGE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRELOPAccess().getGEParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GE_0=ruleGE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GE_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSocrates.g:3386:3: this_LE_1= ruleLE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRELOPAccess().getLEParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LE_1=ruleLE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSocrates.g:3397:3: this_EQ_2= ruleEQ
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRELOPAccess().getEQParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EQ_2=ruleEQ();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EQ_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSocrates.g:3408:3: this_LEQ_3= ruleLEQ
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRELOPAccess().getLEQParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LEQ_3=ruleLEQ();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LEQ_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSocrates.g:3419:3: this_GEQ_4= ruleGEQ
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRELOPAccess().getGEQParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GEQ_4=ruleGEQ();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GEQ_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSocrates.g:3430:3: this_NEQ_5= ruleNEQ
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRELOPAccess().getNEQParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NEQ_5=ruleNEQ();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NEQ_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRELOP"


    // $ANTLR start "entryRuleCOMMA"
    // InternalSocrates.g:3444:1: entryRuleCOMMA returns [String current=null] : iv_ruleCOMMA= ruleCOMMA EOF ;
    public final String entryRuleCOMMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMMA = null;


        try {
            // InternalSocrates.g:3444:45: (iv_ruleCOMMA= ruleCOMMA EOF )
            // InternalSocrates.g:3445:2: iv_ruleCOMMA= ruleCOMMA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCOMMARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCOMMA=ruleCOMMA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCOMMA.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // InternalSocrates.g:3451:1: ruleCOMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleCOMMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3457:2: (kw= ',' )
            // InternalSocrates.g:3458:2: kw= ','
            {
            kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCOMMAAccess().getCommaKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "entryRuleLE"
    // InternalSocrates.g:3466:1: entryRuleLE returns [String current=null] : iv_ruleLE= ruleLE EOF ;
    public final String entryRuleLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLE = null;


        try {
            // InternalSocrates.g:3466:42: (iv_ruleLE= ruleLE EOF )
            // InternalSocrates.g:3467:2: iv_ruleLE= ruleLE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLE=ruleLE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLE"


    // $ANTLR start "ruleLE"
    // InternalSocrates.g:3473:1: ruleLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '<' ;
    public final AntlrDatatypeRuleToken ruleLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3479:2: (kw= '<' )
            // InternalSocrates.g:3480:2: kw= '<'
            {
            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getLEAccess().getLessThanSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLE"


    // $ANTLR start "entryRuleLEQ"
    // InternalSocrates.g:3488:1: entryRuleLEQ returns [String current=null] : iv_ruleLEQ= ruleLEQ EOF ;
    public final String entryRuleLEQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLEQ = null;


        try {
            // InternalSocrates.g:3488:43: (iv_ruleLEQ= ruleLEQ EOF )
            // InternalSocrates.g:3489:2: iv_ruleLEQ= ruleLEQ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLEQRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLEQ=ruleLEQ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLEQ.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLEQ"


    // $ANTLR start "ruleLEQ"
    // InternalSocrates.g:3495:1: ruleLEQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '<=' ;
    public final AntlrDatatypeRuleToken ruleLEQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3501:2: (kw= '<=' )
            // InternalSocrates.g:3502:2: kw= '<='
            {
            kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getLEQAccess().getLessThanSignEqualsSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLEQ"


    // $ANTLR start "entryRuleGE"
    // InternalSocrates.g:3510:1: entryRuleGE returns [String current=null] : iv_ruleGE= ruleGE EOF ;
    public final String entryRuleGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGE = null;


        try {
            // InternalSocrates.g:3510:42: (iv_ruleGE= ruleGE EOF )
            // InternalSocrates.g:3511:2: iv_ruleGE= ruleGE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGE=ruleGE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGE"


    // $ANTLR start "ruleGE"
    // InternalSocrates.g:3517:1: ruleGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '>' ;
    public final AntlrDatatypeRuleToken ruleGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3523:2: (kw= '>' )
            // InternalSocrates.g:3524:2: kw= '>'
            {
            kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getGEAccess().getGreaterThanSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGE"


    // $ANTLR start "entryRuleGEQ"
    // InternalSocrates.g:3532:1: entryRuleGEQ returns [String current=null] : iv_ruleGEQ= ruleGEQ EOF ;
    public final String entryRuleGEQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGEQ = null;


        try {
            // InternalSocrates.g:3532:43: (iv_ruleGEQ= ruleGEQ EOF )
            // InternalSocrates.g:3533:2: iv_ruleGEQ= ruleGEQ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEQRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGEQ=ruleGEQ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEQ.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGEQ"


    // $ANTLR start "ruleGEQ"
    // InternalSocrates.g:3539:1: ruleGEQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '>=' ;
    public final AntlrDatatypeRuleToken ruleGEQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3545:2: (kw= '>=' )
            // InternalSocrates.g:3546:2: kw= '>='
            {
            kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getGEQAccess().getGreaterThanSignEqualsSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGEQ"


    // $ANTLR start "entryRuleEQ"
    // InternalSocrates.g:3554:1: entryRuleEQ returns [String current=null] : iv_ruleEQ= ruleEQ EOF ;
    public final String entryRuleEQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEQ = null;


        try {
            // InternalSocrates.g:3554:42: (iv_ruleEQ= ruleEQ EOF )
            // InternalSocrates.g:3555:2: iv_ruleEQ= ruleEQ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEQ=ruleEQ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQ.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEQ"


    // $ANTLR start "ruleEQ"
    // InternalSocrates.g:3561:1: ruleEQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleEQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3567:2: (kw= '=' )
            // InternalSocrates.g:3568:2: kw= '='
            {
            kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getEQAccess().getEqualsSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEQ"


    // $ANTLR start "entryRuleNEQ"
    // InternalSocrates.g:3576:1: entryRuleNEQ returns [String current=null] : iv_ruleNEQ= ruleNEQ EOF ;
    public final String entryRuleNEQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNEQ = null;


        try {
            // InternalSocrates.g:3576:43: (iv_ruleNEQ= ruleNEQ EOF )
            // InternalSocrates.g:3577:2: iv_ruleNEQ= ruleNEQ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNEQRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNEQ=ruleNEQ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNEQ.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNEQ"


    // $ANTLR start "ruleNEQ"
    // InternalSocrates.g:3583:1: ruleNEQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!=' ;
    public final AntlrDatatypeRuleToken ruleNEQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3589:2: (kw= '!=' )
            // InternalSocrates.g:3590:2: kw= '!='
            {
            kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getNEQAccess().getExclamationMarkEqualsSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNEQ"


    // $ANTLR start "entryRuleLPAREN"
    // InternalSocrates.g:3598:1: entryRuleLPAREN returns [String current=null] : iv_ruleLPAREN= ruleLPAREN EOF ;
    public final String entryRuleLPAREN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLPAREN = null;


        try {
            // InternalSocrates.g:3598:46: (iv_ruleLPAREN= ruleLPAREN EOF )
            // InternalSocrates.g:3599:2: iv_ruleLPAREN= ruleLPAREN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLPARENRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLPAREN=ruleLPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLPAREN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLPAREN"


    // $ANTLR start "ruleLPAREN"
    // InternalSocrates.g:3605:1: ruleLPAREN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLPAREN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3611:2: (kw= '(' )
            // InternalSocrates.g:3612:2: kw= '('
            {
            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getLPARENAccess().getLeftParenthesisKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLPAREN"


    // $ANTLR start "entryRuleRPAREN"
    // InternalSocrates.g:3620:1: entryRuleRPAREN returns [String current=null] : iv_ruleRPAREN= ruleRPAREN EOF ;
    public final String entryRuleRPAREN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRPAREN = null;


        try {
            // InternalSocrates.g:3620:46: (iv_ruleRPAREN= ruleRPAREN EOF )
            // InternalSocrates.g:3621:2: iv_ruleRPAREN= ruleRPAREN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRPARENRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRPAREN=ruleRPAREN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRPAREN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRPAREN"


    // $ANTLR start "ruleRPAREN"
    // InternalSocrates.g:3627:1: ruleRPAREN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRPAREN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3633:2: (kw= ')' )
            // InternalSocrates.g:3634:2: kw= ')'
            {
            kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getRPARENAccess().getRightParenthesisKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRPAREN"


    // $ANTLR start "entryRuleLSQUARE"
    // InternalSocrates.g:3642:1: entryRuleLSQUARE returns [String current=null] : iv_ruleLSQUARE= ruleLSQUARE EOF ;
    public final String entryRuleLSQUARE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLSQUARE = null;


        try {
            // InternalSocrates.g:3642:47: (iv_ruleLSQUARE= ruleLSQUARE EOF )
            // InternalSocrates.g:3643:2: iv_ruleLSQUARE= ruleLSQUARE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLSQUARERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLSQUARE=ruleLSQUARE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLSQUARE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLSQUARE"


    // $ANTLR start "ruleLSQUARE"
    // InternalSocrates.g:3649:1: ruleLSQUARE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '[' ;
    public final AntlrDatatypeRuleToken ruleLSQUARE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3655:2: (kw= '[' )
            // InternalSocrates.g:3656:2: kw= '['
            {
            kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getLSQUAREAccess().getLeftSquareBracketKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLSQUARE"


    // $ANTLR start "entryRuleRSQUARE"
    // InternalSocrates.g:3664:1: entryRuleRSQUARE returns [String current=null] : iv_ruleRSQUARE= ruleRSQUARE EOF ;
    public final String entryRuleRSQUARE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRSQUARE = null;


        try {
            // InternalSocrates.g:3664:47: (iv_ruleRSQUARE= ruleRSQUARE EOF )
            // InternalSocrates.g:3665:2: iv_ruleRSQUARE= ruleRSQUARE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRSQUARERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRSQUARE=ruleRSQUARE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRSQUARE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRSQUARE"


    // $ANTLR start "ruleRSQUARE"
    // InternalSocrates.g:3671:1: ruleRSQUARE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ']' ;
    public final AntlrDatatypeRuleToken ruleRSQUARE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3677:2: (kw= ']' )
            // InternalSocrates.g:3678:2: kw= ']'
            {
            kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getRSQUAREAccess().getRightSquareBracketKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRSQUARE"


    // $ANTLR start "entryRuleNOT"
    // InternalSocrates.g:3686:1: entryRuleNOT returns [String current=null] : iv_ruleNOT= ruleNOT EOF ;
    public final String entryRuleNOT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNOT = null;


        try {
            // InternalSocrates.g:3686:43: (iv_ruleNOT= ruleNOT EOF )
            // InternalSocrates.g:3687:2: iv_ruleNOT= ruleNOT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNOTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNOT=ruleNOT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNOT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNOT"


    // $ANTLR start "ruleNOT"
    // InternalSocrates.g:3693:1: ruleNOT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'not' ;
    public final AntlrDatatypeRuleToken ruleNOT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3699:2: (kw= 'not' )
            // InternalSocrates.g:3700:2: kw= 'not'
            {
            kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getNOTAccess().getNotKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNOT"


    // $ANTLR start "entryRuleFORALL"
    // InternalSocrates.g:3708:1: entryRuleFORALL returns [String current=null] : iv_ruleFORALL= ruleFORALL EOF ;
    public final String entryRuleFORALL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFORALL = null;


        try {
            // InternalSocrates.g:3708:46: (iv_ruleFORALL= ruleFORALL EOF )
            // InternalSocrates.g:3709:2: iv_ruleFORALL= ruleFORALL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFORALLRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFORALL=ruleFORALL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFORALL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFORALL"


    // $ANTLR start "ruleFORALL"
    // InternalSocrates.g:3715:1: ruleFORALL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'forall' ;
    public final AntlrDatatypeRuleToken ruleFORALL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3721:2: (kw= 'forall' )
            // InternalSocrates.g:3722:2: kw= 'forall'
            {
            kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getFORALLAccess().getForallKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFORALL"


    // $ANTLR start "entryRuleEXISTS"
    // InternalSocrates.g:3730:1: entryRuleEXISTS returns [String current=null] : iv_ruleEXISTS= ruleEXISTS EOF ;
    public final String entryRuleEXISTS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXISTS = null;


        try {
            // InternalSocrates.g:3730:46: (iv_ruleEXISTS= ruleEXISTS EOF )
            // InternalSocrates.g:3731:2: iv_ruleEXISTS= ruleEXISTS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXISTSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEXISTS=ruleEXISTS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXISTS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXISTS"


    // $ANTLR start "ruleEXISTS"
    // InternalSocrates.g:3737:1: ruleEXISTS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'exists' ;
    public final AntlrDatatypeRuleToken ruleEXISTS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3743:2: (kw= 'exists' )
            // InternalSocrates.g:3744:2: kw= 'exists'
            {
            kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getEXISTSAccess().getExistsKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXISTS"


    // $ANTLR start "entryRuleCONJ"
    // InternalSocrates.g:3752:1: entryRuleCONJ returns [String current=null] : iv_ruleCONJ= ruleCONJ EOF ;
    public final String entryRuleCONJ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONJ = null;


        try {
            // InternalSocrates.g:3752:44: (iv_ruleCONJ= ruleCONJ EOF )
            // InternalSocrates.g:3753:2: iv_ruleCONJ= ruleCONJ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCONJRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCONJ=ruleCONJ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCONJ.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONJ"


    // $ANTLR start "ruleCONJ"
    // InternalSocrates.g:3759:1: ruleCONJ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleCONJ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3765:2: (kw= 'and' )
            // InternalSocrates.g:3766:2: kw= 'and'
            {
            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCONJAccess().getAndKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONJ"


    // $ANTLR start "entryRuleDISJ"
    // InternalSocrates.g:3774:1: entryRuleDISJ returns [String current=null] : iv_ruleDISJ= ruleDISJ EOF ;
    public final String entryRuleDISJ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDISJ = null;


        try {
            // InternalSocrates.g:3774:44: (iv_ruleDISJ= ruleDISJ EOF )
            // InternalSocrates.g:3775:2: iv_ruleDISJ= ruleDISJ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDISJRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDISJ=ruleDISJ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDISJ.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDISJ"


    // $ANTLR start "ruleDISJ"
    // InternalSocrates.g:3781:1: ruleDISJ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken ruleDISJ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3787:2: (kw= 'or' )
            // InternalSocrates.g:3788:2: kw= 'or'
            {
            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDISJAccess().getOrKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDISJ"


    // $ANTLR start "entryRuleIMPL"
    // InternalSocrates.g:3796:1: entryRuleIMPL returns [String current=null] : iv_ruleIMPL= ruleIMPL EOF ;
    public final String entryRuleIMPL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPL = null;


        try {
            // InternalSocrates.g:3796:44: (iv_ruleIMPL= ruleIMPL EOF )
            // InternalSocrates.g:3797:2: iv_ruleIMPL= ruleIMPL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIMPLRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIMPL=ruleIMPL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIMPL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMPL"


    // $ANTLR start "ruleIMPL"
    // InternalSocrates.g:3803:1: ruleIMPL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'implies' ;
    public final AntlrDatatypeRuleToken ruleIMPL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3809:2: (kw= 'implies' )
            // InternalSocrates.g:3810:2: kw= 'implies'
            {
            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getIMPLAccess().getImpliesKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIMPL"


    // $ANTLR start "entryRuleBICOND"
    // InternalSocrates.g:3818:1: entryRuleBICOND returns [String current=null] : iv_ruleBICOND= ruleBICOND EOF ;
    public final String entryRuleBICOND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBICOND = null;


        try {
            // InternalSocrates.g:3818:46: (iv_ruleBICOND= ruleBICOND EOF )
            // InternalSocrates.g:3819:2: iv_ruleBICOND= ruleBICOND EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBICONDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBICOND=ruleBICOND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBICOND.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBICOND"


    // $ANTLR start "ruleBICOND"
    // InternalSocrates.g:3825:1: ruleBICOND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'iff' ;
    public final AntlrDatatypeRuleToken ruleBICOND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3831:2: (kw= 'iff' )
            // InternalSocrates.g:3832:2: kw= 'iff'
            {
            kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getBICONDAccess().getIffKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBICOND"


    // $ANTLR start "entryRuleINF"
    // InternalSocrates.g:3840:1: entryRuleINF returns [String current=null] : iv_ruleINF= ruleINF EOF ;
    public final String entryRuleINF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINF = null;


        try {
            // InternalSocrates.g:3840:43: (iv_ruleINF= ruleINF EOF )
            // InternalSocrates.g:3841:2: iv_ruleINF= ruleINF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINFRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleINF=ruleINF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINF.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINF"


    // $ANTLR start "ruleINF"
    // InternalSocrates.g:3847:1: ruleINF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'inf' ;
    public final AntlrDatatypeRuleToken ruleINF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3853:2: (kw= 'inf' )
            // InternalSocrates.g:3854:2: kw= 'inf'
            {
            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getINFAccess().getInfKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINF"


    // $ANTLR start "entryRuleIN"
    // InternalSocrates.g:3862:1: entryRuleIN returns [String current=null] : iv_ruleIN= ruleIN EOF ;
    public final String entryRuleIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIN = null;


        try {
            // InternalSocrates.g:3862:42: (iv_ruleIN= ruleIN EOF )
            // InternalSocrates.g:3863:2: iv_ruleIN= ruleIN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIN=ruleIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIN"


    // $ANTLR start "ruleIN"
    // InternalSocrates.g:3869:1: ruleIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'in' ;
    public final AntlrDatatypeRuleToken ruleIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3875:2: (kw= 'in' )
            // InternalSocrates.g:3876:2: kw= 'in'
            {
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getINAccess().getInKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIN"


    // $ANTLR start "entryRulePLUS"
    // InternalSocrates.g:3884:1: entryRulePLUS returns [String current=null] : iv_rulePLUS= rulePLUS EOF ;
    public final String entryRulePLUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLUS = null;


        try {
            // InternalSocrates.g:3884:44: (iv_rulePLUS= rulePLUS EOF )
            // InternalSocrates.g:3885:2: iv_rulePLUS= rulePLUS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPLUSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePLUS=rulePLUS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePLUS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePLUS"


    // $ANTLR start "rulePLUS"
    // InternalSocrates.g:3891:1: rulePLUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulePLUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3897:2: (kw= '+' )
            // InternalSocrates.g:3898:2: kw= '+'
            {
            kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPLUSAccess().getPlusSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePLUS"


    // $ANTLR start "entryRuleMINUS"
    // InternalSocrates.g:3906:1: entryRuleMINUS returns [String current=null] : iv_ruleMINUS= ruleMINUS EOF ;
    public final String entryRuleMINUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMINUS = null;


        try {
            // InternalSocrates.g:3906:45: (iv_ruleMINUS= ruleMINUS EOF )
            // InternalSocrates.g:3907:2: iv_ruleMINUS= ruleMINUS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMINUSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMINUS=ruleMINUS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMINUS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMINUS"


    // $ANTLR start "ruleMINUS"
    // InternalSocrates.g:3913:1: ruleMINUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleMINUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3919:2: (kw= '-' )
            // InternalSocrates.g:3920:2: kw= '-'
            {
            kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getMINUSAccess().getHyphenMinusKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMINUS"


    // $ANTLR start "entryRuleCOLON"
    // InternalSocrates.g:3928:1: entryRuleCOLON returns [String current=null] : iv_ruleCOLON= ruleCOLON EOF ;
    public final String entryRuleCOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOLON = null;


        try {
            // InternalSocrates.g:3928:45: (iv_ruleCOLON= ruleCOLON EOF )
            // InternalSocrates.g:3929:2: iv_ruleCOLON= ruleCOLON EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCOLONRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCOLON=ruleCOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCOLON.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOLON"


    // $ANTLR start "ruleCOLON"
    // InternalSocrates.g:3935:1: ruleCOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleCOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSocrates.g:3941:2: (kw= ':' )
            // InternalSocrates.g:3942:2: kw= ':'
            {
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCOLONAccess().getColonKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOLON"


    // $ANTLR start "entryRuleSIGN"
    // InternalSocrates.g:3950:1: entryRuleSIGN returns [String current=null] : iv_ruleSIGN= ruleSIGN EOF ;
    public final String entryRuleSIGN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGN = null;


        try {
            // InternalSocrates.g:3950:44: (iv_ruleSIGN= ruleSIGN EOF )
            // InternalSocrates.g:3951:2: iv_ruleSIGN= ruleSIGN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSIGNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSIGN=ruleSIGN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSIGN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSIGN"


    // $ANTLR start "ruleSIGN"
    // InternalSocrates.g:3957:1: ruleSIGN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= rulePLUS | this_MINUS_1= ruleMINUS ) ;
    public final AntlrDatatypeRuleToken ruleSIGN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PLUS_0 = null;

        AntlrDatatypeRuleToken this_MINUS_1 = null;



        	enterRule();

        try {
            // InternalSocrates.g:3963:2: ( (this_PLUS_0= rulePLUS | this_MINUS_1= ruleMINUS ) )
            // InternalSocrates.g:3964:2: (this_PLUS_0= rulePLUS | this_MINUS_1= ruleMINUS )
            {
            // InternalSocrates.g:3964:2: (this_PLUS_0= rulePLUS | this_MINUS_1= ruleMINUS )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            else if ( (LA36_0==29) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalSocrates.g:3965:3: this_PLUS_0= rulePLUS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSIGNAccess().getPLUSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PLUS_0=rulePLUS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PLUS_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSocrates.g:3976:3: this_MINUS_1= ruleMINUS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSIGNAccess().getMINUSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MINUS_1=ruleMINUS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MINUS_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGN"

    // $ANTLR start synpred13_InternalSocrates
    public final void synpred13_InternalSocrates_fragment() throws RecognitionException {   
        Token lv_op_0_0=null;
        EObject lv_t_1_0 = null;

        EObject lv_f1_2_0 = null;


        // InternalSocrates.g:1236:3: ( ( (lv_op_0_0= 'and' ) ) ( (lv_t_1_0= ruleterm ) ) ( (lv_f1_2_0= ruletermprime ) ) )
        // InternalSocrates.g:1236:3: ( (lv_op_0_0= 'and' ) ) ( (lv_t_1_0= ruleterm ) ) ( (lv_f1_2_0= ruletermprime ) )
        {
        // InternalSocrates.g:1236:3: ( (lv_op_0_0= 'and' ) )
        // InternalSocrates.g:1237:4: (lv_op_0_0= 'and' )
        {
        // InternalSocrates.g:1237:4: (lv_op_0_0= 'and' )
        // InternalSocrates.g:1238:5: lv_op_0_0= 'and'
        {
        lv_op_0_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return ;

        }


        }

        // InternalSocrates.g:1250:3: ( (lv_t_1_0= ruleterm ) )
        // InternalSocrates.g:1251:4: (lv_t_1_0= ruleterm )
        {
        // InternalSocrates.g:1251:4: (lv_t_1_0= ruleterm )
        // InternalSocrates.g:1252:5: lv_t_1_0= ruleterm
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getTermprimeAccess().getTTermParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_24);
        lv_t_1_0=ruleterm();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSocrates.g:1269:3: ( (lv_f1_2_0= ruletermprime ) )
        // InternalSocrates.g:1270:4: (lv_f1_2_0= ruletermprime )
        {
        // InternalSocrates.g:1270:4: (lv_f1_2_0= ruletermprime )
        // InternalSocrates.g:1271:5: lv_f1_2_0= ruletermprime
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getTermprimeAccess().getF1TermprimeParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_f1_2_0=ruletermprime();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalSocrates

    // $ANTLR start synpred14_InternalSocrates
    public final void synpred14_InternalSocrates_fragment() throws RecognitionException {   
        EObject lv_term_0_0 = null;

        EObject lv_expprime_1_0 = null;


        // InternalSocrates.g:1343:3: ( ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) ) )
        // InternalSocrates.g:1343:3: ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) )
        {
        // InternalSocrates.g:1343:3: ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) )
        // InternalSocrates.g:1344:4: ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) )
        {
        // InternalSocrates.g:1344:4: ( (lv_term_0_0= ruleexpressionterm ) )
        // InternalSocrates.g:1345:5: (lv_term_0_0= ruleexpressionterm )
        {
        // InternalSocrates.g:1345:5: (lv_term_0_0= ruleexpressionterm )
        // InternalSocrates.g:1346:6: lv_term_0_0= ruleexpressionterm
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExpressionbAccess().getTermExpressiontermParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_25);
        lv_term_0_0=ruleexpressionterm();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSocrates.g:1363:4: ( (lv_expprime_1_0= ruleexpressionprime ) )
        // InternalSocrates.g:1364:5: (lv_expprime_1_0= ruleexpressionprime )
        {
        // InternalSocrates.g:1364:5: (lv_expprime_1_0= ruleexpressionprime )
        // InternalSocrates.g:1365:6: lv_expprime_1_0= ruleexpressionprime
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExpressionbAccess().getExpprimeExpressionprimeParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_expprime_1_0=ruleexpressionprime();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSocrates

    // $ANTLR start synpred16_InternalSocrates
    public final void synpred16_InternalSocrates_fragment() throws RecognitionException {   
        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        EObject lv_t2_1_0 = null;

        EObject lv_f_2_0 = null;


        // InternalSocrates.g:1463:3: ( ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressionprime ) ) )
        // InternalSocrates.g:1463:3: ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressionprime ) )
        {
        // InternalSocrates.g:1463:3: ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) ) )
        // InternalSocrates.g:1464:4: ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) )
        {
        // InternalSocrates.g:1464:4: ( (lv_op_0_1= '+' | lv_op_0_2= '-' ) )
        // InternalSocrates.g:1465:5: (lv_op_0_1= '+' | lv_op_0_2= '-' )
        {
        // InternalSocrates.g:1465:5: (lv_op_0_1= '+' | lv_op_0_2= '-' )
        int alt39=2;
        int LA39_0 = input.LA(1);

        if ( (LA39_0==28) ) {
            alt39=1;
        }
        else if ( (LA39_0==29) ) {
            alt39=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 39, 0, input);

            throw nvae;
        }
        switch (alt39) {
            case 1 :
                // InternalSocrates.g:1466:6: lv_op_0_1= '+'
                {
                lv_op_0_1=(Token)match(input,28,FOLLOW_26); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalSocrates.g:1477:6: lv_op_0_2= '-'
                {
                lv_op_0_2=(Token)match(input,29,FOLLOW_26); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalSocrates.g:1490:3: ( (lv_t2_1_0= ruleexpressionterm ) )
        // InternalSocrates.g:1491:4: (lv_t2_1_0= ruleexpressionterm )
        {
        // InternalSocrates.g:1491:4: (lv_t2_1_0= ruleexpressionterm )
        // InternalSocrates.g:1492:5: lv_t2_1_0= ruleexpressionterm
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpressionprimeAccess().getT2ExpressiontermParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_25);
        lv_t2_1_0=ruleexpressionterm();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSocrates.g:1509:3: ( (lv_f_2_0= ruleexpressionprime ) )
        // InternalSocrates.g:1510:4: (lv_f_2_0= ruleexpressionprime )
        {
        // InternalSocrates.g:1510:4: (lv_f_2_0= ruleexpressionprime )
        // InternalSocrates.g:1511:5: lv_f_2_0= ruleexpressionprime
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpressionprimeAccess().getFExpressionprimeParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_f_2_0=ruleexpressionprime();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalSocrates

    // $ANTLR start synpred17_InternalSocrates
    public final void synpred17_InternalSocrates_fragment() throws RecognitionException {   
        EObject lv_term_0_1 = null;


        // InternalSocrates.g:1550:6: (lv_term_0_1= ruleExpressionAtom )
        // InternalSocrates.g:1550:6: lv_term_0_1= ruleExpressionAtom
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExpressiontermAccess().getTermExpressionAtomParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_term_0_1=ruleExpressionAtom();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalSocrates

    // $ANTLR start synpred19_InternalSocrates
    public final void synpred19_InternalSocrates_fragment() throws RecognitionException {   
        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        EObject lv_t2_1_0 = null;

        EObject lv_f_2_0 = null;


        // InternalSocrates.g:1622:3: ( ( ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressiontermprime ) ) )
        // InternalSocrates.g:1622:3: ( ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) ) ) ( (lv_t2_1_0= ruleexpressionterm ) ) ( (lv_f_2_0= ruleexpressiontermprime ) )
        {
        // InternalSocrates.g:1622:3: ( ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) ) )
        // InternalSocrates.g:1623:4: ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) )
        {
        // InternalSocrates.g:1623:4: ( (lv_op_0_1= '*' | lv_op_0_2= '/' ) )
        // InternalSocrates.g:1624:5: (lv_op_0_1= '*' | lv_op_0_2= '/' )
        {
        // InternalSocrates.g:1624:5: (lv_op_0_1= '*' | lv_op_0_2= '/' )
        int alt40=2;
        int LA40_0 = input.LA(1);

        if ( (LA40_0==30) ) {
            alt40=1;
        }
        else if ( (LA40_0==31) ) {
            alt40=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 40, 0, input);

            throw nvae;
        }
        switch (alt40) {
            case 1 :
                // InternalSocrates.g:1625:6: lv_op_0_1= '*'
                {
                lv_op_0_1=(Token)match(input,30,FOLLOW_26); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalSocrates.g:1636:6: lv_op_0_2= '/'
                {
                lv_op_0_2=(Token)match(input,31,FOLLOW_26); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalSocrates.g:1649:3: ( (lv_t2_1_0= ruleexpressionterm ) )
        // InternalSocrates.g:1650:4: (lv_t2_1_0= ruleexpressionterm )
        {
        // InternalSocrates.g:1650:4: (lv_t2_1_0= ruleexpressionterm )
        // InternalSocrates.g:1651:5: lv_t2_1_0= ruleexpressionterm
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpressiontermprimeAccess().getT2ExpressiontermParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_27);
        lv_t2_1_0=ruleexpressionterm();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSocrates.g:1668:3: ( (lv_f_2_0= ruleexpressiontermprime ) )
        // InternalSocrates.g:1669:4: (lv_f_2_0= ruleexpressiontermprime )
        {
        // InternalSocrates.g:1669:4: (lv_f_2_0= ruleexpressiontermprime )
        // InternalSocrates.g:1670:5: lv_f_2_0= ruleexpressiontermprime
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpressiontermprimeAccess().getFExpressiontermprimeParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_f_2_0=ruleexpressiontermprime();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalSocrates

    // $ANTLR start synpred20_InternalSocrates
    public final void synpred20_InternalSocrates_fragment() throws RecognitionException {   
        EObject lv_exp_0_0 = null;


        // InternalSocrates.g:1706:3: ( ( (lv_exp_0_0= ruleSignal ) ) )
        // InternalSocrates.g:1706:3: ( (lv_exp_0_0= ruleSignal ) )
        {
        // InternalSocrates.g:1706:3: ( (lv_exp_0_0= ruleSignal ) )
        // InternalSocrates.g:1707:4: (lv_exp_0_0= ruleSignal )
        {
        // InternalSocrates.g:1707:4: (lv_exp_0_0= ruleSignal )
        // InternalSocrates.g:1708:5: lv_exp_0_0= ruleSignal
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpressionAtomAccess().getExpSignalParserRuleCall_0_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_exp_0_0=ruleSignal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSocrates

    // $ANTLR start synpred21_InternalSocrates
    public final void synpred21_InternalSocrates_fragment() throws RecognitionException {   
        EObject lv_exp_2_0 = null;


        // InternalSocrates.g:1726:3: ( ( ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN ) )
        // InternalSocrates.g:1726:3: ( ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN )
        {
        // InternalSocrates.g:1726:3: ( ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN )
        // InternalSocrates.g:1727:4: ruleLPAREN ( (lv_exp_2_0= ruleexpression ) ) ruleRPAREN
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FOLLOW_26);
        ruleLPAREN();

        state._fsp--;
        if (state.failed) return ;
        // InternalSocrates.g:1737:4: ( (lv_exp_2_0= ruleexpression ) )
        // InternalSocrates.g:1738:5: (lv_exp_2_0= ruleexpression )
        {
        // InternalSocrates.g:1738:5: (lv_exp_2_0= ruleexpression )
        // InternalSocrates.g:1739:6: lv_exp_2_0= ruleexpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExpressionAtomAccess().getExpExpressionParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_22);
        lv_exp_2_0=ruleexpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleRPAREN();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSocrates

    // $ANTLR start synpred34_InternalSocrates
    public final void synpred34_InternalSocrates_fragment() throws RecognitionException {   
        Token otherlv_2=null;

        // InternalSocrates.g:2305:5: ( ( (otherlv_2= RULE_ID ) ) )
        // InternalSocrates.g:2305:5: ( (otherlv_2= RULE_ID ) )
        {
        // InternalSocrates.g:2305:5: ( (otherlv_2= RULE_ID ) )
        // InternalSocrates.g:2306:6: (otherlv_2= RULE_ID )
        {
        // InternalSocrates.g:2306:6: (otherlv_2= RULE_ID )
        // InternalSocrates.g:2307:7: otherlv_2= RULE_ID
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }
        otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred34_InternalSocrates

    // Delegated rules

    public final boolean synpred17_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSocrates_fragment(); // can never throw exception
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
    public final boolean synpred21_InternalSocrates() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSocrates_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\0\12\uffff";
    static final String dfa_3s = "\1\60\1\uffff\1\0\12\uffff";
    static final String dfa_4s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_5s = "\2\uffff\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\2\1\24\uffff\2\1\4\uffff\5\1\11\uffff\1\2",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1342:2: ( ( ( (lv_term_0_0= ruleexpressionterm ) ) ( (lv_expprime_1_0= ruleexpressionprime ) ) ) | ( ruleLPAREN ( (lv_term_3_0= ruleexpressionterm ) ) ruleRPAREN ( (lv_expprime_5_0= ruleexpressionprime ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSocrates()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\0\11\uffff";
    static final String dfa_9s = "\1\60\1\uffff\1\0\11\uffff";
    static final String dfa_10s = "\1\uffff\1\1\5\uffff\1\2\4\uffff";
    static final String dfa_11s = "\2\uffff\1\0\11\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\uffff\2\1\24\uffff\2\1\4\uffff\5\7\11\uffff\1\2",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1549:5: (lv_term_0_1= ruleExpressionAtom | lv_term_0_2= ruleBasicexpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSocrates()) ) {s = 1;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000030000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0071000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000300000C0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001007C300000D0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00800000000000D0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00010000300000D0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000012L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000080000000L});

}