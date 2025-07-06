package AdvancedClass;

class add{
	public static int add2n(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
}

public class Hw9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add.add2n(5));
		System.out.println(add.add2n(10));
	}

}
