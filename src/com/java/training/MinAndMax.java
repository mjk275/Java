package com.java.training;

public class MinAndMax {

	public static void main(String[] args) {

int[] a = {2,6,9,10,65,87,93,72};

int max = a[0];
int min = a[0];

for( int i = 0; i < a.length; i++) {
	
	if(max<a[i]) {
		max = a[i];
	}
	if(min > a[i]) {
		min = a[i];
	}
}

System.out.println("Max number: " + max + ", "+  "min Number: " +min);
	}

}
