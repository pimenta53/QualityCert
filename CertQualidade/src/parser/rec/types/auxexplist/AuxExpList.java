
package parser.rec.types.auxexplist;



public abstract class AuxExpList extends parser.rec.types.AuxExpList implements java.util.Collection<parser.rec.types.Exp>  {


  /**
   * Returns the number of arguments of the variadic operator
   *
   * @return the number of arguments of the variadic operator
   */
  @Override
  public int length() {
    if(this instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
      parser.rec.types.AuxExpList tl = this.getTailAuxExpList();
      if (tl instanceof AuxExpList) {
        return 1+((AuxExpList)tl).length();
      } else {
        return 2;
      }
    } else {
      return 0;
    }
  }

  public static parser.rec.types.AuxExpList fromArray(parser.rec.types.Exp[] array) {
    parser.rec.types.AuxExpList res = parser.rec.types.auxexplist.EmptyAuxExpList.make();
    for(int i = array.length; i>0;) {
      res = parser.rec.types.auxexplist.ConsAuxExpList.make(array[--i],res);
    }
    return res;
  }

  /**
   * Inverses the term if it is a list
   *
   * @return the inverted term if it is a list, otherwise the term itself
   */
  @Override
  public parser.rec.types.AuxExpList reverse() {
    if(this instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
      parser.rec.types.AuxExpList cur = this;
      parser.rec.types.AuxExpList rev = parser.rec.types.auxexplist.EmptyAuxExpList.make();
      while(cur instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
        rev = parser.rec.types.auxexplist.ConsAuxExpList.make(cur.getHeadAuxExpList(),rev);
        cur = cur.getTailAuxExpList();
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
  public parser.rec.types.AuxExpList append(parser.rec.types.Exp element) {
    if(this instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
      parser.rec.types.AuxExpList tl = this.getTailAuxExpList();
      if (tl instanceof AuxExpList) {
        return parser.rec.types.auxexplist.ConsAuxExpList.make(this.getHeadAuxExpList(),((AuxExpList)tl).append(element));
      } else {

        return parser.rec.types.auxexplist.ConsAuxExpList.make(this.getHeadAuxExpList(),parser.rec.types.auxexplist.ConsAuxExpList.make(element,tl));

      }
    } else {
      return parser.rec.types.auxexplist.ConsAuxExpList.make(element,this);
    }
  }

  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("AuxExpList(");
    if(this instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
      parser.rec.types.AuxExpList cur = this;
      while(cur instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
        parser.rec.types.Exp elem = cur.getHeadAuxExpList();
        cur = cur.getTailAuxExpList();
        elem.toStringBuilder(buffer);

        if(cur instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
          buffer.append(",");
        }
      }
      if(!(cur instanceof parser.rec.types.auxexplist.EmptyAuxExpList)) {
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
    if(this instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
      parser.rec.types.AuxExpList tail = this.getTailAuxExpList();
      res = atermFactory.makeList(getHeadAuxExpList().toATerm(),(aterm.ATermList)tail.toATerm());
    }
    return res;
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a parser.rec.types.AuxExpList from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static parser.rec.types.AuxExpList fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if("AuxExpList".equals(appl.getName())) {
        parser.rec.types.AuxExpList res = parser.rec.types.auxexplist.EmptyAuxExpList.make();

        aterm.ATerm array[] = appl.getArgumentArray();
        for(int i = array.length-1; i>=0; --i) {
          parser.rec.types.Exp elem = parser.rec.types.Exp.fromTerm(array[i],atConv);
          res = parser.rec.types.auxexplist.ConsAuxExpList.make(elem,res);
        }
        return res;
      }
    }

    if(trm instanceof aterm.ATermList) {
      aterm.ATermList list = (aterm.ATermList) trm;
      parser.rec.types.AuxExpList res = parser.rec.types.auxexplist.EmptyAuxExpList.make();
      try {
        while(!list.isEmpty()) {
          parser.rec.types.Exp elem = parser.rec.types.Exp.fromTerm(list.getFirst(),atConv);
          res = parser.rec.types.auxexplist.ConsAuxExpList.make(elem,res);
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
   * Checks if parser.rec.types.AuxExpList contains a specified object
   *
   * @param o object whose presence is tested
   * @return true if parser.rec.types.AuxExpList contains the object, otherwise false
   */
  public boolean contains(Object o) {
    parser.rec.types.AuxExpList cur = this;
    if(o==null) { return false; }
    if(cur instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
      while(cur instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
        if( o.equals(cur.getHeadAuxExpList()) ) {
          return true;
        }
        cur = cur.getTailAuxExpList();
      }
      if(!(cur instanceof parser.rec.types.auxexplist.EmptyAuxExpList)) {
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
  public boolean isEmpty() { return isEmptyAuxExpList() ; }

  public java.util.Iterator<parser.rec.types.Exp> iterator() {
    return new java.util.Iterator<parser.rec.types.Exp>() {
      parser.rec.types.AuxExpList list = AuxExpList.this;

      public boolean hasNext() {
        return list!=null && !list.isEmptyAuxExpList();
      }

      public parser.rec.types.Exp next() {
        if(list.isEmptyAuxExpList()) {
          throw new java.util.NoSuchElementException();
        }
        if(list.isConsAuxExpList()) {
          parser.rec.types.Exp head = list.getHeadAuxExpList();
          list = list.getTailAuxExpList();
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
    if(this instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
      parser.rec.types.AuxExpList cur = this;
      while(cur instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
        parser.rec.types.Exp elem = cur.getHeadAuxExpList();
        array[i] = elem;
        cur = cur.getTailAuxExpList();
        i++;
      }
      if(!(cur instanceof parser.rec.types.auxexplist.EmptyAuxExpList)) {
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
    if(this instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
      parser.rec.types.AuxExpList cur = this;
      while(cur instanceof parser.rec.types.auxexplist.ConsAuxExpList) {
        parser.rec.types.Exp elem = cur.getHeadAuxExpList();
        array[i] = (T)elem;
        cur = cur.getTailAuxExpList();
        i++;
      }
      if(!(cur instanceof parser.rec.types.auxexplist.EmptyAuxExpList)) {
        array[i] = (T)cur;
      }
    }
    return array;
  }

  /*
   * to get a Collection for an immutable list
   */
  public java.util.Collection<parser.rec.types.Exp> getCollection() {
    return new CollectionAuxExpList(this);
  }

  public java.util.Collection<parser.rec.types.Exp> getCollectionAuxExpList() {
    return new CollectionAuxExpList(this);
  }

  /************************************************************
   * private static class
   ************************************************************/
  private static class CollectionAuxExpList implements java.util.Collection<parser.rec.types.Exp> {
    private AuxExpList list;

    public AuxExpList getAuxExpList() {
      return list;
    }

    public CollectionAuxExpList(AuxExpList list) {
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
    return getAuxExpList().contains(o);
  }

  /**
   * Checks if the collection contains elements given as parameter
   *
   * @param c elements whose presence has to be checked
   * @return true all the elements are found, otherwise false
   */
  public boolean containsAll(java.util.Collection<?> c) {
    return getAuxExpList().containsAll(c);
  }

  /**
   * Checks if an object is equal
   *
   * @param o object which is compared
   * @return true if objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    return getAuxExpList().equals(o);
  }

  /**
   * Returns the hashCode
   *
   * @return the hashCode
   */
  @Override
  public int hashCode() {
    return getAuxExpList().hashCode();
  }

  /**
   * Returns an iterator over the elements in the collection
   *
   * @return an iterator over the elements in the collection
   */
  public java.util.Iterator<parser.rec.types.Exp> iterator() {
    return getAuxExpList().iterator();
  }

  /**
   * Return the size of the collection
   *
   * @return the size of the collection
   */
  public int size() {
    return getAuxExpList().size();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @return an array of elements
   */
  public Object[] toArray() {
    return getAuxExpList().toArray();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @param array array which will contain the result
   * @return an array of elements
   */
  public <T> T[] toArray(T[] array) {
    return getAuxExpList().toArray(array);
  }

/*
  public <T> T[] toArray(T[] array) {
    int size = getAuxExpList().length();
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
      list = (AuxExpList)parser.rec.types.auxexplist.ConsAuxExpList.make(o,list);
      return true;
    }

    /**
     * Removes all of the elements from this collection
     */
    public void clear() {
      list = (AuxExpList)parser.rec.types.auxexplist.EmptyAuxExpList.make();
    }

    /**
     * Tests the emptiness of the collection
     *
     * @return true if the collection is empty
     */
    public boolean isEmpty() {
      return list.isEmptyAuxExpList();
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
