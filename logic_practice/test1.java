package practice1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		if(A % 2 == 0 || A % 3 == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
