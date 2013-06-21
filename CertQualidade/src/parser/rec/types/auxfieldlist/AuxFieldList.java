
package parser.rec.types.auxfieldlist;



public abstract class AuxFieldList extends parser.rec.types.AuxFieldList implements java.util.Collection<parser.rec.types.IntFieldList>  {


  /**
   * Returns the number of arguments of the variadic operator
   *
   * @return the number of arguments of the variadic operator
   */
  @Override
  public int length() {
    if(this instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
      parser.rec.types.AuxFieldList tl = this.getTailAuxFieldList();
      if (tl instanceof AuxFieldList) {
        return 1+((AuxFieldList)tl).length();
      } else {
        return 2;
      }
    } else {
      return 0;
    }
  }

  public static parser.rec.types.AuxFieldList fromArray(parser.rec.types.IntFieldList[] array) {
    parser.rec.types.AuxFieldList res = parser.rec.types.auxfieldlist.EmptyAuxFieldList.make();
    for(int i = array.length; i>0;) {
      res = parser.rec.types.auxfieldlist.ConsAuxFieldList.make(array[--i],res);
    }
    return res;
  }

  /**
   * Inverses the term if it is a list
   *
   * @return the inverted term if it is a list, otherwise the term itself
   */
  @Override
  public parser.rec.types.AuxFieldList reverse() {
    if(this instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
      parser.rec.types.AuxFieldList cur = this;
      parser.rec.types.AuxFieldList rev = parser.rec.types.auxfieldlist.EmptyAuxFieldList.make();
      while(cur instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
        rev = parser.rec.types.auxfieldlist.ConsAuxFieldList.make(cur.getHeadAuxFieldList(),rev);
        cur = cur.getTailAuxFieldList();
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
  public parser.rec.types.AuxFieldList append(parser.rec.types.IntFieldList element) {
    if(this instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
      parser.rec.types.AuxFieldList tl = this.getTailAuxFieldList();
      if (tl instanceof AuxFieldList) {
        return parser.rec.types.auxfieldlist.ConsAuxFieldList.make(this.getHeadAuxFieldList(),((AuxFieldList)tl).append(element));
      } else {

        return parser.rec.types.auxfieldlist.ConsAuxFieldList.make(this.getHeadAuxFieldList(),parser.rec.types.auxfieldlist.ConsAuxFieldList.make(element,tl));

      }
    } else {
      return parser.rec.types.auxfieldlist.ConsAuxFieldList.make(element,this);
    }
  }

  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("AuxFieldList(");
    if(this instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
      parser.rec.types.AuxFieldList cur = this;
      while(cur instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
        parser.rec.types.IntFieldList elem = cur.getHeadAuxFieldList();
        cur = cur.getTailAuxFieldList();
        elem.toStringBuilder(buffer);

        if(cur instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
          buffer.append(",");
        }
      }
      if(!(cur instanceof parser.rec.types.auxfieldlist.EmptyAuxFieldList)) {
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
    if(this instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
      parser.rec.types.AuxFieldList tail = this.getTailAuxFieldList();
      res = atermFactory.makeList(getHeadAuxFieldList().toATerm(),(aterm.ATermList)tail.toATerm());
    }
    return res;
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
      if("AuxFieldList".equals(appl.getName())) {
        parser.rec.types.AuxFieldList res = parser.rec.types.auxfieldlist.EmptyAuxFieldList.make();

        aterm.ATerm array[] = appl.getArgumentArray();
        for(int i = array.length-1; i>=0; --i) {
          parser.rec.types.IntFieldList elem = parser.rec.types.IntFieldList.fromTerm(array[i],atConv);
          res = parser.rec.types.auxfieldlist.ConsAuxFieldList.make(elem,res);
        }
        return res;
      }
    }

    if(trm instanceof aterm.ATermList) {
      aterm.ATermList list = (aterm.ATermList) trm;
      parser.rec.types.AuxFieldList res = parser.rec.types.auxfieldlist.EmptyAuxFieldList.make();
      try {
        while(!list.isEmpty()) {
          parser.rec.types.IntFieldList elem = parser.rec.types.IntFieldList.fromTerm(list.getFirst(),atConv);
          res = parser.rec.types.auxfieldlist.ConsAuxFieldList.make(elem,res);
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
   * Checks if parser.rec.types.AuxFieldList contains a specified object
   *
   * @param o object whose presence is tested
   * @return true if parser.rec.types.AuxFieldList contains the object, otherwise false
   */
  public boolean contains(Object o) {
    parser.rec.types.AuxFieldList cur = this;
    if(o==null) { return false; }
    if(cur instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
      while(cur instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
        if( o.equals(cur.getHeadAuxFieldList()) ) {
          return true;
        }
        cur = cur.getTailAuxFieldList();
      }
      if(!(cur instanceof parser.rec.types.auxfieldlist.EmptyAuxFieldList)) {
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
  public boolean isEmpty() { return isEmptyAuxFieldList() ; }

  public java.util.Iterator<parser.rec.types.IntFieldList> iterator() {
    return new java.util.Iterator<parser.rec.types.IntFieldList>() {
      parser.rec.types.AuxFieldList list = AuxFieldList.this;

      public boolean hasNext() {
        return list!=null && !list.isEmptyAuxFieldList();
      }

      public parser.rec.types.IntFieldList next() {
        if(list.isEmptyAuxFieldList()) {
          throw new java.util.NoSuchElementException();
        }
        if(list.isConsAuxFieldList()) {
          parser.rec.types.IntFieldList head = list.getHeadAuxFieldList();
          list = list.getTailAuxFieldList();
          return head;
        } else {
          // we are in this case only if domain=codomain
          // thus, the cast is safe
          Object res = list;
          list = null;
          return (parser.rec.types.IntFieldList)res;
        }
      }

      public void remove() {
        throw new UnsupportedOperationException("Not yet implemented");
      }
    };

  }

  public boolean add(parser.rec.types.IntFieldList o) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean addAll(java.util.Collection<? extends parser.rec.types.IntFieldList> c) {
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
    if(this instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
      parser.rec.types.AuxFieldList cur = this;
      while(cur instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
        parser.rec.types.IntFieldList elem = cur.getHeadAuxFieldList();
        array[i] = elem;
        cur = cur.getTailAuxFieldList();
        i++;
      }
      if(!(cur instanceof parser.rec.types.auxfieldlist.EmptyAuxFieldList)) {
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
    if(this instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
      parser.rec.types.AuxFieldList cur = this;
      while(cur instanceof parser.rec.types.auxfieldlist.ConsAuxFieldList) {
        parser.rec.types.IntFieldList elem = cur.getHeadAuxFieldList();
        array[i] = (T)elem;
        cur = cur.getTailAuxFieldList();
        i++;
      }
      if(!(cur instanceof parser.rec.types.auxfieldlist.EmptyAuxFieldList)) {
        array[i] = (T)cur;
      }
    }
    return array;
  }

  /*
   * to get a Collection for an immutable list
   */
  public java.util.Collection<parser.rec.types.IntFieldList> getCollection() {
    return new CollectionAuxFieldList(this);
  }

  public java.util.Collection<parser.rec.types.IntFieldList> getCollectionAuxFieldList() {
    return new CollectionAuxFieldList(this);
  }

  /************************************************************
   * private static class
   ************************************************************/
  private static class CollectionAuxFieldList implements java.util.Collection<parser.rec.types.IntFieldList> {
    private AuxFieldList list;

    public AuxFieldList getAuxFieldList() {
      return list;
    }

    public CollectionAuxFieldList(AuxFieldList list) {
      this.list = list;
    }

    /**
     * generic
     */
  public boolean addAll(java.util.Collection<? extends parser.rec.types.IntFieldList> c) {
    boolean modified = false;
    java.util.Iterator<? extends parser.rec.types.IntFieldList> it = c.iterator();
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
    return getAuxFieldList().contains(o);
  }

  /**
   * Checks if the collection contains elements given as parameter
   *
   * @param c elements whose presence has to be checked
   * @return true all the elements are found, otherwise false
   */
  public boolean containsAll(java.util.Collection<?> c) {
    return getAuxFieldList().containsAll(c);
  }

  /**
   * Checks if an object is equal
   *
   * @param o object which is compared
   * @return true if objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    return getAuxFieldList().equals(o);
  }

  /**
   * Returns the hashCode
   *
   * @return the hashCode
   */
  @Override
  public int hashCode() {
    return getAuxFieldList().hashCode();
  }

  /**
   * Returns an iterator over the elements in the collection
   *
   * @return an iterator over the elements in the collection
   */
  public java.util.Iterator<parser.rec.types.IntFieldList> iterator() {
    return getAuxFieldList().iterator();
  }

  /**
   * Return the size of the collection
   *
   * @return the size of the collection
   */
  public int size() {
    return getAuxFieldList().size();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @return an array of elements
   */
  public Object[] toArray() {
    return getAuxFieldList().toArray();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @param array array which will contain the result
   * @return an array of elements
   */
  public <T> T[] toArray(T[] array) {
    return getAuxFieldList().toArray(array);
  }

/*
  public <T> T[] toArray(T[] array) {
    int size = getAuxFieldList().length();
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
    public boolean add(parser.rec.types.IntFieldList o) {
      list = (AuxFieldList)parser.rec.types.auxfieldlist.ConsAuxFieldList.make(o,list);
      return true;
    }

    /**
     * Removes all of the elements from this collection
     */
    public void clear() {
      list = (AuxFieldList)parser.rec.types.auxfieldlist.EmptyAuxFieldList.make();
    }

    /**
     * Tests the emptiness of the collection
     *
     * @return true if the collection is empty
     */
    public boolean isEmpty() {
      return list.isEmptyAuxFieldList();
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
