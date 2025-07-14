package exception;

import java.util.Scanner;

class PasswordCheck{
	public PasswordCheck(String str) throws WeakPasswordException {
		if(str.length()<6) {
			throw new WeakPasswordException("長度至少6字元");
		}
		boolean hasUpper = false;
	    boolean hasLower = false;
	    boolean hasDigit = false;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				hasUpper=true;
			}
			if(Character.isLowerCase(ch)) {
				hasLower=true;	
			}
			if(Character.isDigit(ch)) {
				hasDigit=true;
			}
		}
		if(!hasUpper) {
			throw new WeakPasswordException("至少一個大寫英文字母");
		}
		if(!hasLower) {
			throw new WeakPasswordException("至少一個小寫英文字母");
		}
		if(!hasDigit) {
			throw new WeakPasswordException("至少一個數字");
		}
	}
}

class WeakPasswordException extends Exception{
	public WeakPasswordException(String msg) {
		super(msg);
	}
}

public class ExceptionPractice11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		PasswordCheck passwd;
		System.out.println("輸入要設定的密碼：");
		String str=sc.nextLine();
		try {
			passwd=new PasswordCheck(str);
			System.out.println(str+"設定成功");
		}catch(WeakPasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
