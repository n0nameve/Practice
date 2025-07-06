package practice1;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] data = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.printf("請輸入第%d個數字\n", i + 1);
			data[i] = scanner.nextInt();
		}
		int max = data[0];
		for (int k = 0; k < 5; k++) {
			if (data[k] > max) {
				max = data[k];

			}
		}
		System.out.print("最大值：" + max);

	}

}
