package lec27_01_java_array;

import java.util.Arrays;

public class UseOfArray06 {

	public static void main(String[] args) {
		String[] ay = new String[] { "First", "Second", "Third", "Fourth", "Fifth" };
		// Literal representation of an String type Array

		// Print the array using default toString method - Do not Use it
		// System.out.println(ay.toString());

		// Print the array using Arrays.toString() - "RECOMMENDED for simple arrays"
		System.out.println("The list of the array's [ay] elements: "+Arrays.toString(ay));

		// until line 15 is fine
		// No need
		String[] arr1 = new String[] { "hundred", "hundred One" };
		String[] arr2 = new String[] { "two hundred", "thirty four" };

		// common name:  multi dimensional array
		// An array of array containing String objects //double dimension or two dimensional or multi dimensional -- important (it will be discussed by Shohag in different topic)
		String[][] multiDimensionalArray = new String[][] { arr1, arr2 };

		// Compare the different outputs
		// Print the array using Arrays.toString()
		System.out.println(Arrays.toString(multiDimensionalArray)); // providing Array ID, so not giving value

		// not important
		// Print the array using Arrays.deepToString() - "RECOMMENDED for multi-dimensional array"
		System.out.println(Arrays.deepToString(multiDimensionalArray));

	}

}
