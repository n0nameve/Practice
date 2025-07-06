package AdvancedClass;

class CCircle1{
	private static double pi=3.14;
	private double radius;
	
	public CCircle1(double r) {
		radius=r;
	}
	
	public static double compare(CCircle1 c[]) {
		double max=0.0;
		for(int i=0;i<c.length;i++) {
			if(c[i].radius>max) {
				max=c[i].radius;
			}	
		}
		return max;
	}
	
	public static double average(CCircle1 c[]) {
		double num = 0.0;
		for(int i=0;i<c.length;i++) {
			num+=c[i].radius;
		}
		return num/c.length;
	}
}

public class app9_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle1 cir[];
		cir=new CCircle1[3];
		cir[0]=new CCircle1(1.0);
		cir[1]=new CCircle1(4.0);
		cir[2]=new CCircle1(2.0);
		
		System.out.println("Largest radius = "+CCircle1.compare(cir));
		System.out.println("average = "+CCircle1.average(cir));
	}

}
