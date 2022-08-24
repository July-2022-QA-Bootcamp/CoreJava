package lec20_02_java_oop_abstraction_final;

public interface Car {
	
	public void start(); 
	public String stop(); 
	public abstract void brake(); 
		
	public default void  honk() { 
		System.out.println("Honk Feature from Car Interface");
	}
	
	public static void gear() {
		System.out.println("Gear feature from Car Interface");
	}	

}