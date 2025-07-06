package practice1;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		if (number > 1) {
			for (int i = 2; i <= number; i++) {
				boolean isprime = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isprime = false;
					}
				}
				if (isprime == true) {
					System.out.println(i);
				}
			}

		}

	}

}
