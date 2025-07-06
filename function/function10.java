package practice2;

import java.util.Scanner;

public class function10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(min(a,b));
	}
	public static int min(int a,int b) {
		return Math.min(a, b);
	}
}
