package practice3;

public class class07 {

	public static void main(String[] args) {
		CTest ct = new CTest();
		// TODO Auto-generated method stub
		ct.test(8);
		ct.test(3);
		ct.test(0);
	}

}

class CTest {

	public void test(int a) {
		if (a == 0) {
			System.out.println("此數為0");
		} else if (a % 2 == 0) {
			System.out.println("此數為偶數");
		} else {
			System.out.println("此數為奇數");
		}

	}
}