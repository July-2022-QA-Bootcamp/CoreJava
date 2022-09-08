package lec27_01_java_array;

import java.util.Arrays;

public class UseOfArray05 {

	public static void main(String[] args) {
		int[] a = new int[6];
		a[0] = 15;
		a[1] = 34;
		a[2] = 59;
		a[3] = 5;
		a[4] = 28;
		a[5] = 12;
		System.out.println("\nThe length of the array is: " + a.length);
		System.out.println("Before update, The list of the array's [a] elements: " + Arrays.toString(a) + "\n");
		
		int[] b = Arrays.copyOf(a, 10); // second argument: declaring size of new array along with old one
		b[2] = 87;
		b[6] = 36;
		b[7] = 95;
		b[8] = 18;
		System.out.println("\nThe length of the array is: " + b.length);
		System.out.println("After update, The list of the array's [b] elements: " + Arrays.toString(b) + "\n");

		// Array vS Arrays, Arrays is a class which is used to manipulate the Array
		
		int [] c = Arrays.copyOfRange(b, 0, 7);
		// to copy the range of the old array
		// from which index to what index (range)// here 0 is starting index and 7 is
		// length of the index, so last index is 6
		// Parameters:1) original: the array from which a range is to be copied
		// 2) from: the initial index of the range to be copied, inclusive
		// 3) to: the final index of the range to be copied, exclusive.(This index may lie outside the array. 7-1)
		System.out.println("\nThe length of the array is: " + c.length);
		System.out.println("After update, The list of the array's [c] elements:" + Arrays.toString(c) + "\n");

		/*
		 * Arrays.equals(arr1, arr3);--->returns true if the two specified arrays of
		 * booleans are equal to one another. Two arrays are equal if they contain the
		 * same elements in the same order. Good to know: Two array references are considered equal if
		 * both are null.
		 */
		
		// How to compare to Array?
		System.out.println("Is Array a and c is equal? Ans: " + Arrays.equals(a, c));
		
		// for each loop is mostly used in industry, solely for Array? yes
		// not important
		Arrays.fill(a, 300); // --->to fill the all the value as same, so all value will be changed to 300
								// here
		System.out.println("After update, the value of Array is: " + Arrays.toString(a) + "\n");

		// not important
		// Some extra code:
//				// Shohag, what is the use of it?
//				Arrays.asList(a); // ---->convert to Integer Array as List //ref means ref variable of the array
//				// This method returns a fixed-size list backed by the specified Arrays.
//				System.out.println("\tAfter update, the value of Array is: " + Arrays.asList(a) + "\n");

		// What is deep equals?
		// System.out.println("Is Array a and c is equal? Ans: " +Arrays.deepEquals(a,
		// c));
		/*
		 * returns true if the two specified arrays are deeply equal to one another. Two
		 * array references are considered deeply equal if both are null, or if they
		 * refer to arrays that contain the same number of elements and all
		 * corresponding pairs of elements in the two arrays are deeply equal.
		 */
	}

}
