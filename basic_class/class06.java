package practice3;

public class class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir1 = new CCircle();
		cir1.radius = 3.0;
		cir1.show_periphery();
	}

}

class CCircle {
	double pi = 3.14, radius;

	public void show_periphery() {
		System.out.println("periphery=" + 2 * this.pi * this.radius);
	}
}