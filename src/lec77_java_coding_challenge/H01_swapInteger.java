package lec77_java_coding_challenge;

public class H01_swapInteger {
	public static void main(String[] args) {
		int x = 10;
		int y = 15;

		// using temp variable
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("The valus of x is: " + x);
		System.out.println("The valus of y is: " + y);

	}

}
