package com.flipkart.exception;

import com.flipkart.bean.CourseRegistration;

public class RegistrationFailure extends Exception{
	public RegistrationFailure(String exception, CourseRegistration registrationDetails) {
		super();
		this.exception = exception;
		this.registrationDetails = registrationDetails;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exception;
	private CourseRegistration registrationDetails;
	
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public CourseRegistration getRegistrationDetails() {
		return registrationDetails;
	}
	public void setRegistrationDetails(CourseRegistration registrationDetails) {
		this.registrationDetails = registrationDetails;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
