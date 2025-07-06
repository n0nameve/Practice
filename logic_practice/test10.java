package practice1;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int degree = scanner.nextInt();
		if (degree >= 31) {
			System.out.println("hot");
		} else if (degree >= 26 && degree <= 30) {
			System.out.println("warm");
		} else if (degree >= 21 && degree <= 25) {
			System.out.println("cool");
		} else if (degree <= 20) {
			System.out.println("cold");
		}
	}

}
