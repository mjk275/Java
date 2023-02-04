package com.java.training;

public class VariablesDemo {

	static int staticInt = 101;//static variable -- Memory allocated only once when the class is loaded.
	int a = 25;// Global variable (Scope for entire class)
	int b = 30;// Global Variable (Scope for entire class)
	
	public void variablesOne() {
		
		int a = 7; // local variable (scope for only in the method)
		System.out.println("Local variable: " +a);
		System.out.println("Global Variable: " +this.a);
		System.out.println("Static variable: " +staticInt);
	}
	
	public void variablesTwo() {
		
		System.out.println("Global variable: " +b);
	}
	
	public void variableThree() {
		
		final int a = 39;
//		int a = 40; // will generate an error cannot assign a value to a final variable.
		System.out.println("The final method variable: " +a);
		System.out.println("Global Variable: " +this.a);
	}
	
	public static void main(String[] args) {
		
		VariablesDemo demo = new VariablesDemo();
		demo.variablesOne();
		demo.variablesTwo();
		demo.variableThree();

	}

}
