package practice1;

public class random_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = new char [1];
		int [] b = new int [9];
		a[0] = (char) ('A' + (int)(Math.random() * 26));
		b[0] = (int)(Math.random()*2)+1;
		for(int i = 1; i < b.length ; i++) {
			b[i] = (int)(Math.random()*10);
		}
		System.out.print(a[0]);
		for(int i = 0 ; i < b.length ; i++) {
			System.out.print(b[i]);
		}
		
	}

}
