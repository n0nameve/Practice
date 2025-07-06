package practice1;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
        String n = scanner.nextLine();
        String[] a=n.split("");
        String b = "";
        for(int i=a.length-1;i>=0;i--) {
        	b+=a[i];
        }
        System.out.print(b);
        
	}

}
