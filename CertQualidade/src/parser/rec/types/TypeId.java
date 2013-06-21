
package parser.rec.types;


public abstract class TypeId extends parser.rec.RecAbstractType  {
  /**
   * Sole constructor.  (For invocation by subclass
   * constructors, typically implicit.)
   */
  protected TypeId() {}



  /**
   * Returns true if the term is rooted by the symbol TypeId
   *
   * @return true if the term is rooted by the symbol TypeId
   */
  public boolean isTypeId() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol TypeIdString
   *
   * @return true if the term is rooted by the symbol TypeIdString
   */
  public boolean isTypeIdString() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol TypeIdInteger
   *
   * @return true if the term is rooted by the symbol TypeIdInteger
   */
  public boolean isTypeIdInteger() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol TypeIdNil
   *
   * @return true if the term is rooted by the symbol TypeIdNil
   */
  public boolean isTypeIdNil() {
    return false;
  }

  /**
   * Returns the subterm corresponding to the slot i
   *
   * @return the subterm corresponding to the slot i
   */
  public int geti() {
    throw new UnsupportedOperationException("This TypeId has no i");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot i
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot i is replaced by _arg
   */
  public TypeId seti(int _arg) {
    throw new UnsupportedOperationException("This TypeId has no i");
  }

  /**
   * Returns the subterm corresponding to the slot s
   *
   * @return the subterm corresponding to the slot s
   */
  public String gets() {
    throw new UnsupportedOperationException("This TypeId has no s");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot s
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot s is replaced by _arg
   */
  public TypeId sets(String _arg) {
    throw new UnsupportedOperationException("This TypeId has no s");
  }

  /**
   * Returns the subterm corresponding to the slot id
   *
   * @return the subterm corresponding to the slot id
   */
  public String getid() {
    throw new UnsupportedOperationException("This TypeId has no id");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot id
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot id is replaced by _arg
   */
  public TypeId setid(String _arg) {
    throw new UnsupportedOperationException("This TypeId has no id");
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
   * Returns a parser.rec.types.TypeId from an ATerm without any conversion
   *
   * @param trm ATerm to handle to retrieve a Gom term
   * @return the term from the ATerm
   */
  public static parser.rec.types.TypeId fromTerm(aterm.ATerm trm) {
    return fromTerm(trm,idConv);
  }

  /**
   * Returns a parser.rec.types.TypeId from a String without any conversion
   *
   * @param s String containing the ATerm
   * @return the term from the String
   */
  public static parser.rec.types.TypeId fromString(String s) {
    return fromTerm(atermFactory.parse(s),idConv);
  }

  /**
   * Returns a parser.rec.types.TypeId from a Stream without any conversion
   *
   * @param stream stream containing the ATerm
   * @return the term from the Stream
   * @throws java.io.IOException if a problem occurs with the stream
   */
  public static parser.rec.types.TypeId fromStream(java.io.InputStream stream) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),idConv);
  }

  /**
   * Apply a conversion on the ATerm and returns a parser.rec.types.TypeId
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATermConverter used to convert the ATerm
   * @return the Gom term
   * @throws IllegalArgumentException
   */
  public static parser.rec.types.TypeId fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    aterm.ATerm convertedTerm = atConv.convert(trm);
    parser.rec.types.TypeId tmp;
    java.util.ArrayList<parser.rec.types.TypeId> results = new java.util.ArrayList<parser.rec.types.TypeId>();

    tmp = parser.rec.types.typeid.TypeId.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.typeid.TypeIdString.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.typeid.TypeIdInteger.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.typeid.TypeIdNil.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    switch(results.size()) {
      case 0:
        throw new IllegalArgumentException(trm + " is not a TypeId");
      case 1:
        return results.get(0);
      default:
        java.util.logging.Logger.getLogger("TypeId").log(java.util.logging.Level.WARNING,"There were many possibilities ({0}) in {1} but the first one was chosen: {2}",new Object[] {results.toString(), "parser.rec.types.TypeId", results.get(0).toString()});
        return results.get(0);
    }
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.TypeId from it
   *
   * @param s String containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.TypeId fromString(String s, tom.library.utils.ATermConverter atConv) {
    return fromTerm(atermFactory.parse(s),atConv);
  }

  /**
   * Apply a conversion on the ATerm contained in the Stream and returns a parser.rec.types.TypeId from it
   *
   * @param stream stream containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.TypeId fromStream(java.io.InputStream stream, tom.library.utils.ATermConverter atConv) throws java.io.IOException {
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
  public parser.rec.types.TypeId reverse() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }
  
}
