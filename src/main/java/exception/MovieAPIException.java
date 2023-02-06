package exception;

public class MovieAPIException extends Exception {

	public MovieAPIException() {
		super();
	}
	
	public MovieAPIException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public MovieAPIException(Throwable cause) {
		super(cause);
	}
	
	public MovieAPIException(String message) {
		super(message);
	}
	
	protected MovieAPIException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
