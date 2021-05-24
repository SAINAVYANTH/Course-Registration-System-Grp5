package com.flipkart.bean;

public class CourseRegistration {
	private Course[] primaryCourses;
	private Course[] secondaryCourses;
	
	public Course[] getPrimaryCourses() {
		return primaryCourses;
	}
	public void setPrimaryCourses(Course[] primaryCourses) {
		this.primaryCourses = primaryCourses;
	}
	public Course[] getSecondaryCourses() {
		return secondaryCourses;
	}
	public void setSecondaryCourses(Course[] secondaryCourses) {
		this.secondaryCourses = secondaryCourses;
	}
	
	
}
