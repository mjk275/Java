package com.java.training;

import java.util.Scanner;



public class LoopsAndArraysDemo {

	public static void main(String[] args) {

        //multidimensional array
		int numb[][] = { { 1, 2, 3, 8, 9, 10, 35, 73, 90 }, { 23, 45, 72, 83, 76, 87,90 } };
		System.out.println(numb[1][3]);
		
		//Nested loops
		for (int i = 0; i < numb.length; i++) {
			for (int j = 0; j < numb[i].length; j++) {
				System.out.println("for loop result:" + numb[i][j]);

			}
		}
		
		
		int forEachArray[] = { 99, 879, 056, 67576, 455767 };

		/*
		 * "for-each" loop, which is used exclusively to loop through elements in an
		 * array
		 */
		for (int i : forEachArray) {

			System.out.println("for each or enhanced for loop result: " + i);
		} // enhanced for loop

		int num1[] = { 99999, 6567, 4455, 78789, 778 };
		int num2[] = { 69, 68, 34, 76, 97 };

		for (int i = 0; i < num1.length; i++) {
			System.out.println("The loop for num1: " + num1[i]);

			for (int j = 0; j < num2.length; j++) {
				System.out.println("  The loop for num2: " + num2[j]);
			}
		}//Looping for two arrays

		
		int row = 5;
		int column = 5;
//		System.out.println("Enter the  no. of rows");
//		System.out.println("Enter the  no. of columns");
//		Scanner scanner = new Scanner(System.in);
//		row = scanner.nextInt();
		
		
		for(int i = 1; i <= row; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.println(j);
			}
			System.out.println();
		}
		
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println("* ");
			}
			System.out.println();
		}
		
		
		}
	}


