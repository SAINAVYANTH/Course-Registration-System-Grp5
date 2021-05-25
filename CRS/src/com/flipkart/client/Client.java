package com.flipkart.client;

import java.util.Scanner;

import com.flipkart.bean.UserLogin;
import com.flipkart.exception.InvalidCredentialsException;
import com.flipkart.utils.LoginUtils;
import com.flipkart.client.clientProfessor;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.MainMenu();
		Scanner sc = new Scanner(System.in);
		int n=1;
		do {
			n = sc.nextInt();
			
			if (n==1) {
				client.login();
			}
			if (n==2) {
				client.updatepassword();
			}
			if (n==3)
				return;
			client.MainMenu();
		}while(n!=3);

	}
	private void login() {
		// TODO Auto-generated method stub
		System.out.println("Enter user ID");
		Scanner sc = new Scanner(System.in);
		String userid = sc.nextLine();
		
		System.out.println("Enter your password");
		String userpass = sc.nextLine();
		
		
		boolean state = false;
		state = LoginUtils.Login(userid,userpass); // Verifying login details!
		if (state==false) {
			System.out.println("username or password is incorrect");
			MainMenu();
		}
		else {
			String role = LoginUtils.userRole(userid);
			if(role.equals("Student")) {
				clientStudent clientstudent = new clientStudent();
				clientstudent.StudentMenu();
			}
			if(role.equals("Professor")) {
				clientProfessor clientprof = new clientProfessor();
				clientprof.ProfMenu();
			}
			if(role.equals("Admin")) {
				clientAdmin clientadmin = new clientAdmin();
				clientadmin.AdminMenu();

			}
		}
				/*try {
					utils.LoginUtils.login(userid, userpass);
					state = true;
				}
				catch(InvalidCredentials ex){
					return;
				}*/
				
		
	}
	private void updatepassword() {
		// TODO Auto-generated method stub
		System.out.println("Enter user ID");
		Scanner sc = new Scanner(System.in);
		String userid = sc.nextLine();
		
		System.out.println("Enter your old new password");
		String userpass = sc.nextLine();
		if(LoginUtils.Login(userid,userpass)){
			String userpass1,userpass2;
			do {
				System.out.println("Enter your new password");
				userpass1 = sc.nextLine();
				
				System.out.println("Confirm your new password");
				userpass2 = sc.nextLine();
				
			}while(userpass1.equals(userpass2)==false || (userpass1.length()==0));
			
			userpass=userpass1;
			LoginUtils.updatePassword(userid,userpass);
		}
	}
	
	public void MainMenu() {
		System.out.println("Press 1 to login");
		System.out.println("Press 2 to Update Passsword");
		System.out.println("Press 3 to Exit ");
	}
}
