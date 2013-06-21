
package parser.rec.types;


public abstract class RelExp extends parser.rec.RecAbstractType  {
  /**
   * Sole constructor.  (For invocation by subclass
   * constructors, typically implicit.)
   */
  protected RelExp() {}



  /**
   * Returns true if the term is rooted by the symbol RelExpLess
   *
   * @return true if the term is rooted by the symbol RelExpLess
   */
  public boolean isRelExpLess() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol RelExpMore
   *
   * @return true if the term is rooted by the symbol RelExpMore
   */
  public boolean isRelExpMore() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol RelExpDiferent
   *
   * @return true if the term is rooted by the symbol RelExpDiferent
   */
  public boolean isRelExpDiferent() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol RelExpLessEqual
   *
   * @return true if the term is rooted by the symbol RelExpLessEqual
   */
  public boolean isRelExpLessEqual() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol RelExpMoreEqual
   *
   * @return true if the term is rooted by the symbol RelExpMoreEqual
   */
  public boolean isRelExpMoreEqual() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol RelExpEmpty
   *
   * @return true if the term is rooted by the symbol RelExpEmpty
   */
  public boolean isRelExpEmpty() {
    return false;
  }

  /**
   * Returns the subterm corresponding to the slot a5
   *
   * @return the subterm corresponding to the slot a5
   */
  public parser.rec.types.AritExp geta5() {
    throw new UnsupportedOperationException("This RelExp has no a5");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot a5
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot a5 is replaced by _arg
   */
  public RelExp seta5(parser.rec.types.AritExp _arg) {
    throw new UnsupportedOperationException("This RelExp has no a5");
  }

  /**
   * Returns the subterm corresponding to the slot a1
   *
   * @return the subterm corresponding to the slot a1
   */
  public parser.rec.types.AritExp geta1() {
    throw new UnsupportedOperationException("This RelExp has no a1");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot a1
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot a1 is replaced by _arg
   */
  public RelExp seta1(parser.rec.types.AritExp _arg) {
    throw new UnsupportedOperationException("This RelExp has no a1");
  }

  /**
   * Returns the subterm corresponding to the slot a4
   *
   * @return the subterm corresponding to the slot a4
   */
  public parser.rec.types.AritExp geta4() {
    throw new UnsupportedOperationException("This RelExp has no a4");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot a4
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot a4 is replaced by _arg
   */
  public RelExp seta4(parser.rec.types.AritExp _arg) {
    throw new UnsupportedOperationException("This RelExp has no a4");
  }

  /**
   * Returns the subterm corresponding to the slot a2
   *
   * @return the subterm corresponding to the slot a2
   */
  public parser.rec.types.AritExp geta2() {
    throw new UnsupportedOperationException("This RelExp has no a2");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot a2
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot a2 is replaced by _arg
   */
  public RelExp seta2(parser.rec.types.AritExp _arg) {
    throw new UnsupportedOperationException("This RelExp has no a2");
  }

  /**
   * Returns the subterm corresponding to the slot a3
   *
   * @return the subterm corresponding to the slot a3
   */
  public parser.rec.types.AritExp geta3() {
    throw new UnsupportedOperationException("This RelExp has no a3");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot a3
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot a3 is replaced by _arg
   */
  public RelExp seta3(parser.rec.types.AritExp _arg) {
    throw new UnsupportedOperationException("This RelExp has no a3");
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
   * Returns a parser.rec.types.RelExp from an ATerm without any conversion
   *
   * @param trm ATerm to handle to retrieve a Gom term
   * @return the term from the ATerm
   */
  public static parser.rec.types.RelExp fromTerm(aterm.ATerm trm) {
    return fromTerm(trm,idConv);
  }

  /**
   * Returns a parser.rec.types.RelExp from a String without any conversion
   *
   * @param s String containing the ATerm
   * @return the term from the String
   */
  public static parser.rec.types.RelExp fromString(String s) {
    return fromTerm(atermFactory.parse(s),idConv);
  }

  /**
   * Returns a parser.rec.types.RelExp from a Stream without any conversion
   *
   * @param stream stream containing the ATerm
   * @return the term from the Stream
   * @throws java.io.IOException if a problem occurs with the stream
   */
  public static parser.rec.types.RelExp fromStream(java.io.InputStream stream) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),idConv);
  }

  /**
   * Apply a conversion on the ATerm and returns a parser.rec.types.RelExp
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATermConverter used to convert the ATerm
   * @return the Gom term
   * @throws IllegalArgumentException
   */
  public static parser.rec.types.RelExp fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    aterm.ATerm convertedTerm = atConv.convert(trm);
    parser.rec.types.RelExp tmp;
    java.util.ArrayList<parser.rec.types.RelExp> results = new java.util.ArrayList<parser.rec.types.RelExp>();

    tmp = parser.rec.types.relexp.RelExpLess.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.relexp.RelExpMore.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.relexp.RelExpDiferent.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.relexp.RelExpLessEqual.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.relexp.RelExpMoreEqual.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.relexp.RelExpEmpty.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    switch(results.size()) {
      case 0:
        throw new IllegalArgumentException(trm + " is not a RelExp");
      case 1:
        return results.get(0);
      default:
        java.util.logging.Logger.getLogger("RelExp").log(java.util.logging.Level.WARNING,"There were many possibilities ({0}) in {1} but the first one was chosen: {2}",new Object[] {results.toString(), "parser.rec.types.RelExp", results.get(0).toString()});
        return results.get(0);
    }
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.RelExp from it
   *
   * @param s String containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.RelExp fromString(String s, tom.library.utils.ATermConverter atConv) {
    return fromTerm(atermFactory.parse(s),atConv);
  }

  /**
   * Apply a conversion on the ATerm contained in the Stream and returns a parser.rec.types.RelExp from it
   *
   * @param stream stream containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.RelExp fromStream(java.io.InputStream stream, tom.library.utils.ATermConverter atConv) throws java.io.IOException {
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
  public parser.rec.types.RelExp reverse() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }
  
}
