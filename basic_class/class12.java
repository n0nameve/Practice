package practice3;

public class class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cwin cw = new Cwin();
		cw.setName("My Windows");
		cw.setWindows(8, 5, "andrew");
		cw.show();
		cw.setw(5);
		cw.setH(3);
		cw.show();
	}

}

class Cwin {
	int width, height;
	String name;

	void setw(int w) {
		this.width = w;
	}

	void setH(int h) {
		this.height = h;
	}

	void setName(String s) {
		this.name = s;
	}

	void setWindows(int w, int h, String s) {
		this.width = w;
		this.height = h;
		this.name = s;
	}

	public void show() {
		System.out.println("Name=" + name);
		System.out.println("W=" + width + ", H=" + height);
	}
}