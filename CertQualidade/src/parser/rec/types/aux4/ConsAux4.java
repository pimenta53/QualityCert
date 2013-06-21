
package parser.rec.types.aux4;



public final class ConsAux4 extends parser.rec.types.aux4.Aux4 implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ConsAux4";


  private ConsAux4() {}
  private int hashCode;
  private static ConsAux4 gomProto = new ConsAux4();
    private parser.rec.types.Exp _HeadAux4;
  private parser.rec.types.Aux4 _TailAux4;

  /**
   * Constructor that builds a term rooted by ConsAux4
   *
   * @return a term rooted by ConsAux4
   */

  public static ConsAux4 make(parser.rec.types.Exp _HeadAux4, parser.rec.types.Aux4 _TailAux4) {

    // use the proto as a model
    gomProto.initHashCode( _HeadAux4,  _TailAux4);
    return (ConsAux4) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadAux4
   * @param _TailAux4
   * @param hashCode hashCode of ConsAux4
   */
  private void init(parser.rec.types.Exp _HeadAux4, parser.rec.types.Aux4 _TailAux4, int hashCode) {
    this._HeadAux4 = _HeadAux4;
    this._TailAux4 = _TailAux4;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadAux4
   * @param _TailAux4
   */
  private void initHashCode(parser.rec.types.Exp _HeadAux4, parser.rec.types.Aux4 _TailAux4) {
    this._HeadAux4 = _HeadAux4;
    this._TailAux4 = _TailAux4;

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
    return "ConsAux4";
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
    ConsAux4 clone = new ConsAux4();
    clone.init( _HeadAux4,  _TailAux4, hashCode);
    return clone;
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
    ConsAux4 tco = (ConsAux4) ao;
    int _HeadAux4Cmp = (this._HeadAux4).compareToLPO(tco._HeadAux4);
    if(_HeadAux4Cmp != 0) {
      return _HeadAux4Cmp;
    }

    int _TailAux4Cmp = (this._TailAux4).compareToLPO(tco._TailAux4);
    if(_TailAux4Cmp != 0) {
      return _TailAux4Cmp;
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
    ConsAux4 tco = (ConsAux4) ao;
    int _HeadAux4Cmp = (this._HeadAux4).compareTo(tco._HeadAux4);
    if(_HeadAux4Cmp != 0) {
      return _HeadAux4Cmp;
    }

    int _TailAux4Cmp = (this._TailAux4).compareTo(tco._TailAux4);
    if(_TailAux4Cmp != 0) {
      return _TailAux4Cmp;
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
   * @return true if obj is a ConsAux4 and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ConsAux4) {

      ConsAux4 peer = (ConsAux4) obj;
      return _HeadAux4==peer._HeadAux4 && _TailAux4==peer._TailAux4 && true;
    }
    return false;
  }


   //Aux4 interface
  /**
   * Returns true if the term is rooted by the symbol ConsAux4
   *
   * @return true, because this is rooted by ConsAux4
   */
  @Override
  public boolean isConsAux4() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.Exp
   *
   * @return the attribute parser.rec.types.Exp
   */
  @Override
  public parser.rec.types.Exp getHeadAux4() {
    return _HeadAux4;
  }

  /**
   * Sets and returns the attribute parser.rec.types.Aux4
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.Aux4 setHeadAux4(parser.rec.types.Exp set_arg) {
    return make(set_arg, _TailAux4);
  }
  
  /**
   * Returns the attribute parser.rec.types.Aux4
   *
   * @return the attribute parser.rec.types.Aux4
   */
  @Override
  public parser.rec.types.Aux4 getTailAux4() {
    return _TailAux4;
  }

  /**
   * Sets and returns the attribute parser.rec.types.Aux4
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Aux4 which just has been set
   */
  @Override
  public parser.rec.types.Aux4 setTailAux4(parser.rec.types.Aux4 set_arg) {
    return make(_HeadAux4, set_arg);
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
      new aterm.ATerm[] {getHeadAux4().toATerm(), getTailAux4().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.Aux4 from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Aux4 fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.Exp.fromTerm(appl.getArgument(0),atConv), parser.rec.types.Aux4.fromTerm(appl.getArgument(1),atConv)
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
      case 0: return _HeadAux4;
      case 1: return _TailAux4;

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
      case 0: return make((parser.rec.types.Exp) v, _TailAux4);
      case 1: return make(_HeadAux4, (parser.rec.types.Aux4) v);

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
    if (childs.length == 2  && childs[0] instanceof parser.rec.types.Exp && childs[1] instanceof parser.rec.types.Aux4) {
      return make((parser.rec.types.Exp) childs[0], (parser.rec.types.Aux4) childs[1]);
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
    return new tom.library.sl.Visitable[] {  _HeadAux4,  _TailAux4 };
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
    b = (-1904736706<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_HeadAux4.hashCode() << 8);
    a += (_TailAux4.hashCode());

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
