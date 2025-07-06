package practice1;

import java.util.Scanner;

public class test54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int max = 0, min = m * n;
		int a = Math.min(m, n);
		for (int i = 1; i <= a; i++) {
			if (m % i == 0 && n % i == 0) {
				if (i > max) {
					max = i;
				}
			}
		}
		System.out.println(max);
		for (int i = 1; i <= m * n; i++) {
			if (i % m == 0 && i % n == 0) {
				if (min > i) {
					min = i;
				}
			}
		}
		System.out.println(min);
	}

}
