package AbstractInterface;

interface Flyable{
	void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("鳥會飛");
	}
}

class Airplane implements Flyable {
	public void fly() {
		System.out.println("飛機會飛");
	}
}

public class Interface_flyable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird b=new Bird();
		Airplane a=new Airplane();
		b.fly();
		a.fly();
	}

}
