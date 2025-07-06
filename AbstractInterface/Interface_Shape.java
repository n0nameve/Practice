package AbstractInterface;

import java.util.ArrayList;

interface Drawable{
	void draw();
}

class Circle implements Drawable{
	public void draw() {
		System.out.println("圓形");
	}
}

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("長方形");
	}
}

class Triangle1 implements Drawable{
	public void draw() {
		System.out.println("三角形");
	}
}

public class Interface_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Drawable> draw=new ArrayList<>();
		draw.add(new Circle());
		draw.add(new Rectangle());
		draw.add(new Triangle1());
		
		for(Drawable d:draw) {
			d.draw();
		}
	}

}
