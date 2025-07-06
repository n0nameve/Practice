package practice1;

import java.util.Scanner;

public class test57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		if (m < 2000) {
			System.out.print(m * 0.9);
		} else if (m >= 2000 && m < 3000) {
			System.out.print(m * 0.85);
		} else if (m >= 3000 && m < 5000) {
			System.out.print(m * 0.8);
		} else if (m >= 5000) {
			System.out.print(m * 0.7);
		}

	}

}
