package ClassExtends;

class CRectangle1{
	protected int length;
	protected int width;
	
	protected CRectangle1(int l,int w) {
		length=l;
		width=w;
	}
	
	@Override
	public String toString() {
		int area=length*width;
		return "length="+length+", width="+width+", area="+area;
	}
	
	public String toString(int a,int b) {
		if(a>=b) {
			return super.toString();
		}else {
			return "Argument Error";
		}
	}
}

public class Hw10_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CRectangle1 rect=new CRectangle1(2, 6);
		System.out.println(rect);
		System.out.println(rect.toString(9,5));
		System.out.println(rect.toString(5,9));
	}	

}
