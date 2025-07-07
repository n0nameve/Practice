package ArrayList_and_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class openfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		LinkedList<String> file=new LinkedList<>();
		String fileName;
		while(true) {
			System.out.println("1.新增檔案 2.刪除檔案 3.查詢 0.離開");
			System.out.println("輸入選項：");
			int num=sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1:
					System.out.println("輸入檔案名稱：");
					fileName=sc.nextLine();
					if(!file.contains(fileName)) {
						file.addFirst(fileName);
					}else {
						file.remove(fileName);
						file.addFirst(fileName);
					}
					break;
				case 2:
					System.out.println("輸入檔案名稱：");
					fileName=sc.nextLine();
					file.remove(fileName);
					break;
				case 3:
					for(String f:file) {
						System.out.print(f+" ");
					}
					System.out.println();
					break;
				case 0:
					return;
				default:
					System.out.println("請輸入正確選項");
					break;
			}
			
		}
		
	}

}
