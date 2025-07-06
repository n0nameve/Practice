package ClassExtends;

class CShape{
	
	public double area() {
		return 0.0;
	}
}

class CCircle extends CShape{
	double radius;
	public CCircle(double r) {
		radius=r;
	}
	@Override
	public double area() {
		return radius*radius*Math.PI;
	}
}

class CSquare extends CShape{
	double length;
	public CSquare(double l) {
		length=l;
	}
	@Override
	public double area() {
		return length*length;
	}
}

class Ctriangle extends CShape{
	double base,height;
	public Ctriangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	@Override
	public double area() {
		return (base*height)/2.0;
	}
}



public class Hw10_11 {
	
	public static double largest(CShape[] shapes) {
		double max=0;
		for(CShape s:shapes) {
			if(s.area()>max) {
				max=s.area();
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CShape a=new CCircle(3);
		CShape a1=new CCircle(2.8);
		System.out.printf("圓面積：%.2f,%.2f\n",a.area(),a1.area());
		
		CShape b=new CSquare(4);
		CShape b1=new CSquare(9.8);
		System.out.println("正方形面積："+b.area()+","+b1.area());
		
		CShape c=new Ctriangle(5, 10);
		CShape c1=new Ctriangle(5.9, 12.7);
		System.out.println("三角形面積："+c.area()+","+c1.area());
		
		CShape[] shapes= {a,a1,b,b1,c,c1};
		System.out.println("最大面積："+largest(shapes));
	}

}
