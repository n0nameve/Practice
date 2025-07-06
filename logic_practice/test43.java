package practice1;

import java.util.Scanner;

public class test43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int second = scanner.nextInt();
		int s,m,h;
		s=second%60;
		m=second/60;
		if(m>=60) {
			h=m/60;
			m%=60;
		}else {
			h=0;
		}
		System.out.print(h+"時"+m+"分"+s+"秒");
	}

}
