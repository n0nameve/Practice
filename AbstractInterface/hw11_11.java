package AbstractInterface;

interface Data{
	public void showData();
}

interface test{
	public void showScore();
	public double calcu();
}

class CStu implements Data,test{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	
	public CStu(String id,String name,int mid,int finl,int common) {
		this.id=id;
		this.name=name;
		this.mid=mid;
		this.finl=finl;
		this.common=common;
	}
	
	@Override
	public void showScore() {
		System.out.println("其中考："+mid);
		System.out.println("其末考："+finl);
		System.out.println("平時成績："+common);	
	}
	@Override
	public double calcu() {
		double cal;
		cal=mid*0.3+finl*0.3+common*0.4;
		return cal;
	}
	@Override
	public void showData() {
		System.out.println("學號："+id+" 姓名："+name);
		
	}
	
	public void show() {
		showData();
		showScore();
		System.out.println("學期成績："+calcu());
	}
}

public class hw11_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CStu stu=new CStu("940001","Fiona",90,92,85);
		stu.show();
	}

}
