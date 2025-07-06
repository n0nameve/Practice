package AdvancedClass;

class CCircle{
	private static double pi=3.14;
	private double radius;
	
	public CCircle(double r) {
		radius=r;
	}
	
	public double getradius() {
		return radius;
	}
}

public class app9_9 {
	
	public static CCircle compare(CCircle c1, CCircle c2) {
		if(c1.getradius()>c2.getradius()) {
			return c1;
		}else {
			return c2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CCircle cir1=new CCircle(1.0);
		CCircle cir2=new CCircle(2.0);
		CCircle obj;
		
		obj=compare(cir1,cir2);
		if(cir1==obj) {
			System.out.println("radius of cir1 is larger");
		}else {
			System.out.println("radius of cir2 is larger");
		}
	}

}
