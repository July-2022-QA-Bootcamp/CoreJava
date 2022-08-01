package lec10_01_java_casting;

public class UseOfNarrowingCasting {

	public static void main(String[] args) {
		double myDouble = 9.436543;
		int myInt = (int) myDouble; // casting here
		byte myByte = (byte) myDouble; // casting here
		System.out.println(myDouble);
		System.out.println(myInt); // called Narrowing casting
		System.out.println(myByte); // called Narrowing casting

	}

}
