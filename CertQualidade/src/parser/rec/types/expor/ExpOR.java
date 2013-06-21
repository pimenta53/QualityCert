
package parser.rec.types.expor;



public final class ExpOR extends parser.rec.types.ExpOR implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ExpOR";


  private ExpOR() {}
  private int hashCode;
  private static ExpOR gomProto = new ExpOR();
    private parser.rec.types.ExpAND _ea;
  private parser.rec.types.ExpANDPr _eap;

  /**
   * Constructor that builds a term rooted by ExpOR
   *
   * @return a term rooted by ExpOR
   */

  public static ExpOR make(parser.rec.types.ExpAND _ea, parser.rec.types.ExpANDPr _eap) {

    // use the proto as a model
    gomProto.initHashCode( _ea,  _eap);
    return (ExpOR) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _ea
   * @param _eap
   * @param hashCode hashCode of ExpOR
   */
  private void init(parser.rec.types.ExpAND _ea, parser.rec.types.ExpANDPr _eap, int hashCode) {
    this._ea = _ea;
    this._eap = _eap;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _ea
   * @param _eap
   */
  private void initHashCode(parser.rec.types.ExpAND _ea, parser.rec.types.ExpANDPr _eap) {
    this._ea = _ea;
    this._eap = _eap;

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
    return "ExpOR";
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
    ExpOR clone = new ExpOR();
    clone.init( _ea,  _eap, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("ExpOR(");
    _ea.toStringBuilder(buffer);
buffer.append(",");
    _eap.toStringBuilder(buffer);

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
    ExpOR tco = (ExpOR) ao;
    int _eaCmp = (this._ea).compareToLPO(tco._ea);
    if(_eaCmp != 0) {
      return _eaCmp;
    }

    int _eapCmp = (this._eap).compareToLPO(tco._eap);
    if(_eapCmp != 0) {
      return _eapCmp;
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
    ExpOR tco = (ExpOR) ao;
    int _eaCmp = (this._ea).compareTo(tco._ea);
    if(_eaCmp != 0) {
      return _eaCmp;
    }

    int _eapCmp = (this._eap).compareTo(tco._eap);
    if(_eapCmp != 0) {
      return _eapCmp;
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
   * @return true if obj is a ExpOR and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ExpOR) {

      ExpOR peer = (ExpOR) obj;
      return _ea==peer._ea && _eap==peer._eap && true;
    }
    return false;
  }


   //ExpOR interface
  /**
   * Returns true if the term is rooted by the symbol ExpOR
   *
   * @return true, because this is rooted by ExpOR
   */
  @Override
  public boolean isExpOR() {
    return true;
  }
  
  /**
   * Returns the attribute parser.rec.types.ExpAND
   *
   * @return the attribute parser.rec.types.ExpAND
   */
  @Override
  public parser.rec.types.ExpAND getea() {
    return _ea;
  }

  /**
   * Sets and returns the attribute parser.rec.types.ExpOR
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.ExpAND which just has been set
   */
  @Override
  public parser.rec.types.ExpOR setea(parser.rec.types.ExpAND set_arg) {
    return make(set_arg, _eap);
  }
  
  /**
   * Returns the attribute parser.rec.types.ExpANDPr
   *
   * @return the attribute parser.rec.types.ExpANDPr
   */
  @Override
  public parser.rec.types.ExpANDPr geteap() {
    return _eap;
  }

  /**
   * Sets and returns the attribute parser.rec.types.ExpOR
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.ExpANDPr which just has been set
   */
  @Override
  public parser.rec.types.ExpOR seteap(parser.rec.types.ExpANDPr set_arg) {
    return make(_ea, set_arg);
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
      new aterm.ATerm[] {getea().toATerm(), geteap().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.ExpOR from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.ExpOR fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
parser.rec.types.ExpAND.fromTerm(appl.getArgument(0),atConv), parser.rec.types.ExpANDPr.fromTerm(appl.getArgument(1),atConv)
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
      case 0: return _ea;
      case 1: return _eap;

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
      case 0: return make((parser.rec.types.ExpAND) v, _eap);
      case 1: return make(_ea, (parser.rec.types.ExpANDPr) v);

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
    if (childs.length == 2  && childs[0] instanceof parser.rec.types.ExpAND && childs[1] instanceof parser.rec.types.ExpANDPr) {
      return make((parser.rec.types.ExpAND) childs[0], (parser.rec.types.ExpANDPr) childs[1]);
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
    return new tom.library.sl.Visitable[] {  _ea,  _eap };
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
    b = (-2132225000<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_ea.hashCode() << 8);
    a += (_eap.hashCode());

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
