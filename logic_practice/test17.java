package practice1;

import java.util.Scanner;
import java.util.Spliterator;

public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		String text = scanner.next(); 
		String[] a = text.split("");
		String b ="",c="";
		for(int i=0;i<a.length/2;i++) {
			b+=a[i];
			System.out.print(a[i]);
		}
		System.out.println();
		for(int k=a.length-1;k>a.length/2;k--) {
			c+=a[k];
			System.out.print(a[k]);
		}
		System.out.println();
		if(b.equals(c)) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
	}

}
