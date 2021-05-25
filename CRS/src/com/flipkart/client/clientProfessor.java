/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

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
		do{
			n = sc.nextInt();
			
			if (n==1) {
				
			}
			else if (n==2) {
				
			}
			else if (n==3) {
				
			}
			else if (n==4) {
				
			}
			else if (n==5) {
				
			}
			else {
				System.out.println("Please enter a valid choice. Reurning to main menu.");
			}
				
			ProfMenu();
		}while(n!=5);
	}
	
}
