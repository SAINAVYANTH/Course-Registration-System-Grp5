package com.flipkart.exception;

public class InvalidStudentId extends Exception{
	private static final long serialVersionUID = 1L;

	public InvalidStudentId(String exception) {
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
