package com.flipkart.service;

import java.util.Hashtable;
import java.util.List;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;
import com.flipkart.constants.Grade;
import com.flipkart.constants.Status;
import com.flipkart.dao.CourseDAO;
import com.flipkart.dao.CourseDaoInterface;
import com.flipkart.exception.InvalidCourseIdException;
import com.flipkart.exception.InvalidGradeException;

public class ProfessorImpl implements ProfessorInterface{

	@Override
	public Status teachCourse(String id, String courseId) {
		// TODO Auto-generated method stub
		return Status.SUCCESS;
	}

	@Override
	public List<Course> viewTeachingCourses(String id) {
		CourseDaoInterface courseDao = CourseDAO.getInstance();
		return courseDao.getCourseList();
	}

	@Override
	public Student[] viewEnrolledStudents(String id, String courseId) throws InvalidCourseIdException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void giveGrades(String id, String courseId, Hashtable<String, Grade> grades) throws InvalidGradeException {
		// TODO Auto-generated method stub
		
	}

}
