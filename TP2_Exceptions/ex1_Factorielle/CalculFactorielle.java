package ex1_Factorielle;

public class CalculFactorielle {
	

	public CalculFactorielle() {

	}
	
	public static int factorielleResultat(int base) {
		int resultatFactoriel = 1;
		
		for(int i = 1; i<= base; i++){
			resultatFactoriel = i*resultatFactoriel;
		}
		
		System.out.print("The factorielle of "+base+ " est: "+resultatFactoriel);
		return resultatFactoriel;
		
	}
	
	
	


}
