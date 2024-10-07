package Interface;

public class Driver {

	public static void main(String[] args) {
		Car c1 = new ElectricCar();
		c1.start();
		c1.stop();
		c1.openGate();

	}

}
