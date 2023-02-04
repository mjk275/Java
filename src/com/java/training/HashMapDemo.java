package com.java.training;


import java.util.HashMap;

public class HashMapDemo {
	
	/*
	 * A HashMap however, store items in "key/value" pairs, and you can access them
	 * by an index of another type (e.g. a String).
	 * 
	 * One object is used as a key (index) to another object (value). It can store
	 * different types: String keys and Integer values, or the same type, like:
	 * String keys and String values
	 */
	
	public static void main(String[] args) {
		
		HashMap<String, String> dragonRiders = new HashMap<String, String>();
		dragonRiders.put("Caraxes", "Daemon Targaryen");
		dragonRiders.put("Syrax", "Rhaenyra Targaryen");
		dragonRiders.put("Drogon", "Daenerys targaryen");
		dragonRiders.put("Balerion", "Aegon Targaryen");
		dragonRiders.put("Vhagar", "Visenya Targaryen");
		dragonRiders.put("Vermithor", "Jaehaerys Targaryen");
		dragonRiders.put("Vhagar", "Aemond Targaryen");// for one key shouldn't contain multiple values if they have it takes the latest one should be printed
		dragonRiders.put("Silver Wing", "Daemon Targaryen");// Key should be unique, for values we use same values for different Keys
		System.out.println(dragonRiders);
		System.out.println(dragonRiders.size());
//System.out.println(dragonRiders.get("Drogon"));
		
//		for(int i = 0; i<dragonRiders.keySet(); i++) {
//			System.out.println(dragonRiders.get(i));
//		}
		
		for(String i: dragonRiders.keySet()) {
			System.out.println("Key: " + i + " value: " +dragonRiders.get(i));
		}
	}

	
}
