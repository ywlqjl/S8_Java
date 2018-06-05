package ex1;

public class Main {

	public static void main(String[] args) throws UnsupportedOperationException {
		
		String[] strs = {"1", "2", "3", "4", "5"};  
        
        
        TabIter<String> t = new TabIter<String>(strs);  
        
        while(t.hasNext()){
        	 System.out.println(t.next());  
        }
        
        try {
			t.remove();
		} catch (Exception e) {
			throw new UnsupportedOperationException("This operation can't be used now!");
		}
	}

}
