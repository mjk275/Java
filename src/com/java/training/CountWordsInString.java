package com.java.training;

public class CountWordsInString {

	public static void main(String[] args) {
		String words = "Daenerys targaryen, Daemon Targaryen";
		int wordCount = words.split("\\s").length;
		System.out.println(wordCount);

	}

}
