package lec07_java_variables;

public class Tofael {
	public String name = "Mohammad Sharkar"; // variable initialized
	public byte age = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 1176573468;
	public long myBankBalance = 6374365687965847658l; // we have to use l, at the end of long value
	public float myHeight = 1.73767f; // we have to use f, at the end of float value
	public double myGrade = 3.76485687348767;
	public char sex = 'M';
	public boolean usCitizen = false;
	
	public static void main(String[] args) {
		// Tofael is a class, tofael is an object or reference variable - object always start with lower case
		// = equal operator, new is a keyword
		// an object is created (tofael) from Tofael class which is new and Tofael type
		// This action --> (when an object is created from the class) is called instantiation, (vvImp info)
		// Then we say the class (Tofael) is instantiated
		Tofael tofael = new Tofael();	
		System.out.println(tofael.name); // line 21-32, all are possible, but we will use directly line 33 where you call all the variables
		System.out.println("My Name: " + tofael.name);
		System.out.println(tofael.age);
		System.out.println(tofael.myApartmentRent);
		System.out.println(tofael.myYearlySalary);
		System.out.println(tofael.myBankBalance);
		System.out.println(tofael.myHeight);
		System.out.println(tofael.myGrade);
		System.out.println(tofael.sex);
		System.out.println(tofael.usCitizen);
		System.out.println(tofael.name + tofael.age);
		System.out.println("My Name: " + tofael.name + ", My Age: " + tofael.age);
		System.out.println("My Name: " + tofael.name + "\nMy Age: " + tofael.age); // we can call all variables here, but I didn't do it here
		
	}
}
