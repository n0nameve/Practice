package exception;

import java.util.Scanner;

public class ExceptionPractice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入一串整數（以空格分隔）：");
		String a=sc.nextLine();
		String[] b=a.split(" ");
		for(int i=0;i<b.length;i++) {
			try {
				System.out.println("第 " + (i + 1) + " 個數字為：" + Integer.parseInt(b[i]));
			}catch(NumberFormatException e) {
				System.out.println("第 " + (i + 1) + " 項格式錯誤，無法轉換為整數：" + b[i]);
			}
			
		}

	}

}
