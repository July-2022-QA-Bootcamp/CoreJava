package lec10_01_java_casting;

public class MyInfo {	
	public String name; // variables declared
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance; 
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;
	
	// default Constructor declared
	public MyInfo() {
		System.out.println("My Information is below: ");
	}
	
	// Parameterized constructor	declared
	public MyInfo(String name, byte age, short myApartmentRent, int myYearlySalary, long myBankBalance, float myHeight,
			double myGrade, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.myApartmentRent = myApartmentRent;
		this.myYearlySalary = myYearlySalary;
		this.myBankBalance = myBankBalance;
		this.myHeight = myHeight;
		this.myGrade = myGrade;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
		
	}












	
}
