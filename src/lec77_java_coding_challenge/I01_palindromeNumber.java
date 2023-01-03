package lec77_java_coding_challenge;

//4321234 = Palindrome Number
//42123 = Not Palindrome Number 
//few times asked (not so important)

public class I01_palindromeNumber {

	public static boolean isPalindrome(int num) {
		int remainder = 0;
		int sum = 0;
		int total = num;

		while (num > 0) {
			remainder = num % 10;
			sum = (sum * 10) + remainder;
			num = num / 10;
		}

		if (total == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Palindrome Number? Ans: " + isPalindrome(313));
		System.out.println("Palindrome Number? Ans: " + isPalindrome(213));
		System.out.println(3%10);

	}

}
