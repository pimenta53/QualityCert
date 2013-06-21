
package parser.rec.types.aux4;



public abstract class Aux4 extends parser.rec.types.Aux4 implements java.util.Collection<parser.rec.types.Exp>  {


  /**
   * Returns the number of arguments of the variadic operator
   *
   * @return the number of arguments of the variadic operator
   */
  @Override
  public int length() {
    if(this instanceof parser.rec.types.aux4.ConsAux4) {
      parser.rec.types.Aux4 tl = this.getTailAux4();
      if (tl instanceof Aux4) {
        return 1+((Aux4)tl).length();
      } else {
        return 2;
      }
    } else {
      return 0;
    }
  }

  public static parser.rec.types.Aux4 fromArray(parser.rec.types.Exp[] array) {
    parser.rec.types.Aux4 res = parser.rec.types.aux4.EmptyAux4.make();
    for(int i = array.length; i>0;) {
      res = parser.rec.types.aux4.ConsAux4.make(array[--i],res);
    }
    return res;
  }

  /**
   * Inverses the term if it is a list
   *
   * @return the inverted term if it is a list, otherwise the term itself
   */
  @Override
  public parser.rec.types.Aux4 reverse() {
    if(this instanceof parser.rec.types.aux4.ConsAux4) {
      parser.rec.types.Aux4 cur = this;
      parser.rec.types.Aux4 rev = parser.rec.types.aux4.EmptyAux4.make();
      while(cur instanceof parser.rec.types.aux4.ConsAux4) {
        rev = parser.rec.types.aux4.ConsAux4.make(cur.getHeadAux4(),rev);
        cur = cur.getTailAux4();
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
  public parser.rec.types.Aux4 append(parser.rec.types.Exp element) {
    if(this instanceof parser.rec.types.aux4.ConsAux4) {
      parser.rec.types.Aux4 tl = this.getTailAux4();
      if (tl instanceof Aux4) {
        return parser.rec.types.aux4.ConsAux4.make(this.getHeadAux4(),((Aux4)tl).append(element));
      } else {

        return parser.rec.types.aux4.ConsAux4.make(this.getHeadAux4(),parser.rec.types.aux4.ConsAux4.make(element,tl));

      }
    } else {
      return parser.rec.types.aux4.ConsAux4.make(element,this);
    }
  }

  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("Aux4(");
    if(this instanceof parser.rec.types.aux4.ConsAux4) {
      parser.rec.types.Aux4 cur = this;
      while(cur instanceof parser.rec.types.aux4.ConsAux4) {
        parser.rec.types.Exp elem = cur.getHeadAux4();
        cur = cur.getTailAux4();
        elem.toStringBuilder(buffer);

        if(cur instanceof parser.rec.types.aux4.ConsAux4) {
          buffer.append(",");
        }
      }
      if(!(cur instanceof parser.rec.types.aux4.EmptyAux4)) {
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
    if(this instanceof parser.rec.types.aux4.ConsAux4) {
      parser.rec.types.Aux4 tail = this.getTailAux4();
      res = atermFactory.makeList(getHeadAux4().toATerm(),(aterm.ATermList)tail.toATerm());
    }
    return res;
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.Aux4 from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.Aux4 fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if("Aux4".equals(appl.getName())) {
        parser.rec.types.Aux4 res = parser.rec.types.aux4.EmptyAux4.make();

        aterm.ATerm array[] = appl.getArgumentArray();
        for(int i = array.length-1; i>=0; --i) {
          parser.rec.types.Exp elem = parser.rec.types.Exp.fromTerm(array[i],atConv);
          res = parser.rec.types.aux4.ConsAux4.make(elem,res);
        }
        return res;
      }
    }

    if(trm instanceof aterm.ATermList) {
      aterm.ATermList list = (aterm.ATermList) trm;
      parser.rec.types.Aux4 res = parser.rec.types.aux4.EmptyAux4.make();
      try {
        while(!list.isEmpty()) {
          parser.rec.types.Exp elem = parser.rec.types.Exp.fromTerm(list.getFirst(),atConv);
          res = parser.rec.types.aux4.ConsAux4.make(elem,res);
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
   * Checks if parser.rec.types.Aux4 contains a specified object
   *
   * @param o object whose presence is tested
   * @return true if parser.rec.types.Aux4 contains the object, otherwise false
   */
  public boolean contains(Object o) {
    parser.rec.types.Aux4 cur = this;
    if(o==null) { return false; }
    if(cur instanceof parser.rec.types.aux4.ConsAux4) {
      while(cur instanceof parser.rec.types.aux4.ConsAux4) {
        if( o.equals(cur.getHeadAux4()) ) {
          return true;
        }
        cur = cur.getTailAux4();
      }
      if(!(cur instanceof parser.rec.types.aux4.EmptyAux4)) {
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
  public boolean isEmpty() { return isEmptyAux4() ; }

  public java.util.Iterator<parser.rec.types.Exp> iterator() {
    return new java.util.Iterator<parser.rec.types.Exp>() {
      parser.rec.types.Aux4 list = Aux4.this;

      public boolean hasNext() {
        return list!=null && !list.isEmptyAux4();
      }

      public parser.rec.types.Exp next() {
        if(list.isEmptyAux4()) {
          throw new java.util.NoSuchElementException();
        }
        if(list.isConsAux4()) {
          parser.rec.types.Exp head = list.getHeadAux4();
          list = list.getTailAux4();
          return head;
        } else {
          // we are in this case only if domain=codomain
          // thus, the cast is safe
          Object res = list;
          list = null;
          return (parser.rec.types.Exp)res;
        }
      }

      public void remove() {
        throw new UnsupportedOperationException("Not yet implemented");
      }
    };

  }

  public boolean add(parser.rec.types.Exp o) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean addAll(java.util.Collection<? extends parser.rec.types.Exp> c) {
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
    if(this instanceof parser.rec.types.aux4.ConsAux4) {
      parser.rec.types.Aux4 cur = this;
      while(cur instanceof parser.rec.types.aux4.ConsAux4) {
        parser.rec.types.Exp elem = cur.getHeadAux4();
        array[i] = elem;
        cur = cur.getTailAux4();
        i++;
      }
      if(!(cur instanceof parser.rec.types.aux4.EmptyAux4)) {
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
    if(this instanceof parser.rec.types.aux4.ConsAux4) {
      parser.rec.types.Aux4 cur = this;
      while(cur instanceof parser.rec.types.aux4.ConsAux4) {
        parser.rec.types.Exp elem = cur.getHeadAux4();
        array[i] = (T)elem;
        cur = cur.getTailAux4();
        i++;
      }
      if(!(cur instanceof parser.rec.types.aux4.EmptyAux4)) {
        array[i] = (T)cur;
      }
    }
    return array;
  }

  /*
   * to get a Collection for an immutable list
   */
  public java.util.Collection<parser.rec.types.Exp> getCollection() {
    return new CollectionAux4(this);
  }

  public java.util.Collection<parser.rec.types.Exp> getCollectionAux4() {
    return new CollectionAux4(this);
  }

  /************************************************************
   * private static class
   ************************************************************/
  private static class CollectionAux4 implements java.util.Collection<parser.rec.types.Exp> {
    private Aux4 list;

    public Aux4 getAux4() {
      return list;
    }

    public CollectionAux4(Aux4 list) {
      this.list = list;
    }

    /**
     * generic
     */
  public boolean addAll(java.util.Collection<? extends parser.rec.types.Exp> c) {
    boolean modified = false;
    java.util.Iterator<? extends parser.rec.types.Exp> it = c.iterator();
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
    return getAux4().contains(o);
  }

  /**
   * Checks if the collection contains elements given as parameter
   *
   * @param c elements whose presence has to be checked
   * @return true all the elements are found, otherwise false
   */
  public boolean containsAll(java.util.Collection<?> c) {
    return getAux4().containsAll(c);
  }

  /**
   * Checks if an object is equal
   *
   * @param o object which is compared
   * @return true if objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    return getAux4().equals(o);
  }

  /**
   * Returns the hashCode
   *
   * @return the hashCode
   */
  @Override
  public int hashCode() {
    return getAux4().hashCode();
  }

  /**
   * Returns an iterator over the elements in the collection
   *
   * @return an iterator over the elements in the collection
   */
  public java.util.Iterator<parser.rec.types.Exp> iterator() {
    return getAux4().iterator();
  }

  /**
   * Return the size of the collection
   *
   * @return the size of the collection
   */
  public int size() {
    return getAux4().size();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @return an array of elements
   */
  public Object[] toArray() {
    return getAux4().toArray();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @param array array which will contain the result
   * @return an array of elements
   */
  public <T> T[] toArray(T[] array) {
    return getAux4().toArray(array);
  }

/*
  public <T> T[] toArray(T[] array) {
    int size = getAux4().length();
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
    public boolean add(parser.rec.types.Exp o) {
      list = (Aux4)parser.rec.types.aux4.ConsAux4.make(o,list);
      return true;
    }

    /**
     * Removes all of the elements from this collection
     */
    public void clear() {
      list = (Aux4)parser.rec.types.aux4.EmptyAux4.make();
    }

    /**
     * Tests the emptiness of the collection
     *
     * @return true if the collection is empty
     */
    public boolean isEmpty() {
      return list.isEmptyAux4();
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
