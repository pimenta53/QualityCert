
package parser.rec.types.auxfieldlist;



public final class ConsAuxFieldList extends parser.rec.types.auxfieldlist.AuxFieldList implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ConsAuxFieldList";


  private ConsAuxFieldList() {}
  private int hashCode;
  private static ConsAuxFieldList gomProto = new ConsAuxFieldList();
    private parser.rec.types.IntFieldList _HeadAuxFieldList;
  private parser.rec.types.AuxFieldList _TailAuxFieldList;

  /**
   * Constructor that builds a term rooted by ConsAuxFieldList
   *
   * @return a term rooted by ConsAuxFieldList
   */

  public static ConsAuxFieldList make(parser.rec.types.IntFieldList _HeadAuxFieldList, parser.rec.types.AuxFieldList _TailAuxFieldList) {

    // use the proto as a model
    gomProto.initHashCode( _HeadAuxFieldList,  _TailAuxFieldList);
    return (ConsAuxFieldList) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadAuxFieldList
   * @param _TailAuxFieldList
   * @param hashCode hashCode of ConsAuxFieldList
   */
  private void init(parser.rec.types.IntFieldList _HeadAuxFieldList, parser.rec.types.AuxFieldList _TailAuxFieldList, int hashCode) {
    this._HeadAuxFieldList = _HeadAuxFieldList;
    this._TailAuxFieldList = _TailAuxFieldList;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadAuxFieldList
   * @param _TailAuxFieldList
   */
  private void initHashCode(parser.rec.types.IntFieldList _HeadAuxFieldList, parser.rec.types.AuxFieldList _TailAuxFieldList) {
    this._HeadAuxFieldList = _HeadAuxFieldList;
    this._TailAuxFieldList = _TailAuxFieldList;

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
    return "ConsAuxFieldList";
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
    ConsAuxFieldList clone = new ConsAuxFieldList();
    clone.init( _HeadAuxFieldList,  _TailAuxFieldList, hashCode);
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
    ConsAuxFieldList tco = (ConsAuxFieldList) ao;
    int _HeadAuxFieldListCmp = (this._HeadAuxFieldList).compareToLPO(tco._HeadAuxFieldList);
    if(_HeadAuxFieldListCmp != 0) {
      return _HeadAuxFieldListCmp;
    }

    int _TailAuxFieldListCmp = (this._TailAuxFieldList).compareToLPO(tco._TailAuxFieldList);
    if(_TailAuxFieldListCmp != 0) {
      return _TailAuxFieldListCmp;
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
    ConsAuxFieldList tco = (ConsAuxFieldList) ao;
    int _HeadAuxFieldListCmp = (this._HeadAuxFieldList).compareTo(tco._HeadAuxFieldList);
    if(_HeadAuxFieldListCmp != 0) {
      return _HeadAuxFieldListCmp;
    }

    int _TailAuxFieldListCmp = (this._TailAuxFieldList).compareTo(tco._TailAuxFieldList);
    if(_TailAuxFieldListCmp != 0) {
      return _TailAuxFieldListCmp;
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
   * @return true if obj is a ConsAuxFieldList and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ConsAuxFieldList) {

      ConsAuxFieldList peer = (ConsAuxFieldList) obj;
      return _HeadAuxFieldList==peer._HeadAuxFieldList && _TailAuxFieldList==peer._TailAuxFieldList && true;
    }
    return false;
  }


   //AuxFieldList interface
  /**
   * Returns true if the term is rooted by the symbol ConsAuxFieldList
   *
   * @return true, because this is rooted by ConsAuxFieldList
   */
  @Override
  public boolean isConsAuxFieldList() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.IntFieldList
   *
   * @return the attribute parser.rec.types.IntFieldList
   */
  @Override
  public parser.rec.types.IntFieldList getHeadAuxFieldList() {
    return _HeadAuxFieldList;
  }

  /**
   * Sets and returns the attribute parser.rec.types.AuxFieldList
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.IntFieldList which just has been set
   */
  @Override
  public parser.rec.types.AuxFieldList setHeadAuxFieldList(parser.rec.types.IntFieldList set_arg) {
    return make(set_arg, _TailAuxFieldList);
  }
  
  /**
   * Returns the attribute parser.rec.types.AuxFieldList
   *
   * @return the attribute parser.rec.types.AuxFieldList
   */
  @Override
  public parser.rec.types.AuxFieldList getTailAuxFieldList() {
    return _TailAuxFieldList;
  }

  /**
   * Sets and returns the attribute parser.rec.types.AuxFieldList
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.AuxFieldList which just has been set
   */
  @Override
  public parser.rec.types.AuxFieldList setTailAuxFieldList(parser.rec.types.AuxFieldList set_arg) {
    return make(_HeadAuxFieldList, set_arg);
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
      new aterm.ATerm[] {getHeadAuxFieldList().toATerm(), getTailAuxFieldList().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.AuxFieldList from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.AuxFieldList fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.IntFieldList.fromTerm(appl.getArgument(0),atConv), parser.rec.types.AuxFieldList.fromTerm(appl.getArgument(1),atConv)
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
      case 0: return _HeadAuxFieldList;
      case 1: return _TailAuxFieldList;

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
      case 0: return make((parser.rec.types.IntFieldList) v, _TailAuxFieldList);
      case 1: return make(_HeadAuxFieldList, (parser.rec.types.AuxFieldList) v);

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
    if (childs.length == 2  && childs[0] instanceof parser.rec.types.IntFieldList && childs[1] instanceof parser.rec.types.AuxFieldList) {
      return make((parser.rec.types.IntFieldList) childs[0], (parser.rec.types.AuxFieldList) childs[1]);
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
    return new tom.library.sl.Visitable[] {  _HeadAuxFieldList,  _TailAuxFieldList };
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
    b = (-686880481<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_HeadAuxFieldList.hashCode() << 8);
    a += (_TailAuxFieldList.hashCode());

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
