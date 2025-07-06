package practice1;

import java.util.Scanner;

public class test41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.print("A");
		} else if (score >= 80 && score <= 89) {
			System.out.print("B");
		} else if (score >= 70 && score <= 79) {
			System.out.print("C");
		} else if (score >= 60 && score <= 69) {
			System.out.print("D");
		} else if (score <= 59) {
			System.out.print("E");
		}

	}

}
