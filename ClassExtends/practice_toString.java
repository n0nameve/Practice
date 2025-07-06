package ClassExtends;

import java.util.ArrayList;

class CBook{
	String title;
	int price;
	
	public CBook(String t,int p) {
		title=t;
		price=p;
	}
	
	@Override
	public String toString() {
		return "Title："+title+", Price："+price;
	}
	
	public String toString(int discount) {
		
		if(discount>0&&discount<100) {
			int zzz = price * discount / 100;
			return toString()+", After Discount："+zzz;
		}else {
			return "Invalid discount";
		}
	}
}

public class practice_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CBook book=new CBook("Java 入門", 500);
		System.out.println(book);
		System.out.println(book.toString(80));
		System.out.println(book.toString(150));
		System.out.println("----------------------");
		ArrayList<CBook> booklist=new ArrayList<>();
		booklist.add(new CBook("Java 入門", 500));
		booklist.add(new CBook("資料結構", 650));
		booklist.add(new CBook("演算法圖解", 720));
		booklist.add(new CBook("物件導向設計", 580));
		booklist.add(new CBook("設計模式", 820));
		
		for(CBook book1:booklist) {
			if(book1.price>600) {
				System.out.println(book1);
			}
		}
		
		
	}

}
