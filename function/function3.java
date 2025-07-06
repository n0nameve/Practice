package practice2;

import java.util.Scanner;

public class function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int tol = cub(a);
		System.out.println(tol);
	}
	
	public static int cub(int x) {
		int tol = (int)Math.pow(x, 3);
		return tol;
	}
}
