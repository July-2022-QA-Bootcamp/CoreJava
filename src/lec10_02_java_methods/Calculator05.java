package lec10_02_java_methods;

public class Calculator05 {
	// no global variable here
	
	// return type parameterized method
	public int addition (int a, int b) { // Parameter
		int total1 = a+b; // local variable
		System.out.println("Addition of a and b is: " + total1);
		return total1;
	}
	
	// return type parameterized method
	public int subtraction (int a, int b) { // Parameter
		int total2 = a - b; // local variable
		System.out.println("Subtraction of a and b is: " + total2);
		return total2;
	}
	
	// return type parameterized method
	public int multiplication(int a, int b) {
		int total3 = a*b;
		System.out.println("Multiplication of a & b: "+total3);
		return total3;
	}
	
	// return type parameterized method
	public int division(int a, int b) {
		int total4 = a/b;
		System.out.println("Division of a & b: "+total4);
		return total4;
	}
	
	
	
	
	

}
