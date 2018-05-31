package ex1_Factorielle;
import ex1_Factorielle.Exceptions.BoundException;

public class CalculFactorielle {
	

	public CalculFactorielle() {

	}
	
	public static int factorielleResultat(int base) throws BoundException{
		int resultatFactoriel = 1;
		
		if (base < 0 || base > 12) {
	        //throw new IllegalArgumentException("The number must be >= 0 and <= 12");
			throw new BoundException("The number must be >= 0 and <= 12");
			//这句到底有什么用呢？ 既不打印，不写也不行？
	    }
		
		
		for(int i = 1; i<= base; i++){
			resultatFactoriel = i*resultatFactoriel;
		}
				
		return resultatFactoriel;
	}
	
	
	


}
