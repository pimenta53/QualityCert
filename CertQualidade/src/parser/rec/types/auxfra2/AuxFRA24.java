
package parser.rec.types.auxfra2;



public final class AuxFRA24 extends parser.rec.types.AuxFRA2 implements tom.library.sl.Visitable  {
  
  private static String symbolName = "AuxFRA24";


  private AuxFRA24() {}
  private int hashCode;
  private static AuxFRA24 gomProto = new AuxFRA24();
    private parser.rec.types.Aux4 _a4;
  private parser.rec.types.Exp _e2;

  /**
   * Constructor that builds a term rooted by AuxFRA24
   *
   * @return a term rooted by AuxFRA24
   */

  public static AuxFRA24 make(parser.rec.types.Aux4 _a4, parser.rec.types.Exp _e2) {

    // use the proto as a model
    gomProto.initHashCode( _a4,  _e2);
    return (AuxFRA24) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _a4
   * @param _e2
   * @param hashCode hashCode of AuxFRA24
   */
  private void init(parser.rec.types.Aux4 _a4, parser.rec.types.Exp _e2, int hashCode) {
    this._a4 = _a4;
    this._e2 = _e2;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _a4
   * @param _e2
   */
  private void initHashCode(parser.rec.types.Aux4 _a4, parser.rec.types.Exp _e2) {
    this._a4 = _a4;
    this._e2 = _e2;

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
    return "AuxFRA24";
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
    AuxFRA24 clone = new AuxFRA24();
    clone.init( _a4,  _e2, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("AuxFRA24(");
    _a4.toStringBuilder(buffer);
buffer.append(",");
    _e2.toStringBuilder(buffer);

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
    AuxFRA24 tco = (AuxFRA24) ao;
    int _a4Cmp = (this._a4).compareToLPO(tco._a4);
    if(_a4Cmp != 0) {
      return _a4Cmp;
    }

    int _e2Cmp = (this._e2).compareToLPO(tco._e2);
    if(_e2Cmp != 0) {
      return _e2Cmp;
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
    AuxFRA24 tco = (AuxFRA24) ao;
    int _a4Cmp = (this._a4).compareTo(tco._a4);
    if(_a4Cmp != 0) {
      return _a4Cmp;
    }

    int _e2Cmp = (this._e2).compareTo(tco._e2);
    if(_e2Cmp != 0) {
      return _e2Cmp;
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
   * @return true if obj is a AuxFRA24 and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof AuxFRA24) {

      AuxFRA24 peer = (AuxFRA24) obj;
      return _a4==peer._a4 && _e2==peer._e2 && true;
    }
    return false;
  }


   //AuxFRA2 interface
  /**
   * Returns true if the term is rooted by the symbol AuxFRA24
   *
   * @return true, because this is rooted by AuxFRA24
   */
  @Override
  public boolean isAuxFRA24() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.Aux4
   *
   * @return the attribute parser.rec.types.Aux4
   */
  @Override
  public parser.rec.types.Aux4 geta4() {
    return _a4;
  }

  /**
   * Sets and returns the attribute parser.rec.types.AuxFRA2
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Aux4 which just has been set
   */
  @Override
  public parser.rec.types.AuxFRA2 seta4(parser.rec.types.Aux4 set_arg) {
    return make(set_arg, _e2);
  }
  
  /**
   * Returns the attribute parser.rec.types.Exp
   *
   * @return the attribute parser.rec.types.Exp
   */
  @Override
  public parser.rec.types.Exp gete2() {
    return _e2;
  }

  /**
   * Sets and returns the attribute parser.rec.types.AuxFRA2
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.AuxFRA2 sete2(parser.rec.types.Exp set_arg) {
    return make(_a4, set_arg);
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
      new aterm.ATerm[] {geta4().toATerm(), gete2().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.AuxFRA2 from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.AuxFRA2 fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.Aux4.fromTerm(appl.getArgument(0),atConv), parser.rec.types.Exp.fromTerm(appl.getArgument(1),atConv)
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
      case 0: return _a4;
      case 1: return _e2;

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
      case 0: return make((parser.rec.types.Aux4) v, _e2);
      case 1: return make(_a4, (parser.rec.types.Exp) v);

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
    if (childs.length == 2  && childs[0] instanceof parser.rec.types.Aux4 && childs[1] instanceof parser.rec.types.Exp) {
      return make((parser.rec.types.Aux4) childs[0], (parser.rec.types.Exp) childs[1]);
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
    return new tom.library.sl.Visitable[] {  _a4,  _e2 };
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
    b = (599978842<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_a4.hashCode() << 8);
    a += (_e2.hashCode());

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
