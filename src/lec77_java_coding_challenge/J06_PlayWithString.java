package lec77_java_coding_challenge;

public class J06_PlayWithString {

	public static void main(String[] args) {
		String s = "Java Java";
		s.replace('a', '@');
		// System.out.println(s.replace('a', '@'));
		// System.out.println(s.replaceAll(s, "Showkot wanna know"));
		// Main clue: String is immutable
		System.out.print(s);
	}

}
