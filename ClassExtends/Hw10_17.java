package ClassExtends;

class Car{
	protected String owner;
	protected String id;
	
	public Car(String own,String s) {
		owner=own;
		id=s;
	}
	
	public void CRectangle(String own,String s) {
		owner=own;
		id=s;
	}
	
	final void show() {
		System.out.println("車主姓名："+owner);
		System.out.println("車牌號碼："+id);
	}
}

class CColor extends Car{
	String color;
	
	public CColor(String own,String s,String color) {
		super(own,s);
		this.color=color;
	}
	
	
	public void show1() {
		super.show();
		System.out.println("車身顏色："+color);
	}
}

public class Hw10_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CColor mycar=new CColor("Riaan","A1-2345","Black");
		mycar.show1();
	}

}
