package practice1;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 1;
		for (int i = 1; i <= n; i += 2) {
			sum *= i;
		}
		System.out.println(sum);
	}

}
