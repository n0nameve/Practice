package practice1;

import java.util.Scanner;

public class test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int u = scanner.nextInt();
		int l = scanner.nextInt();
		int h = scanner.nextInt();
		System.out.printf("%.1f", (double) (u + l) * h / 2);
	}

}
