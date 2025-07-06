package practice2;

public class function17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,4,8},{2,9,5},{6,3}};
		int[][] b = pow(a);
		for(int i =0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static int[][] pow(int arr[][]) {
		//int tol = new int[i][j];
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j]*=arr[i][j];
			}
		}
		return arr;
	}
}
