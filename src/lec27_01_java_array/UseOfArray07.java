package lec27_01_java_array;

import java.util.Arrays;

public class UseOfArray07 {

	public static void main(String[] args) {
		char [] a = new char[6]; // Different data type (String, char, int etc) can't be mix in an Array
		a[0] = 'A';
		a[1] = 106; //If ASCII table have value which represent character then, it will print
		a[2] = 'c';
	
		
		a[5] = '8';
		// print single index value:
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + a[0]);// output:
		System.out.println("Single index value: " + a[1]);// output: 
		System.out.println("Single index value: " + a[2]);// output: ?
		System.out.println("Single index value: " + a[3]);// output: ? Not supported by eclipse IDE
		//important, see 3 type of output? string, int, char --> Empty, zero, empty.
		System.out.println("Single index value: " + a[5]);// output:

		System.out.println("\nThe length of the array is: " + a.length);
		System.out.println("\nlast index value: " + a[a.length-1]); //find the value for (length-1) no.

		// print all index value:

		System.out.println("\n^^^^^^^^^^^^^ Printing all index value of Array a [] ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
