package com.flipkart.bean;

public class Student extends PersonalDetails{
	private String rollNo;
	private String department;
	private String yearOfJoining;
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(String yoj) {
		this.yearOfJoining = yoj;
	}
}
