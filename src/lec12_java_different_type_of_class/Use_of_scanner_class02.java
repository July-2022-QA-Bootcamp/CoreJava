package lec12_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class02 {

	public static void main(String[] args) {
		System.out.println("Please put value here: ");
		Scanner scanner = new Scanner(System.in); 
		int val1 = scanner.nextInt(); 
		int val2 = scanner.nextInt(); 
		int total = val1 + val2; // Local Variable
		System.out.println("\nThe sum of the Val1 and Val2 is: " + total);
		scanner.close();
	}

}
