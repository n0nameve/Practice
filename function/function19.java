package practice2;

public class function19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(50));
	}

	public static long fib(int n) {
		long[] a = new long[n];
		if(n<=2&&n>0) {
			return 1;
		}
		a[0] = 1;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2];

		}
		return a[n - 1];
	}
}
