package com.java.training;

import java.util.Scanner;

public class Factorial {
	
	public static int recursionFactorial(int z) {
		if(z > 1) {
			return z * recursionFactorial (z-1);	
		}
		else {
			return z;	
		}
		
	}

	public static void main(String[] args) {
		
		Factorial factorial = new Factorial();
		int factorialnum = recursionFactorial(5);
		System.out.println("Factorial of " + 5 +" is " + factorialnum);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: " );
		int num = scanner.nextInt();
		
		int f = 1;
		for(int i = 1; i<= num; i++) {
			f = f* i;
		}

		System.out.println("Factorial of " +num+ " is " +f);
		scanner.close();
		
	
		
	}

}
