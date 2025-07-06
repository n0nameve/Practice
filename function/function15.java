package practice2;

public class function15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {75,29,10,38,45,16};
		System.out.println(sum(a));

	}

	public static int sum(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return max*min;
	}
}
