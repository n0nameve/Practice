package practice2;

public class function16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{2,4,6},{1,3,5},{8,9}};
		double[] b =avg(a);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	}
	public static double[] avg(int arr[][]){
		
		double[] avg =new double[arr.length];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			avg[i]=(double)sum/arr[i].length;
		}
		return avg;
	}
}
