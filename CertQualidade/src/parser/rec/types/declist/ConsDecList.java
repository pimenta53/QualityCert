
package parser.rec.types.declist;



public final class ConsDecList extends parser.rec.types.declist.DecList implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ConsDecList";


  private ConsDecList() {}
  private int hashCode;
  private static ConsDecList gomProto = new ConsDecList();
    private parser.rec.types.Dec _HeadDecList;
  private parser.rec.types.DecList _TailDecList;

  /**
   * Constructor that builds a term rooted by ConsDecList
   *
   * @return a term rooted by ConsDecList
   */

  public static ConsDecList make(parser.rec.types.Dec _HeadDecList, parser.rec.types.DecList _TailDecList) {

    // use the proto as a model
    gomProto.initHashCode( _HeadDecList,  _TailDecList);
    return (ConsDecList) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadDecList
   * @param _TailDecList
   * @param hashCode hashCode of ConsDecList
   */
  private void init(parser.rec.types.Dec _HeadDecList, parser.rec.types.DecList _TailDecList, int hashCode) {
    this._HeadDecList = _HeadDecList;
    this._TailDecList = _TailDecList;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadDecList
   * @param _TailDecList
   */
  private void initHashCode(parser.rec.types.Dec _HeadDecList, parser.rec.types.DecList _TailDecList) {
    this._HeadDecList = _HeadDecList;
    this._TailDecList = _TailDecList;

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
    return "ConsDecList";
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
    ConsDecList clone = new ConsDecList();
    clone.init( _HeadDecList,  _TailDecList, hashCode);
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
    ConsDecList tco = (ConsDecList) ao;
    int _HeadDecListCmp = (this._HeadDecList).compareToLPO(tco._HeadDecList);
    if(_HeadDecListCmp != 0) {
      return _HeadDecListCmp;
    }

    int _TailDecListCmp = (this._TailDecList).compareToLPO(tco._TailDecList);
    if(_TailDecListCmp != 0) {
      return _TailDecListCmp;
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
    ConsDecList tco = (ConsDecList) ao;
    int _HeadDecListCmp = (this._HeadDecList).compareTo(tco._HeadDecList);
    if(_HeadDecListCmp != 0) {
      return _HeadDecListCmp;
    }

    int _TailDecListCmp = (this._TailDecList).compareTo(tco._TailDecList);
    if(_TailDecListCmp != 0) {
      return _TailDecListCmp;
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
   * @return true if obj is a ConsDecList and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ConsDecList) {

      ConsDecList peer = (ConsDecList) obj;
      return _HeadDecList==peer._HeadDecList && _TailDecList==peer._TailDecList && true;
    }
    return false;
  }


   //DecList interface
  /**
   * Returns true if the term is rooted by the symbol ConsDecList
   *
   * @return true, because this is rooted by ConsDecList
   */
  @Override
  public boolean isConsDecList() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.Dec
   *
   * @return the attribute parser.rec.types.Dec
   */
  @Override
  public parser.rec.types.Dec getHeadDecList() {
    return _HeadDecList;
  }

  /**
   * Sets and returns the attribute parser.rec.types.DecList
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Dec which just has been set
   */
  @Override
  public parser.rec.types.DecList setHeadDecList(parser.rec.types.Dec set_arg) {
    return make(set_arg, _TailDecList);
  }
  
  /**
   * Returns the attribute parser.rec.types.DecList
   *
   * @return the attribute parser.rec.types.DecList
   */
  @Override
  public parser.rec.types.DecList getTailDecList() {
    return _TailDecList;
  }

  /**
   * Sets and returns the attribute parser.rec.types.DecList
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.DecList which just has been set
   */
  @Override
  public parser.rec.types.DecList setTailDecList(parser.rec.types.DecList set_arg) {
    return make(_HeadDecList, set_arg);
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
      new aterm.ATerm[] {getHeadDecList().toATerm(), getTailDecList().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.DecList from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.DecList fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.Dec.fromTerm(appl.getArgument(0),atConv), parser.rec.types.DecList.fromTerm(appl.getArgument(1),atConv)
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
      case 0: return _HeadDecList;
      case 1: return _TailDecList;

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
      case 0: return make((parser.rec.types.Dec) v, _TailDecList);
      case 1: return make(_HeadDecList, (parser.rec.types.DecList) v);

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
    if (childs.length == 2  && childs[0] instanceof parser.rec.types.Dec && childs[1] instanceof parser.rec.types.DecList) {
      return make((parser.rec.types.Dec) childs[0], (parser.rec.types.DecList) childs[1]);
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
    return new tom.library.sl.Visitable[] {  _HeadDecList,  _TailDecList };
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
    b = (-694205038<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_HeadDecList.hashCode() << 8);
    a += (_TailDecList.hashCode());

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
