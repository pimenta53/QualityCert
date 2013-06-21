
package parser.rec.types;


public abstract class Aux4 extends parser.rec.RecAbstractType  {
  /**
   * Sole constructor.  (For invocation by subclass
   * constructors, typically implicit.)
   */
  protected Aux4() {}



  /**
   * Returns true if the term is rooted by the symbol ConsAux4
   *
   * @return true if the term is rooted by the symbol ConsAux4
   */
  public boolean isConsAux4() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol EmptyAux4
   *
   * @return true if the term is rooted by the symbol EmptyAux4
   */
  public boolean isEmptyAux4() {
    return false;
  }

  /**
   * Returns the subterm corresponding to the slot TailAux4
   *
   * @return the subterm corresponding to the slot TailAux4
   */
  public parser.rec.types.Aux4 getTailAux4() {
    throw new UnsupportedOperationException("This Aux4 has no TailAux4");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot TailAux4
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot TailAux4 is replaced by _arg
   */
  public Aux4 setTailAux4(parser.rec.types.Aux4 _arg) {
    throw new UnsupportedOperationException("This Aux4 has no TailAux4");
  }

  /**
   * Returns the subterm corresponding to the slot HeadAux4
   *
   * @return the subterm corresponding to the slot HeadAux4
   */
  public parser.rec.types.Exp getHeadAux4() {
    throw new UnsupportedOperationException("This Aux4 has no HeadAux4");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot HeadAux4
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot HeadAux4 is replaced by _arg
   */
  public Aux4 setHeadAux4(parser.rec.types.Exp _arg) {
    throw new UnsupportedOperationException("This Aux4 has no HeadAux4");
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
   * Returns a parser.rec.types.Aux4 from an ATerm without any conversion
   *
   * @param trm ATerm to handle to retrieve a Gom term
   * @return the term from the ATerm
   */
  public static parser.rec.types.Aux4 fromTerm(aterm.ATerm trm) {
    return fromTerm(trm,idConv);
  }

  /**
   * Returns a parser.rec.types.Aux4 from a String without any conversion
   *
   * @param s String containing the ATerm
   * @return the term from the String
   */
  public static parser.rec.types.Aux4 fromString(String s) {
    return fromTerm(atermFactory.parse(s),idConv);
  }

  /**
   * Returns a parser.rec.types.Aux4 from a Stream without any conversion
   *
   * @param stream stream containing the ATerm
   * @return the term from the Stream
   * @throws java.io.IOException if a problem occurs with the stream
   */
  public static parser.rec.types.Aux4 fromStream(java.io.InputStream stream) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),idConv);
  }

  /**
   * Apply a conversion on the ATerm and returns a parser.rec.types.Aux4
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATermConverter used to convert the ATerm
   * @return the Gom term
   * @throws IllegalArgumentException
   */
  public static parser.rec.types.Aux4 fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    aterm.ATerm convertedTerm = atConv.convert(trm);
    parser.rec.types.Aux4 tmp;
    java.util.ArrayList<parser.rec.types.Aux4> results = new java.util.ArrayList<parser.rec.types.Aux4>();

    tmp = parser.rec.types.aux4.ConsAux4.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.aux4.EmptyAux4.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.aux4.Aux4.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    switch(results.size()) {
      case 0:
        throw new IllegalArgumentException(trm + " is not a Aux4");
      case 1:
        return results.get(0);
      default:
        java.util.logging.Logger.getLogger("Aux4").log(java.util.logging.Level.WARNING,"There were many possibilities ({0}) in {1} but the first one was chosen: {2}",new Object[] {results.toString(), "parser.rec.types.Aux4", results.get(0).toString()});
        return results.get(0);
    }
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.Aux4 from it
   *
   * @param s String containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Aux4 fromString(String s, tom.library.utils.ATermConverter atConv) {
    return fromTerm(atermFactory.parse(s),atConv);
  }

  /**
   * Apply a conversion on the ATerm contained in the Stream and returns a parser.rec.types.Aux4 from it
   *
   * @param stream stream containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Aux4 fromStream(java.io.InputStream stream, tom.library.utils.ATermConverter atConv) throws java.io.IOException {
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
  public parser.rec.types.Aux4 reverse() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }
  
  /**
   * Returns a Collection extracted from the term
   *
   * @return the collection
   * @throws UnsupportedOperationException if the term is not a list
   */
  public java.util.Collection<parser.rec.types.Exp> getCollectionAux4() {
    throw new UnsupportedOperationException("This Aux4 cannot be converted into a Collection");
  }
          
}
