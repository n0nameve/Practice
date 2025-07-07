package ArrayList_and_LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

class number{
	ArrayList<Integer> original;
	ArrayList<Integer> indexList;
	ArrayList<Integer> valueList;
	public number(int count) {
		original=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<count;i++) {
			System.out.print("請輸第"+(i+1)+"個數字：");
			int num=sc.nextInt();
			original.add(num);
			
		}
		indexList=new ArrayList<>(original);
		valueList=new ArrayList<>(original);
	}
	
	
	public void deleteEvenIndex() {
		for(int i=indexList.size()-1;i>=0;i--) {
			if(i%2==0) {
				indexList.remove(i);
			}
		}
		System.out.println("刪除偶數位置："+indexList);
	}
	public void deleteEvenNum() {
		for(int i=valueList.size()-1;i>=0;i--) {
			if(valueList.get(i)%2==0) {
				valueList.remove(i);
			}
		}
		System.out.println("刪除偶數數字："+valueList);
	}
}

public class delete_evenodds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入你將輸入幾個數字：");
		int num=sc.nextInt();
		number number=new number(num);
		number.deleteEvenNum();
		number.deleteEvenIndex();

	}

}
