
package parser.rec.types;


public abstract class FunctionRecordArray extends parser.rec.RecAbstractType  {
  /**
   * Sole constructor.  (For invocation by subclass
   * constructors, typically implicit.)
   */
  protected FunctionRecordArray() {}



  /**
   * Returns true if the term is rooted by the symbol FRAArgList
   *
   * @return true if the term is rooted by the symbol FRAArgList
   */
  public boolean isFRAArgList() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FRAFieldList
   *
   * @return true if the term is rooted by the symbol FRAFieldList
   */
  public boolean isFRAFieldList() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FRA1
   *
   * @return true if the term is rooted by the symbol FRA1
   */
  public boolean isFRA1() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FRA2
   *
   * @return true if the term is rooted by the symbol FRA2
   */
  public boolean isFRA2() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FRA3
   *
   * @return true if the term is rooted by the symbol FRA3
   */
  public boolean isFRA3() {
    return false;
  }

  /**
   * Returns true if the term is rooted by the symbol FunctionRecordArrayEmpty
   *
   * @return true if the term is rooted by the symbol FunctionRecordArrayEmpty
   */
  public boolean isFunctionRecordArrayEmpty() {
    return false;
  }

  /**
   * Returns the subterm corresponding to the slot al
   *
   * @return the subterm corresponding to the slot al
   */
  public parser.rec.types.ArgList getal() {
    throw new UnsupportedOperationException("This FunctionRecordArray has no al");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot al
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot al is replaced by _arg
   */
  public FunctionRecordArray setal(parser.rec.types.ArgList _arg) {
    throw new UnsupportedOperationException("This FunctionRecordArray has no al");
  }

  /**
   * Returns the subterm corresponding to the slot a2
   *
   * @return the subterm corresponding to the slot a2
   */
  public parser.rec.types.AuxFRA2 geta2() {
    throw new UnsupportedOperationException("This FunctionRecordArray has no a2");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot a2
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot a2 is replaced by _arg
   */
  public FunctionRecordArray seta2(parser.rec.types.AuxFRA2 _arg) {
    throw new UnsupportedOperationException("This FunctionRecordArray has no a2");
  }

  /**
   * Returns the subterm corresponding to the slot fl
   *
   * @return the subterm corresponding to the slot fl
   */
  public parser.rec.types.FieldList getfl() {
    throw new UnsupportedOperationException("This FunctionRecordArray has no fl");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot fl
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot fl is replaced by _arg
   */
  public FunctionRecordArray setfl(parser.rec.types.FieldList _arg) {
    throw new UnsupportedOperationException("This FunctionRecordArray has no fl");
  }

  /**
   * Returns the subterm corresponding to the slot a1
   *
   * @return the subterm corresponding to the slot a1
   */
  public parser.rec.types.AuxFRA1 geta1() {
    throw new UnsupportedOperationException("This FunctionRecordArray has no a1");
  }

  /**
   * Returns a new term where the subterm corresponding to the slot a1
   * is replaced by the term given in argument.
   * Note that there is no side-effect: a new term is returned and the original term is left unchanged
   *
   * @param _arg the value of the new subterm
   * @return a new term where the subterm corresponding to the slot a1 is replaced by _arg
   */
  public FunctionRecordArray seta1(parser.rec.types.AuxFRA1 _arg) {
    throw new UnsupportedOperationException("This FunctionRecordArray has no a1");
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
   * Returns a parser.rec.types.FunctionRecordArray from an ATerm without any conversion
   *
   * @param trm ATerm to handle to retrieve a Gom term
   * @return the term from the ATerm
   */
  public static parser.rec.types.FunctionRecordArray fromTerm(aterm.ATerm trm) {
    return fromTerm(trm,idConv);
  }

  /**
   * Returns a parser.rec.types.FunctionRecordArray from a String without any conversion
   *
   * @param s String containing the ATerm
   * @return the term from the String
   */
  public static parser.rec.types.FunctionRecordArray fromString(String s) {
    return fromTerm(atermFactory.parse(s),idConv);
  }

  /**
   * Returns a parser.rec.types.FunctionRecordArray from a Stream without any conversion
   *
   * @param stream stream containing the ATerm
   * @return the term from the Stream
   * @throws java.io.IOException if a problem occurs with the stream
   */
  public static parser.rec.types.FunctionRecordArray fromStream(java.io.InputStream stream) throws java.io.IOException {
    return fromTerm(atermFactory.readFromFile(stream),idConv);
  }

  /**
   * Apply a conversion on the ATerm and returns a parser.rec.types.FunctionRecordArray
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATermConverter used to convert the ATerm
   * @return the Gom term
   * @throws IllegalArgumentException
   */
  public static parser.rec.types.FunctionRecordArray fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    aterm.ATerm convertedTerm = atConv.convert(trm);
    parser.rec.types.FunctionRecordArray tmp;
    java.util.ArrayList<parser.rec.types.FunctionRecordArray> results = new java.util.ArrayList<parser.rec.types.FunctionRecordArray>();

    tmp = parser.rec.types.functionrecordarray.FRAArgList.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.functionrecordarray.FRAFieldList.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.functionrecordarray.FRA1.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.functionrecordarray.FRA2.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.functionrecordarray.FRA3.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    tmp = parser.rec.types.functionrecordarray.FunctionRecordArrayEmpty.fromTerm(convertedTerm,atConv);
    if(tmp!=null) {
      results.add(tmp);
    }
    switch(results.size()) {
      case 0:
        throw new IllegalArgumentException(trm + " is not a FunctionRecordArray");
      case 1:
        return results.get(0);
      default:
        java.util.logging.Logger.getLogger("FunctionRecordArray").log(java.util.logging.Level.WARNING,"There were many possibilities ({0}) in {1} but the first one was chosen: {2}",new Object[] {results.toString(), "parser.rec.types.FunctionRecordArray", results.get(0).toString()});
        return results.get(0);
    }
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.FunctionRecordArray from it
   *
   * @param s String containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.FunctionRecordArray fromString(String s, tom.library.utils.ATermConverter atConv) {
    return fromTerm(atermFactory.parse(s),atConv);
  }

  /**
   * Apply a conversion on the ATerm contained in the Stream and returns a parser.rec.types.FunctionRecordArray from it
   *
   * @param stream stream containing the ATerm
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.FunctionRecordArray fromStream(java.io.InputStream stream, tom.library.utils.ATermConverter atConv) throws java.io.IOException {
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
  public parser.rec.types.FunctionRecordArray reverse() {
    throw new IllegalArgumentException(
      "This "+this.getClass().getName()+" is not a list");
  }
  
}
