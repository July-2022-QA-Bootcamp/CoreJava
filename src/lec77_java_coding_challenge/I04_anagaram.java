package lec77_java_coding_challenge;

import java.util.Arrays;

/*
  Write a Java Program to check if the two String are Anagram. 
  Two String are called Anagram when there is same character but in different order.
  For example,"CAT" and "ACT", "ARMY" and "MARY".
 */

public class I04_anagaram {
	public static boolean isAnagram(String st11, String st22) {
		if (st11.length() != st22.length()) {
			return false;
		}
		st11 = st11.toUpperCase();
		st22 = st22.toUpperCase();
		char[] charArray = st11.toCharArray();
		char[] charArray2 = st22.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray, charArray2);
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("ARMY", "MARY"));
	}

}
