package ex1_Factorielle.Exceptions;

@SuppressWarnings("serial")
public class BoundException extends IllegalArgumentException{

	public BoundException() {
		
	}
	public BoundException(String warning) {
		super(warning);
	}
}
