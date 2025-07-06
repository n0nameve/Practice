package practice1;
import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double sum = 1;
		int total = 1;
		for (int i = 0; i < n; i++) {
			sum *= 1.04;
		}
		total = (int) (15000 * sum);
		System.out.println(total);
	}

}
