package com.flipkart.client;

public class Client {
	static boolean logged_in=true;
	public static void main(String[] args) {
		StudentMenuClient smc= new StudentMenuClient();
		smc.create_menu(0);

	}

}
