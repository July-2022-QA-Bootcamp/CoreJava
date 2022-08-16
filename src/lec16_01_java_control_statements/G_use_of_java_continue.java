package lec16_01_java_control_statements;

public class G_use_of_java_continue {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) {
			System.out.println("The values is: " + i);
		}

		System.out.println("\n---------- for loop after continue 01  ----------\n");
		for (int i = 1; i <= 5; i++) { // Generally the outcome is: 1, 2, 3, 4, 5
			if (i == 3) {
				continue; // if you use continue, this condition will skipped
			}
			System.out.println("The values is: " + i);
		}
		// Try to understand at least the for loop

		System.out.println("\n---------- for loop after continue 02  ----------\n");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // select the even number and
				continue; // skip all the even number
			}
			System.out.println("The value is: " + i); // 1, 3, 5, 7, 9
		}
		
		System.out.println("\n---------- for loop after continue 03 ----------\n");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) { // select the odd number and 
				continue; // skip all the odd number
			}
			System.out.println("The value is: " + i); // 2, 4, 6, 8, 10
			
		}
		
		// Exception in while and do while loop for using continue
		// if feel trouble, skip below
		System.out.println("\n---------- while loop after continue ----------\n");
		int j = 1;
		while (j <= 9) {
			if (j == 5) {
				j+=2; // important info:  this is an exception, because the outcome doesn't go to print  and increment in next line, 
				// we use increment here 5 become 7
				continue;  
			}
			System.out.println("The value is: " + j); // 1, 3, 7, 9
			j+=2; 
		}
		
		System.out.println("\n---------- do while loop ----------\n");
		int k = 1;
		do {
			System.out.println("The value is: " + k);
			k = k + 2;
		} while (k <= 7);

		
		System.out.println("\n---------- do while loop after continue ----------\n");
		int l = 1;
		do {
			if (l == 5) {
				l=l+2; // this is an exception, because the outcome doesn't go to print  and increment in next line, we use increment here
				continue;
			}
			System.out.println("The value is: " + l);
			l = l + 2;
		} while (l <= 9);
		
		
		

	}

}

/*
 Int [] number={2,54,16,-43,3,67,32,78,100};
Find the second largest number: 
 */




