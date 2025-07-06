package practice1;

import java.util.Scanner;

public class test56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		double sum1, sum2, tol;
		sum1 = Math.pow(x1 - x2, 2);
		sum2 = Math.pow(y1 - y2, 2);
		tol = Math.sqrt(sum1 + sum2);
		System.out.println(tol);

	}

}
