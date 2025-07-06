package AbstractInterface;

import java.util.ArrayList;

abstract class Payment{
	protected String user;
	abstract void pay(int amount);	
}

class CreditCardPayment extends Payment{
	
	public CreditCardPayment(String user) {
		this.user=user;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(user+"信用卡付款"+amount+"元");
	}
}

class LinePay extends Payment{
	
	public LinePay(String user) {
		this.user=user;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(user+"LinePay付款"+amount+"元");
	}
}

public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Payment> pay=new ArrayList<>();
		pay.add(new CreditCardPayment("小明"));
		pay.add(new LinePay("小美"));
		
		for(Payment p:pay) {
			p.pay(100);
		}
		
		
	}

}
