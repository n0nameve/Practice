package practice1;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] data = new int[9];
		int temp=0;
		for (int i=0;i<9;i++) { 
			data[i] =scanner.nextInt(); 
		}
		for(int i=0;i<data.length-1;i++) {
			for(int k =0;k<data.length-1-i;k++) {
				if(data[k]>data[k+1]) {
					temp=data[k];
					data[k]=data[k+1];
					data[k+1]=temp;
				}
				
			}
			//System.out.println(data[i]);		
		}
		for (int i=0;i<9;i++) { 
			System.out.println(data[i]); 
		}
		
	}

}
