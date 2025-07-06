package practice1;

import java.util.Scanner;

public class test52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 2; i < n; i++) {
			boolean isprimer = true;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					isprimer = false;
				}
			}
			if (isprimer == true) {
				System.out.print(i + " ");
			}
		}

	}

}
