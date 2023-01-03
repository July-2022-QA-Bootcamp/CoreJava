package lec77_java_coding_challenge;

//See next code G08, that is correct, THIS IS NOT, I KEPT IT FOR UNDERSTANDING THE MISTAKE

public class G07_find_the_element_that_appears_once_in_array_wrong {
	static int[] array = { 2, 3, 5, 4, 5, 3, 4, 1, 3, 2 };
	static int size = array.length;
	
	public static void findUniqueData(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) { // as we start from i+1, this doesn't allow us remember what skipped
				if (array[i] == array[j]) { // so we added an extra condition here in next file
					break;
				} else if (j == size - 1) {
					System.out.println("Elelments occuring once are: " + array[i]);
				}

			}
		}
	}

	public static void main(String[] args) {
		findUniqueData(array, size);
	}

}
