package Instanceof_Practice;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a=new Dog();
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Cat);
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Object);
	}

}
