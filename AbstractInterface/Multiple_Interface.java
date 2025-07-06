package AbstractInterface;

interface Eater{
	void eat();
}

interface Sleeper{
	void sleep();
}

class Human implements Eater,Sleeper{
	
	@Override
	public void eat() {
		System.out.println("吃");
	}
	
	@Override
	public void sleep() {
		System.out.println("睡");
	}
}

public class Multiple_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h=new Human();
		h.eat();
		h.sleep();
	}

}
