package lec77_java_coding_challenge;

/*
Que: Write a code to represent your name in reverse 
or Print your name by reverse
Input: Tofael Kabir
Output: ribak leafoT
*/

public class A04_characterOneByOneHorizontallyButReverse {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		// Total Character = 12, how we get that? s.length()
		// first one: index number 0
		// last one: index number 11 = 12-1 = s.length()-1
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
