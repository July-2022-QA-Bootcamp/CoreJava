package lec08_02_java_variables_declared;

public class MyInfoTest {

	public static void main(String[] args) {
		MyInfo info1 = new MyInfo(); // Constructor Initialized
		info1.name = "Mohammad Sharkar"; // Variables initialized
		info1.age = 127;
		info1.myApartmentRent = 32445;
		info1.myYearlySalary = 376482364;
		info1.myBankBalance = 7658736472686l;
		info1.myHeight = 1.679f;
		info1.myGrade = 3.67568346;
		info1.sex = 'M';
		info1.usCitizen = false;		
		info1.myInfo(); // method initialized
		
		System.out.println("\n---------------------------------------\n");
		MyInfo info2 = new MyInfo();
		info2.name = "Angelina J"; // Variables initialized
		info2.age = 12;
		info2.myApartmentRent = 30005;
		info2.myYearlySalary = 476482364;
		info2.myBankBalance = 2658736472686l;
		info2.myHeight = 1.979f;
		info2.myGrade = 3.97568346;
		info2.sex = 'F';
		info2.usCitizen = true;		
		info2.myInfo(); // method initialized
		
	}

}
