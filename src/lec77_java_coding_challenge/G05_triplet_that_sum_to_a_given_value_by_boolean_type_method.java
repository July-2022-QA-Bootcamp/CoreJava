package lec77_java_coding_challenge;

/*   Find a triplet that sum to a given value (Sazzad)

Input: A[] = {1, 4, 45, 6, 10, 8 }, sum = 22; 
Output: ?
					
					1          4         45         6        10         8
										
*/

public class G05_triplet_that_sum_to_a_given_value_by_boolean_type_method {
	static int [] array = { 5, 1, 4, 6, 10, 7, 12};
	static int sum = 22;
	static int size = array.length;

	// I will see it later, but follow G04
	// if we use boolean type, it can't find again, so, return type int is better, see next code
	// returns true if there is triplet equal to sum
	public static boolean find3Numbers(int [] array, int size, int sum) {
		// Fix the first element as A[i]
		for (int i = 0; i < size - 2; i++) {

			// Fix the second element as A[j]
			for (int j = i + 1; j < size - 1; j++) {

				// Now look for the third number
				for (int k = j + 1; k < size; k++) {
					if (array[i] + array[j] + array[k] == sum) {
						System.out.print("Triplets are:::> " + array[i] + ", " + array[j] + ", " + array[k]);
						return true;
					}
				}
			}
		}
		// If we reach here, then no triplet was found
		return false;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		find3Numbers(array, size, sum);
	}

}
