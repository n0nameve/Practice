package HashMapandHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class LibraryBorrowSystem {

	public static void queryUserBooks(HashMap<String, HashSet<String>> list,String name) {
		if(list.containsKey(name)) {
			System.out.println(name+":"+list.get(name));
		}else {
			System.out.println("無此人");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, HashSet<String>> list = new HashMap<>();
		HashSet<String> book = new HashSet<String>();
		HashSet<String> book1 = new HashSet<String>();
		HashSet<String> book2 = new HashSet<String>();

		book.add("Harry Potter");
		book.add("Java Basics");
		list.put("Alice", book);

		book1.add("Data Structures");
		book1.add("Harry Potter");
		list.put("Bob", book1);

		book2.add("Machine Learning");
		list.put("Charlie", book2);

		for (Entry<String, HashSet<String>> l : list.entrySet()) {
			System.out.println(l.getKey() + ":" + l.getValue());
		}
		System.out.println("-----------------");
		
		queryUserBooks(list, "Alice");
		queryUserBooks(list, "Andrew");
	}

}
