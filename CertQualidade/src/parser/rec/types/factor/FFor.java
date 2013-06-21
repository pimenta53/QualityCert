
package parser.rec.types.factor;



public final class FFor extends parser.rec.types.Factor implements tom.library.sl.Visitable  {
  
  private static String symbolName = "FFor";


  private FFor() {}
  private int hashCode;
  private static FFor gomProto = new FFor();
    private String _id;
  private parser.rec.types.Exp _e1;
  private parser.rec.types.Exp _e2;
  private parser.rec.types.Exp _e3;

  /**
   * Constructor that builds a term rooted by FFor
   *
   * @return a term rooted by FFor
   */

  public static FFor make(String _id, parser.rec.types.Exp _e1, parser.rec.types.Exp _e2, parser.rec.types.Exp _e3) {

    // use the proto as a model
    gomProto.initHashCode( _id,  _e1,  _e2,  _e3);
    return (FFor) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _id
   * @param _e1
   * @param _e2
   * @param _e3
   * @param hashCode hashCode of FFor
   */
  private void init(String _id, parser.rec.types.Exp _e1, parser.rec.types.Exp _e2, parser.rec.types.Exp _e3, int hashCode) {
    this._id = _id.intern();
    this._e1 = _e1;
    this._e2 = _e2;
    this._e3 = _e3;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _id
   * @param _e1
   * @param _e2
   * @param _e3
   */
  private void initHashCode(String _id, parser.rec.types.Exp _e1, parser.rec.types.Exp _e2, parser.rec.types.Exp _e3) {
    this._id = _id.intern();
    this._e1 = _e1;
    this._e2 = _e2;
    this._e3 = _e3;

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
    return "FFor";
  }

  /**
   * Returns the arity of the symbol
   *
   * @return the arity of the symbol
   */
  private int getArity() {
    return 4;
  }

  /**
   * Copy the object and returns the copy
   *
   * @return a clone of the SharedObject
   */
  public shared.SharedObject duplicate() {
    FFor clone = new FFor();
    clone.init( _id,  _e1,  _e2,  _e3, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("FFor(");
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
    _e1.toStringBuilder(buffer);
buffer.append(",");
    _e2.toStringBuilder(buffer);
buffer.append(",");
    _e3.toStringBuilder(buffer);

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
    FFor tco = (FFor) ao;
    int _idCmp = (this._id).compareTo(tco._id);
    if(_idCmp != 0) {
      return _idCmp;
    }


    int _e1Cmp = (this._e1).compareToLPO(tco._e1);
    if(_e1Cmp != 0) {
      return _e1Cmp;
    }

    int _e2Cmp = (this._e2).compareToLPO(tco._e2);
    if(_e2Cmp != 0) {
      return _e2Cmp;
    }

    int _e3Cmp = (this._e3).compareToLPO(tco._e3);
    if(_e3Cmp != 0) {
      return _e3Cmp;
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
    FFor tco = (FFor) ao;
    int _idCmp = (this._id).compareTo(tco._id);
    if(_idCmp != 0) {
      return _idCmp;
    }


    int _e1Cmp = (this._e1).compareTo(tco._e1);
    if(_e1Cmp != 0) {
      return _e1Cmp;
    }

    int _e2Cmp = (this._e2).compareTo(tco._e2);
    if(_e2Cmp != 0) {
      return _e2Cmp;
    }

    int _e3Cmp = (this._e3).compareTo(tco._e3);
    if(_e3Cmp != 0) {
      return _e3Cmp;
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
   * @return true if obj is a FFor and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof FFor) {

      FFor peer = (FFor) obj;
      return _id==peer._id && _e1==peer._e1 && _e2==peer._e2 && _e3==peer._e3 && true;
    }
    return false;
  }


   //Factor interface
  /**
   * Returns true if the term is rooted by the symbol FFor
   *
   * @return true, because this is rooted by FFor
   */
  @Override
  public boolean isFFor() {
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
   * Sets and returns the attribute parser.rec.types.Factor
   *
   * @param set_arg the argument to set
   * @return the attribute String which just has been set
   */
  @Override
  public parser.rec.types.Factor setid(String set_arg) {
    return make(set_arg, _e1, _e2, _e3);
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
   * Sets and returns the attribute parser.rec.types.Factor
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.Factor sete1(parser.rec.types.Exp set_arg) {
    return make(_id, set_arg, _e2, _e3);
  }
  
  /**
   * Returns the attribute parser.rec.types.Exp
   *
   * @return the attribute parser.rec.types.Exp
   */
  @Override
  public parser.rec.types.Exp gete2() {
    return _e2;
  }

  /**
   * Sets and returns the attribute parser.rec.types.Factor
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.Factor sete2(parser.rec.types.Exp set_arg) {
    return make(_id, _e1, set_arg, _e3);
  }
  
  /**
   * Returns the attribute parser.rec.types.Exp
   *
   * @return the attribute parser.rec.types.Exp
   */
  @Override
  public parser.rec.types.Exp gete3() {
    return _e3;
  }

  /**
   * Sets and returns the attribute parser.rec.types.Factor
   *
   * @param set_arg the argument to set
   * @return the attribute parser.rec.types.Exp which just has been set
   */
  @Override
  public parser.rec.types.Factor sete3(parser.rec.types.Exp set_arg) {
    return make(_id, _e1, _e2, set_arg);
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
      new aterm.ATerm[] {(aterm.ATerm) atermFactory.makeAppl(atermFactory.makeAFun(getid() ,0 , true)), gete1().toATerm(), gete2().toATerm(), gete3().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.Factor from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Factor fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
convertATermToString(appl.getArgument(0), atConv), parser.rec.types.Exp.fromTerm(appl.getArgument(1),atConv), parser.rec.types.Exp.fromTerm(appl.getArgument(2),atConv), parser.rec.types.Exp.fromTerm(appl.getArgument(3),atConv)
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
    return 4;
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
      case 1: return _e1;
      case 2: return _e2;
      case 3: return _e3;

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
      case 0: return make(getid(), _e1, _e2, _e3);
      case 1: return make(getid(), (parser.rec.types.Exp) v, _e2, _e3);
      case 2: return make(getid(), _e1, (parser.rec.types.Exp) v, _e3);
      case 3: return make(getid(), _e1, _e2, (parser.rec.types.Exp) v);

      default: throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Set children to the term
   *
   * @param childs array of children to set
   * @return an array of children which just were set
   * @throws IndexOutOfBoundsException if length of "childs" is different than 4
   */
  @SuppressWarnings("unchecked")
  public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] childs) {
    if (childs.length == 4  && childs[0] instanceof tom.library.sl.VisitableBuiltin && childs[1] instanceof parser.rec.types.Exp && childs[2] instanceof parser.rec.types.Exp && childs[3] instanceof parser.rec.types.Exp) {
      return make(((tom.library.sl.VisitableBuiltin<String>)childs[0]).getBuiltin(), (parser.rec.types.Exp) childs[1], (parser.rec.types.Exp) childs[2], (parser.rec.types.Exp) childs[3]);
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
    return new tom.library.sl.Visitable[] {  new tom.library.sl.VisitableBuiltin<String>(_id),  _e1,  _e2,  _e3 };
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
    b = (974467200<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (shared.HashFunctions.stringHashFunction(_id, 3) << 24);
    a += (_e1.hashCode() << 16);
    a += (_e2.hashCode() << 8);
    a += (_e3.hashCode());

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
