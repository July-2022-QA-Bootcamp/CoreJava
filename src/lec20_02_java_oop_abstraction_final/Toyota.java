package lec20_02_java_oop_abstraction_final;

public class Toyota extends ElectricCar implements Car{
	public static void totyotaInfo() {
		System.out.println("This method is from Toyota class");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		System.out.println("start method from Car Interface");
		
	}

	@Override
	public String stop() {
		String m = "stop method from Car Interface";
		System.out.println(m);
		return m;
	}

	@Override
	public void brake() {
		System.out.println("brake method from Car Interface");
		
	}
	
	
}
