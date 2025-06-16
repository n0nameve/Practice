package practice;

class CCount {
	static int cnt=0;
	
	public CCount() {
		count();
	}
	
	public static void count() {
		cnt++;
	}
	
	public static void setValue(int n) {
		cnt = n;
	}
	
	public static void setZero() {
		cnt = 0;
	}
	
	public static void show() {
		System.out.println(cnt);
	}

}

public class Hw9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCount a = new CCount();
		CCount b = new CCount();
		CCount c = new CCount();
		CCount d = new CCount();
		
		CCount.show();
		
		CCount.setZero();
		CCount.show();
		
		CCount.setValue(100);
		CCount.show();
		
	}

}
