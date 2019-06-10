package Recursion;

public class return_subsets_sum_toK {
	
	public static int[][] subsetsSumK(int [] arr , int si , int k) 
	{
		if(si==arr.length)
		{
			if(k == 0)
			{
				return new int[1][0] ;
			}
			else
				return new int[0][0] ;
		}
		
		int n = arr[si] ;
		
		int myans1[][] = subsetsSumK(arr, si+1 , k) ;
		int myans2[][] = subsetsSumK(arr, si+1 , k-n) ;
		
		int ans[][] = new int[myans1.length+myans2.length][] ;
		
		int i=0 ; 
		for( ; i<myans1.length ; i++)
		{
			ans[i] = myans1[i]  ;
		}
		for(int p = 0 ; p<myans2.length ; p++)
		{
			ans[i] = new int[myans2[p].length+1] ;
			ans[i][0] = n ;
			for(int j=0 ; j<myans2[p].length ; j++)
			{
				ans[i][j+1] = myans2[p][j] ;
			}
			i++ ;
		}
		return ans ;
	}
	
	public static int[][] subsetsSumK(int input[], int k) {
		
		return subsetsSumK(input , 0 , k) ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3} ;
		int ans[][] = subsetsSumK(arr, 3);
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
