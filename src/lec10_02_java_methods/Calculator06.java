package lec10_02_java_methods;

//here new is -- all are parameterized void type method, so we can use it multiple times, just copied from previous class

public class Calculator06 {
	// no global variable here
	
	// void type parameterized method
	public void addition (int a, int b) { // Parameter
		int total1 = a+b; // local variable
		System.out.println("Addition of a and b is: " + total1);
	}

	// void type parameterized method
	public void subtraction(int a, int b) {
		int total2 = a - b;
		System.out.println("Subtraction of a and b is: " + total2);
	}

	// void type parameterized method
	public void multiplication(int a, int b) {
		int total3 = a * b;
		System.out.println("Multiplication of a & b: " + total3);
	}

	// void type parameterized method
	public void division(int a, int b) {
		int total4 = a / b;
		System.out.println("Division of a & b: " + total4);
	}

}
