package HashMapandHashSet;

import java.util.HashSet;

public class RemoveRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruit= {"apple","banana","apple","grape","banana"};
		HashSet<String> set=new HashSet<>();
		
		for(String f:fruit) {
			set.add(f);
		}

		for(String s:set) {
			System.out.println(s);
		}
	}

}
