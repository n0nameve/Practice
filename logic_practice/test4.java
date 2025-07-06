package practice1;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("year：");
		int Y = scanner.nextInt();
		System.out.println("month：");
		int M = scanner.nextInt();
		
		if(Y > 0 && M >= 1 && M <= 12) {
		    if (M == 2) {
		        if ((Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0)) {
		            System.out.println("29");
		        } else {
		            System.out.println("28");
		        }
		    } else if (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) {
		        System.out.println("31");
		    } else {
		        System.out.println("30");
		    }
		} else {
		    System.out.println("error");
		}
	}

}
