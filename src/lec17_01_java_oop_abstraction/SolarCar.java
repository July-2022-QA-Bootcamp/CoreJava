package lec17_01_java_oop_abstraction;

public abstract class SolarCar {
	// Interview question: Can we create variables inside Abstract class?
	public String name;
	public int diameter;
	
	// Interview question: Can a Constructor of Abstract class be initialized?
	public SolarCar () {
		System.out.println("Can a Constructor of Abstract class be initialized?");
	}
	
	public abstract void speed ();
	public abstract int cost (); // return type method used here
	
	

}
