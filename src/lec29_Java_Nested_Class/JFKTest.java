package lec29_Java_Nested_Class;

public class JFKTest {

	public static void main(String[] args) {
		System.out.println("\n-------------- JFK01 --------------\n");
		JFK01 jfk01 = new JFK01();
		jfk01.welcome();
		
		// Inner class is not possible to instantiate independently
		// TerminalOne t1 = new TerminalOne();
		// The reason is: No enclosing instance of type JFK01 is accessible. 
		// Must qualify the allocation with an enclosing instance of type JFK01
		
		jfk01.t1.destination();
		jfk01.t2.usAirlines();
		jfk01.t4.arabianFlights();
		
		System.out.println("\n-------------- JFK02 --------------\n");
		JFK02 jfk02 = new JFK02();
		jfk02.welcome();
		jfk02.t1.destination(); // also possible, but the above line can do the purpose, so no need to write it again
		jfk02.t4.arabianFlights();
		
		System.out.println("\n-------------- JFK02 --------------\n");
		// If the inner class is static, the outer class can call the static inner class and instantiate
		JFK02.TerminalFour jt01 = new JFK02.TerminalFour();
		jt01.arabianFlights();
		
		// JFK02.TerminalOne jt = new JFK02.TerminalOne();
		// non static inner class can't follow above line 30
		
		System.out.println("\n-------------- JFK03 --------------\n");
		JFK03 jfk03 = new JFK03();
		jfk03.welcome();
		
		System.out.println("\n-------------- JFK03 --------------\n");
		JFK03.TerminalFour jt02 = new JFK03.TerminalFour();
		jt02.arabianFlights();
		JFK03.TerminalFour.asianFlights();
		
		System.out.println("\n-------------- JFK04 --------------\n");
		JFK04 jfk04 = new JFK04();
		jfk04.t1.destination();
		jfk04.t2.usAirlines();
		
		
		
		
		

	}

}
