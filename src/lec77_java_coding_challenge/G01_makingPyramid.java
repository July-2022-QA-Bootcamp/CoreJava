package lec77_java_coding_challenge;


/*   Implement a large Pyramid of stars in the screen with java.

     *
    * *
   * * *
  * * * *
 * * * * *

*/

// very common interview question
public class G01_makingPyramid {
	
	public static void pyramid (int n) {
		for (int i =0; i<n; i++) { // 0   //1   // 2   //3    //4
			
			for (int j = 0; j<n-i; j++) { // 0, 1, 2, 3, 4    // 0, 1, 2, 3     // 0, 1, 2    // 0, 1   // 0
				System.out.print(" ");
			}
			
			for (int k = 0; k<=i; k++) {  // 0   // 0, 1    // 0, 1, 2    // 0, 1, 2, 3     // 0, 1, 2, 3, 4
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {
		pyramid(5);
	}

}
