package practice1;

import java.util.Scanner;

public class test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		if (month > 0 && month <= 12) {
			if (month >= 1 && month <= 3) {
				System.out.println("春天");
			} else if (month >= 4 && month <= 6) {
				System.out.println("夏天");
			} else if (month >= 7 && month <= 9) {
				System.out.println("秋天");
			} else {
				System.out.println("冬天");
			}
		} else {
			System.out.println("error");
		}

	}

}
