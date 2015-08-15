package appExceptions;

public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private Throwable cause;
	
	public String getMessage(){
		return message;
	}
	
	public Throwable getCause(){
		return cause;
	}
	
	public ApplicationException(String message, Throwable cause){
		
		this.message=message;
		this.cause=cause;
		
	}
	
}
