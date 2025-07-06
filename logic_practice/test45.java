package practice1;

import java.util.Scanner;

public class test45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int homework = scanner.nextInt(); 
		int middleExam = scanner.nextInt(); 
		int finalExam = scanner.nextInt();
		if(finalExam>=70||(homework>=80&&middleExam>=60)) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}

	}

}
