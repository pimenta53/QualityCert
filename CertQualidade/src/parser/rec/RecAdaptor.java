
package parser.rec;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;


public class RecAdaptor {
  public static shared.SharedObject getTerm(Tree tree) {
    shared.SharedObject res = null;
    if (tree.isNil()) {
      throw new RuntimeException("nil term");
    }
    if (tree.getType()==Token.INVALID_TOKEN_TYPE) {
      throw new RuntimeException("bad type");
    }

    switch (tree.getType()) {
      case 69:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Term field0 = (parser.rec.types.Term)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.TermPr field1 = (parser.rec.types.TermPr)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.termpr.TermPrPlus.make(field0, field1);
          break;
        }
      case 26:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.AritExp field0 = (parser.rec.types.AritExp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.relexp.RelExpMore.make(field0);
          break;
        }
      case 10:
        {
          res = parser.rec.types.auxarglist.EmptyAuxArgList.make();
          for(int i = 0; i < tree.getChildCount(); i++) {
            parser.rec.types.Exp elem = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(i));
            parser.rec.types.auxarglist.AuxArgList list = (parser.rec.types.auxarglist.AuxArgList) res;
            res = list.append(elem);
          }
          break;
        }
      case 83:
        {

          if (tree.getChildCount()!=3) {
            throw new RuntimeException("Node " + tree + ": 3 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          parser.rec.types.FieldList field1 = (parser.rec.types.FieldList)RecAdaptor.getTerm(tree.getChild(1));
          parser.rec.types.Exp field2 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(2));
          res = parser.rec.types.fundec.FunDec1.make(field0, field1, field2);
          break;
        }
      case 49:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.AuxExpList field1 = (parser.rec.types.AuxExpList)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.explist.ExpList.make(field0, field1);
          break;
        }
      case 41:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.factor.FNeg.make(field0);
          break;
        }
      case 27:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.AritExp field0 = (parser.rec.types.AritExp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.relexp.RelExpLess.make(field0);
          break;
        }
      case 44:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          int field0 = Integer.parseInt(tree.getChild(0).getText());
          res = parser.rec.types.factor.FInteger.make(field0);
          break;
        }
      case 12:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.AuxFRA1 field0 = (parser.rec.types.AuxFRA1)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.AuxFRA2 field1 = (parser.rec.types.AuxFRA2)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.functionrecordarray.FRA3.make(field0, field1);
          break;
        }
      case 84:
        {
          res = parser.rec.types.auxfieldlist.EmptyAuxFieldList.make();
          for(int i = 0; i < tree.getChildCount(); i++) {
            parser.rec.types.IntFieldList elem = (parser.rec.types.IntFieldList)RecAdaptor.getTerm(tree.getChild(i));
            parser.rec.types.auxfieldlist.AuxFieldList list = (parser.rec.types.auxfieldlist.AuxFieldList) res;
            res = list.append(elem);
          }
          break;
        }
      case 21:
        {
          res = parser.rec.types.auxexplist.EmptyAuxExpList.make();
          for(int i = 0; i < tree.getChildCount(); i++) {
            parser.rec.types.Exp elem = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(i));
            parser.rec.types.auxexplist.AuxExpList list = (parser.rec.types.auxexplist.AuxExpList) res;
            res = list.append(elem);
          }
          break;
        }
      case 15:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.FieldList field0 = (parser.rec.types.FieldList)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.functionrecordarray.FRAFieldList.make(field0);
          break;
        }
      case 62:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.fieldlist.FieldListEmpty.make();
          break;
        }
      case 57:
        {

          if (tree.getChildCount()!=3) {
            throw new RuntimeException("Node " + tree + ": 3 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Aux3 field0 = (parser.rec.types.Aux3)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.Aux4 field1 = (parser.rec.types.Aux4)RecAdaptor.getTerm(tree.getChild(1));
          parser.rec.types.Exp field2 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(2));
          res = parser.rec.types.auxfra2.AuxFRA23.make(field0, field1, field2);
          break;
        }
      case 81:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.TypeId field0 = (parser.rec.types.TypeId)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.aux1.Aux11.make(field0);
          break;
        }
      case 78:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.intfieldlist.IntFieldList2.make(field0);
          break;
        }
      case 79:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          parser.rec.types.Aux1 field1 = (parser.rec.types.Aux1)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.intfieldlist.IntFieldList1.make(field0, field1);
          break;
        }
      case 23:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.AritExp field0 = (parser.rec.types.AritExp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.relexp.RelExpMoreEqual.make(field0);
          break;
        }
      case 85:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.arglist.ArgListEmpty.make();
          break;
        }
      case 35:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.Exp field1 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.factor.FIfThen.make(field0, field1);
          break;
        }
      case 88:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Factor field0 = (parser.rec.types.Factor)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.FactorPr field1 = (parser.rec.types.FactorPr)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.term.Term.make(field0, field1);
          break;
        }
      case 59:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.auxfra2.AuxFRA21.make(field0);
          break;
        }
      case 55:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.ExpAND field0 = (parser.rec.types.ExpAND)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.ExpANDPr field1 = (parser.rec.types.ExpANDPr)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.expor.ExpOR.make(field0, field1);
          break;
        }
      case 87:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.ExpOR field0 = (parser.rec.types.ExpOR)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.ExpORPr field1 = (parser.rec.types.ExpORPr)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.exp.Exp.make(field0, field1);
          break;
        }
      case 82:
        {

          if (tree.getChildCount()!=4) {
            throw new RuntimeException("Node " + tree + ": 4 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          parser.rec.types.FieldList field1 = (parser.rec.types.FieldList)RecAdaptor.getTerm(tree.getChild(1));
          parser.rec.types.TypeId field2 = (parser.rec.types.TypeId)RecAdaptor.getTerm(tree.getChild(2));
          parser.rec.types.Exp field3 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(3));
          res = parser.rec.types.fundec.FunDec2.make(field0, field1, field2, field3);
          break;
        }
      case 77:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.Exp field1 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.intfieldlist.IntFieldList3.make(field0, field1);
          break;
        }
      case 90:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          parser.rec.types.Aux2 field1 = (parser.rec.types.Aux2)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.vardec.VarDec1.make(field0, field1);
          break;
        }
      case 86:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.AuxArgList field1 = (parser.rec.types.AuxArgList)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.arglist.ArgList.make(field0, field1);
          break;
        }
      case 73:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Factor field0 = (parser.rec.types.Factor)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.FactorPr field1 = (parser.rec.types.FactorPr)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.factorpr.Div.make(field0, field1);
          break;
        }
      case 14:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.AuxFRA1 field0 = (parser.rec.types.AuxFRA1)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.functionrecordarray.FRA1.make(field0);
          break;
        }
      case 64:
        {

          if (tree.getChildCount()!=3) {
            throw new RuntimeException("Node " + tree + ": 3 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          parser.rec.types.TypeId field1 = (parser.rec.types.TypeId)RecAdaptor.getTerm(tree.getChild(1));
          parser.rec.types.AuxFieldList field2 = (parser.rec.types.AuxFieldList)RecAdaptor.getTerm(tree.getChild(2));
          res = parser.rec.types.fieldlist.FieldListDP.make(field0, field1, field2);
          break;
        }
      case 61:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.exporpr.ExpORPr.make(field0);
          break;
        }
      case 48:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.explist.ExpListEmpty.make();
          break;
        }
      case 20:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          res = parser.rec.types.typeid.TypeId.make(field0);
          break;
        }
      case 60:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.exporpr.ExpORPrEmpty.make();
          break;
        }
      case 56:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Aux4 field0 = (parser.rec.types.Aux4)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.Exp field1 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.auxfra2.AuxFRA24.make(field0, field1);
          break;
        }
      case 18:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          int field0 = Integer.parseInt(tree.getChild(0).getText());
          res = parser.rec.types.typeid.TypeIdInteger.make(field0);
          break;
        }
      case 31:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.TypeId field0 = (parser.rec.types.TypeId)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.ty.TTypeId.make(field0);
          break;
        }
      case 30:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.TyDec field0 = (parser.rec.types.TyDec)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.dec.DTyDec.make(field0);
          break;
        }
      case 36:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.LValue field0 = (parser.rec.types.LValue)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.factor.FLvalue.make(field0);
          break;
        }
      case 37:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.DecList field0 = (parser.rec.types.DecList)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.ExpList field1 = (parser.rec.types.ExpList)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.factor.FLet.make(field0, field1);
          break;
        }
      case 74:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Factor field0 = (parser.rec.types.Factor)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.FactorPr field1 = (parser.rec.types.FactorPr)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.factorpr.Times.make(field0, field1);
          break;
        }
      case 52:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.aux2.Aux21.make(field0);
          break;
        }
      case 39:
        {

          if (tree.getChildCount()!=4) {
            throw new RuntimeException("Node " + tree + ": 4 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          parser.rec.types.Exp field1 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(1));
          parser.rec.types.Exp field2 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(2));
          parser.rec.types.Exp field3 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(3));
          res = parser.rec.types.factor.FFor.make(field0, field1, field2, field3);
          break;
        }
      case 11:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.functionrecordarray.FunctionRecordArrayEmpty.make();
          break;
        }
      case 47:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.TypeId field0 = (parser.rec.types.TypeId)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.Ty field1 = (parser.rec.types.Ty)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.tydec.TyDec.make(field0, field1);
          break;
        }
      case 16:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.ArgList field0 = (parser.rec.types.ArgList)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.functionrecordarray.FRAArgList.make(field0);
          break;
        }
      case 22:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.relexp.RelExpEmpty.make();
          break;
        }
      case 66:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.termpr.TermPrEmpty.make();
          break;
        }
      case 42:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.ExpList field0 = (parser.rec.types.ExpList)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.factor.FExpList.make(field0);
          break;
        }
      case 54:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.auxfra1.AuxFRA1.make(field0);
          break;
        }
      case 13:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.AuxFRA2 field0 = (parser.rec.types.AuxFRA2)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.functionrecordarray.FRA2.make(field0);
          break;
        }
      case 65:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.AritExp field0 = (parser.rec.types.AritExp)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.RelExp field1 = (parser.rec.types.RelExp)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.expand.ExpAND.make(field0, field1);
          break;
        }
      case 68:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Term field0 = (parser.rec.types.Term)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.TermPr field1 = (parser.rec.types.TermPr)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.termpr.TermPrNeg.make(field0, field1);
          break;
        }
      case 67:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Term field0 = (parser.rec.types.Term)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.TermPr field1 = (parser.rec.types.TermPr)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.termpr.TermPrEqual.make(field0, field1);
          break;
        }
      case 25:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.AritExp field0 = (parser.rec.types.AritExp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.relexp.RelExpDiferent.make(field0);
          break;
        }
      case 46:
        {
          res = parser.rec.types.aux3.EmptyAux3.make();
          for(int i = 0; i < tree.getChildCount(); i++) {
            String elem = tree.getChild(i).getText();
            parser.rec.types.aux3.Aux3 list = (parser.rec.types.aux3.Aux3) res;
            res = list.append(elem);
          }
          break;
        }
      case 70:
        {
          res = parser.rec.types.aux4.EmptyAux4.make();
          for(int i = 0; i < tree.getChildCount(); i++) {
            parser.rec.types.Exp elem = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(i));
            parser.rec.types.aux4.Aux4 list = (parser.rec.types.aux4.Aux4) res;
            res = list.append(elem);
          }
          break;
        }
      case 51:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.aux2.Aux22.make(field0);
          break;
        }
      case 17:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.typeid.TypeIdNil.make();
          break;
        }
      case 19:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          res = parser.rec.types.typeid.TypeIdString.make(field0);
          break;
        }
      case 53:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Term field0 = (parser.rec.types.Term)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.TermPr field1 = (parser.rec.types.TermPr)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.aritexp.AritExp.make(field0, field1);
          break;
        }
      case 71:
        {
          res = parser.rec.types.declist.EmptyDecList.make();
          for(int i = 0; i < tree.getChildCount(); i++) {
            parser.rec.types.Dec elem = (parser.rec.types.Dec)RecAdaptor.getTerm(tree.getChild(i));
            parser.rec.types.declist.DecList list = (parser.rec.types.declist.DecList) res;
            res = list.append(elem);
          }
          break;
        }
      case 72:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.factorpr.FactorPrEmpty.make();
          break;
        }
      case 76:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.expandpr.ExpANDPr.make(field0);
          break;
        }
      case 63:
        {

          if (tree.getChildCount()!=3) {
            throw new RuntimeException("Node " + tree + ": 3 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          parser.rec.types.TypeId field1 = (parser.rec.types.TypeId)RecAdaptor.getTerm(tree.getChild(1));
          parser.rec.types.AuxFieldList field2 = (parser.rec.types.AuxFieldList)RecAdaptor.getTerm(tree.getChild(2));
          res = parser.rec.types.fieldlist.FieldListEqual.make(field0, field1, field2);
          break;
        }
      case 91:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          parser.rec.types.FunctionRecordArray field1 = (parser.rec.types.FunctionRecordArray)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.lvalue.LValue.make(field0, field1);
          break;
        }
      case 80:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.TypeId field0 = (parser.rec.types.TypeId)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.aux1.Aux12.make(field0);
          break;
        }
      case 29:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.VarDec field0 = (parser.rec.types.VarDec)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.dec.DVarDec.make(field0);
          break;
        }
      case 43:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          res = parser.rec.types.factor.FString.make(field0);
          break;
        }
      case 75:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.expandpr.ExpANDPrEmpty.make();
          break;
        }
      case 28:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.FunDec field0 = (parser.rec.types.FunDec)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.dec.DFunDec.make(field0);
          break;
        }
      case 24:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.AritExp field0 = (parser.rec.types.AritExp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.relexp.RelExpLessEqual.make(field0);
          break;
        }
      case 50:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.prog.Prog.make(field0);
          break;
        }
      case 32:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.TypeId field0 = (parser.rec.types.TypeId)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.ty.TArrayOf.make(field0);
          break;
        }
      case 40:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.Exp field1 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.factor.FWhile.make(field0, field1);
          break;
        }
      case 89:
        {

          if (tree.getChildCount()!=3) {
            throw new RuntimeException("Node " + tree + ": 3 child(s) expected, but " + tree.getChildCount() + " found");
          }
          String field0 = tree.getChild(0).getText();
          parser.rec.types.TypeId field1 = (parser.rec.types.TypeId)RecAdaptor.getTerm(tree.getChild(1));
          parser.rec.types.Aux2 field2 = (parser.rec.types.Aux2)RecAdaptor.getTerm(tree.getChild(2));
          res = parser.rec.types.vardec.VarDec2.make(field0, field1, field2);
          break;
        }
      case 34:
        {

          if (tree.getChildCount()!=3) {
            throw new RuntimeException("Node " + tree + ": 3 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Exp field0 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.Exp field1 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(1));
          parser.rec.types.Exp field2 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(2));
          res = parser.rec.types.factor.FIfThenElse.make(field0, field1, field2);
          break;
        }
      case 33:
        {

          if (tree.getChildCount()!=1) {
            throw new RuntimeException("Node " + tree + ": 1 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.FieldList field0 = (parser.rec.types.FieldList)RecAdaptor.getTerm(tree.getChild(0));
          res = parser.rec.types.ty.TFieldList.make(field0);
          break;
        }
      case 38:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.factor.FBreak.make();
          break;
        }
      case 58:
        {

          if (tree.getChildCount()!=2) {
            throw new RuntimeException("Node " + tree + ": 2 child(s) expected, but " + tree.getChildCount() + " found");
          }
          parser.rec.types.Aux3 field0 = (parser.rec.types.Aux3)RecAdaptor.getTerm(tree.getChild(0));
          parser.rec.types.Exp field1 = (parser.rec.types.Exp)RecAdaptor.getTerm(tree.getChild(1));
          res = parser.rec.types.auxfra2.AuxFRA22.make(field0, field1);
          break;
        }
      case 45:
        {

          if (tree.getChildCount()!=0) {
            throw new RuntimeException("Node " + tree + ": 0 child(s) expected, but " + tree.getChildCount() + " found");
          }
          res = parser.rec.types.factor.FNil.make();
          break;
        }

    }
    return res;
  }
}
