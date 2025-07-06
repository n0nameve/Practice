package practice2;

public class function12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {75,29,38,45,16};
		System.out.println(checkmin(arr));
	}
	public static int checkmin(int arr[]) {
		int min = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
}
