package Recursion;

public class Print_subset_of_an_Array {
	
	public static void printSubsets(int arr[] , int[] option , int si)
	{
		if(si==arr.length)
		{
			for(int i=0 ; i<option.length ; i++)
			{
				System.out.print(option[i]+" ");
			}
			System.out.println();
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
		printSubsets(arr,option,si+1);
		printSubsets(arr,temp , si+1);
	}
	
	public static void printSubsets(int input[]) {
		
		int [] option = new int[0] ;
		
		printSubsets(input , option , 0 ) ;

	}

	public static void main(String[] args) {
		
		int [] arr = {1,2,3} ;
		printSubsets(arr);

	}

}
