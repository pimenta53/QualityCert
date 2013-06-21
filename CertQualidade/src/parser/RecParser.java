// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g 2012-07-09 11:49:32

  package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AuxArgList", "FunctionRecordArrayEmpty", "FRA3", "FRA2", "FRA1", "FRAFieldList", "FRAArgList", "TypeIdNil", "TypeIdInteger", "TypeIdString", "TypeId", "AuxExpList", "RelExpEmpty", "RelExpMoreEqual", "RelExpLessEqual", "RelExpDiferent", "RelExpMore", "RelExpLess", "DFunDec", "DVarDec", "DTyDec", "TTypeId", "TArrayOf", "TFieldList", "FIfThenElse", "FIfThen", "FLvalue", "FLet", "FBreak", "FFor", "FWhile", "FNeg", "FExpList", "FString", "FInteger", "FNil", "Aux3", "TyDec", "ExpListEmpty", "ExpList", "Prog", "Aux22", "Aux21", "AritExp", "AuxFRA1", "ExpOR", "AuxFRA24", "AuxFRA23", "AuxFRA22", "AuxFRA21", "ExpORPrEmpty", "ExpORPr", "FieldListEmpty", "FieldListEqual", "FieldListDP", "ExpAND", "TermPrEmpty", "TermPrEqual", "TermPrNeg", "TermPrPlus", "Aux4", "DecList", "FactorPrEmpty", "Div", "Times", "ExpANDPrEmpty", "ExpANDPr", "IntFieldList3", "IntFieldList2", "IntFieldList1", "Aux12", "Aux11", "FunDec2", "FunDec1", "AuxFieldList", "ArgListEmpty", "ArgList", "Exp", "Term", "VarDec2", "VarDec1", "LValue", "INT", "STRING", "ID", "LETTER", "DIGIT", "NESTED_ML_COMMENT", "WHITESPACE", "'|'", "'&'", "'<'", "'>'", "'<>'", "'<='", "'>='", "'+'", "'-'", "'='", "'*'", "'/'", "'nil'", "'('", "')'", "'while'", "'do'", "'for'", "':='", "'to'", "'break'", "'let'", "'in'", "'end'", "'if'", "'then'", "'else'", "'type'", "'{'", "'}'", "'array of'", "':'", "','", "'['", "']'", "'of'", "'var'", "'function'", "'.'", "';'"
    };
    public static final int ExpOR=55;
    public static final int DTyDec=30;
    public static final int ExpList=49;
    public static final int LETTER=95;
    public static final int FactorPrEmpty=72;
    public static final int EOF=-1;
    public static final int FBreak=38;
    public static final int ArgListEmpty=85;
    public static final int ExpANDPr=76;
    public static final int FFor=39;
    public static final int FRA2=13;
    public static final int FRA1=14;
    public static final int Term=88;
    public static final int FRA3=12;
    public static final int TypeIdNil=17;
    public static final int RelExpLessEqual=24;
    public static final int TypeIdInteger=18;
    public static final int T__99=99;
    public static final int FunDec2=82;
    public static final int FunDec1=83;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int AritExp=53;
    public static final int LValue=91;
    public static final int NESTED_ML_COMMENT=97;
    public static final int DFunDec=28;
    public static final int AuxFRA21=59;
    public static final int AuxFRA22=58;
    public static final int AuxFRA23=57;
    public static final int AuxFRA24=56;
    public static final int WHITESPACE=98;
    public static final int INT=92;
    public static final int FIfThenElse=34;
    public static final int T__126=126;
    public static final int RelExpMore=26;
    public static final int T__125=125;
    public static final int AuxFRA1=54;
    public static final int T__128=128;
    public static final int Prog=50;
    public static final int T__127=127;
    public static final int Aux3=46;
    public static final int T__129=129;
    public static final int FieldListEmpty=62;
    public static final int Times=74;
    public static final int FNeg=41;
    public static final int FWhile=40;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int Aux4=70;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int TermPrEqual=67;
    public static final int FieldListDP=64;
    public static final int T__118=118;
    public static final int TTypeId=31;
    public static final int T__119=119;
    public static final int AuxArgList=10;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int TermPrEmpty=66;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int TypeId=20;
    public static final int IntFieldList2=78;
    public static final int FLet=37;
    public static final int IntFieldList1=79;
    public static final int IntFieldList3=77;
    public static final int ID=94;
    public static final int AuxFieldList=84;
    public static final int ExpAND=65;
    public static final int ExpListEmpty=48;
    public static final int RelExpLess=27;
    public static final int DecList=71;
    public static final int ExpORPrEmpty=60;
    public static final int TermPrPlus=69;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int AuxExpList=21;
    public static final int T__109=109;
    public static final int RelExpDiferent=25;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int DIGIT=96;
    public static final int FLvalue=36;
    public static final int TFieldList=33;
    public static final int ExpANDPrEmpty=75;
    public static final int TArrayOf=32;
    public static final int Div=73;
    public static final int Aux12=80;
    public static final int Aux11=81;
    public static final int Exp=87;
    public static final int TyDec=47;
    public static final int T__102=102;
    public static final int FExpList=42;
    public static final int T__101=101;
    public static final int VarDec1=90;
    public static final int RelExpMoreEqual=23;
    public static final int FieldListEqual=63;
    public static final int T__100=100;
    public static final int VarDec2=89;
    public static final int FIfThen=35;
    public static final int DVarDec=29;
    public static final int Aux21=52;
    public static final int TypeIdString=19;
    public static final int TermPrNeg=68;
    public static final int FString=43;
    public static final int ArgList=86;
    public static final int FNil=45;
    public static final int ExpORPr=61;
    public static final int Aux22=51;
    public static final int FRAFieldList=15;
    public static final int FunctionRecordArrayEmpty=11;
    public static final int FInteger=44;
    public static final int RelExpEmpty=22;
    public static final int FRAArgList=16;
    public static final int STRING=93;

    // delegates
    // delegators


        public RecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RecParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:15:1: prog : exp -> ^( Prog exp ) ;
    public final RecParser.prog_return prog() throws RecognitionException {
        RecParser.prog_return retval = new RecParser.prog_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.exp_return exp1 = null;


        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:15:8: ( exp -> ^( Prog exp ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:15:10: exp
            {
            pushFollow(FOLLOW_exp_in_prog57);
            exp1=exp();

            state._fsp--;

            stream_exp.add(exp1.getTree());


            // AST REWRITE
            // elements: exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 15:16: -> ^( Prog exp )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:15:19: ^( Prog exp )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Prog, "Prog"), root_1);

                adaptor.addChild(root_1, stream_exp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class exp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:17:1: exp : e1= expOR e2= expORPr -> ^( Exp $e1 $e2) ;
    public final RecParser.exp_return exp() throws RecognitionException {
        RecParser.exp_return retval = new RecParser.exp_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.expOR_return e1 = null;

        RecParser.expORPr_return e2 = null;


        RewriteRuleSubtreeStream stream_expORPr=new RewriteRuleSubtreeStream(adaptor,"rule expORPr");
        RewriteRuleSubtreeStream stream_expOR=new RewriteRuleSubtreeStream(adaptor,"rule expOR");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:17:7: (e1= expOR e2= expORPr -> ^( Exp $e1 $e2) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:17:9: e1= expOR e2= expORPr
            {
            pushFollow(FOLLOW_expOR_in_exp82);
            e1=expOR();

            state._fsp--;

            stream_expOR.add(e1.getTree());
            pushFollow(FOLLOW_expORPr_in_exp86);
            e2=expORPr();

            state._fsp--;

            stream_expORPr.add(e2.getTree());


            // AST REWRITE
            // elements: e1, e2
            // token labels: 
            // rule labels: retval, e1, e2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 17:30: -> ^( Exp $e1 $e2)
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:17:33: ^( Exp $e1 $e2)
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);

                adaptor.addChild(root_1, stream_e1.nextTree());
                adaptor.addChild(root_1, stream_e2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exp"

    public static class expOR_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expOR"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:19:1: expOR : e1= expAND e2= expANDPr -> ^( ExpOR $e1 $e2) ;
    public final RecParser.expOR_return expOR() throws RecognitionException {
        RecParser.expOR_return retval = new RecParser.expOR_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.expAND_return e1 = null;

        RecParser.expANDPr_return e2 = null;


        RewriteRuleSubtreeStream stream_expANDPr=new RewriteRuleSubtreeStream(adaptor,"rule expANDPr");
        RewriteRuleSubtreeStream stream_expAND=new RewriteRuleSubtreeStream(adaptor,"rule expAND");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:19:8: (e1= expAND e2= expANDPr -> ^( ExpOR $e1 $e2) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:19:10: e1= expAND e2= expANDPr
            {
            pushFollow(FOLLOW_expAND_in_expOR113);
            e1=expAND();

            state._fsp--;

            stream_expAND.add(e1.getTree());
            pushFollow(FOLLOW_expANDPr_in_expOR117);
            e2=expANDPr();

            state._fsp--;

            stream_expANDPr.add(e2.getTree());


            // AST REWRITE
            // elements: e2, e1
            // token labels: 
            // rule labels: retval, e1, e2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 19:33: -> ^( ExpOR $e1 $e2)
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:19:36: ^( ExpOR $e1 $e2)
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpOR, "ExpOR"), root_1);

                adaptor.addChild(root_1, stream_e1.nextTree());
                adaptor.addChild(root_1, stream_e2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expOR"

    public static class expAND_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expAND"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:21:1: expAND : aritExp relExp -> ^( ExpAND aritExp relExp ) ;
    public final RecParser.expAND_return expAND() throws RecognitionException {
        RecParser.expAND_return retval = new RecParser.expAND_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.aritExp_return aritExp2 = null;

        RecParser.relExp_return relExp3 = null;


        RewriteRuleSubtreeStream stream_aritExp=new RewriteRuleSubtreeStream(adaptor,"rule aritExp");
        RewriteRuleSubtreeStream stream_relExp=new RewriteRuleSubtreeStream(adaptor,"rule relExp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:21:9: ( aritExp relExp -> ^( ExpAND aritExp relExp ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:21:11: aritExp relExp
            {
            pushFollow(FOLLOW_aritExp_in_expAND142);
            aritExp2=aritExp();

            state._fsp--;

            stream_aritExp.add(aritExp2.getTree());
            pushFollow(FOLLOW_relExp_in_expAND144);
            relExp3=relExp();

            state._fsp--;

            stream_relExp.add(relExp3.getTree());


            // AST REWRITE
            // elements: relExp, aritExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 21:27: -> ^( ExpAND aritExp relExp )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:21:30: ^( ExpAND aritExp relExp )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpAND, "ExpAND"), root_1);

                adaptor.addChild(root_1, stream_aritExp.nextTree());
                adaptor.addChild(root_1, stream_relExp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expAND"

    public static class expORPr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expORPr"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:23:1: expORPr : ( '|' exp -> ^( ExpORPr exp ) | -> ^( ExpORPrEmpty ) );
    public final RecParser.expORPr_return expORPr() throws RecognitionException {
        RecParser.expORPr_return retval = new RecParser.expORPr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal4=null;
        RecParser.exp_return exp5 = null;


        Tree char_literal4_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:23:10: ( '|' exp -> ^( ExpORPr exp ) | -> ^( ExpORPrEmpty ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:23:12: '|' exp
                    {
                    char_literal4=(Token)match(input,99,FOLLOW_99_in_expORPr167);  
                    stream_99.add(char_literal4);

                    pushFollow(FOLLOW_exp_in_expORPr169);
                    exp5=exp();

                    state._fsp--;

                    stream_exp.add(exp5.getTree());


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 23:27: -> ^( ExpORPr exp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:23:30: ^( ExpORPr exp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpORPr, "ExpORPr"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:24:11: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 24:11: -> ^( ExpORPrEmpty )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:24:14: ^( ExpORPrEmpty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpORPrEmpty, "ExpORPrEmpty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expORPr"

    public static class expANDPr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expANDPr"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:26:1: expANDPr : ( '&' exp -> ^( ExpANDPr exp ) | -> ^( ExpANDPrEmpty ) );
    public final RecParser.expANDPr_return expANDPr() throws RecognitionException {
        RecParser.expANDPr_return retval = new RecParser.expANDPr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal6=null;
        RecParser.exp_return exp7 = null;


        Tree char_literal6_tree=null;
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:26:10: ( '&' exp -> ^( ExpANDPr exp ) | -> ^( ExpANDPrEmpty ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:26:12: '&' exp
                    {
                    char_literal6=(Token)match(input,100,FOLLOW_100_in_expANDPr211);  
                    stream_100.add(char_literal6);

                    pushFollow(FOLLOW_exp_in_expANDPr213);
                    exp7=exp();

                    state._fsp--;

                    stream_exp.add(exp7.getTree());


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 26:22: -> ^( ExpANDPr exp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:26:25: ^( ExpANDPr exp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpANDPr, "ExpANDPr"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:27:10: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 27:10: -> ^( ExpANDPrEmpty )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:27:13: ^( ExpANDPrEmpty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpANDPrEmpty, "ExpANDPrEmpty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expANDPr"

    public static class aritExp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aritExp"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:29:1: aritExp : term termPr -> ^( AritExp term termPr ) ;
    public final RecParser.aritExp_return aritExp() throws RecognitionException {
        RecParser.aritExp_return retval = new RecParser.aritExp_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.term_return term8 = null;

        RecParser.termPr_return termPr9 = null;


        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_termPr=new RewriteRuleSubtreeStream(adaptor,"rule termPr");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:29:10: ( term termPr -> ^( AritExp term termPr ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:29:12: term termPr
            {
            pushFollow(FOLLOW_term_in_aritExp250);
            term8=term();

            state._fsp--;

            stream_term.add(term8.getTree());
            pushFollow(FOLLOW_termPr_in_aritExp252);
            termPr9=termPr();

            state._fsp--;

            stream_termPr.add(termPr9.getTree());


            // AST REWRITE
            // elements: term, termPr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 29:26: -> ^( AritExp term termPr )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:29:29: ^( AritExp term termPr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(AritExp, "AritExp"), root_1);

                adaptor.addChild(root_1, stream_term.nextTree());
                adaptor.addChild(root_1, stream_termPr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aritExp"

    public static class relExp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relExp"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:31:1: relExp : ( '<' aritExp -> ^( RelExpLess aritExp ) | '>' aritExp -> ^( RelExpMore aritExp ) | '<>' aritExp -> ^( RelExpDiferent aritExp ) | '<=' aritExp -> ^( RelExpLessEqual aritExp ) | '>=' aritExp -> ^( RelExpMoreEqual aritExp ) | -> ^( RelExpEmpty ) );
    public final RecParser.relExp_return relExp() throws RecognitionException {
        RecParser.relExp_return retval = new RecParser.relExp_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        Token string_literal14=null;
        Token string_literal16=null;
        Token string_literal18=null;
        RecParser.aritExp_return aritExp11 = null;

        RecParser.aritExp_return aritExp13 = null;

        RecParser.aritExp_return aritExp15 = null;

        RecParser.aritExp_return aritExp17 = null;

        RecParser.aritExp_return aritExp19 = null;


        Tree char_literal10_tree=null;
        Tree char_literal12_tree=null;
        Tree string_literal14_tree=null;
        Tree string_literal16_tree=null;
        Tree string_literal18_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_aritExp=new RewriteRuleSubtreeStream(adaptor,"rule aritExp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:31:9: ( '<' aritExp -> ^( RelExpLess aritExp ) | '>' aritExp -> ^( RelExpMore aritExp ) | '<>' aritExp -> ^( RelExpDiferent aritExp ) | '<=' aritExp -> ^( RelExpLessEqual aritExp ) | '>=' aritExp -> ^( RelExpMoreEqual aritExp ) | -> ^( RelExpEmpty ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:31:11: '<' aritExp
                    {
                    char_literal10=(Token)match(input,101,FOLLOW_101_in_relExp276);  
                    stream_101.add(char_literal10);

                    pushFollow(FOLLOW_aritExp_in_relExp278);
                    aritExp11=aritExp();

                    state._fsp--;

                    stream_aritExp.add(aritExp11.getTree());


                    // AST REWRITE
                    // elements: aritExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 31:24: -> ^( RelExpLess aritExp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:31:27: ^( RelExpLess aritExp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(RelExpLess, "RelExpLess"), root_1);

                        adaptor.addChild(root_1, stream_aritExp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:32:6: '>' aritExp
                    {
                    char_literal12=(Token)match(input,102,FOLLOW_102_in_relExp294);  
                    stream_102.add(char_literal12);

                    pushFollow(FOLLOW_aritExp_in_relExp296);
                    aritExp13=aritExp();

                    state._fsp--;

                    stream_aritExp.add(aritExp13.getTree());


                    // AST REWRITE
                    // elements: aritExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 32:19: -> ^( RelExpMore aritExp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:32:22: ^( RelExpMore aritExp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(RelExpMore, "RelExpMore"), root_1);

                        adaptor.addChild(root_1, stream_aritExp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:33:6: '<>' aritExp
                    {
                    string_literal14=(Token)match(input,103,FOLLOW_103_in_relExp312);  
                    stream_103.add(string_literal14);

                    pushFollow(FOLLOW_aritExp_in_relExp314);
                    aritExp15=aritExp();

                    state._fsp--;

                    stream_aritExp.add(aritExp15.getTree());


                    // AST REWRITE
                    // elements: aritExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 33:20: -> ^( RelExpDiferent aritExp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:33:23: ^( RelExpDiferent aritExp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(RelExpDiferent, "RelExpDiferent"), root_1);

                        adaptor.addChild(root_1, stream_aritExp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:34:6: '<=' aritExp
                    {
                    string_literal16=(Token)match(input,104,FOLLOW_104_in_relExp330);  
                    stream_104.add(string_literal16);

                    pushFollow(FOLLOW_aritExp_in_relExp332);
                    aritExp17=aritExp();

                    state._fsp--;

                    stream_aritExp.add(aritExp17.getTree());


                    // AST REWRITE
                    // elements: aritExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 34:20: -> ^( RelExpLessEqual aritExp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:34:23: ^( RelExpLessEqual aritExp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(RelExpLessEqual, "RelExpLessEqual"), root_1);

                        adaptor.addChild(root_1, stream_aritExp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:35:6: '>=' aritExp
                    {
                    string_literal18=(Token)match(input,105,FOLLOW_105_in_relExp348);  
                    stream_105.add(string_literal18);

                    pushFollow(FOLLOW_aritExp_in_relExp350);
                    aritExp19=aritExp();

                    state._fsp--;

                    stream_aritExp.add(aritExp19.getTree());


                    // AST REWRITE
                    // elements: aritExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 35:20: -> ^( RelExpMoreEqual aritExp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:35:23: ^( RelExpMoreEqual aritExp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(RelExpMoreEqual, "RelExpMoreEqual"), root_1);

                        adaptor.addChild(root_1, stream_aritExp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:36:12: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 36:12: -> ^( RelExpEmpty )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:36:15: ^( RelExpEmpty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(RelExpEmpty, "RelExpEmpty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relExp"

    public static class term_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:38:1: term : factor factorPr -> ^( Term factor factorPr ) ;
    public final RecParser.term_return term() throws RecognitionException {
        RecParser.term_return retval = new RecParser.term_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.factor_return factor20 = null;

        RecParser.factorPr_return factorPr21 = null;


        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        RewriteRuleSubtreeStream stream_factorPr=new RewriteRuleSubtreeStream(adaptor,"rule factorPr");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:38:7: ( factor factorPr -> ^( Term factor factorPr ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:38:9: factor factorPr
            {
            pushFollow(FOLLOW_factor_in_term388);
            factor20=factor();

            state._fsp--;

            stream_factor.add(factor20.getTree());
            pushFollow(FOLLOW_factorPr_in_term390);
            factorPr21=factorPr();

            state._fsp--;

            stream_factorPr.add(factorPr21.getTree());


            // AST REWRITE
            // elements: factor, factorPr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 38:25: -> ^( Term factor factorPr )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:38:28: ^( Term factor factorPr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Term, "Term"), root_1);

                adaptor.addChild(root_1, stream_factor.nextTree());
                adaptor.addChild(root_1, stream_factorPr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class termPr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termPr"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:40:1: termPr : ( '+' term termPr -> ^( TermPrPlus term termPr ) | '-' term termPr -> ^( TermPrNeg term termPr ) | '=' term termPr -> ^( TermPrEqual term termPr ) | -> ^( TermPrEmpty ) );
    public final RecParser.termPr_return termPr() throws RecognitionException {
        RecParser.termPr_return retval = new RecParser.termPr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal22=null;
        Token char_literal25=null;
        Token char_literal28=null;
        RecParser.term_return term23 = null;

        RecParser.termPr_return termPr24 = null;

        RecParser.term_return term26 = null;

        RecParser.termPr_return termPr27 = null;

        RecParser.term_return term29 = null;

        RecParser.termPr_return termPr30 = null;


        Tree char_literal22_tree=null;
        Tree char_literal25_tree=null;
        Tree char_literal28_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_termPr=new RewriteRuleSubtreeStream(adaptor,"rule termPr");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:40:9: ( '+' term termPr -> ^( TermPrPlus term termPr ) | '-' term termPr -> ^( TermPrNeg term termPr ) | '=' term termPr -> ^( TermPrEqual term termPr ) | -> ^( TermPrEmpty ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:40:11: '+' term termPr
                    {
                    char_literal22=(Token)match(input,106,FOLLOW_106_in_termPr412);  
                    stream_106.add(char_literal22);

                    pushFollow(FOLLOW_term_in_termPr414);
                    term23=term();

                    state._fsp--;

                    stream_term.add(term23.getTree());
                    pushFollow(FOLLOW_termPr_in_termPr416);
                    termPr24=termPr();

                    state._fsp--;

                    stream_termPr.add(termPr24.getTree());


                    // AST REWRITE
                    // elements: termPr, term
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 40:27: -> ^( TermPrPlus term termPr )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:40:30: ^( TermPrPlus term termPr )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TermPrPlus, "TermPrPlus"), root_1);

                        adaptor.addChild(root_1, stream_term.nextTree());
                        adaptor.addChild(root_1, stream_termPr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:41:6: '-' term termPr
                    {
                    char_literal25=(Token)match(input,107,FOLLOW_107_in_termPr433);  
                    stream_107.add(char_literal25);

                    pushFollow(FOLLOW_term_in_termPr435);
                    term26=term();

                    state._fsp--;

                    stream_term.add(term26.getTree());
                    pushFollow(FOLLOW_termPr_in_termPr437);
                    termPr27=termPr();

                    state._fsp--;

                    stream_termPr.add(termPr27.getTree());


                    // AST REWRITE
                    // elements: termPr, term
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 41:22: -> ^( TermPrNeg term termPr )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:41:25: ^( TermPrNeg term termPr )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TermPrNeg, "TermPrNeg"), root_1);

                        adaptor.addChild(root_1, stream_term.nextTree());
                        adaptor.addChild(root_1, stream_termPr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:42:6: '=' term termPr
                    {
                    char_literal28=(Token)match(input,108,FOLLOW_108_in_termPr454);  
                    stream_108.add(char_literal28);

                    pushFollow(FOLLOW_term_in_termPr456);
                    term29=term();

                    state._fsp--;

                    stream_term.add(term29.getTree());
                    pushFollow(FOLLOW_termPr_in_termPr458);
                    termPr30=termPr();

                    state._fsp--;

                    stream_termPr.add(termPr30.getTree());


                    // AST REWRITE
                    // elements: term, termPr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 42:22: -> ^( TermPrEqual term termPr )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:42:25: ^( TermPrEqual term termPr )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TermPrEqual, "TermPrEqual"), root_1);

                        adaptor.addChild(root_1, stream_term.nextTree());
                        adaptor.addChild(root_1, stream_termPr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:43:11: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 43:11: -> ^( TermPrEmpty )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:43:14: ^( TermPrEmpty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TermPrEmpty, "TermPrEmpty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termPr"

    public static class factorPr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factorPr"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:45:1: factorPr : ( '*' factor factorPr -> ^( Times factor factorPr ) | '/' factor factorPr -> ^( Div factor factorPr ) | -> ^( FactorPrEmpty ) );
    public final RecParser.factorPr_return factorPr() throws RecognitionException {
        RecParser.factorPr_return retval = new RecParser.factorPr_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal31=null;
        Token char_literal34=null;
        RecParser.factor_return factor32 = null;

        RecParser.factorPr_return factorPr33 = null;

        RecParser.factor_return factor35 = null;

        RecParser.factorPr_return factorPr36 = null;


        Tree char_literal31_tree=null;
        Tree char_literal34_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        RewriteRuleSubtreeStream stream_factorPr=new RewriteRuleSubtreeStream(adaptor,"rule factorPr");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:45:10: ( '*' factor factorPr -> ^( Times factor factorPr ) | '/' factor factorPr -> ^( Div factor factorPr ) | -> ^( FactorPrEmpty ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:45:12: '*' factor factorPr
                    {
                    char_literal31=(Token)match(input,109,FOLLOW_109_in_factorPr495);  
                    stream_109.add(char_literal31);

                    pushFollow(FOLLOW_factor_in_factorPr497);
                    factor32=factor();

                    state._fsp--;

                    stream_factor.add(factor32.getTree());
                    pushFollow(FOLLOW_factorPr_in_factorPr499);
                    factorPr33=factorPr();

                    state._fsp--;

                    stream_factorPr.add(factorPr33.getTree());


                    // AST REWRITE
                    // elements: factorPr, factor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 45:33: -> ^( Times factor factorPr )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:45:36: ^( Times factor factorPr )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Times, "Times"), root_1);

                        adaptor.addChild(root_1, stream_factor.nextTree());
                        adaptor.addChild(root_1, stream_factorPr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:46:6: '/' factor factorPr
                    {
                    char_literal34=(Token)match(input,110,FOLLOW_110_in_factorPr517);  
                    stream_110.add(char_literal34);

                    pushFollow(FOLLOW_factor_in_factorPr519);
                    factor35=factor();

                    state._fsp--;

                    stream_factor.add(factor35.getTree());
                    pushFollow(FOLLOW_factorPr_in_factorPr521);
                    factorPr36=factorPr();

                    state._fsp--;

                    stream_factorPr.add(factorPr36.getTree());


                    // AST REWRITE
                    // elements: factorPr, factor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 46:27: -> ^( Div factor factorPr )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:46:30: ^( Div factor factorPr )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Div, "Div"), root_1);

                        adaptor.addChild(root_1, stream_factor.nextTree());
                        adaptor.addChild(root_1, stream_factorPr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:47:12: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 47:12: -> ^( FactorPrEmpty )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:47:15: ^( FactorPrEmpty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FactorPrEmpty, "FactorPrEmpty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factorPr"

    public static class factor_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:49:1: factor : ( 'nil' -> ^( FNil ) | INT -> ^( FInteger INT ) | STRING -> ^( FString STRING ) | '(' expList ')' -> ^( FExpList expList ) | '-' exp -> ^( FNeg exp ) | 'while' e1= exp 'do' e2= exp -> ^( FWhile $e1 $e2) | 'for' ID ':=' e1= exp 'to' e2= exp 'do' e3= exp -> ^( FFor ID $e1 $e2 $e3) | 'break' -> ^( FBreak ) | 'let' decList 'in' expList 'end' -> ^( FLet decList expList ) | lv= lValue -> ^( FLvalue $lv) | ( 'if' e1= exp 'then' e2= exp ( 'else' e3= exp )? -> {e3==null}? ^( FIfThen $e1 $e2) -> ^( FIfThenElse $e1 $e2 $e3) ) );
    public final RecParser.factor_return factor() throws RecognitionException {
        RecParser.factor_return retval = new RecParser.factor_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal37=null;
        Token INT38=null;
        Token STRING39=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Token char_literal43=null;
        Token string_literal45=null;
        Token string_literal46=null;
        Token string_literal47=null;
        Token ID48=null;
        Token string_literal49=null;
        Token string_literal50=null;
        Token string_literal51=null;
        Token string_literal52=null;
        Token string_literal53=null;
        Token string_literal55=null;
        Token string_literal57=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token string_literal60=null;
        RecParser.exp_return e1 = null;

        RecParser.exp_return e2 = null;

        RecParser.exp_return e3 = null;

        RecParser.lValue_return lv = null;

        RecParser.expList_return expList41 = null;

        RecParser.exp_return exp44 = null;

        RecParser.decList_return decList54 = null;

        RecParser.expList_return expList56 = null;


        Tree string_literal37_tree=null;
        Tree INT38_tree=null;
        Tree STRING39_tree=null;
        Tree char_literal40_tree=null;
        Tree char_literal42_tree=null;
        Tree char_literal43_tree=null;
        Tree string_literal45_tree=null;
        Tree string_literal46_tree=null;
        Tree string_literal47_tree=null;
        Tree ID48_tree=null;
        Tree string_literal49_tree=null;
        Tree string_literal50_tree=null;
        Tree string_literal51_tree=null;
        Tree string_literal52_tree=null;
        Tree string_literal53_tree=null;
        Tree string_literal55_tree=null;
        Tree string_literal57_tree=null;
        Tree string_literal58_tree=null;
        Tree string_literal59_tree=null;
        Tree string_literal60_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_lValue=new RewriteRuleSubtreeStream(adaptor,"rule lValue");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_expList=new RewriteRuleSubtreeStream(adaptor,"rule expList");
        RewriteRuleSubtreeStream stream_decList=new RewriteRuleSubtreeStream(adaptor,"rule decList");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:49:9: ( 'nil' -> ^( FNil ) | INT -> ^( FInteger INT ) | STRING -> ^( FString STRING ) | '(' expList ')' -> ^( FExpList expList ) | '-' exp -> ^( FNeg exp ) | 'while' e1= exp 'do' e2= exp -> ^( FWhile $e1 $e2) | 'for' ID ':=' e1= exp 'to' e2= exp 'do' e3= exp -> ^( FFor ID $e1 $e2 $e3) | 'break' -> ^( FBreak ) | 'let' decList 'in' expList 'end' -> ^( FLet decList expList ) | lv= lValue -> ^( FLvalue $lv) | ( 'if' e1= exp 'then' e2= exp ( 'else' e3= exp )? -> {e3==null}? ^( FIfThen $e1 $e2) -> ^( FIfThenElse $e1 $e2 $e3) ) )
            int alt7=11;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:49:11: 'nil'
                    {
                    string_literal37=(Token)match(input,111,FOLLOW_111_in_factor561);  
                    stream_111.add(string_literal37);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 49:28: -> ^( FNil )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:49:31: ^( FNil )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FNil, "FNil"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:50:6: INT
                    {
                    INT38=(Token)match(input,INT,FOLLOW_INT_in_factor585);  
                    stream_INT.add(INT38);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 50:21: -> ^( FInteger INT )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:50:24: ^( FInteger INT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FInteger, "FInteger"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:51:6: STRING
                    {
                    STRING39=(Token)match(input,STRING,FOLLOW_STRING_in_factor611);  
                    stream_STRING.add(STRING39);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 51:23: -> ^( FString STRING )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:51:26: ^( FString STRING )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FString, "FString"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:52:6: '(' expList ')'
                    {
                    char_literal40=(Token)match(input,112,FOLLOW_112_in_factor636);  
                    stream_112.add(char_literal40);

                    pushFollow(FOLLOW_expList_in_factor638);
                    expList41=expList();

                    state._fsp--;

                    stream_expList.add(expList41.getTree());
                    char_literal42=(Token)match(input,113,FOLLOW_113_in_factor640);  
                    stream_113.add(char_literal42);



                    // AST REWRITE
                    // elements: expList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 52:30: -> ^( FExpList expList )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:52:33: ^( FExpList expList )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FExpList, "FExpList"), root_1);

                        adaptor.addChild(root_1, stream_expList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:53:6: '-' exp
                    {
                    char_literal43=(Token)match(input,107,FOLLOW_107_in_factor663);  
                    stream_107.add(char_literal43);

                    pushFollow(FOLLOW_exp_in_factor665);
                    exp44=exp();

                    state._fsp--;

                    stream_exp.add(exp44.getTree());


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 53:24: -> ^( FNeg exp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:53:27: ^( FNeg exp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FNeg, "FNeg"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:54:6: 'while' e1= exp 'do' e2= exp
                    {
                    string_literal45=(Token)match(input,114,FOLLOW_114_in_factor690);  
                    stream_114.add(string_literal45);

                    pushFollow(FOLLOW_exp_in_factor694);
                    e1=exp();

                    state._fsp--;

                    stream_exp.add(e1.getTree());
                    string_literal46=(Token)match(input,115,FOLLOW_115_in_factor696);  
                    stream_115.add(string_literal46);

                    pushFollow(FOLLOW_exp_in_factor700);
                    e2=exp();

                    state._fsp--;

                    stream_exp.add(e2.getTree());


                    // AST REWRITE
                    // elements: e2, e1
                    // token labels: 
                    // rule labels: retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 54:38: -> ^( FWhile $e1 $e2)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:54:41: ^( FWhile $e1 $e2)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FWhile, "FWhile"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:55:6: 'for' ID ':=' e1= exp 'to' e2= exp 'do' e3= exp
                    {
                    string_literal47=(Token)match(input,116,FOLLOW_116_in_factor724);  
                    stream_116.add(string_literal47);

                    ID48=(Token)match(input,ID,FOLLOW_ID_in_factor726);  
                    stream_ID.add(ID48);

                    string_literal49=(Token)match(input,117,FOLLOW_117_in_factor728);  
                    stream_117.add(string_literal49);

                    pushFollow(FOLLOW_exp_in_factor732);
                    e1=exp();

                    state._fsp--;

                    stream_exp.add(e1.getTree());
                    string_literal50=(Token)match(input,118,FOLLOW_118_in_factor734);  
                    stream_118.add(string_literal50);

                    pushFollow(FOLLOW_exp_in_factor738);
                    e2=exp();

                    state._fsp--;

                    stream_exp.add(e2.getTree());
                    string_literal51=(Token)match(input,115,FOLLOW_115_in_factor740);  
                    stream_115.add(string_literal51);

                    pushFollow(FOLLOW_exp_in_factor744);
                    e3=exp();

                    state._fsp--;

                    stream_exp.add(e3.getTree());


                    // AST REWRITE
                    // elements: e1, e3, ID, e2
                    // token labels: 
                    // rule labels: e3, retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 55:52: -> ^( FFor ID $e1 $e2 $e3)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:55:55: ^( FFor ID $e1 $e2 $e3)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FFor, "FFor"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());
                        adaptor.addChild(root_1, stream_e3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:56:6: 'break'
                    {
                    string_literal52=(Token)match(input,119,FOLLOW_119_in_factor769);  
                    stream_119.add(string_literal52);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 56:24: -> ^( FBreak )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:56:27: ^( FBreak )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FBreak, "FBreak"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:57:6: 'let' decList 'in' expList 'end'
                    {
                    string_literal53=(Token)match(input,120,FOLLOW_120_in_factor792);  
                    stream_120.add(string_literal53);

                    pushFollow(FOLLOW_decList_in_factor794);
                    decList54=decList();

                    state._fsp--;

                    stream_decList.add(decList54.getTree());
                    string_literal55=(Token)match(input,121,FOLLOW_121_in_factor796);  
                    stream_121.add(string_literal55);

                    pushFollow(FOLLOW_expList_in_factor798);
                    expList56=expList();

                    state._fsp--;

                    stream_expList.add(expList56.getTree());
                    string_literal57=(Token)match(input,122,FOLLOW_122_in_factor800);  
                    stream_122.add(string_literal57);



                    // AST REWRITE
                    // elements: expList, decList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 57:43: -> ^( FLet decList expList )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:57:46: ^( FLet decList expList )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FLet, "FLet"), root_1);

                        adaptor.addChild(root_1, stream_decList.nextTree());
                        adaptor.addChild(root_1, stream_expList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:58:6: lv= lValue
                    {
                    pushFollow(FOLLOW_lValue_in_factor823);
                    lv=lValue();

                    state._fsp--;

                    stream_lValue.add(lv.getTree());


                    // AST REWRITE
                    // elements: lv
                    // token labels: 
                    // rule labels: retval, lv
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:26: -> ^( FLvalue $lv)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:58:29: ^( FLvalue $lv)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FLvalue, "FLvalue"), root_1);

                        adaptor.addChild(root_1, stream_lv.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:59:6: ( 'if' e1= exp 'then' e2= exp ( 'else' e3= exp )? -> {e3==null}? ^( FIfThen $e1 $e2) -> ^( FIfThenElse $e1 $e2 $e3) )
                    {
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:59:6: ( 'if' e1= exp 'then' e2= exp ( 'else' e3= exp )? -> {e3==null}? ^( FIfThen $e1 $e2) -> ^( FIfThenElse $e1 $e2 $e3) )
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:59:7: 'if' e1= exp 'then' e2= exp ( 'else' e3= exp )?
                    {
                    string_literal58=(Token)match(input,123,FOLLOW_123_in_factor850);  
                    stream_123.add(string_literal58);

                    pushFollow(FOLLOW_exp_in_factor854);
                    e1=exp();

                    state._fsp--;

                    stream_exp.add(e1.getTree());
                    string_literal59=(Token)match(input,124,FOLLOW_124_in_factor856);  
                    stream_124.add(string_literal59);

                    pushFollow(FOLLOW_exp_in_factor860);
                    e2=exp();

                    state._fsp--;

                    stream_exp.add(e2.getTree());
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:59:33: ( 'else' e3= exp )?
                    int alt6=2;
                    alt6 = dfa6.predict(input);
                    switch (alt6) {
                        case 1 :
                            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:59:34: 'else' e3= exp
                            {
                            string_literal60=(Token)match(input,125,FOLLOW_125_in_factor863);  
                            stream_125.add(string_literal60);

                            pushFollow(FOLLOW_exp_in_factor867);
                            e3=exp();

                            state._fsp--;

                            stream_exp.add(e3.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: e1, e3, e2, e2, e1
                    // token labels: 
                    // rule labels: e3, retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 59:51: -> {e3==null}? ^( FIfThen $e1 $e2)
                    if (e3==null) {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:59:66: ^( FIfThen $e1 $e2)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FIfThen, "FIfThen"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 60:17: -> ^( FIfThenElse $e1 $e2 $e3)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:60:20: ^( FIfThenElse $e1 $e2 $e3)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FIfThenElse, "FIfThenElse"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());
                        adaptor.addChild(root_1, stream_e3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class decList_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decList"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:62:1: decList : ( dec )* -> ^( DecList ( dec )* ) ;
    public final RecParser.decList_return decList() throws RecognitionException {
        RecParser.decList_return retval = new RecParser.decList_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.dec_return dec61 = null;


        RewriteRuleSubtreeStream stream_dec=new RewriteRuleSubtreeStream(adaptor,"rule dec");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:62:10: ( ( dec )* -> ^( DecList ( dec )* ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:62:12: ( dec )*
            {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:62:12: ( dec )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==126||(LA8_0>=135 && LA8_0<=136)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:62:12: dec
            	    {
            	    pushFollow(FOLLOW_dec_in_decList928);
            	    dec61=dec();

            	    state._fsp--;

            	    stream_dec.add(dec61.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: dec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 62:21: -> ^( DecList ( dec )* )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:62:24: ^( DecList ( dec )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DecList, "DecList"), root_1);

                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:62:34: ( dec )*
                while ( stream_dec.hasNext() ) {
                    adaptor.addChild(root_1, stream_dec.nextTree());

                }
                stream_dec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decList"

    public static class dec_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:64:1: dec : ( tyDec -> ^( DTyDec tyDec ) | varDec -> ^( DVarDec varDec ) | funDec -> ^( DFunDec funDec ) );
    public final RecParser.dec_return dec() throws RecognitionException {
        RecParser.dec_return retval = new RecParser.dec_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.tyDec_return tyDec62 = null;

        RecParser.varDec_return varDec63 = null;

        RecParser.funDec_return funDec64 = null;


        RewriteRuleSubtreeStream stream_tyDec=new RewriteRuleSubtreeStream(adaptor,"rule tyDec");
        RewriteRuleSubtreeStream stream_funDec=new RewriteRuleSubtreeStream(adaptor,"rule funDec");
        RewriteRuleSubtreeStream stream_varDec=new RewriteRuleSubtreeStream(adaptor,"rule varDec");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:64:7: ( tyDec -> ^( DTyDec tyDec ) | varDec -> ^( DVarDec varDec ) | funDec -> ^( DFunDec funDec ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt9=1;
                }
                break;
            case 135:
                {
                alt9=2;
                }
                break;
            case 136:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:64:9: tyDec
                    {
                    pushFollow(FOLLOW_tyDec_in_dec955);
                    tyDec62=tyDec();

                    state._fsp--;

                    stream_tyDec.add(tyDec62.getTree());


                    // AST REWRITE
                    // elements: tyDec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 64:18: -> ^( DTyDec tyDec )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:64:21: ^( DTyDec tyDec )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DTyDec, "DTyDec"), root_1);

                        adaptor.addChild(root_1, stream_tyDec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:65:6: varDec
                    {
                    pushFollow(FOLLOW_varDec_in_dec973);
                    varDec63=varDec();

                    state._fsp--;

                    stream_varDec.add(varDec63.getTree());


                    // AST REWRITE
                    // elements: varDec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 65:15: -> ^( DVarDec varDec )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:65:18: ^( DVarDec varDec )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DVarDec, "DVarDec"), root_1);

                        adaptor.addChild(root_1, stream_varDec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:66:6: funDec
                    {
                    pushFollow(FOLLOW_funDec_in_dec990);
                    funDec64=funDec();

                    state._fsp--;

                    stream_funDec.add(funDec64.getTree());


                    // AST REWRITE
                    // elements: funDec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 66:15: -> ^( DFunDec funDec )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:66:18: ^( DFunDec funDec )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DFunDec, "DFunDec"), root_1);

                        adaptor.addChild(root_1, stream_funDec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dec"

    public static class tyDec_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tyDec"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:68:1: tyDec : 'type' typeId '=' ty -> ^( TyDec typeId ty ) ;
    public final RecParser.tyDec_return tyDec() throws RecognitionException {
        RecParser.tyDec_return retval = new RecParser.tyDec_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal65=null;
        Token char_literal67=null;
        RecParser.typeId_return typeId66 = null;

        RecParser.ty_return ty68 = null;


        Tree string_literal65_tree=null;
        Tree char_literal67_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleSubtreeStream stream_ty=new RewriteRuleSubtreeStream(adaptor,"rule ty");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:68:8: ( 'type' typeId '=' ty -> ^( TyDec typeId ty ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:68:10: 'type' typeId '=' ty
            {
            string_literal65=(Token)match(input,126,FOLLOW_126_in_tyDec1012);  
            stream_126.add(string_literal65);

            pushFollow(FOLLOW_typeId_in_tyDec1014);
            typeId66=typeId();

            state._fsp--;

            stream_typeId.add(typeId66.getTree());
            char_literal67=(Token)match(input,108,FOLLOW_108_in_tyDec1016);  
            stream_108.add(char_literal67);

            pushFollow(FOLLOW_ty_in_tyDec1018);
            ty68=ty();

            state._fsp--;

            stream_ty.add(ty68.getTree());


            // AST REWRITE
            // elements: typeId, ty
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 68:31: -> ^( TyDec typeId ty )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:68:34: ^( TyDec typeId ty )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TyDec, "TyDec"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                adaptor.addChild(root_1, stream_ty.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tyDec"

    public static class ty_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ty"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:70:1: ty : ( '{' fieldList '}' -> ^( TFieldList fieldList ) | 'array of' ti= typeId -> ^( TArrayOf $ti) | ti= typeId -> ^( TTypeId $ti) );
    public final RecParser.ty_return ty() throws RecognitionException {
        RecParser.ty_return retval = new RecParser.ty_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal69=null;
        Token char_literal71=null;
        Token string_literal72=null;
        RecParser.typeId_return ti = null;

        RecParser.fieldList_return fieldList70 = null;


        Tree char_literal69_tree=null;
        Tree char_literal71_tree=null;
        Tree string_literal72_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:70:7: ( '{' fieldList '}' -> ^( TFieldList fieldList ) | 'array of' ti= typeId -> ^( TArrayOf $ti) | ti= typeId -> ^( TTypeId $ti) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt10=1;
                }
                break;
            case 129:
                {
                alt10=2;
                }
                break;
            case INT:
            case STRING:
            case ID:
            case 111:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:70:9: '{' fieldList '}'
                    {
                    char_literal69=(Token)match(input,127,FOLLOW_127_in_ty1042);  
                    stream_127.add(char_literal69);

                    pushFollow(FOLLOW_fieldList_in_ty1044);
                    fieldList70=fieldList();

                    state._fsp--;

                    stream_fieldList.add(fieldList70.getTree());
                    char_literal71=(Token)match(input,128,FOLLOW_128_in_ty1046);  
                    stream_128.add(char_literal71);



                    // AST REWRITE
                    // elements: fieldList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 70:28: -> ^( TFieldList fieldList )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:70:31: ^( TFieldList fieldList )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TFieldList, "TFieldList"), root_1);

                        adaptor.addChild(root_1, stream_fieldList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:71:6: 'array of' ti= typeId
                    {
                    string_literal72=(Token)match(input,129,FOLLOW_129_in_ty1062);  
                    stream_129.add(string_literal72);

                    pushFollow(FOLLOW_typeId_in_ty1066);
                    ti=typeId();

                    state._fsp--;

                    stream_typeId.add(ti.getTree());


                    // AST REWRITE
                    // elements: ti
                    // token labels: 
                    // rule labels: retval, ti
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ti=new RewriteRuleSubtreeStream(adaptor,"rule ti",ti!=null?ti.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 71:28: -> ^( TArrayOf $ti)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:71:31: ^( TArrayOf $ti)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TArrayOf, "TArrayOf"), root_1);

                        adaptor.addChild(root_1, stream_ti.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:72:6: ti= typeId
                    {
                    pushFollow(FOLLOW_typeId_in_ty1085);
                    ti=typeId();

                    state._fsp--;

                    stream_typeId.add(ti.getTree());


                    // AST REWRITE
                    // elements: ti
                    // token labels: 
                    // rule labels: retval, ti
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ti=new RewriteRuleSubtreeStream(adaptor,"rule ti",ti!=null?ti.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 72:19: -> ^( TTypeId $ti)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:72:22: ^( TTypeId $ti)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TTypeId, "TTypeId"), root_1);

                        adaptor.addChild(root_1, stream_ti.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ty"

    public static class fieldList_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:74:1: fieldList : ( ID ':' ti= typeId auxFieldList -> ^( FieldListDP ID $ti auxFieldList ) | ID '=' ti= typeId auxFieldList -> ^( FieldListEqual ID $ti auxFieldList ) | -> ^( FieldListEmpty ) );
    public final RecParser.fieldList_return fieldList() throws RecognitionException {
        RecParser.fieldList_return retval = new RecParser.fieldList_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID73=null;
        Token char_literal74=null;
        Token ID76=null;
        Token char_literal77=null;
        RecParser.typeId_return ti = null;

        RecParser.auxFieldList_return auxFieldList75 = null;

        RecParser.auxFieldList_return auxFieldList78 = null;


        Tree ID73_tree=null;
        Tree char_literal74_tree=null;
        Tree ID76_tree=null;
        Tree char_literal77_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_auxFieldList=new RewriteRuleSubtreeStream(adaptor,"rule auxFieldList");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:74:11: ( ID ':' ti= typeId auxFieldList -> ^( FieldListDP ID $ti auxFieldList ) | ID '=' ti= typeId auxFieldList -> ^( FieldListEqual ID $ti auxFieldList ) | -> ^( FieldListEmpty ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==130) ) {
                    alt11=1;
                }
                else if ( (LA11_1==108) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==113||LA11_0==128) ) {
                alt11=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:74:13: ID ':' ti= typeId auxFieldList
                    {
                    ID73=(Token)match(input,ID,FOLLOW_ID_in_fieldList1108);  
                    stream_ID.add(ID73);

                    char_literal74=(Token)match(input,130,FOLLOW_130_in_fieldList1110);  
                    stream_130.add(char_literal74);

                    pushFollow(FOLLOW_typeId_in_fieldList1114);
                    ti=typeId();

                    state._fsp--;

                    stream_typeId.add(ti.getTree());
                    pushFollow(FOLLOW_auxFieldList_in_fieldList1116);
                    auxFieldList75=auxFieldList();

                    state._fsp--;

                    stream_auxFieldList.add(auxFieldList75.getTree());


                    // AST REWRITE
                    // elements: ti, auxFieldList, ID
                    // token labels: 
                    // rule labels: retval, ti
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ti=new RewriteRuleSubtreeStream(adaptor,"rule ti",ti!=null?ti.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 74:43: -> ^( FieldListDP ID $ti auxFieldList )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:74:46: ^( FieldListDP ID $ti auxFieldList )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FieldListDP, "FieldListDP"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_ti.nextTree());
                        adaptor.addChild(root_1, stream_auxFieldList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:75:6: ID '=' ti= typeId auxFieldList
                    {
                    ID76=(Token)match(input,ID,FOLLOW_ID_in_fieldList1136);  
                    stream_ID.add(ID76);

                    char_literal77=(Token)match(input,108,FOLLOW_108_in_fieldList1138);  
                    stream_108.add(char_literal77);

                    pushFollow(FOLLOW_typeId_in_fieldList1142);
                    ti=typeId();

                    state._fsp--;

                    stream_typeId.add(ti.getTree());
                    pushFollow(FOLLOW_auxFieldList_in_fieldList1144);
                    auxFieldList78=auxFieldList();

                    state._fsp--;

                    stream_auxFieldList.add(auxFieldList78.getTree());


                    // AST REWRITE
                    // elements: ti, ID, auxFieldList
                    // token labels: 
                    // rule labels: retval, ti
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ti=new RewriteRuleSubtreeStream(adaptor,"rule ti",ti!=null?ti.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 75:36: -> ^( FieldListEqual ID $ti auxFieldList )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:75:39: ^( FieldListEqual ID $ti auxFieldList )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FieldListEqual, "FieldListEqual"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_ti.nextTree());
                        adaptor.addChild(root_1, stream_auxFieldList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:76:14: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 76:14: -> ^( FieldListEmpty )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:76:17: ^( FieldListEmpty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FieldListEmpty, "FieldListEmpty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldList"

    public static class auxFieldList_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "auxFieldList"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:78:1: auxFieldList : ( intFieldList )* -> ^( AuxFieldList ( intFieldList )* ) ;
    public final RecParser.auxFieldList_return auxFieldList() throws RecognitionException {
        RecParser.auxFieldList_return retval = new RecParser.auxFieldList_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.intFieldList_return intFieldList79 = null;


        RewriteRuleSubtreeStream stream_intFieldList=new RewriteRuleSubtreeStream(adaptor,"rule intFieldList");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:78:13: ( ( intFieldList )* -> ^( AuxFieldList ( intFieldList )* ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:78:15: ( intFieldList )*
            {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:78:15: ( intFieldList )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=131 && LA12_0<=132)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:78:16: intFieldList
            	    {
            	    pushFollow(FOLLOW_intFieldList_in_auxFieldList1187);
            	    intFieldList79=intFieldList();

            	    state._fsp--;

            	    stream_intFieldList.add(intFieldList79.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            // AST REWRITE
            // elements: intFieldList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 78:31: -> ^( AuxFieldList ( intFieldList )* )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:78:34: ^( AuxFieldList ( intFieldList )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(AuxFieldList, "AuxFieldList"), root_1);

                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:78:49: ( intFieldList )*
                while ( stream_intFieldList.hasNext() ) {
                    adaptor.addChild(root_1, stream_intFieldList.nextTree());

                }
                stream_intFieldList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "auxFieldList"

    public static class intFieldList_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "intFieldList"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:80:1: intFieldList : ( ',' ID aux1 -> ^( IntFieldList1 ID aux1 ) | ( '[' e1= exp ']' ( 'of' e2= exp )? -> {e2==null}? ^( IntFieldList2 $e1) -> ^( IntFieldList3 $e1 $e2) ) );
    public final RecParser.intFieldList_return intFieldList() throws RecognitionException {
        RecParser.intFieldList_return retval = new RecParser.intFieldList_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal80=null;
        Token ID81=null;
        Token char_literal83=null;
        Token char_literal84=null;
        Token string_literal85=null;
        RecParser.exp_return e1 = null;

        RecParser.exp_return e2 = null;

        RecParser.aux1_return aux182 = null;


        Tree char_literal80_tree=null;
        Tree ID81_tree=null;
        Tree char_literal83_tree=null;
        Tree char_literal84_tree=null;
        Tree string_literal85_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_aux1=new RewriteRuleSubtreeStream(adaptor,"rule aux1");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:81:4: ( ',' ID aux1 -> ^( IntFieldList1 ID aux1 ) | ( '[' e1= exp ']' ( 'of' e2= exp )? -> {e2==null}? ^( IntFieldList2 $e1) -> ^( IntFieldList3 $e1 $e2) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==131) ) {
                alt14=1;
            }
            else if ( (LA14_0==132) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:81:6: ',' ID aux1
                    {
                    char_literal80=(Token)match(input,131,FOLLOW_131_in_intFieldList1212);  
                    stream_131.add(char_literal80);

                    ID81=(Token)match(input,ID,FOLLOW_ID_in_intFieldList1214);  
                    stream_ID.add(ID81);

                    pushFollow(FOLLOW_aux1_in_intFieldList1216);
                    aux182=aux1();

                    state._fsp--;

                    stream_aux1.add(aux182.getTree());


                    // AST REWRITE
                    // elements: aux1, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 81:23: -> ^( IntFieldList1 ID aux1 )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:81:26: ^( IntFieldList1 ID aux1 )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IntFieldList1, "IntFieldList1"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_aux1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:82:6: ( '[' e1= exp ']' ( 'of' e2= exp )? -> {e2==null}? ^( IntFieldList2 $e1) -> ^( IntFieldList3 $e1 $e2) )
                    {
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:82:6: ( '[' e1= exp ']' ( 'of' e2= exp )? -> {e2==null}? ^( IntFieldList2 $e1) -> ^( IntFieldList3 $e1 $e2) )
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:82:7: '[' e1= exp ']' ( 'of' e2= exp )?
                    {
                    char_literal83=(Token)match(input,132,FOLLOW_132_in_intFieldList1239);  
                    stream_132.add(char_literal83);

                    pushFollow(FOLLOW_exp_in_intFieldList1243);
                    e1=exp();

                    state._fsp--;

                    stream_exp.add(e1.getTree());
                    char_literal84=(Token)match(input,133,FOLLOW_133_in_intFieldList1245);  
                    stream_133.add(char_literal84);

                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:82:22: ( 'of' e2= exp )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==134) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:82:23: 'of' e2= exp
                            {
                            string_literal85=(Token)match(input,134,FOLLOW_134_in_intFieldList1248);  
                            stream_134.add(string_literal85);

                            pushFollow(FOLLOW_exp_in_intFieldList1252);
                            e2=exp();

                            state._fsp--;

                            stream_exp.add(e2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: e1, e2, e1
                    // token labels: 
                    // rule labels: retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 82:37: -> {e2==null}? ^( IntFieldList2 $e1)
                    if (e2==null) {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:82:52: ^( IntFieldList2 $e1)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IntFieldList2, "IntFieldList2"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 83:13: -> ^( IntFieldList3 $e1 $e2)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:83:16: ^( IntFieldList3 $e1 $e2)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IntFieldList3, "IntFieldList3"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "intFieldList"

    public static class aux1_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aux1"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:85:1: aux1 : ( ':' ti= typeId -> ^( Aux11 $ti) | '=' ti= typeId -> ^( Aux12 $ti) );
    public final RecParser.aux1_return aux1() throws RecognitionException {
        RecParser.aux1_return retval = new RecParser.aux1_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal86=null;
        Token char_literal87=null;
        RecParser.typeId_return ti = null;


        Tree char_literal86_tree=null;
        Tree char_literal87_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:85:7: ( ':' ti= typeId -> ^( Aux11 $ti) | '=' ti= typeId -> ^( Aux12 $ti) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==130) ) {
                alt15=1;
            }
            else if ( (LA15_0==108) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:85:9: ':' ti= typeId
                    {
                    char_literal86=(Token)match(input,130,FOLLOW_130_in_aux11302);  
                    stream_130.add(char_literal86);

                    pushFollow(FOLLOW_typeId_in_aux11306);
                    ti=typeId();

                    state._fsp--;

                    stream_typeId.add(ti.getTree());


                    // AST REWRITE
                    // elements: ti
                    // token labels: 
                    // rule labels: retval, ti
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ti=new RewriteRuleSubtreeStream(adaptor,"rule ti",ti!=null?ti.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 85:24: -> ^( Aux11 $ti)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:85:27: ^( Aux11 $ti)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Aux11, "Aux11"), root_1);

                        adaptor.addChild(root_1, stream_ti.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:86:6: '=' ti= typeId
                    {
                    char_literal87=(Token)match(input,108,FOLLOW_108_in_aux11323);  
                    stream_108.add(char_literal87);

                    pushFollow(FOLLOW_typeId_in_aux11327);
                    ti=typeId();

                    state._fsp--;

                    stream_typeId.add(ti.getTree());


                    // AST REWRITE
                    // elements: ti
                    // token labels: 
                    // rule labels: retval, ti
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ti=new RewriteRuleSubtreeStream(adaptor,"rule ti",ti!=null?ti.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 86:21: -> ^( Aux12 $ti)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:86:24: ^( Aux12 $ti)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Aux12, "Aux12"), root_1);

                        adaptor.addChild(root_1, stream_ti.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aux1"

    public static class typeId_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeId"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:88:1: typeId : ( ID -> ^( TypeId ID ) | STRING -> ^( TypeIdString STRING ) | INT -> ^( TypeIdInteger INT ) | 'nil' -> ^( TypeIdNil ) );
    public final RecParser.typeId_return typeId() throws RecognitionException {
        RecParser.typeId_return retval = new RecParser.typeId_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID88=null;
        Token STRING89=null;
        Token INT90=null;
        Token string_literal91=null;

        Tree ID88_tree=null;
        Tree STRING89_tree=null;
        Tree INT90_tree=null;
        Tree string_literal91_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:88:9: ( ID -> ^( TypeId ID ) | STRING -> ^( TypeIdString STRING ) | INT -> ^( TypeIdInteger INT ) | 'nil' -> ^( TypeIdNil ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt16=1;
                }
                break;
            case STRING:
                {
                alt16=2;
                }
                break;
            case INT:
                {
                alt16=3;
                }
                break;
            case 111:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:88:11: ID
                    {
                    ID88=(Token)match(input,ID,FOLLOW_ID_in_typeId1349);  
                    stream_ID.add(ID88);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 88:17: -> ^( TypeId ID )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:88:20: ^( TypeId ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TypeId, "TypeId"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:89:6: STRING
                    {
                    STRING89=(Token)match(input,STRING,FOLLOW_STRING_in_typeId1367);  
                    stream_STRING.add(STRING89);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 89:15: -> ^( TypeIdString STRING )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:89:18: ^( TypeIdString STRING )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TypeIdString, "TypeIdString"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:90:6: INT
                    {
                    INT90=(Token)match(input,INT,FOLLOW_INT_in_typeId1384);  
                    stream_INT.add(INT90);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 90:13: -> ^( TypeIdInteger INT )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:90:16: ^( TypeIdInteger INT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TypeIdInteger, "TypeIdInteger"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:91:6: 'nil'
                    {
                    string_literal91=(Token)match(input,111,FOLLOW_111_in_typeId1402);  
                    stream_111.add(string_literal91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 91:15: -> ^( TypeIdNil )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:91:18: ^( TypeIdNil )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TypeIdNil, "TypeIdNil"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeId"

    public static class varDec_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDec"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:93:1: varDec : ( 'var' ID ( ':' ti= typeId )? aux2 -> {ti==null}? ^( VarDec1 ID aux2 ) -> ^( VarDec2 ID $ti aux2 ) ) ;
    public final RecParser.varDec_return varDec() throws RecognitionException {
        RecParser.varDec_return retval = new RecParser.varDec_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal92=null;
        Token ID93=null;
        Token char_literal94=null;
        RecParser.typeId_return ti = null;

        RecParser.aux2_return aux295 = null;


        Tree string_literal92_tree=null;
        Tree ID93_tree=null;
        Tree char_literal94_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_aux2=new RewriteRuleSubtreeStream(adaptor,"rule aux2");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:93:9: ( ( 'var' ID ( ':' ti= typeId )? aux2 -> {ti==null}? ^( VarDec1 ID aux2 ) -> ^( VarDec2 ID $ti aux2 ) ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:93:11: ( 'var' ID ( ':' ti= typeId )? aux2 -> {ti==null}? ^( VarDec1 ID aux2 ) -> ^( VarDec2 ID $ti aux2 ) )
            {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:93:11: ( 'var' ID ( ':' ti= typeId )? aux2 -> {ti==null}? ^( VarDec1 ID aux2 ) -> ^( VarDec2 ID $ti aux2 ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:93:12: 'var' ID ( ':' ti= typeId )? aux2
            {
            string_literal92=(Token)match(input,135,FOLLOW_135_in_varDec1424);  
            stream_135.add(string_literal92);

            ID93=(Token)match(input,ID,FOLLOW_ID_in_varDec1426);  
            stream_ID.add(ID93);

            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:93:21: ( ':' ti= typeId )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==130) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:93:22: ':' ti= typeId
                    {
                    char_literal94=(Token)match(input,130,FOLLOW_130_in_varDec1429);  
                    stream_130.add(char_literal94);

                    pushFollow(FOLLOW_typeId_in_varDec1433);
                    ti=typeId();

                    state._fsp--;

                    stream_typeId.add(ti.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_aux2_in_varDec1437);
            aux295=aux2();

            state._fsp--;

            stream_aux2.add(aux295.getTree());


            // AST REWRITE
            // elements: aux2, aux2, ID, ID, ti
            // token labels: 
            // rule labels: retval, ti
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ti=new RewriteRuleSubtreeStream(adaptor,"rule ti",ti!=null?ti.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 93:44: -> {ti==null}? ^( VarDec1 ID aux2 )
            if (ti==null) {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:93:59: ^( VarDec1 ID aux2 )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VarDec1, "VarDec1"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_aux2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 94:17: -> ^( VarDec2 ID $ti aux2 )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:94:20: ^( VarDec2 ID $ti aux2 )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VarDec2, "VarDec2"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ti.nextTree());
                adaptor.addChild(root_1, stream_aux2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDec"

    public static class aux2_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aux2"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:96:1: aux2 : ( ':=' exp -> ^( Aux21 exp ) | '=' exp -> ^( Aux22 exp ) );
    public final RecParser.aux2_return aux2() throws RecognitionException {
        RecParser.aux2_return retval = new RecParser.aux2_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal96=null;
        Token char_literal98=null;
        RecParser.exp_return exp97 = null;

        RecParser.exp_return exp99 = null;


        Tree string_literal96_tree=null;
        Tree char_literal98_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:96:7: ( ':=' exp -> ^( Aux21 exp ) | '=' exp -> ^( Aux22 exp ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==117) ) {
                alt18=1;
            }
            else if ( (LA18_0==108) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:96:9: ':=' exp
                    {
                    string_literal96=(Token)match(input,117,FOLLOW_117_in_aux21492);  
                    stream_117.add(string_literal96);

                    pushFollow(FOLLOW_exp_in_aux21494);
                    exp97=exp();

                    state._fsp--;

                    stream_exp.add(exp97.getTree());


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 96:21: -> ^( Aux21 exp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:96:24: ^( Aux21 exp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Aux21, "Aux21"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:97:6: '=' exp
                    {
                    char_literal98=(Token)match(input,108,FOLLOW_108_in_aux21512);  
                    stream_108.add(char_literal98);

                    pushFollow(FOLLOW_exp_in_aux21514);
                    exp99=exp();

                    state._fsp--;

                    stream_exp.add(exp99.getTree());


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 97:18: -> ^( Aux22 exp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:97:21: ^( Aux22 exp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Aux22, "Aux22"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aux2"

    public static class funDec_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funDec"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:99:1: funDec : 'function' ID '(' fieldList ')' ( ':' ti= typeId )? '=' exp -> {ti==null}? ^( FunDec1 ID fieldList exp ) -> ^( FunDec2 ID fieldList $ti exp ) ;
    public final RecParser.funDec_return funDec() throws RecognitionException {
        RecParser.funDec_return retval = new RecParser.funDec_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal100=null;
        Token ID101=null;
        Token char_literal102=null;
        Token char_literal104=null;
        Token char_literal105=null;
        Token char_literal106=null;
        RecParser.typeId_return ti = null;

        RecParser.fieldList_return fieldList103 = null;

        RecParser.exp_return exp107 = null;


        Tree string_literal100_tree=null;
        Tree ID101_tree=null;
        Tree char_literal102_tree=null;
        Tree char_literal104_tree=null;
        Tree char_literal105_tree=null;
        Tree char_literal106_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:99:9: ( 'function' ID '(' fieldList ')' ( ':' ti= typeId )? '=' exp -> {ti==null}? ^( FunDec1 ID fieldList exp ) -> ^( FunDec2 ID fieldList $ti exp ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:99:11: 'function' ID '(' fieldList ')' ( ':' ti= typeId )? '=' exp
            {
            string_literal100=(Token)match(input,136,FOLLOW_136_in_funDec1538);  
            stream_136.add(string_literal100);

            ID101=(Token)match(input,ID,FOLLOW_ID_in_funDec1540);  
            stream_ID.add(ID101);

            char_literal102=(Token)match(input,112,FOLLOW_112_in_funDec1542);  
            stream_112.add(char_literal102);

            pushFollow(FOLLOW_fieldList_in_funDec1544);
            fieldList103=fieldList();

            state._fsp--;

            stream_fieldList.add(fieldList103.getTree());
            char_literal104=(Token)match(input,113,FOLLOW_113_in_funDec1546);  
            stream_113.add(char_literal104);

            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:99:43: ( ':' ti= typeId )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==130) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:99:44: ':' ti= typeId
                    {
                    char_literal105=(Token)match(input,130,FOLLOW_130_in_funDec1549);  
                    stream_130.add(char_literal105);

                    pushFollow(FOLLOW_typeId_in_funDec1553);
                    ti=typeId();

                    state._fsp--;

                    stream_typeId.add(ti.getTree());

                    }
                    break;

            }

            char_literal106=(Token)match(input,108,FOLLOW_108_in_funDec1557);  
            stream_108.add(char_literal106);

            pushFollow(FOLLOW_exp_in_funDec1559);
            exp107=exp();

            state._fsp--;

            stream_exp.add(exp107.getTree());


            // AST REWRITE
            // elements: fieldList, exp, exp, ti, fieldList, ID, ID
            // token labels: 
            // rule labels: retval, ti
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ti=new RewriteRuleSubtreeStream(adaptor,"rule ti",ti!=null?ti.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 99:68: -> {ti==null}? ^( FunDec1 ID fieldList exp )
            if (ti==null) {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:99:83: ^( FunDec1 ID fieldList exp )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FunDec1, "FunDec1"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_fieldList.nextTree());
                adaptor.addChild(root_1, stream_exp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 100:22: -> ^( FunDec2 ID fieldList $ti exp )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:100:25: ^( FunDec2 ID fieldList $ti exp )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FunDec2, "FunDec2"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_fieldList.nextTree());
                adaptor.addChild(root_1, stream_ti.nextTree());
                adaptor.addChild(root_1, stream_exp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funDec"

    public static class lValue_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lValue"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:102:1: lValue : ID fra= functionRecordArray -> ^( LValue ID $fra) ;
    public final RecParser.lValue_return lValue() throws RecognitionException {
        RecParser.lValue_return retval = new RecParser.lValue_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID108=null;
        RecParser.functionRecordArray_return fra = null;


        Tree ID108_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_functionRecordArray=new RewriteRuleSubtreeStream(adaptor,"rule functionRecordArray");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:102:9: ( ID fra= functionRecordArray -> ^( LValue ID $fra) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:102:11: ID fra= functionRecordArray
            {
            ID108=(Token)match(input,ID,FOLLOW_ID_in_lValue1621);  
            stream_ID.add(ID108);

            pushFollow(FOLLOW_functionRecordArray_in_lValue1625);
            fra=functionRecordArray();

            state._fsp--;

            stream_functionRecordArray.add(fra.getTree());


            // AST REWRITE
            // elements: ID, fra
            // token labels: 
            // rule labels: retval, fra
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_fra=new RewriteRuleSubtreeStream(adaptor,"rule fra",fra!=null?fra.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 102:38: -> ^( LValue ID $fra)
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:102:41: ^( LValue ID $fra)
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(LValue, "LValue"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_fra.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lValue"

    public static class functionRecordArray_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionRecordArray"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:105:1: functionRecordArray : ( '(' argList ')' -> ^( FRAArgList argList ) | '{' fieldList '}' -> ^( FRAFieldList fieldList ) | ( (a1= auxFRA1 )? (a2= auxFRA2 )? -> {a1!=null && a2==null}? ^( FRA1 $a1) -> {a1==null && a2!=null}? ^( FRA2 $a2) -> {a1!=null && a2!=null}? ^( FRA3 $a1 $a2) -> ^( FunctionRecordArrayEmpty ) ) );
    public final RecParser.functionRecordArray_return functionRecordArray() throws RecognitionException {
        RecParser.functionRecordArray_return retval = new RecParser.functionRecordArray_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal109=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        RecParser.auxFRA1_return a1 = null;

        RecParser.auxFRA2_return a2 = null;

        RecParser.argList_return argList110 = null;

        RecParser.fieldList_return fieldList113 = null;


        Tree char_literal109_tree=null;
        Tree char_literal111_tree=null;
        Tree char_literal112_tree=null;
        Tree char_literal114_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        RewriteRuleSubtreeStream stream_auxFRA1=new RewriteRuleSubtreeStream(adaptor,"rule auxFRA1");
        RewriteRuleSubtreeStream stream_auxFRA2=new RewriteRuleSubtreeStream(adaptor,"rule auxFRA2");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:106:4: ( '(' argList ')' -> ^( FRAArgList argList ) | '{' fieldList '}' -> ^( FRAFieldList fieldList ) | ( (a1= auxFRA1 )? (a2= auxFRA2 )? -> {a1!=null && a2==null}? ^( FRA1 $a1) -> {a1==null && a2!=null}? ^( FRA2 $a2) -> {a1!=null && a2!=null}? ^( FRA3 $a1 $a2) -> ^( FunctionRecordArrayEmpty ) ) )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:106:6: '(' argList ')'
                    {
                    char_literal109=(Token)match(input,112,FOLLOW_112_in_functionRecordArray1651);  
                    stream_112.add(char_literal109);

                    pushFollow(FOLLOW_argList_in_functionRecordArray1653);
                    argList110=argList();

                    state._fsp--;

                    stream_argList.add(argList110.getTree());
                    char_literal111=(Token)match(input,113,FOLLOW_113_in_functionRecordArray1655);  
                    stream_113.add(char_literal111);



                    // AST REWRITE
                    // elements: argList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 106:24: -> ^( FRAArgList argList )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:106:27: ^( FRAArgList argList )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FRAArgList, "FRAArgList"), root_1);

                        adaptor.addChild(root_1, stream_argList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:107:6: '{' fieldList '}'
                    {
                    char_literal112=(Token)match(input,127,FOLLOW_127_in_functionRecordArray1672);  
                    stream_127.add(char_literal112);

                    pushFollow(FOLLOW_fieldList_in_functionRecordArray1674);
                    fieldList113=fieldList();

                    state._fsp--;

                    stream_fieldList.add(fieldList113.getTree());
                    char_literal114=(Token)match(input,128,FOLLOW_128_in_functionRecordArray1676);  
                    stream_128.add(char_literal114);



                    // AST REWRITE
                    // elements: fieldList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 107:26: -> ^( FRAFieldList fieldList )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:107:29: ^( FRAFieldList fieldList )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FRAFieldList, "FRAFieldList"), root_1);

                        adaptor.addChild(root_1, stream_fieldList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:108:6: ( (a1= auxFRA1 )? (a2= auxFRA2 )? -> {a1!=null && a2==null}? ^( FRA1 $a1) -> {a1==null && a2!=null}? ^( FRA2 $a2) -> {a1!=null && a2!=null}? ^( FRA3 $a1 $a2) -> ^( FunctionRecordArrayEmpty ) )
                    {
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:108:6: ( (a1= auxFRA1 )? (a2= auxFRA2 )? -> {a1!=null && a2==null}? ^( FRA1 $a1) -> {a1==null && a2!=null}? ^( FRA2 $a2) -> {a1!=null && a2!=null}? ^( FRA3 $a1 $a2) -> ^( FunctionRecordArrayEmpty ) )
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:108:7: (a1= auxFRA1 )? (a2= auxFRA2 )?
                    {
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:108:7: (a1= auxFRA1 )?
                    int alt20=2;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:108:8: a1= auxFRA1
                            {
                            pushFollow(FOLLOW_auxFRA1_in_functionRecordArray1697);
                            a1=auxFRA1();

                            state._fsp--;

                            stream_auxFRA1.add(a1.getTree());

                            }
                            break;

                    }

                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:108:21: (a2= auxFRA2 )?
                    int alt21=2;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:108:22: a2= auxFRA2
                            {
                            pushFollow(FOLLOW_auxFRA2_in_functionRecordArray1704);
                            a2=auxFRA2();

                            state._fsp--;

                            stream_auxFRA2.add(a2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: a1, a2, a2, a1
                    // token labels: 
                    // rule labels: retval, a1, a2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.tree:null);
                    RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 108:35: -> {a1!=null && a2==null}? ^( FRA1 $a1)
                    if (a1!=null && a2==null) {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:108:62: ^( FRA1 $a1)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FRA1, "FRA1"), root_1);

                        adaptor.addChild(root_1, stream_a1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 109:12: -> {a1==null && a2!=null}? ^( FRA2 $a2)
                    if (a1==null && a2!=null) {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:109:39: ^( FRA2 $a2)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FRA2, "FRA2"), root_1);

                        adaptor.addChild(root_1, stream_a2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 110:12: -> {a1!=null && a2!=null}? ^( FRA3 $a1 $a2)
                    if (a1!=null && a2!=null) {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:110:39: ^( FRA3 $a1 $a2)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FRA3, "FRA3"), root_1);

                        adaptor.addChild(root_1, stream_a1.nextTree());
                        adaptor.addChild(root_1, stream_a2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 111:12: -> ^( FunctionRecordArrayEmpty )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:111:15: ^( FunctionRecordArrayEmpty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FunctionRecordArrayEmpty, "FunctionRecordArrayEmpty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionRecordArray"

    public static class auxFRA1_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "auxFRA1"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:113:1: auxFRA1 : '[' exp ']' -> ^( AuxFRA1 exp ) ;
    public final RecParser.auxFRA1_return auxFRA1() throws RecognitionException {
        RecParser.auxFRA1_return retval = new RecParser.auxFRA1_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal115=null;
        Token char_literal117=null;
        RecParser.exp_return exp116 = null;


        Tree char_literal115_tree=null;
        Tree char_literal117_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:113:10: ( '[' exp ']' -> ^( AuxFRA1 exp ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:113:12: '[' exp ']'
            {
            char_literal115=(Token)match(input,132,FOLLOW_132_in_auxFRA11794);  
            stream_132.add(char_literal115);

            pushFollow(FOLLOW_exp_in_auxFRA11796);
            exp116=exp();

            state._fsp--;

            stream_exp.add(exp116.getTree());
            char_literal117=(Token)match(input,133,FOLLOW_133_in_auxFRA11798);  
            stream_133.add(char_literal117);



            // AST REWRITE
            // elements: exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 113:25: -> ^( AuxFRA1 exp )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:113:28: ^( AuxFRA1 exp )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(AuxFRA1, "AuxFRA1"), root_1);

                adaptor.addChild(root_1, stream_exp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "auxFRA1"

    public static class auxFRA2_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "auxFRA2"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:115:1: auxFRA2 : ( 'of' exp -> ^( AuxFRA21 exp ) | (a3= aux3 (a4= aux4 )? ':=' e2= exp -> {a4==null}? ^( AuxFRA22 $a3 $e2) -> ^( AuxFRA23 $a3 $a4 $e2) ) | a4= aux4 ':=' e2= exp -> ^( AuxFRA24 $a4 $e2) );
    public final RecParser.auxFRA2_return auxFRA2() throws RecognitionException {
        RecParser.auxFRA2_return retval = new RecParser.auxFRA2_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal118=null;
        Token string_literal120=null;
        Token string_literal121=null;
        RecParser.aux3_return a3 = null;

        RecParser.aux4_return a4 = null;

        RecParser.exp_return e2 = null;

        RecParser.exp_return exp119 = null;


        Tree string_literal118_tree=null;
        Tree string_literal120_tree=null;
        Tree string_literal121_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_aux4=new RewriteRuleSubtreeStream(adaptor,"rule aux4");
        RewriteRuleSubtreeStream stream_aux3=new RewriteRuleSubtreeStream(adaptor,"rule aux3");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:115:10: ( 'of' exp -> ^( AuxFRA21 exp ) | (a3= aux3 (a4= aux4 )? ':=' e2= exp -> {a4==null}? ^( AuxFRA22 $a3 $e2) -> ^( AuxFRA23 $a3 $a4 $e2) ) | a4= aux4 ':=' e2= exp -> ^( AuxFRA24 $a4 $e2) )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:115:12: 'of' exp
                    {
                    string_literal118=(Token)match(input,134,FOLLOW_134_in_auxFRA21819);  
                    stream_134.add(string_literal118);

                    pushFollow(FOLLOW_exp_in_auxFRA21821);
                    exp119=exp();

                    state._fsp--;

                    stream_exp.add(exp119.getTree());


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 115:27: -> ^( AuxFRA21 exp )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:115:30: ^( AuxFRA21 exp )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(AuxFRA21, "AuxFRA21"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:116:6: (a3= aux3 (a4= aux4 )? ':=' e2= exp -> {a4==null}? ^( AuxFRA22 $a3 $e2) -> ^( AuxFRA23 $a3 $a4 $e2) )
                    {
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:116:6: (a3= aux3 (a4= aux4 )? ':=' e2= exp -> {a4==null}? ^( AuxFRA22 $a3 $e2) -> ^( AuxFRA23 $a3 $a4 $e2) )
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:116:7: a3= aux3 (a4= aux4 )? ':=' e2= exp
                    {
                    pushFollow(FOLLOW_aux3_in_auxFRA21845);
                    a3=aux3();

                    state._fsp--;

                    stream_aux3.add(a3.getTree());
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:116:15: (a4= aux4 )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==132) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==117) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:116:16: a4= aux4
                            {
                            pushFollow(FOLLOW_aux4_in_auxFRA21850);
                            a4=aux4();

                            state._fsp--;

                            stream_aux4.add(a4.getTree());

                            }
                            break;

                    }

                    string_literal120=(Token)match(input,117,FOLLOW_117_in_auxFRA21854);  
                    stream_117.add(string_literal120);

                    pushFollow(FOLLOW_exp_in_auxFRA21858);
                    e2=exp();

                    state._fsp--;

                    stream_exp.add(e2.getTree());


                    // AST REWRITE
                    // elements: a3, a4, a3, e2, e2
                    // token labels: 
                    // rule labels: retval, e2, a3, a4
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);
                    RewriteRuleSubtreeStream stream_a3=new RewriteRuleSubtreeStream(adaptor,"rule a3",a3!=null?a3.tree:null);
                    RewriteRuleSubtreeStream stream_a4=new RewriteRuleSubtreeStream(adaptor,"rule a4",a4!=null?a4.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 116:38: -> {a4==null}? ^( AuxFRA22 $a3 $e2)
                    if (a4==null) {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:116:53: ^( AuxFRA22 $a3 $e2)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(AuxFRA22, "AuxFRA22"), root_1);

                        adaptor.addChild(root_1, stream_a3.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 117:13: -> ^( AuxFRA23 $a3 $a4 $e2)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:117:16: ^( AuxFRA23 $a3 $a4 $e2)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(AuxFRA23, "AuxFRA23"), root_1);

                        adaptor.addChild(root_1, stream_a3.nextTree());
                        adaptor.addChild(root_1, stream_a4.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 3 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:118:6: a4= aux4 ':=' e2= exp
                    {
                    pushFollow(FOLLOW_aux4_in_auxFRA21909);
                    a4=aux4();

                    state._fsp--;

                    stream_aux4.add(a4.getTree());
                    string_literal121=(Token)match(input,117,FOLLOW_117_in_auxFRA21911);  
                    stream_117.add(string_literal121);

                    pushFollow(FOLLOW_exp_in_auxFRA21915);
                    e2=exp();

                    state._fsp--;

                    stream_exp.add(e2.getTree());


                    // AST REWRITE
                    // elements: e2, a4
                    // token labels: 
                    // rule labels: retval, e2, a4
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);
                    RewriteRuleSubtreeStream stream_a4=new RewriteRuleSubtreeStream(adaptor,"rule a4",a4!=null?a4.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 118:29: -> ^( AuxFRA24 $a4 $e2)
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:118:32: ^( AuxFRA24 $a4 $e2)
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(AuxFRA24, "AuxFRA24"), root_1);

                        adaptor.addChild(root_1, stream_a4.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "auxFRA2"

    public static class aux3_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aux3"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:120:1: aux3 : ( '.' ID )* -> ^( Aux3 ( ID )* ) ;
    public final RecParser.aux3_return aux3() throws RecognitionException {
        RecParser.aux3_return retval = new RecParser.aux3_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal122=null;
        Token ID123=null;

        Tree char_literal122_tree=null;
        Tree ID123_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:120:7: ( ( '.' ID )* -> ^( Aux3 ( ID )* ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:120:9: ( '.' ID )*
            {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:120:9: ( '.' ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==137) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:120:10: '.' ID
            	    {
            	    char_literal122=(Token)match(input,137,FOLLOW_137_in_aux31943);  
            	    stream_137.add(char_literal122);

            	    ID123=(Token)match(input,ID,FOLLOW_ID_in_aux31945);  
            	    stream_ID.add(ID123);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 120:21: -> ^( Aux3 ( ID )* )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:120:24: ^( Aux3 ( ID )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Aux3, "Aux3"), root_1);

                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:120:31: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aux3"

    public static class aux4_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aux4"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:122:1: aux4 : ( '[' exp ']' )* -> ^( Aux4 ( exp )* ) ;
    public final RecParser.aux4_return aux4() throws RecognitionException {
        RecParser.aux4_return retval = new RecParser.aux4_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal124=null;
        Token char_literal126=null;
        RecParser.exp_return exp125 = null;


        Tree char_literal124_tree=null;
        Tree char_literal126_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:122:7: ( ( '[' exp ']' )* -> ^( Aux4 ( exp )* ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:122:9: ( '[' exp ']' )*
            {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:122:9: ( '[' exp ']' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==132) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:122:10: '[' exp ']'
            	    {
            	    char_literal124=(Token)match(input,132,FOLLOW_132_in_aux41971);  
            	    stream_132.add(char_literal124);

            	    pushFollow(FOLLOW_exp_in_aux41973);
            	    exp125=exp();

            	    state._fsp--;

            	    stream_exp.add(exp125.getTree());
            	    char_literal126=(Token)match(input,133,FOLLOW_133_in_aux41975);  
            	    stream_133.add(char_literal126);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // AST REWRITE
            // elements: exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 122:24: -> ^( Aux4 ( exp )* )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:122:27: ^( Aux4 ( exp )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Aux4, "Aux4"), root_1);

                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:122:34: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_1, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aux4"

    public static class expList_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expList"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:124:1: expList : ( exp auxExpList -> ^( ExpList exp auxExpList ) | -> ^( ExpListEmpty ) );
    public final RecParser.expList_return expList() throws RecognitionException {
        RecParser.expList_return retval = new RecParser.expList_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.exp_return exp127 = null;

        RecParser.auxExpList_return auxExpList128 = null;


        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_auxExpList=new RewriteRuleSubtreeStream(adaptor,"rule auxExpList");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:124:10: ( exp auxExpList -> ^( ExpList exp auxExpList ) | -> ^( ExpListEmpty ) )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:124:12: exp auxExpList
                    {
                    pushFollow(FOLLOW_exp_in_expList1998);
                    exp127=exp();

                    state._fsp--;

                    stream_exp.add(exp127.getTree());
                    pushFollow(FOLLOW_auxExpList_in_expList2000);
                    auxExpList128=auxExpList();

                    state._fsp--;

                    stream_auxExpList.add(auxExpList128.getTree());


                    // AST REWRITE
                    // elements: auxExpList, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 124:27: -> ^( ExpList exp auxExpList )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:124:30: ^( ExpList exp auxExpList )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpList, "ExpList"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());
                        adaptor.addChild(root_1, stream_auxExpList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:125:11: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 125:11: -> ^( ExpListEmpty )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:125:14: ^( ExpListEmpty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpListEmpty, "ExpListEmpty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expList"

    public static class auxExpList_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "auxExpList"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:127:1: auxExpList : ( ';' exp )* -> ^( AuxExpList ( exp )* ) ;
    public final RecParser.auxExpList_return auxExpList() throws RecognitionException {
        RecParser.auxExpList_return retval = new RecParser.auxExpList_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal129=null;
        RecParser.exp_return exp130 = null;


        Tree char_literal129_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:127:13: ( ( ';' exp )* -> ^( AuxExpList ( exp )* ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:127:15: ( ';' exp )*
            {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:127:15: ( ';' exp )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==138) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:127:16: ';' exp
            	    {
            	    char_literal129=(Token)match(input,138,FOLLOW_138_in_auxExpList2039);  
            	    stream_138.add(char_literal129);

            	    pushFollow(FOLLOW_exp_in_auxExpList2041);
            	    exp130=exp();

            	    state._fsp--;

            	    stream_exp.add(exp130.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);



            // AST REWRITE
            // elements: exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 127:27: -> ^( AuxExpList ( exp )* )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:127:30: ^( AuxExpList ( exp )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(AuxExpList, "AuxExpList"), root_1);

                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:127:43: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_1, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "auxExpList"

    public static class argList_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argList"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:129:1: argList : ( exp auxArgList -> ^( ArgList exp auxArgList ) | -> ^( ArgListEmpty ) );
    public final RecParser.argList_return argList() throws RecognitionException {
        RecParser.argList_return retval = new RecParser.argList_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RecParser.exp_return exp131 = null;

        RecParser.auxArgList_return auxArgList132 = null;


        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_auxArgList=new RewriteRuleSubtreeStream(adaptor,"rule auxArgList");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:129:10: ( exp auxArgList -> ^( ArgList exp auxArgList ) | -> ^( ArgListEmpty ) )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:129:12: exp auxArgList
                    {
                    pushFollow(FOLLOW_exp_in_argList2065);
                    exp131=exp();

                    state._fsp--;

                    stream_exp.add(exp131.getTree());
                    pushFollow(FOLLOW_auxArgList_in_argList2067);
                    auxArgList132=auxArgList();

                    state._fsp--;

                    stream_auxArgList.add(auxArgList132.getTree());


                    // AST REWRITE
                    // elements: auxArgList, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 129:27: -> ^( ArgList exp auxArgList )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:129:30: ^( ArgList exp auxArgList )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ArgList, "ArgList"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());
                        adaptor.addChild(root_1, stream_auxArgList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:130:11: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 130:11: -> ^( ArgListEmpty )
                    {
                        // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:130:14: ^( ArgListEmpty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ArgListEmpty, "ArgListEmpty"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argList"

    public static class auxArgList_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "auxArgList"
    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:132:1: auxArgList : ( ',' exp )* -> ^( AuxArgList ( exp )* ) ;
    public final RecParser.auxArgList_return auxArgList() throws RecognitionException {
        RecParser.auxArgList_return retval = new RecParser.auxArgList_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal133=null;
        RecParser.exp_return exp134 = null;


        Tree char_literal133_tree=null;
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:132:12: ( ( ',' exp )* -> ^( AuxArgList ( exp )* ) )
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:132:14: ( ',' exp )*
            {
            // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:132:14: ( ',' exp )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==131) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:132:15: ',' exp
            	    {
            	    char_literal133=(Token)match(input,131,FOLLOW_131_in_auxArgList2105);  
            	    stream_131.add(char_literal133);

            	    pushFollow(FOLLOW_exp_in_auxArgList2107);
            	    exp134=exp();

            	    state._fsp--;

            	    stream_exp.add(exp134.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);



            // AST REWRITE
            // elements: exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 132:26: -> ^( AuxArgList ( exp )* )
            {
                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:132:29: ^( AuxArgList ( exp )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(AuxArgList, "AuxArgList"), root_1);

                // C:\\RaFaeL\\Dropbox\\UNIVERSIDADE\\Mestrado\\[ACS] Análise e Concepção de Software\\[ATS] Análise e Transformação de Software\\Tiger\\parser\\src\\parser\\Rec.g:132:42: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_1, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "auxArgList"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA1_eotS =
        "\35\uffff";
    static final String DFA1_eofS =
        "\1\2\34\uffff";
    static final String DFA1_minS =
        "\1\143\34\uffff";
    static final String DFA1_maxS =
        "\1\u008a\34\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\32\uffff";
    static final String DFA1_specialS =
        "\35\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\13\2\2\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\2\2\1"+
            "\uffff\3\2\1\uffff\1\2\2\uffff\3\2\1\uffff\2\2\1\uffff\1\2",
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
            return "23:1: expORPr : ( '|' exp -> ^( ExpORPr exp ) | -> ^( ExpORPrEmpty ) );";
        }
    }
    static final String DFA2_eotS =
        "\35\uffff";
    static final String DFA2_eofS =
        "\1\2\34\uffff";
    static final String DFA2_minS =
        "\1\143\34\uffff";
    static final String DFA2_maxS =
        "\1\u008a\34\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\32\uffff";
    static final String DFA2_specialS =
        "\35\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\1\12\2\2\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\2"+
            "\2\1\uffff\3\2\1\uffff\1\2\2\uffff\3\2\1\uffff\2\2\1\uffff\1"+
            "\2",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "26:1: expANDPr : ( '&' exp -> ^( ExpANDPr exp ) | -> ^( ExpANDPrEmpty ) );";
        }
    }
    static final String DFA3_eotS =
        "\35\uffff";
    static final String DFA3_eofS =
        "\1\6\34\uffff";
    static final String DFA3_minS =
        "\1\143\34\uffff";
    static final String DFA3_maxS =
        "\1\u008a\34\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\26\uffff";
    static final String DFA3_specialS =
        "\35\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\6\1\1\1\2\1\3\1\4\1\5\5\6\2\uffff\1\6\1\uffff\1\6\2\uffff"+
            "\1\6\2\uffff\2\6\1\uffff\3\6\1\uffff\1\6\2\uffff\3\6\1\uffff"+
            "\2\6\1\uffff\1\6",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "31:1: relExp : ( '<' aritExp -> ^( RelExpLess aritExp ) | '>' aritExp -> ^( RelExpMore aritExp ) | '<>' aritExp -> ^( RelExpDiferent aritExp ) | '<=' aritExp -> ^( RelExpLessEqual aritExp ) | '>=' aritExp -> ^( RelExpMoreEqual aritExp ) | -> ^( RelExpEmpty ) );";
        }
    }
    static final String DFA4_eotS =
        "\35\uffff";
    static final String DFA4_eofS =
        "\1\4\34\uffff";
    static final String DFA4_minS =
        "\1\143\34\uffff";
    static final String DFA4_maxS =
        "\1\u008a\34\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\30\uffff";
    static final String DFA4_specialS =
        "\35\uffff}>";
    static final String[] DFA4_transitionS = {
            "\7\4\1\1\1\2\1\3\2\4\2\uffff\1\4\1\uffff\1\4\2\uffff\1\4\2"+
            "\uffff\2\4\1\uffff\3\4\1\uffff\1\4\2\uffff\3\4\1\uffff\2\4\1"+
            "\uffff\1\4",
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
            "",
            "",
            "",
            ""
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
            return "40:1: termPr : ( '+' term termPr -> ^( TermPrPlus term termPr ) | '-' term termPr -> ^( TermPrNeg term termPr ) | '=' term termPr -> ^( TermPrEqual term termPr ) | -> ^( TermPrEmpty ) );";
        }
    }
    static final String DFA5_eotS =
        "\35\uffff";
    static final String DFA5_eofS =
        "\1\3\34\uffff";
    static final String DFA5_minS =
        "\1\143\34\uffff";
    static final String DFA5_maxS =
        "\1\u008a\34\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\31\uffff";
    static final String DFA5_specialS =
        "\35\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\3\1\1\1\2\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\2"+
            "\3\1\uffff\3\3\1\uffff\1\3\2\uffff\3\3\1\uffff\2\3\1\uffff\1"+
            "\3",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "45:1: factorPr : ( '*' factor factorPr -> ^( Times factor factorPr ) | '/' factor factorPr -> ^( Div factor factorPr ) | -> ^( FactorPrEmpty ) );";
        }
    }
    static final String DFA7_eotS =
        "\14\uffff";
    static final String DFA7_eofS =
        "\14\uffff";
    static final String DFA7_minS =
        "\1\134\13\uffff";
    static final String DFA7_maxS =
        "\1\173\13\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA7_specialS =
        "\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\3\1\12\14\uffff\1\5\3\uffff\1\1\1\4\1\uffff\1\6\1\uffff"+
            "\1\7\2\uffff\1\10\1\11\2\uffff\1\13",
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
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "49:1: factor : ( 'nil' -> ^( FNil ) | INT -> ^( FInteger INT ) | STRING -> ^( FString STRING ) | '(' expList ')' -> ^( FExpList expList ) | '-' exp -> ^( FNeg exp ) | 'while' e1= exp 'do' e2= exp -> ^( FWhile $e1 $e2) | 'for' ID ':=' e1= exp 'to' e2= exp 'do' e3= exp -> ^( FFor ID $e1 $e2 $e3) | 'break' -> ^( FBreak ) | 'let' decList 'in' expList 'end' -> ^( FLet decList expList ) | lv= lValue -> ^( FLvalue $lv) | ( 'if' e1= exp 'then' e2= exp ( 'else' e3= exp )? -> {e3==null}? ^( FIfThen $e1 $e2) -> ^( FIfThenElse $e1 $e2 $e3) ) );";
        }
    }
    static final String DFA6_eotS =
        "\35\uffff";
    static final String DFA6_eofS =
        "\1\2\34\uffff";
    static final String DFA6_minS =
        "\1\143\34\uffff";
    static final String DFA6_maxS =
        "\1\u008a\34\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\32\uffff";
    static final String DFA6_specialS =
        "\35\uffff}>";
    static final String[] DFA6_transitionS = {
            "\14\2\2\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\2\2\1\uffff"+
            "\1\2\1\1\1\2\1\uffff\1\2\2\uffff\3\2\1\uffff\2\2\1\uffff\1\2",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "59:33: ( 'else' e3= exp )?";
        }
    }
    static final String DFA22_eotS =
        "\42\uffff";
    static final String DFA22_eofS =
        "\1\3\41\uffff";
    static final String DFA22_minS =
        "\1\143\41\uffff";
    static final String DFA22_maxS =
        "\1\u008a\41\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\36\uffff";
    static final String DFA22_specialS =
        "\42\uffff}>";
    static final String[] DFA22_transitionS = {
            "\14\3\1\uffff\1\1\1\3\1\uffff\1\3\1\uffff\2\3\2\uffff\2\3\1"+
            "\uffff\3\3\1\2\1\3\2\uffff\10\3",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "105:1: functionRecordArray : ( '(' argList ')' -> ^( FRAArgList argList ) | '{' fieldList '}' -> ^( FRAFieldList fieldList ) | ( (a1= auxFRA1 )? (a2= auxFRA2 )? -> {a1!=null && a2==null}? ^( FRA1 $a1) -> {a1==null && a2!=null}? ^( FRA2 $a2) -> {a1!=null && a2!=null}? ^( FRA3 $a1 $a2) -> ^( FunctionRecordArrayEmpty ) ) );";
        }
    }
    static final String DFA20_eotS =
        "\53\uffff";
    static final String DFA20_eofS =
        "\1\2\52\uffff";
    static final String DFA20_minS =
        "\1\143\1\134\51\uffff";
    static final String DFA20_maxS =
        "\1\u008a\1\173\51\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\35\uffff\13\1";
    static final String DFA20_specialS =
        "\53\uffff}>";
    static final String[] DFA20_transitionS = {
            "\14\2\2\uffff\1\2\1\uffff\1\2\1\uffff\2\2\2\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\1\2\2\uffff\1\2\1\1\6\2",
            "\1\41\1\42\1\51\14\uffff\1\44\3\uffff\1\40\1\43\1\uffff\1"+
            "\45\1\uffff\1\46\2\uffff\1\47\1\50\2\uffff\1\52",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "108:7: (a1= auxFRA1 )?";
        }
    }
    static final String DFA21_eotS =
        "\53\uffff";
    static final String DFA21_eofS =
        "\1\5\52\uffff";
    static final String DFA21_minS =
        "\1\143\2\uffff\1\134\47\uffff";
    static final String DFA21_maxS =
        "\1\u008a\2\uffff\1\173\47\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\32\uffff\13\1";
    static final String DFA21_specialS =
        "\53\uffff}>";
    static final String[] DFA21_transitionS = {
            "\14\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\1\1\5\2\uffff\2\5\1"+
            "\uffff\3\5\1\uffff\1\5\2\uffff\1\5\1\3\1\5\1\1\2\5\1\1\1\5",
            "",
            "",
            "\1\41\1\42\1\51\14\uffff\1\44\3\uffff\1\40\1\43\1\uffff\1"+
            "\45\1\uffff\1\46\2\uffff\1\47\1\50\2\uffff\1\52",
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
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "108:21: (a2= auxFRA2 )?";
        }
    }
    static final String DFA24_eotS =
        "\33\uffff";
    static final String DFA24_eofS =
        "\33\uffff";
    static final String DFA24_minS =
        "\1\165\2\uffff\2\134\26\uffff";
    static final String DFA24_maxS =
        "\1\u0089\2\uffff\2\173\26\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\26\2";
    static final String DFA24_specialS =
        "\33\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\4\16\uffff\1\3\1\uffff\1\1\2\uffff\1\2",
            "",
            "",
            "\1\6\1\7\1\16\14\uffff\1\11\3\uffff\1\5\1\10\1\uffff\1\12"+
            "\1\uffff\1\13\2\uffff\1\14\1\15\2\uffff\1\17",
            "\1\21\1\22\1\31\14\uffff\1\24\3\uffff\1\20\1\23\1\uffff\1"+
            "\25\1\uffff\1\26\2\uffff\1\27\1\30\2\uffff\1\32",
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "115:1: auxFRA2 : ( 'of' exp -> ^( AuxFRA21 exp ) | (a3= aux3 (a4= aux4 )? ':=' e2= exp -> {a4==null}? ^( AuxFRA22 $a3 $e2) -> ^( AuxFRA23 $a3 $a4 $e2) ) | a4= aux4 ':=' e2= exp -> ^( AuxFRA24 $a4 $e2) );";
        }
    }
    static final String DFA27_eotS =
        "\16\uffff";
    static final String DFA27_eofS =
        "\16\uffff";
    static final String DFA27_minS =
        "\1\134\15\uffff";
    static final String DFA27_maxS =
        "\1\173\15\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\12\uffff\1\2\1\uffff";
    static final String DFA27_specialS =
        "\16\uffff}>";
    static final String[] DFA27_transitionS = {
            "\3\1\14\uffff\1\1\3\uffff\2\1\1\14\1\1\1\uffff\1\1\2\uffff"+
            "\2\1\1\uffff\1\14\1\1",
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
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "124:1: expList : ( exp auxExpList -> ^( ExpList exp auxExpList ) | -> ^( ExpListEmpty ) );";
        }
    }
    static final String DFA29_eotS =
        "\15\uffff";
    static final String DFA29_eofS =
        "\15\uffff";
    static final String DFA29_minS =
        "\1\134\14\uffff";
    static final String DFA29_maxS =
        "\1\173\14\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA29_specialS =
        "\15\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\1\14\uffff\1\1\3\uffff\2\1\1\14\1\1\1\uffff\1\1\2\uffff"+
            "\2\1\2\uffff\1\1",
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
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "129:1: argList : ( exp auxArgList -> ^( ArgList exp auxArgList ) | -> ^( ArgListEmpty ) );";
        }
    }
 

    public static final BitSet FOLLOW_exp_in_prog57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expOR_in_exp82 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_expORPr_in_exp86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expAND_in_expOR113 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_expANDPr_in_expOR117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aritExp_in_expAND142 = new BitSet(new long[]{0x0000000000000000L,0x000003E000000000L});
    public static final BitSet FOLLOW_relExp_in_expAND144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_expORPr167 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_expORPr169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_expANDPr211 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_expANDPr213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_aritExp250 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_termPr_in_aritExp252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_relExp276 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_aritExp_in_relExp278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_relExp294 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_aritExp_in_relExp296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_relExp312 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_aritExp_in_relExp314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_relExp330 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_aritExp_in_relExp332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_relExp348 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_aritExp_in_relExp350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term388 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_factorPr_in_term390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_termPr412 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_term_in_termPr414 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_termPr_in_termPr416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_termPr433 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_term_in_termPr435 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_termPr_in_termPr437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_termPr454 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_term_in_termPr456 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_termPr_in_termPr458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_factorPr495 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_factor_in_factorPr497 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_factorPr_in_factorPr499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_factorPr517 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_factor_in_factorPr519 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_factorPr_in_factorPr521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_factor561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_factor636 = new BitSet(new long[]{0x0000000000000000L,0x0997880070000000L});
    public static final BitSet FOLLOW_expList_in_factor638 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_factor640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_factor663 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_factor665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_factor690 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_factor694 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_factor696 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_factor700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_factor724 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_factor726 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_factor728 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_factor732 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_factor734 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_factor738 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_factor740 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_factor744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_factor769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_factor792 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_decList_in_factor794 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_factor796 = new BitSet(new long[]{0x0000000000000000L,0x0D95880070000000L});
    public static final BitSet FOLLOW_expList_in_factor798 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_factor800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lValue_in_factor823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_factor850 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_factor854 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_factor856 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_factor860 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_factor863 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_factor867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_in_decList928 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_tyDec_in_dec955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDec_in_dec973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funDec_in_dec990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_tyDec1012 = new BitSet(new long[]{0x0000000000000000L,0x0000800070000000L});
    public static final BitSet FOLLOW_typeId_in_tyDec1014 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_tyDec1016 = new BitSet(new long[]{0x0000000000000000L,0x8000800070000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ty_in_tyDec1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ty1042 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fieldList_in_ty1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ty1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ty1062 = new BitSet(new long[]{0x0000000000000000L,0x0000800070000000L});
    public static final BitSet FOLLOW_typeId_in_ty1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_ty1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fieldList1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_fieldList1110 = new BitSet(new long[]{0x0000000000000000L,0x0000800070000000L});
    public static final BitSet FOLLOW_typeId_in_fieldList1114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_auxFieldList_in_fieldList1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fieldList1136 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_fieldList1138 = new BitSet(new long[]{0x0000000000000000L,0x0000800070000000L});
    public static final BitSet FOLLOW_typeId_in_fieldList1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_auxFieldList_in_fieldList1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intFieldList_in_auxFieldList1187 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_131_in_intFieldList1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_intFieldList1214 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_aux1_in_intFieldList1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_intFieldList1239 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_intFieldList1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_intFieldList1245 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_intFieldList1248 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_intFieldList1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_aux11302 = new BitSet(new long[]{0x0000000000000000L,0x0000800070000000L});
    public static final BitSet FOLLOW_typeId_in_aux11306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_aux11323 = new BitSet(new long[]{0x0000000000000000L,0x0000800070000000L});
    public static final BitSet FOLLOW_typeId_in_aux11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typeId1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_typeId1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_typeId1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_typeId1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_varDec1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_varDec1426 = new BitSet(new long[]{0x0000000000000000L,0x0020100000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_varDec1429 = new BitSet(new long[]{0x0000000000000000L,0x0000800070000000L});
    public static final BitSet FOLLOW_typeId_in_varDec1433 = new BitSet(new long[]{0x0000000000000000L,0x0020100000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_aux2_in_varDec1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_aux21492 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_aux21494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_aux21512 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_aux21514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_funDec1538 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_funDec1540 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_funDec1542 = new BitSet(new long[]{0x0000000000000000L,0x0002000040000000L});
    public static final BitSet FOLLOW_fieldList_in_funDec1544 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_funDec1546 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_funDec1549 = new BitSet(new long[]{0x0000000000000000L,0x0000800070000000L});
    public static final BitSet FOLLOW_typeId_in_funDec1553 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_funDec1557 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_funDec1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lValue1621 = new BitSet(new long[]{0x0000000000000000L,0x8021000000000000L,0x0000000000000250L});
    public static final BitSet FOLLOW_functionRecordArray_in_lValue1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_functionRecordArray1651 = new BitSet(new long[]{0x0000000000000000L,0x0997880070000000L});
    public static final BitSet FOLLOW_argList_in_functionRecordArray1653 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_functionRecordArray1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_functionRecordArray1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fieldList_in_functionRecordArray1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_functionRecordArray1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_auxFRA1_in_functionRecordArray1697 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L,0x0000000000000250L});
    public static final BitSet FOLLOW_auxFRA2_in_functionRecordArray1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_auxFRA11794 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_auxFRA11796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_auxFRA11798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_auxFRA21819 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_auxFRA21821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aux3_in_auxFRA21845 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_aux4_in_auxFRA21850 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_auxFRA21854 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_auxFRA21858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aux4_in_auxFRA21909 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_auxFRA21911 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_auxFRA21915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_aux31943 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_aux31945 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_132_in_aux41971 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_aux41973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_aux41975 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_exp_in_expList1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_auxExpList_in_expList2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_auxExpList2039 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_auxExpList2041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_exp_in_argList2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_auxArgList_in_argList2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_auxArgList2105 = new BitSet(new long[]{0x0000000000000000L,0x0995880070000000L});
    public static final BitSet FOLLOW_exp_in_auxArgList2107 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});

}