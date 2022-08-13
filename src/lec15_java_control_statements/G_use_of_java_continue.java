package lec15_java_control_statements;

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

	}

}
