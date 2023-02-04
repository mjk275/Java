package com.java.training;

public class TypeCasting {

	public static void main(String[] args) {
		
		/*
		 * Type casting is when you assign a value of one primitive data type to another
		 * type.
		 * 
		 * In Java, there are two types of casting:
		 * 
		 * Widening Casting (automatically) - converting a smaller type to a larger type
		 * size byte -> short -> char -> int -> long -> float -> double
		 * 
		 * Narrowing Casting (manually) - converting a larger type to a smaller size
		 * type double -> float -> long -> int -> char -> short -> byte
		 */
		
		
		int a = 7;
		double b = a; //Automatic casting or Widening Casting : int to double 
		System.out.println(a); // 7
		System.out.println(b); // 7.0
		
		float c = a;
		System.out.println(c);//7.0
		
		/*
		 * Narrowing Casting (manually) converting the char to int
		 */		
		
		char d = (char) a;
		System.out.println(d); // which print the ASCII character of the value 7;

		float e = (float) b;
		System.out.println(e);// Narrowing Casting (manually)converting the double to float
		
	}

}
