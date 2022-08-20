package lec18_01_java_oop_abstraction;

// This is an interface
// An Interface can't inherit a regular class or an abstract class by extends keyword
// An Interface can inherit more than one Interface (separated by coma) by extends keyword

// implements keyword can't be used for inheritance inside Interface

public interface Car extends Taxi, Truck {
	// Interview question: Can we declare variables inside Interface, 
	// and if no, what is the type of variable can be used?
	// the variables inside Interface are final and static in nature.
	public static final int invented = 1800;
	
	//Interview question: Interfaces cannot have constructors
	/*
	public Car () {
		
	}
	*/
	
	// method is declared inside Interface (not implemented)
	// the method which are declared -- called also abstract method
	// This is not mandatory to put abstract keyword with the abstract method inside Interface
	public void start (); // void type abstract method
	public abstract void stop (); // void type abstract method
	public String brake(); // return type abstract method
	
	// from Java 1.8, JAVA implemented static and default type method in interface	which are implemented
	// important interview question
	public default void honk () {
		System.out.println("Honk Feature from Car Interface");
	}
	
	public static void gear () {
		System.out.println("Gear Feature from Car Interface");
	}
	
	// not important here, just used, can ignore
	public default String honk1() { // this default is not access modifier, also we can make it return type
		System.out.println("Honk Feature from Car Interface");
		return null;
	}
	
	
	
	

}
