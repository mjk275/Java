package com.java.training;

public class BreakAndContinueDemo {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}

		
		for(int i=0; i< 5; i++) {
			if(i ==3) {
				continue;
			}
			System.out.println(i);
		}
	}

}


