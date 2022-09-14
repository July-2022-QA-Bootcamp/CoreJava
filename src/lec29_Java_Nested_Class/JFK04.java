package lec29_Java_Nested_Class;

// Outer Class
public class JFK04 { // Opening of Outer class body
	// Inner class must be instantiated inside outer class
	Terminalone t1 = new Terminalone();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();
	
	// Here is the change
	// Method from Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");		
	}
	
	// Inner Class (1st)
	public class Terminalone { // Opening of Inner class body
		// Method from Inner class
		public void destination() {
			System.out.println("Terminal one is for Saudi Airlines");
			welcome(); // inner class method can access the outer class method directly, no object required
			t2.usAirlines(); // You can also call other inner classes methods, even the static one, line 24
			t4.arabianFlights();
			TerminalFour.asianFlights();
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
