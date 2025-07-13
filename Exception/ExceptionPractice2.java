package Exception;

import java.util.Scanner;

public class ExceptionPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a = {10, 20, 30};
		System.out.print("請輸入要查詢的索引（0~2）：");
		int index = sc.nextInt();
			try {
				System.out.println(a[index]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("錯誤：除數不能為 0");
			}
		}

}
