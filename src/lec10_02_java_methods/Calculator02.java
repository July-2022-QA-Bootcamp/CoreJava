package lec10_02_java_methods;

public class Calculator02 {
	int a = 39;
	int b = 12;
	
	// return type method
	public int addition() {
		int total1 = a+b; // local variable
		System.out.println("Addition of a and b is: " + total1);
		return total1; // return keyword should be the last statement of return type method
		// if you don't know what to return, then return the default value of that type : important info
	}
	
	// return type method
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		return total2;
	}
			
	public boolean usCitizen() {
		System.out.println("I am not a US citizen");
		return false; // why false? not true? default valuse of boolean is false
	}
	
}
