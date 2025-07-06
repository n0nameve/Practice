package practice3;

public class class08 {

	public static void main(String[] args) {
		CTest1 ct = new CTest1();
		// TODO Auto-generated method stub
		ct.test(-4);
		ct.test(8);
		ct.test(0);
	}

}

class CTest1 {

	public void test(int a) {
		if (a == 0) {
			System.out.println("此數為0");
		} else if (a > 0) {
			System.out.println("此數為正數");
		} else {
			System.out.println("此數為負數");
		}

	}
}