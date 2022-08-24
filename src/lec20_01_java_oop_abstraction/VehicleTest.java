package lec20_01_java_oop_abstraction;

public class VehicleTest {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota();
		toyota.toyotaInfo();
		toyota.toyotaPrice();
		Toyota.countryOfOrigin(); // if a method is static, no need to create object, the class or Interface can directly call it.
		toyota.lightWeight();
		toyota.price();
		toyota.carName();
		toyota.rent();
		toyota.carryingGoods();
		toyota.carryingPassenger();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.autopilot();
		toyota.expensive();
		toyota.canFloat();
		toyota.battery();
		toyota.yearEstablished(); // it is giving us warning, because static method of Abstract class
		// yearEstablished() is a static method in Abstract class, Toyota class, (not object) can extends that Abstract class, 
		// so, Toyota itself can initialize that method, but in terms of Interface, it (here gear method) is not allowed for Toyota
		Toyota.yearEstablished();
		toyota.flyingFeature();
		toyota.honk(); // it can call the default type method of Interface
		toyota.honk1();
		// Toyota.gear();  // even not possible
		//toyota.gear(); // it is giving us red error, because static method of Abstract class
		 // gear () is a static method of an Interface, static method of Interface can't be call by object of a regular class
		System.out.println("Toyota manufactured in: " + toyota.yearOfManufacture);
		System.out.println(toyota.invented); // This got warning
		System.out.println(Toyota.invented); // as invented variable is static and Toyota implements Car, that's why no error
		
		// Cannot instantiate the type Car which is an Interface
		// an interface can't be instantiated, it needs the help of a concrete class, here Toyota is a concrete class, Because Toyota helps to implement the Car Interface
		// Interview question: why Interface can't instantiate? because implementation is not complete because of abstract methods present
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		Car car = new Toyota(); // because Toyota implements Car
		car.start();
		car.stop();
		car.brake();
		car.honk();
		car.honk1();
		// car.gear();
		Car.gear();
		// no need of object, Interface/class can directly call static methods, 
		// but static method in abstract class can be called by Regular class Toyota object (but got warning), Regular class can call directly
		car.rent();
		car.carryingPassenger();
		car.carryingGoods();
		System.out.println("The Car invented in: " + Car.invented);
	
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		// Cannot instantiate the type ElectricCar
		// an abstract class can't be instantiated, it needs the help of a concrete class, here Toyota is the concrete class
		// Interview question: why? because implementation is not complete because of some abstract methods present
		ElectricCar electricCar = new Toyota();
		electricCar.battery();
		electricCar.price();
		electricCar.carName();
		electricCar.yearEstablished(); // it get's warning because better to call by Class or Interface 
		ElectricCar.yearEstablished();
		electricCar.flyingFeature();
		electricCar.autopilot();
		electricCar.expensive();
		electricCar.canFloat();
		System.out.println("Electric Car name: " + electricCar.nameOfEleectricCar + ", and price: " + electricCar.costOfTesla);
		
		
		// CableCar cableCar = new Toyota(); // because Toyota doesn't implements CableCar
		// Same for Abstract class
		
		System.out.println("\n--------------------- Not Instantiating here: Drone, FlyingCar, Ferrari, HoverCar, Mercedes, Rocket, Taxi, Truck. But possible ------------------------\n");
	}

}
