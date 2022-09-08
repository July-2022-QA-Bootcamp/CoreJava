package lec27_01_java_array;

import java.util.Arrays;

public class UseOfArray01 {

	public static void main(String[] args) {

		int [] a = new int [5]; // declaring size of the array, 5 here
		// Array is fixed size (Array is static)
		// a is the name of the array
		// [] called container
		// Mixed data type can't be used, example: int and String can't mixed
		
		a[0] = 5;
		a[1] = 15;
		a[2] = 'C'; // just know of ASCII table, explained at the end, no need to memorize
		
		a[4] = 3;
		
		System.out.println("\n------------- Printing single index value ------------\n");
		System.out.println("Printing single index value: " + a[0]); // output: ?
		System.out.println("Printing single index value: " + a[3]);// output: ?
		System.out.println("Printing single index value: " + a[4]);// output: ?
		System.out.println("Printing single index value: " + a[1]);// output: ?
		System.out.println("Printing single index value: " + a[2]);// output: ?
		// System.out.println("Printing single index value: " + a[5]);// output:
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		// out of bounds for length 5
		// interview question: What is the exception you got if Array called is out of range?
		// ArrayIndexOutOfBoundsException 
		
		System.out.println("\nThe length of the array is: " + a.length); // interview question
		// length preserve the size of array, length is not a method, field or variable,
		// rather a parameter/properties
		
		// Que: how can you find the last number from an array?
		// {5, 15, 50, 0, 56}
		// a[4] = a[5-1]= a [a.length-1]
		System.out.println("\nPrinting the last number of the Array: " + a[a.length - 1]); // find the value for (length-1) no.
		
		// Que: how can you find the second last number from an array?
		// Ans: a[a.length-2]
		
		// Interview question: how you measure a String and Array?
		// Ans: For String: length(), for Array: length properties
		
		// very very important -->  toString(a) method
		//	Returns a string representation of the contents of the specified array. The string representation consists 
		// of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the
		// characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). 
		// Arrays class is used to manipulate Array
		System.out.println("To find the list of an Array: " + Arrays.toString(a) + "\n");
		// Returns "null" if b is null.
		int [] b = new int [0]; // 0 elements, no elements there, also called null
		System.out.println("To find the list of an Array: " + Arrays.toString(b) + "\n");
		
		// NOT IMPORTANT
		System.out.println("\nPrinting Array ID: " + a); // Array ID
		// NOT IMPORTANT
		System.out.println("\nPrinting hashCode of the Array, represented by data: " + Arrays.hashCode(a));
		// hashCode of the Array used for representation of array by data
		
		// java.util.Arrays Class --> This class contains various methods for manipulating Array (such as sorting and searching).
		// NOT IMPORTANT
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(a, 15));
		// binary search to get the index position of the value from the ref

	}

}
