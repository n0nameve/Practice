package Exception;

import java.util.Scanner;

class BankAccount {
    private int balance = 1000;
    
    public int getbalance() {
    	return balance;
    }
    
    public void withdraw(int amount) throws InsufficientFundsException {
       if(amount>balance) {
    	   throw new InsufficientFundsException("金額超過餘額");
       }else {
    	   System.out.println("剩餘："+(balance-amount));
       }
    }
}

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}

public class ExceptionPractice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入金額：");
		int num = sc.nextInt();
		BankAccount bank=new BankAccount();
		
		try {
			bank.withdraw(num);
		}catch(InsufficientFundsException e) {
			System.out.println("錯誤：" + e.getMessage());
		}
	}

}
