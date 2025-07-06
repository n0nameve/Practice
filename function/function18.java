package practice2;

public class function18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {75,29,10,38,45,17};
		show(arr);
		System.out.println(avg(arr));
	}
	public static double avg(int arr[]) {
		int sum=0;
		double avg = 0.0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			avg = (double)sum/arr.length;
		}
		return avg;
	}
	
	public static void show(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
