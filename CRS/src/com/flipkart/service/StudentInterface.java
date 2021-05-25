package com.flipkart.service;

import java.sql.SQLException;

import com.flipkart.bean.Course;
import com.flipkart.bean.CourseRegistration;
import com.flipkart.bean.ReportCard;
import com.flipkart.constants.Status;
import com.flipkart.exception.InvalidCourseId;
import com.flipkart.exception.RegistrationFailure;

public interface StudentInterface {
	public Status semesterRegistration(int studentId, CourseRegistration courses);
	public  boolean addCourse(int studentId, String courseId) throws InvalidCourseId, RegistrationFailure, SQLException;
	public Status dropCourse(int studentId, String courseId) throws InvalidCourseId, SQLException;
	public Course[] viewRegisteredCourses(int studentId);
	public ReportCard viewReportCard(int studentId);
}
