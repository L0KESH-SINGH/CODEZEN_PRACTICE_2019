package HASHMAPS;
import java.util.* ;

public class pair_sum_in_array {
	
	public static void pairSum(int[] arr, int num){
		HashSet<Integer> h = new HashSet<>() ;
		Arrays.sort(arr);
//		int[] ans = new int[arr.length] ;
//		int j =0 ; 
		for(int i=0 ; i<arr.length ; i++)
		{
			if(!(h.contains(arr[i]))) {
			h.add(arr[i]) ;
//			ans[j] = arr[i] ;
//			j++ ;
			}
		}
		
		for(int i=0 ; i<arr.length ; i++)
		{
			int val = num - arr[i] ;
			if(h.contains(val))
			{
				System.out.println(Math.min(val, arr[i])+" "+Math.max(val, arr[i]));
				h.remove(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 1 ,3, 6, 2, 5, 4, 3, 2, 4 } ;
		pairSum(arr, 7);
	}

}
