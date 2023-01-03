package lec77_java_coding_challenge;

import java.util.Arrays;

// First teach swapping from H01-
//Que: To Raihan, Can you find the second largest number from the Array

public class D05_largestNumber {

	public static void main(String[] args) {
		int temp;
		// This is an number
		// Next time try with 5 number
		int[] number = { 12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 44, 12, 1456, 6, 4, 5, 5 };
		System.out.println(Arrays.toString(number)); // no need, just showed how is the new number now
		System.out.println(number.length);
		
		for (int i = 0; i <number.length; i++) { // 12
			
			for (int j = i+1; j<number.length; j++) { // 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 44, 12, 1456, 6, 4, 5, 5
				
				if (number[i] > number [j]) {
					// This is called swapping
					temp = number[i]; // temp =12
					number[i] = number[j]; // number[i] = 10
					number[j] = temp; // number[j]=12
				}
			}
		}
		System.out.println(Arrays.toString(number));
		System.out.println("Second largest number is:: " + number[number.length - 2]);
		System.out.println("Largest number is:: " + number[number.length - 1]);
		System.out.println("Smallest number is:: " + number[0]);
		System.out.println("Second Smallest number is:: " + number[1]);
		
		

	}

}
