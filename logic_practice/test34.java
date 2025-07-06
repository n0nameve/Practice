package practice1;

import java.util.Scanner;

public class test34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		// int n = scanner.nextInt();
		String data = scanner.nextLine();
		String[] a = data.split(" ");
		for(int i=0;i<a.length-1;i++) {
			for(int k=0;k<a.length-1-i;k++) {
				if(a[k+1].length()>a[k].length()) {
					String temp="";
					temp=a[k+1];
					a[k+1]=a[k];
					a[k]=temp;
					
				}
			}
		}
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
