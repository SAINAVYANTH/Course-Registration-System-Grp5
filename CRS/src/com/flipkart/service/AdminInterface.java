package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;

public interface AdminInterface {
	public void addCourse(Course details);
	public static void removeCourse(String courseId) {
		// TODO Auto-generated method stub
		
	}
	public void addNewProfessor(Professor details);
	public void addNewStudent(Student details);
	public void removeStudent(String id);
	public void removeProfessor(String id);
	public void generateReportCard(String studentId);
}
