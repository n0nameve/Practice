package Exception;

import java.util.Scanner;

class Bank {
	String id;
	String passwd;
	int balance = 2000;

	public Bank(String id, String passwd) {
		this.id = id;
		this.passwd = passwd;
	}

	public void account(String account, String password) throws NumberFormatException {
		if (this.id.equals(account) && this.passwd.equals(password)) {
			System.out.println("登入成功");
		} else {
			throw new NumberFormatException("使用者輸入格式錯誤");
		}
	}

	public void choice(int num) throws ArrayIndexOutOfBoundsException {
		if (num < 1 || num > 2) {
			throw new ArrayIndexOutOfBoundsException("輸入選項錯誤");
		}
	}

	public void withdraw(int amount) throws InsufficientFundsException {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("剩餘：" + (balance));
		} else {
			throw new InsufficientFundsException("餘額不足");
		}
	}
}

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}

public class ExceptionPractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank("Alice", "123456");

		Scanner sc = new Scanner(System.in);
		System.out.println("帳號：");
		String id = sc.nextLine();
		System.out.println("密碼：");
		String passwd = sc.nextLine();
		try {
			b.account(id, passwd);

			while (true) {
				System.out.println("1.提款 2.離開");
				System.out.println("請輸入選項：");
				try {
					int num = sc.nextInt();
					b.choice(num);
					switch (num) {
					case 1:

						try {
							System.out.println("輸入金額：");
							int c = sc.nextInt();
							b.withdraw(c);

						} catch (InsufficientFundsException e) {
							System.out.println(e.getMessage());

						}
						break;
					case 2:
						System.out.println("Thank You");
						return;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
				}
			}

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
