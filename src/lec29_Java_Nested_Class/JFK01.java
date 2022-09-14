package lec29_Java_Nested_Class;

// Outer Class
public class JFK01 { // Opening of Outer class body
	// Inner class must be instantiated inside outer class
	Terminalone t1 = new Terminalone();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();
		
	// Method from Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");
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
	
	// Third inner class
	public class TerminalFour { 
		public void arabianFlights () {
			System.out.println("Terminal four is for Emirates International");
		}
	} 

} // Closing of Outer class body
