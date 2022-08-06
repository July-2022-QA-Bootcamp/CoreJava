package lec12_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class04 {

	public static void main(String[] args) {
		System.out.println("Please Put your Full Name here: ");
		Scanner scanner = new Scanner(System.in); // this Scanner class allow me to write in the console
		String name = scanner.nextLine(); // this method reads an int value from the user input
		System.out.println("\nHey! " + name + ", Now you know how the scanner class Works!!");
		scanner.close();
	}

}
