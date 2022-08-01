package lec10_02_java_methods;

public class Calculator01 {
	// Global variable or class variable
	// default type of access modifier is used, no reason, just for practice
	int a = 67;
	int b = 22;

	// void type method
	public void addition() {
		int total1 = a + b; // Local variable
		System.out.println("Addition of a and b is: " + total1);
	}

	public void subtraction() {
		int total2 = a - b;
		System.out.println("Subtraction of a and b is: " + total2);
	}

	public void multipliaction() {
		int total3 = a * b;
		System.out.println("Multipliaction of a and b is: " + total3);
	}

	public void division() {
		int total4 = a / b;
		System.out.println("Division of a and b is: " + total4);
	}
	
}
