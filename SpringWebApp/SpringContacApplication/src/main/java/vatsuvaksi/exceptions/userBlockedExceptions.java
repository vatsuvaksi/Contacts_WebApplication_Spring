package vatsuvaksi.exceptions;
public class userBlockedExceptions extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public userBlockedExceptions() {
		super();
		// TODO Auto-generated constructor stub
	}
	//This is with error description and the above one is without one This will be called when there's an exception in login 
	userBlockedExceptions(String errorMessage)
	{
		super(errorMessage);
	}

}
