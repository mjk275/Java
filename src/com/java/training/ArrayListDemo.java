package com.java.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	
//The ArrayList class is a resizable array, which can be found in the java.util package.

	/*
	 * The difference between a built-in array and an ArrayList in Java, is that the
	 * size of an array cannot be modified (if you want to add or remove elements
	 * to/from an array, you have to create a new one). While elements can be added
	 * and removed from an ArrayList whenever you want. The syntax is also slightly
	 * different:
	 * 
	 * contains duplicate and insertion order is maintained.
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> dragonNames = new  ArrayList<String>();
		dragonNames.add("Caraxes");
		dragonNames.add("Vhagar");
		dragonNames.add("Melys");
		dragonNames.add("Syrax");
		dragonNames.add("Sunfyre");
		dragonNames.add("Dreamfyre");
		dragonNames.add("SilverWing");
		dragonNames.add("Vermithor");
		dragonNames.add("SilverWing");// contains duplicate and insertion order is maintained.
		
		System.out.println(dragonNames);
		System.out.println("The dragon name :" +dragonNames.get(6));
		System.out.println("The modified one is: " +dragonNames.set(5, "Drogon"));
		System.out.println("The modified array is: "+dragonNames);
		System.out.println("The removed dragon is: " +dragonNames.remove(7));

		System.out.println(dragonNames.size());
		
		for(int i = 0; i<dragonNames.size(); i++) {
			System.out.println(dragonNames.get(i));
		}
		
		System.out.println("----for-each loop-----");
		Collections.sort(dragonNames);
		for(String i:dragonNames) {
			System.out.println(i);
		}
		
//		dragonNames.clear();
//		System.out.println(dragonNames);
		
		Iterator<String> iterator = dragonNames.iterator();
		System.out.println(iterator.next());
	}
}
