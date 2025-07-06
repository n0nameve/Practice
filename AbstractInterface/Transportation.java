package AbstractInterface;

abstract class Vehicle {
	public abstract void start();

	public abstract void stop();

}

class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("car start");
	}

	@Override
	public void stop() {
		System.out.println("car stop");
	}
}

class Bike extends Vehicle {

	@Override
	public void start() {
		System.out.println("bike start");
	}

	@Override
	public void stop() {
		System.out.println("bike stop");
	}
}

public class Transportation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car();
		Bike b=new Bike();
		c.start();
		c.stop();
		b.start();
		b.stop();
	}

}
