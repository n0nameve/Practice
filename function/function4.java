package practice2;

import java.util.Scanner;

public class function4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int num = addto(a);
		System.out.println(num);
	}
	public static int addto(int n) {
		int num =0;
		for(int i =1;i<=n;i++) {
			num+=i;
		}
		return num;
	}
}
