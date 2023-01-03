package lec77_java_coding_challenge;

/*
 5! = 5x4x3x2x1
 4! = 4x3x2x1
 1! = 1
 0! = 1 [Exception]
 
 Explaining:
 
 5! = 5x4x3x2x1
 	 = 5x(5-1)x(5-2)x(5-3)x(5-4)
 	 
 n! = n(n-1)(n-2)(n-3)(n-4) .................. (n-(n-1))
 
 FYI: Why 0! = 1?
 Factorial of a number in mathematics is the product of all the positive numbers less than or equal to a number.
 But there are no positive values less than zero so the data set cannot be arranged which counts as the possible
 combination of how data can be arranged (it cannot). Thus, 0! = 1.
  
 */

public class F01_factorialNumber {
	//1st way: doing by recursive method
	public static int recFactorial (int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * recFactorial(n-1);
		}
	}
	
	// 2nd way: Doing by for loop
	// 6x5x4x3x2x1
	// 1x2x3x4x5x6
	public static int factorial (int m) {
		int total = m;
		for (int i=m-1; i>=1; i--) {
			total = total*i;
		}
		return total;
	}
	

	public static void main(String[] args) {
		System.out.println(recFactorial(5));
		System.out.println(factorial(6));
		
		
		
		
		
		
		
		
	}

}
