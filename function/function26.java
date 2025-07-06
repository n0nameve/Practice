package practice2;

public class function26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abs(-6));
		System.out.println(abs(-3.5f));
		System.out.println(abs(-2.12345));

		
	}

	public static int abs(int a) {
		return Math.abs(a);
	}

	public static float abs(float a) {
		return (float)Math.abs(a);
	}

	public static double abs(double a) {
		return (double)Math.abs(a);
	}
}
