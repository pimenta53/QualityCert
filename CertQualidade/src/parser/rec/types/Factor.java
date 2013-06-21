
package parser.rec.types;


public abstract class Factor extends parser.rec.RecAbstractType  {
  /**
   * Sole constructor.  (For invocation by subclass
   * constructors, typically implicit.)
   */
  protected Factor() {}



  /**
   * Returns true if the term is rooted by the symbol FNil
   *
   * @return true if the term is rooted by the symbol FNil
   */
  public boolean isFNil() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FInteger
   *
   * @return true if the term is rooted by the symbol FInteger
   */
  public boolean isFInteger() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FString
   *
   * @return true if the term is rooted by the symbol FString
   */
  public boolean isFString() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FExpList
   *
   * @return true if the term is rooted by the symbol FExpList
   */
  public boolean isFExpList() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FNeg
   *
   * @return true if the term is rooted by the symbol FNeg
   */
  public boolean isFNeg() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FWhile
   *
   * @return true if the term is rooted by the symbol FWhile
   */
  public boolean isFWhile() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FFor
   *
   * @return true if the term is rooted by the symbol FFor
   */
  public boolean isFFor() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FBreak
   *
   * @return true if the term is rooted by the symbol FBreak
   */
  public boolean isFBreak() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FLet
   *
   * @return true if the term is rooted by the symbol FLet
   */
  public boolean isFLet() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FLvalue
   *
   * @return true if the term is rooted by the symbol FLvalue
   */
  public boolean isFLvalue() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FIfThen
   *
   * @return true if the term is rooted by the symbol FIfThen
   */
  public boolean isFIfThen() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FIfThenElse
   *
   * @return true if the term is rooted by the symbol FIfThenElse
   */
  public boolean isFIfThenElse() {
    return false;
  }

  /**
   * Returns the subterm corresponding to the slot i
   *
   * @return the subterm corresponding to the slot i
   */
  public int geti() {
    throw new UnsupportedOperationException("This Factor has no i");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot i
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot i is replaced by _arg
   */
  public Factor seti(int _arg) {
    throw new UnsupportedOperationException("This Factor has no i");
  }

  /**
   * Returns the subterm corresponding to the slot e2
   *
   * @return the subterm corresponding to the slot e2
   */
  public parser.rec.types.Exp gete2() {
    throw new UnsupportedOperationException("This Factor has no e2");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot e2
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot e2 is replaced by _arg
   */
  public Factor sete2(parser.rec.types.Exp _arg) {
    throw new UnsupportedOperationException("This Factor has no e2");
  }

  /**
   * Returns the subterm corresponding to the slot s
   *
   * @return the subterm corresponding to the slot s
   */
  public String gets() {
    throw new UnsupportedOperationException("This Factor has no s");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot s
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot s is replaced by _arg
   */
  public Factor sets(String _arg) {
    throw new UnsupportedOperationException("This Factor has no s");
  }

  /**
   * Returns the subterm corresponding to the slot e3
   *
   * @return the subterm corresponding to the slot e3
   */
  public parser.rec.types.Exp gete3() {
    throw new UnsupportedOperationException("This Factor has no e3");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot e3
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot e3 is replaced by _arg
   */
  public Factor sete3(parser.rec.types.Exp _arg) {
    throw new UnsupportedOperationException("This Factor has no e3");
  }

  /**
   * Returns the subterm corresponding to the slot e1
   *
   * @return the subterm corresponding to the slot e1
   */
  public parser.rec.types.Exp gete1() {
    throw new UnsupportedOperationException("This Factor has no e1");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot e1
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot e1 is replaced by _arg
   */
  public Factor sete1(parser.rec.types.Exp _arg) {
    throw new UnsupportedOperationException("This Factor has no e1");
  }

  /**
   * Returns the subterm corresponding to the slot lv
   *
   * @return the subterm corresponding to the slot lv
   */
  public parser.rec.types.LValue getlv() {
    throw new UnsupportedOperationException("This Factor has no lv");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot lv
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot lv is replaced by _arg
   */
  public Factor setlv(parser.rec.types.LValue _arg) {
    throw new UnsupportedOperationException("This Factor has no lv");
  }

  /**
   * Returns the subterm corresponding to the slot dl
   *
   * @return the subterm corresponding to the slot dl
   */
  public parser.rec.types.DecList getdl() {
    throw new UnsupportedOperationException("This Factor has no dl");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot dl
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot dl is replaced by _arg
   */
  public Factor setdl(parser.rec.types.DecList _arg) {
    throw new UnsupportedOperationException("This Factor has no dl");
  }

  /**
   * Returns the subterm corresponding to the slot id
   *
   * @return the subterm corresponding to the slot id
   */
  public String getid() {
    throw new UnsupportedOperationException("This Factor has no id");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot id
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot id is replaced by _arg
   */
  public Factor setid(String _arg) {
    throw new UnsupportedOperationException("This Factor has no id");
  }

  /**
   * Returns the subterm corresponding to the slot el
   *
   * @return the subterm corresponding to the slot el
   */
  public parser.rec.types.ExpList getel() {
    throw new UnsupportedOperationException("This Factor has no el");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot el
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot el is replaced by _arg
   */
  public Factor setel(parser.rec.types.ExpList _arg) {
    throw new UnsupportedOperationException("This Factor has no el");
  }

  protected static tom.library.utils.IdConverter idConv = new tom.library.utils.IdConverter();

  /**
   * Returns an ATerm representation of this term.
   *
   * @return null to indicate to sub-classes that they have to work
   */
  public aterm.ATerm toATerm() {
    // returns null to indicate sub-classes that they have to work
    return null;
  }

  /**
   * Returns a parser.rec.types.Factor from an ATerm without any conversion
   *
   * @param trm ATerm to handle to retrieve a Gom term
   * @return the term from the ATerm
   */
  public static parser.rec.types.Factor fromTerm(aterm.ATerm trm) {
    return fromTerm(trm,idConv);
  }

  /**
   * Returns a parser.rec.types.Factor from a String without any conversion
   *
   * @param s String containing the ATerm
   * @return the term from the String
   */
  public static parser.rec.types.Factor fromString(String s) {
    return fromTerm(atermFactory.parse(s),idConv);
  }

  /**
   * Returns a parser.rec.types.Factor from a Stream without any conversion
   *
   * @param stream stream containing the ATerm
   * @return the term from the Stream
   * @throws java.io.IOException if a problem occurs with the stream
   */
  public static parser.rec.types.Factor fromStream(java.io.InputStream stream) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),idConv);
  }

  /**
   * Apply a conversion on the ATerm and returns a parser.rec.types.Factor
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATermConverter used to convert the ATerm
   * @return the Gom term
   * @throws IllegalArgumentException
   */
  public static parser.rec.types.Factor fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    aterm.ATerm convertedTerm = atConv.convert(trm);
    parser.rec.types.Factor tmp;
    java.util.ArrayList<parser.rec.types.Factor> results = new java.util.ArrayList<parser.rec.types.Factor>();

    tmp = parser.rec.types.factor.FNil.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FInteger.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FString.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FExpList.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FNeg.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FWhile.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FFor.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FBreak.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FLet.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FLvalue.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FIfThen.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.factor.FIfThenElse.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    switch(results.size()) {
      case 0:
        throw new IllegalArgumentException(trm + " is not a Factor");
      case 1:
        return results.get(0);
      default:
        java.util.logging.Logger.getLogger("Factor").log(java.util.logging.Level.WARNING,"There were many possibilities ({0}) in {1} but the first one was chosen: {2}",new Object[] {results.toString(), "parser.rec.types.Factor", results.get(0).toString()});
        return results.get(0);
    }
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.Factor from it
   *
   * @param s String containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Factor fromString(String s, tom.library.utils.ATermConverter atConv) {
    return fromTerm(atermFactory.parse(s),atConv);
  }

  /**
   * Apply a conversion on the ATerm contained in the Stream and returns a parser.rec.types.Factor from it
   *
   * @param stream stream containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Factor fromStream(java.io.InputStream stream, tom.library.utils.ATermConverter atConv) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),atConv);
  }

  /**
   * Returns the length of the list
   *
   * @return the length of the list
   * @throws IllegalArgumentException if the term is not a list
   */
  public int length() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }

  /**
   * Returns an inverted term
   *
   * @return the inverted list
   * @throws IllegalArgumentException if the term is not a list
   */
  public parser.rec.types.Factor reverse() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }
  
}
