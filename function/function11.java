package practice2;

public class function11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,6,9,12,47,55,10};
		System.out.println(check(arr));

	}
	public static int check(int arr[]) {
		int count =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		return count;
	}

}
