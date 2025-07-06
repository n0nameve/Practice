package practice1;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year > 0) {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("true");
			}else if(year % 400 == 0) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}else {
			System.out.println("error");
		}
		
		
	}

}
