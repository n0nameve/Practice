package practice1;

import java.util.Scanner;

public class test46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		String dateStr = scanner.next();
		String[] a=dateStr.split("/");
		String b="";
		switch(a[0]) {
		case "1":
			b="January";
			break;
		case "2":
			b="February";
			break;
		case "3":
			b="March";
			break;
		case "4":
			b="April";
			break;
		case "5":
			b="May";
			break;
		case "6":
			b="June";
			break;
		case "7":
			b="July";
			break;
		case "8":
			b="August";
			break;
		case "9":
			b="September";
			break;
		case "10":
			b="October";
			break;
		case "11":
			b="November";
			break;
		case "12":
			b="December";
			break;
		}
		System.out.println(b+" "+a[1]+","+a[2]);
	}

}
