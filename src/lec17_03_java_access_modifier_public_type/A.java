package lec17_03_java_access_modifier_public_type;

public class A {
	public String info1 = "This variable is coming from class A which is public";
	
	public A () {
		System.out.println("This Constructor is coming from class A which is public");
	}
	
	public void a() {
		System.out.println("This method is coming from class A which is public");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- public type modifier content can be accessed inside the same class ----------\n");
		A a = new A(); // constructor will be initialized here
		System.out.println(a.info1); // variable here
		a.a(); // method here
		
		System.out.println("\n---------- public type modifier content of Parent class [C] from same package can be accessed in non-sub/child class (Here A)  ----------");
		C c = new C();
		c.cMethod();
		
	}

}
