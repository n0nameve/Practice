package practice2;

public class function19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(50));
	}

	public static long fib(int n) {
		if (n <= 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
