package lec23_01_java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("\n-------- Land Calculator --------");
		LandCalculator lc = new LandCalculator();
		lc.landCalculator(34, 60, 11); // return type parameterized method -01 initialized
		lc.landCalculator(34, 60); // return type parameterized method -02 initialized
		lc.landCalculator(34, 60, "11"); // return type parameterized method -03 initialized
		lc.landCalculator(34, "60", 11); // return type parameterized method -04 initialized
		lc.landCalculator(34, 60, 11, 71); // return type parameterized method -05 initialized
		LandCalculator.landCalculator(34, 60, 11, 71, 40); // return type parameterized method -06 initialized
		lc.landCalculator(34, 60, 11, 71, 40, 28); // void type parameterized method -07 initialized
		lc.landCalculator(); // void type method -08 initialized
		
		System.out.println("\n-------- Modern Calculator --------");
		ModernCalculator mc = new ModernCalculator();
		mc.landCalculator(34, 60, 11);
		mc.landCalculator(34, 60); // return type parameterized method -01 initialized
		mc.landCalculator(32, 55); // return type parameterized method -02 initialized
		mc.landCalculator(34, 60, "11"); // return type parameterized method -03 initialized
		mc.landCalculator(34, "60", 11);	// return type parameterized method -04 initialized
		mc.landCalculator(34, 60, 11, 71, 40, 28); // void type parameterized method -07 initialized
		mc.landCalculator(); // void type method -08 initialized
	}

}
