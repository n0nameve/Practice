package practice1;

import java.util.Scanner;

public class test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		long sum;
		if(n<=0) {
			System.out.println("error");
			return;
		}
		a[0] = 1;
		if (n > 1) {
			a[1] = 1;
		}
		for (int i = 2; i < n; i++) {
			a[i] = a[i - 1] + a[i - 2];
			sum=a[i];
		}
		System.out.println(a[n - 1]);
	}

}
