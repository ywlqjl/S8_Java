package ex3;

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


    /** 
     * Verify if the iteration finish
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
   	
        for (int i = size - 1; i >= 0; i--) {  
            if (t[i] != null) {  
                t[i] = null;  
                return;  
            }  
        }  
    	
    	
    }  
  
} 