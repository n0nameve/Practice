package practice1;

import java.util.Scanner;

public class test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int binary = scanner.nextInt();
		int count = 0;
		int num = 0;
		while (binary > 0) {
			int a = binary % 10;
			num += a * Math.pow(2, count);
			binary /= 10;
			count++;

		}
		System.out.println(num);

	}

}
