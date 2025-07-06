package practice2;

public class function14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{75,29,100},{38,45,16}};
		System.out.println(max(a));
	}
	public static int max(int arr[][]) {
		int max=arr[0][0];
		for(int k=0;k<arr.length;k++) {
			for(int i =0;i<arr[k].length;i++) {
				if(arr[k][i]>max) {
					max=arr[k][i];
				}
			}
		}
		
		return max;
	}
}
