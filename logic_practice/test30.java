package practice1;

import java.util.Scanner;

public class test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] a = text.split("");
		System.out.print(a[0].toUpperCase());
		for (int i = 1; i < a.length; i++) {
			System.out.print(a[i].toLowerCase());
		}
	}

}
