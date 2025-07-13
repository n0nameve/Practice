package HashMapandHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;

public class LibraryBorrowSystem_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, HashSet<String>> records = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=== 圖書借閱系統 ===");
			System.out.println("1. 新增借書紀錄");
			System.out.println("2. 查詢某使用者借過的書");
			System.out.println("3. 顯示所有借閱紀錄");
			System.out.println("4. 查詢借過某書的使用者");
			System.out.println("0. 離開系統");
			System.out.print("請選擇：");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("請輸入使用者名稱：");
				String name = sc.nextLine();
				System.out.print("請輸入書名：");
				String book = sc.nextLine();

				records.putIfAbsent(name, new HashSet<>());
				records.get(name).add(book);
				break;
			case 2:
				System.out.print("請輸入使用者名稱：");
				name = sc.nextLine();
				if (records.containsKey(name)) {
					System.out.println(name + ":" + records.get(name));
				} else {
					System.out.println("查無此人");
					continue;
				}
				break;
			case 3:
				for (Entry<String, HashSet<String>> l : records.entrySet()) {
					System.out.println(l.getKey() + ":" + l.getValue());
				}
				break;
			case 4:
				System.out.println("請輸入書名：");
				book = sc.nextLine();
				boolean found = false;
				for (String key : records.keySet()) {
					if (records.get(key).contains(book)) {
						System.out.println(key);
						found = true;
					}
				}

				if (!found) {
					System.out.println("無此書或此書無人借閱");
				}
				break;
			case 0:
				System.out.println("Thank you");
				return;
			default:
				System.out.println("請輸入正確選項");
			}
		}
	}

}
