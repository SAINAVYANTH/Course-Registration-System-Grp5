package com.flipkart.exception;

import com.flipkart.bean.CourseRegistration;

public class RegistrationFailure extends Exception{
	public RegistrationFailure() {
		super();
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String getMessage() 
	{
		return "Cannot register for more courses";
	}
}
