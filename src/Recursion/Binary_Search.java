package Recursion;

public class Binary_Search {
	
	public static int helper(int arr[] , int x , int si , int ei)
	{
		if(si>ei)
		{
			return -1 ;
		}
		int mid  = (ei+si)/2 ;
		if(x==arr[mid])
		{
			return mid ;
		}
		else if(x>arr[mid])
		{
			return helper(arr, x, mid+1, ei) ;
		}
		else 
		{
			return helper(arr, x, si, mid-1) ;
		}
	}
	
	public static int binarySearch(int input[], int element) {
		// Write your code here
		return helper(input , element , 0 , input.length-1) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6} ;
		int x  = 3 ;
		System.out.println(binarySearch(arr, x));

	}

}
