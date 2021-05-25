package com.flipkart.dao;

import java.sql.SQLException;

import com.flipkart.bean.Course;
import com.flipkart.bean.CourseRegistration;
import com.flipkart.bean.ReportCard;
import com.flipkart.constants.Status;

public interface StudentDaoInterface {
	public Status semesterRegistration(int studentId, CourseRegistration courses);
	public  boolean addCourse(int studentId, String courseId) throws SQLException;
	public Status dropCourse(int studentId, String courseId) throws SQLException;
	public ReportCard viewRegisteredCourses(int studentId) throws SQLException;
	public ReportCard viewReportCard(int studentId);
	public boolean isRegistered(String courseId, int studentId) throws SQLException;
	public int numOfRegisteredCourses(int studentId) throws SQLException;
}
