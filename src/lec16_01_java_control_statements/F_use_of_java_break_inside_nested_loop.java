package lec16_01_java_control_statements;

public class F_use_of_java_break_inside_nested_loop {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) { // 1, 2, 3
			for (int j = 1; j <= 3; j++) { // 1, 2, 3
				// line 11-13 absent, the outcome should be 1 1 , 1 2, 1 3, 2 1, 2 2, 2 3, 3 1, 3 2, 3 3
				// inner loop will be break at 2 2, so, no outcome 0f 2 2 and 2 3,
				// so inner loop break but not the outer loop, so go back to outer loop for 3 and get the value of 3 1, 3 2 , 3 3
				if (i == 2 && j == 2) { // logical and operator both condition should be true
					break;
				}
				System.out.println(i + " " + j);
			}

		}

	}

}

// Final: 1 1 , 1 2, 1 3, 2 1, 3 1, 3 2, 3 3
