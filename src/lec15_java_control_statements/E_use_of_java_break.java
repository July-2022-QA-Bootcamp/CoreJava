package lec15_java_control_statements;

public class E_use_of_java_break {
	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) {
			System.out.println("The values is: " + i);
		}
		
		System.out.println("\n---------- for loop after break  ----------\n");
		for (int j = 1; j <= 5; j++) { // Generally the outcome is: 1, 2, 3, 4, 5
			if (j==3) {
				break;
			}
			System.out.println("The values is: " + j);
		}
		
	}

}
