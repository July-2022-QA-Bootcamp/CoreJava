package lec10_02_java_methods;

public class Calculator07 {
	// Important interview question
	// Formula: how to convert a String to int:
	// Integer.parseInt(b)

	public int addition(int a, String b) {
		int total1 = a + Integer.parseInt(b);
		System.out.println("Addition of a and b is: " + total1);
		return total1;
	}
	
	// Formula to convert String to double:
	// Double.parseDouble(h)
	public double multiplication(double g, String h) {
		double total2 = g * Double.parseDouble(h); // * is for multiplication
		System.out.println("multiplication of g and h is: " + total2);
		return total2;
	}
	
	public int subtraction(int c, double d) { // double: 6.754837, WIDER, Need to narrow down
		int total3 = c - (int) d;
		System.out.println("Subtraction of c and d is: " + total3);
		return total3;
	}
	
	public int division01(int e, float f) { // float: 9.2356f, WIDER, Need to narrow down
		int total4 = e / (int) f;
		System.out.println("Division of e by f is: " + total4);
		return total4;
	}
	
	public float division02(int e, float f) { // int = 8, narrow, need widdening
		float total5 = e / f;
		System.out.println("Division of e by f is: " + total5);
		return total5;
	}
	

}
