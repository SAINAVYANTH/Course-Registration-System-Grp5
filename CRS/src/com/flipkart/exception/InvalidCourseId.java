package com.flipkart.exception;

public class InvalidCourseId extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String course_id;
	public InvalidCourseId(String course_id) {
		super();
		this.course_id = course_id;
	}

	public String getCourseId() {
		return course_id;
	}

	public void setException(String course_id) {
		this.course_id = course_id;
	}
	@Override
	public String getMessage() 
	{
		return "Registration for Course with course id: " + course_id + " not found.";
	}
}
