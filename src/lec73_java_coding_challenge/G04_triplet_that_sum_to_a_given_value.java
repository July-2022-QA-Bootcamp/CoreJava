package lec73_java_coding_challenge;

/*   Find a triplet that sum to a given value (Sazzad)

Input: A[] = {1, 4, 45, 6, 10, 8 }, sum = 22; 
Output: ?
					
					1          4         45         6        10         8
										
*/

public class G04_triplet_that_sum_to_a_given_value {
	static int[] array = { 5, 1, 4, 6, 10, 7, 12 };
	static int sum = 22;
	static int size = array.length;

	// why size-2, size-1, size, because they don't wanna sum same number, because the question said triplet, it means 3 different number
	// returns true if there is triplet equal to sum
	public static int find3Numbers(int[] array, int size, int sum) {
		// Fix the first element as array[i]
		int count = 0;
		for (int i = 0; i < size - 2; i++) {

			// Fix the second element as array[j]
			for (int j = i + 1; j < size - 1; j++) {

				// Now look for the third number
				for (int k = j + 1; k < size; k++) {
					if (array[i] + array[j] + array[k] == sum) {
						System.out.print("Triplets are:::> " + array[i] + ", " + array[j] + ", " + array[k] + "\n");
						count++;
					}
				}
			}
		}
		System.out.println("Incident happen: " + count);
		return count;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		find3Numbers(array, size, sum);

	}

}
