package exception;

import java.util.Scanner;

class Product{
	int price;
	int amount;
	int balance;
	public Product(int price,int amount) throws IllegalArgumentException{
		this.price=price;
		this.amount=amount;
		if(price<0||amount<0) {
			throw new IllegalArgumentException("商品價格或數量不得為負數");
		}
	}
	
	public void tol(int balance) throws InsufficientFundsException {
		this.balance=balance;
		if(balance>=(price*amount)) {
			System.out.println("交易成功，找零：" + (balance - (price * amount)));
		}else {
			throw new InsufficientFundsException("總金額超出餘額");
		}
	}
	
}

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}



public class ExceptionPractice10 {

	public static void main(String[] args) {
	
		Product p = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("輸入單價：");
		int price=sc.nextInt();
		System.out.println("輸入數量：");
		int amount=sc.nextInt();
		try {
			p=new Product(price, amount);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.println("輸入餘額：");
		int balance=sc.nextInt();
		try {
			p.tol(balance);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
