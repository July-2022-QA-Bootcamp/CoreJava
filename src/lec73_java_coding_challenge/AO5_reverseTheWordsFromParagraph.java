package lec73_java_coding_challenge;

import java.util.Arrays;

/*
vvimportant:
Interview question in comcast (PA)
Write a function to transform input, e.g.:
Input: "Hello Mohammad Tofael Kabir Sharkar"
Output: "Sharkar Kabir Tofael Mohammad Hello"

*/

public class AO5_reverseTheWordsFromParagraph {

	public static void main(String[] args) {
		String s = "Hello Mohammad Tofael Kabir Sharkar";
		String [] words = s.split(" ");
		// System.out.println(Arrays.toString(words));
		// I did above line just to show that the sentence is split to an String type Array
		
		for (int i=words.length-1; i>=0; i--) {
			System.out.print(words[i]+" ");
		}
		
		// Why length properties, not length() method -- words is an Array
		// Why print but not println?
		// why we use " " with space in line 18 and 22?
		
	}

}
