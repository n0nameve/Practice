package AdvancedClass;

class Namecard{
	
	private String name;
	private String address;
	private Phone data;

	class Phone{
		String company,cell;
		
		public Phone(String s1,String s2) {
			company=s1;
			cell=s2;
		}
	}
	
	public Namecard(String name,String address,String companyPhone,String cellPhone) {
		this.name=name;
		this.address=address;
		this.data=new Phone(companyPhone, cellPhone);
		
	}
	
	public void show() {
		
		System.out.println("好友姓名："+name);
		System.out.println("聯絡地址："+address);
		System.out.println("公司電話："+data.company);
		System.out.println("公司電話："+data.cell);
		
	}
}

public class Hw9_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Namecard first=new Namecard("Andy","123City","2345-6789","0911-336600");
		first.show();
	}

}


