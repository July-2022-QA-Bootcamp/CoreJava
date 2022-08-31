package lec23_01_java_oop_polymorphism;

// Method overloading -- most common name
// Method overloading has Different name: Early binding or static binding or compile time polymorphism.
// Method overloading -- (same method name but different type of parameter/signature or different combination of parameter)

public class LandCalculator {

	// return type parameterized method -01 implemented
	// if you write like (int c, int b, int a) in a different method or like (int d,int e, int f) ,
	// it will not work like parameterized constructor.
	// same variable type is not ok
	// it allows the same number, but different variable as parameter in a different combination
	public int landCalculator(int a, int b, int c) {
		int total1 = a + b + c;
		System.out.println("Total area from local calculator: " + total1);
		return total1;
	}

	// Return type parameterized method implemented -02
	public int landCalculator(int a, int b) {
		int total2 = a + b;
		System.out.println("Total area from local calculator: " + total2);
		return total2;
	}

	// Return type parameterized method implemented -03
	// but here one of the signature/parameter is String Type
	// line 10 vs 27, although number of parameter same, but parameter/variable type is different
	// same number of parameter, same type of parameter is not allowed
	public int landCalculator(int a, int b, String c) {
		int total3 = a + b + Integer.parseInt(c);
		System.out.println("Total area from local calculator: " + total3);
		return total3;
	}

	// Return type parameterized method implemented -04
	public int landCalculator(int a, String b, int c) {
		int total4 = a + Integer.parseInt(b) + c;
		System.out.println("Total area from local calculator: " + total4);
		return total4;
	}

	// Return type parameterized method which is final implemented -05
	// Also called final method, final method can't be changed
	// Final type of method can be overloaded -- important interview question
	public final int landCalculator(int a, int b, int c, int d) {
		int total5 = a + b + c + d;
		System.out.println("Total area from local calculator: " + total5);
		return total5;
	}

	// Static type Method (6) implemented
	// Static method can be overloaded -- important interview question
	public static int landCalculator(int a, int b, int c, int d, int e) {
		int total6 = a + b + c + d + e;
		System.out.println("Total area from local calculator: " + total6);
		return total6;
	}

	// void type parameterized method (7) is implemented
	public void landCalculator(int a, int b, int c, int d, int e, int f) {
		int total7 = a + b + c + d + e + f;
		System.out.println("Total area from local Calculator: " + total7);
	}

	// void type method (8) is implemented
	public void landCalculator() {
		System.out.println("This is from void type method from Local Calculator");
	}

}
