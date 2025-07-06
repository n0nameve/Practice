package practice2;

import java.util.Scanner;

public class function6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (even(a)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean even(int n) {
		return n % 2 == 0;
	}
}
