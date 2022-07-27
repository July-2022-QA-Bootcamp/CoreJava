package lec08_01_java_variables_initialized;

public class MyInfo {
	// variables initialized
	public String name = "Mohammad Sharkar";
	public byte age = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 1176573468;
	public long myBankBalance = 6374365687965847658l; 
	public float myHeight = 1.73767f;
	public double myGrade = 3.76485687348767;
	public char sex = 'M';
	public boolean usCitizen = false;
	
	// Constructor Declared
	public MyInfo() {
		System.out.println("My Information is below: ");
	}
	
	// method implemented
	public void myInfo() {
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}
	
}
