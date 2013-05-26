package reinventing_the_wheel.java.util;

import java.io.Serializable;
import java.util.*;

/**
 * User: gautam
 * Date: 26/5/13
 * Time: 7:57 PM
 * @param <E>
 */
public class      ArrayList <E>
       extends    AbstractList<E>
       implements List<E>, RandomAccess, Cloneable, Serializable {

    private Object[] store;
    private int size;



    public ArrayList() {
        this(10);
    }
    public ArrayList(Collection<? extends E> c){
        store = c.toArray();
        size  = store.length;
        // To fix http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6260652
        if(store.getClass() != Object[].class){
            store= Arrays.copyOf(store,size,Object[].class);
        }
    }

    public ArrayList(int initialCapacity){
        if(initialCapacity < 0){
            throw new IllegalArgumentException("Illegal Initial capacity " + initialCapacity);
        }
        else {
            this.store = new Object[initialCapacity];
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public E get(int i) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int size() {
        return size;
    }
}
