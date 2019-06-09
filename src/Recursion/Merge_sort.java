package Recursion;

public class Merge_sort {
	
	public static void mergeSort(int[] input){
		
	      int starti = 0 ;
			int endi = input.length -1 ;
			mergeSort(input , starti, endi);
			
		}
	  
	  public static void mergeSort(int[] input , int starti ,int endi)
		{
			if(starti>=endi)
			{
				return ;
			}
			int mid = (starti+endi)/2 ;
			mergeSort(input, starti, mid);
			mergeSort(input, mid+1, endi);
			merge(input, starti, endi);
		}
	  
	 public static void merge(int arr[], int l, int r)
		{
		 	int mid = (r+l)/2 ;
		 	int left[] = new int[mid-l+2] ;
		 	int right[] = new int[r-mid+1] ;
		 	
		 	int i =0 ;
		 	for( ; i<left.length-1; i++ )
	            left[i] = arr[l + i];
		 	
		 	left[i] = Integer.MAX_VALUE ;
		 	
		 	i = 0 ;
		 	 for (  ; i<right.length-1; i++)
		            right[i] = arr[mid + 1+ i];
		 	 
		 	right[i] = Integer.MAX_VALUE ;
		 	
		 	i = 0 ;
		 	int j = 0 ;
		 	int k = l ;

		 	while(k<=r)
		 	{
		 		if(left[i]<=right[j])
		 		{
		 			arr[k] = left[i] ;
		 			i++ ; //k++ ;
		 		}
		 		else
		 		{
		 			arr[k] = right[j] ;
		 			j++ ; //k++ ;
		 		}
		 		k++ ;
		 	}
		}

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,7,9,11,8,10,12} ;
		//int arr2[] = {2,4,6} ;
		merge(arr1, 4, arr1.length-1);
		for(int i=0 ; i<arr1.length ; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		

	}

}
