package com.java.training;

import java.util.Scanner;

public class RegisterApp {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the UserName: ");
		String userName = scanner.nextLine();
		System.out.println("Enter the Password: ");
		String password = scanner.nextLine();
		
		if(userName.length() > 5 && password.length() > 8) {
			
			System.out.println("User Registered Successfully");
		}
		
		else {
			
	System.out.println("Username length should be more than 5 and password length should be more than 8");
		
		
		}

		/*
		 * Enter the UserName: manoj27 Enter the Password: Manoj@2727 User Registered
		 * Successfully
		 */

	}

}
