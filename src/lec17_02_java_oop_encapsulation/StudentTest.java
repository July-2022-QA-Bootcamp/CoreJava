package lec17_02_java_oop_encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Alex J"); // we put argument in the parameterized method 
		student.setStId(2188458);
		student.setSex('M');
		student.setFulltimeSt(true);
		student.setGrade(3.563f);
		
		System.out.println("Student Name: " + student.getStName() + ", \nID: " + student.getStId() + ", \nSex: "
				+ student.getSex() + ", \nFull Time student? : " + student.isFulltimeSt() + " \nGrade: " + student.getGrade());		
		

	}

}
