package practice1;

import java.util.Scanner;

public class test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		String n = scanner.nextLine();
		String[] a=n.split(" ");
		for(int k=a.length-1;k>=0;k--) {
			System.out.print(a[k]+" ");
			
		}
			
	}

}
