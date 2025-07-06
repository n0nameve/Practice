package practice2;

public class function24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(triangle(6, 3));
		System.out.println(triangle(4.2f, 3.3f));
		
	}

	public static float triangle(int base, int height) {
		return (base * height) / 2.0f;
	}

	public static float triangle(float base, float height) {
		return (base * height) / 2.0f;
	}
}
