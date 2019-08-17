package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class find_triplet_equalto_k {
	
	public static void findtriplet(int arr[] , int n , int k)
	{
		Arrays.sort(arr);
		for( int i = 0 ; i< n-1 ; i++) {
		int l = i+1 , r = n-1 ;
		while(l<r)
		{
			if(arr[i] + arr[l] + arr[r] == k )
			{
				System.out.println(true);
				return ;
			}
			else if(arr[i]+arr[l]+arr[r]<k)
			{
				l++ ;
			}
			else
				r-- ;
		}}
		System.out.println(false);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt() ;
		int k = s.nextInt() ;
//		int a = n ;
//		int b = k ;
//		a ^= b  ;							swap a and b
//		b ^= a ;
//		a ^= b ;
//		System.out.println(a + " "  + b);
		int arr[] = new int[n] ; 
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = s.nextInt() ;
		}
		findtriplet(arr, n , k);
	}

}
