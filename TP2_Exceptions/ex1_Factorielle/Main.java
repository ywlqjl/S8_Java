package ex1_Factorielle;

import Exceptions.BoundException;



public class Main {

	public static void main(String[] args) throws BoundException {
		
			Verify input = new Verify();
			try {
				int base = input.VerifyInput();
				CalculFactorielle.factorielleResultat(base);
				
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}
