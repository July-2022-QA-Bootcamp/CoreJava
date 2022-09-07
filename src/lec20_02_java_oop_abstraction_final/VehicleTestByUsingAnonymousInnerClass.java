package lec20_02_java_oop_abstraction_final;

public class VehicleTestByUsingAnonymousInnerClass {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota();
		Toyota.totyotaInfo();
		toyota.price();
		toyota.start();
		toyota.stop();
		toyota.brake();
		Toyota.battery();
		toyota.honk();

		System.out.println("\n--------------------- Interface Car ------------------------\n");
		// Interview question: what’s the other way to instantiate a interface with out implementing a class
		Car car = new Car() { // Instantiated by anonymous inner class Car, no need of concrete class
			
			@Override
			public String stop() {
				String m = "stop method";
				System.out.println(m);
				return m;
			}
			
			@Override
			public void start() {
				System.out.println("start method");
				
			}
			
			@Override
			public void brake() {
				System.out.println("brake method");
				
			}
		};		
		car.start();
		car.stop();
		car.brake();
		car.honk();
		Car.gear();

		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		ElectricCar electricCar = new ElectricCar() { // Instantiated by anonymous inner class ElectricCar
			
			@Override
			public void price() {
				System.out.println("price method");
				
			}
		};
		electricCar.price();
		ElectricCar.battery();
	}

}
