package com.java.training;

public class MethodOverloadingDemo {
	
	
	
	public static int numberOps(int a, int b) {
		return a+b;
		
	}
	
	public static float numberOps(float a, float b) {
		return a+b;
		
	}
	
	public static long numberOps(long a, long b) {
		return a+b;
		
	}
	
	public static long numberOps(long a, long b, long c) {
		return a*b*c;
		
	}
	
	public static long numberOps(long a, long b, double c) {
		return (long) (a*b*c);// typecast need since both long and double are different datatypes
		
	}

	public static double numberOps(double a, double b, int c) {
		return a*b*c; // typecast is not needed since we are passing the value as int for c it will automatically take it as double 
		
	}
	
	public static double numberOps(double a, double b) {
		return a/b;
		
	}
	
	public static String numberops(String firstName, String LastName) {
		return firstName.concat(LastName);
		
	}
	
	public static String dragon(String name) {
		
		return name;
	}
	
	public static int dragon(int age) {
		return 200;
		
	}

	public static void dragonName(String name) {
		String dragon = new String("Vhagar");
		System.out.println("The Dragon Name: " +dragon);
		
	}
	
	public static void main(String[] args) {
		
		// Method overloading, multiple methods can have the same name with different parameters
		
		System.out.println(numberOps(6,7));
		
		System.out.println(numberOps(6.7f, 9.0f));	
		
		System.out.println(numberOps(15000000000L, 57676798L));
		
		System.out.println(numberOps(467687L, 78798L, 68989L));
		
		System.out.println(numberOps(78999L, 67008L, 20.00d));
		
		System.out.println(numberOps(30.45d, 40.56d, 7));// we are passing 7 for c and method takes as 7.0
		
		//for static datatype methods object creation is not necessary 
		System.out.println(numberOps(34.55d, 43.45d));
		
		MethodOverloadingDemo methodOverloadingDemo = new MethodOverloadingDemo();
		
		System.out.println(methodOverloadingDemo.numberOps(34.55d, 43.45d));
		
		String name = numberops("Manoj", " Kumar");
		
		System.out.println("The name is: " +name);
		
		System.out.println(dragon("Balerion"));
		
		System.out.println(dragon(200));
		
		dragonName(name);
		
		
	}

}
