
package parser.rec.types.factor;



public final class FIfThenElse extends parser.rec.types.Factor implements tom.library.sl.Visitable  {
  
  private static String symbolName = "FIfThenElse";


  private FIfThenElse() {}
  private int hashCode;
  private static FIfThenElse gomProto = new FIfThenElse();
    private parser.rec.types.Exp _e1;
  private parser.rec.types.Exp _e2;
  private parser.rec.types.Exp _e3;

  /**
   * Constructor that builds a term rooted by FIfThenElse
   *
   * @return a term rooted by FIfThenElse
   */

  public static FIfThenElse make(parser.rec.types.Exp _e1, parser.rec.types.Exp _e2, parser.rec.types.Exp _e3) {

    // use the proto as a model
    gomProto.initHashCode( _e1,  _e2,  _e3);
    return (FIfThenElse) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _e1
   * @param _e2
   * @param _e3
   * @param hashCode hashCode of FIfThenElse
   */
  private void init(parser.rec.types.Exp _e1, parser.rec.types.Exp _e2, parser.rec.types.Exp _e3, int hashCode) {
    this._e1 = _e1;
    this._e2 = _e2;
    this._e3 = _e3;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _e1
   * @param _e2
   * @param _e3
   */
  private void initHashCode(parser.rec.types.Exp _e1, parser.rec.types.Exp _e2, parser.rec.types.Exp _e3) {
    this._e1 = _e1;
    this._e2 = _e2;
    this._e3 = _e3;

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
    return "FIfThenElse";
  }

  /**
   * Returns the arity of the symbol
   *
   * @return the arity of the symbol
   */
  private int getArity() {
    return 3;
  }

  /**
   * Copy the object and returns the copy
   *
   * @return a clone of the SharedObject
   */
  public shared.SharedObject duplicate() {
    FIfThenElse clone = new FIfThenElse();
    clone.init( _e1,  _e2,  _e3, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("FIfThenElse(");
    _e1.toStringBuilder(buffer);
buffer.append(",");
    _e2.toStringBuilder(buffer);
buffer.append(",");
    _e3.toStringBuilder(buffer);

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
    FIfThenElse tco = (FIfThenElse) ao;
    int _e1Cmp = (this._e1).compareToLPO(tco._e1);
    if(_e1Cmp != 0) {
      return _e1Cmp;
    }

    int _e2Cmp = (this._e2).compareToLPO(tco._e2);
    if(_e2Cmp != 0) {
      return _e2Cmp;
    }

    int _e3Cmp = (this._e3).compareToLPO(tco._e3);
    if(_e3Cmp != 0) {
      return _e3Cmp;
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
    FIfThenElse tco = (FIfThenElse) ao;
    int _e1Cmp = (this._e1).compareTo(tco._e1);
    if(_e1Cmp != 0) {
      return _e1Cmp;
    }

    int _e2Cmp = (this._e2).compareTo(tco._e2);
    if(_e2Cmp != 0) {
      return _e2Cmp;
    }

    int _e3Cmp = (this._e3).compareTo(tco._e3);
    if(_e3Cmp != 0) {
      return _e3Cmp;
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
   * @return true if obj is a FIfThenElse and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof FIfThenElse) {

      FIfThenElse peer = (FIfThenElse) obj;
      return _e1==peer._e1 && _e2==peer._e2 && _e3==peer._e3 && true;
    }
    return false;
  }


   //Factor interface
  /**
   * Returns true if the term is rooted by the symbol FIfThenElse
   *
   * @return true, because this is rooted by FIfThenElse
   */
  @Override
  public boolean isFIfThenElse() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.Exp
   *
   * @return the attribute parser.rec.types.Exp
   */
  @Override
  public parser.rec.types.Exp gete1() {
    return _e1;
  }

  /**
   * Sets and returns the attribute parser.rec.types.Factor
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.Factor sete1(parser.rec.types.Exp set_arg) {
    return make(set_arg, _e2, _e3);
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
   * Sets and returns the attribute parser.rec.types.Factor
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.Factor sete2(parser.rec.types.Exp set_arg) {
    return make(_e1, set_arg, _e3);
  }
  
  /**
   * Returns the attribute parser.rec.types.Exp
   *
   * @return the attribute parser.rec.types.Exp
   */
  @Override
  public parser.rec.types.Exp gete3() {
    return _e3;
  }

  /**
   * Sets and returns the attribute parser.rec.types.Factor
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.Factor sete3(parser.rec.types.Exp set_arg) {
    return make(_e1, _e2, set_arg);
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
      new aterm.ATerm[] {gete1().toATerm(), gete2().toATerm(), gete3().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.Factor from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Factor fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.Exp.fromTerm(appl.getArgument(0),atConv), parser.rec.types.Exp.fromTerm(appl.getArgument(1),atConv), parser.rec.types.Exp.fromTerm(appl.getArgument(2),atConv)
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
    return 3;
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
      case 0: return _e1;
      case 1: return _e2;
      case 2: return _e3;

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
      case 0: return make((parser.rec.types.Exp) v, _e2, _e3);
      case 1: return make(_e1, (parser.rec.types.Exp) v, _e3);
      case 2: return make(_e1, _e2, (parser.rec.types.Exp) v);

      default: throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Set children to the term
   *
   * @param childs array of children to set
   * @return an array of children which just were set
   * @throws IndexOutOfBoundsException if length of "childs" is different than 3
   */
  @SuppressWarnings("unchecked")
  public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] childs) {
    if (childs.length == 3  && childs[0] instanceof parser.rec.types.Exp && childs[1] instanceof parser.rec.types.Exp && childs[2] instanceof parser.rec.types.Exp) {
      return make((parser.rec.types.Exp) childs[0], (parser.rec.types.Exp) childs[1], (parser.rec.types.Exp) childs[2]);
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
    return new tom.library.sl.Visitable[] {  _e1,  _e2,  _e3 };
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
    b = (1381989842<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_e1.hashCode() << 16);
    a += (_e2.hashCode() << 8);
    a += (_e3.hashCode());

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
