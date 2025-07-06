package AdvancedClass;

class Student{
	String name;
	int[] scores;
	
	public void name(String name) {
		this.name=name;
	}
	
	public void score(int english, int math, int mandarin) {
		this.scores=new int[3];
		this.scores[0]=english;
		this.scores[1]=math;
		this.scores[2]=mandarin;
		
	}
	
	public double getAverage() {
		double sum = 0;
		for(int i=0;i<3;i++) {
			sum+=scores[i];
		}
		return sum/3.0;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println("英文成績："+scores[0]);
		System.out.println("數學成績："+scores[1]);
		System.out.println("國文成績："+scores[2]);
		System.out.println("平均成績："+getAverage());
	}
}

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student x=new Student();
		x.name="小明";
		x.score(90, 85, 92);
		x.printInfo();
	}

}
