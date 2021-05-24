package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.CourseRegistration;
import com.flipkart.bean.ReportCard;
import com.flipkart.constants.Status;

public interface StudentInterface {
	public Status semesterRegistration(String studentId, CourseRegistration courses);
	public Status addCourse(String studentId, String courseId);
	public Status dropCourse(String studentId, String courseId);
	public Course[] viewRegisteredCourses(String studentId);
	public ReportCard viewReportCard(String studentId);
}
