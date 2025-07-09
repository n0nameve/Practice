package HashMapandHashSet;

import java.util.HashMap;
import java.util.Map.Entry;

public class UniqueWordFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="apple banana apple orange";
		String[] data=str.split(" ");
		HashMap<String, Integer> finder=new HashMap<>();
		for(int i=0;i<data.length;i++) {
			finder.put(data[i], finder.getOrDefault(data[i], 0)+1);
		}
		for(Entry<String, Integer> entry:finder.entrySet()) {
			if(entry.getValue()==1){
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
	}

}
