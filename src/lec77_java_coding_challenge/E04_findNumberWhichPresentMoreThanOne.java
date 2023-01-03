package lec77_java_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class E04_findNumberWhichPresentMoreThanOne {

	public static void main(String[] args) {
		int [] number = { 100, 77, 1, 5, 6, 1, 6, 8, 100, 55, 1, 7, 8, 5, 56, 100, 323, 2, 44, 12 };

		Set<Integer> duplicatedNumber = new HashSet<Integer>();

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
					duplicatedNumber.add(number[j]);
				}
			}
		}
		System.out.println("Duplicated numbers are: " + duplicatedNumber);

	}

}
