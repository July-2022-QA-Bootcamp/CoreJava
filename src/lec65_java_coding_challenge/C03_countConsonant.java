package lec65_java_coding_challenge;

// Que: How many Consonant is in the String?

public class C03_countConsonant {

	// From Esfak, another way to do, but interviewer generally don't like line 22.
		public static void main(String[] args) {
			String s = "A quick brown fox jumps over the lazy dog";
			s = s.toLowerCase(); // convert to all to lower case
			s = s.replaceAll("\\s", ""); // 

			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u') {
					count++;
				}

			}
			System.out.println(s.length() - count); // Interviewer don't like the arithmetic expression for coding challenge

		}

}
