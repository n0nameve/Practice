package practice;

class CCircle2{
	private static double pi=3.14;
	private double radius;
	
	public CCircle2(double r) {
		radius=r;
	}
	
	public void show() {
		System.out.println("area="+pi*radius*radius);
	}
}

public class app9_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle2 cir[];
		cir=new CCircle2[6];
		
		for(int i=0;i<cir.length;i++) {
			cir[i] = new CCircle2(i);
			cir[i].show();
		}
		
	}

}
