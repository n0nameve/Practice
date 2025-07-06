package practice1;

import java.util.Scanner;

public class test53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x =n,j=n;
		int num=0,count=0;
		
		while(j>0) {
			j/=10;
			count++;
		}
		
		while(x>0) {
			int a = (int) Math.pow(x%10, count);
			num+=a;
			x/=10;
		}
		System.out.println(num);
		if(n == num) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
