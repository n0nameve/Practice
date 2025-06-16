package practice;

class nth{
	public static long power(long x, long n) {
		long sum=1;
		for(long i=1;i<=n;i++) {
			sum*=x;
		}
		return sum;
	}
}

public class Hw9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result=nth.power(nth.power(2, 5), nth.power(3, 2));
		System.out.println(result);
	}

}
