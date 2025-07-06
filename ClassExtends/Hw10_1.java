package ClassExtends;

class Caaa{
	public int num1;
	public int num2;
	
	public Caaa() {
		num1=1;
		num2=1;
	}
	
	public Caaa(int a,int b) {
		num1=a;
		num2=b;
	}
}

class Cbbb extends Caaa{
	
	public Cbbb() {
		
	}
	
	public Cbbb(int a,int b) {
		super(a,b);
	}
	
	public void set_num(int a,int b){
		num1=a;
		num2=b;
	}
	
	public void show() {
		System.out.println(num1+","+num2);
	}
}

public class Hw10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb=new Cbbb(10, 7);
		Cbbb bb1=new Cbbb();
		bb1.show();
		bb.show();
		bb.set_num(5,10);
		bb.show();
		
	}

}
