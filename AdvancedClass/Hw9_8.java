package AdvancedClass;

class CWin{
	static int cnt=0;
	String color;
	int width,height;
	public CWin(String str, int w, int h) {
		color=str;
		width=w;
		height=h;
	}
	
	public CWin() {
		color="Red";
		width=2;
		height=2;
		count();
	}
	
	public static void count() {
		cnt++;
	}
	
	public static void setZero() {
		cnt=0;
	}
	
	public static void setValue(int n) {
		cnt=n;
	}
	
	public static void show() {
		System.out.println(cnt);
		//System.out.println(color+" "+width+" "+height);
	}
	
	public void show1() {
		System.out.println(color+" "+width+" "+height);
	}
}

public class Hw9_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin a = new CWin();
		CWin b = new CWin();
		CWin c = new CWin();
		CWin.show();
		
		CWin.setZero();
		CWin.show();
		
		CWin.setValue(100);
		CWin.show();

		CWin info = new CWin();
		info.show1();
		CWin info1 = new CWin("Blue",10,20);
		info1.show1();
	}

}
