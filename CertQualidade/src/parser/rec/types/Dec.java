
package parser.rec.types;


public abstract class Dec extends parser.rec.RecAbstractType  {
  /**
   * Sole constructor.  (For invocation by subclass
   * constructors, typically implicit.)
   */
  protected Dec() {}



  /**
   * Returns true if the term is rooted by the symbol DTyDec
   *
   * @return true if the term is rooted by the symbol DTyDec
   */
  public boolean isDTyDec() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol DVarDec
   *
   * @return true if the term is rooted by the symbol DVarDec
   */
  public boolean isDVarDec() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol DFunDec
   *
   * @return true if the term is rooted by the symbol DFunDec
   */
  public boolean isDFunDec() {
    return false;
  }

  /**
   * Returns the subterm corresponding to the slot fd
   *
   * @return the subterm corresponding to the slot fd
   */
  public parser.rec.types.FunDec getfd() {
    throw new UnsupportedOperationException("This Dec has no fd");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot fd
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot fd is replaced by _arg
   */
  public Dec setfd(parser.rec.types.FunDec _arg) {
    throw new UnsupportedOperationException("This Dec has no fd");
  }

  /**
   * Returns the subterm corresponding to the slot vd
   *
   * @return the subterm corresponding to the slot vd
   */
  public parser.rec.types.VarDec getvd() {
    throw new UnsupportedOperationException("This Dec has no vd");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot vd
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot vd is replaced by _arg
   */
  public Dec setvd(parser.rec.types.VarDec _arg) {
    throw new UnsupportedOperationException("This Dec has no vd");
  }

  /**
   * Returns the subterm corresponding to the slot td
   *
   * @return the subterm corresponding to the slot td
   */
  public parser.rec.types.TyDec gettd() {
    throw new UnsupportedOperationException("This Dec has no td");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot td
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot td is replaced by _arg
   */
  public Dec settd(parser.rec.types.TyDec _arg) {
    throw new UnsupportedOperationException("This Dec has no td");
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
   * Returns a parser.rec.types.Dec from an ATerm without any conversion
   *
   * @param trm ATerm to handle to retrieve a Gom term
   * @return the term from the ATerm
   */
  public static parser.rec.types.Dec fromTerm(aterm.ATerm trm) {
    return fromTerm(trm,idConv);
  }

  /**
   * Returns a parser.rec.types.Dec from a String without any conversion
   *
   * @param s String containing the ATerm
   * @return the term from the String
   */
  public static parser.rec.types.Dec fromString(String s) {
    return fromTerm(atermFactory.parse(s),idConv);
  }

  /**
   * Returns a parser.rec.types.Dec from a Stream without any conversion
   *
   * @param stream stream containing the ATerm
   * @return the term from the Stream
   * @throws java.io.IOException if a problem occurs with the stream
   */
  public static parser.rec.types.Dec fromStream(java.io.InputStream stream) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),idConv);
  }

  /**
   * Apply a conversion on the ATerm and returns a parser.rec.types.Dec
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATermConverter used to convert the ATerm
   * @return the Gom term
   * @throws IllegalArgumentException
   */
  public static parser.rec.types.Dec fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    aterm.ATerm convertedTerm = atConv.convert(trm);
    parser.rec.types.Dec tmp;
    java.util.ArrayList<parser.rec.types.Dec> results = new java.util.ArrayList<parser.rec.types.Dec>();

    tmp = parser.rec.types.dec.DTyDec.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.dec.DVarDec.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.dec.DFunDec.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    switch(results.size()) {
      case 0:
        throw new IllegalArgumentException(trm + " is not a Dec");
      case 1:
        return results.get(0);
      default:
        java.util.logging.Logger.getLogger("Dec").log(java.util.logging.Level.WARNING,"There were many possibilities ({0}) in {1} but the first one was chosen: {2}",new Object[] {results.toString(), "parser.rec.types.Dec", results.get(0).toString()});
        return results.get(0);
    }
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.Dec from it
   *
   * @param s String containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Dec fromString(String s, tom.library.utils.ATermConverter atConv) {
    return fromTerm(atermFactory.parse(s),atConv);
  }

  /**
   * Apply a conversion on the ATerm contained in the Stream and returns a parser.rec.types.Dec from it
   *
   * @param stream stream containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Dec fromStream(java.io.InputStream stream, tom.library.utils.ATermConverter atConv) throws java.io.IOException {
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
  public parser.rec.types.Dec reverse() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }
  
}
