package com.java.training;

import java.util.HashSet;

public class HashSetDemo {
	
	/*
	 * A HashSet is a collection of items where every item is unique, and it is
	 * found in the java.util package
	 */
	public static void main(String[] args) {
		HashSet<String> characters = new HashSet<String>();
		characters.add("Ellie");
		characters.add("Joel");
		characters.add("Abby");
		characters.add("Dina");
		characters.add("Joel");//unique not displayed in the array
		
		System.out.println(characters);
System.out.println(characters.contains("Abby"));
System.out.println(characters.size());

for(String i : characters) {
	System.out.println(i);
}

	}

}
