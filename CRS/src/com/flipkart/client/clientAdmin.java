/**
 * 
 */
package com.flipkart.client;

import java.sql.Date;
import java.util.Scanner;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.exception.InvalidCourseIdException;
import com.flipkart.exception.InvalidProfessorIdException;
import com.flipkart.exception.InvalidStudentIdException;
import com.flipkart.service.AdminImpl;
import com.flipkart.service.AdminInterface;

/**
 * @author psnav
 *
 */
public class clientAdmin {
	public void AdminMenu() {
		System.out.println("Press 1 to add course");
		System.out.println("Press 2 to remove course");
		System.out.println("Press 3 to add new professor");
		System.out.println("Press 4 to add new student");
		System.out.println("Press 5 to remove student");
		System.out.println("Press 6 to remove professor");
		System.out.println("Press 7 to generate report card");
		System.out.println("Press 8 to exit");
		
		adminchoice();
	}
	@SuppressWarnings("deprecation")
	public void adminchoice() {
		Scanner sc = new Scanner(System.in);
		int n;
		AdminInterface admininterface = new AdminImpl();
		Course course = new Course("","","");
		do{
			n = sc.nextInt();
			sc.nextLine();
			if (n==1) {
				System.out.println("Enter the course ID");
				String inp = sc.nextLine();
				course.setCourseId(inp);
				System.out.println("Enter the course name");
				inp = sc.nextLine();
				course.setCourseName(inp);
				System.out.println("Enter the Name of Instructor");
				inp = sc.nextLine();
				course.setInstructor(inp);
				admininterface.addCourse(course);
				
			}
			else if (n==2) {
				System.out.println("Enter the course ID");
				course.setCourseId(sc.nextLine());
				try {
					admininterface.removeCourse(course.getCourseId());
				} catch (InvalidCourseIdException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (n==3) {
					
					Professor professor = new Professor(null, null, null, null, null, null, null);
					
					System.out.println("Enter the name");
					professor.setName(sc.nextLine());
					System.out.println("Enter the id");
					professor.setId(sc.nextLine());
					System.out.println("Enter the dob");
					sc.nextLine();
					professor.setDob(new Date(12,3,2000) );
					System.out.println("Enter the email");
					professor.setEmail(sc.nextLine());
					System.out.println("Enter the address");
					professor.setAddress(sc.nextLine());
					System.out.println("Enter the department");
					professor.setDepartment(sc.nextLine());
					System.out.println("Enter the designation");
					professor.setDesignation(sc.nextLine());
					System.out.println(professor.getName());
					admininterface.addNewProfessor(professor);
			}
			else if (n==4) {
				Student student = new Student(null, null, null, null, null, null, null, null);
				
				System.out.println("Enter the name");
				student.setName(sc.nextLine());
				System.out.println("Enter the id");
				student.setId(sc.nextLine());
				System.out.println("Enter the dob");
				student.setName(sc.nextLine());
				System.out.println("Enter the email");
				student.setName(sc.nextLine());
				System.out.println("Enter the address");
				student.setName(sc.nextLine());
				System.out.println("Enter the department");
				student.setDepartment(sc.nextLine());
				System.out.println("Enter the Roll number");
				student.setRollNo(sc.nextLine());
				System.out.println("Enter the year of joining");
				student.setYearOfJoining(sc.nextLine());
				
				admininterface.addNewStudent(student);
			}
				
			else if (n==5) {
				System.out.println("Enter the id");
				try {
					admininterface.removeStudent(sc.nextLine());
				} catch (InvalidStudentIdException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (n==6) {
				System.out.println("Enter the id");
				try {
					admininterface.removeProfessor(sc.nextLine());
				} catch (InvalidProfessorIdException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (n==7) {
				System.out.println("Enter the name");
				admininterface.generateReportCard(sc.nextLine());
			}
			else if (n==8) {
				return;
			}
			else {
				System.out.println("Please enter a valid choice. Reurning to main menu.");
			}
				
			AdminMenu();
		}while(n!=8);
	}
}
