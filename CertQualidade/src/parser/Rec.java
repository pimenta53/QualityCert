package parser;

import parser.rec.types.*;
import parser.rec.RecAdaptor;
import tom.library.sl.*;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.tree.Tree;
import java.io.*;
import java.util.*;

public class Rec {

  private static boolean tom_equal_term_char(char t1, char t2) {return  t1==t2 ;}private static boolean tom_is_sort_char(char t) {return  true ;}  private static boolean tom_equal_term_String(String t1, String t2) {return  t1.equals(t2) ;}private static boolean tom_is_sort_String(String t) {return  t instanceof String ;}  private static boolean tom_equal_term_int(int t1, int t2) {return  t1==t2 ;}private static boolean tom_is_sort_int(int t) {return  true ;}  private static boolean tom_equal_term_LValue(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_LValue(Object t) {return  (t instanceof parser.rec.types.LValue) ;}private static boolean tom_equal_term_VarDec(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_VarDec(Object t) {return  (t instanceof parser.rec.types.VarDec) ;}private static boolean tom_equal_term_Term(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Term(Object t) {return  (t instanceof parser.rec.types.Term) ;}private static boolean tom_equal_term_Exp(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Exp(Object t) {return  (t instanceof parser.rec.types.Exp) ;}private static boolean tom_equal_term_ArgList(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_ArgList(Object t) {return  (t instanceof parser.rec.types.ArgList) ;}private static boolean tom_equal_term_AuxFieldList(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_AuxFieldList(Object t) {return  (t instanceof parser.rec.types.AuxFieldList) ;}private static boolean tom_equal_term_FunDec(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_FunDec(Object t) {return  (t instanceof parser.rec.types.FunDec) ;}private static boolean tom_equal_term_Aux1(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Aux1(Object t) {return  (t instanceof parser.rec.types.Aux1) ;}private static boolean tom_equal_term_IntFieldList(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_IntFieldList(Object t) {return  (t instanceof parser.rec.types.IntFieldList) ;}private static boolean tom_equal_term_ExpANDPr(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_ExpANDPr(Object t) {return  (t instanceof parser.rec.types.ExpANDPr) ;}private static boolean tom_equal_term_FactorPr(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_FactorPr(Object t) {return  (t instanceof parser.rec.types.FactorPr) ;}private static boolean tom_equal_term_DecList(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_DecList(Object t) {return  (t instanceof parser.rec.types.DecList) ;}private static boolean tom_equal_term_Aux4(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Aux4(Object t) {return  (t instanceof parser.rec.types.Aux4) ;}private static boolean tom_equal_term_TermPr(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_TermPr(Object t) {return  (t instanceof parser.rec.types.TermPr) ;}private static boolean tom_equal_term_ExpAND(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_ExpAND(Object t) {return  (t instanceof parser.rec.types.ExpAND) ;}private static boolean tom_equal_term_FieldList(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_FieldList(Object t) {return  (t instanceof parser.rec.types.FieldList) ;}private static boolean tom_equal_term_ExpORPr(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_ExpORPr(Object t) {return  (t instanceof parser.rec.types.ExpORPr) ;}private static boolean tom_equal_term_AuxFRA2(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_AuxFRA2(Object t) {return  (t instanceof parser.rec.types.AuxFRA2) ;}private static boolean tom_equal_term_ExpOR(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_ExpOR(Object t) {return  (t instanceof parser.rec.types.ExpOR) ;}private static boolean tom_equal_term_AuxFRA1(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_AuxFRA1(Object t) {return  (t instanceof parser.rec.types.AuxFRA1) ;}private static boolean tom_equal_term_AritExp(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_AritExp(Object t) {return  (t instanceof parser.rec.types.AritExp) ;}private static boolean tom_equal_term_Aux2(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Aux2(Object t) {return  (t instanceof parser.rec.types.Aux2) ;}private static boolean tom_equal_term_Prog(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Prog(Object t) {return  (t instanceof parser.rec.types.Prog) ;}private static boolean tom_equal_term_ExpList(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_ExpList(Object t) {return  (t instanceof parser.rec.types.ExpList) ;}private static boolean tom_equal_term_TyDec(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_TyDec(Object t) {return  (t instanceof parser.rec.types.TyDec) ;}private static boolean tom_equal_term_Aux3(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Aux3(Object t) {return  (t instanceof parser.rec.types.Aux3) ;}private static boolean tom_equal_term_Factor(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Factor(Object t) {return  (t instanceof parser.rec.types.Factor) ;}private static boolean tom_equal_term_Ty(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Ty(Object t) {return  (t instanceof parser.rec.types.Ty) ;}private static boolean tom_equal_term_Dec(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Dec(Object t) {return  (t instanceof parser.rec.types.Dec) ;}private static boolean tom_equal_term_RelExp(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_RelExp(Object t) {return  (t instanceof parser.rec.types.RelExp) ;}private static boolean tom_equal_term_AuxExpList(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_AuxExpList(Object t) {return  (t instanceof parser.rec.types.AuxExpList) ;}private static boolean tom_equal_term_TypeId(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_TypeId(Object t) {return  (t instanceof parser.rec.types.TypeId) ;}private static boolean tom_equal_term_FunctionRecordArray(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_FunctionRecordArray(Object t) {return  (t instanceof parser.rec.types.FunctionRecordArray) ;}private static boolean tom_equal_term_AuxArgList(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_AuxArgList(Object t) {return  (t instanceof parser.rec.types.AuxArgList) ;}private static boolean tom_is_fun_sym_LValue( parser.rec.types.LValue  t) {return  (t instanceof parser.rec.types.lvalue.LValue) ;}private static  String  tom_get_slot_LValue_id( parser.rec.types.LValue  t) {return  t.getid() ;}private static  parser.rec.types.FunctionRecordArray  tom_get_slot_LValue_fra( parser.rec.types.LValue  t) {return  t.getfra() ;}private static boolean tom_is_fun_sym_VarDec1( parser.rec.types.VarDec  t) {return  (t instanceof parser.rec.types.vardec.VarDec1) ;}private static  String  tom_get_slot_VarDec1_id( parser.rec.types.VarDec  t) {return  t.getid() ;}private static  parser.rec.types.Aux2  tom_get_slot_VarDec1_a( parser.rec.types.VarDec  t) {return  t.geta() ;}private static boolean tom_is_fun_sym_VarDec2( parser.rec.types.VarDec  t) {return  (t instanceof parser.rec.types.vardec.VarDec2) ;}private static  String  tom_get_slot_VarDec2_id( parser.rec.types.VarDec  t) {return  t.getid() ;}private static  parser.rec.types.TypeId  tom_get_slot_VarDec2_ti( parser.rec.types.VarDec  t) {return  t.getti() ;}private static  parser.rec.types.Aux2  tom_get_slot_VarDec2_a( parser.rec.types.VarDec  t) {return  t.geta() ;}private static boolean tom_is_fun_sym_Term( parser.rec.types.Term  t) {return  (t instanceof parser.rec.types.term.Term) ;}private static  parser.rec.types.Factor  tom_get_slot_Term_f( parser.rec.types.Term  t) {return  t.getf() ;}private static  parser.rec.types.FactorPr  tom_get_slot_Term_fp( parser.rec.types.Term  t) {return  t.getfp() ;}private static boolean tom_is_fun_sym_Exp( parser.rec.types.Exp  t) {return  (t instanceof parser.rec.types.exp.Exp) ;}private static  parser.rec.types.ExpOR  tom_get_slot_Exp_eop( parser.rec.types.Exp  t) {return  t.geteop() ;}private static  parser.rec.types.ExpORPr  tom_get_slot_Exp_eorp( parser.rec.types.Exp  t) {return  t.geteorp() ;}private static boolean tom_is_fun_sym_ArgList( parser.rec.types.ArgList  t) {return  (t instanceof parser.rec.types.arglist.ArgList) ;}private static  parser.rec.types.Exp  tom_get_slot_ArgList_e1( parser.rec.types.ArgList  t) {return  t.gete1() ;}private static  parser.rec.types.AuxArgList  tom_get_slot_ArgList_a( parser.rec.types.ArgList  t) {return  t.geta() ;}private static boolean tom_is_fun_sym_ArgListEmpty( parser.rec.types.ArgList  t) {return  (t instanceof parser.rec.types.arglist.ArgListEmpty) ;}private static boolean tom_is_fun_sym_FunDec1( parser.rec.types.FunDec  t) {return  (t instanceof parser.rec.types.fundec.FunDec1) ;}private static  String  tom_get_slot_FunDec1_id( parser.rec.types.FunDec  t) {return  t.getid() ;}private static  parser.rec.types.FieldList  tom_get_slot_FunDec1_fl( parser.rec.types.FunDec  t) {return  t.getfl() ;}private static  parser.rec.types.Exp  tom_get_slot_FunDec1_e1( parser.rec.types.FunDec  t) {return  t.gete1() ;}private static boolean tom_is_fun_sym_FunDec2( parser.rec.types.FunDec  t) {return  (t instanceof parser.rec.types.fundec.FunDec2) ;}private static  String  tom_get_slot_FunDec2_id( parser.rec.types.FunDec  t) {return  t.getid() ;}private static  parser.rec.types.FieldList  tom_get_slot_FunDec2_fl( parser.rec.types.FunDec  t) {return  t.getfl() ;}private static  parser.rec.types.TypeId  tom_get_slot_FunDec2_ti( parser.rec.types.FunDec  t) {return  t.getti() ;}private static  parser.rec.types.Exp  tom_get_slot_FunDec2_e1( parser.rec.types.FunDec  t) {return  t.gete1() ;}private static boolean tom_is_fun_sym_Aux11( parser.rec.types.Aux1  t) {return  (t instanceof parser.rec.types.aux1.Aux11) ;}private static  parser.rec.types.TypeId  tom_get_slot_Aux11_ti( parser.rec.types.Aux1  t) {return  t.getti() ;}private static boolean tom_is_fun_sym_Aux12( parser.rec.types.Aux1  t) {return  (t instanceof parser.rec.types.aux1.Aux12) ;}private static  parser.rec.types.TypeId  tom_get_slot_Aux12_ti( parser.rec.types.Aux1  t) {return  t.getti() ;}private static boolean tom_is_fun_sym_IntFieldList1( parser.rec.types.IntFieldList  t) {return  (t instanceof parser.rec.types.intfieldlist.IntFieldList1) ;}private static  String  tom_get_slot_IntFieldList1_id( parser.rec.types.IntFieldList  t) {return  t.getid() ;}private static  parser.rec.types.Aux1  tom_get_slot_IntFieldList1_a( parser.rec.types.IntFieldList  t) {return  t.geta() ;}private static boolean tom_is_fun_sym_IntFieldList2( parser.rec.types.IntFieldList  t) {return  (t instanceof parser.rec.types.intfieldlist.IntFieldList2) ;}private static  parser.rec.types.Exp  tom_get_slot_IntFieldList2_e1( parser.rec.types.IntFieldList  t) {return  t.gete1() ;}private static boolean tom_is_fun_sym_IntFieldList3( parser.rec.types.IntFieldList  t) {return  (t instanceof parser.rec.types.intfieldlist.IntFieldList3) ;}private static  parser.rec.types.Exp  tom_get_slot_IntFieldList3_e1( parser.rec.types.IntFieldList  t) {return  t.gete1() ;}private static  parser.rec.types.Exp  tom_get_slot_IntFieldList3_e2( parser.rec.types.IntFieldList  t) {return  t.gete2() ;}private static boolean tom_is_fun_sym_ExpANDPr( parser.rec.types.ExpANDPr  t) {return  (t instanceof parser.rec.types.expandpr.ExpANDPr) ;}private static  parser.rec.types.Exp  tom_get_slot_ExpANDPr_e1( parser.rec.types.ExpANDPr  t) {return  t.gete1() ;}private static boolean tom_is_fun_sym_ExpANDPrEmpty( parser.rec.types.ExpANDPr  t) {return  (t instanceof parser.rec.types.expandpr.ExpANDPrEmpty) ;}private static boolean tom_is_fun_sym_Times( parser.rec.types.FactorPr  t) {return  (t instanceof parser.rec.types.factorpr.Times) ;}private static  parser.rec.types.Factor  tom_get_slot_Times_f( parser.rec.types.FactorPr  t) {return  t.getf() ;}private static  parser.rec.types.FactorPr  tom_get_slot_Times_fp( parser.rec.types.FactorPr  t) {return  t.getfp() ;}private static boolean tom_is_fun_sym_Div( parser.rec.types.FactorPr  t) {return  (t instanceof parser.rec.types.factorpr.Div) ;}private static  parser.rec.types.Factor  tom_get_slot_Div_f( parser.rec.types.FactorPr  t) {return  t.getf() ;}private static  parser.rec.types.FactorPr  tom_get_slot_Div_fp( parser.rec.types.FactorPr  t) {return  t.getfp() ;}private static boolean tom_is_fun_sym_FactorPrEmpty( parser.rec.types.FactorPr  t) {return  (t instanceof parser.rec.types.factorpr.FactorPrEmpty) ;}private static boolean tom_is_fun_sym_TermPrPlus( parser.rec.types.TermPr  t) {return  (t instanceof parser.rec.types.termpr.TermPrPlus) ;}private static  parser.rec.types.Term  tom_get_slot_TermPrPlus_t( parser.rec.types.TermPr  t) {return  t.gett() ;}private static  parser.rec.types.TermPr  tom_get_slot_TermPrPlus_tp( parser.rec.types.TermPr  t) {return  t.gettp() ;}private static boolean tom_is_fun_sym_TermPrNeg( parser.rec.types.TermPr  t) {return  (t instanceof parser.rec.types.termpr.TermPrNeg) ;}private static  parser.rec.types.Term  tom_get_slot_TermPrNeg_t( parser.rec.types.TermPr  t) {return  t.gett() ;}private static  parser.rec.types.TermPr  tom_get_slot_TermPrNeg_tp( parser.rec.types.TermPr  t) {return  t.gettp() ;}private static boolean tom_is_fun_sym_TermPrEqual( parser.rec.types.TermPr  t) {return  (t instanceof parser.rec.types.termpr.TermPrEqual) ;}private static  parser.rec.types.Term  tom_get_slot_TermPrEqual_t( parser.rec.types.TermPr  t) {return  t.gett() ;}private static  parser.rec.types.TermPr  tom_get_slot_TermPrEqual_tp( parser.rec.types.TermPr  t) {return  t.gettp() ;}private static boolean tom_is_fun_sym_TermPrEmpty( parser.rec.types.TermPr  t) {return  (t instanceof parser.rec.types.termpr.TermPrEmpty) ;}private static boolean tom_is_fun_sym_ExpAND( parser.rec.types.ExpAND  t) {return  (t instanceof parser.rec.types.expand.ExpAND) ;}private static  parser.rec.types.AritExp  tom_get_slot_ExpAND_ae( parser.rec.types.ExpAND  t) {return  t.getae() ;}private static  parser.rec.types.RelExp  tom_get_slot_ExpAND_re( parser.rec.types.ExpAND  t) {return  t.getre() ;}private static boolean tom_is_fun_sym_FieldListDP( parser.rec.types.FieldList  t) {return  (t instanceof parser.rec.types.fieldlist.FieldListDP) ;}private static  String  tom_get_slot_FieldListDP_d( parser.rec.types.FieldList  t) {return  t.getd() ;}private static  parser.rec.types.TypeId  tom_get_slot_FieldListDP_ti( parser.rec.types.FieldList  t) {return  t.getti() ;}private static  parser.rec.types.AuxFieldList  tom_get_slot_FieldListDP_a( parser.rec.types.FieldList  t) {return  t.geta() ;}private static boolean tom_is_fun_sym_FieldListEqual( parser.rec.types.FieldList  t) {return  (t instanceof parser.rec.types.fieldlist.FieldListEqual) ;}private static  String  tom_get_slot_FieldListEqual_id( parser.rec.types.FieldList  t) {return  t.getid() ;}private static  parser.rec.types.TypeId  tom_get_slot_FieldListEqual_ti( parser.rec.types.FieldList  t) {return  t.getti() ;}private static  parser.rec.types.AuxFieldList  tom_get_slot_FieldListEqual_a( parser.rec.types.FieldList  t) {return  t.geta() ;}private static boolean tom_is_fun_sym_FieldListEmpty( parser.rec.types.FieldList  t) {return  (t instanceof parser.rec.types.fieldlist.FieldListEmpty) ;}private static boolean tom_is_fun_sym_ExpORPr( parser.rec.types.ExpORPr  t) {return  (t instanceof parser.rec.types.exporpr.ExpORPr) ;}private static  parser.rec.types.Exp  tom_get_slot_ExpORPr_e1( parser.rec.types.ExpORPr  t) {return  t.gete1() ;}private static boolean tom_is_fun_sym_ExpORPrEmpty( parser.rec.types.ExpORPr  t) {return  (t instanceof parser.rec.types.exporpr.ExpORPrEmpty) ;}private static boolean tom_is_fun_sym_AuxFRA21( parser.rec.types.AuxFRA2  t) {return  (t instanceof parser.rec.types.auxfra2.AuxFRA21) ;}private static  parser.rec.types.Exp  tom_get_slot_AuxFRA21_e1( parser.rec.types.AuxFRA2  t) {return  t.gete1() ;}private static boolean tom_is_fun_sym_AuxFRA22( parser.rec.types.AuxFRA2  t) {return  (t instanceof parser.rec.types.auxfra2.AuxFRA22) ;}private static  parser.rec.types.Aux3  tom_get_slot_AuxFRA22_a3( parser.rec.types.AuxFRA2  t) {return  t.geta3() ;}private static  parser.rec.types.Exp  tom_get_slot_AuxFRA22_e2( parser.rec.types.AuxFRA2  t) {return  t.gete2() ;}private static boolean tom_is_fun_sym_AuxFRA23( parser.rec.types.AuxFRA2  t) {return  (t instanceof parser.rec.types.auxfra2.AuxFRA23) ;}private static  parser.rec.types.Aux3  tom_get_slot_AuxFRA23_a3( parser.rec.types.AuxFRA2  t) {return  t.geta3() ;}private static  parser.rec.types.Aux4  tom_get_slot_AuxFRA23_a4( parser.rec.types.AuxFRA2  t) {return  t.geta4() ;}private static  parser.rec.types.Exp  tom_get_slot_AuxFRA23_e2( parser.rec.types.AuxFRA2  t) {return  t.gete2() ;}private static boolean tom_is_fun_sym_AuxFRA24( parser.rec.types.AuxFRA2  t) {return  (t instanceof parser.rec.types.auxfra2.AuxFRA24) ;}private static  parser.rec.types.Aux4  tom_get_slot_AuxFRA24_a4( parser.rec.types.AuxFRA2  t) {return  t.geta4() ;}private static  parser.rec.types.Exp  tom_get_slot_AuxFRA24_e2( parser.rec.types.AuxFRA2  t) {return  t.gete2() ;}private static boolean tom_is_fun_sym_ExpOR( parser.rec.types.ExpOR  t) {return  (t instanceof parser.rec.types.expor.ExpOR) ;}private static  parser.rec.types.ExpAND  tom_get_slot_ExpOR_ea( parser.rec.types.ExpOR  t) {return  t.getea() ;}private static  parser.rec.types.ExpANDPr  tom_get_slot_ExpOR_eap( parser.rec.types.ExpOR  t) {return  t.geteap() ;}private static boolean tom_is_fun_sym_AuxFRA1( parser.rec.types.AuxFRA1  t) {return  (t instanceof parser.rec.types.auxfra1.AuxFRA1) ;}private static  parser.rec.types.Exp  tom_get_slot_AuxFRA1_e1( parser.rec.types.AuxFRA1  t) {return  t.gete1() ;}private static boolean tom_is_fun_sym_AritExp( parser.rec.types.AritExp  t) {return  (t instanceof parser.rec.types.aritexp.AritExp) ;}private static  parser.rec.types.Term  tom_get_slot_AritExp_t( parser.rec.types.AritExp  t) {return  t.gett() ;}private static  parser.rec.types.TermPr  tom_get_slot_AritExp_tp( parser.rec.types.AritExp  t) {return  t.gettp() ;}private static boolean tom_is_fun_sym_Aux21( parser.rec.types.Aux2  t) {return  (t instanceof parser.rec.types.aux2.Aux21) ;}private static  parser.rec.types.Exp  tom_get_slot_Aux21_e( parser.rec.types.Aux2  t) {return  t.gete() ;}private static boolean tom_is_fun_sym_Aux22( parser.rec.types.Aux2  t) {return  (t instanceof parser.rec.types.aux2.Aux22) ;}private static  parser.rec.types.Exp  tom_get_slot_Aux22_e( parser.rec.types.Aux2  t) {return  t.gete() ;}private static boolean tom_is_fun_sym_Prog( parser.rec.types.Prog  t) {return  (t instanceof parser.rec.types.prog.Prog) ;}private static  parser.rec.types.Exp  tom_get_slot_Prog_e1( parser.rec.types.Prog  t) {return  t.gete1() ;}private static boolean tom_is_fun_sym_ExpList( parser.rec.types.ExpList  t) {return  (t instanceof parser.rec.types.explist.ExpList) ;}private static  parser.rec.types.Exp  tom_get_slot_ExpList_e1( parser.rec.types.ExpList  t) {return  t.gete1() ;}private static  parser.rec.types.AuxExpList  tom_get_slot_ExpList_a( parser.rec.types.ExpList  t) {return  t.geta() ;}private static boolean tom_is_fun_sym_ExpListEmpty( parser.rec.types.ExpList  t) {return  (t instanceof parser.rec.types.explist.ExpListEmpty) ;}private static boolean tom_is_fun_sym_TyDec( parser.rec.types.TyDec  t) {return  (t instanceof parser.rec.types.tydec.TyDec) ;}private static  parser.rec.types.TypeId  tom_get_slot_TyDec_ti( parser.rec.types.TyDec  t) {return  t.getti() ;}private static  parser.rec.types.Ty  tom_get_slot_TyDec_t( parser.rec.types.TyDec  t) {return  t.gett() ;}private static boolean tom_is_fun_sym_FNil( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FNil) ;}private static boolean tom_is_fun_sym_FInteger( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FInteger) ;}private static  int  tom_get_slot_FInteger_i( parser.rec.types.Factor  t) {return  t.geti() ;}private static boolean tom_is_fun_sym_FString( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FString) ;}private static  String  tom_get_slot_FString_s( parser.rec.types.Factor  t) {return  t.gets() ;}private static boolean tom_is_fun_sym_FExpList( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FExpList) ;}private static  parser.rec.types.ExpList  tom_get_slot_FExpList_el( parser.rec.types.Factor  t) {return  t.getel() ;}private static boolean tom_is_fun_sym_FNeg( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FNeg) ;}private static  parser.rec.types.Exp  tom_get_slot_FNeg_e1( parser.rec.types.Factor  t) {return  t.gete1() ;}private static boolean tom_is_fun_sym_FWhile( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FWhile) ;}private static  parser.rec.types.Exp  tom_get_slot_FWhile_e1( parser.rec.types.Factor  t) {return  t.gete1() ;}private static  parser.rec.types.Exp  tom_get_slot_FWhile_e2( parser.rec.types.Factor  t) {return  t.gete2() ;}private static boolean tom_is_fun_sym_FFor( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FFor) ;}private static  String  tom_get_slot_FFor_id( parser.rec.types.Factor  t) {return  t.getid() ;}private static  parser.rec.types.Exp  tom_get_slot_FFor_e1( parser.rec.types.Factor  t) {return  t.gete1() ;}private static  parser.rec.types.Exp  tom_get_slot_FFor_e2( parser.rec.types.Factor  t) {return  t.gete2() ;}private static  parser.rec.types.Exp  tom_get_slot_FFor_e3( parser.rec.types.Factor  t) {return  t.gete3() ;}private static boolean tom_is_fun_sym_FBreak( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FBreak) ;}private static boolean tom_is_fun_sym_FLet( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FLet) ;}private static  parser.rec.types.DecList  tom_get_slot_FLet_dl( parser.rec.types.Factor  t) {return  t.getdl() ;}private static  parser.rec.types.ExpList  tom_get_slot_FLet_el( parser.rec.types.Factor  t) {return  t.getel() ;}private static boolean tom_is_fun_sym_FLvalue( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FLvalue) ;}private static  parser.rec.types.LValue  tom_get_slot_FLvalue_lv( parser.rec.types.Factor  t) {return  t.getlv() ;}private static boolean tom_is_fun_sym_FIfThen( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FIfThen) ;}private static  parser.rec.types.Exp  tom_get_slot_FIfThen_e1( parser.rec.types.Factor  t) {return  t.gete1() ;}private static  parser.rec.types.Exp  tom_get_slot_FIfThen_e2( parser.rec.types.Factor  t) {return  t.gete2() ;}private static boolean tom_is_fun_sym_FIfThenElse( parser.rec.types.Factor  t) {return  (t instanceof parser.rec.types.factor.FIfThenElse) ;}private static  parser.rec.types.Exp  tom_get_slot_FIfThenElse_e1( parser.rec.types.Factor  t) {return  t.gete1() ;}private static  parser.rec.types.Exp  tom_get_slot_FIfThenElse_e2( parser.rec.types.Factor  t) {return  t.gete2() ;}private static  parser.rec.types.Exp  tom_get_slot_FIfThenElse_e3( parser.rec.types.Factor  t) {return  t.gete3() ;}private static boolean tom_is_fun_sym_TFieldList( parser.rec.types.Ty  t) {return  (t instanceof parser.rec.types.ty.TFieldList) ;}private static  parser.rec.types.FieldList  tom_get_slot_TFieldList_fl( parser.rec.types.Ty  t) {return  t.getfl() ;}private static boolean tom_is_fun_sym_TArrayOf( parser.rec.types.Ty  t) {return  (t instanceof parser.rec.types.ty.TArrayOf) ;}private static  parser.rec.types.TypeId  tom_get_slot_TArrayOf_ti( parser.rec.types.Ty  t) {return  t.getti() ;}private static boolean tom_is_fun_sym_TTypeId( parser.rec.types.Ty  t) {return  (t instanceof parser.rec.types.ty.TTypeId) ;}private static  parser.rec.types.TypeId  tom_get_slot_TTypeId_ti( parser.rec.types.Ty  t) {return  t.getti() ;}private static boolean tom_is_fun_sym_DTyDec( parser.rec.types.Dec  t) {return  (t instanceof parser.rec.types.dec.DTyDec) ;}private static  parser.rec.types.TyDec  tom_get_slot_DTyDec_td( parser.rec.types.Dec  t) {return  t.gettd() ;}private static boolean tom_is_fun_sym_DVarDec( parser.rec.types.Dec  t) {return  (t instanceof parser.rec.types.dec.DVarDec) ;}private static  parser.rec.types.VarDec  tom_get_slot_DVarDec_vd( parser.rec.types.Dec  t) {return  t.getvd() ;}private static boolean tom_is_fun_sym_DFunDec( parser.rec.types.Dec  t) {return  (t instanceof parser.rec.types.dec.DFunDec) ;}private static  parser.rec.types.FunDec  tom_get_slot_DFunDec_fd( parser.rec.types.Dec  t) {return  t.getfd() ;}private static boolean tom_is_fun_sym_RelExpLess( parser.rec.types.RelExp  t) {return  (t instanceof parser.rec.types.relexp.RelExpLess) ;}private static  parser.rec.types.AritExp  tom_get_slot_RelExpLess_a1( parser.rec.types.RelExp  t) {return  t.geta1() ;}private static boolean tom_is_fun_sym_RelExpMore( parser.rec.types.RelExp  t) {return  (t instanceof parser.rec.types.relexp.RelExpMore) ;}private static  parser.rec.types.AritExp  tom_get_slot_RelExpMore_a2( parser.rec.types.RelExp  t) {return  t.geta2() ;}private static boolean tom_is_fun_sym_RelExpDiferent( parser.rec.types.RelExp  t) {return  (t instanceof parser.rec.types.relexp.RelExpDiferent) ;}private static  parser.rec.types.AritExp  tom_get_slot_RelExpDiferent_a3( parser.rec.types.RelExp  t) {return  t.geta3() ;}private static boolean tom_is_fun_sym_RelExpLessEqual( parser.rec.types.RelExp  t) {return  (t instanceof parser.rec.types.relexp.RelExpLessEqual) ;}private static  parser.rec.types.AritExp  tom_get_slot_RelExpLessEqual_a4( parser.rec.types.RelExp  t) {return  t.geta4() ;}private static boolean tom_is_fun_sym_RelExpMoreEqual( parser.rec.types.RelExp  t) {return  (t instanceof parser.rec.types.relexp.RelExpMoreEqual) ;}private static  parser.rec.types.AritExp  tom_get_slot_RelExpMoreEqual_a5( parser.rec.types.RelExp  t) {return  t.geta5() ;}private static boolean tom_is_fun_sym_RelExpEmpty( parser.rec.types.RelExp  t) {return  (t instanceof parser.rec.types.relexp.RelExpEmpty) ;}private static boolean tom_is_fun_sym_TypeId( parser.rec.types.TypeId  t) {return  (t instanceof parser.rec.types.typeid.TypeId) ;}private static  String  tom_get_slot_TypeId_id( parser.rec.types.TypeId  t) {return  t.getid() ;}private static boolean tom_is_fun_sym_TypeIdString( parser.rec.types.TypeId  t) {return  (t instanceof parser.rec.types.typeid.TypeIdString) ;}private static  String  tom_get_slot_TypeIdString_s( parser.rec.types.TypeId  t) {return  t.gets() ;}private static boolean tom_is_fun_sym_TypeIdInteger( parser.rec.types.TypeId  t) {return  (t instanceof parser.rec.types.typeid.TypeIdInteger) ;}private static  int  tom_get_slot_TypeIdInteger_i( parser.rec.types.TypeId  t) {return  t.geti() ;}private static boolean tom_is_fun_sym_TypeIdNil( parser.rec.types.TypeId  t) {return  (t instanceof parser.rec.types.typeid.TypeIdNil) ;}private static boolean tom_is_fun_sym_FRAArgList( parser.rec.types.FunctionRecordArray  t) {return  (t instanceof parser.rec.types.functionrecordarray.FRAArgList) ;}private static  parser.rec.types.ArgList  tom_get_slot_FRAArgList_al( parser.rec.types.FunctionRecordArray  t) {return  t.getal() ;}private static boolean tom_is_fun_sym_FRAFieldList( parser.rec.types.FunctionRecordArray  t) {return  (t instanceof parser.rec.types.functionrecordarray.FRAFieldList) ;}private static  parser.rec.types.FieldList  tom_get_slot_FRAFieldList_fl( parser.rec.types.FunctionRecordArray  t) {return  t.getfl() ;}private static boolean tom_is_fun_sym_FRA1( parser.rec.types.FunctionRecordArray  t) {return  (t instanceof parser.rec.types.functionrecordarray.FRA1) ;}private static  parser.rec.types.AuxFRA1  tom_get_slot_FRA1_a1( parser.rec.types.FunctionRecordArray  t) {return  t.geta1() ;}private static boolean tom_is_fun_sym_FRA2( parser.rec.types.FunctionRecordArray  t) {return  (t instanceof parser.rec.types.functionrecordarray.FRA2) ;}private static  parser.rec.types.AuxFRA2  tom_get_slot_FRA2_a2( parser.rec.types.FunctionRecordArray  t) {return  t.geta2() ;}private static boolean tom_is_fun_sym_FRA3( parser.rec.types.FunctionRecordArray  t) {return  (t instanceof parser.rec.types.functionrecordarray.FRA3) ;}private static  parser.rec.types.AuxFRA1  tom_get_slot_FRA3_a1( parser.rec.types.FunctionRecordArray  t) {return  t.geta1() ;}private static  parser.rec.types.AuxFRA2  tom_get_slot_FRA3_a2( parser.rec.types.FunctionRecordArray  t) {return  t.geta2() ;}private static boolean tom_is_fun_sym_FunctionRecordArrayEmpty( parser.rec.types.FunctionRecordArray  t) {return  (t instanceof parser.rec.types.functionrecordarray.FunctionRecordArrayEmpty) ;}private static boolean tom_is_fun_sym_AuxFieldList( parser.rec.types.AuxFieldList  t) {return  ((t instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) || (t instanceof parser.rec.types.auxfieldlist.EmptyAuxFieldList)) ;}private static  parser.rec.types.AuxFieldList  tom_empty_list_AuxFieldList() { return  parser.rec.types.auxfieldlist.EmptyAuxFieldList.make() ;}private static  parser.rec.types.AuxFieldList  tom_cons_list_AuxFieldList( parser.rec.types.IntFieldList  e,  parser.rec.types.AuxFieldList  l) { return  parser.rec.types.auxfieldlist.ConsAuxFieldList.make(e,l) ;}private static  parser.rec.types.IntFieldList  tom_get_head_AuxFieldList_AuxFieldList( parser.rec.types.AuxFieldList  l) {return  l.getHeadAuxFieldList() ;}private static  parser.rec.types.AuxFieldList  tom_get_tail_AuxFieldList_AuxFieldList( parser.rec.types.AuxFieldList  l) {return  l.getTailAuxFieldList() ;}private static boolean tom_is_empty_AuxFieldList_AuxFieldList( parser.rec.types.AuxFieldList  l) {return  l.isEmptyAuxFieldList() ;}   private static   parser.rec.types.AuxFieldList  tom_append_list_AuxFieldList( parser.rec.types.AuxFieldList l1,  parser.rec.types.AuxFieldList  l2) {     if( l1.isEmptyAuxFieldList() ) {       return l2;     } else if( l2.isEmptyAuxFieldList() ) {       return l1;     } else if(  l1.getTailAuxFieldList() .isEmptyAuxFieldList() ) {       return  parser.rec.types.auxfieldlist.ConsAuxFieldList.make( l1.getHeadAuxFieldList() ,l2) ;     } else {       return  parser.rec.types.auxfieldlist.ConsAuxFieldList.make( l1.getHeadAuxFieldList() ,tom_append_list_AuxFieldList( l1.getTailAuxFieldList() ,l2)) ;     }   }   private static   parser.rec.types.AuxFieldList  tom_get_slice_AuxFieldList( parser.rec.types.AuxFieldList  begin,  parser.rec.types.AuxFieldList  end, parser.rec.types.AuxFieldList  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptyAuxFieldList()  ||  (end==tom_empty_list_AuxFieldList()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  parser.rec.types.auxfieldlist.ConsAuxFieldList.make( begin.getHeadAuxFieldList() ,( parser.rec.types.AuxFieldList )tom_get_slice_AuxFieldList( begin.getTailAuxFieldList() ,end,tail)) ;   }   private static boolean tom_is_fun_sym_DecList( parser.rec.types.DecList  t) {return  ((t instanceof parser.rec.types.declist.ConsDecList) || (t instanceof parser.rec.types.declist.EmptyDecList)) ;}private static  parser.rec.types.DecList  tom_empty_list_DecList() { return  parser.rec.types.declist.EmptyDecList.make() ;}private static  parser.rec.types.DecList  tom_cons_list_DecList( parser.rec.types.Dec  e,  parser.rec.types.DecList  l) { return  parser.rec.types.declist.ConsDecList.make(e,l) ;}private static  parser.rec.types.Dec  tom_get_head_DecList_DecList( parser.rec.types.DecList  l) {return  l.getHeadDecList() ;}private static  parser.rec.types.DecList  tom_get_tail_DecList_DecList( parser.rec.types.DecList  l) {return  l.getTailDecList() ;}private static boolean tom_is_empty_DecList_DecList( parser.rec.types.DecList  l) {return  l.isEmptyDecList() ;}   private static   parser.rec.types.DecList  tom_append_list_DecList( parser.rec.types.DecList l1,  parser.rec.types.DecList  l2) {     if( l1.isEmptyDecList() ) {       return l2;     } else if( l2.isEmptyDecList() ) {       return l1;     } else if(  l1.getTailDecList() .isEmptyDecList() ) {       return  parser.rec.types.declist.ConsDecList.make( l1.getHeadDecList() ,l2) ;     } else {       return  parser.rec.types.declist.ConsDecList.make( l1.getHeadDecList() ,tom_append_list_DecList( l1.getTailDecList() ,l2)) ;     }   }   private static   parser.rec.types.DecList  tom_get_slice_DecList( parser.rec.types.DecList  begin,  parser.rec.types.DecList  end, parser.rec.types.DecList  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptyDecList()  ||  (end==tom_empty_list_DecList()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  parser.rec.types.declist.ConsDecList.make( begin.getHeadDecList() ,( parser.rec.types.DecList )tom_get_slice_DecList( begin.getTailDecList() ,end,tail)) ;   }   private static boolean tom_is_fun_sym_Aux4( parser.rec.types.Aux4  t) {return  ((t instanceof parser.rec.types.aux4.ConsAux4) || (t instanceof parser.rec.types.aux4.EmptyAux4)) ;}private static  parser.rec.types.Aux4  tom_empty_list_Aux4() { return  parser.rec.types.aux4.EmptyAux4.make() ;}private static  parser.rec.types.Aux4  tom_cons_list_Aux4( parser.rec.types.Exp  e,  parser.rec.types.Aux4  l) { return  parser.rec.types.aux4.ConsAux4.make(e,l) ;}private static  parser.rec.types.Exp  tom_get_head_Aux4_Aux4( parser.rec.types.Aux4  l) {return  l.getHeadAux4() ;}private static  parser.rec.types.Aux4  tom_get_tail_Aux4_Aux4( parser.rec.types.Aux4  l) {return  l.getTailAux4() ;}private static boolean tom_is_empty_Aux4_Aux4( parser.rec.types.Aux4  l) {return  l.isEmptyAux4() ;}   private static   parser.rec.types.Aux4  tom_append_list_Aux4( parser.rec.types.Aux4 l1,  parser.rec.types.Aux4  l2) {     if( l1.isEmptyAux4() ) {       return l2;     } else if( l2.isEmptyAux4() ) {       return l1;     } else if(  l1.getTailAux4() .isEmptyAux4() ) {       return  parser.rec.types.aux4.ConsAux4.make( l1.getHeadAux4() ,l2) ;     } else {       return  parser.rec.types.aux4.ConsAux4.make( l1.getHeadAux4() ,tom_append_list_Aux4( l1.getTailAux4() ,l2)) ;     }   }   private static   parser.rec.types.Aux4  tom_get_slice_Aux4( parser.rec.types.Aux4  begin,  parser.rec.types.Aux4  end, parser.rec.types.Aux4  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptyAux4()  ||  (end==tom_empty_list_Aux4()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  parser.rec.types.aux4.ConsAux4.make( begin.getHeadAux4() ,( parser.rec.types.Aux4 )tom_get_slice_Aux4( begin.getTailAux4() ,end,tail)) ;   }   private static boolean tom_is_fun_sym_Aux3( parser.rec.types.Aux3  t) {return  ((t instanceof parser.rec.types.aux3.ConsAux3) || (t instanceof parser.rec.types.aux3.EmptyAux3)) ;}private static  parser.rec.types.Aux3  tom_empty_list_Aux3() { return  parser.rec.types.aux3.EmptyAux3.make() ;}private static  parser.rec.types.Aux3  tom_cons_list_Aux3( String  e,  parser.rec.types.Aux3  l) { return  parser.rec.types.aux3.ConsAux3.make(e,l) ;}private static  String  tom_get_head_Aux3_Aux3( parser.rec.types.Aux3  l) {return  l.getHeadAux3() ;}private static  parser.rec.types.Aux3  tom_get_tail_Aux3_Aux3( parser.rec.types.Aux3  l) {return  l.getTailAux3() ;}private static boolean tom_is_empty_Aux3_Aux3( parser.rec.types.Aux3  l) {return  l.isEmptyAux3() ;}   private static   parser.rec.types.Aux3  tom_append_list_Aux3( parser.rec.types.Aux3 l1,  parser.rec.types.Aux3  l2) {     if( l1.isEmptyAux3() ) {       return l2;     } else if( l2.isEmptyAux3() ) {       return l1;     } else if(  l1.getTailAux3() .isEmptyAux3() ) {       return  parser.rec.types.aux3.ConsAux3.make( l1.getHeadAux3() ,l2) ;     } else {       return  parser.rec.types.aux3.ConsAux3.make( l1.getHeadAux3() ,tom_append_list_Aux3( l1.getTailAux3() ,l2)) ;     }   }   private static   parser.rec.types.Aux3  tom_get_slice_Aux3( parser.rec.types.Aux3  begin,  parser.rec.types.Aux3  end, parser.rec.types.Aux3  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptyAux3()  ||  (end==tom_empty_list_Aux3()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  parser.rec.types.aux3.ConsAux3.make( begin.getHeadAux3() ,( parser.rec.types.Aux3 )tom_get_slice_Aux3( begin.getTailAux3() ,end,tail)) ;   }   private static boolean tom_is_fun_sym_AuxExpList( parser.rec.types.AuxExpList  t) {return  ((t instanceof parser.rec.types.auxexplist.ConsAuxExpList) || (t instanceof parser.rec.types.auxexplist.EmptyAuxExpList)) ;}private static  parser.rec.types.AuxExpList  tom_empty_list_AuxExpList() { return  parser.rec.types.auxexplist.EmptyAuxExpList.make() ;}private static  parser.rec.types.AuxExpList  tom_cons_list_AuxExpList( parser.rec.types.Exp  e,  parser.rec.types.AuxExpList  l) { return  parser.rec.types.auxexplist.ConsAuxExpList.make(e,l) ;}private static  parser.rec.types.Exp  tom_get_head_AuxExpList_AuxExpList( parser.rec.types.AuxExpList  l) {return  l.getHeadAuxExpList() ;}private static  parser.rec.types.AuxExpList  tom_get_tail_AuxExpList_AuxExpList( parser.rec.types.AuxExpList  l) {return  l.getTailAuxExpList() ;}private static boolean tom_is_empty_AuxExpList_AuxExpList( parser.rec.types.AuxExpList  l) {return  l.isEmptyAuxExpList() ;}   private static   parser.rec.types.AuxExpList  tom_append_list_AuxExpList( parser.rec.types.AuxExpList l1,  parser.rec.types.AuxExpList  l2) {     if( l1.isEmptyAuxExpList() ) {       return l2;     } else if( l2.isEmptyAuxExpList() ) {       return l1;     } else if(  l1.getTailAuxExpList() .isEmptyAuxExpList() ) {       return  parser.rec.types.auxexplist.ConsAuxExpList.make( l1.getHeadAuxExpList() ,l2) ;     } else {       return  parser.rec.types.auxexplist.ConsAuxExpList.make( l1.getHeadAuxExpList() ,tom_append_list_AuxExpList( l1.getTailAuxExpList() ,l2)) ;     }   }   private static   parser.rec.types.AuxExpList  tom_get_slice_AuxExpList( parser.rec.types.AuxExpList  begin,  parser.rec.types.AuxExpList  end, parser.rec.types.AuxExpList  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptyAuxExpList()  ||  (end==tom_empty_list_AuxExpList()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  parser.rec.types.auxexplist.ConsAuxExpList.make( begin.getHeadAuxExpList() ,( parser.rec.types.AuxExpList )tom_get_slice_AuxExpList( begin.getTailAuxExpList() ,end,tail)) ;   }   private static boolean tom_is_fun_sym_AuxArgList( parser.rec.types.AuxArgList  t) {return  ((t instanceof parser.rec.types.auxarglist.ConsAuxArgList) || (t instanceof parser.rec.types.auxarglist.EmptyAuxArgList)) ;}private static  parser.rec.types.AuxArgList  tom_empty_list_AuxArgList() { return  parser.rec.types.auxarglist.EmptyAuxArgList.make() ;}private static  parser.rec.types.AuxArgList  tom_cons_list_AuxArgList( parser.rec.types.Exp  e,  parser.rec.types.AuxArgList  l) { return  parser.rec.types.auxarglist.ConsAuxArgList.make(e,l) ;}private static  parser.rec.types.Exp  tom_get_head_AuxArgList_AuxArgList( parser.rec.types.AuxArgList  l) {return  l.getHeadAuxArgList() ;}private static  parser.rec.types.AuxArgList  tom_get_tail_AuxArgList_AuxArgList( parser.rec.types.AuxArgList  l) {return  l.getTailAuxArgList() ;}private static boolean tom_is_empty_AuxArgList_AuxArgList( parser.rec.types.AuxArgList  l) {return  l.isEmptyAuxArgList() ;}   private static   parser.rec.types.AuxArgList  tom_append_list_AuxArgList( parser.rec.types.AuxArgList l1,  parser.rec.types.AuxArgList  l2) {     if( l1.isEmptyAuxArgList() ) {       return l2;     } else if( l2.isEmptyAuxArgList() ) {       return l1;     } else if(  l1.getTailAuxArgList() .isEmptyAuxArgList() ) {       return  parser.rec.types.auxarglist.ConsAuxArgList.make( l1.getHeadAuxArgList() ,l2) ;     } else {       return  parser.rec.types.auxarglist.ConsAuxArgList.make( l1.getHeadAuxArgList() ,tom_append_list_AuxArgList( l1.getTailAuxArgList() ,l2)) ;     }   }   private static   parser.rec.types.AuxArgList  tom_get_slice_AuxArgList( parser.rec.types.AuxArgList  begin,  parser.rec.types.AuxArgList  end, parser.rec.types.AuxArgList  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptyAuxArgList()  ||  (end==tom_empty_list_AuxArgList()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  parser.rec.types.auxarglist.ConsAuxArgList.make( begin.getHeadAuxArgList() ,( parser.rec.types.AuxArgList )tom_get_slice_AuxArgList( begin.getTailAuxArgList() ,end,tail)) ;   }

  private int nFuncoes = 0;
  private int nOperandos = 0;
  private int nNodos = 0;
  private int nArestas = 0;
  private int nMcCabe = 0;

  private List<String> operadores = new ArrayList<String>();
  private List<String> operandos = new ArrayList<String>();

  private static String aux[] = new String[9];

  public static String[] lerFicheiro(String x) throws VisitFailure{
		try {
			if (x.length() <= 0) {
				System.out.println("usage: java Main <filename>");
			} else {
				// Initialize parser
				RecLexer lexer = new RecLexer(new ANTLRInputStream(
						new FileInputStream(x)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				RecParser parser = new RecParser(tokens);

				// Parse the input expression
				// sun.reflect.generics.tree.Tree
				Tree b = (Tree) parser.prog().getTree();
				// System.out.println(">>>>>>>>>>>"+b.toStringTree());
				Prog p = (Prog) RecAdaptor.getTerm(b);

				Rec main = new Rec();

				main.interpProg(p);

				//System.out.println("N�mero de fun��es: " + aux[0]);
				//System.out.println("N�mero de operadores distintos: " + aux[1]);
				//System.out.println("N�mero de operandos distintos: " + aux[2]);
				//System.out.println("N�mero de operandos: " + aux[3]);
				//System.out.println("N�mero de nodos: " + aux[4]);
				//System.out.println("N�mero de arestas: " + aux[5]);

				countComentarios(x);
				//System.out.println("N�mero de coment�rios: " + aux2[0]);
				//System.out.println("N�mero de linhas de c�digo: " + aux2[1]);
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		return aux;
	}


	public static void countComentarios(String filename) throws IOException {
	    InputStream is = new BufferedInputStream(new FileInputStream(filename));
	    try {
	        byte[] c = new byte[1024];
	        int numeroComentarios = 0;
	        int numeroLinhas = 0;
	        int readChars = 0;
	        while ((readChars = is.read(c)) != -1) {
	            for (int i = 0; i < readChars; ++i) {
	                if(c[i] == '*' && c[i+1] == '/') numeroComentarios++;
	                if(c[i] == '/' && c[i+1] == '/') numeroComentarios++;
	                if(c[i] == '\n') numeroLinhas++;
	            }
	        }
	        aux[7] = Integer.toString(numeroComentarios);
	        aux[8] = Integer.toString(numeroLinhas+1);
	    } finally {
	        is.close();
	    }
	}

  // Prog = Prog(e1:Exp)
  public void interpProg(Prog p) {
	  {{if (tom_is_sort_Prog(((Object)p))) {if (tom_is_sort_Prog((( parser.rec.types.Prog )((Object)p)))) {if (tom_is_fun_sym_Prog((( parser.rec.types.Prog )(( parser.rec.types.Prog )((Object)p))))) {interpExp(tom_get_slot_Prog_e1((( parser.rec.types.Prog )((Object)p))))

;

    		aux[0] = Integer.toString(nFuncoes);
    		aux[1] = Integer.toString(operadores.size());
    		aux[2] = Integer.toString(operandos.size());
    		aux[3] = Integer.toString(nOperandos);
    		aux[4] = Integer.toString(nNodos);
    		aux[5] = Integer.toString(nArestas);
    		aux[6] = Integer.toString(nMcCabe);

    		 for(String s : operadores){
    			System.out.print(s + " ");
    		 }

    		 System.out.println("");

    		 for(String s : operandos){
     			System.out.print(s + " ");
     		 }

    		 System.out.println("");
    	}}}}}

  }

  // Exp = Exp(eop:ExpOR, eorp:ExpORPr)
  private void interpExp(Exp e) {
     {{if (tom_is_sort_Exp(((Object)e))) {if (tom_is_sort_Exp((( parser.rec.types.Exp )((Object)e)))) {if (tom_is_fun_sym_Exp((( parser.rec.types.Exp )(( parser.rec.types.Exp )((Object)e))))) {interpExpOR(tom_get_slot_Exp_eop((( parser.rec.types.Exp )((Object)e))))

;
    		interpExpORPr(tom_get_slot_Exp_eorp((( parser.rec.types.Exp )((Object)e))));
    	}}}}}

  }

  // ExpOR = ExpOR(ea:ExpAND, eap:ExpANDPr)
  private void interpExpOR(ExpOR eOR) {
     {{if (tom_is_sort_ExpOR(((Object)eOR))) {if (tom_is_sort_ExpOR((( parser.rec.types.ExpOR )((Object)eOR)))) {if (tom_is_fun_sym_ExpOR((( parser.rec.types.ExpOR )(( parser.rec.types.ExpOR )((Object)eOR))))) {interpExpAND(tom_get_slot_ExpOR_ea((( parser.rec.types.ExpOR )((Object)eOR))))

;
    		interpExpANDPr(tom_get_slot_ExpOR_eap((( parser.rec.types.ExpOR )((Object)eOR))));
    	}}}}}

  }

  // ExpAND = ExpAND(ae:AritExp, re:RelExp)
  private void interpExpAND(ExpAND eAND) {
     {{if (tom_is_sort_ExpAND(((Object)eAND))) {if (tom_is_sort_ExpAND((( parser.rec.types.ExpAND )((Object)eAND)))) {if (tom_is_fun_sym_ExpAND((( parser.rec.types.ExpAND )(( parser.rec.types.ExpAND )((Object)eAND))))) {interpAritExp(tom_get_slot_ExpAND_ae((( parser.rec.types.ExpAND )((Object)eAND))))

;
    		interpRelExp(tom_get_slot_ExpAND_re((( parser.rec.types.ExpAND )((Object)eAND))));
    	}}}}}

  }


  // ExpORPr = ExpORPr(e1:Exp)
  private void interpExpORPr(ExpORPr eORPr) {
     {{if (tom_is_sort_ExpORPr(((Object)eORPr))) {if (tom_is_sort_ExpORPr((( parser.rec.types.ExpORPr )((Object)eORPr)))) {if (tom_is_fun_sym_ExpORPr((( parser.rec.types.ExpORPr )(( parser.rec.types.ExpORPr )((Object)eORPr))))) {

    		if(!operadores.contains("|")) operadores.add("|");
    		interpExp(tom_get_slot_ExpORPr_e1((( parser.rec.types.ExpORPr )((Object)eORPr))));
    		nMcCabe++;
    	}}}}{if (tom_is_sort_ExpORPr(((Object)eORPr))) {if (tom_is_sort_ExpORPr((( parser.rec.types.ExpORPr )((Object)eORPr)))) {if (tom_is_fun_sym_ExpORPrEmpty((( parser.rec.types.ExpORPr )(( parser.rec.types.ExpORPr )((Object)eORPr))))) {


    	}}}}}

  }

  // ExpANDPr = ExpANDPr(e1:Exp)
  private void interpExpANDPr(ExpANDPr eANDPr) {
     {{if (tom_is_sort_ExpANDPr(((Object)eANDPr))) {if (tom_is_sort_ExpANDPr((( parser.rec.types.ExpANDPr )((Object)eANDPr)))) {if (tom_is_fun_sym_ExpANDPr((( parser.rec.types.ExpANDPr )(( parser.rec.types.ExpANDPr )((Object)eANDPr))))) {

    		if(!operadores.contains("&")) operadores.add("&");
    		interpExp(tom_get_slot_ExpANDPr_e1((( parser.rec.types.ExpANDPr )((Object)eANDPr))));
    		nMcCabe++;
    	}}}}{if (tom_is_sort_ExpANDPr(((Object)eANDPr))) {if (tom_is_sort_ExpANDPr((( parser.rec.types.ExpANDPr )((Object)eANDPr)))) {if (tom_is_fun_sym_ExpANDPrEmpty((( parser.rec.types.ExpANDPr )(( parser.rec.types.ExpANDPr )((Object)eANDPr))))) {


    	}}}}}

  }

  // AritExp = AritExp(t:Term, tp:TermPr)
  private void interpAritExp(AritExp ae) {
     {{if (tom_is_sort_AritExp(((Object)ae))) {if (tom_is_sort_AritExp((( parser.rec.types.AritExp )((Object)ae)))) {if (tom_is_fun_sym_AritExp((( parser.rec.types.AritExp )(( parser.rec.types.AritExp )((Object)ae))))) {interpTerm(tom_get_slot_AritExp_t((( parser.rec.types.AritExp )((Object)ae))))

;
    		interpTermPr(tom_get_slot_AritExp_tp((( parser.rec.types.AritExp )((Object)ae))));
    	}}}}}


  }

  /*
  RelExp = RelExpLess(a1=AritExp)
	       | RelExpMore(a2=AritExp)
	       | RelExpDiferent(a3=AritExp)
           | RelExpLessEqual(a4=AritExp)
		   | RelExpMoreEqual(a5=AritExp)
  */
  private void interpRelExp(RelExp re) {
     {{if (tom_is_sort_RelExp(((Object)re))) {if (tom_is_sort_RelExp((( parser.rec.types.RelExp )((Object)re)))) {if (tom_is_fun_sym_RelExpLess((( parser.rec.types.RelExp )(( parser.rec.types.RelExp )((Object)re))))) {

    		if(!operadores.contains("<")) operadores.add("<");
    		interpAritExp(tom_get_slot_RelExpLess_a1((( parser.rec.types.RelExp )((Object)re))));
    	}}}}{if (tom_is_sort_RelExp(((Object)re))) {if (tom_is_sort_RelExp((( parser.rec.types.RelExp )((Object)re)))) {if (tom_is_fun_sym_RelExpMore((( parser.rec.types.RelExp )(( parser.rec.types.RelExp )((Object)re))))) {


    		if(!operadores.contains(">")) operadores.add(">");
    		interpAritExp(tom_get_slot_RelExpMore_a2((( parser.rec.types.RelExp )((Object)re))));
    	}}}}{if (tom_is_sort_RelExp(((Object)re))) {if (tom_is_sort_RelExp((( parser.rec.types.RelExp )((Object)re)))) {if (tom_is_fun_sym_RelExpDiferent((( parser.rec.types.RelExp )(( parser.rec.types.RelExp )((Object)re))))) {


    		if(!operadores.contains("<>")) operadores.add("<>");
    		interpAritExp(tom_get_slot_RelExpDiferent_a3((( parser.rec.types.RelExp )((Object)re))));
    	}}}}{if (tom_is_sort_RelExp(((Object)re))) {if (tom_is_sort_RelExp((( parser.rec.types.RelExp )((Object)re)))) {if (tom_is_fun_sym_RelExpLessEqual((( parser.rec.types.RelExp )(( parser.rec.types.RelExp )((Object)re))))) {


    		if(!operadores.contains("<=")) operadores.add("<=");
    		interpAritExp(tom_get_slot_RelExpLessEqual_a4((( parser.rec.types.RelExp )((Object)re))));
    	}}}}{if (tom_is_sort_RelExp(((Object)re))) {if (tom_is_sort_RelExp((( parser.rec.types.RelExp )((Object)re)))) {if (tom_is_fun_sym_RelExpMoreEqual((( parser.rec.types.RelExp )(( parser.rec.types.RelExp )((Object)re))))) {


    		if(!operadores.contains(">=")) operadores.add(">=");
    		interpAritExp(tom_get_slot_RelExpMoreEqual_a5((( parser.rec.types.RelExp )((Object)re))));
    	}}}}{if (tom_is_sort_RelExp(((Object)re))) {if (tom_is_sort_RelExp((( parser.rec.types.RelExp )((Object)re)))) {if (tom_is_fun_sym_RelExpEmpty((( parser.rec.types.RelExp )(( parser.rec.types.RelExp )((Object)re))))) {


    	}}}}}


  }

  // Term = Term(f:Factor, fp:FactorPr)
  private void interpTerm(Term t) {
     {{if (tom_is_sort_Term(((Object)t))) {if (tom_is_sort_Term((( parser.rec.types.Term )((Object)t)))) {if (tom_is_fun_sym_Term((( parser.rec.types.Term )(( parser.rec.types.Term )((Object)t))))) {interpFactor(tom_get_slot_Term_f((( parser.rec.types.Term )((Object)t))))

;
    		interpFactorPr(tom_get_slot_Term_fp((( parser.rec.types.Term )((Object)t))));
    	}}}}}


  }

  /*
  TermPr = TermPrPlus(t:Term, tp:TermPr)
	   	   | TermPrNeg(t:Term, tp:TermPr)
	   	   | TermPrEqual(t:Term, tp:TermPr)
  */
  private void interpTermPr(TermPr tPr) {
     {{if (tom_is_sort_TermPr(((Object)tPr))) {if (tom_is_sort_TermPr((( parser.rec.types.TermPr )((Object)tPr)))) {if (tom_is_fun_sym_TermPrPlus((( parser.rec.types.TermPr )(( parser.rec.types.TermPr )((Object)tPr))))) {

    		if(!operadores.contains("+")) operadores.add("+");
    		interpTerm(tom_get_slot_TermPrPlus_t((( parser.rec.types.TermPr )((Object)tPr))));
    		interpTermPr(tom_get_slot_TermPrPlus_tp((( parser.rec.types.TermPr )((Object)tPr))));
    	}}}}{if (tom_is_sort_TermPr(((Object)tPr))) {if (tom_is_sort_TermPr((( parser.rec.types.TermPr )((Object)tPr)))) {if (tom_is_fun_sym_TermPrNeg((( parser.rec.types.TermPr )(( parser.rec.types.TermPr )((Object)tPr))))) {


    		if(!operadores.contains("-")) operadores.add("-");
    		interpTerm(tom_get_slot_TermPrNeg_t((( parser.rec.types.TermPr )((Object)tPr))));
    		interpTermPr(tom_get_slot_TermPrNeg_tp((( parser.rec.types.TermPr )((Object)tPr))));
    	}}}}{if (tom_is_sort_TermPr(((Object)tPr))) {if (tom_is_sort_TermPr((( parser.rec.types.TermPr )((Object)tPr)))) {if (tom_is_fun_sym_TermPrEqual((( parser.rec.types.TermPr )(( parser.rec.types.TermPr )((Object)tPr))))) {


    		if(!operadores.contains("=")) operadores.add("=");
    		interpTerm(tom_get_slot_TermPrEqual_t((( parser.rec.types.TermPr )((Object)tPr))));
    		interpTermPr(tom_get_slot_TermPrEqual_tp((( parser.rec.types.TermPr )((Object)tPr))));
    	}}}}{if (tom_is_sort_TermPr(((Object)tPr))) {if (tom_is_sort_TermPr((( parser.rec.types.TermPr )((Object)tPr)))) {if (tom_is_fun_sym_TermPrEmpty((( parser.rec.types.TermPr )(( parser.rec.types.TermPr )((Object)tPr))))) {


    	}}}}}


  }


  /*
  FactorPr = Times(f:Factor, fp:FactorPr)
			 | Div(f:Factor, fp:FactorPr)
  */
  private void interpFactorPr(FactorPr fPr) {
     {{if (tom_is_sort_FactorPr(((Object)fPr))) {if (tom_is_sort_FactorPr((( parser.rec.types.FactorPr )((Object)fPr)))) {if (tom_is_fun_sym_Times((( parser.rec.types.FactorPr )(( parser.rec.types.FactorPr )((Object)fPr))))) {

    		if(!operadores.contains("*")) operadores.add("*");
    		interpFactor(tom_get_slot_Times_f((( parser.rec.types.FactorPr )((Object)fPr))));
    		interpFactorPr(tom_get_slot_Times_fp((( parser.rec.types.FactorPr )((Object)fPr))));
    	}}}}{if (tom_is_sort_FactorPr(((Object)fPr))) {if (tom_is_sort_FactorPr((( parser.rec.types.FactorPr )((Object)fPr)))) {if (tom_is_fun_sym_Div((( parser.rec.types.FactorPr )(( parser.rec.types.FactorPr )((Object)fPr))))) {


    		if(!operadores.contains("/")) operadores.add("/");
    		interpFactor(tom_get_slot_Div_f((( parser.rec.types.FactorPr )((Object)fPr))));
    		interpFactorPr(tom_get_slot_Div_fp((( parser.rec.types.FactorPr )((Object)fPr))));
    	}}}}{if (tom_is_sort_FactorPr(((Object)fPr))) {if (tom_is_sort_FactorPr((( parser.rec.types.FactorPr )((Object)fPr)))) {if (tom_is_fun_sym_FactorPrEmpty((( parser.rec.types.FactorPr )(( parser.rec.types.FactorPr )((Object)fPr))))) {


    	}}}}}


  }

  /*
  Factor = FNil()
		   | FInteger(i:int)
		   | FString(s:String)
		   | FExpList(el:ExpList)
		   | FNeg(e1:Exp)
		   | FWhile(e1:Exp, e2:Exp)
		   | FFor(id:String, e1:Exp, e2:Exp, e3:Exp)
		   | FBreak()
		   | FLet(dl:DecList, el:ExpList)
		   | FLvalue(lv:LValue)
		   | FIfThen(e1:Exp, e2:Exp)
		   | FIfThenElse(e1:Exp, e2:Exp, e3:Exp)
  */
  private void interpFactor(Factor f) {
     {{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FNil((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) {

    		if(!operandos.contains("nil")) operandos.add("nil");
    		nOperandos++;
    		//System.out.println("NIL");
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FInteger((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) { int  tom_i=tom_get_slot_FInteger_i((( parser.rec.types.Factor )((Object)f)));


    		if(!operandos.contains(Integer.toString(tom_i))) operandos.add(Integer.toString(tom_i));
    		nOperandos++;
    		//System.out.println(Integer.toString(`i));
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FString((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) { String  tom_s=tom_get_slot_FString_s((( parser.rec.types.Factor )((Object)f)));


    		if(!operandos.contains(tom_s)) operandos.add(tom_s);
    		nOperandos++;
    		//System.out.println(`s);
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FExpList((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) {


    		if(!operadores.contains("(")) operadores.add("(");
    		interpExpList(tom_get_slot_FExpList_el((( parser.rec.types.Factor )((Object)f))));
    		if(!operadores.contains(")")) operadores.add(")");
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FNeg((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) {


    		if(!operadores.contains("-")) operadores.add("-");
    		interpExp(tom_get_slot_FNeg_e1((( parser.rec.types.Factor )((Object)f))));
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FWhile((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) {


    		if(!operadores.contains("while")) operadores.add("while");
    		interpExp(tom_get_slot_FWhile_e1((( parser.rec.types.Factor )((Object)f))));
    		if(!operadores.contains("do")) operadores.add("do");
    		interpExp(tom_get_slot_FWhile_e2((( parser.rec.types.Factor )((Object)f))));
    		nMcCabe++;
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FFor((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) { String  tom_id=tom_get_slot_FFor_id((( parser.rec.types.Factor )((Object)f)));


    		if(!operadores.contains("for")) operadores.add("for");
    		if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		nOperandos++;
    		if(!operadores.contains(":=")) operadores.add(":=");
    		interpExp(tom_get_slot_FFor_e1((( parser.rec.types.Factor )((Object)f))));
    		if(!operadores.contains("to")) operadores.add("to");
    		interpExp(tom_get_slot_FFor_e2((( parser.rec.types.Factor )((Object)f))));
    		if(!operadores.contains("do")) operadores.add("do");
    		interpExp(tom_get_slot_FFor_e3((( parser.rec.types.Factor )((Object)f))));
    		nMcCabe++;
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FBreak((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) {


    		if(!operadores.contains("break")) operadores.add("break");
    		//System.out.println("Break");
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FLet((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) {


    		if(!operadores.contains("let")) operadores.add("let");
    		interpDecList(tom_get_slot_FLet_dl((( parser.rec.types.Factor )((Object)f))));
    		if(!operadores.contains("in")) operadores.add("in");
    		interpExpList(tom_get_slot_FLet_el((( parser.rec.types.Factor )((Object)f))));
    		if(!operadores.contains("end")) operadores.add("end");
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FLvalue((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) {interpLValue(tom_get_slot_FLvalue_lv((( parser.rec.types.Factor )((Object)f))))


;
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FIfThen((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) {


    		if(!operadores.contains("if")) operadores.add("if");
    		interpExp(tom_get_slot_FIfThen_e1((( parser.rec.types.Factor )((Object)f))));
    		if(!operadores.contains("then")) operadores.add("then");
    		interpExp(tom_get_slot_FIfThen_e2((( parser.rec.types.Factor )((Object)f))));
    		nMcCabe++;
    	}}}}{if (tom_is_sort_Factor(((Object)f))) {if (tom_is_sort_Factor((( parser.rec.types.Factor )((Object)f)))) {if (tom_is_fun_sym_FIfThenElse((( parser.rec.types.Factor )(( parser.rec.types.Factor )((Object)f))))) {


    		if(!operadores.contains("if")) operadores.add("if");
    		interpExp(tom_get_slot_FIfThenElse_e1((( parser.rec.types.Factor )((Object)f))));
    		if(!operadores.contains("then")) operadores.add("then");
    		interpExp(tom_get_slot_FIfThenElse_e2((( parser.rec.types.Factor )((Object)f))));
    		if(!operadores.contains("else")) operadores.add("else");
    		interpExp(tom_get_slot_FIfThenElse_e3((( parser.rec.types.Factor )((Object)f))));
    		nMcCabe++;
    	}}}}}

     //System.out.println("Interp Factor: " + f);
     //nErros++;
  }

  // DecList = DecList(Dec*)
  private void interpDecList(DecList list) {
     {{if (tom_is_sort_DecList(((Object)list))) {if (tom_is_fun_sym_DecList((( parser.rec.types.DecList )(( parser.rec.types.DecList )((Object)list))))) {if (!(tom_is_empty_DecList_DecList((( parser.rec.types.DecList )((Object)list))))) {interpDec(tom_get_head_DecList_DecList((( parser.rec.types.DecList )((Object)list))))

;
    		 interpDecList(tom_get_tail_DecList_DecList((( parser.rec.types.DecList )((Object)list))));
    	 }}}}}


  }

  /*
  Dec = DTyDec(td:TyDec)
		| DVarDec(vd:VarDec)
		| DFunDec(fd:FunDec)
  */
  private void interpDec(Dec d) {
     {{if (tom_is_sort_Dec(((Object)d))) {if (tom_is_sort_Dec((( parser.rec.types.Dec )((Object)d)))) {if (tom_is_fun_sym_DTyDec((( parser.rec.types.Dec )(( parser.rec.types.Dec )((Object)d))))) {interpTyDec(tom_get_slot_DTyDec_td((( parser.rec.types.Dec )((Object)d))))

;
    	 }}}}{if (tom_is_sort_Dec(((Object)d))) {if (tom_is_sort_Dec((( parser.rec.types.Dec )((Object)d)))) {if (tom_is_fun_sym_DVarDec((( parser.rec.types.Dec )(( parser.rec.types.Dec )((Object)d))))) {interpVarDec(tom_get_slot_DVarDec_vd((( parser.rec.types.Dec )((Object)d))))


;
    	 }}}}{if (tom_is_sort_Dec(((Object)d))) {if (tom_is_sort_Dec((( parser.rec.types.Dec )((Object)d)))) {if (tom_is_fun_sym_DFunDec((( parser.rec.types.Dec )(( parser.rec.types.Dec )((Object)d))))) {interpFunDec(tom_get_slot_DFunDec_fd((( parser.rec.types.Dec )((Object)d))))


;
    	 }}}}}


  }

  // TyDec = TyDec(ti:TypeId, t:Ty)
  private void interpTyDec(TyDec td) {
     {{if (tom_is_sort_TyDec(((Object)td))) {if (tom_is_sort_TyDec((( parser.rec.types.TyDec )((Object)td)))) {if (tom_is_fun_sym_TyDec((( parser.rec.types.TyDec )(( parser.rec.types.TyDec )((Object)td))))) {

    		 if(!operadores.contains("type")) operadores.add("type");
    		 interpTypeId(tom_get_slot_TyDec_ti((( parser.rec.types.TyDec )((Object)td))));
    		 if(!operadores.contains("=")) operadores.add("=");
    		 interpTy(tom_get_slot_TyDec_t((( parser.rec.types.TyDec )((Object)td))));
    	 }}}}}


  }

  /*
  Ty = TFieldList(fl:FieldList)
	   | TArrayOf(ti:TypeId)
	   | TTypeId(ti:TypeId)
  */
  private void interpTy(Ty t) {
	   {{if (tom_is_sort_Ty(((Object)t))) {if (tom_is_sort_Ty((( parser.rec.types.Ty )((Object)t)))) {if (tom_is_fun_sym_TFieldList((( parser.rec.types.Ty )(( parser.rec.types.Ty )((Object)t))))) {

    		 if(!operadores.contains("{")) operadores.add("{");
    		 interpFieldList(tom_get_slot_TFieldList_fl((( parser.rec.types.Ty )((Object)t))));
    		 if(!operadores.contains("}")) operadores.add("}");
    	 }}}}{if (tom_is_sort_Ty(((Object)t))) {if (tom_is_sort_Ty((( parser.rec.types.Ty )((Object)t)))) {if (tom_is_fun_sym_TArrayOf((( parser.rec.types.Ty )(( parser.rec.types.Ty )((Object)t))))) {


    		 if(!operadores.contains("array of")) operadores.add("array of");
    		 interpTypeId(tom_get_slot_TArrayOf_ti((( parser.rec.types.Ty )((Object)t))));
    	 }}}}{if (tom_is_sort_Ty(((Object)t))) {if (tom_is_sort_Ty((( parser.rec.types.Ty )((Object)t)))) {if (tom_is_fun_sym_TTypeId((( parser.rec.types.Ty )(( parser.rec.types.Ty )((Object)t))))) {interpTypeId(tom_get_slot_TTypeId_ti((( parser.rec.types.Ty )((Object)t))))


;
    	 }}}}}


  }

  /*
  FieldList = FieldListDP(d:String, ti:TypeId, a:AuxFieldList)
	          | FieldListEqual(id:String, ti:TypeId, a:AuxFieldList)
  */
   private void interpFieldList(FieldList fl) {
	   {{if (tom_is_sort_FieldList(((Object)fl))) {if (tom_is_sort_FieldList((( parser.rec.types.FieldList )((Object)fl)))) {if (tom_is_fun_sym_FieldListDP((( parser.rec.types.FieldList )(( parser.rec.types.FieldList )((Object)fl))))) { String  tom_id=tom_get_slot_FieldListDP_d((( parser.rec.types.FieldList )((Object)fl)));

    		 if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains(":")) operadores.add(":");
    		 interpTypeId(tom_get_slot_FieldListDP_ti((( parser.rec.types.FieldList )((Object)fl))));
    		 interpAuxFieldList(tom_get_slot_FieldListDP_a((( parser.rec.types.FieldList )((Object)fl))));
    	 }}}}{if (tom_is_sort_FieldList(((Object)fl))) {if (tom_is_sort_FieldList((( parser.rec.types.FieldList )((Object)fl)))) {if (tom_is_fun_sym_FieldListEqual((( parser.rec.types.FieldList )(( parser.rec.types.FieldList )((Object)fl))))) { String  tom_id=tom_get_slot_FieldListEqual_id((( parser.rec.types.FieldList )((Object)fl)));


    		 if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains("=")) operadores.add("=");
    		 interpTypeId(tom_get_slot_FieldListEqual_ti((( parser.rec.types.FieldList )((Object)fl))));
    		 interpAuxFieldList(tom_get_slot_FieldListEqual_a((( parser.rec.types.FieldList )((Object)fl))));
    	 }}}}{if (tom_is_sort_FieldList(((Object)fl))) {if (tom_is_sort_FieldList((( parser.rec.types.FieldList )((Object)fl)))) {if (tom_is_fun_sym_FieldListEmpty((( parser.rec.types.FieldList )(( parser.rec.types.FieldList )((Object)fl))))) {


    	 }}}}}


   }

   // AuxFieldList = AuxFieldList(IntFieldList*)
   private void interpAuxFieldList(AuxFieldList afl) {
	   {{if (tom_is_sort_AuxFieldList(((Object)afl))) {if (tom_is_fun_sym_AuxFieldList((( parser.rec.types.AuxFieldList )(( parser.rec.types.AuxFieldList )((Object)afl))))) {if (!(tom_is_empty_AuxFieldList_AuxFieldList((( parser.rec.types.AuxFieldList )((Object)afl))))) {interpIntFieldList(tom_get_head_AuxFieldList_AuxFieldList((( parser.rec.types.AuxFieldList )((Object)afl))))

;
    		 interpAuxFieldList(tom_get_tail_AuxFieldList_AuxFieldList((( parser.rec.types.AuxFieldList )((Object)afl))));
    	 }}}}}


   }


   /*
   IntFieldList = IntFieldList1(id:String, a:Aux1)
			     | IntFieldList2(e1:Exp)
				 | IntFieldList3(e1:Exp, e2:Exp)
   */
   private void interpIntFieldList(IntFieldList ifl) {
	   {{if (tom_is_sort_IntFieldList(((Object)ifl))) {if (tom_is_sort_IntFieldList((( parser.rec.types.IntFieldList )((Object)ifl)))) {if (tom_is_fun_sym_IntFieldList1((( parser.rec.types.IntFieldList )(( parser.rec.types.IntFieldList )((Object)ifl))))) { String  tom_id=tom_get_slot_IntFieldList1_id((( parser.rec.types.IntFieldList )((Object)ifl)));

    		if(!operadores.contains(",")) operadores.add(",");
    		if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		nOperandos++;
    		 //System.out.println(`id);
    		 interpAux1(tom_get_slot_IntFieldList1_a((( parser.rec.types.IntFieldList )((Object)ifl))));
    	}}}}{if (tom_is_sort_IntFieldList(((Object)ifl))) {if (tom_is_sort_IntFieldList((( parser.rec.types.IntFieldList )((Object)ifl)))) {if (tom_is_fun_sym_IntFieldList2((( parser.rec.types.IntFieldList )(( parser.rec.types.IntFieldList )((Object)ifl))))) {


    		 if(!operadores.contains("[")) operadores.add("[");
    		 interpExp(tom_get_slot_IntFieldList2_e1((( parser.rec.types.IntFieldList )((Object)ifl))));
    		 if(!operadores.contains("]")) operadores.add("]");
    	}}}}{if (tom_is_sort_IntFieldList(((Object)ifl))) {if (tom_is_sort_IntFieldList((( parser.rec.types.IntFieldList )((Object)ifl)))) {if (tom_is_fun_sym_IntFieldList3((( parser.rec.types.IntFieldList )(( parser.rec.types.IntFieldList )((Object)ifl))))) {


    		 if(!operadores.contains("[")) operadores.add("[");
    		 interpExp(tom_get_slot_IntFieldList3_e1((( parser.rec.types.IntFieldList )((Object)ifl))));
    		 if(!operadores.contains("]")) operadores.add("]");
    		 if(!operadores.contains("of")) operadores.add("of");
    		 interpExp(tom_get_slot_IntFieldList3_e2((( parser.rec.types.IntFieldList )((Object)ifl))));

    	}}}}}


   }

   /*
   Aux1 = Aux11(ti:TypeId)
		 | Aux12(ti:TypeId)
   */
   private void interpAux1(Aux1 a) {
	   {{if (tom_is_sort_Aux1(((Object)a))) {if (tom_is_sort_Aux1((( parser.rec.types.Aux1 )((Object)a)))) {if (tom_is_fun_sym_Aux11((( parser.rec.types.Aux1 )(( parser.rec.types.Aux1 )((Object)a))))) {

    		 if(!operadores.contains(":")) operadores.add(":");
    		 interpTypeId(tom_get_slot_Aux11_ti((( parser.rec.types.Aux1 )((Object)a))));
    	 }}}}{if (tom_is_sort_Aux1(((Object)a))) {if (tom_is_sort_Aux1((( parser.rec.types.Aux1 )((Object)a)))) {if (tom_is_fun_sym_Aux12((( parser.rec.types.Aux1 )(( parser.rec.types.Aux1 )((Object)a))))) {


    		 if(!operadores.contains("=")) operadores.add("=");
    		 interpTypeId(tom_get_slot_Aux12_ti((( parser.rec.types.Aux1 )((Object)a))));
    	 }}}}}


    }

    /*
    TypeId = TypeId(id:String)
		   | TypeIdString(s:String)
	       | TypeIdInteger(i:int)
	       | TypeIdNil()

    */
   private void interpTypeId(TypeId ti) {
	   {{if (tom_is_sort_TypeId(((Object)ti))) {if (tom_is_sort_TypeId((( parser.rec.types.TypeId )((Object)ti)))) {if (tom_is_fun_sym_TypeId((( parser.rec.types.TypeId )(( parser.rec.types.TypeId )((Object)ti))))) { String  tom_id=tom_get_slot_TypeId_id((( parser.rec.types.TypeId )((Object)ti)));

    		 if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		 nOperandos++;
    		 //System.out.println(`id);
    	 }}}}{if (tom_is_sort_TypeId(((Object)ti))) {if (tom_is_sort_TypeId((( parser.rec.types.TypeId )((Object)ti)))) {if (tom_is_fun_sym_TypeIdString((( parser.rec.types.TypeId )(( parser.rec.types.TypeId )((Object)ti))))) { String  tom_s=tom_get_slot_TypeIdString_s((( parser.rec.types.TypeId )((Object)ti)));


    		 if(!operandos.contains(tom_s)) operandos.add(tom_s);
    		 nOperandos++;
    		 //System.out.println(`s);
    	 }}}}{if (tom_is_sort_TypeId(((Object)ti))) {if (tom_is_sort_TypeId((( parser.rec.types.TypeId )((Object)ti)))) {if (tom_is_fun_sym_TypeIdInteger((( parser.rec.types.TypeId )(( parser.rec.types.TypeId )((Object)ti))))) { int  tom_i=tom_get_slot_TypeIdInteger_i((( parser.rec.types.TypeId )((Object)ti)));


    		 if(!operandos.contains(Integer.toString(tom_i))) operandos.add(Integer.toString(tom_i));
    		 nOperandos++;
    		 //System.out.println(Integer.toString(`i));
    	 }}}}{if (tom_is_sort_TypeId(((Object)ti))) {if (tom_is_sort_TypeId((( parser.rec.types.TypeId )((Object)ti)))) {if (tom_is_fun_sym_TypeIdNil((( parser.rec.types.TypeId )(( parser.rec.types.TypeId )((Object)ti))))) {


    		 if(!operandos.contains("nil")) operandos.add("nil");
    		 nOperandos++;
    		 //System.out.println("Nil");
    	 }}}}}

	   //System.out.println("Interp TypeID: " + ti);
	   //nErros++;
   }

   /*
   VarDec = VarDec1(id:String, a:Aux2)
	       | VarDec2(id:String, ti:TypeId, a:Aux2)
   */
   private void interpVarDec(VarDec vd) {
	   {{if (tom_is_sort_VarDec(((Object)vd))) {if (tom_is_sort_VarDec((( parser.rec.types.VarDec )((Object)vd)))) {if (tom_is_fun_sym_VarDec1((( parser.rec.types.VarDec )(( parser.rec.types.VarDec )((Object)vd))))) { String  tom_id=tom_get_slot_VarDec1_id((( parser.rec.types.VarDec )((Object)vd)));

    		 if(!operadores.contains("var")) operadores.add("var");
    		 if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 interpAux2(tom_get_slot_VarDec1_a((( parser.rec.types.VarDec )((Object)vd))));
    	 }}}}{if (tom_is_sort_VarDec(((Object)vd))) {if (tom_is_sort_VarDec((( parser.rec.types.VarDec )((Object)vd)))) {if (tom_is_fun_sym_VarDec2((( parser.rec.types.VarDec )(( parser.rec.types.VarDec )((Object)vd))))) { String  tom_id=tom_get_slot_VarDec2_id((( parser.rec.types.VarDec )((Object)vd)));


    		 if(!operadores.contains("var")) operadores.add("var");
    		 if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains(":")) operadores.add(":");
    		 interpTypeId(tom_get_slot_VarDec2_ti((( parser.rec.types.VarDec )((Object)vd))));
    		 interpAux2(tom_get_slot_VarDec2_a((( parser.rec.types.VarDec )((Object)vd))));
    	 }}}}}


   }

   /*
   Aux2 = Aux21(e:Exp)
		 | Aux22(e:Exp)
   */
   private void interpAux2(Aux2 a) {
	   {{if (tom_is_sort_Aux2(((Object)a))) {if (tom_is_sort_Aux2((( parser.rec.types.Aux2 )((Object)a)))) {if (tom_is_fun_sym_Aux21((( parser.rec.types.Aux2 )(( parser.rec.types.Aux2 )((Object)a))))) {

    		 if(!operadores.contains(":=")) operadores.add(":=");
    		 interpExp(tom_get_slot_Aux21_e((( parser.rec.types.Aux2 )((Object)a))));
    	 }}}}{if (tom_is_sort_Aux2(((Object)a))) {if (tom_is_sort_Aux2((( parser.rec.types.Aux2 )((Object)a)))) {if (tom_is_fun_sym_Aux22((( parser.rec.types.Aux2 )(( parser.rec.types.Aux2 )((Object)a))))) {


    		 if(!operadores.contains("=")) operadores.add("=");
    		 interpExp(tom_get_slot_Aux22_e((( parser.rec.types.Aux2 )((Object)a))));
    	 }}}}}


   }

   /*
   FunDec = FunDec1(id:String, fl:FieldList, e1:Exp)
		   | FunDec2(id:String, fl:FieldList, ti:TypeId, e1:Exp)
   */
   private void interpFunDec(FunDec fd) {
	   {{if (tom_is_sort_FunDec(((Object)fd))) {if (tom_is_sort_FunDec((( parser.rec.types.FunDec )((Object)fd)))) {if (tom_is_fun_sym_FunDec1((( parser.rec.types.FunDec )(( parser.rec.types.FunDec )((Object)fd))))) { String  tom_id=tom_get_slot_FunDec1_id((( parser.rec.types.FunDec )((Object)fd)));

    		 if(!operadores.contains("function")) operadores.add("function");
    		 nFuncoes++;
    		 if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains("(")) operadores.add("(");
    		 interpFieldList(tom_get_slot_FunDec1_fl((( parser.rec.types.FunDec )((Object)fd))));
    		 if(!operadores.contains(")")) operadores.add(")");
    		 if(!operadores.contains("=")) operadores.add("=");
    		 interpExp(tom_get_slot_FunDec1_e1((( parser.rec.types.FunDec )((Object)fd))));
    	 }}}}{if (tom_is_sort_FunDec(((Object)fd))) {if (tom_is_sort_FunDec((( parser.rec.types.FunDec )((Object)fd)))) {if (tom_is_fun_sym_FunDec2((( parser.rec.types.FunDec )(( parser.rec.types.FunDec )((Object)fd))))) { String  tom_id=tom_get_slot_FunDec2_id((( parser.rec.types.FunDec )((Object)fd)));


    		 if(!operadores.contains("function")) operadores.add("function");
    		 nFuncoes++;
    		 if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains("(")) operadores.add("(");
    		 interpFieldList(tom_get_slot_FunDec2_fl((( parser.rec.types.FunDec )((Object)fd))));
    		 if(!operadores.contains(")")) operadores.add(")");
    		 if(!operadores.contains(":")) operadores.add(":");
    		 if(!operadores.contains("=")) operadores.add("=");
    		 interpTypeId(tom_get_slot_FunDec2_ti((( parser.rec.types.FunDec )((Object)fd))));
    		 interpExp(tom_get_slot_FunDec2_e1((( parser.rec.types.FunDec )((Object)fd))));
    	 }}}}}


   }

   // LValue = LValue(id:String, fra:FunctionRecordArray)
   private void interpLValue(LValue lv) {
	   {{if (tom_is_sort_LValue(((Object)lv))) {if (tom_is_sort_LValue((( parser.rec.types.LValue )((Object)lv)))) {if (tom_is_fun_sym_LValue((( parser.rec.types.LValue )(( parser.rec.types.LValue )((Object)lv))))) { String  tom_id=tom_get_slot_LValue_id((( parser.rec.types.LValue )((Object)lv)));

    		 if(!operandos.contains(tom_id)) operandos.add(tom_id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 interpFunctionRecordArray(tom_get_slot_LValue_fra((( parser.rec.types.LValue )((Object)lv))));
    	 }}}}}


   }

   /*
   FunctionRecordArray = FRAArgList(al:ArgList)
						| FRAFieldList(fl:FieldList)
						| FRA1(a1:AuxFRA1)
						| FRA2(a2:AuxFRA2)
						| FRA3(a1:AuxFRA1, a2:AuxFRA2)
						| FunctionRecordArrayEmpty()
   */
   private void interpFunctionRecordArray(FunctionRecordArray fra) {
	   {{if (tom_is_sort_FunctionRecordArray(((Object)fra))) {if (tom_is_sort_FunctionRecordArray((( parser.rec.types.FunctionRecordArray )((Object)fra)))) {if (tom_is_fun_sym_FRAArgList((( parser.rec.types.FunctionRecordArray )(( parser.rec.types.FunctionRecordArray )((Object)fra))))) {

    		 if(!operadores.contains("(")) operadores.add("(");
    		 interpArgList(tom_get_slot_FRAArgList_al((( parser.rec.types.FunctionRecordArray )((Object)fra))));
    		 if(!operadores.contains(")")) operadores.add(")");
    	 }}}}{if (tom_is_sort_FunctionRecordArray(((Object)fra))) {if (tom_is_sort_FunctionRecordArray((( parser.rec.types.FunctionRecordArray )((Object)fra)))) {if (tom_is_fun_sym_FRAFieldList((( parser.rec.types.FunctionRecordArray )(( parser.rec.types.FunctionRecordArray )((Object)fra))))) {


    		 if(!operadores.contains("{")) operadores.add("{");
    		 interpFieldList(tom_get_slot_FRAFieldList_fl((( parser.rec.types.FunctionRecordArray )((Object)fra))));
    		 if(!operadores.contains("}")) operadores.add("}");
    	 }}}}{if (tom_is_sort_FunctionRecordArray(((Object)fra))) {if (tom_is_sort_FunctionRecordArray((( parser.rec.types.FunctionRecordArray )((Object)fra)))) {if (tom_is_fun_sym_FRA1((( parser.rec.types.FunctionRecordArray )(( parser.rec.types.FunctionRecordArray )((Object)fra))))) {interpAuxFRA1(tom_get_slot_FRA1_a1((( parser.rec.types.FunctionRecordArray )((Object)fra))))


;
    	 }}}}{if (tom_is_sort_FunctionRecordArray(((Object)fra))) {if (tom_is_sort_FunctionRecordArray((( parser.rec.types.FunctionRecordArray )((Object)fra)))) {if (tom_is_fun_sym_FRA2((( parser.rec.types.FunctionRecordArray )(( parser.rec.types.FunctionRecordArray )((Object)fra))))) {interpAuxFRA2(tom_get_slot_FRA2_a2((( parser.rec.types.FunctionRecordArray )((Object)fra))))


;
    	 }}}}{if (tom_is_sort_FunctionRecordArray(((Object)fra))) {if (tom_is_sort_FunctionRecordArray((( parser.rec.types.FunctionRecordArray )((Object)fra)))) {if (tom_is_fun_sym_FRA3((( parser.rec.types.FunctionRecordArray )(( parser.rec.types.FunctionRecordArray )((Object)fra))))) {interpAuxFRA1(tom_get_slot_FRA3_a1((( parser.rec.types.FunctionRecordArray )((Object)fra))))


;
    		 interpAuxFRA2(tom_get_slot_FRA3_a2((( parser.rec.types.FunctionRecordArray )((Object)fra))));
    	 }}}}{if (tom_is_sort_FunctionRecordArray(((Object)fra))) {if (tom_is_sort_FunctionRecordArray((( parser.rec.types.FunctionRecordArray )((Object)fra)))) {if (tom_is_fun_sym_FunctionRecordArrayEmpty((( parser.rec.types.FunctionRecordArray )(( parser.rec.types.FunctionRecordArray )((Object)fra))))) {


    	 }}}}}


   }

   // AuxFRA1 = AuxFRA1(e1:Exp)
   private void interpAuxFRA1(AuxFRA1 aFRA1) {
	   {{if (tom_is_sort_AuxFRA1(((Object)aFRA1))) {if (tom_is_sort_AuxFRA1((( parser.rec.types.AuxFRA1 )((Object)aFRA1)))) {if (tom_is_fun_sym_AuxFRA1((( parser.rec.types.AuxFRA1 )(( parser.rec.types.AuxFRA1 )((Object)aFRA1))))) {

    		 if(!operadores.contains("[")) operadores.add("[");
    		 interpExp(tom_get_slot_AuxFRA1_e1((( parser.rec.types.AuxFRA1 )((Object)aFRA1))));
    		 if(!operadores.contains("]")) operadores.add("]");
    	 }}}}}


   }

   /*
   AuxFRA2 = AuxFRA21(e1:Exp)
	        | AuxFRA22(a3:Aux3, e2:Exp)
	        | AuxFRA23(a3:Aux3, a4:Aux4, e2:Exp)
			| AuxFRA24(a4:Aux4, e2:Exp)
   */
   private void interpAuxFRA2(AuxFRA2 aFRA2) {
	   {{if (tom_is_sort_AuxFRA2(((Object)aFRA2))) {if (tom_is_sort_AuxFRA2((( parser.rec.types.AuxFRA2 )((Object)aFRA2)))) {if (tom_is_fun_sym_AuxFRA21((( parser.rec.types.AuxFRA2 )(( parser.rec.types.AuxFRA2 )((Object)aFRA2))))) {

    		 if(!operadores.contains("of")) operadores.add("of");
    		 interpExp(tom_get_slot_AuxFRA21_e1((( parser.rec.types.AuxFRA2 )((Object)aFRA2))));
    	 }}}}{if (tom_is_sort_AuxFRA2(((Object)aFRA2))) {if (tom_is_sort_AuxFRA2((( parser.rec.types.AuxFRA2 )((Object)aFRA2)))) {if (tom_is_fun_sym_AuxFRA22((( parser.rec.types.AuxFRA2 )(( parser.rec.types.AuxFRA2 )((Object)aFRA2))))) {interpAux3(tom_get_slot_AuxFRA22_a3((( parser.rec.types.AuxFRA2 )((Object)aFRA2))))


;
    		 if(!operadores.contains(":=")) operadores.add(":=");
    		 interpExp(tom_get_slot_AuxFRA22_e2((( parser.rec.types.AuxFRA2 )((Object)aFRA2))));
    	 }}}}{if (tom_is_sort_AuxFRA2(((Object)aFRA2))) {if (tom_is_sort_AuxFRA2((( parser.rec.types.AuxFRA2 )((Object)aFRA2)))) {if (tom_is_fun_sym_AuxFRA23((( parser.rec.types.AuxFRA2 )(( parser.rec.types.AuxFRA2 )((Object)aFRA2))))) {interpAux3(tom_get_slot_AuxFRA23_a3((( parser.rec.types.AuxFRA2 )((Object)aFRA2))))


;
    		 interpAux4(tom_get_slot_AuxFRA23_a4((( parser.rec.types.AuxFRA2 )((Object)aFRA2))));
    		 if(!operadores.contains(":=")) operadores.add(":=");
    		 interpExp(tom_get_slot_AuxFRA23_e2((( parser.rec.types.AuxFRA2 )((Object)aFRA2))));
    	 }}}}{if (tom_is_sort_AuxFRA2(((Object)aFRA2))) {if (tom_is_sort_AuxFRA2((( parser.rec.types.AuxFRA2 )((Object)aFRA2)))) {if (tom_is_fun_sym_AuxFRA24((( parser.rec.types.AuxFRA2 )(( parser.rec.types.AuxFRA2 )((Object)aFRA2))))) {interpAux4(tom_get_slot_AuxFRA24_a4((( parser.rec.types.AuxFRA2 )((Object)aFRA2))))


;
    		 if(!operadores.contains(":=")) operadores.add(":=");
    		 interpExp(tom_get_slot_AuxFRA24_e2((( parser.rec.types.AuxFRA2 )((Object)aFRA2))));

    	 }}}}}


   }

   // Aux3 = Aux3(String*)
   private void interpAux3(Aux3 a) {
	   {{if (tom_is_sort_Aux3(((Object)a))) {if (tom_is_fun_sym_Aux3((( parser.rec.types.Aux3 )(( parser.rec.types.Aux3 )((Object)a))))) {if (!(tom_is_empty_Aux3_Aux3((( parser.rec.types.Aux3 )((Object)a))))) { String  tom_s=tom_get_head_Aux3_Aux3((( parser.rec.types.Aux3 )((Object)a)));

    		 if(!operadores.contains(".")) operadores.add(".");
    		 if(!operandos.contains(tom_s)) operandos.add(tom_s);
    		 nOperandos++;
    		 //System.out.println(`s);
    		 interpAux3(tom_get_tail_Aux3_Aux3((( parser.rec.types.Aux3 )((Object)a))));
    	 }}}}}


   }

   // Aux4 = Aux4(Exp*)
   private void interpAux4(Aux4 a) {
	   {{if (tom_is_sort_Aux4(((Object)a))) {if (tom_is_fun_sym_Aux4((( parser.rec.types.Aux4 )(( parser.rec.types.Aux4 )((Object)a))))) {if (!(tom_is_empty_Aux4_Aux4((( parser.rec.types.Aux4 )((Object)a))))) {

    		 if(!operadores.contains("[")) operadores.add("[");
    		 interpExp(tom_get_head_Aux4_Aux4((( parser.rec.types.Aux4 )((Object)a))));
    		 if(!operadores.contains("]")) operadores.add("]");
    		 interpAux4(tom_get_tail_Aux4_Aux4((( parser.rec.types.Aux4 )((Object)a))));
    	 }}}}}


   }

   /*
   ExpList = ExpList(e1:Exp, a:AuxExpList)
			| ExpListEmpty()
   */
   private void interpExpList(ExpList el) {
	   {{if (tom_is_sort_ExpList(((Object)el))) {if (tom_is_sort_ExpList((( parser.rec.types.ExpList )((Object)el)))) {if (tom_is_fun_sym_ExpList((( parser.rec.types.ExpList )(( parser.rec.types.ExpList )((Object)el))))) {interpExp(tom_get_slot_ExpList_e1((( parser.rec.types.ExpList )((Object)el))))

;
    		 interpAuxExpList(tom_get_slot_ExpList_a((( parser.rec.types.ExpList )((Object)el))));
    	 }}}}{if (tom_is_sort_ExpList(((Object)el))) {if (tom_is_sort_ExpList((( parser.rec.types.ExpList )((Object)el)))) {if (tom_is_fun_sym_ExpListEmpty((( parser.rec.types.ExpList )(( parser.rec.types.ExpList )((Object)el))))) {


    	 }}}}}


   }

   // AuxExpList = AuxExpList(Exp*)
   private void interpAuxExpList(AuxExpList ael) {
	   {{if (tom_is_sort_AuxExpList(((Object)ael))) {if (tom_is_fun_sym_AuxExpList((( parser.rec.types.AuxExpList )(( parser.rec.types.AuxExpList )((Object)ael))))) {if (!(tom_is_empty_AuxExpList_AuxExpList((( parser.rec.types.AuxExpList )((Object)ael))))) {

    		 if(!operadores.contains(";")) operadores.add(";");
    		 interpExp(tom_get_head_AuxExpList_AuxExpList((( parser.rec.types.AuxExpList )((Object)ael))));
    		 interpAuxExpList(tom_get_tail_AuxExpList_AuxExpList((( parser.rec.types.AuxExpList )((Object)ael))));
    	 }}}}}


   }

   /*
   ArgList = ArgList(e1:Exp, a:AuxArgList)
			| ArgListEmpty()
   */
   private void interpArgList(ArgList al) {
	   {{if (tom_is_sort_ArgList(((Object)al))) {if (tom_is_sort_ArgList((( parser.rec.types.ArgList )((Object)al)))) {if (tom_is_fun_sym_ArgList((( parser.rec.types.ArgList )(( parser.rec.types.ArgList )((Object)al))))) {

    		 if(!operadores.contains(";")) operadores.add(";");
    		 interpExp(tom_get_slot_ArgList_e1((( parser.rec.types.ArgList )((Object)al))));
    		 interpAuxArgList(tom_get_slot_ArgList_a((( parser.rec.types.ArgList )((Object)al))));
    	 }}}}{if (tom_is_sort_ArgList(((Object)al))) {if (tom_is_sort_ArgList((( parser.rec.types.ArgList )((Object)al)))) {if (tom_is_fun_sym_ArgListEmpty((( parser.rec.types.ArgList )(( parser.rec.types.ArgList )((Object)al))))) {


    	 }}}}}


   }

   // AuxArgList = AuxArgList(Exp*)
   private void interpAuxArgList(AuxArgList aal) {
	   {{if (tom_is_sort_AuxArgList(((Object)aal))) {if (tom_is_fun_sym_AuxArgList((( parser.rec.types.AuxArgList )(( parser.rec.types.AuxArgList )((Object)aal))))) {if (!(tom_is_empty_AuxArgList_AuxArgList((( parser.rec.types.AuxArgList )((Object)aal))))) {

    		 if(!operadores.contains(",")) operadores.add(",");
    		 interpExp(tom_get_head_AuxArgList_AuxArgList((( parser.rec.types.AuxArgList )((Object)aal))));
    		 interpAuxArgList(tom_get_tail_AuxArgList_AuxArgList((( parser.rec.types.AuxArgList )((Object)aal))));
    	 }}}}}


   }
}