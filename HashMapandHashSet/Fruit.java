package HashMapandHashSet;

import java.util.HashMap;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> fruits=new HashMap<>();
		fruits.put("apple", "蘋果");
		fruits.put("banana", "香蕉");
		fruits.put("grape", "葡萄");
		
		for(String key:fruits.keySet()) {
			System.out.println(key+"="+fruits.get(key));
		}

	}

}
