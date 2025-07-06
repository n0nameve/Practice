package practice2;

import java.util.Scanner;

public class function8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		System.out.println(area(a));
	}
	public static double area(double r) {
		return r*r*Math.PI;
	}
}
