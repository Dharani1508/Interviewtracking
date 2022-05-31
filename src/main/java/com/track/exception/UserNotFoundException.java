package com.track.exception;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -2446153442582965706L;
	
	public UserNotFoundException() {
		
	}
	
	public UserNotFoundException(String message) {
		super(message);
	}

}


