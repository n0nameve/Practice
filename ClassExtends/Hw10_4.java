package ClassExtends;

class CRectangle{
	private int length;
	private int width;
	
	public CRectangle() {
		length=2;
		width=2;
	}
	
	public CRectangle(int l,int w) {
		length=l;
		width=w;
	}
	
	public int getlength() {
		return length;
	}
	
	public int getwidth() {
		return width;
	}
	
	private void show() {
		System.out.print("length="+length);
		System.out.print(", width="+width);
	}
}

class CData extends CRectangle{
	
	public CData() {
		super();
	}
	
	public CData(int l,int w) {
		super(l,w);
	}
	
	public void area() {
		int l=getlength();
		int w=getwidth();
		
		System.out.println("面積："+l*w);
		System.out.println("長："+l);
		System.out.println("寬："+w);
		
	}
}

public class Hw10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CData obj1=new CData(3,8);
		CData obj2=new CData();
		obj1.area();
		obj2.area();
	}

}
