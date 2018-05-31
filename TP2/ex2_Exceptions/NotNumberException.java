package ex2_Exceptions;

@SuppressWarnings("serial")
public class NotNumberException extends Exception{

	public NotNumberException() {
	}
	public NotNumberException(String warning ) {
		super(warning);
	}

}
