package lec29_Java_Nested_Class;

// Outer Class
public class JFK03 { // Opening of Outer class body
	// Inner class must be instantiated inside outer class
	Terminalone t1 = new Terminalone();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();
	
	// Here is the change
	// Add a static method inside static class
	// Method from Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");
		// the inner class object can call their methods inside the outer class method
		t1.destination();
		t2.usAirlines();
		t4.arabianFlights();
		TerminalFour.asianFlights();		
	}
	
	// Inner Class (1st)
	public class Terminalone { // Opening of Inner class body
		// Method from Inner class
		public void destination() {
			System.out.println("Terminal one is for Saudi Airlines");
		}
	} // Closing of Inner class body
	
	// Second inner class
	public class TerminalTwo {
		public void usAirlines() {
			System.out.println("Terminal two is for Delta International");
		}
	}
	
	// Here is the change
	// Static Nested class
	public static class TerminalFour { 
		// non static method
		public void arabianFlights () {
			System.out.println("Terminal four is for Emirates International");
		}
		 // static method
		public static void asianFlights () {
			System.out.println("Terminal four is also for Thai International");
		}		
	} 

} // Closing of Outer class body
