package practice1;

import java.util.Scanner;

public class test51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int n = scanner.nextInt(); 
		int num1=0,num2=0;
		for(int i =1;i<=n;i++) {
			num1+=i;
			num2+=2*i;
		}
		System.out.println(num1+num2);
	}

}
