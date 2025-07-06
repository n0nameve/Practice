package practice2;

import java.util.Scanner;

public class function5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		double temp = fahrenheit(a);
		System.out.println(temp);
	}

	public static double fahrenheit(double c) {
		double temp = (9.0 / 5) * c + 32;
		return temp;
	}

}
