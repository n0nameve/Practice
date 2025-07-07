package ArrayList_and_LinkedList;

import java.util.LinkedList;

public class reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list=new LinkedList<>();
		LinkedList<String> list1=new LinkedList<>();
		list.add("A"); list.add("B"); list.add("C");
		list.add("D");list.add("E");
		//System.out.println(list);
		for(int i=list.size()-1;i>=0;i--) {
			list1.add(list.get(i));  
		}
		System.out.println(list1);
	}

}
