package exception;

import java.util.Scanner;

class InvalidTemperatureException extends Exception {
	public InvalidTemperatureException(String msg) {
		super(msg);
	}
}

public class ExceptionPractice09 {
	
	public static void setTemperature(double t) throws InvalidTemperatureException {
		if(t>100 || t<-100) {
			throw new InvalidTemperatureException("溫度超出合理範圍（-100 ~ 100）");
		}else {
			System.out.println("溫度："+t+" 設定成功");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入溫度：");
		Double num=sc.nextDouble();
		try {
			setTemperature(num);
		} catch (InvalidTemperatureException e) {
			System.out.println("錯誤：" + e.getMessage());
		}
		

	}

}
