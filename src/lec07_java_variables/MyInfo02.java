package lec07_java_variables;

public class MyInfo02 {
	// In the class body, we have to write First Variable, Then Constructor and then Method
	// And they should be before main method
	// Variable is also called field
	// Variables ended with ;
	
	// all the variables name start with lower case
	// The most common variables used are String, int, char and boolean -- always used
	
	// Here variable is declared, how? We didn't give a value for the variable Name	
	public String schoolName; 
	
	// public, private, protected, default = access modifier (represent accessibility), 
	// String = type of the variable, firstName is the name of the String type variable
	// String type variable is initialized inside double quotation
	public String firstName = "Mohammad";
	private String middleName = "Tofael";
	protected String middle_name = "Kabir";
	String lastName = "Sharkar"; 
	
	// int (integer) = type of the variable, myYearlySalary is the name of the int type variable
	// int type variable is initialized without any quotation
	public int myYearlySalary = 737463424;
	
	// char (character) = type of the variable, sex is the name of the char type variable
	// char type variable is initialized inside single quotation, 
	// and represented by upper case single character/letter
	public char sex = 'M';
	
	// boolean = type of the variable, usCitizen is the name of the boolean type variable
	// boolean type variable is initialized without any quotation, represented by true or false
	public boolean usCitizen = false;
	
	public static void main(String[] args) {
		// not doing any execution, so no sysout

	}

}
