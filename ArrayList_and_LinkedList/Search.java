package ArrayList_and_LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> score=new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		score.add("75");
		score.add("60");
		score.add("90");
		score.add("80");
		score.add("70");
		
		System.out.println(score);
		
		int sum=0,max=0,min=Integer.parseInt(score.getFirst());
		for(String s:score) {
			int data=Integer.parseInt(s);
			sum+=data;
			max = Math.max(max, data);
			min = Math.min(min, data);
		}
		System.out.println("總和："+sum+" 平均值："+sum/score.size());
		System.out.println("最大值："+max+" 最小值："+min);
		System.out.println("--------------");
		System.out.println("輸入分數查詢索引位置：");
		String num=sc.nextLine();
		if(score.contains(num)) {
			System.out.println(score.indexOf(num));
		}else {
			System.out.println("無此分數");
		}	

	}

}
