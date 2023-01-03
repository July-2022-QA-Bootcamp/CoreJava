package lec73_java_coding_challenge;

// Que: Write a method to find how many Consonant is present in the String?

public class C04_countConsonant {

	public static String findConsonant(String s) {
		s = s.toLowerCase();
		s = s.replaceAll("\\s", "");
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u') {
				count++;
			}
		}
		System.out.println(count);
		return s;
	}

	public static void main(String[] args) {
		findConsonant("A quick brown fox jumps over the lazy dog");
		findConsonant("Pack my box with five dozen liquor jugs");
	}

}

//A01 to C04 (except A05) = First level interview coding challenge