package Exceptions;

@SuppressWarnings("serial")
public class NullInputException extends Exception{

	public NullInputException() {
	}
	public NullInputException(String warning) {
		super(warning);
	}

}
