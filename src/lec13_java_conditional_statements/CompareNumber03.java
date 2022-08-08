package lec13_java_conditional_statements;

/*
Conditional Statement:
Conditional Statements allow the program to behave differently based on condition. 
Example: if, else, else if, switch. 
Regarding condition: First condition is always if.
Generally we don't use - 2 if condition (code wise OK), 
rather we use 'if' as first condition and 'else or else if' as second condition. 
Generally the true statement is written at the end.
When we write 'else', no condition is necessary to write,
Whatever you want to print, it will be printed in else block. either it is true or false, correct or incorrect, it doesn't matter
But if we wish to write a second condition , we have to use 'else if', not 'else' 
 */

public class CompareNumber03 {

	public static void main(String[] args) {
		int val1 = 65;
		int val2 = 34;
		
		if (val1 < val2) { // inside the () -- condition is present, if condition is true then this if block will be executed
			System.out.println(val1 + " is less than " + val2);
		} else if (val1 > val2) {
			System.out.println(val1 + " is greater than "+ val2);
		}

	}

}