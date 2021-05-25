package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.exception.InvalidCourseIdException;
import com.flipkart.exception.InvalidProfessorIdException;
import com.flipkart.exception.InvalidStudentIdException;

public interface AdminInterface {
	public void addCourse(Course details);
	public void removeCourse(String courseId) throws InvalidCourseIdException;
	public void addNewProfessor(Professor details);
	public void addNewStudent(Student details);
	public void removeStudent(String id) throws InvalidStudentIdException;
	public void removeProfessor(String id) throws InvalidProfessorIdException;
	public void generateReportCard(String studentId);
}
