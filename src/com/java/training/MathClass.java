package com.java.training;

public class MathClass {

	public static void main(String[] args) {
		
		//The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
	
//		Returns the absolute value of x
		System.out.println(Math.abs(-17.45f));//17.45
		
//		Returns the square root of x
		System.out.println(Math.sqrt(125)); //11.180339887498949
		
//		Returns the value of x to the power of y
		System.out.println(Math.pow(3, 2));//9.0
		
//		Returns a random number between 0 and 1
		System.out.println(Math.random());//0.05115660469693184

//		Returns the number with the lowest value
		System.out.println(Math.min(10, 20));//10
		
		//Returns the number with the highest value
		System.out.println(Math.max(20, 30));//30
		
		//Returns the value of x rounded to its nearest integer
		System.out.println(Math.round(40.89));//41
		
//		Returns the value of PI
		System.out.println(Math.PI);//3.141592653589793
		
		//Returns the value of x rounded up to its nearest integer
		System.out.println(Math.ceil(479.76767));//480.0
		
		int randomNum = (int) (Math.random() * 100);
		System.out.println(randomNum);//75

	}

}
