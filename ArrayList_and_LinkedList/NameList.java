package ArrayList_and_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class NameList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Amy");
		nameList.add("Bob");
		nameList.add("Cindy");
		System.out.println(nameList);
		System.out.println("--------------");
		nameList.add(1,"David");
		nameList.remove("Bob");
		System.out.println(nameList);
		System.out.println("--------------");
		LinkedList<String> linelist=new LinkedList<String>();
		linelist.add("Amy");
		linelist.add("Bob");
		linelist.add("Cindy");
		System.out.println(linelist);
		System.out.println("--------------");
		linelist.removeFirst();
		linelist.addLast("Amy");
		System.out.println(linelist);
	}

}
