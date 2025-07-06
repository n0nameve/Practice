package practice2;

public class function23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rsum(3));
	}
	public static int rsum(int n) {
		int sum,tol=0;
		for(int i=2;i<=n;i++) {
			sum=(i-1)*i;
			tol+=sum;
		}
	
		return tol;
	}
}
