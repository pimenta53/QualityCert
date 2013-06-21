
package parser.rec.types.aux3;



public final class ConsAux3 extends parser.rec.types.aux3.Aux3 implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ConsAux3";


  private ConsAux3() {}
  private int hashCode;
  private static ConsAux3 gomProto = new ConsAux3();
    private String _HeadAux3;
  private parser.rec.types.Aux3 _TailAux3;

  /**
   * Constructor that builds a term rooted by ConsAux3
   *
   * @return a term rooted by ConsAux3
   */

  public static ConsAux3 make(String _HeadAux3, parser.rec.types.Aux3 _TailAux3) {

    // use the proto as a model
    gomProto.initHashCode( _HeadAux3,  _TailAux3);
    return (ConsAux3) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadAux3
   * @param _TailAux3
   * @param hashCode hashCode of ConsAux3
   */
  private void init(String _HeadAux3, parser.rec.types.Aux3 _TailAux3, int hashCode) {
    this._HeadAux3 = _HeadAux3.intern();
    this._TailAux3 = _TailAux3;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadAux3
   * @param _TailAux3
   */
  private void initHashCode(String _HeadAux3, parser.rec.types.Aux3 _TailAux3) {
    this._HeadAux3 = _HeadAux3.intern();
    this._TailAux3 = _TailAux3;

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
    return "ConsAux3";
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
    ConsAux3 clone = new ConsAux3();
    clone.init( _HeadAux3,  _TailAux3, hashCode);
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
    ConsAux3 tco = (ConsAux3) ao;
    int _HeadAux3Cmp = (this._HeadAux3).compareTo(tco._HeadAux3);
    if(_HeadAux3Cmp != 0) {
      return _HeadAux3Cmp;
    }


    int _TailAux3Cmp = (this._TailAux3).compareToLPO(tco._TailAux3);
    if(_TailAux3Cmp != 0) {
      return _TailAux3Cmp;
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
    ConsAux3 tco = (ConsAux3) ao;
    int _HeadAux3Cmp = (this._HeadAux3).compareTo(tco._HeadAux3);
    if(_HeadAux3Cmp != 0) {
      return _HeadAux3Cmp;
    }


    int _TailAux3Cmp = (this._TailAux3).compareTo(tco._TailAux3);
    if(_TailAux3Cmp != 0) {
      return _TailAux3Cmp;
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
   * @return true if obj is a ConsAux3 and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ConsAux3) {

      ConsAux3 peer = (ConsAux3) obj;
      return _HeadAux3==peer._HeadAux3 && _TailAux3==peer._TailAux3 && true;
    }
    return false;
  }


   //Aux3 interface
  /**
   * Returns true if the term is rooted by the symbol ConsAux3
   *
   * @return true, because this is rooted by ConsAux3
   */
  @Override
  public boolean isConsAux3() {
    return true;
  }
  
  /**
   * Returns the attribute String
   *
   * @return the attribute String
   */
  @Override
  public String getHeadAux3() {
    return _HeadAux3;
  }

  /**
   * Sets and returns the attribute parser.rec.types.Aux3
   *
   * @param set_arg the argument to set
   * @return the attribute String which just has been set
   */
  @Override
  public parser.rec.types.Aux3 setHeadAux3(String set_arg) {
    return make(set_arg, _TailAux3);
  }
  
  /**
   * Returns the attribute parser.rec.types.Aux3
   *
   * @return the attribute parser.rec.types.Aux3
   */
  @Override
  public parser.rec.types.Aux3 getTailAux3() {
    return _TailAux3;
  }

  /**
   * Sets and returns the attribute parser.rec.types.Aux3
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Aux3 which just has been set
   */
  @Override
  public parser.rec.types.Aux3 setTailAux3(parser.rec.types.Aux3 set_arg) {
    return make(_HeadAux3, set_arg);
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
      new aterm.ATerm[] {(aterm.ATerm) atermFactory.makeAppl(atermFactory.makeAFun(getHeadAux3() ,0 , true)), getTailAux3().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.Aux3 from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Aux3 fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
convertATermToString(appl.getArgument(0), atConv), parser.rec.types.Aux3.fromTerm(appl.getArgument(1),atConv)
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
      case 0: return new tom.library.sl.VisitableBuiltin<String>(_HeadAux3);
      case 1: return _TailAux3;

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
      case 0: return make(getHeadAux3(), _TailAux3);
      case 1: return make(getHeadAux3(), (parser.rec.types.Aux3) v);

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
    if (childs.length == 2  && childs[0] instanceof tom.library.sl.VisitableBuiltin && childs[1] instanceof parser.rec.types.Aux3) {
      return make(((tom.library.sl.VisitableBuiltin<String>)childs[0]).getBuiltin(), (parser.rec.types.Aux3) childs[1]);
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
    return new tom.library.sl.Visitable[] {  new tom.library.sl.VisitableBuiltin<String>(_HeadAux3),  _TailAux3 };
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
    b = (2099758357<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (shared.HashFunctions.stringHashFunction(_HeadAux3, 1) << 8);
    a += (_TailAux3.hashCode());

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
