/**
 * 
 */
package com.flipkart.service;

import java.sql.SQLException;

import com.flipkart.bean.Course;
import com.flipkart.bean.CourseRegistration;
import com.flipkart.bean.ReportCard;
import com.flipkart.constants.Status;
import com.flipkart.dao.StudentDaoImplementation;
import com.flipkart.dao.StudentDaoInterface;
import com.flipkart.exception.GradesNotGivenException;
import com.flipkart.exception.InvalidCourseIdException;
import com.flipkart.exception.RegistrationFailureException;

/**
 * @author Rohit
 *
 */
public class StudentImplementation implements StudentInterface {

	@Override
	public Status semesterRegistration(String studentId, CourseRegistration courses)
			throws RegistrationFailureException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status addCourse(String studentId, String courseId)
			throws InvalidCourseIdException, RegistrationFailureException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status dropCourse(String studentId, String courseId) throws InvalidCourseIdException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course[] viewRegisteredCourses(String studentId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportCard viewReportCard(String studentId) throws GradesNotGivenException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 
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
	public Status addCourse(String studentId, String courseId) throws InvalidCourseIdException, RegistrationFailureException, SQLException{
		
		if (studentDaoInterface.numOfRegisteredCourses(studentId) >= 4)
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
	public Status dropCourse(int studentId, String courseId) throws InvalidCourseIdException, SQLException {
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
	public ReportCard viewRegisteredCourses(int studentId) throws SQLException{
		
		return studentDaoInterface.viewRegisteredCourses(studentId);
		
	}
	*/

}