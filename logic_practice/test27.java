package practice1;

import java.util.Scanner;

public class test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int n = scanner.nextInt(); 
		int[] data = new int[n];
		int sum=0;
		//double avg = 0.0;
		for (int i=0; i<n; i++) {
			data[i] = scanner.nextInt();
			sum+=data[i];
			
		}
		//avg=sum/n;
		System.out.printf("sum：%d average:%f",sum,(double)sum/n);
	}

}
