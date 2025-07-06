package practice2;

public class function27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(circle(2));
		System.out.println(circle(2.3f));
		System.out.println(circle(2.3));
	}

	public static double circle(int r) {
		return 3.14*r*r;
	}

	public static double circle(float r) {
		return 3.14*r*r;
	}

	public static double circle(double r) {
		return 3.14*r*r;
	}
}
