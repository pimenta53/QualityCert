
package parser.rec.types.expand;



public final class ExpAND extends parser.rec.types.ExpAND implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ExpAND";


  private ExpAND() {}
  private int hashCode;
  private static ExpAND gomProto = new ExpAND();
    private parser.rec.types.AritExp _ae;
  private parser.rec.types.RelExp _re;

  /**
   * Constructor that builds a term rooted by ExpAND
   *
   * @return a term rooted by ExpAND
   */

  public static ExpAND make(parser.rec.types.AritExp _ae, parser.rec.types.RelExp _re) {

    // use the proto as a model
    gomProto.initHashCode( _ae,  _re);
    return (ExpAND) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _ae
   * @param _re
   * @param hashCode hashCode of ExpAND
   */
  private void init(parser.rec.types.AritExp _ae, parser.rec.types.RelExp _re, int hashCode) {
    this._ae = _ae;
    this._re = _re;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _ae
   * @param _re
   */
  private void initHashCode(parser.rec.types.AritExp _ae, parser.rec.types.RelExp _re) {
    this._ae = _ae;
    this._re = _re;

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
    return "ExpAND";
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
    ExpAND clone = new ExpAND();
    clone.init( _ae,  _re, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("ExpAND(");
    _ae.toStringBuilder(buffer);
buffer.append(",");
    _re.toStringBuilder(buffer);

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
    ExpAND tco = (ExpAND) ao;
    int _aeCmp = (this._ae).compareToLPO(tco._ae);
    if(_aeCmp != 0) {
      return _aeCmp;
    }

    int _reCmp = (this._re).compareToLPO(tco._re);
    if(_reCmp != 0) {
      return _reCmp;
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
    ExpAND tco = (ExpAND) ao;
    int _aeCmp = (this._ae).compareTo(tco._ae);
    if(_aeCmp != 0) {
      return _aeCmp;
    }

    int _reCmp = (this._re).compareTo(tco._re);
    if(_reCmp != 0) {
      return _reCmp;
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
   * @return true if obj is a ExpAND and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ExpAND) {

      ExpAND peer = (ExpAND) obj;
      return _ae==peer._ae && _re==peer._re && true;
    }
    return false;
  }


   //ExpAND interface
  /**
   * Returns true if the term is rooted by the symbol ExpAND
   *
   * @return true, because this is rooted by ExpAND
   */
  @Override
  public boolean isExpAND() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.AritExp
   *
   * @return the attribute parser.rec.types.AritExp
   */
  @Override
  public parser.rec.types.AritExp getae() {
    return _ae;
  }

  /**
   * Sets and returns the attribute parser.rec.types.ExpAND
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.AritExp which just has been set
   */
  @Override
  public parser.rec.types.ExpAND setae(parser.rec.types.AritExp set_arg) {
    return make(set_arg, _re);
  }
  
  /**
   * Returns the attribute parser.rec.types.RelExp
   *
   * @return the attribute parser.rec.types.RelExp
   */
  @Override
  public parser.rec.types.RelExp getre() {
    return _re;
  }

  /**
   * Sets and returns the attribute parser.rec.types.ExpAND
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.RelExp which just has been set
   */
  @Override
  public parser.rec.types.ExpAND setre(parser.rec.types.RelExp set_arg) {
    return make(_ae, set_arg);
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
      new aterm.ATerm[] {getae().toATerm(), getre().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.ExpAND from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.ExpAND fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.AritExp.fromTerm(appl.getArgument(0),atConv), parser.rec.types.RelExp.fromTerm(appl.getArgument(1),atConv)
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
      case 0: return _ae;
      case 1: return _re;

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
      case 0: return make((parser.rec.types.AritExp) v, _re);
      case 1: return make(_ae, (parser.rec.types.RelExp) v);

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
    if (childs.length == 2  && childs[0] instanceof parser.rec.types.AritExp && childs[1] instanceof parser.rec.types.RelExp) {
      return make((parser.rec.types.AritExp) childs[0], (parser.rec.types.RelExp) childs[1]);
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
    return new tom.library.sl.Visitable[] {  _ae,  _re };
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
    b = (-1120943306<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_ae.hashCode() << 8);
    a += (_re.hashCode());

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
