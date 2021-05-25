package com.flipkart.dao;

import java.sql.SQLException;

import com.flipkart.bean.CourseRegistration;
import com.flipkart.bean.ReportCard;
import com.flipkart.constants.Status;

public interface StudentDaoInterface {
	public Status semesterRegistration(String studentId, CourseRegistration courses);
	public  boolean addCourse(String studentId, String courseId) throws SQLException;
	public Status dropCourse(String studentId, String courseId) throws SQLException;
	public ReportCard viewRegisteredCourses(String studentId) throws SQLException;
	public ReportCard viewReportCard(String studentId);
	public boolean isRegistered(String courseId, String studentId) throws SQLException;
	public int numOfRegisteredCourses(String studentId) throws SQLException;
}