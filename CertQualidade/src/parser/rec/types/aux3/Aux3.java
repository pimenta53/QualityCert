
package parser.rec.types.aux3;



public abstract class Aux3 extends parser.rec.types.Aux3 implements java.util.Collection<String>  {


  /**
   * Returns the number of arguments of the variadic operator
   *
   * @return the number of arguments of the variadic operator
   */
  @Override
  public int length() {
    if(this instanceof parser.rec.types.aux3.ConsAux3) {
      parser.rec.types.Aux3 tl = this.getTailAux3();
      if (tl instanceof Aux3) {
        return 1+((Aux3)tl).length();
      } else {
        return 2;
      }
    } else {
      return 0;
    }
  }

  public static parser.rec.types.Aux3 fromArray(String[] array) {
    parser.rec.types.Aux3 res = parser.rec.types.aux3.EmptyAux3.make();
    for(int i = array.length; i>0;) {
      res = parser.rec.types.aux3.ConsAux3.make(array[--i],res);
    }
    return res;
  }

  /**
   * Inverses the term if it is a list
   *
   * @return the inverted term if it is a list, otherwise the term itself
   */
  @Override
  public parser.rec.types.Aux3 reverse() {
    if(this instanceof parser.rec.types.aux3.ConsAux3) {
      parser.rec.types.Aux3 cur = this;
      parser.rec.types.Aux3 rev = parser.rec.types.aux3.EmptyAux3.make();
      while(cur instanceof parser.rec.types.aux3.ConsAux3) {
        rev = parser.rec.types.aux3.ConsAux3.make(cur.getHeadAux3(),rev);
        cur = cur.getTailAux3();
      }

      return rev;
    } else {
      return this;
    }
  }

  /**
   * Appends an element
   *
   * @param element element which has to be added
   * @return the term with the added element
   */
  public parser.rec.types.Aux3 append(String element) {
    if(this instanceof parser.rec.types.aux3.ConsAux3) {
      parser.rec.types.Aux3 tl = this.getTailAux3();
      if (tl instanceof Aux3) {
        return parser.rec.types.aux3.ConsAux3.make(this.getHeadAux3(),((Aux3)tl).append(element));
      } else {

        return parser.rec.types.aux3.ConsAux3.make(this.getHeadAux3(),parser.rec.types.aux3.ConsAux3.make(element,tl));

      }
    } else {
      return parser.rec.types.aux3.ConsAux3.make(element,this);
    }
  }

  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("Aux3(");
    if(this instanceof parser.rec.types.aux3.ConsAux3) {
      parser.rec.types.Aux3 cur = this;
      while(cur instanceof parser.rec.types.aux3.ConsAux3) {
        String elem = cur.getHeadAux3();
        cur = cur.getTailAux3();
        buffer.append('"');
            for (int i = 0; i < elem.length(); i++) {
              char c = elem.charAt(i);
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

        if(cur instanceof parser.rec.types.aux3.ConsAux3) {
          buffer.append(",");
        }
      }
      if(!(cur instanceof parser.rec.types.aux3.EmptyAux3)) {
        buffer.append(",");
        cur.toStringBuilder(buffer);
      }
    }
    buffer.append(")");
  }

  /**
   * Returns an ATerm representation of this term.
   *
   * @return an ATerm representation of this term.
   */
  public aterm.ATerm toATerm() {
    aterm.ATerm res = atermFactory.makeList();
    if(this instanceof parser.rec.types.aux3.ConsAux3) {
      parser.rec.types.Aux3 tail = this.getTailAux3();
      res = atermFactory.makeList((aterm.ATerm) atermFactory.makeAppl(atermFactory.makeAFun(getHeadAux3() ,0 , true)),(aterm.ATermList)tail.toATerm());
    }
    return res;
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
      if("Aux3".equals(appl.getName())) {
        parser.rec.types.Aux3 res = parser.rec.types.aux3.EmptyAux3.make();

        aterm.ATerm array[] = appl.getArgumentArray();
        for(int i = array.length-1; i>=0; --i) {
          String elem = convertATermToString(array[i], atConv);
          res = parser.rec.types.aux3.ConsAux3.make(elem,res);
        }
        return res;
      }
    }

    if(trm instanceof aterm.ATermList) {
      aterm.ATermList list = (aterm.ATermList) trm;
      parser.rec.types.Aux3 res = parser.rec.types.aux3.EmptyAux3.make();
      try {
        while(!list.isEmpty()) {
          String elem = convertATermToString(list.getFirst(), atConv);
          res = parser.rec.types.aux3.ConsAux3.make(elem,res);
          list = list.getNext();
        }
      } catch(IllegalArgumentException e) {
        // returns null when the fromATerm call failed
        return null;
      }
      return res.reverse();
    }

    return null;
  }

  /*
   * Checks if the Collection contains all elements of the parameter Collection
   *
   * @param c the Collection of elements to check
   * @return true if the Collection contains all elements of the parameter, otherwise false
   */
  public boolean containsAll(java.util.Collection c) {
    java.util.Iterator it = c.iterator();
    while(it.hasNext()) {
      if(!this.contains(it.next())) {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks if parser.rec.types.Aux3 contains a specified object
   *
   * @param o object whose presence is tested
   * @return true if parser.rec.types.Aux3 contains the object, otherwise false
   */
  public boolean contains(Object o) {
    parser.rec.types.Aux3 cur = this;
    if(o==null) { return false; }
    if(cur instanceof parser.rec.types.aux3.ConsAux3) {
      while(cur instanceof parser.rec.types.aux3.ConsAux3) {
        if( o.equals(cur.getHeadAux3()) ) {
          return true;
        }
        cur = cur.getTailAux3();
      }
      if(!(cur instanceof parser.rec.types.aux3.EmptyAux3)) {
        if( o.equals(cur) ) {
          return true;
        }
      }
    }
    return false;
  }

  //public boolean equals(Object o) { return this == o; }

  //public int hashCode() { return hashCode(); }

  /**
   * Checks the emptiness
   *
   * @return true if empty, otherwise false
   */
  public boolean isEmpty() { return isEmptyAux3() ; }

  public java.util.Iterator<String> iterator() {
    return new java.util.Iterator<String>() {
      parser.rec.types.Aux3 list = Aux3.this;

      public boolean hasNext() {
        return list!=null && !list.isEmptyAux3();
      }

      public String next() {
        if(list.isEmptyAux3()) {
          throw new java.util.NoSuchElementException();
        }
        if(list.isConsAux3()) {
          String head = list.getHeadAux3();
          list = list.getTailAux3();
          return head;
        } else {
          // we are in this case only if domain=codomain
          // thus, the cast is safe
          Object res = list;
          list = null;
          return (String)res;
        }
      }

      public void remove() {
        throw new UnsupportedOperationException("Not yet implemented");
      }
    };

  }

  public boolean add(String o) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean addAll(java.util.Collection<? extends String> c) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean remove(Object o) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public void clear() {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean removeAll(java.util.Collection c) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean retainAll(java.util.Collection c) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  /**
   * Returns the size of the collection
   *
   * @return the size of the collection
   */
  public int size() { return length(); }

  /**
   * Returns an array containing the elements of the collection
   *
   * @return an array of elements
   */
  public Object[] toArray() {
    int size = this.length();
    Object[] array = new Object[size];
    int i=0;
    if(this instanceof parser.rec.types.aux3.ConsAux3) {
      parser.rec.types.Aux3 cur = this;
      while(cur instanceof parser.rec.types.aux3.ConsAux3) {
        String elem = cur.getHeadAux3();
        array[i] = elem;
        cur = cur.getTailAux3();
        i++;
      }
      if(!(cur instanceof parser.rec.types.aux3.EmptyAux3)) {
        array[i] = cur;
      }
    }
    return array;
  }

  @SuppressWarnings("unchecked")
  public <T> T[] toArray(T[] array) {
    int size = this.length();
    if (array.length < size) {
      array = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), size);
    } else if (array.length > size) {
      array[size] = null;
    }
    int i=0;
    if(this instanceof parser.rec.types.aux3.ConsAux3) {
      parser.rec.types.Aux3 cur = this;
      while(cur instanceof parser.rec.types.aux3.ConsAux3) {
        String elem = cur.getHeadAux3();
        array[i] = (T)elem;
        cur = cur.getTailAux3();
        i++;
      }
      if(!(cur instanceof parser.rec.types.aux3.EmptyAux3)) {
        array[i] = (T)cur;
      }
    }
    return array;
  }

  /*
   * to get a Collection for an immutable list
   */
  public java.util.Collection<String> getCollection() {
    return new CollectionAux3(this);
  }

  public java.util.Collection<String> getCollectionAux3() {
    return new CollectionAux3(this);
  }

  /************************************************************
   * private static class
   ************************************************************/
  private static class CollectionAux3 implements java.util.Collection<String> {
    private Aux3 list;

    public Aux3 getAux3() {
      return list;
    }

    public CollectionAux3(Aux3 list) {
      this.list = list;
    }

    /**
     * generic
     */
  public boolean addAll(java.util.Collection<? extends String> c) {
    boolean modified = false;
    java.util.Iterator<? extends String> it = c.iterator();
    while(it.hasNext()) {
      modified = modified || add(it.next());
    }
    return modified;
  }

  /**
   * Checks if the collection contains an element
   *
   * @param o element whose presence has to be checked
   * @return true if the element is found, otherwise false
   */
  public boolean contains(Object o) {
    return getAux3().contains(o);
  }

  /**
   * Checks if the collection contains elements given as parameter
   *
   * @param c elements whose presence has to be checked
   * @return true all the elements are found, otherwise false
   */
  public boolean containsAll(java.util.Collection<?> c) {
    return getAux3().containsAll(c);
  }

  /**
   * Checks if an object is equal
   *
   * @param o object which is compared
   * @return true if objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    return getAux3().equals(o);
  }

  /**
   * Returns the hashCode
   *
   * @return the hashCode
   */
  @Override
  public int hashCode() {
    return getAux3().hashCode();
  }

  /**
   * Returns an iterator over the elements in the collection
   *
   * @return an iterator over the elements in the collection
   */
  public java.util.Iterator<String> iterator() {
    return getAux3().iterator();
  }

  /**
   * Return the size of the collection
   *
   * @return the size of the collection
   */
  public int size() {
    return getAux3().size();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @return an array of elements
   */
  public Object[] toArray() {
    return getAux3().toArray();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @param array array which will contain the result
   * @return an array of elements
   */
  public <T> T[] toArray(T[] array) {
    return getAux3().toArray(array);
  }

/*
  public <T> T[] toArray(T[] array) {
    int size = getAux3().length();
    if (array.length < size) {
      array = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), size);
    } else if (array.length > size) {
      array[size] = null;
    }
    int i=0;
    for(java.util.Iterator it=iterator() ; it.hasNext() ; i++) {
        array[i] = (T)it.next();
    }
    return array;
  }
*/
    /**
     * Collection
     */

    /**
     * Adds an element to the collection
     *
     * @param o element to add to the collection
     * @return true if it is a success
     */
    public boolean add(String o) {
      list = (Aux3)parser.rec.types.aux3.ConsAux3.make(o,list);
      return true;
    }

    /**
     * Removes all of the elements from this collection
     */
    public void clear() {
      list = (Aux3)parser.rec.types.aux3.EmptyAux3.make();
    }

    /**
     * Tests the emptiness of the collection
     *
     * @return true if the collection is empty
     */
    public boolean isEmpty() {
      return list.isEmptyAux3();
    }

    public boolean remove(Object o) {
      throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean removeAll(java.util.Collection<?> c) {
      throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean retainAll(java.util.Collection<?> c) {
      throw new UnsupportedOperationException("Not yet implemented");
    }

  }


}
