// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g 2012-04-02 19:05:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class specParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OPERATOR", "INT", "ID", "WS", "TAB", "NEWLINE", "'specobject'", "'variables'", "'properties'", "'constraints'"
    };
    public static final int WS=7;
    public static final int NEWLINE=9;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int OPERATOR=4;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int TAB=8;
    public static final int INT=5;
    public static final int ID=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public specParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public specParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return specParser.tokenNames; }
    public String getGrammarFileName() { return "/home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g"; }


    public static class specobjects_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "specobjects"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:68:1: specobjects : ( specobject )* ;
    public final specParser.specobjects_return specobjects() throws RecognitionException {
        specParser.specobjects_return retval = new specParser.specobjects_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        specParser.specobject_return specobject1 = null;



        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:69:2: ( ( specobject )* )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:69:4: ( specobject )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:69:4: ( specobject )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:69:4: specobject
            	    {
            	    pushFollow(FOLLOW_specobject_in_specobjects251);
            	    specobject1=specobject();

            	    state._fsp--;

            	    adaptor.addChild(root_0, specobject1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
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
        }
        return retval;
    }
    // $ANTLR end "specobjects"

    public static class specobject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "specobject"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:72:1: specobject : 'specobject' ;
    public final specParser.specobject_return specobject() throws RecognitionException {
        specParser.specobject_return retval = new specParser.specobject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal2=null;

        Object string_literal2_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:73:2: ( 'specobject' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:73:4: 'specobject'
            {
            root_0 = (Object)adaptor.nil();

            string_literal2=(Token)match(input,10,FOLLOW_10_in_specobject263); 
            string_literal2_tree = (Object)adaptor.create(string_literal2);
            adaptor.addChild(root_0, string_literal2_tree);


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
        }
        return retval;
    }
    // $ANTLR end "specobject"

    public static class variables_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variables"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:77:1: variables : 'variables' ;
    public final specParser.variables_return variables() throws RecognitionException {
        specParser.variables_return retval = new specParser.variables_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal3=null;

        Object string_literal3_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:78:2: ( 'variables' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:78:4: 'variables'
            {
            root_0 = (Object)adaptor.nil();

            string_literal3=(Token)match(input,11,FOLLOW_11_in_variables275); 
            string_literal3_tree = (Object)adaptor.create(string_literal3);
            adaptor.addChild(root_0, string_literal3_tree);


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
        }
        return retval;
    }
    // $ANTLR end "variables"

    public static class properties_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "properties"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:80:1: properties : 'properties' ;
    public final specParser.properties_return properties() throws RecognitionException {
        specParser.properties_return retval = new specParser.properties_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal4=null;

        Object string_literal4_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:81:2: ( 'properties' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:81:4: 'properties'
            {
            root_0 = (Object)adaptor.nil();

            string_literal4=(Token)match(input,12,FOLLOW_12_in_properties285); 
            string_literal4_tree = (Object)adaptor.create(string_literal4);
            adaptor.addChild(root_0, string_literal4_tree);


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
        }
        return retval;
    }
    // $ANTLR end "properties"

    public static class constraints_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraints"
    // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:83:1: constraints : 'constraints' ;
    public final specParser.constraints_return constraints() throws RecognitionException {
        specParser.constraints_return retval = new specParser.constraints_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;

        Object string_literal5_tree=null;

        try {
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:84:2: ( 'constraints' )
            // /home/elm/sandbox/aub/fyp/guicop-specification-language/spec.g:84:4: 'constraints'
            {
            root_0 = (Object)adaptor.nil();

            string_literal5=(Token)match(input,13,FOLLOW_13_in_constraints295); 
            string_literal5_tree = (Object)adaptor.create(string_literal5);
            adaptor.addChild(root_0, string_literal5_tree);


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
        }
        return retval;
    }
    // $ANTLR end "constraints"

    // Delegated rules


 

    public static final BitSet FOLLOW_specobject_in_specobjects251 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_specobject263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_variables275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_properties285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_constraints295 = new BitSet(new long[]{0x0000000000000002L});

}