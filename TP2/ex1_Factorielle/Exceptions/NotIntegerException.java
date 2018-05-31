package ex1_Factorielle.Exceptions;

@SuppressWarnings("serial")
public class NotIntegerException extends NumberFormatException {

	public NotIntegerException() {

	}
	public NotIntegerException(String warning) {
		super(warning);
	}
}
