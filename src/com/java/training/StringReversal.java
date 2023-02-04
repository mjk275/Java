package com.java.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringReversal {
	
	
	public static void main(String[] args) {
		
		String ogString = "Manoj";
		String reversedStr = "";
		
		for(int i = 0; i < ogString.length(); i++) {
			reversedStr = ogString.charAt(i) + reversedStr;
		}
		System.out.println("Reversed String: " +reversedStr);

		
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please enter the String: " );
//		String originalString = scanner.nextLine();
//		scanner.close();
//		
//		String[] words = originalString.split(" ");
//		List<String> list = Arrays.asList(words);
//		Collections.reverse(list);
//		
//		for(String word: list) {
//			System.out.println(word+ " ");
//		}
//		
		
		
	}

}
