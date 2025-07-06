package AbstractInterface;

import java.util.ArrayList;

abstract class Animal{
	String name;
	public abstract void speak();
}

class Dog extends Animal{
	
	@Override
	public void speak() {
		System.out.println("汪汪");
	}
}

class Cat extends Animal{
	
	@Override
	public void speak() {
		System.out.println("喵喵");
	}
}

class Parrot extends Animal{
	
	@Override
	public void speak() {
		System.out.println("你好！");
	}
}

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animal=new ArrayList<>();
		animal.add(new Dog());
		animal.add(new Cat());
		animal.add(new Parrot());
		
		for(Animal a:animal) {
			a.speak();
		}
	}

}
