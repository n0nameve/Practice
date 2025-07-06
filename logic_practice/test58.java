package practice1;

import java.util.Scanner;

public class test58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
        int hour = scanner.nextInt();
        if(hour>0&&hour<=60) {
        	System.out.println(75*hour);
        }else if(hour>=61&&hour<=75) {
        	System.out.println(60*75+(hour-60)*75*1.25);
        }else {
        	System.out.println(60*75+15*75*1.25+(hour-75)*75*1.75);
        }
	}

}
