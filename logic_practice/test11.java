package practice1;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = a * b;
		if (sum >= 100) {
			System.out.println(sum / 100);
		} else {
			System.out.println(sum);
		}

	}

}
