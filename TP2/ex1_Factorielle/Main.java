package ex1_Factorielle;

import ex1_Factorielle.Exceptions.BoundException;
import ex1_Factorielle.Exceptions.NotNumberException;



public class Main {

	public static void main(String[] args) throws BoundException {
		
		try{
	//		if(args[0]== null){
	//			throw new NotNumberException("The argument shouldn't be null!");
	//		}
			int base = Integer.parseInt(args[0]);
			
//			CalculFactorielle cf = new CalculFactorielle();  //为何不这样写？ 静态？动态？
			int resultat = CalculFactorielle.factorielleResultat(base);
			System.out.println("The factorial of   " + base + "  is: " + resultat);
			

			
		}catch(BoundException e){
			throw new BoundException("The number must be >= 0 and <= 12");
			
		}catch(NotNumberException e){
			
		}		

	}

}
