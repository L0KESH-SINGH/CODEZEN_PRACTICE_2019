package dynamic_programming;

public class Longest_incresing_subSequence {
	
	public static int LIS(int arr[]) {
		int lis[] = new int[arr.length] ;
		for(int i =0 ; i<arr.length ;i++)
		{
			lis[i] = 1 ;
		}
		int max = -1 ;
		for(int i=1 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<i ; j++)
			{
				if(arr[i]>arr[j] && lis[i]<lis[j]+1) {
					lis[i] = lis[j]+1 ;
					if(lis[i]>max) {
						max = lis[i] ;
					}
				}
			}
		}
		return max ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,22,9,33,21,50,41,60};
		System.out.println(LIS(arr));

	}

}
