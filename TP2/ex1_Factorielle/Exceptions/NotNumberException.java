package ex1_Factorielle.Exceptions;

@SuppressWarnings("serial")
public class NotNumberException extends NumberFormatException{

	public NotNumberException() {
		
	}
	
	public NotNumberException(String warning ) {
		super(warning);
	}

}
