package practice2;

public class function13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {19,29,38,45,16};
		System.out.println(min(a));
	}
	public static int min(int arr[]) {
		int min=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr[min]) {
				min=i;
			
			}
		}
		return min;
		
	}

}
