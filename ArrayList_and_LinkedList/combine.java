package ArrayList_and_LinkedList;

import java.util.ArrayList;

public class combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> listA=new ArrayList<>();
		ArrayList<String> listB=new ArrayList<>();
		ArrayList<String> listC=new ArrayList<>();
		listA.add("apple"); listA.add("banana"); listA.add("cherry"); listA.add("date");
		listB.add("banana"); listB.add("date"); listB.add("fig"); listB.add("grape");
		for(String b:listB) {
			if(listA.contains(b)) {
				listA.remove(b);
			}
			listC.add(b);
		}
		for(String a:listA) {
			listC.add(a);
		}
		System.out.println(listC);
	}

}
