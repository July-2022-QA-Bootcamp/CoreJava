package lec18_02_java_oop_use_of_super_in_child_class;

public class MountSinai {
	// variables declared
	public String location;
	public int bonus;
	
	// We created this 2 variables to use in child class to call by super keyword
	public boolean inNewYork;
	public float rating;

	// default constructor
	public MountSinai() {
		System.out.println("This is a default constructor from MountSinai Class");
	}

	// parameterized constructor
	public MountSinai(String location, int bonus) {
		this.location = location;
		this.bonus = bonus;
		System.out.println("Location: " + location + " and Yearly Bonus: " + bonus + "%");
	}

	// void type method
	public void msInfo() {
		System.out.println("This is a void type method from MountSinai Class");
	}

	// parameterized method
	public void mountSinaiInfo(String location, int bonus) {
		this.location = location;
		this.bonus = bonus;
		System.out.println("Location: " + location + " and Yearly Bonus: " + bonus + "%");
	}

}
