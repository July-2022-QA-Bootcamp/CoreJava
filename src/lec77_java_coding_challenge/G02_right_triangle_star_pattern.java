package lec77_java_coding_challenge;

/*   Java Program to Print Right Triangle Star Pattern (Que: Atiqur Rahman)

* 
* * 
* * * 
* * * * 
* * * * *  

*/

public class G02_right_triangle_star_pattern {

	public static void rightTriangleStar(int n) {
		for (int i = 0; i < n; i++) { // 0 //1 // 2 //3 //4

			for (int k = 0; k <= i; k++) { // 0 // 0, 1 // 0, 1, 2 // 0, 1, 2, 3 // 0, 1, 2, 3, 4
				System.out.print("* ");
			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		rightTriangleStar(5);
	}

}
