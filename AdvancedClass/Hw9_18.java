package AdvancedClass;

public class Hw9_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle3 circle=new CCircle3(10.0) {
			public void show() {
				System.out.println(radius*radius*pi);
			}
		};
		circle.show();
	}
	
	static class CCircle3 {
		public double pi=3.14;
		public double radius;
		
		public CCircle3(double r) {
			radius=r;
		}
		
		public void show() {
			
		}
	}

}
