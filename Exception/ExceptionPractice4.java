package Exception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class ExceptionPractice4 {

	public static void setAge(int age) throws InvalidAgeException {
		if (age < 0 || age > 150) {
			throw new InvalidAgeException("年齡無效：不能為負數或超過150歲");
		} else {
			System.out.println("年齡設定成功：" + age);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入年齡：");
		int age = sc.nextInt();
		
		try {
			setAge(age);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
