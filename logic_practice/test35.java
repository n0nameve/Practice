package practice1;

import java.util.Scanner;

public class test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		if (m == 1) {
			if (n <= 100) {
				System.out.println(n * 2.5);
			} else if (n >= 101 && n <= 300) {
				System.out.println(n * 3.3);
			} else {
				System.out.println(n * 4.2);
			}
		}

		if (m == 2) {
			System.out.println(150 + n * 1.9);
		}

		if (m == 3) {
			if (n >= 0 && n <= 300) {
				System.out.println(n * 6);
			} else {
				System.out.println(n * 6.8);
			}
		}
	}

}
