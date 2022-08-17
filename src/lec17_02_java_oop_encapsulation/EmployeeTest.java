package lec17_02_java_oop_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee("Alex F", 40, 'M', false); // Argument helps to set the value for get
		System.out.println("The Employee Name is: " + emp.getName() + ", Employee Age: " + emp.getAge()+", Employee Sex: " + emp.getSex()+" and Is US Citizen? Ans: " +emp.isUsCitizen());

	}

}
