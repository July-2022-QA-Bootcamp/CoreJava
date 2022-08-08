package lec13_java_conditional_statements;

import java.util.Random;

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
first condition 'if', last condition generally 'else', but not always, 'else if' is also ok at the end of the condition.
if there are more condition, you can use more than one 'else if' condition
 */

public class CompareNumber05 {

	public static void main(String[] args) {
		System.out.println("Please put your value here: ");
		Random random = new Random();
		int val1 = random.nextInt(100);
		int val2 = random.nextInt(100);
		
		if (val1 < val2) {
			System.out.println(val1 + " is less than " + val2);
		} else if (val1 > val2) {
			System.out.println(val1 + " is greater than "+ val2);
		} else if (val1 == val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else {
			System.out.println("The system failed to initialize the outcome");
		}
		
	}

}







