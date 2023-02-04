package com.java.training;


public class MethodOverriding extends MethodOverloadingDemo {
	
	public static void dragonName(String name) {
		String dragon = new String("Caraxes");
		System.out.println("The Dragon Name: " +dragon);
	}

	
	public static void main(String[] args) {
		
		/*
		 * The superclass having the method dragonName which has been
		 * overridden in the subclass
		 * It is useful for code reusability: 
		 * reuse attributes and methods of an existing class when you create a new class.
		 */
		
		MethodOverriding methodOverriding = new MethodOverriding();
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		methodOverriding.dragonName(null);
		demo.dragonName(null);
		
		
	}
}
