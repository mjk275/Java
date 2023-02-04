package com.java.training;

public class TestTraining {

	public static void main(String[] args) {
		int n[] = {1,3,1000000000,2,10000000};
		int i = n.length;
		System.out.println("number of greeness: " +i);
for(int j=0; j < i; j++) {
	if(j<i-1) {
		System.out.println(n[i-1]);
	}

	if(j == i-1) {
		System.out.println(n[i-2]);
	}

if(j > i-1) {
	System.out.println(n[i-3]);
}


}

	}

}
