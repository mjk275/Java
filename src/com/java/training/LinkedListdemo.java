package com.java.training;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListdemo {
	/*
	 * The LinkedList class is a collection which can contain many objects of the
	 * same type, just like the ArrayList.
	 * 
	 * The LinkedList class has all of the same methods as the ArrayList class
	 * because they both implement the List interface. This means that you can add
	 * items, change items, remove items and clear the list in the same way.
	 * 
	 * However, while the ArrayList class and the LinkedList class can be used in
	 * the same way, they are built very differently.
	 */
	/*
	 * The ArrayList class has a regular array inside it. When an element is added,
	 * it is placed into the array. If the array is not big enough, a new, larger
	 * array is created to replace the old one and the old one is removed. 
	 * 
	 * The LinkedList stores its items in "containers." The list has a link to the first
	 * container and each container has a link to the next container in the list. To
	 * add an element to the list, the element is placed into a new container and
	 * that container is linked to one of the other containers in the list.
	 * 
	 * contains duplicate and insertion order is maintained.
	 */
	
	public static void main(String[] args) {
		LinkedList<String> gameChar = new LinkedList<String>();
		gameChar.addFirst("Ellie");
		gameChar.add("Kratos");
		gameChar.add("Ayumi");
		gameChar.add("Nathan Drake");
		gameChar.add("Nathan Drake");// prints the duplicate value.
		gameChar.addLast("Jill Valentine");
		gameChar.add("Lara Croft");
		gameChar.addLast("Alloy");
		
		
		System.out.println(gameChar);
		System.out.println(gameChar.getFirst());
		System.out.println(gameChar.getLast());
		
		Collections.sort(gameChar);
		System.out.println("------for-each loop-------");
		
		for(String i:gameChar) {
			System.out.println(i);
		}
		

	}

}
