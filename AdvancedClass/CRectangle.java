package AdvancedClass;

public class CRectangle {
	
	int width,height;
	
	public CRectangle(int w,int h) {
		width = w;
		height=h;
	}
	
	public CRectangle() {
		this(10,8);
		System.out.println("constructor called");
		width=10;
		height=8;
	}
	
	public void show() {
		System.out.println(width+" "+height);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle c = new CRectangle();
		c.show();
	}

}
