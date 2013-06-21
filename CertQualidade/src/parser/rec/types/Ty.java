
package parser.rec.types;


public abstract class Ty extends parser.rec.RecAbstractType  {
  /**
   * Sole constructor.  (For invocation by subclass
   * constructors, typically implicit.)
   */
  protected Ty() {}



  /**
   * Returns true if the term is rooted by the symbol TFieldList
   *
   * @return true if the term is rooted by the symbol TFieldList
   */
  public boolean isTFieldList() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol TArrayOf
   *
   * @return true if the term is rooted by the symbol TArrayOf
   */
  public boolean isTArrayOf() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol TTypeId
   *
   * @return true if the term is rooted by the symbol TTypeId
   */
  public boolean isTTypeId() {
    return false;
  }

  /**
   * Returns the subterm corresponding to the slot ti
   *
   * @return the subterm corresponding to the slot ti
   */
  public parser.rec.types.TypeId getti() {
    throw new UnsupportedOperationException("This Ty has no ti");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot ti
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot ti is replaced by _arg
   */
  public Ty setti(parser.rec.types.TypeId _arg) {
    throw new UnsupportedOperationException("This Ty has no ti");
  }

  /**
   * Returns the subterm corresponding to the slot fl
   *
   * @return the subterm corresponding to the slot fl
   */
  public parser.rec.types.FieldList getfl() {
    throw new UnsupportedOperationException("This Ty has no fl");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot fl
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot fl is replaced by _arg
   */
  public Ty setfl(parser.rec.types.FieldList _arg) {
    throw new UnsupportedOperationException("This Ty has no fl");
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
   * Returns a parser.rec.types.Ty from an ATerm without any conversion
   *
   * @param trm ATerm to handle to retrieve a Gom term
   * @return the term from the ATerm
   */
  public static parser.rec.types.Ty fromTerm(aterm.ATerm trm) {
    return fromTerm(trm,idConv);
  }

  /**
   * Returns a parser.rec.types.Ty from a String without any conversion
   *
   * @param s String containing the ATerm
   * @return the term from the String
   */
  public static parser.rec.types.Ty fromString(String s) {
    return fromTerm(atermFactory.parse(s),idConv);
  }

  /**
   * Returns a parser.rec.types.Ty from a Stream without any conversion
   *
   * @param stream stream containing the ATerm
   * @return the term from the Stream
   * @throws java.io.IOException if a problem occurs with the stream
   */
  public static parser.rec.types.Ty fromStream(java.io.InputStream stream) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),idConv);
  }

  /**
   * Apply a conversion on the ATerm and returns a parser.rec.types.Ty
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATermConverter used to convert the ATerm
   * @return the Gom term
   * @throws IllegalArgumentException
   */
  public static parser.rec.types.Ty fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    aterm.ATerm convertedTerm = atConv.convert(trm);
    parser.rec.types.Ty tmp;
    java.util.ArrayList<parser.rec.types.Ty> results = new java.util.ArrayList<parser.rec.types.Ty>();

    tmp = parser.rec.types.ty.TFieldList.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.ty.TArrayOf.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.ty.TTypeId.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    switch(results.size()) {
      case 0:
        throw new IllegalArgumentException(trm + " is not a Ty");
      case 1:
        return results.get(0);
      default:
        java.util.logging.Logger.getLogger("Ty").log(java.util.logging.Level.WARNING,"There were many possibilities ({0}) in {1} but the first one was chosen: {2}",new Object[] {results.toString(), "parser.rec.types.Ty", results.get(0).toString()});
        return results.get(0);
    }
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.Ty from it
   *
   * @param s String containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Ty fromString(String s, tom.library.utils.ATermConverter atConv) {
    return fromTerm(atermFactory.parse(s),atConv);
  }

  /**
   * Apply a conversion on the ATerm contained in the Stream and returns a parser.rec.types.Ty from it
   *
   * @param stream stream containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Ty fromStream(java.io.InputStream stream, tom.library.utils.ATermConverter atConv) throws java.io.IOException {
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
  public parser.rec.types.Ty reverse() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }
  
}
