package com.java.training;

public class DataTypeDemo {

	byte myByte;
	short myShort;
	int myInt;
	float myFloat;
	double myDouble;
	boolean myBoolean;
	char myChar;
	String myString;
	long myLong;
	
	public static void main(String[] args) {
		
		DataTypeDemo dataTypeDemo = new DataTypeDemo();
		System.out.println("Print the default values:");
		System.out.println("byte default values: " +dataTypeDemo.myByte);
		System.out.println("short default values: " +dataTypeDemo.myShort);
		System.out.println("int default values: " +dataTypeDemo.myInt);
		System.out.println("float default values: " +dataTypeDemo.myFloat);
		System.out.println("double default values: " +dataTypeDemo.myDouble);
		System.out.println("Boolean default values: " +dataTypeDemo.myBoolean);
		System.out.println("char default values: " +dataTypeDemo.myChar);
		System.out.println("String default values: " +dataTypeDemo.myString);
		System.out.println("Long default values: " +dataTypeDemo.myLong);

		System.out.println("The Max value of Integer: " +Integer.MAX_VALUE);
		System.out.println("The Min value of Integer: " +Integer.MIN_VALUE);
		
		System.out.println("The Max value of Byte: " +Byte.MAX_VALUE);
		System.out.println("The Min value of Byte: " +Byte.MIN_VALUE);
		
		System.out.println("The Max value of Short: " +Short.MAX_VALUE);
		System.out.println("The Min value of Short: " +Short.MIN_VALUE);
		
		System.out.println("The Max value of Float: " +Float.MAX_VALUE);
		System.out.println("The Min value of Float: " +Float.MIN_VALUE);
		
		System.out.println("The Max value of Double: " +Double.MAX_VALUE);
		System.out.println("The Min value of Double: " +Double.MIN_VALUE);
		
		System.out.println("The Max value of Long: " +Long.MAX_VALUE);
		System.out.println("The Min value of Long: " +Long.MIN_VALUE);
		
	}

}
