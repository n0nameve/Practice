package practice3;

public class class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox1 box = new CBox1();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		box.showAll();
	}

}

class CBox1 {
	int length, width, height;

	public int volume() {
		return length * width * height;
	}

	public int surfaceArea() {
		return length * width * 6;
	}

	public void showData() {
		System.out.println(length + " " + width + " " + height);
	}

	public void showAll() {
		showData();
		System.out.println(surfaceArea() + " " + volume());
	}

}