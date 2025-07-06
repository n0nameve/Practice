package practice1;

import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		// String[] a = text.split(" ");
		int count = 0;
		for (int i = 0; i < text.length()-1; i++) {
			if (text.charAt(i) == text.charAt(i + 1)) {
				count++;
				i++;
			}

		}
		System.out.println(count);

	}

}
