package lec27_01_java_array;

import java.util.Scanner;

public class UseOfArray09 {

	public static void main(String[] args) {
		int[] a = new int[5];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter some integer value: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			// System.out.println(a[i]); //what will happen if you comment out it
		}
		// what will happen if you print string instead of int : nextLine()
		System.out.println("\nThe value in index 3 is: " + a[3]);
		System.out.println("\nThe value in index 4 is: " + a[4]);
		System.out.println("\nThe value in index 2 is: " + a[2]);
		sc.close();

		

	}

}
