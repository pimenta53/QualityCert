
package parser.rec.types.declist;



public abstract class DecList extends parser.rec.types.DecList implements java.util.Collection<parser.rec.types.Dec>  {


  /**
   * Returns the number of arguments of the variadic operator
   *
   * @return the number of arguments of the variadic operator
   */
  @Override
  public int length() {
    if(this instanceof parser.rec.types.declist.ConsDecList) {
      parser.rec.types.DecList tl = this.getTailDecList();
      if (tl instanceof DecList) {
        return 1+((DecList)tl).length();
      } else {
        return 2;
      }
    } else {
      return 0;
    }
  }

  public static parser.rec.types.DecList fromArray(parser.rec.types.Dec[] array) {
    parser.rec.types.DecList res = parser.rec.types.declist.EmptyDecList.make();
    for(int i = array.length; i>0;) {
      res = parser.rec.types.declist.ConsDecList.make(array[--i],res);
    }
    return res;
  }

  /**
   * Inverses the term if it is a list
   *
   * @return the inverted term if it is a list, otherwise the term itself
   */
  @Override
  public parser.rec.types.DecList reverse() {
    if(this instanceof parser.rec.types.declist.ConsDecList) {
      parser.rec.types.DecList cur = this;
      parser.rec.types.DecList rev = parser.rec.types.declist.EmptyDecList.make();
      while(cur instanceof parser.rec.types.declist.ConsDecList) {
        rev = parser.rec.types.declist.ConsDecList.make(cur.getHeadDecList(),rev);
        cur = cur.getTailDecList();
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
  public parser.rec.types.DecList append(parser.rec.types.Dec element) {
    if(this instanceof parser.rec.types.declist.ConsDecList) {
      parser.rec.types.DecList tl = this.getTailDecList();
      if (tl instanceof DecList) {
        return parser.rec.types.declist.ConsDecList.make(this.getHeadDecList(),((DecList)tl).append(element));
      } else {

        return parser.rec.types.declist.ConsDecList.make(this.getHeadDecList(),parser.rec.types.declist.ConsDecList.make(element,tl));

      }
    } else {
      return parser.rec.types.declist.ConsDecList.make(element,this);
    }
  }

  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("DecList(");
    if(this instanceof parser.rec.types.declist.ConsDecList) {
      parser.rec.types.DecList cur = this;
      while(cur instanceof parser.rec.types.declist.ConsDecList) {
        parser.rec.types.Dec elem = cur.getHeadDecList();
        cur = cur.getTailDecList();
        elem.toStringBuilder(buffer);

        if(cur instanceof parser.rec.types.declist.ConsDecList) {
          buffer.append(",");
        }
      }
      if(!(cur instanceof parser.rec.types.declist.EmptyDecList)) {
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
    if(this instanceof parser.rec.types.declist.ConsDecList) {
      parser.rec.types.DecList tail = this.getTailDecList();
      res = atermFactory.makeList(getHeadDecList().toATerm(),(aterm.ATermList)tail.toATerm());
    }
    return res;
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
      if("DecList".equals(appl.getName())) {
        parser.rec.types.DecList res = parser.rec.types.declist.EmptyDecList.make();

        aterm.ATerm array[] = appl.getArgumentArray();
        for(int i = array.length-1; i>=0; --i) {
          parser.rec.types.Dec elem = parser.rec.types.Dec.fromTerm(array[i],atConv);
          res = parser.rec.types.declist.ConsDecList.make(elem,res);
        }
        return res;
      }
    }

    if(trm instanceof aterm.ATermList) {
      aterm.ATermList list = (aterm.ATermList) trm;
      parser.rec.types.DecList res = parser.rec.types.declist.EmptyDecList.make();
      try {
        while(!list.isEmpty()) {
          parser.rec.types.Dec elem = parser.rec.types.Dec.fromTerm(list.getFirst(),atConv);
          res = parser.rec.types.declist.ConsDecList.make(elem,res);
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
   * Checks if parser.rec.types.DecList contains a specified object
   *
   * @param o object whose presence is tested
   * @return true if parser.rec.types.DecList contains the object, otherwise false
   */
  public boolean contains(Object o) {
    parser.rec.types.DecList cur = this;
    if(o==null) { return false; }
    if(cur instanceof parser.rec.types.declist.ConsDecList) {
      while(cur instanceof parser.rec.types.declist.ConsDecList) {
        if( o.equals(cur.getHeadDecList()) ) {
          return true;
        }
        cur = cur.getTailDecList();
      }
      if(!(cur instanceof parser.rec.types.declist.EmptyDecList)) {
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
  public boolean isEmpty() { return isEmptyDecList() ; }

  public java.util.Iterator<parser.rec.types.Dec> iterator() {
    return new java.util.Iterator<parser.rec.types.Dec>() {
      parser.rec.types.DecList list = DecList.this;

      public boolean hasNext() {
        return list!=null && !list.isEmptyDecList();
      }

      public parser.rec.types.Dec next() {
        if(list.isEmptyDecList()) {
          throw new java.util.NoSuchElementException();
        }
        if(list.isConsDecList()) {
          parser.rec.types.Dec head = list.getHeadDecList();
          list = list.getTailDecList();
          return head;
        } else {
          // we are in this case only if domain=codomain
          // thus, the cast is safe
          Object res = list;
          list = null;
          return (parser.rec.types.Dec)res;
        }
      }

      public void remove() {
        throw new UnsupportedOperationException("Not yet implemented");
      }
    };

  }

  public boolean add(parser.rec.types.Dec o) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean addAll(java.util.Collection<? extends parser.rec.types.Dec> c) {
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
    if(this instanceof parser.rec.types.declist.ConsDecList) {
      parser.rec.types.DecList cur = this;
      while(cur instanceof parser.rec.types.declist.ConsDecList) {
        parser.rec.types.Dec elem = cur.getHeadDecList();
        array[i] = elem;
        cur = cur.getTailDecList();
        i++;
      }
      if(!(cur instanceof parser.rec.types.declist.EmptyDecList)) {
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
    if(this instanceof parser.rec.types.declist.ConsDecList) {
      parser.rec.types.DecList cur = this;
      while(cur instanceof parser.rec.types.declist.ConsDecList) {
        parser.rec.types.Dec elem = cur.getHeadDecList();
        array[i] = (T)elem;
        cur = cur.getTailDecList();
        i++;
      }
      if(!(cur instanceof parser.rec.types.declist.EmptyDecList)) {
        array[i] = (T)cur;
      }
    }
    return array;
  }

  /*
   * to get a Collection for an immutable list
   */
  public java.util.Collection<parser.rec.types.Dec> getCollection() {
    return new CollectionDecList(this);
  }

  public java.util.Collection<parser.rec.types.Dec> getCollectionDecList() {
    return new CollectionDecList(this);
  }

  /************************************************************
   * private static class
   ************************************************************/
  private static class CollectionDecList implements java.util.Collection<parser.rec.types.Dec> {
    private DecList list;

    public DecList getDecList() {
      return list;
    }

    public CollectionDecList(DecList list) {
      this.list = list;
    }

    /**
     * generic
     */
  public boolean addAll(java.util.Collection<? extends parser.rec.types.Dec> c) {
    boolean modified = false;
    java.util.Iterator<? extends parser.rec.types.Dec> it = c.iterator();
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
    return getDecList().contains(o);
  }

  /**
   * Checks if the collection contains elements given as parameter
   *
   * @param c elements whose presence has to be checked
   * @return true all the elements are found, otherwise false
   */
  public boolean containsAll(java.util.Collection<?> c) {
    return getDecList().containsAll(c);
  }

  /**
   * Checks if an object is equal
   *
   * @param o object which is compared
   * @return true if objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    return getDecList().equals(o);
  }

  /**
   * Returns the hashCode
   *
   * @return the hashCode
   */
  @Override
  public int hashCode() {
    return getDecList().hashCode();
  }

  /**
   * Returns an iterator over the elements in the collection
   *
   * @return an iterator over the elements in the collection
   */
  public java.util.Iterator<parser.rec.types.Dec> iterator() {
    return getDecList().iterator();
  }

  /**
   * Return the size of the collection
   *
   * @return the size of the collection
   */
  public int size() {
    return getDecList().size();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @return an array of elements
   */
  public Object[] toArray() {
    return getDecList().toArray();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @param array array which will contain the result
   * @return an array of elements
   */
  public <T> T[] toArray(T[] array) {
    return getDecList().toArray(array);
  }

/*
  public <T> T[] toArray(T[] array) {
    int size = getDecList().length();
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
    public boolean add(parser.rec.types.Dec o) {
      list = (DecList)parser.rec.types.declist.ConsDecList.make(o,list);
      return true;
    }

    /**
     * Removes all of the elements from this collection
     */
    public void clear() {
      list = (DecList)parser.rec.types.declist.EmptyDecList.make();
    }

    /**
     * Tests the emptiness of the collection
     *
     * @return true if the collection is empty
     */
    public boolean isEmpty() {
      return list.isEmptyDecList();
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
