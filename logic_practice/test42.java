package practice1;

import java.util.Scanner;

public class test42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in); 
         int base = scanner.nextInt(); 
         int exp = scanner.nextInt(); 
         int sum=1;
         for(int i=1;i<=exp;i++) {
        	 sum*=base;
         }
         System.out.println(sum);
	}

}
