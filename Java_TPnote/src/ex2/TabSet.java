package ex2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TabSet<E> implements Set<E>{

	private E[] tableau;
	private List<E> listT;
	
    public TabSet(Set<E> t) {  
//        this.size(
    } 
	@Override
	public int size() {
		return tableau.length;
	}

	@Override
	public boolean isEmpty() {
		if(tableau.length ==  0)
			return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for(int i = 0; i< tableau.length; i++){
			if(tableau[i] == o)
				return true;
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
            private int index = 0;
            public boolean hasNext() {return index < tableau.length;}
            public E next() { return tableau[index++];    }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };

	}

	@Override
	public Object[] toArray() {
		Iterator<E> iterator = listT.iterator();
		Object[] ArrayA = null;
		while(iterator.hasNext()){
			ArrayA = listT.toArray();
		}
		
		return ArrayA;
	}

//	@Override
//	public <E> E[] toArray(E[] a) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public <T> T[] toArray(T[] a) {
		T[] t = null;
		for(int i = 0; i<a.length; i++)
			t[i] = a[i];
		return t;
	}
	
	@Override
	public boolean add(E e) {
		if(!contains(e)){
			tableau[tableau.length]= e;
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		Iterator<E> iterator = null;

		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}  
    
   
  
} 