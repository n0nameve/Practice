package practice1;

import java.util.Scanner;

public class test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入一段文字：");
		String text = scanner.nextLine();
		System.out.print("請輸入要重複的次數：");
		int b = scanner.nextInt();
		String[] a = text.split("");
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print(a[i]);
			}
		}
	}

}
