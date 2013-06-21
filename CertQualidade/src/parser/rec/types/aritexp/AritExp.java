
package parser.rec.types.aritexp;



public final class AritExp extends parser.rec.types.AritExp implements tom.library.sl.Visitable  {
  
  private static String symbolName = "AritExp";


  private AritExp() {}
  private int hashCode;
  private static AritExp gomProto = new AritExp();
    private parser.rec.types.Term _t;
  private parser.rec.types.TermPr _tp;

  /**
   * Constructor that builds a term rooted by AritExp
   *
   * @return a term rooted by AritExp
   */

  public static AritExp make(parser.rec.types.Term _t, parser.rec.types.TermPr _tp) {

    // use the proto as a model
    gomProto.initHashCode( _t,  _tp);
    return (AritExp) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _t
   * @param _tp
   * @param hashCode hashCode of AritExp
   */
  private void init(parser.rec.types.Term _t, parser.rec.types.TermPr _tp, int hashCode) {
    this._t = _t;
    this._tp = _tp;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _t
   * @param _tp
   */
  private void initHashCode(parser.rec.types.Term _t, parser.rec.types.TermPr _tp) {
    this._t = _t;
    this._tp = _tp;

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
    return "AritExp";
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
    AritExp clone = new AritExp();
    clone.init( _t,  _tp, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("AritExp(");
    _t.toStringBuilder(buffer);
buffer.append(",");
    _tp.toStringBuilder(buffer);

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
    AritExp tco = (AritExp) ao;
    int _tCmp = (this._t).compareToLPO(tco._t);
    if(_tCmp != 0) {
      return _tCmp;
    }

    int _tpCmp = (this._tp).compareToLPO(tco._tp);
    if(_tpCmp != 0) {
      return _tpCmp;
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
    AritExp tco = (AritExp) ao;
    int _tCmp = (this._t).compareTo(tco._t);
    if(_tCmp != 0) {
      return _tCmp;
    }

    int _tpCmp = (this._tp).compareTo(tco._tp);
    if(_tpCmp != 0) {
      return _tpCmp;
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
   * @return true if obj is a AritExp and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof AritExp) {

      AritExp peer = (AritExp) obj;
      return _t==peer._t && _tp==peer._tp && true;
    }
    return false;
  }


   //AritExp interface
  /**
   * Returns true if the term is rooted by the symbol AritExp
   *
   * @return true, because this is rooted by AritExp
   */
  @Override
  public boolean isAritExp() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.Term
   *
   * @return the attribute parser.rec.types.Term
   */
  @Override
  public parser.rec.types.Term gett() {
    return _t;
  }

  /**
   * Sets and returns the attribute parser.rec.types.AritExp
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Term which just has been set
   */
  @Override
  public parser.rec.types.AritExp sett(parser.rec.types.Term set_arg) {
    return make(set_arg, _tp);
  }
  
  /**
   * Returns the attribute parser.rec.types.TermPr
   *
   * @return the attribute parser.rec.types.TermPr
   */
  @Override
  public parser.rec.types.TermPr gettp() {
    return _tp;
  }

  /**
   * Sets and returns the attribute parser.rec.types.AritExp
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.TermPr which just has been set
   */
  @Override
  public parser.rec.types.AritExp settp(parser.rec.types.TermPr set_arg) {
    return make(_t, set_arg);
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
      new aterm.ATerm[] {gett().toATerm(), gettp().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.AritExp from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.AritExp fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.Term.fromTerm(appl.getArgument(0),atConv), parser.rec.types.TermPr.fromTerm(appl.getArgument(1),atConv)
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
      case 0: return _t;
      case 1: return _tp;

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
      case 0: return make((parser.rec.types.Term) v, _tp);
      case 1: return make(_t, (parser.rec.types.TermPr) v);

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
    if (childs.length == 2  && childs[0] instanceof parser.rec.types.Term && childs[1] instanceof parser.rec.types.TermPr) {
      return make((parser.rec.types.Term) childs[0], (parser.rec.types.TermPr) childs[1]);
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
    return new tom.library.sl.Visitable[] {  _t,  _tp };
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
    b = (758721423<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_t.hashCode() << 8);
    a += (_tp.hashCode());

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
