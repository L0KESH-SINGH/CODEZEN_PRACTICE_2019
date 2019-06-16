package Recursion;

import java.util.Scanner;

public class coin_change {
	
	static int count = 0 ;
	
	public static int countWaysToMakeChange(int denominations[], int num , int sum , int si)
	{
		if(sum == num)
		{
			return 1 ;
		}
		if(sum>num)
		{
			return 0 ;
		}
		for(int i=si ; i<denominations.length ; i++ )
		{
			int x =countWaysToMakeChange(denominations, num, sum+denominations[i], i) ;
			if(x==1)
			{
				count++ ;
			}
		}
		return count-1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		int n = s.nextInt() ;
		int arr[] = new int[n] ;
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = s.nextInt() ;
		}
		int num = s.nextInt() ;
		System.out.println(countWaysToMakeChange(arr, num, 0, 0));
	}

}
