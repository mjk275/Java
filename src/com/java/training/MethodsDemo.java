package com.java.training;

public class MethodsDemo {

	// Methods
	
	public static void greeting() {
		System.out.println("Welcome");
	}
	
	public static void printMyName(String name) {
		System.out.println("Welcome" + " "+ name);
		
	}
	
	public static void add(int a, int b) {
		int sum;
		sum = a+b;
		System.out.println("The sum of two numbers is: " +sum);
	}
	
	public void multiply(int a, int b, double c ) {
		double result;
		result =  a*b*c;
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		
       System.out.println("Inside the main method");
       
		/*
		 * static means that the method belongs to the Main class and not an object of
		 * the Main class and void means that this method does not have a return value 
		 */
       
       greeting(); //static method
       
       printMyName("Manoj"); //static method
       
       add(78,89); //static method
       
       int minus = sub(10,7);// assigning a static method to another variable
       System.out.println("The differnce is: "+minus);
       
//       for void static methods object creation is necessary
       
       MethodsDemo methodsDemo = new MethodsDemo();// object Creation for non static methods
       
       System.out.println("The Multiplication result is:");
       
       methodsDemo.multiply(45, 78, 45);// arguments passing for multiple parameters
	
       int ageLimit = ageCheck(17); // assigning a static method to another variable
       
       System.out.println(ageLimit);
       
	}

	public static int sub(int z, int y) {
		long difference;
		difference = z-y;
		return (int) difference;
	}
	
	
	public static int ageCheck(int age) {
	
		
		if(age<18) {
			System.out.println("Access Denied - You are not allowed Here");
		}
		else if(age == 18) {
			System.out.println("You're 18 and you are Welcome");
		}
		else if(age>18) {
			System.out.println("You are Old enough to enter - Please join");
		}
		return age;
	}
}
