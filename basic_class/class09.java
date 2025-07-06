package practice3;

public class class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCalculator obj = new CCalculator();
		obj.set_value(25, 3, 7);
		obj.show();
		System.out.println(obj.add());
		System.out.println(obj.sub());
		System.out.println(obj.mul());
		System.out.println(obj.avg());
	}

}

class CCalculator {
	int a, b, c;

	public void set_value(int x, int y, int z) {
		this.a = x;
		this.b = y;
		this.c = z;
	}

	public void show() {
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}

	public int add() {
		return a + b + c;
	}

	public int sub() {
		return a - b - c;
	}

	public int mul() {
		return a * b * c;
	}

	public double avg() {
		return (a + b + c) / 3.0;
	}

}