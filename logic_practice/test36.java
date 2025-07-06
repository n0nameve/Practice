package practice1;

import java.util.Scanner;

public class test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int m = scanner.nextInt(); 
		int n = scanner.nextInt(); 

		if(m==1) {
			System.out.println(110*n);
		}
		
		if(m==2) {
			System.out.println(220*n);
		}
		
		if(m==3) {
			System.out.println(180*n);
		}
	}

}
