
package parser.rec.types.auxexplist;



public final class ConsAuxExpList extends parser.rec.types.auxexplist.AuxExpList implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ConsAuxExpList";


  private ConsAuxExpList() {}
  private int hashCode;
  private static ConsAuxExpList gomProto = new ConsAuxExpList();
    private parser.rec.types.Exp _HeadAuxExpList;
  private parser.rec.types.AuxExpList _TailAuxExpList;

  /**
   * Constructor that builds a term rooted by ConsAuxExpList
   *
   * @return a term rooted by ConsAuxExpList
   */

  public static ConsAuxExpList make(parser.rec.types.Exp _HeadAuxExpList, parser.rec.types.AuxExpList _TailAuxExpList) {

    // use the proto as a model
    gomProto.initHashCode( _HeadAuxExpList,  _TailAuxExpList);
    return (ConsAuxExpList) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadAuxExpList
   * @param _TailAuxExpList
   * @param hashCode hashCode of ConsAuxExpList
   */
  private void init(parser.rec.types.Exp _HeadAuxExpList, parser.rec.types.AuxExpList _TailAuxExpList, int hashCode) {
    this._HeadAuxExpList = _HeadAuxExpList;
    this._TailAuxExpList = _TailAuxExpList;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadAuxExpList
   * @param _TailAuxExpList
   */
  private void initHashCode(parser.rec.types.Exp _HeadAuxExpList, parser.rec.types.AuxExpList _TailAuxExpList) {
    this._HeadAuxExpList = _HeadAuxExpList;
    this._TailAuxExpList = _TailAuxExpList;

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
    return "ConsAuxExpList";
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
    ConsAuxExpList clone = new ConsAuxExpList();
    clone.init( _HeadAuxExpList,  _TailAuxExpList, hashCode);
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
    ConsAuxExpList tco = (ConsAuxExpList) ao;
    int _HeadAuxExpListCmp = (this._HeadAuxExpList).compareToLPO(tco._HeadAuxExpList);
    if(_HeadAuxExpListCmp != 0) {
      return _HeadAuxExpListCmp;
    }

    int _TailAuxExpListCmp = (this._TailAuxExpList).compareToLPO(tco._TailAuxExpList);
    if(_TailAuxExpListCmp != 0) {
      return _TailAuxExpListCmp;
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
    ConsAuxExpList tco = (ConsAuxExpList) ao;
    int _HeadAuxExpListCmp = (this._HeadAuxExpList).compareTo(tco._HeadAuxExpList);
    if(_HeadAuxExpListCmp != 0) {
      return _HeadAuxExpListCmp;
    }

    int _TailAuxExpListCmp = (this._TailAuxExpList).compareTo(tco._TailAuxExpList);
    if(_TailAuxExpListCmp != 0) {
      return _TailAuxExpListCmp;
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
   * @return true if obj is a ConsAuxExpList and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ConsAuxExpList) {

      ConsAuxExpList peer = (ConsAuxExpList) obj;
      return _HeadAuxExpList==peer._HeadAuxExpList && _TailAuxExpList==peer._TailAuxExpList && true;
    }
    return false;
  }


   //AuxExpList interface
  /**
   * Returns true if the term is rooted by the symbol ConsAuxExpList
   *
   * @return true, because this is rooted by ConsAuxExpList
   */
  @Override
  public boolean isConsAuxExpList() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.Exp
   *
   * @return the attribute parser.rec.types.Exp
   */
  @Override
  public parser.rec.types.Exp getHeadAuxExpList() {
    return _HeadAuxExpList;
  }

  /**
   * Sets and returns the attribute parser.rec.types.AuxExpList
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.AuxExpList setHeadAuxExpList(parser.rec.types.Exp set_arg) {
    return make(set_arg, _TailAuxExpList);
  }
  
  /**
   * Returns the attribute parser.rec.types.AuxExpList
   *
   * @return the attribute parser.rec.types.AuxExpList
   */
  @Override
  public parser.rec.types.AuxExpList getTailAuxExpList() {
    return _TailAuxExpList;
  }

  /**
   * Sets and returns the attribute parser.rec.types.AuxExpList
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.AuxExpList which just has been set
   */
  @Override
  public parser.rec.types.AuxExpList setTailAuxExpList(parser.rec.types.AuxExpList set_arg) {
    return make(_HeadAuxExpList, set_arg);
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
      new aterm.ATerm[] {getHeadAuxExpList().toATerm(), getTailAuxExpList().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.AuxExpList from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.AuxExpList fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.Exp.fromTerm(appl.getArgument(0),atConv), parser.rec.types.AuxExpList.fromTerm(appl.getArgument(1),atConv)
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
      case 0: return _HeadAuxExpList;
      case 1: return _TailAuxExpList;

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
      case 0: return make((parser.rec.types.Exp) v, _TailAuxExpList);
      case 1: return make(_HeadAuxExpList, (parser.rec.types.AuxExpList) v);

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
    if (childs.length == 2  && childs[0] instanceof parser.rec.types.Exp && childs[1] instanceof parser.rec.types.AuxExpList) {
      return make((parser.rec.types.Exp) childs[0], (parser.rec.types.AuxExpList) childs[1]);
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
    return new tom.library.sl.Visitable[] {  _HeadAuxExpList,  _TailAuxExpList };
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
    b = (-815782265<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_HeadAuxExpList.hashCode() << 8);
    a += (_TailAuxExpList.hashCode());

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
