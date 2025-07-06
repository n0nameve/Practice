package practice1;

import java.util.Scanner;

public class test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int n = scanner.nextInt(); 
		int num=0;
		for(int i=1;i<=n;i+=2) {
			num+=i;
		}
		System.out.println(num);
	}

}
