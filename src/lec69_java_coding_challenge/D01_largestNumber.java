package lec69_java_coding_challenge;

import java.util.Arrays;

public class D01_largestNumber {

	public static void main(String[] args) {
		// This is an array
				int [] number = {12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 44, 12, 1456, 6, 4, 5, 5 };
				/*
				number[0] = 12;
				number[1] = 10;
				number[2] = 100;
				*/
		
				int largest = number [0];
				
				for (int i = 1; i<number.length; i++) {
					if (number[i]>largest) {
						largest = number [i];
					}
				}
				System.out.println(largest);
				// System.out.println(Arrays.toString(number));
				// line 24 just to check how is the Array look like now
							
	}

}
