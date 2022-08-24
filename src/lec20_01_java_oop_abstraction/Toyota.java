package lec20_01_java_oop_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword

// Toyota here is a concrete class, because it can extends a regular class or abstract class and implements Interfaces
public class Toyota extends ElectricCar implements Drone, Car {
	
	public int yearOfManufacture = 1885;
	
	public Toyota() {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method is implemented inside class (not declared)
	// also called non-abstract method
	public void toyotaInfo() {
		System.out.println("This method is from Toyota Class");
	}
	
	// return type methods also can be used 
	public int toyotaPrice() {
		int price = 45000;
		System.out.println(price);
		return price;
	}
	
	// static method can be used inside regular class
	public static void countryOfOrigin () {
		System.out.println("Made in Japan");
	}
	
	// Default methods are allowed only in interfaces, not in regular class
	
	/*
	public default void toyotaColor () {
		
	}
	*/
	
	@Override
	public void lightWeight() {
		System.out.println("lightWeight method from Drone Interface");		
	}

	@Override
	public void price() {
		System.out.println("price method From Electric Car Abstract class");
		
	}

	@Override
	public String carName() {
		String name1 = "Arcimoto";
		System.out.println(name1);
		return name1;
	}

	@Override
	public void rent() {
		System.out.println("rent method from Taxi Interface");
		
	}

	@Override
	public void carryingPassenger() {
		System.out.println("carryingPassenger method from Taxi Interface");
		
	}

	@Override
	public void carryingGoods() {
		System.out.println("carryingGoods method from Truck Interface");
		
	}

	@Override
	public void start() {
		System.out.println("start method from Car Interface");
		
	}

	@Override
	public void stop() {
		System.out.println("stop method from Car Interface");
		
	}

	@Override
	public String brake() {
		String m = "brake method from Car Interface";
		System.out.println(m);
		return m;
	}

	@Override
	public void autopilot() {
		System.out.println("autoPilot method from Flying Car Abstract class");
		
	}

	@Override
	public void expensive() {
		System.out.println("expensive method from rocket Interface");
		
	}

	@Override
	public void canFloat() {
		System.out.println("canFloat method from HoverCar Interface");
		
	}

}
