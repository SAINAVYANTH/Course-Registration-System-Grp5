package com.flipkart.service;

import java.util.Hashtable;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;
import com.flipkart.constants.Grade;
import com.flipkart.constants.Status;

public interface ProfessorInterface {
	public Status teachCourse(String id, String courseId);
	public Course[] viewTeachingCourses(String id);
	public Student[] viewEnrolledStudents(String id, String courseId);
	public void giveGrades(String id, String courseId, Hashtable<String, Grade> grades);
}
