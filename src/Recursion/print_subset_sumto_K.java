package Recursion;

public class print_subset_sumto_K {
	
	public static void printSubsets(int arr[] , int[] option , int si , int k)
	{
		if(si==arr.length)
		{
			int sum = 0 ;
			for(int i=0 ; i<option.length ; i++)
			{
				sum += option[i] ;
			}
			if(sum == k)
			{
				for(int i=0 ; i<option.length ; i++)
				{
					System.out.print(option[i]+" ");
				}
				System.out.println();
			}	
			return ;
		}
		int n = arr[si] ;
		int temp[] = new int[option.length+1] ;
		int i=0; 
		for( ; i<option.length ;i++)
		{
			temp[i] = option[i] ;
		}
		temp[i] = n ;
		printSubsets(arr,option,si+1 , k);
		printSubsets(arr,temp , si+1 , k);
	}
	public static void printSubsetsSumTok(int input[], int k) {
		
        int [] option = new int[0] ;
		
		printSubsets(input , option , 0 , k) ;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4} ;
		printSubsetsSumTok(arr, 4);

	}

}
