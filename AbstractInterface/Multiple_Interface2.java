package AbstractInterface;

abstract class PhoneName{
	abstract String phoneName();
}

interface Connectable{
	void connect();
}

interface SmartDevice extends Connectable{
	void operate();
}

class Phone extends PhoneName implements SmartDevice{
	String name;
	public Phone(String name) {
		this.name=name;
	}
	
	@Override
	public String phoneName() {
		return name;
	}
	
	@Override
	public void connect(){
		System.out.println(name+"連接");
	}
	
	@Override
	public void operate(){
		System.out.println(name+"操作");
	}
}

public class Multiple_Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p=new Phone("iPhone");
		p.connect();
		p.operate();
	}

}
