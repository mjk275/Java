package com.java.training;

public class ExceptionsDemo {
	
	
	public static void isRaider(int age) {
		if(age < 16) {
			throw new ArithmeticException("Access Denied");
		}
		else {
			System.out.println("Access granted");
		}
	}

	public static void main(String[] args) {
		
		try {
			int[] numbers = {1,2,3};
			System.out.println(numbers[4]);
		} catch (Exception e) {
			System.out.println("This is Array Index Out Of Bounds Exception");
		}finally {
			System.out.println("The try catch is finished");
		}
	
	isRaider(14);
	
	}
	
}
