package lec73_java_coding_challenge;

/*   Java Program to Print left Triangle Star Pattern 

            * 
         * * 
      * * * 
   * * * * 
* * * * *  

*/

public class G03_left_triangle_star_pattern {

public static void leftTriangleStar(int n) {
		
		// check what happen if i=0,
	    // i=1 is better, otherwise it gives an extra space
		for (int i = 0; i <= n; i++) { // Outer loop for rows
			// This loop create 3 space and give us  the 
			for (int j = 0; j <= n - i; j++) { // Inner loop for space  
			System.out.print("   ");
			}
			for (int k = 0; k <= i; k++) { // Inner loop for columns
			System.out.print("* ");
			}
			System.out.println(); //throws the cursor in a new line after printing each line
			} 
	}

	// Driver Function
	public static void main(String args[]) {
		leftTriangleStar(5);

	}

}
