package lec09_02_java_constructor_final;

public class EmployeeTest {
	public static void main(String[] args) {
		 // default Constructor initialized
		Employee employee = new Employee();
				
		//Parameterized Constructor initialized	
		Employee employee1 = new Employee("Arman S", 0137653, 'M', true); 
		Employee employee2 = new Employee("Sanjeeda T", 2237653, 'F', false); 
		Employee employee3 = new Employee("Abdullah Rafi", 1137653, 'M', false); 
		Employee employee4 = new Employee("Sharon G", 9137653, 'F', true); 
		Employee employee5 = new Employee("Mizanur R", 5137653, 'M', true); 
				
	}

}
