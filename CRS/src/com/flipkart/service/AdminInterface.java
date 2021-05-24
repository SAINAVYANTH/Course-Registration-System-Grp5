package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;

public interface AdminInterface {
	public void addCourse(Course details);
	public void removeCourse(String courseId);
	public void addNewProfessor(Professor details);
	public void addNewStudent(Student details);
	public void generateReportCard(String studentId);
}
