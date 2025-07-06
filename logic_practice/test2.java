package practice1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= n ; i++) {
			if(i % 3 == 0 && i % 7 == 0) {
				sum += i ;			
			}		
		}
		System.out.println(sum);
	}

}
