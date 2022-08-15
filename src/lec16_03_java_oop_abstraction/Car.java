package lec16_03_java_oop_abstraction;

public interface Car {
	// method is declared inside Interface (not implemented)
	// the method which are declared -- called also abstract method
	// This is not mandatory to put abstract keyword with the abstract method inside Interface
	public void start ();
	public abstract void stop ();
	public void brake();

}
