package Exception;

import java.util.Scanner;

public class ExceptionPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入輸入一個字串：");
		String a=sc.nextLine();
		try {
			System.out.println(Integer.parseInt(a));
		}catch(NumberFormatException e) {
			System.out.println("錯誤：輸入格式不正確，請輸入整數");
		}
	}

}
