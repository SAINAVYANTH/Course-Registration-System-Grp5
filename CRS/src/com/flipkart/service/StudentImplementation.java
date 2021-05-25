/**
 * 
 */
package com.flipkart.service;

import java.sql.SQLException;

import com.flipkart.bean.Course;
import com.flipkart.bean.CourseRegistration;
import com.flipkart.bean.ReportCard;
import com.flipkart.constants.Status;
import com.flipkart.exception.InvalidCourseId;
import com.flipkart.exception.RegistrationFailure;

import dao.StudentDaoImplementation;
import dao.StudentDaoInterface;

/**
 * @author Rohit
 *
 */
public class StudentImplementation implements StudentInterface {

	/**
	 * 
	 */
	private static volatile StudentImplementation instance = null;
	
	public static StudentImplementation getInstance() {
		if (instance == null) {
			synchronized (StudentImplementation.class) {
				instance = new StudentImplementation();
			}
		}
		return instance;
	}
	StudentDaoInterface studentDaoInterface = StudentDaoImplementation.getInstance();
	
	@Override
	public Status semesterRegistration(int studentId, CourseRegistration courses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCourse(int studentId, String courseId) throws InvalidCourseId, RegistrationFailure, SQLException{
		System.out.println(studentId);
		System.out.println(courseId);
		if (studentDaoInterface.numOfRegisteredCourses(studentId) >= 3)
		{	
			throw new RegistrationFailure();
		}
		else if (studentDaoInterface.isRegistered(courseId, studentId)) 
		{
			return false;
		} 
		return studentDaoInterface.addCourse(studentId, courseId);
		
	}

	@Override
	public Status dropCourse(int studentId, String courseId) throws InvalidCourseId, SQLException {
		if (studentDaoInterface.isRegistered(courseId, studentId)) 
		{
			studentDaoInterface.dropCourse(studentId, courseId);
			return Status.SUCCESS;
		}
		else {
			return Status.FAIL;
		}
		
	}

	@Override
	public Course[] viewRegisteredCourses(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportCard viewReportCard(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
