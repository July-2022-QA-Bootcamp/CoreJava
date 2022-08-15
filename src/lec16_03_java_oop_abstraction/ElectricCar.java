package lec16_03_java_oop_abstraction;

public abstract class ElectricCar {
	// method implemented
	public void battery () {
		System.out.println("The Battery is very efficient, from Electric Car class");
	}
	
	// method declared
	// when method is declared, that method is also called abstract method
	// This is mandatory to put abstract keyword with the abstract method inside Abstract Class
	// This is the norm to write at least one abstract method inside abstract class
	public abstract void price();

}
