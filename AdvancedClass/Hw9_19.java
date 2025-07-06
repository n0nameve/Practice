package AdvancedClass;

public class Hw9_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data stu = new Data("Annie",85,92);
		stu.show();
	}

	static class Data{
		private String name;
		private Test score;
		
		class Test{
			int english,math;
			
			public Test(int eng,int m) {
				english=eng;
				math=m;
			}
			
		}

		public Data(String name,int engScore,int mScore) {
			this.name=name;
			this.score=new Test(engScore,mScore);
		}
		
		public double avg() {
			double avg = (score.english+score.math)/2.0;
			return avg;
		}
		
		public void show() {
		    System.out.println("學生姓名：" + name);
		    System.out.println("英文成績：" + score.english);
		    System.out.println("數學成績：" + score.math);
		    System.out.println("平均成績：" + avg());
		}
	}
}
