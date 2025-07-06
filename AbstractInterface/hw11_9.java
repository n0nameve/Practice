package AbstractInterface;

interface Math2 {

	public void show();
	public abstract void add(int a, int b);
	public abstract void sub(int a, int b);
	public abstract void mul(int a, int b);
	public abstract void div(int a, int b);
}

interface AdvancedMath{
	public void mod(int a,int b);
	public void fac(int a);
	public void pow(int a,int b);
}

class Compute1 implements Math2,AdvancedMath{
	int ans;
	public void add(int a, int b) {
		ans=a+b;
	}

	public void sub(int a, int b) {
		ans=a-b;
	}

	public void mul(int a, int b) {
		ans=a*b;
	}

	public void div(int a, int b) {
		ans=a/b;
	}
	
	public void mod(int a, int b) {
		ans=a%b;
	}
	
	public void fac(int a) {
		int sum = 1;
		for(int i=1;i<=a;i++) {
			sum*=i;
		}
		ans=sum;
	}
	
	public void pow(int a, int b) {
		ans=(int)Math.pow(a, b);
	}
	
	public void show() {
		System.out.println("ans="+ans);
	}

}

public class hw11_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compute1 cmp = new Compute1();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14, 5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}

}
