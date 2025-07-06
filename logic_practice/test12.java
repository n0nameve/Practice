package practice1;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double a,num1=0,num2=0;
		for (int k = 1; k <= (n * 2) - 1; k += 2) {
			a = 4.0 / k;
			if(k%4==1) {
				num1+=a;
			}else {
				num2+=a;
			}
		}
		System.out.printf("%.5f",num1-num2);

	}

}
