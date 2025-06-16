package practice;

class Caaa 
{
	private int value;
	
	public Caaa() {
		value=10;//第八行
		System.out.println("value="+value);
	}
	
	public Caaa(int i) {
		value=i;
		System.out.println("value="+value);
	}
}

public class Hw9_3{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);

	}

}
