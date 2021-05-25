package com.flipkart.bean;

public class CourseRegistration {
	private Course[] primaryCourses;
	private Course[] secondaryCourses;
	private String semester;
	
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
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	
}
