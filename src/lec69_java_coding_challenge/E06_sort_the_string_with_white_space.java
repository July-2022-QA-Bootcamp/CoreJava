package lec69_java_coding_challenge;

import java.util.Arrays;

// very common interview question: sort this string

public class E06_sort_the_string_with_white_space {

	public static void main(String[] args) {
		// Custom string input
		String s = "yakb z5o27l eux4 wRq 9LAc 3KMB m80";
		// We remove the white space by below line
		// where \\s is a single space in unicode
		s = s.replaceAll("\\s", "");
		// Converting string into an array of character
		char [] arr = s.toCharArray();
		
		// This line not needed
		// System.out.println(Arrays.toString(arr));
		// outcome: [y, a, k, b, z, 5, o, 2, 7, l, e, u, x, 4, w, R, q, 9, L, A, c, 3, K, M, B, m, 8, 0]
		
		char temp;
		// Nested for loop used for comparison of characters in above character array
		for(int i = 0; i<arr.length; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i] > arr [j]) {
					// Comparing the characters one by one by the help of temp character variable
					temp = arr[i];
					arr [i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// By now loop is done means we have iterated the whole array
		System.out.println(Arrays.toString(arr));
		
		

	}

}
