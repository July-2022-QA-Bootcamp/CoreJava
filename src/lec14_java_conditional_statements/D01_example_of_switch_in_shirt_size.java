package lec14_java_conditional_statements;

public class D01_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'L';

		switch (size) {

		case 'S':
			System.out.println("Yes We have your Small Size Shirt");
			break; // remove break and see the outcome

		case 'M':
			System.out.println("Yes We have your Medium Size Shirt");
			break;

		case 'L':
			System.out.println("Yes We have your Large Size Shirt");
			break;

		case 'X':
			System.out.println("Yes, We have your Extra Large Size Shirt");
			break;

		default:
			System.out.println("Sorry! We don't have your size!!");

		}
		
	}

}
