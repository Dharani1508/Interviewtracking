package com.track.exception;

public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -2446153442582965706L;
	
	public EmployeeNotFoundException() {
		
	}
	
	public EmployeeNotFoundException(String message) {
		super(message);
	}

}


