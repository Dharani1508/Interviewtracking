package com.track.exception;

public class InterviewScheduleNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -2446153442582965706L;
	
	public InterviewScheduleNotFoundException() {
		
	}
	
	public InterviewScheduleNotFoundException(String message) {
		super(message);
	}

}


