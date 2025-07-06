package Instanceof_Practice;

import java.util.ArrayList;

abstract class Animal1{
	abstract void makeSound();
}

class Dog1 extends Animal1{
	@Override
	public void makeSound() {
		System.out.println("汪！");
	}
	
	public void barkLoudly() {
		System.out.println("大聲汪汪！");
	}
}

class Cat1 extends Animal1{
	@Override
	public void makeSound() {
		System.out.println("喵～");
	}
}

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Animal1> sound=new ArrayList<>();
		sound.add(new Dog1());
		sound.add(new Cat1());
		
		for(Animal1 a:sound) {
			a.makeSound();
			if(a instanceof Dog1) {
				Dog1 d=(Dog1)a;
				d.barkLoudly();
			}
		}
	}

}
