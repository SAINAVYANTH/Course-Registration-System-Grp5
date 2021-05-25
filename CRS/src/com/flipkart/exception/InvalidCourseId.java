package com.flipkart.exception;

public class InvalidCourseId extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCourseId(String exception) {
		super();
		this.exception = exception;
	}

	private String exception;

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}
	
}
