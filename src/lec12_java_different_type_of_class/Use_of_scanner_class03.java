package lec12_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class03 {

	public static void main(String[] args) {
		System.out.println("Please put Your grade here: ");
		Scanner scanner = new Scanner(System.in); 
		float grade1 = scanner.nextFloat();
		float grade2 = scanner.nextFloat();
		// no need to use f in the console, because float type use f at the Editor.
		float averageGrade = (grade1+grade2)/2;
		System.out.println("\nThe average grade is: " + averageGrade);
		scanner.close();
	}

}
