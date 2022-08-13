package lec15_java_control_statements;
/*
This is a very important topic used almost everywhere like variables and methods

for loop: most commonly used (1)
all the loop contain 3 part --
initialization block (int i=0), 
conditional block (i<=10) 
and incremental (i++) or decremental block (i--)
common mistakes: type of variable (like: int), semicolon (;) -- we put coma instead

i++ means increment by 1 (most common style for increment by 1)
i=i+1 means increment by 1
i +=1 means increment by 1

i = i+2 means increment by 2
i += 2 means increment by 2

i = i+3 means increment by 3
i +=3 means increment by 3

i-- means decrement by 1
i = i-1 means decrement by 1
i -= 1 means decrement by 1
i = i-2 means decrement by 2
i -= 2 means decrement by 2
i = i-3 means decrement by 3
i - = 3 means decrement by 3

*/

public class A_use_of_java_for_loop {

	public static void main(String[] args) {

		// incremental block is used here
		System.out.println("\n-------------- for loop 01 --------------\n");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 02  ----------\n");
		for (int i = 1; i <= 10; i = i + 2) { // increment by 2
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 03  ----------\n");
		for (int i = -6; i <= 10; i += 3) { // -6, -3, 0, 3, 6, 9
			if (i % 2 == 0) {
				System.out.println(i); // -6, 0, 6
			}
		}

		System.out.println("\n---------- for loop 04  ----------\n");
		for (int i = 1; i < 10; i += 3) { // i = i + 3 is same
			System.out.println("The values are: " + i); // 1, 4, 7
		}

		System.out.println("\n---------- for loop 05  ----------\n");
		for (double i = 5.3; i < 11; i = i + 2.5) {
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 06  ----------\n");
		int j = 2;
		for (int i = 1; i < 10; i = i + 3) { // 1, 4, 7
			System.out.println("The values are: " + i * j);
		}
		
		System.out.println("\n---------- for loop 07, condition is false  ----------\n");
		// as condition is false, nothing will execute/print
		for (int i = 5; i < 1; i -= 3) {
			System.out.println(i);
		}

		// this is infinite loop, so comment out not to run, common mistake when select
		// condition
		System.out.println("\n---------- for loop 08, infinite loop  ----------\n");
//		for (int i = 2; i > 1; i = i + 3) {
//			System.out.println(i);
//		}

		// decremental block is used
		System.out.println("\n---------- for loop 09  ----------\n");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- for loop 10  ----------\n");
		int l = 2;
		for (int i = 18; i > 10; i = i - 3) {
			System.out.println(i + l);
		}
		
		System.out.println("\n---------- for loop 11  ----------\n");
		int m = 2;
		for (int i = 25; i > 10; i -= 3) { // 25, 22, 19, 16, 13
			System.out.println(i/m);
		}
		
		System.out.println("\n---------- for loop 12, condition is false  ----------\n");
		// as condition is false, nothing will execute/print
		int n = 2;
		for (int i = 25; i < 10; i -= 3) {
			System.out.println(i + n);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
