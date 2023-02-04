package com.java.training;

public class StringDemo {

	public static void main(String[] args) {
		
		String string = "Hi Manoj..... Good Morning";
		// Finding length of the string
		System.out.println("Length of the String: "+string.length());
		//To convert string in upperCase
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());// convert to Lowercase
		System.out.println(string.charAt(0));// find at character at index 0
		
		/*
		 * find the index of the first occurrence of the specified text in a string
		 * (including whitespaces)
		 */
		System.out.println(string.indexOf("Manoj"));
        
		//Returns the hash code of a string
		System.out.println(string.hashCode());
		
		//Checks whether a string is empty or not
        System.out.println(string.isEmpty());
        
        //Returns the Unicode of the character before the specified index
		System.out.println(string.codePointBefore(8));
		
		//Returns the canonical representation for the string object
		System.out.println(string.intern());
		
		/*
		 * Searches a string for a specified value, and returns a new string where the
		 * specified values are replaced
		 */
		
		System.out.println
		(string.replace("Hi Manoj..... Good Morning", "Hi Manoj..... Good AfterNoon"));
        
		//Removes whitespace from both ends of a string
		System.out.println(string.trim());
		
		
		String firstName = "Manoj";
		String lastName = "Kumar";
		
		// Appends a string to the end of another string
		System.out.println(firstName + " " + lastName ); // Manoj Kumar
		System.out.println(firstName.concat(lastName)); // ManojKumar
		System.out.println(firstName+ " ".concat(lastName));// Manoj Kumar
		
		//Compares two strings lexicographically
		System.out.println(firstName.compareTo(lastName));
		//Compares two strings lexicographically, ignoring case differences
		System.out.println(firstName.compareToIgnoreCase(lastName));
	
        //If you add 2 numbers, the result will be a number when the datatype is int
		
		int x = 4;
		int y = 10;
		
		System.out.println(x+y);//14
		
		/*
		 * If both numbers or either one variable the value declared as string the
		 * result will the concatenation
		 */		
		
		String a = "5";
	    String b = "10";
	    int c = 15;
	    System.out.println(a+b);//510
	    System.out.println(a+c);//515
	    
	   String string1 = new String("Hello");
	   String string2 = new String("Hello");
	   String string3 = string2;
		/*
		 * equals() Compares two strings. Returns true if the strings are equal, and false if not
		 * it is a content comparision
		 */
	   System.out.println(string1.equals(string2));//true
		/*
		 * == operator compares the memory reference of the two objects are same If we
		 * are not using the new operation the == operator will works same as the
		 * equals() method
		 * to check equality of the object reference only by using the new operator 
		 */
	   
	   System.out.println(string1==string2);//false
	   System.out.println(string1==string3);//false
	   System.out.println(string2==string3);//true
	   
//	  substring() Returns a new string which is the substring of a specified string
	   System.out.println(string1.substring(2)); //llo
	   
		/*
		 * replace() Searches a string for a specified value, and returns a new string
		 * where the specified values are replaced
		 */
	   
	   System.out.println(string1.replace('e', 'i')); //Hillo
	   
	   String s1 = "Manoj";
	   String s2 = "Manoj";
	   System.out.println(s1==s2);//true
	   System.out.println(s1.equals(s2));//true
	   
	}

}
