package practice2;

import java.util.Scanner;

public class function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		kitty(a);
	}
	
	public static void kitty(int k) {
		for(int i=0;i<k;i++) {
			System.out.println("what's up");
		}
	}
}