package AbstractInterface;

import java.util.ArrayList;

interface Payable{
	void pay(int amount);
}

class CreditCard implements Payable{
	public void pay(int amount) {
		System.out.println("信用卡付款"+amount);
	}
}

class ApplePay implements Payable{
	public void pay(int amount) {
		System.out.println("ApplePay付款"+amount);
	}
}

public class Interface_PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Payable> pay=new ArrayList<>();
		pay.add(new CreditCard());
		pay.add(new ApplePay());
		
		for(Payable p:pay) {
			p.pay(1000);
		}
	}

}
