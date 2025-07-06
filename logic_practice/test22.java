package practice1;

import java.util.Scanner;

public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int a1 = a * a;
		int b1 = b * b;
		int c1 = c * c;
		if (a1 == b1 + c1 || b1 == a1 + c1 || c1 == a1 + b1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
