package AbstractInterface;

interface Data1{
	public void best();
	public void failed();
}

interface Test extends Data1{
	public void showData();
	public double average();
}

class CStu1 implements Test{
	protected String name;
	protected int math;
	protected int english;
	
	public CStu1(String name,int math,int english) {
		this.name=name;
		this.math=math;
		this.english=english;
	}
	
	@Override
	public void best() {
		// TODO Auto-generated method stub
		if(math==english) {
			System.out.println(name+"的數學跟英文一樣");
		}else {
			if(math>english) {
				System.out.println(name+"的數學比較好");
			}else {
				System.out.println(name+"的英文比較好");
			}
			
		}
		
	}
	@Override
	public void failed() {
		// TODO Auto-generated method stub
		if(math<60) {
			System.out.println(name+"的數學被當了");
		}
		if(english<60) {
			System.out.println(name+"的英文被當了");
		}
	}
	@Override
	public void showData() {
		System.out.println("姓名："+name);
		System.out.println("數學成績："+math);
		System.out.println("英文成績："+english);
	}
	@Override
	public double average() {
		double avg;
		avg=(math+english)/2.0;
		return avg;
	}
	
	public void show() {
		showData();
		System.out.println("平均成績："+average());
		best();
		failed();
	}
}

public class hw11_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CStu1 stu=new CStu1("Judy",40,40);
		stu.show();
	}

}
