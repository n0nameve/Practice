package practice1;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("year：");
		int year = scanner.nextInt();
		System.out.println("month：");
		int month = scanner.nextInt();
		System.out.println("day：");
		int day = scanner.nextInt();

		if (year > 0 && month >= 1 && month <= 12 && day > 0 && day <= 31) {
			if (month == 2 && day == 29) {
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					System.out.print(year + "/" + month + "/" + day);
				} else {
					System.out.println("error");
				}

			} else if (day == 31) {
				if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10|| month == 12) {
					System.out.print(year + "/" + month + "/" + day);
				}else {
					System.out.println("error");
				}			
			} else if (day == 30) {
				if(month == 4 || month == 6 || month == 9 || month == 11) {
					System.out.print(year + "/" + month + "/" + day);
				}else {
				System.out.println("error");
				}
			}else {
				System.out.print(year + "/" + month + "/" + day);
			}		
		}else {
			System.out.println("error");
		}
		
	}

}
