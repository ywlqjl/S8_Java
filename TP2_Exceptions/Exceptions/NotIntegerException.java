package Exceptions;

@SuppressWarnings("serial")
public class NotIntegerException extends NumberFormatException {

	public NotIntegerException() {

	}
	public NotIntegerException(String warning) {
		super(warning);
	}
}
