package ex1;

import java.util.Iterator;

public class TabIter<E> implements Iterator<E>{  
    
    private E[] t;  
      
    /** 
     * iterator index，-1 initiation。 
     */  
    private int index = -1;  
    private int size;  
      
    public TabIter(){
    	
    }
    public TabIter(E[] t) {  
        this.t = t;  
        this.size = t.length;  
    }  
  
//    public void addElement( ){
//    	this.toString().
//    }

    /** 
     * Verify if the iteration finish
     * Foreach首先调用这个方法，判断迭代是否已经结束。 
     */  
    @Override  
    public boolean hasNext() {  
        boolean flag =  index < size - 1;  
        if (index == size -1) {  
            index = -1;  
        }  
          
        return flag;  
    }  
  
    /** 
     * Iterator moves and get the value
     */  
    @Override  
    public E next() {  
        if (index < size - 1) {  
            index++;  
            return t[index];  
        }  
          
        return null;  
    }  
  
    @Override  
    public void remove() {  
    	
    }  
  
} 