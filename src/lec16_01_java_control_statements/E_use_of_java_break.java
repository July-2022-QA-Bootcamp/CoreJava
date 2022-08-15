package lec16_01_java_control_statements;

public class E_use_of_java_break {
	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) {
			System.out.println("The values is: " + i);
		}

		System.out.println("\n---------- for loop after break  ----------\n");
		for (int j = 1; j <= 5; j++) { // Generally the outcome is: 1, 2, 3, 4, 5
			if (j == 3) {
				break;
			}
			System.out.println("The values is: " + j);
		}
		// Try to understand at least the for loop, that is enough, if you feel stress don't go below

		System.out.println("\n---------- while loop ----------\n");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- while loop after break 01 ----------\n");
		int j = 0;
		while (j <= 10) { // regular outcome will be: 0, 2, 4, 6, 8, 10
			if (j == 7) {
				break;
			}
			System.out.println("The value is: " + j); // break is not implemented because no value as 7
			j=j+2;
		} 
		
		System.out.println("\n---------- while loop after break 02 ----------\n");
		int n = 1;
		while (n <= 10) { // normally 1, 3, 5, 7, 9
			if (n == 7) {
				break;
			}
			System.out.println("The value is: " + n); // break is implemented because 7 is present as value
			n=n+2;
		}
		
		System.out.println("\n---------- do while loop after break 01 ----------\n");
		int l = 1;
		do { // regular outcome is: 1, 3, 5, 7
			System.out.println("The value is: " + l);			
			if (l == 5) {
				break;
			}
			l = l + 2;
		} while (l <= 7);
		
		System.out.println("\n---------- do while loop after break 02 ----------\n");
		int m = 1;
		do {
			System.out.println("The value is: " + m);		// 1, 3, 5, 7
			// remember, in do while loop, sysout is present before break condition
			if (m == 6) {  // condition is absent, so break is not implemented
				break;
			}
			m = m + 2;
		} while (m <= 7);
		

	}

}
