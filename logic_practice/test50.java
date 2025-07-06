package practice1;

import java.util.Scanner;

public class test50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int n = scanner.nextInt();
		int sum=0,num=0;
		for(int i=1;i<=n;i++) {
			sum=i*i;
			num+=sum;
		}
		System.out.println(num);

	}

}
