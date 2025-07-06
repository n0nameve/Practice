package practice2;

import java.util.Scanner;

public class function9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(abs(a));
	}
	public static  int abs(int x) {
		return Math.abs(x);
	}
}
