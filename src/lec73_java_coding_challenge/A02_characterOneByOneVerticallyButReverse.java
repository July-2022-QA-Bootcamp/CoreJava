package lec73_java_coding_challenge;

/*
Que: Print your name vertically but reverse

r
i
b
a
k

l
e
a
f
o
T

*/
// Easier than A03
public class A02_characterOneByOneVerticallyButReverse {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		// Total Character = 12, how we get that? s.length()
		// first one: index number 0
		// last one: index number 11 = 12-1 = s.length()-1
		for (int i = s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
