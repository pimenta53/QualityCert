
package parser.rec.types.explist;



public final class ExpList extends parser.rec.types.ExpList implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ExpList";


  private ExpList() {}
  private int hashCode;
  private static ExpList gomProto = new ExpList();
    private parser.rec.types.Exp _e1;
  private parser.rec.types.AuxExpList _a;

  /**
   * Constructor that builds a term rooted by ExpList
   *
   * @return a term rooted by ExpList
   */

  public static ExpList make(parser.rec.types.Exp _e1, parser.rec.types.AuxExpList _a) {

    // use the proto as a model
    gomProto.initHashCode( _e1,  _a);
    return (ExpList) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _e1
   * @param _a
   * @param hashCode hashCode of ExpList
   */
  private void init(parser.rec.types.Exp _e1, parser.rec.types.AuxExpList _a, int hashCode) {
    this._e1 = _e1;
    this._a = _a;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _e1
   * @param _a
   */
  private void initHashCode(parser.rec.types.Exp _e1, parser.rec.types.AuxExpList _a) {
    this._e1 = _e1;
    this._a = _a;

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
    return "ExpList";
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
    ExpList clone = new ExpList();
    clone.init( _e1,  _a, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("ExpList(");
    _e1.toStringBuilder(buffer);
buffer.append(",");
    _a.toStringBuilder(buffer);

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
    ExpList tco = (ExpList) ao;
    int _e1Cmp = (this._e1).compareToLPO(tco._e1);
    if(_e1Cmp != 0) {
      return _e1Cmp;
    }

    int _aCmp = (this._a).compareToLPO(tco._a);
    if(_aCmp != 0) {
      return _aCmp;
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
    ExpList tco = (ExpList) ao;
    int _e1Cmp = (this._e1).compareTo(tco._e1);
    if(_e1Cmp != 0) {
      return _e1Cmp;
    }

    int _aCmp = (this._a).compareTo(tco._a);
    if(_aCmp != 0) {
      return _aCmp;
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
   * @return true if obj is a ExpList and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ExpList) {

      ExpList peer = (ExpList) obj;
      return _e1==peer._e1 && _a==peer._a && true;
    }
    return false;
  }


   //ExpList interface
  /**
   * Returns true if the term is rooted by the symbol ExpList
   *
   * @return true, because this is rooted by ExpList
   */
  @Override
  public boolean isExpList() {
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
   * Sets and returns the attribute parser.rec.types.ExpList
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.ExpList sete1(parser.rec.types.Exp set_arg) {
    return make(set_arg, _a);
  }
  
  /**
   * Returns the attribute parser.rec.types.AuxExpList
   *
   * @return the attribute parser.rec.types.AuxExpList
   */
  @Override
  public parser.rec.types.AuxExpList geta() {
    return _a;
  }

  /**
   * Sets and returns the attribute parser.rec.types.ExpList
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.AuxExpList which just has been set
   */
  @Override
  public parser.rec.types.ExpList seta(parser.rec.types.AuxExpList set_arg) {
    return make(_e1, set_arg);
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
      new aterm.ATerm[] {gete1().toATerm(), geta().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.ExpList from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.ExpList fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
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
      case 0: return _e1;
      case 1: return _a;

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
      case 0: return make((parser.rec.types.Exp) v, _a);
      case 1: return make(_e1, (parser.rec.types.AuxExpList) v);

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
    return new tom.library.sl.Visitable[] {  _e1,  _a };
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
    b = (-1383178579<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_e1.hashCode() << 8);
    a += (_a.hashCode());

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
