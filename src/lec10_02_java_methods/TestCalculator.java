package lec10_02_java_methods;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator01 cal01 = new Calculator01();
		cal01.addition();
		cal01.subtraction();
		cal01.multipliaction();
		cal01.division();

		Calculator02 cal02 = new Calculator02();
		cal02.addition();
		cal02.subtraction();
		cal02.usCitizen();

		Calculator03 cal03 = new Calculator03();
		cal03.multiplication();
		cal03.division(5.36562f, 4.677536f);
		cal03.division(7.362f, 3.6736f);
		cal03.division(2.362f, 6.536f);
		
		Calculator04 cal04 = new Calculator04();
		cal04.division();
		cal04.multiplication();
		
	}

}
