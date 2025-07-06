package ClassExtends;

class Caa{
	private int num;
	
	public Caa(int n) {
		num=n;
	}
	
	public int get() {
		return num;
	}
}

class Cbb extends Caa{
	
	public Cbb() {
		super(2);
	}
	
	public void show() {
		System.out.println("num="+get());
	}
	
}

public class Hw10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbb bb=new Cbb();
		bb.show();
	}

}
