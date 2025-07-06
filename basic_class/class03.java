package practice3;

public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cddd student = new Cddd();
		student.name = "Sandy";
		student.height = 165.5;
		student.weight = 58.2;
		double BMI = student.weight / Math.pow(student.height / 100, 2);
		System.out.println("姓名: " + student.name);
		System.out.println("身高: " + student.height + " 公分");
		System.out.println("體重: " + student.weight + " 公斤");
		System.out.printf("BMI: %.2f\n", BMI);
	}

}

class Cddd {
	String name;
	double height, weight;
}