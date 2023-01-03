package lec73_java_coding_challenge;

// Que: How many vowel is in the String?

public class C01_countVowel {

	public static void main(String[] args) {
		String s = "Pack my box with five dozen liquor jugs";
		// you can also convert the String to Upper case [toUpperCase()] and look for vowel
		s = s.toLowerCase();
		// line 12 is not mandatory here, but for C12 must
		s = s.replaceAll("\\s", ""); // replacing all white space
		int count = 0;
		
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);
		
		// in logical or operator: if one condition is true, then the whole condition is true
		
		
		
	}

}
