package practice1;

import java.util.Scanner;

public class test60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		double a, b, tol;
		a = hour * 30 + minute * 0.5;
		b = minute * 6;
		tol = a - b;
		if (tol < 0) {
			if (tol > -180) {
				tol = -tol;
				System.out.println(tol);
			} else if (tol < -180 && tol >= -360) {
				tol = -tol;
				System.out.println(360 - tol);
			}
		} else if (tol > 0) {
			if (tol <= 180) {
				System.out.println(tol);
			} else if (tol > 180 && tol <= 360) {
				System.out.println(360 - tol);
			}

		}

	}

}
