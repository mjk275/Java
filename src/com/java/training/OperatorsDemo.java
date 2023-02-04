package com.java.training;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		int a = 10 , b = 14;
		
		//Arithmetic operators are used to perform common mathematical operations.
		
		System.out.println("------Arithmetic operations are ----------");
		System.out.println("Add: " +(a+b)); //Add: 24
		System.out.println("subtract: " +(a-b)); //subtract: -4
		System.out.println("product: " +(a*b)); //product: 140
		System.out.println("divide: " +(a/b)); //divide: 0
		System.out.println("Modulus: " +(a%b)); //Modulus: 10
		System.out.println("Increment: " +(a%b)); //Increment: 10
		System.out.println("Decrement: " +(a%b)); //Decrement: 10
		
		
		int c = 15, d =20, e= 12; 
		//Assignment operators are used to assign values to variables.
		System.out.println("------Assignment operations are ----------");
		System.out.println(c += d);//35
		System.out.println(c = e);//12
		System.out.println(d -= e);//8
		System.out.println(d *= e);//96
		System.out.println(d /= e);//8
		System.out.println(c %= e);//0
		System.out.println(c &= d);//0
		System.out.println(c |= d);//8
		System.out.println(c ^= e);//4
		System.out.println(c >>= d);//0
		System.out.println(c <<= d);//0

		//Comparison operators are used to compare two values (or variables).
		System.out.println("------Comparison operations are ----------");
		System.out.println(c == d);//false
		System.out.println(d != e);//true
		System.out.println(d < e);//true
		System.out.println(c > d);//false
		System.out.println(d <= e);//true
		System.out.println(d >= e);//false
	
		//Logical operators are used to determine the logic between variables or values:
		int x = 7;
		System.out.println("------Logical operations are ----------");
	System.out.println(x > 3 && x >10);// false, both conditions must satisfy returns true
	System.out.println(x > 3 || x >9);//true, either one condition satisfies return true
	System.out.println(!(x > 3 || x <10));//false
	
	//Conditional operators
	int y = 10, z = 15;
	System.out.println("------Conditional operations are ----------");
	String s = (y>z)?"Yes":"No";// No, if y is greater than z it will print "Yes" else "No"
	System.out.println(s);
	
	
	}
	

}
