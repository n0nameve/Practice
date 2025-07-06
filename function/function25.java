package practice2;

public class function25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(8,2));
		System.out.println(max(1,5,9));
	}

	public static int max(int a, int b) {
		return Math.max(a, b);
	}

	public static int max(int a, int b, int c) {
		return Math.max(Math.max(a, b),c);
	}
}
