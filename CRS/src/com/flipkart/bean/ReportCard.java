package com.flipkart.bean;

import java.util.Hashtable;

import com.flipkart.constants.Grade;

public class ReportCard {
	private int studentId;
	private String semester;
	private Hashtable<String, Grade> grades;
	public ReportCard(int studentId,Hashtable<String, Grade> grades) {
		this.studentId=studentId;
		this.grades=grades;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public Hashtable<String, Grade> getGrades() {
		return grades;
	}
	public void setGrades(Hashtable<String, Grade> grades) {
		this.grades = grades;
	}
}
