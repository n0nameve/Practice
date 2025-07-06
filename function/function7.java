package practice2;

import java.util.Scanner;

public class function7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++) {
			if(i%9==0) {
				if(even(i)) {
					System.out.println(i);
				}
			}
		}
	}

	public static boolean even(int n) {
		return n % 2 == 0;
	}
}
