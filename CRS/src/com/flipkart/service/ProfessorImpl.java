package com.flipkart.service;

import java.util.Hashtable;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;
import com.flipkart.constants.Grade;
import com.flipkart.constants.Status;
import com.flipkart.exception.InvalidCourseIdException;
import com.flipkart.exception.InvalidGradeException;

public class ProfessorImpl implements ProfessorInterface{

	@Override
	public Status teachCourse(String id, String courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course[] viewTeachingCourses(String id) {
		// TODO Auto-generated method stub
		return null;
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
