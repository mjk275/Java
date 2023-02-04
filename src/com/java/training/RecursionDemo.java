package com.java.training;

public class RecursionDemo {
	
	public static int result(int a, int b) {
		if(b > a) {
			return b * result (a, b - 1);
		}
		
		else {
			return b;
		}
	
	
	}
	
	public static int sum(int start, int end) {
	    if (end > start) {
	      return end + sum(start, end - 1);
	    } else {
	      return end;
	    }
	  }
	
	public static double product(double x) {
		
		if(x > 0) {
			return x + product(x - 1);
		}
		else {
			return x;
		}
	}

	public static int factorial(int n) {
		if(n > 1) {
			
			return n * factorial(n-1);
		}
		else {
			return n;
		}
	}// to find the factorial of a number using recursion
	
	public static void main(String[] args) {
		
		int recursionResult =  result(3,15);
		System.out.println(recursionResult);//1002155008
		
		//result of the recursion is 5+6+7+8+9+10 = 45
		int result = sum(5, 10); 
	    System.out.println(result);//45
	    
	    double productResult = product(10);
	    System.out.println(productResult);
	    
	    int factorialResult = factorial(25);
	    System.out.println("The factorial of 25 is: " +factorialResult);
		
	}

}
  