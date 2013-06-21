
package parser.rec.types.functionrecordarray;



public final class FRA3 extends parser.rec.types.FunctionRecordArray implements tom.library.sl.Visitable  {
  
  private static String symbolName = "FRA3";


  private FRA3() {}
  private int hashCode;
  private static FRA3 gomProto = new FRA3();
    private parser.rec.types.AuxFRA1 _a1;
  private parser.rec.types.AuxFRA2 _a2;

  /**
   * Constructor that builds a term rooted by FRA3
   *
   * @return a term rooted by FRA3
   */

  public static FRA3 make(parser.rec.types.AuxFRA1 _a1, parser.rec.types.AuxFRA2 _a2) {

    // use the proto as a model
    gomProto.initHashCode( _a1,  _a2);
    return (FRA3) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _a1
   * @param _a2
   * @param hashCode hashCode of FRA3
   */
  private void init(parser.rec.types.AuxFRA1 _a1, parser.rec.types.AuxFRA2 _a2, int hashCode) {
    this._a1 = _a1;
    this._a2 = _a2;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _a1
   * @param _a2
   */
  private void initHashCode(parser.rec.types.AuxFRA1 _a1, parser.rec.types.AuxFRA2 _a2) {
    this._a1 = _a1;
    this._a2 = _a2;

    this.hashCode = hashFunction();
  }

  /* name and arity */

  /**
   * Returns the name of the symbol
   *
   * @return the name of the symbol
   */
  @Override
  public String symbolName() {
    return "FRA3";
  }

  /**
   * Returns the arity of the symbol
   *
   * @return the arity of the symbol
   */
  private int getArity() {
    return 2;
  }

  /**
   * Copy the object and returns the copy
   *
   * @return a clone of the SharedObject
   */
  public shared.SharedObject duplicate() {
    FRA3 clone = new FRA3();
    clone.init( _a1,  _a2, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("FRA3(");
    _a1.toStringBuilder(buffer);
buffer.append(",");
    _a2.toStringBuilder(buffer);

    buffer.append(")");
  }


  /**
   * Compares two terms. This functions implements a total lexicographic path ordering.
   *
   * @param o object to which this term is compared
   * @return a negative integer, zero, or a positive integer as this
   *         term is less than, equal to, or greater than the argument
   * @throws ClassCastException in case of invalid arguments
   * @throws RuntimeException if unable to compare childs
   */
  @Override
  public int compareToLPO(Object o) {
    /*
     * We do not want to compare with any object, only members of the module
     * In case of invalid argument, throw a ClassCastException, as the java api
     * asks for it
     */
    parser.rec.RecAbstractType ao = (parser.rec.RecAbstractType) o;
    /* return 0 for equality */
    if (ao == this) { return 0; }
    /* compare the symbols */
    int symbCmp = this.symbolName().compareTo(ao.symbolName());
    if (symbCmp != 0) { return symbCmp; }
    /* compare the childs */
    FRA3 tco = (FRA3) ao;
    int _a1Cmp = (this._a1).compareToLPO(tco._a1);
    if(_a1Cmp != 0) {
      return _a1Cmp;
    }

    int _a2Cmp = (this._a2).compareToLPO(tco._a2);
    if(_a2Cmp != 0) {
      return _a2Cmp;
    }

    throw new RuntimeException("Unable to compare");
  }

 /**
   * Compares two terms. This functions implements a total order.
   *
   * @param o object to which this term is compared
   * @return a negative integer, zero, or a positive integer as this
   *         term is less than, equal to, or greater than the argument
   * @throws ClassCastException in case of invalid arguments
   * @throws RuntimeException if unable to compare childs
   */
  @Override
  public int compareTo(Object o) {
    /*
     * We do not want to compare with any object, only members of the module
     * In case of invalid argument, throw a ClassCastException, as the java api
     * asks for it
     */
    parser.rec.RecAbstractType ao = (parser.rec.RecAbstractType) o;
    /* return 0 for equality */
    if (ao == this) { return 0; }
    /* use the hash values to discriminate */

    if(hashCode != ao.hashCode()) { return (hashCode < ao.hashCode())?-1:1; }

    /* If not, compare the symbols : back to the normal order */
    int symbCmp = this.symbolName().compareTo(ao.symbolName());
    if (symbCmp != 0) { return symbCmp; }
    /* last resort: compare the childs */
    FRA3 tco = (FRA3) ao;
    int _a1Cmp = (this._a1).compareTo(tco._a1);
    if(_a1Cmp != 0) {
      return _a1Cmp;
    }

    int _a2Cmp = (this._a2).compareTo(tco._a2);
    if(_a2Cmp != 0) {
      return _a2Cmp;
    }

    throw new RuntimeException("Unable to compare");
  }

 //shared.SharedObject
  /**
   * Returns hashCode
   *
   * @return hashCode
   */
  @Override
  public final int hashCode() {
    return hashCode;
  }

  /**
   * Checks if a SharedObject is equivalent to the current object
   *
   * @param obj SharedObject to test
   * @return true if obj is a FRA3 and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof FRA3) {

      FRA3 peer = (FRA3) obj;
      return _a1==peer._a1 && _a2==peer._a2 && true;
    }
    return false;
  }


   //FunctionRecordArray interface
  /**
   * Returns true if the term is rooted by the symbol FRA3
   *
   * @return true, because this is rooted by FRA3
   */
  @Override
  public boolean isFRA3() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.AuxFRA1
   *
   * @return the attribute parser.rec.types.AuxFRA1
   */
  @Override
  public parser.rec.types.AuxFRA1 geta1() {
    return _a1;
  }

  /**
   * Sets and returns the attribute parser.rec.types.FunctionRecordArray
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.AuxFRA1 which just has been set
   */
  @Override
  public parser.rec.types.FunctionRecordArray seta1(parser.rec.types.AuxFRA1 set_arg) {
    return make(set_arg, _a2);
  }
  
  /**
   * Returns the attribute parser.rec.types.AuxFRA2
   *
   * @return the attribute parser.rec.types.AuxFRA2
   */
  @Override
  public parser.rec.types.AuxFRA2 geta2() {
    return _a2;
  }

  /**
   * Sets and returns the attribute parser.rec.types.FunctionRecordArray
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.AuxFRA2 which just has been set
   */
  @Override
  public parser.rec.types.FunctionRecordArray seta2(parser.rec.types.AuxFRA2 set_arg) {
    return make(_a1, set_arg);
  }
  
  /* AbstractType */
  /**
   * Returns an ATerm representation of this term.
   *
   * @return an ATerm representation of this term.
   */
  @Override
  public aterm.ATerm toATerm() {
    aterm.ATerm res = super.toATerm();
    if(res != null) {
      // the super class has produced an ATerm (may be a variadic operator)
      return res;
    }
    return atermFactory.makeAppl(
      atermFactory.makeAFun(symbolName(),getArity(),false),
      new aterm.ATerm[] {geta1().toATerm(), geta2().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.FunctionRecordArray from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.FunctionRecordArray fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.AuxFRA1.fromTerm(appl.getArgument(0),atConv), parser.rec.types.AuxFRA2.fromTerm(appl.getArgument(1),atConv)
        );
      }
    }
    return null;
  }

  /* Visitable */
  /**
   * Returns the number of childs of the term
   *
   * @return the number of childs of the term
   */
  public int getChildCount() {
    return 2;
  }

  /**
   * Returns the child at the specified index
   *
   * @param index index of the child to return; must be
             nonnegative and less than the childCount
   * @return the child at the specified index
   * @throws IndexOutOfBoundsException if the index out of range
   */
  public tom.library.sl.Visitable getChildAt(int index) {
    switch(index) {
      case 0: return _a1;
      case 1: return _a2;

      default: throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Set the child at the specified index
   *
   * @param index index of the child to set; must be
             nonnegative and less than the childCount
   * @param v child to set at the specified index
   * @return the child which was just set
   * @throws IndexOutOfBoundsException if the index out of range
   */
  public tom.library.sl.Visitable setChildAt(int index, tom.library.sl.Visitable v) {
    switch(index) {
      case 0: return make((parser.rec.types.AuxFRA1) v, _a2);
      case 1: return make(_a1, (parser.rec.types.AuxFRA2) v);

      default: throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Set children to the term
   *
   * @param childs array of children to set
   * @return an array of children which just were set
   * @throws IndexOutOfBoundsException if length of "childs" is different than 2
   */
  @SuppressWarnings("unchecked")
  public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] childs) {
    if (childs.length == 2  && childs[0] instanceof parser.rec.types.AuxFRA1 && childs[1] instanceof parser.rec.types.AuxFRA2) {
      return make((parser.rec.types.AuxFRA1) childs[0], (parser.rec.types.AuxFRA2) childs[1]);
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Returns the whole children of the term
   *
   * @return the children of the term
   */
  public tom.library.sl.Visitable[] getChildren() {
    return new tom.library.sl.Visitable[] {  _a1,  _a2 };
  }

    /**
     * Compute a hashcode for this term.
     * (for internal use)
     *
     * @return a hash value
     */
  protected int hashFunction() {
    int a, b, c;
    /* Set up the internal state */
    a = 0x9e3779b9; /* the golden ratio; an arbitrary value */
    b = (-2048378878<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_a1.hashCode() << 8);
    a += (_a2.hashCode());

    a -= b; a -= c; a ^= (c >> 13);
    b -= c; b -= a; b ^= (a << 8);
    c -= a; c -= b; c ^= (b >> 13);
    a -= b; a -= c; a ^= (c >> 12);
    b -= c; b -= a; b ^= (a << 16);
    c -= a; c -= b; c ^= (b >> 5);
    a -= b; a -= c; a ^= (c >> 3);
    b -= c; b -= a; b ^= (a << 10);
    c -= a; c -= b; c ^= (b >> 15);
    /* ------------------------------------------- report the result */
    return c;
  }

}
