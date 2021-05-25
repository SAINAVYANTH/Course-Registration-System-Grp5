/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

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
	public void adminchoice() {
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
			else if (n==6) {
				
			}
			else if (n==7) {
				
			}
			else if (n==8) {
				
			}
			else {
				System.out.println("Please enter a valid choice. Reurning to main menu.");
			}
				
			AdminMenu();
		}while(n!=8);
	}
}
