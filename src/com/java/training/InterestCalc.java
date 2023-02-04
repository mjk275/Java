package com.java.training;

import java.util.Scanner;

public class InterestCalc {

	private int interest;
	
	
	private InterestCalc() {
		System.out.println("The Constructor executed");
	}
	
	
	public static void main(String[] args) {
		
		    Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter principal:");
		    int principal = myObj1.nextInt();
		    
		    System.out.println("Enter Time:");
		    int year = myObj1.nextInt();
		
		    System.out.println("Enter Rate: ");
		    float rate = myObj1.nextFloat();
		    
		    
		    System.out.println("Principal is:" +principal);
		    System.out.println("Number of years is: " +year);
		    System.out.println("The Rate is " +rate+ "%");
		    
		    InterestCalc calc = new InterestCalc();
		    System.out.println("Interest is: " +principal*year*rate/100);
		    
		    
		    
		    
//		    System.out.println("The Interest is: " +multiply(principal,year,rate) );
	}

}
