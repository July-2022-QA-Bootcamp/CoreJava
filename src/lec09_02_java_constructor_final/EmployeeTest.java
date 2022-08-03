package lec09_02_java_constructor_final;

public class EmployeeTest {
	public static void main(String[] args) {
		 // default Constructor initialized
		Employee employee = new Employee();
				
		// Parameterized Constructor initialized	
		Employee arman = new Employee("Arman S", 0137653, 'M', true); 
		Employee sanjeeda = new Employee("Sanjeeda T", 2237653, 'F', false); 
		Employee rafi = new Employee("Abdullah Rafi", 1137653, 'M', false); 
		Employee sharon = new Employee("Sharon G", 9137653, 'F', true); 
		Employee mizan = new Employee("Mizanur R", 5137653, 'M', true); 
		mizan.employee("Mizanur Rahman", 20534, 'M', false);
				
	}

}
