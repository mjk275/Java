package com.java.training;

public class  StaticAndInstanceMethodsDemo{
	
	public static void display() {
		System.out.println("This is a static method");
	}
	
	public void Show() {
		System.out.println("This is a Instance Method");
	}

	public static void main(String[] args) {
		
		/*calling before creating object, static methods cannot require
		to create*/
		display();
		StaticAndInstanceMethodsDemo staticAndInstanceMethodsDemo = new StaticAndInstanceMethodsDemo();
		staticAndInstanceMethodsDemo.Show();
		

	}

}
