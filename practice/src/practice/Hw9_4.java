package practice;

class CBox{
	private int length;
	private int width;
	private int height;
	
	public CBox(int l, int w, int h) {
		length=l;
		width=w;
		height=h;
	}
	
	public void show() {
		System.out.println("length="+length);
		System.out.println("width="+width);
		System.out.println("height="+height);
	}
	
}

public class Hw9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box1 = new CBox(10,4,5);
		box1.show();
	}

}
