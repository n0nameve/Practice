package practice3;

public class class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle1 cc = new CCircle1();
		System.out.println(cc.area(2)); 
		System.out.println(cc.area(2.2f)); 
		System.out.println(cc.area(2.2)); 
	}

}
class CCircle1{
	
	public double area(double r) {
		return r*r*(Math.PI);
	}
	
	public float area(float r) {
		return (float)(r*r*(Math.PI));
	}
	
	public double area(int r) {
		return r*r*(Math.PI);
	}
}