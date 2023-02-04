package com.java.training;

public class ConditionalsDemo {

	public static void main(String[] args) {

		int a = 5, b = 10, c = 12;

//		if Statement
		if (b > a) {
			System.out.println("b is greater than a");
		}

		System.out.println("Condition Closed");

		// if - else Statement

		if (a < b) {
			System.out.println("a is Less than b");
		}

		else {
			System.out.println("End of the program");
		}

		//if... else if... else
		
		if (a > b) {
			
			System.out.println("a is greater than b");
			
		} 
		else if (b > c) {
			
			System.out.println("b is greater than c");
			
		} 
		else if (c > b) {
			
			System.out.println("c is greater than b");
			
		} 
		else 
		{
			
			System.out.println("Statement ends here");
			
		}
	
//		Short Hand If...Else
	
		int time = 20;
		String result = (time < 18)?"Good Afternoon":"Good Evening";
		System.out.println(result);
		
		
		String dragon = "Drogon";
		
		switch(dragon) {
		
		case "Drogon":
			System.out.println("The rider is Daenerys targaryen");
	         break;
		
		case "Caraxes":
			System.out.println("The rider is Daemon Targaryen");
	         break;
	         
		case "Syrax":
			System.out.println("The rider is Rhaenyra Targaryen");
	         break;
	     
		case "Balerion":
			System.out.println("The rider is Aegon Targaryen");
	         break;
	         
		default:
			System.out.println("No dragon riders");
		}

	}
	
		
}
