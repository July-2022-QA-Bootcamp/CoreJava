package lec09_01_java_constructor;

public class EmployeeTest {
	public static void main(String[] args) {
		 // default Constructor is initialized
		Employee employee1 = new Employee();
		// Here 'Fargab Anik' is an argument, 
		// in Employee class, empName was a parameter and that is String type
		// Parameterized Constructor 01 is initialized	
		Employee employee2 = new Employee("Fargab Anik");
		//Parameterized Constructor 02 is initialized	
		Employee employee3 = new Employee("Sharon G", 218876); 
		//Parameterized Constructor 03 is initialized	
		Employee employee4 = new Employee("Abdullah Rafi", 123876, 'M'); 
		//Parameterized Constructor 04 is initialized	
		Employee employee5 = new Employee("Sanjeeda T", 6687653, 'F', true); 
		//Parameterized Constructor 05 is initialized	
		Employee employee6 = new Employee("Md Shoheb", 2137653, false, 'M'); 
		//Parameterized Constructor 05 is initialized	
		Employee employee7 = new Employee("Arman S", 0137653, true, 'M'); 
		
		// summary:
		// we must have to put the argument in a sequence like the way parameter declared in constructor
		// it doesn't matter the sequence of variable inside the sysout
		// It is possible to create a parameterized constructor with the same number of parameters but they should be organized in a different manner.
		
		
	}

}
