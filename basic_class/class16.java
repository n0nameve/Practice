package practice3;

public class class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSphere cp = new CSphere();
		cp.setRadius();
		cp.setLocation();
		System.out.println(cp.surfaceArea());
		System.out.println(cp.volume());
		cp.showCenter();
	}

}

class CSphere {
	private int x, y, z, radius;

	public void setLocation() {
		x = 3;
		y = 4;
		z = 5;
	}

	public void setRadius() {
		radius = 1;
	}

	public double surfaceArea() {
		return 4 * (Math.PI) * radius * radius;
	}

	public double volume() {
		return (4 / 3.0) * (Math.PI) * (Math.pow(radius, 3));
	}

	public void showCenter() {
		System.out.println("(" + x + "," + y + "," + z + ")");
	}
}