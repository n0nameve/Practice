package ClassExtends;

class CTriangle{
	protected int base;
	protected int height;
	
	protected CTriangle() {
		base=1;
		height=1;
	}
	
	protected void show() {
		System.out.println("base="+base+", height="+height);
	}
}

class CData1 extends CTriangle{
	
	protected CData1() {
		super();
	}
	
	protected CData1(int b,int h) {
		base=b;
		height=h;
	}
	
	protected void area() {
		super.show();
		System.out.println("area="+(base*height)/2.0);
	}
}

public class Hw10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CData1 obj=new CData1(3,8);
		CData1 obj2=new CData1();
		obj2.area();
		obj.area();
	}

}
