package practice1;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int number = scanner.nextInt();
		int num=0;
		for(int i =1;i<number;i++) {
			if(number%i==0) {
				num+=i;
			}
			
		}
		if(num==number) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
