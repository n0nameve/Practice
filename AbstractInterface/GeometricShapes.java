package AbstractInterface;

import java.util.ArrayList;

abstract class Shape{
	abstract double getArea();
	abstract double getPerimeter();
}

class Triangle extends Shape{
	double a,b,c;
	
	public Triangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	@Override
	public String toString() {
		return "三角形：";
	}
	
	@Override
	public double getArea() {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	@Override
	public double getPerimeter() {
		return a+b+c;
	}
}

class Square extends Shape{
	double r;
	
	public Square(double r) {
		this.r=r;
	}
	
	@Override
	public String toString() {
		return "正方形：";
	}
	
	@Override
	public double getArea() {
		return r*r;
	}
	
	@Override
	public double getPerimeter() {
		return r*4;
	}
}

public class GeometricShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Shape> shapes=new ArrayList<>();
		shapes.add(new Triangle(3, 4, 5));
		shapes.add(new Square(5));
		
		for(Shape s:shapes) {
			System.out.println(s);
			System.out.println("面積："+s.getArea());
			System.out.println("周長："+s.getPerimeter());
		}
	}

}
