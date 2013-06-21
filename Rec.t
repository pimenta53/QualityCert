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

  %include { rec/Rec.tom }

  private int nFuncoes = 0;
  private int nOperandos = 0;
  private int nNodos = 0;
  private int nArestas = 0;

  private List<String> operadores = new ArrayList<String>();
  private List<String> operandos = new ArrayList<String>();

  private String aux[] = new String[6];

  // Prog = Prog(e1:Exp)
  public String[] interpProg(Prog p) {
	  %match(p) {
    	Prog(e1) -> {
    		`interpExp(e1);

    		aux[0] = Integer.toString(nFuncoes);
    		aux[1] = Integer.toString(operadores.size());
    		aux[2] = Integer.toString(operandos.size());
    		aux[3] = Integer.toString(nOperandos);
    		aux[4] = Integer.toString(nNodos);
    		aux[5] = Integer.toString(nArestas);

    		 for(String s : operadores){
    			System.out.print(s + " ");
    		 }

    		 System.out.println("");

    		 for(String s : operandos){
     			System.out.print(s + " ");
     		 }

    		 System.out.println("");

    		return aux;
    	}
     }
     return aux;
  }

  // Exp = Exp(eop:ExpOR, eorp:ExpORPr)
  private void interpExp(Exp e) {
     %match(e) {
    	Exp(eop, eorp) -> {
    		`interpExpOR(eop);
    		`interpExpORPr(eorp);
    	}
     }
  }

  // ExpOR = ExpOR(ea:ExpAND, eap:ExpANDPr)
  private void interpExpOR(ExpOR eOR) {
     %match(eOR) {
    	ExpOR(ea, eap) -> {
    		`interpExpAND(ea);
    		`interpExpANDPr(eap);
    	}
     }
  }

  // ExpAND = ExpAND(ae:AritExp, re:RelExp)
  private void interpExpAND(ExpAND eAND) {
     %match(eAND) {
    	ExpAND(ae, re) -> {
    		`interpAritExp(ae);
    		`interpRelExp(re);
    	}
     }
  }


  // ExpORPr = ExpORPr(e1:Exp)
  private void interpExpORPr(ExpORPr eORPr) {
     %match(eORPr) {
    	ExpORPr(e1) -> {
    		if(!operadores.contains("|")) operadores.add("|");
    		`interpExp(e1);
    	}

    	ExpORPrEmpty() -> {
    	}
     }
  }

  // ExpANDPr = ExpANDPr(e1:Exp)
  private void interpExpANDPr(ExpANDPr eANDPr) {
     %match(eANDPr) {
    	ExpANDPr(e1) -> {
    		if(!operadores.contains("&")) operadores.add("&");
    		`interpExp(e1);
    	}

    	ExpANDPrEmpty() -> {
    	}
     }
  }

  // AritExp = AritExp(t:Term, tp:TermPr)
  private void interpAritExp(AritExp ae) {
     %match(ae) {
    	AritExp(t, tp) -> {
    		`interpTerm(t);
    		`interpTermPr(tp);
    	}
     }

  }

  /*
  RelExp = RelExpLess(a1=AritExp)
	       | RelExpMore(a2=AritExp)
	       | RelExpDiferent(a3=AritExp)
           | RelExpLessEqual(a4=AritExp)
		   | RelExpMoreEqual(a5=AritExp)
  */
  private void interpRelExp(RelExp re) {
     %match(re) {
    	RelExpLess(a1) -> {
    		if(!operadores.contains("<")) operadores.add("<");
    		`interpAritExp(a1);
    	}

    	RelExpMore(a2) -> {
    		if(!operadores.contains(">")) operadores.add(">");
    		`interpAritExp(a2);
    	}

    	RelExpDiferent(a3) -> {
    		if(!operadores.contains("<>")) operadores.add("<>");
    		`interpAritExp(a3);
    	}

    	RelExpLessEqual(a4) -> {
    		if(!operadores.contains("<=")) operadores.add("<=");
    		`interpAritExp(a4);
    	}

    	RelExpMoreEqual(a5) -> {
    		if(!operadores.contains(">=")) operadores.add(">=");
    		`interpAritExp(a5);
    	}

    	RelExpEmpty() -> {
    	}
     }

  }

  // Term = Term(f:Factor, fp:FactorPr)
  private void interpTerm(Term t) {
     %match(t) {
    	Term(f, fp) -> {
    		`interpFactor(f);
    		`interpFactorPr(fp);
    	}
     }

  }

  /*
  TermPr = TermPrPlus(t:Term, tp:TermPr)
	   	   | TermPrNeg(t:Term, tp:TermPr)
	   	   | TermPrEqual(t:Term, tp:TermPr)
  */
  private void interpTermPr(TermPr tPr) {
     %match(tPr) {
    	TermPrPlus(t, tp) -> {
    		if(!operadores.contains("+")) operadores.add("+");
    		`interpTerm(t);
    		`interpTermPr(tp);
    	}

    	TermPrNeg(t, tp) -> {
    		if(!operadores.contains("-")) operadores.add("-");
    		`interpTerm(t);
    		`interpTermPr(tp);
    	}

    	TermPrEqual(t, tp) -> {
    		if(!operadores.contains("=")) operadores.add("=");
    		`interpTerm(t);
    		`interpTermPr(tp);
    	}

    	TermPrEmpty() -> {
    	}
     }

  }


  /*
  FactorPr = Times(f:Factor, fp:FactorPr)
			 | Div(f:Factor, fp:FactorPr)
  */
  private void interpFactorPr(FactorPr fPr) {
     %match(fPr) {
    	Times(f, fp) -> {
    		if(!operadores.contains("*")) operadores.add("*");
    		`interpFactor(f);
    		`interpFactorPr(fp);
    	}

    	Div(f, fp) -> {
    		if(!operadores.contains("/")) operadores.add("/");
    		`interpFactor(f);
    		`interpFactorPr(fp);
    	}

    	FactorPrEmpty() -> {
    	}
     }

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
     %match(f) {
    	FNil() -> {
    		if(!operandos.contains("nil")) operandos.add("nil");
    		nOperandos++;
    		//System.out.println("NIL");
    	}

    	FInteger(i) -> {
    		if(!operandos.contains(Integer.toString(`i))) operandos.add(Integer.toString(`i));
    		nOperandos++;
    		//System.out.println(Integer.toString(`i));
    	}

    	FString(s) -> {
    		if(!operandos.contains(`s)) operandos.add(`s);
    		nOperandos++;
    		//System.out.println(`s);
    	}

    	FExpList(el) -> {
    		if(!operadores.contains("(")) operadores.add("(");
    		`interpExpList(el);
    		if(!operadores.contains(")")) operadores.add(")");
    	}

    	FNeg(e1) ->  {
    		if(!operadores.contains("-")) operadores.add("-");
    		`interpExp(e1);
    	}

    	FWhile(e1, e2) ->  {
    		if(!operadores.contains("while")) operadores.add("while");
    		`interpExp(e1);
    		if(!operadores.contains("do")) operadores.add("do");
    		`interpExp(e2);
    	}

    	FFor(id, e1, e2, e3) ->  {
    		if(!operadores.contains("for")) operadores.add("for");
    		if(!operandos.contains(`id)) operandos.add(`id);
    		nOperandos++;
    		if(!operadores.contains(":=")) operadores.add(":=");
    		`interpExp(e1);
    		if(!operadores.contains("to")) operadores.add("to");
    		`interpExp(e2);
    		if(!operadores.contains("do")) operadores.add("do");
    		`interpExp(e3);
    	}

    	FBreak() ->  {
    		if(!operadores.contains("break")) operadores.add("break");
    		//System.out.println("Break");
    	}

    	FLet(dl, el) ->  {
    		if(!operadores.contains("let")) operadores.add("let");
    		`interpDecList(dl);
    		if(!operadores.contains("in")) operadores.add("in");
    		`interpExpList(el);
    		if(!operadores.contains("end")) operadores.add("end");
    	}

    	FLvalue(lv) -> {
    		`interpLValue(lv);
    	}

    	FIfThen(e1, e2) -> {
    		if(!operadores.contains("if")) operadores.add("if");
    		`interpExp(e1);
    		if(!operadores.contains("then")) operadores.add("then");
    		`interpExp(e2);
    	}

    	FIfThenElse(e1, e2, e3) -> {
    		if(!operadores.contains("if")) operadores.add("if");
    		`interpExp(e1);
    		if(!operadores.contains("then")) operadores.add("then");
    		`interpExp(e2);
    		if(!operadores.contains("else")) operadores.add("else");
    		`interpExp(e3);
    	}
     }
     //System.out.println("Interp Factor: " + f);
     //nErros++;
  }

  // DecList = DecList(Dec*)
  private void interpDecList(DecList list) {
     %match(list) {
    	 DecList(d, tail*) ->{
    		 `interpDec(d);
    		 `interpDecList(tail*);
    	 }
     }

  }

  /*
  Dec = DTyDec(td:TyDec)
		| DVarDec(vd:VarDec)
		| DFunDec(fd:FunDec)
  */
  private void interpDec(Dec d) {
     %match(d) {
    	 DTyDec(td) -> {
    		 `interpTyDec(td);
    	 }

    	 DVarDec(vd) -> {
    		 `interpVarDec(vd);
    	 }

    	 DFunDec(fd) -> {
    		 `interpFunDec(fd);
    	 }
     }

  }

  // TyDec = TyDec(ti:TypeId, t:Ty)
  private void interpTyDec(TyDec td) {
     %match(td) {
    	 TyDec(ti, t) ->{
    		 if(!operadores.contains("type")) operadores.add("type");
    		 `interpTypeId(ti);
    		 if(!operadores.contains("=")) operadores.add("=");
    		 `interpTy(t);
    	 }
     }

  }

  /*
  Ty = TFieldList(fl:FieldList)
	   | TArrayOf(ti:TypeId)
	   | TTypeId(ti:TypeId)
  */
  private void interpTy(Ty t) {
	   %match(t) {
    	 TFieldList(fl) ->{
    		 if(!operadores.contains("{")) operadores.add("{");
    		 `interpFieldList(fl);
    		 if(!operadores.contains("}")) operadores.add("}");
    	 }

    	 TArrayOf(ti) ->{
    		 if(!operadores.contains("array of")) operadores.add("array of");
    		 `interpTypeId(ti);
    	 }

    	 TTypeId(ti) ->{
    		 `interpTypeId(ti);
    	 }
	   }

  }

  /*
  FieldList = FieldListDP(d:String, ti:TypeId, a:AuxFieldList)
	          | FieldListEqual(id:String, ti:TypeId, a:AuxFieldList)
  */
   private void interpFieldList(FieldList fl) {
	   %match(fl) {
    	 FieldListDP(id, ti, a) -> {
    		 if(!operandos.contains(`id)) operandos.add(`id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains(":")) operadores.add(":");
    		 `interpTypeId(ti);
    		 `interpAuxFieldList(a);
    	 }

    	 FieldListEqual(id, ti, a) -> {
    		 if(!operandos.contains(`id)) operandos.add(`id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains("=")) operadores.add("=");
    		 `interpTypeId(ti);
    		 `interpAuxFieldList(a);
    	 }

    	 FieldListEmpty() -> {
    	 }
	   }

   }

   // AuxFieldList = AuxFieldList(IntFieldList*)
   private void interpAuxFieldList(AuxFieldList afl) {
	   %match(afl) {
    	 AuxFieldList(ifl, tail*) -> {
    		 `interpIntFieldList(ifl);
    		 `interpAuxFieldList(tail*);
    	 }
   	   }

   }


   /*
   IntFieldList = IntFieldList1(id:String, a:Aux1)
			     | IntFieldList2(e1:Exp)
				 | IntFieldList3(e1:Exp, e2:Exp)
   */
   private void interpIntFieldList(IntFieldList ifl) {
	   %match(ifl) {
    	IntFieldList1(id, a) -> {
    		if(!operadores.contains(",")) operadores.add(",");
    		if(!operandos.contains(`id)) operandos.add(`id);
    		nOperandos++;
    		 //System.out.println(`id);
    		 `interpAux1(a);
    	}

    	IntFieldList2(e1) -> {
    		 if(!operadores.contains("[")) operadores.add("[");
    		 `interpExp(e1);
    		 if(!operadores.contains("]")) operadores.add("]");
    	}

    	IntFieldList3(e1, e2) -> {
    		 if(!operadores.contains("[")) operadores.add("[");
    		 `interpExp(e1);
    		 if(!operadores.contains("]")) operadores.add("]");
    		 if(!operadores.contains("of")) operadores.add("of");
    		 `interpExp(e2);

    	}
   	 }

   }

   /*
   Aux1 = Aux11(ti:TypeId)
		 | Aux12(ti:TypeId)
   */
   private void interpAux1(Aux1 a) {
	   %match(a) {
    	 Aux11(ti) -> {
    		 if(!operadores.contains(":")) operadores.add(":");
    		 `interpTypeId(ti);
    	 }

    	 Aux12(ti) -> {
    		 if(!operadores.contains("=")) operadores.add("=");
    		 `interpTypeId(ti);
    	 }
    	}

    }

    /*
    TypeId = TypeId(id:String)
		   | TypeIdString(s:String)
	       | TypeIdInteger(i:int)
	       | TypeIdNil()

    */
   private void interpTypeId(TypeId ti) {
	   %match(ti) {
    	 TypeId(id) -> {
    		 if(!operandos.contains(`id)) operandos.add(`id);
    		 nOperandos++;
    		 //System.out.println(`id);
    	 }

    	 TypeIdString(s) -> {
    		 if(!operandos.contains(`s)) operandos.add(`s);
    		 nOperandos++;
    		 //System.out.println(`s);
    	 }

    	 TypeIdInteger(i) -> {
    		 if(!operandos.contains(Integer.toString(`i))) operandos.add(Integer.toString(`i));
    		 nOperandos++;
    		 //System.out.println(Integer.toString(`i));
    	 }

    	 TypeIdNil() -> {
    		 if(!operandos.contains("nil")) operandos.add("nil");
    		 nOperandos++;
    		 //System.out.println("Nil");
    	 }
   	   }
	   //System.out.println("Interp TypeID: " + ti);
	   //nErros++;
   }

   /*
   VarDec = VarDec1(id:String, a:Aux2)
	       | VarDec2(id:String, ti:TypeId, a:Aux2)
   */
   private void interpVarDec(VarDec vd) {
	   %match(vd) {
    	 VarDec1(id, a) -> {
    		 if(!operadores.contains("var")) operadores.add("var");
    		 if(!operandos.contains(`id)) operandos.add(`id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 `interpAux2(a);
    	 }

    	 VarDec2(id, ti, a) ->  {
    		 if(!operadores.contains("var")) operadores.add("var");
    		 if(!operandos.contains(`id)) operandos.add(`id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains(":")) operadores.add(":");
    		 `interpTypeId(ti);
    		 `interpAux2(a);
    	 }
	   }

   }

   /*
   Aux2 = Aux21(e:Exp)
		 | Aux22(e:Exp)
   */
   private void interpAux2(Aux2 a) {
	   %match(a) {
    	 Aux21(e) -> {
    		 if(!operadores.contains(":=")) operadores.add(":=");
    		 `interpExp(e);
    	 }

    	 Aux22(e) -> {
    		 if(!operadores.contains("=")) operadores.add("=");
    		 `interpExp(e);
    	 }
	   }

   }

   /*
   FunDec = FunDec1(id:String, fl:FieldList, e1:Exp)
		   | FunDec2(id:String, fl:FieldList, ti:TypeId, e1:Exp)
   */
   private void interpFunDec(FunDec fd) {
	   %match(fd) {
    	 FunDec1(id, fl, e1) -> {
    		 if(!operadores.contains("function")) operadores.add("function");
    		 nFuncoes++;
    		 if(!operandos.contains(`id)) operandos.add(`id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains("(")) operadores.add("(");
    		 `interpFieldList(fl);
    		 if(!operadores.contains(")")) operadores.add(")");
    		 if(!operadores.contains("=")) operadores.add("=");
    		 `interpExp(e1);
    	 }

    	 FunDec2(id, fl, ti, e1) -> {
    		 if(!operadores.contains("function")) operadores.add("function");
    		 nFuncoes++;
    		 if(!operandos.contains(`id)) operandos.add(`id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 if(!operadores.contains("(")) operadores.add("(");
    		 `interpFieldList(fl);
    		 if(!operadores.contains(")")) operadores.add(")");
    		 if(!operadores.contains(":")) operadores.add(":");
    		 if(!operadores.contains("=")) operadores.add("=");
    		 `interpTypeId(ti);
    		 `interpExp(e1);
    	 }
	   }

   }

   // LValue = LValue(id:String, fra:FunctionRecordArray)
   private void interpLValue(LValue lv) {
	   %match(lv) {
    	 LValue(id, fra) -> {
    		 if(!operandos.contains(`id)) operandos.add(`id);
    		 nOperandos++;
    		 //System.out.println(`id);
    		 `interpFunctionRecordArray(fra);
    	 }
	   }

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
	   %match(fra) {
    	 FRAArgList(al) -> {
    		 if(!operadores.contains("(")) operadores.add("(");
    		 `interpArgList(al);
    		 if(!operadores.contains(")")) operadores.add(")");
    	 }

    	 FRAFieldList(fl) -> {
    		 if(!operadores.contains("{")) operadores.add("{");
    		 `interpFieldList(fl);
    		 if(!operadores.contains("}")) operadores.add("}");
    	 }

    	 FRA1(a1) -> {
    		 `interpAuxFRA1(a1);
    	 }

    	 FRA2(a2) -> {
    		 `interpAuxFRA2(a2);
    	 }

    	 FRA3(a1, a2) -> {
    		 `interpAuxFRA1(a1);
    		 `interpAuxFRA2(a2);
    	 }

    	 FunctionRecordArrayEmpty() -> {
    	 }
	   }

   }

   // AuxFRA1 = AuxFRA1(e1:Exp)
   private void interpAuxFRA1(AuxFRA1 aFRA1) {
	   %match(aFRA1) {
    	 AuxFRA1(e1) -> {
    		 if(!operadores.contains("[")) operadores.add("[");
    		 `interpExp(e1);
    		 if(!operadores.contains("]")) operadores.add("]");
    	 }
	   }

   }

   /*
   AuxFRA2 = AuxFRA21(e1:Exp)
	        | AuxFRA22(a3:Aux3, e2:Exp)
	        | AuxFRA23(a3:Aux3, a4:Aux4, e2:Exp)
			| AuxFRA24(a4:Aux4, e2:Exp)
   */
   private void interpAuxFRA2(AuxFRA2 aFRA2) {
	   %match(aFRA2) {
    	 AuxFRA21(e1) -> {
    		 if(!operadores.contains("of")) operadores.add("of");
    		 `interpExp(e1);
    	 }

    	 AuxFRA22(a3, e2) -> {
    		 `interpAux3(a3);
    		 if(!operadores.contains(":=")) operadores.add(":=");
    		 `interpExp(e2);
    	 }

    	 AuxFRA23(a3, a4, e2) -> {
    		 `interpAux3(a3);
    		 `interpAux4(a4);
    		 if(!operadores.contains(":=")) operadores.add(":=");
    		 `interpExp(e2);
    	 }

    	 AuxFRA24(a4, e2) -> {
    		 `interpAux4(a4);
    		 if(!operadores.contains(":=")) operadores.add(":=");
    		 `interpExp(e2);

    	 }
	   }

   }

   // Aux3 = Aux3(String*)
   private void interpAux3(Aux3 a) {
	   %match(a) {
    	 Aux3(s, tail*) -> {
    		 if(!operadores.contains(".")) operadores.add(".");
    		 if(!operandos.contains(`s)) operandos.add(`s);
    		 nOperandos++;
    		 //System.out.println(`s);
    		 `interpAux3(tail*);
    	 }
   	  }

   }

   // Aux4 = Aux4(Exp*)
   private void interpAux4(Aux4 a) {
	   %match(a) {
    	 Aux4(e, tail*) -> {
    		 if(!operadores.contains("[")) operadores.add("[");
    		 `interpExp(e);
    		 if(!operadores.contains("]")) operadores.add("]");
    		 `interpAux4(tail*);
    	 }
   	 }

   }

   /*
   ExpList = ExpList(e1:Exp, a:AuxExpList)
			| ExpListEmpty()
   */
   private void interpExpList(ExpList el) {
	   %match(el) {
    	 ExpList(e1, a) -> {
    		 `interpExp(e1);
    		 `interpAuxExpList(a);
    	 }

    	 ExpListEmpty() ->{
    	 }
   	 }

   }

   // AuxExpList = AuxExpList(Exp*)
   private void interpAuxExpList(AuxExpList ael) {
	   %match(ael) {
    	 AuxExpList(e, tail*) -> {
    		 if(!operadores.contains(";")) operadores.add(";");
    		 `interpExp(e);
    		 `interpAuxExpList(tail*);
    	 }
   	 }

   }

   /*
   ArgList = ArgList(e1:Exp, a:AuxArgList)
			| ArgListEmpty()
   */
   private void interpArgList(ArgList al) {
	   %match(al) {
    	 ArgList(e1, a) -> {
    		 if(!operadores.contains(";")) operadores.add(";");
    		 `interpExp(e1);
    		 `interpAuxArgList(a);
    	 }

    	 ArgListEmpty() ->{
    	 }
   	 }

   }

   // AuxArgList = AuxArgList(Exp*)
   private void interpAuxArgList(AuxArgList aal) {
	   %match(aal) {
    	 AuxArgList(e, tail*) -> {
    		 if(!operadores.contains(",")) operadores.add(",");
    		 `interpExp(e);
    		 `interpAuxArgList(tail*);
    	 }
   	 }

   }
}