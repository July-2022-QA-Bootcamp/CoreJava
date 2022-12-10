package lec65_java_coding_challenge;

/*
Que: Print your name vertically but reverse [They will not mention: character by character]

T
o
f
a
e
l

K
a
b
i
r

*/

public class A01_characterOneByOneVertically {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		// Total Character = 12, how we get that? s.length()
		// first one: index number 0
		// last one: index number 11 = 12-1 = s.length()-1
		for (int i =0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}

}
