/**
 * 
 */
package com.flipkart.client;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import com.flipkart.bean.ReportCard;
import com.flipkart.constants.Grade;
import com.flipkart.constants.Status;
import com.flipkart.exception.InvalidCourseId;
import com.flipkart.exception.RegistrationFailure;
import com.flipkart.service.StudentImplementation;
import com.flipkart.service.StudentInterface;

/**
 * @author Rohit
 *
 */
public class StudentMenuClient {
	Scanner sc=new Scanner(System.in);
	StudentInterface studentInterface=StudentImplementation.getInstance();
	
	/**
	 * @param args
	 */
	public void create_menu(int student_id) {
		while(Client.logged_in) {
			System.out.println("1. Add Course\n");
			System.out.println("2. Drop Course\n");
			System.out.println("3. View Registered Courses and Grades\n");
			System.out.println("4. Pay Fees\n");
			System.out.println("5. Logout\n");
			
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
					payFees(student_id);
					break;
				case 5: 
					Client.logged_in=false;
					System.out.println("Logged Out Successfully!\n");
					return;
					
					
			}
		}
	}

	private void addCourse(int student_id) {
		
		try
		{
			System.out.println("Enter Course Code\n");
			String courseCode = sc.next();
			if(studentInterface.addCourse(student_id,courseCode ))
			{
				System.out.println("Successfully Registered for course: "+courseCode+"\n");
			}
			else
			{
				System.out.println("You have already registered for this course. Operation Failed \n");
			}
		}
		catch(InvalidCourseId | RegistrationFailure | SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	private void payFees(int student_id) {
		// TODO Auto-generated method stub
		
	}

	private void viewRegisteredCourses(int student_id) {
		try {
			ReportCard course_list= studentInterface.viewRegisteredCourses(student_id);
			System.out.println("Showing All Courses and Grades for student_id "+student_id);
			Hashtable<String, Grade> grades=course_list.getGrades();
			grades.forEach((key, value)->System.out.println("Course ID : " + key 
	                + "\t\t" + "Grade : " + value));
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private void dropCourse(int student_id) {
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
		catch(InvalidCourseId e)
		{
			System.out.println(e.getMessage());
		} 
		catch (SQLException e) 
		{

			System.out.println(e.getMessage());
		}
		
	}


}
