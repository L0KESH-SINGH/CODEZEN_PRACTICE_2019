package Recursion;

public class return_subset_ofan_array {
	
	public static int[][] subsets(int arr[] , int si)
	{
		if(si == arr.length)
		{
			int ans[][] = new int[1][0] ;
			return ans ;
		}
		int n = arr[si] ;
		int myans[][] = subsets(arr,si+1) ;
		int ans[][] = new int[myans.length*2][] ;
		int i= 0 ;
		for( ; i<myans.length ; i++)
		{
			ans[i] = new int[myans[i].length] ;
			for(int j=0 ; j<myans[i].length ; j++)
			{
				ans[i][j] = myans[i][j] ;
			}
		}
		int t = i ;
		//System.out.println(i);
		for(int k = 0 ; k<myans.length ; k++)
		{
			ans[i] = new int[myans[k].length+1] ;
			for(int j=1 ; j<myans[k].length + 1 ; j++)
			{
				ans[i][j] = myans[k][j-1] ;
			}
			i++ ;
		}
		for(int k = t ; k<ans.length ; k++)
		{
			ans[k][0] = n ;
		}
		return ans ;
	}
	
	public static int[][] subsets(int input[]) {
		
		return subsets(input,0) ;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,20,12} ;
		int ans[][] = subsets(arr) ;
		for(int i=0 ; i<ans.length ; i++)
		{
			for(int j=0 ; j<ans[i].length ; j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
