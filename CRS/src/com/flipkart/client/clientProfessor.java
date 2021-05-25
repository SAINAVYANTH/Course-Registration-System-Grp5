/**
 * 
 */
package com.flipkart.client;

import java.util.Hashtable;
import java.util.Scanner;

import com.flipkart.constants.Grade;
import com.flipkart.exception.InvalidCourseIdException;
import com.flipkart.exception.InvalidGradeException;
import com.flipkart.service.ProfessorImpl;
import com.flipkart.service.ProfessorInterface;

/**
 * @author psnav
 *
 */
public class clientProfessor {
	
	public void ProfMenu() {
		System.out.println("Press 1 to offer course");
		System.out.println("Press 2 to view courses");
		System.out.println("Press 3 to view enrolled students");
		System.out.println("Press 4 to give grades");
		System.out.println("Press 5 to exit");
		profchoice();
		
	}
	public void profchoice() {
		Scanner sc = new Scanner(System.in);
		int n;
		ProfessorInterface profinterface = new ProfessorImpl();
		do{
			n = sc.nextInt();
			sc.nextLine();
			if (n==1) {
				System.out.println("Enter the id");
				String cid = sc.nextLine();
				System.out.println("Enter the course name");
				String cname = sc.nextLine();
				profinterface.teachCourse(cid, cname);
			}
			else if (n==2) {
				System.out.println("Enter the id");
				profinterface.viewTeachingCourses(sc.nextLine());
			}
			else if (n==3) {
				System.out.println("Enter the id");
				String cid = sc.nextLine();
				System.out.println("Enter the course name");
				String cname = sc.nextLine();
				try {
					profinterface.viewEnrolledStudents(cid, cname);
				} catch (InvalidCourseIdException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (n==4) {
				System.out.println("Enter the id");
				String cid = sc.nextLine();
				System.out.println("Enter the course name");
				String cname = sc.nextLine();
				System.out.println("Enter the grades");
				System.out.println("enter END to stop giving grades");
				Hashtable<String, Grade> grade= new Hashtable<String, Grade>();
				while(true) {
					System.out.println("Enter Student id");
					String sid = sc.nextLine();
					if(sid.equals("END")) {
						break;
					}
					System.out.println("Enter the grade");
					String sgrade = sc.nextLine();
					grade.put(sid, Grade.valueOf(sgrade));
				}
				try {
					profinterface.giveGrades(cid,cname,grade);
				} catch (InvalidGradeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (n==5) {
				return;
			}
			else {
				System.out.println("Please enter a valid choice. Reurning to main menu.");
			}
				
			ProfMenu();
		}while(n!=5);
	}
	
}
