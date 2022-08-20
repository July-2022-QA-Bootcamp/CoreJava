package lec18_02_java_oop_use_of_super_in_child_class;

public class Employee extends MountSinai {
	// variable declared
	public String empName;
	public int empId;
	public char sex;
	public boolean fullTimeEmp;

	// default constructor
	public Employee() {
		
		// we use super method to call the constructor of super (parent) class (always inside child class)
		// try to put the super method (after sysout of default constructor) and find the below outcome
		// Constructor call must be the first statement in a constructor of child class 
		// We can use only one super() method inside constructor
		// Either default or parameterized constructor can be called by super method from the super class,
		// That's why the below line in comment out
		// super(); // represents the default constructor of super/parent class
		super("bronx", 6);
		
		// super keyword is used to call (initialize) the methods of super (Parent) class
		super.msInfo();
		super.mountSinaiInfo("Staten Island", 8);
		
		// super keyword is used to call (initialize) the variables of super (Parent) class
		super.inNewYork = true;
		super.rating = 8.76f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);
		
		System.out.println("This is a default constructor from Employee class");
	}

	// parameterized constructor
	public Employee(String empName, int empId, char sex, boolean fullTimeEmp) {
		super("Brooklyn", 9);
		super.msInfo();
		super.mountSinaiInfo("Long Island", 13);
		super.inNewYork = false;
		super.rating = 8.32f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);		
		// inside parameterized constructor, line 18-21 is mandatory, even the global variables and parameters are same
		this.empName = empName;
		this.empId = empId;
		this.sex = sex;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
	}

	// void type or no return method or non parameterized method
	public void empInfo() {
		// we can't call constructor of super class inside a method of child class.
		// super();
		super.msInfo();
		super.mountSinaiInfo("TerryTown", 15);
		super.inNewYork = true;
		super.rating = 9.233f;
		System.out.println("This hospital is in NY? :" + inNewYork + "and the rating is: " + rating);
		
		System.out.println("This is a void type method from employee class");
	}
	
	// parameterized method
	public void employeeInfo(String empName, int empId, char sex, boolean fullTimeEmp) {
		// we can't call constructor of super class inside a method of child class.
		// super();
		super.msInfo();
		super.mountSinaiInfo("Nasau", 25);
		super.inNewYork = false;
		super.rating = 9.543f;
		System.out.println("This hospital is in NY? :" + inNewYork + "\nThe rating is: " + rating);
		
		// inside parameterized method, line 33-36 is not mandatory, if the global variables and parameters are same
		this.empName = empName;
		this.empId = empId;
		this.sex = sex;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
	}
	
	

}
