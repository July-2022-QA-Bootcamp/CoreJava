package lec27_01_java_array;

import java.util.Arrays;

public class UseOfArray03 {

	public static void main(String[] args) {
		int[] a = new int[6]; // declaring size of an array
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;

		// no need to keep empty space for empty data, I just keep for your better understanding
		a[5] = 56;
		System.out.println("To find the list of an Array: " + Arrays.toString(a));

		// Printing all index value
		System.out.println("\n------------- Printing all index value of Array by for loop -------------");
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		// new loop you learn today --> for each loop
		// In Java, the for-each loop is used to iterate through elements of Array and collections (like ArrayList).
		// It is also known as the enhanced for loop.
		System.out.println("\n------------- Printing all index value of Array by for each loop -------------");
		for (int m : a) { // here m is the name of the expected outcome
			System.out.println(m);
		}
				
		System.out.println("\n---------- Printing all index value of Array by while loop ----------\n");
		int j = 0;
		while (j < a.length) {// when the condition is true, the loop started
			System.out.println(a[j]);
			j++;
		}

		System.out.println("\n---------- Printing all index value of Array by do while loop ----------\n");
		int k = 0;
		do { // when the condition is true or false, the first loop will started
			System.out.println(a[k]);
			k += 1;
		} while (k < a.length);

		
		
		

	}

}
