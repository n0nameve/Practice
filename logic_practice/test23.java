package practice1;

import java.util.Scanner;

public class test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (b + c <= a || a + c <= b || a + b <= c) {
			System.out.println("非三角形");
		} else {
			if (a == b && b == c) {
				System.out.println("正三角形");
			} else if (a == b || b == c || a == c) {
				System.out.println("等腰三角形");
			} else {
				System.out.println("一般三角形");
			}
		}
	}

}
