package lec77_java_coding_challenge;

public class J01_calculator {

	int num = 100;

	public void cal(int num) {
		this.num = num * 10; 
	}

	public void printNum() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		J01_calculator obj = new J01_calculator();
		obj.cal(2);
		obj.printNum();
	}

}
