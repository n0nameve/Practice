package practice1;

import java.util.Scanner;

public class test59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n >= 1000) {
			System.out.println(n * 0.8);
		} else {
			System.out.println(n);
		}
	}

}
