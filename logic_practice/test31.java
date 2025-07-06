package practice1;

import java.util.Scanner;

public class test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		if (text.length() == 0) {
			System.out.println("error");
			return;
		}
		System.out.print(Character.toUpperCase(text.charAt(0)));
		for (int i = 1; i < text.length(); i++) {
			if (Character.isLowerCase(text.charAt(i))) {
				System.out.print(Character.toUpperCase(text.charAt(i)));
			} else {
				System.out.print(Character.toLowerCase(text.charAt(i)));

			}
		}
	}

}
