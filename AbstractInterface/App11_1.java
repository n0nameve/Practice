package AbstractInterface;

abstract class CShape{
	protected String color;
	
	public CShape(String str) {
		color=str;
	}
	
	public void setColor(String str) {
		color=str;
	}
	public abstract void show();
}

class CRectangle extends CShape{
	protected int width,height;
	public CRectangle(String color, int w,int h) {
		super(color);
		width=w;
		height=h;
	}
	
	public void show() {
		System.out.print("color="+color+", ");
		System.out.println("area= "+width*height);
	}
}

class CCircle extends CShape{
	protected double radius;
	public CCircle(String color,double r) {
		super(color);
		radius=r;
	}
	public void show() {
		System.out.print("color="+color+", ");
		System.out.println("area= "+3.14*radius*radius);
	}
}

public class App11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CRectangle rect=new CRectangle("Yellow",5, 10);
		rect.show();
		
		CCircle cir=new CCircle("Green",2.0);
		cir.show();
	}

}
