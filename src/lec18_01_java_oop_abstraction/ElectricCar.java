package lec18_01_java_oop_abstraction;


// This is an abstract class
// we must have to put abstract keyword in abstract class
// An abstract class can inherit only one abstract class or one regular class by extends key word
// An abstract class can't inherit an Interface by extends key word

// implements keyword is used to inherit Interface in abstract class
// an abstract class can inherit more than one Interface
// an abstract class cannot inherit a regular class or abstract class by implements keyword

public abstract class ElectricCar extends FlyingCar implements Rocket, HoverCar{
	// Interview question: Can we create variables inside Abstract class?
	public String nameOfEleectricCar = "Tesla";
	public int costOfTesla = 65000;
	
	// Constructor declared
	// Interview question: Can a Constructor of an Abstract class be initialized?
	public ElectricCar () {
		System.out.println("This constructor is from Abstract class-- Electric Car");
	}
	
	// method implemented
	public void battery () {
		System.out.println("The Battery is very efficient, from Electric Car class");
	}
	
	// method declared
	// when method is declared, that method is also called abstract method
	// This is mandatory to put abstract keyword with the abstract method inside Abstract Class
	// This is the norm to write at least one abstract method inside abstract class
	public abstract void price();
	
	public abstract String carName();
	
	// static method can be used inside abstract class
	public static void yearEstablished () {
		System.out.println("Established on 2018");
	}
	
	// Default methods are allowed only in interfaces.
	/*
	public default void noGas () {
	
	}
	*/
	
	

}
