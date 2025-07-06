package ClassExtends;

class Ca{
	private int num;
	
	public Ca(int n) {
		num=n;
	}
	
	public int get() {
		return num;
	}
	
	public void display() {
		System.out.println("printed from ca class");
	}
}

class Cb extends Ca{
	
	public Cb() {
		super(2);
	}
	
	public void show() {
		System.out.println("num="+get());
	}
	
	@Override
	public void display() {
		System.out.println("printed from cb class");
	}
	
}

public class Hw10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cb bb=new Cb();
		bb.show();
		Ca bb1=new Cb();
		bb1.display();
	}

}
