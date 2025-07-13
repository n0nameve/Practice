package Exception;

import java.util.Scanner;

public class ExceptionPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入被除數 a：");
        int a = sc.nextInt();
        System.out.print("請輸入除數 b：");
        int b = sc.nextInt();
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("錯誤：除數不能為 0！");
		}
	}

}
