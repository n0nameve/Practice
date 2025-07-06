package practice1;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		String[] a = text.split("#");
		for (int i = a.length; i > 0; i--) {
			if ((i - 1) == 0) {
				System.out.print(a[i - 1]);
			} else {
				System.out.print(a[i - 1] + "#");
			}
		}
	}

}
