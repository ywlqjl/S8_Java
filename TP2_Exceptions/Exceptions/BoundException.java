package Exceptions;

@SuppressWarnings("serial")
public class BoundException extends Exception{

	public BoundException() {
		
	}
	public BoundException(String warning) {
		super(warning);
	}
}
