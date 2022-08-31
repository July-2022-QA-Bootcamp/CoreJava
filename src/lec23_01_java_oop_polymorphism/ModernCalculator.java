package lec23_01_java_oop_polymorphism;

//summary: same method name, same signature/parameter but Overriding the logic of the method
// Method overriding (same method name, same parameter but different syntax or logic)
// Also called -- Late binding or dynamic binding or runtime polymorphism
// 100% asked in interview-- what is the difference between method overloading and method overriding?

public class ModernCalculator extends LandCalculator{
	// method -1
	@Override
	public int landCalculator(int a, int b, int c) {
		int total1 = a + b + c + 5;
		System.out.println("Total area from local calculator: " + total1);
		return total1;
	}

	// method -2
	@Override
	public int landCalculator(int a, int b) {
		int total2 = a + b/2;
		System.out.println("Total area from local calculator: " + total2);
		return total2;
	}

	// method -3
	@Override
	public int landCalculator(int a, int b, String c) {
		int total3 = a*3 + b + Integer.parseInt(c);
		System.out.println("Total area from local calculator: " + total3);
		return total3;
	}

	// method -4
	@Override
	public int landCalculator(int a, String b, int c) {
		int total4 = a + Integer.parseInt(b) + c/5;
		System.out.println("Total area from local calculator: " + total4);
		return total4;
	}

	// method -5
	// Final type method cannot be Overriden -- important interview question
	// Cannot override the final method from LandCalculator
	
	/*
	@Override
	public final int landCalculator(int a, int b, int c, int d) {
		int total5 = a + b + c + d;
		System.out.println("Total area from local calculator: " + total5);
		return total5;
	}
	*/

	// method -06
	// -- important interview question
	// The method landCalculator can't override or implemented
	// because static is a local member method of a class)
	// So, static method can't be override, if we remove @override it will work as
	// static method of this modern calculator class	
	
	/*
	@Override
	public static int landCalculator(int a, int b, int c, int d, int e) {
		int total6 = a + b + c + d + e;
		System.out.println("Total area from local calculator: " + total6);
		return total6;
	}
	 */
	
	// method -7
	@Override
	public void landCalculator(int a, int b, int c, int d, int e, int f) {
		int total7 = a + b/2 + c + d + e*2 + f - 50;
		System.out.println("Total area from local Calculator: " + total7);
	}

	// method -8
	@Override
	public void landCalculator() {
		System.out.println("This is from void type method from Modern Calculator");
	}

}
