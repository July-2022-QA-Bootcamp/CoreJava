package lec13_java_conditional_statements;

/*
Even number (2, 4, 6, 8, 10): A number divided by 2 with remainder 0.
Example - 56 : 56/2 --- divisor 2, quotient 28, remainder/modulus 0
Odd number (1, 3, 5, 7, 9) : A number divided by 2 with remainder 1.
Example - 37 : 37/2 --- divisor 2, quotient 18, remainder/modulus 1
Is 0 an Even Number? The answer is easy: Yes, zero is an even number. Usually, zero together with the even numbers, 
so certainly it is not an odd number. An even number is formally defined as an integer of the form n = 2x, 
where x is an integer.
 */

import java.util.Scanner;

public class CompareNumber06 {
	public static void main(String[] args) {
		System.out.println("Please put a number: ");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		
		if (val1 % 2 == 0) {
			System.out.println(val1 + " is an even Number");
		}  else if (val1 % 2 == 1) {
			System.out.println(val1 + " is an odd Number");
		} else {
			System.out.println("please put a valid Number");
		}
		scanner.close();		
	}

}
