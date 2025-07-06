package Instanceof_Practice;

interface Flyable{}
class Bird implements Flyable{}
class Fish{}

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flyable Object=new Bird();
		System.out.println(Object instanceof Flyable);
		System.out.println(Object instanceof Bird);
		System.out.println(Object instanceof Fish);
		System.out.println(Object instanceof Object);
	
	}

}
