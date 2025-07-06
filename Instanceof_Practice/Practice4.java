package Instanceof_Practice;

import java.util.ArrayList;

interface Vehicle{
	void move();
}

class Car implements Vehicle{
	@Override
	public void move() {
		System.out.println("汽車行駛中");
	}
}

class Bicycle implements Vehicle{
	@Override
	public void move() {
		System.out.println("腳踏車騎乘中");
	}
}

class Airplane implements Vehicle{
	@Override
	public void move() {
		System.out.println("飛機起飛中");
	}
	
	public void fly() {
		System.out.println("飛機飛行中");
	}
}

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Vehicle> tran=new ArrayList<>();
		tran.add(new Car());
		tran.add(new Bicycle());
		tran.add(new Airplane());
		
		for(Vehicle v:tran) {
			v.move();
			if(v instanceof Airplane) {
				Airplane a=(Airplane) v;
				a.fly();
			}
		}
	}

}
