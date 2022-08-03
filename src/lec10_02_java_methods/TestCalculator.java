package lec10_02_java_methods;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator01 cal01 = new Calculator01();
		cal01.addition();
		cal01.subtraction();
		cal01.multipliaction();
		cal01.division();

		System.out.println("\n-------------------------------------\n");
		Calculator02 cal02 = new Calculator02();
		cal02.addition();
		cal02.subtraction();
		cal02.usCitizen();

		System.out.println("\n-------------------------------------\n");
		Calculator03 cal03 = new Calculator03();
		cal03.multiplication();
		cal03.division(5.36562f, 4.677536f);
		cal03.division(7.362f, 3.6736f);
		cal03.division(2.362f, 6.536f);

		System.out.println("\n-------------------------------------\n");
		Calculator04 cal04 = new Calculator04();
		cal04.division();
		cal04.multiplication();

		System.out.println("\n-------------------------------------\n");
		Calculator05 cal05 = new Calculator05();
		cal05.addition(33, 55);
		cal05.addition(12, 100);
		cal05.subtraction(3251, 9);
		cal05.subtraction(333, 11);
		cal05.multiplication(22, 4);
		cal05.division(44, 8);

		System.out.println("\n-----------------------------------------\n");
		Calculator06 cal06 = new Calculator06();
		cal06.addition(23, 15); // if the method is parameterized, you can use different argument to get
								// different value
		cal06.subtraction(22, 13);
		cal06.multiplication(22, 4);
		cal06.multiplication(222, 111);
		cal06.division(14, 8);

		System.out.println("\n-----------------------------------------\n");
		Calculator07 cal07 = new Calculator07();
		cal07.addition(32, "8");
		cal07.addition(32, "66");
		cal07.multiplication(3.65426, "2.73687");
		cal07.subtraction(323, 24.4234);
		cal07.division01(62357, 642.823974f);
		cal07.division02(2357, 42.84f);

	}

}
