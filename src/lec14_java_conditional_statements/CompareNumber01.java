package lec14_java_conditional_statements;

/*
Conditional Statement:
Conditional Statements allow the program to behave differently based on condition. 
Example: if, else, else if, switch. 
Regarding condition: First condition is always if.
Generally we don't use - 2 if condition (code wise OK), 
Generally the true statement is written at the end.
 */

public class CompareNumber01 {

	public static void main(String[] args) {
		int val1 = 65;
		int val2 = 34;
		
		if (val1 < val2) {
			System.out.println(val1 + " is less than " + val2);
		}
		
		if (val1 > val2) {
			System.out.println(val1 + " is greater than "+ val2);
		}

	}

}
