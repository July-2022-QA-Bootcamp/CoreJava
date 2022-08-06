package lec12_java_different_type_of_class;

import java.util.Random;

// Mainly interview question, conversion from one data type to another.
// int range = -2,147,483,648 to 2,147,483, 647

public class Use_of_random_class {

	public static void main(String[] args) {
		System.out.println("--------------- Use of nextInt without limit (int type) ------------------");
		Random random = new Random(); // choosing randomly, no input, so no System.in
		int a = random.nextInt();
		int b = random.nextInt();
		System.out.println("Randomly chosen number 1 : " + a);		
		System.out.println("Randomly chosen number 2 : " + b);
		System.out.println("Randomly chosen number 3 : " + random.nextInt());
		
		System.out.println("\n--------------- Use of nextInt with limit ------------------");
		int c = random.nextInt(100); // what happen if we put -100, try it, bound must be positive
		int d = random.nextInt(1000);
		System.out.println("Randomly chosen number 4 : " + c);
		System.out.println("Randomly chosen number 5 : " + d);
		System.out.println("Randomly chosen number 6 : " + random.nextInt(200));
		
		// Can we pt a range of 500-1000 any how?
		// important interview question
		// by default boolean value is : false
		// by default int value is : 0
		// by default String value is : Null
		
		System.out.println("\n--------------- Use of nextBoolean------------------");
		boolean e = random.nextBoolean();
		boolean f = random.nextBoolean();
		System.out.println("Random Boolean value 1 : " + e);
		System.out.println("Random Boolean value 2 : " + f);
		System.out.println("Random Boolean value 3 : " + random.nextBoolean());
		
		System.out.println("\n--------------- Use of nextDouble, nextFloat, nextLong ------------------");
		double g = random.nextDouble();
		float h = random.nextFloat();
		long i = random.nextLong();
		System.out.println("Random Double value : " + g);
		System.out.println("Random Float value : " + h);
		System.out.println("Random Long value : " + i);
		
		/*
		 (high level, no need)
		 There is no random.nextShort() method, so you could use
		 short s = (short) Random.nextInt(Short.MAX_VALUE + 1);
		 The +1 is because the method returns a number up to the number specified (exclusive).
		 hopefully similar for byte
		 */
		
		
		
	}

}
