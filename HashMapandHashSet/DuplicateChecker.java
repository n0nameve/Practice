package hashmap_practice;

import java.util.HashSet;

public class DuplicateChecker {
	

	public static void hasDuplicate(String[] arr) {

		boolean check=false;
		HashSet<String> list = new HashSet<>();
		for (String s : arr) {
			if (!list.add(s)) {
				check=true;
				
			}
		}
		if(check) {
			System.out.println("有重複");
		}else {
			System.out.println("沒重複");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"cat", "dog", "cat"};
        String[] arr2 = {"cat", "dog", "bird"};
        String[] arr3 = {"cat", "dog", "bird", "bird"};
        String[] arr4 = {"cat", "dog", "bird", "lion"};
        
        hasDuplicate(arr1);
        hasDuplicate(arr2);
        hasDuplicate(arr3);
        hasDuplicate(arr4);
	
	}

}
