package practice1;

import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (a + b <= c || b + c <= a || a + c <= b) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

	}

}
