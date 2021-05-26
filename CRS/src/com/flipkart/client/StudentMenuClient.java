/**
 * 
 */
package com.flipkart.client;

import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

import com.flipkart.bean.Course;
import com.flipkart.bean.ReportCard;
import com.flipkart.constants.Grade;
import com.flipkart.constants.Status;
import com.flipkart.exception.GradesNotGivenException;
import com.flipkart.exception.InvalidCourseIdException;
import com.flipkart.exception.InvalidStudentIdException;
import com.flipkart.exception.RegistrationFailureException;
import com.flipkart.service.StudentImplementation;
import com.flipkart.service.StudentInterface;

/**
 * @author Rohit
 *
 */
public class StudentMenuClient {
	Scanner sc=new Scanner(System.in);
	StudentInterface studentInterface = StudentImplementation.getInstance();
	
	/**
	 * @param args
	 */
	public void create_menu(String student_id) {
		while(true) {
			System.out.println("1. Add Course\n");
			System.out.println("2. Drop Course\n");
			System.out.println("3. View Registered Courses\n");
			System.out.println("4. View Grades");
			System.out.println("5. Pay Fees\n");
			System.out.println("6. Logout\n");
			
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					addCourse(student_id);
					break;
				case 2:
					dropCourse(student_id);
					break;
				case 3: 
					viewRegisteredCourses(student_id);
					break;
				case 4:
					getGrades(student_id);
					break;
				case 5: 
					payFees(student_id);
					break;
				case 6: 
					System.out.println("Logged Out Successfully!\n");
					return;
					
					
			}
		}
	}
	
	private void getGrades(String student_id) {
		try {
			ReportCard report = studentInterface.viewReportCard(student_id);
			System.out.println("Viewing grades:");
			Hashtable<String, Grade> grades = report.getGrades();
			Enumeration<String> e = grades.keys();
			while(e.hasMoreElements()) {
				String courseID = e.nextElement();
	            Grade grade = grades.get(courseID);
	            System.out.println("Course Id: " + courseID + "\t" + "Grade: " + grade.toString());
			}
		}catch(GradesNotGivenException ex) {
			System.out.println("The grading of your courses is not complete yet.");
		}catch(InvalidStudentIdException ex) {
			System.out.println("Invalid Id");
		}
	}

	private void addCourse(String student_id) {
		
		try
		{
			System.out.println("Enter Course Code\n");
			String courseCode = sc.next();
			if(studentInterface.addCourse(student_id,courseCode ) == Status.SUCCESS)
			{
				System.out.println("Successfully Registered for course: "+courseCode+"\n");
			}
			else
			{
				System.out.println("You have already registered for this course. Operation Failed \n");
			}
		}
		catch(InvalidCourseIdException | RegistrationFailureException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	
	private void payFees(String student_id) {
		// TODO Auto-generated method stub
		
	}

	private void viewRegisteredCourses(String student_id) {
		try {
			List<Course> course_list= studentInterface.viewRegisteredCourses(student_id);
			System.out.println("Showing All Courses for student_id "+student_id);
			course_list.forEach((key)->System.out.println("Course ID : " + key.getCourseId()));
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private void dropCourse(String student_id) {
		System.out.println("Enter Course Code");
		String courseCode = sc.next();
		try
		{
			Status status=studentInterface.dropCourse(student_id, courseCode);
			if(status.equals(Status.SUCCESS)) {
				System.out.println("Course Drop Successful");
			}
			else {
				System.out.println("You have not registered for this course");
			}
			
			
		}
		catch(InvalidCourseIdException e)
		{
			System.out.println(e.getMessage());
		} 
		catch (SQLException e) 
		{

			System.out.println(e.getMessage());
		}
		
	}


}