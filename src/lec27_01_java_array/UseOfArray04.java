package lec27_01_java_array;

import java.util.Arrays;

public class UseOfArray04 {

	public static void main(String[] args) {
		int[] a = new int[6]; // declaring size of an array
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;

		a[5] = 56;

		System.out.println("\nBefore update, the value of a[0] is: " + a[0] + "\n");

		// New: How can we update a value in an Array?
		a[0] = 55;
		System.out.println("\nBefore update, the value of a[0] is: " + a[0] + "\n");
		
		a[0] = 75;
		System.out.println("\nBefore update, the value of a[0] is: " + a[0] + "\n");
		
		a[0] = 25;
		System.out.println("\nAfter update, the value of a[0] is: " + a[0] + "\n");// output:?

		// Is the length changed?
		System.out.println("\nThe length of the array is: " + a.length);
		
		System.out.println("\n----- Increasing the length of an Array by Copying of another array -----");
		// how we can increase the length of an Array?

		// Array name is b
		int [] b = Arrays.copyOf(a, 10); // important
		// second argument: declaring size of new array along with old one and new length, here is 10
		
		// Is the length changed?
		System.out.println("\nThe length of the new array is: " + b.length);
		b[2] = 27;

		b[5] = 99;
		b[6] = 60;
		b[7] = 65;
		b[8] = 68;
		
		System.out.println("Single index value for new Array: " + b[0]);// why output is: 25? 
		System.out.println("Single index value for new Array: " + b[2]);// output: how it happen? 27 // updated
		System.out.println("Single index value for new Array: " + b[5]);// output: 99
		System.out.println("Single index value for new Array: " + b[7]);// output: 65
		System.out.println("Single index value for new Array: " + b[9]);// output: ? 0
		
		// increasing the size of Array can be done several times
		// Array name is c
		int [] c = Arrays.copyOf(b, 12); // Array vS Arrays, Arrays is a class is used to manipulate the Array

		System.out.println("Single index value for new Array: " + c[0]);// why output is: 25?
		System.out.println("Single index value for new Array: " + c[11]);// output: ? 0
		System.out.println("The list of the array's elements: " + Arrays.toString(c));
		
		Arrays.sort(c);
		System.out.println("Single index value for new Array: " + Arrays.toString(c));
		// Hope you can find the first index, last index, smallest number and largest number from this Array
		System.out.println("Smallest value of Array is: " + c[0]);
		System.out.println("Largest value of Array is: " + c[c.length - 1]);
		
		
		
		

	}

}
