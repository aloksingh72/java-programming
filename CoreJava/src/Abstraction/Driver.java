package Abstraction;

public class Driver {

	public static void main(String[] args) {
		
		Vehicle v1 = new ElectricCar("Tesla",65834.64,72,420);
		v1.start();
		v1.drive();
		// static  mehtod accesed in class reference
		Vehicle.accelerate();
		v1.stop();
		System.out.println("=================");
		// for accesing the child content/ features we must do the downcasting
		Car c1 = (Car)v1;
		c1.openGate();
		c1.drift();
		System.out.println("=========");
		ElectricCar e1 = (ElectricCar)v1;
		e1.getDetails();
	

	}

}
