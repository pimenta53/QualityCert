
package parser.rec.types.vardec;



public final class VarDec2 extends parser.rec.types.VarDec implements tom.library.sl.Visitable  {
  
  private static String symbolName = "VarDec2";


  private VarDec2() {}
  private int hashCode;
  private static VarDec2 gomProto = new VarDec2();
    private String _id;
  private parser.rec.types.TypeId _ti;
  private parser.rec.types.Aux2 _a;

  /**
   * Constructor that builds a term rooted by VarDec2
   *
   * @return a term rooted by VarDec2
   */

  public static VarDec2 make(String _id, parser.rec.types.TypeId _ti, parser.rec.types.Aux2 _a) {

    // use the proto as a model
    gomProto.initHashCode( _id,  _ti,  _a);
    return (VarDec2) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _id
   * @param _ti
   * @param _a
   * @param hashCode hashCode of VarDec2
   */
  private void init(String _id, parser.rec.types.TypeId _ti, parser.rec.types.Aux2 _a, int hashCode) {
    this._id = _id.intern();
    this._ti = _ti;
    this._a = _a;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _id
   * @param _ti
   * @param _a
   */
  private void initHashCode(String _id, parser.rec.types.TypeId _ti, parser.rec.types.Aux2 _a) {
    this._id = _id.intern();
    this._ti = _ti;
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
    return "VarDec2";
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
    VarDec2 clone = new VarDec2();
    clone.init( _id,  _ti,  _a, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("VarDec2(");
    buffer.append('"');
            for (int i = 0; i < _id.length(); i++) {
              char c = _id.charAt(i);
              switch (c) {
                case '\n':
                  buffer.append('\\');
                  buffer.append('n');
                  break;
                case '\t':
                  buffer.append('\\');
                  buffer.append('t');
                  break;
                case '\b':
                  buffer.append('\\');
                  buffer.append('b');
                  break;
                case '\r':
                  buffer.append('\\');
                  buffer.append('r');
                  break;
                case '\f':
                  buffer.append('\\');
                  buffer.append('f');
                  break;
                case '\\':
                  buffer.append('\\');
                  buffer.append('\\');
                  break;
                case '\'':
                  buffer.append('\\');
                  buffer.append('\'');
                  break;
                case '\"':
                  buffer.append('\\');
                  buffer.append('\"');
                  break;
                case '!':
                case '@':
                case '#':
                case '$':
                case '%':
                case '^':
                case '&':
                case '*':
                case '(':
                case ')':
                case '-':
                case '_':
                case '+':
                case '=':
                case '|':
                case '~':
                case '{':
                case '}':
                case '[':
                case ']':
                case ';':
                case ':':
                case '<':
                case '>':
                case ',':
                case '.':
                case '?':
                case ' ':
                case '/':
                  buffer.append(c);
                  break;

                default:
                  if (java.lang.Character.isLetterOrDigit(c)) {
                    buffer.append(c);
                  } else {
                    buffer.append('\\');
                    buffer.append((char) ('0' + c / 64));
                    c = (char) (c % 64);
                    buffer.append((char) ('0' + c / 8));
                    c = (char) (c % 8);
                    buffer.append((char) ('0' + c));
                  }
              }
            }
            buffer.append('"');
buffer.append(",");
    _ti.toStringBuilder(buffer);
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
    VarDec2 tco = (VarDec2) ao;
    int _idCmp = (this._id).compareTo(tco._id);
    if(_idCmp != 0) {
      return _idCmp;
    }


    int _tiCmp = (this._ti).compareToLPO(tco._ti);
    if(_tiCmp != 0) {
      return _tiCmp;
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
    VarDec2 tco = (VarDec2) ao;
    int _idCmp = (this._id).compareTo(tco._id);
    if(_idCmp != 0) {
      return _idCmp;
    }


    int _tiCmp = (this._ti).compareTo(tco._ti);
    if(_tiCmp != 0) {
      return _tiCmp;
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
   * @return true if obj is a VarDec2 and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof VarDec2) {

      VarDec2 peer = (VarDec2) obj;
      return _id==peer._id && _ti==peer._ti && _a==peer._a && true;
    }
    return false;
  }


   //VarDec interface
  /**
   * Returns true if the term is rooted by the symbol VarDec2
   *
   * @return true, because this is rooted by VarDec2
   */
  @Override
  public boolean isVarDec2() {
    return true;
  }
  
  /**
   * Returns the attribute String
   *
   * @return the attribute String
   */
  @Override
  public String getid() {
    return _id;
  }

  /**
   * Sets and returns the attribute parser.rec.types.VarDec
   *
   * @param set_arg the argument to set
   * @return the attribute String which just has been set
   */
  @Override
  public parser.rec.types.VarDec setid(String set_arg) {
    return make(set_arg, _ti, _a);
  }
  
  /**
   * Returns the attribute parser.rec.types.TypeId
   *
   * @return the attribute parser.rec.types.TypeId
   */
  @Override
  public parser.rec.types.TypeId getti() {
    return _ti;
  }

  /**
   * Sets and returns the attribute parser.rec.types.VarDec
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.TypeId which just has been set
   */
  @Override
  public parser.rec.types.VarDec setti(parser.rec.types.TypeId set_arg) {
    return make(_id, set_arg, _a);
  }
  
  /**
   * Returns the attribute parser.rec.types.Aux2
   *
   * @return the attribute parser.rec.types.Aux2
   */
  @Override
  public parser.rec.types.Aux2 geta() {
    return _a;
  }

  /**
   * Sets and returns the attribute parser.rec.types.VarDec
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Aux2 which just has been set
   */
  @Override
  public parser.rec.types.VarDec seta(parser.rec.types.Aux2 set_arg) {
    return make(_id, _ti, set_arg);
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
      new aterm.ATerm[] {(aterm.ATerm) atermFactory.makeAppl(atermFactory.makeAFun(getid() ,0 , true)), getti().toATerm(), geta().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.VarDec from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.VarDec fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
convertATermToString(appl.getArgument(0), atConv), parser.rec.types.TypeId.fromTerm(appl.getArgument(1),atConv), parser.rec.types.Aux2.fromTerm(appl.getArgument(2),atConv)
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
      case 0: return new tom.library.sl.VisitableBuiltin<String>(_id);
      case 1: return _ti;
      case 2: return _a;

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
      case 0: return make(getid(), _ti, _a);
      case 1: return make(getid(), (parser.rec.types.TypeId) v, _a);
      case 2: return make(getid(), _ti, (parser.rec.types.Aux2) v);

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
    if (childs.length == 3  && childs[0] instanceof tom.library.sl.VisitableBuiltin && childs[1] instanceof parser.rec.types.TypeId && childs[2] instanceof parser.rec.types.Aux2) {
      return make(((tom.library.sl.VisitableBuiltin<String>)childs[0]).getBuiltin(), (parser.rec.types.TypeId) childs[1], (parser.rec.types.Aux2) childs[2]);
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
    return new tom.library.sl.Visitable[] {  new tom.library.sl.VisitableBuiltin<String>(_id),  _ti,  _a };
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
    b = (1197767135<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (shared.HashFunctions.stringHashFunction(_id, 2) << 16);
    a += (_ti.hashCode() << 8);
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
