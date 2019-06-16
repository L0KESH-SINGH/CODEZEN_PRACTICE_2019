package Recursion;

import java.util.Scanner;

public class connected_1s {
	
	public static int[] a = { 0,1,1,-1,-1,0,-1,1} ;
	public static int[] b = { 1,0,1,-1,0,-1,1,-1} ;	
	
	public static int getMaxOnes(int[][] inputMatrix, int i, int j) {

		if (i >= inputMatrix.length || i < 0 || j < 0 || j >= inputMatrix[i].length || inputMatrix[i][j] == 0) {
			return 0;
		}
		int max = 1 ;
		inputMatrix[i][j] = 0;
		for (int p = 0; p < 8; p++) {
			max += getMaxOnes(inputMatrix, i + a[p], j + b[p]);
		}
		return max;

	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		int n = s.nextInt() ;
		int m = s.nextInt() ;
		int arr[][] = new int[n][m] ;
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<m ; j++)
			{
				arr[i][j] = s.nextInt() ;
			}
		}
		int bigmax=Integer.MIN_VALUE ;
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<m ; j++)
			{
				if(arr[i][j]==1)
				{
					int temp = getMaxOnes(arr, i, j);
					bigmax = Math.max(bigmax, temp) ;
				}
			}
		}
		System.out.println(bigmax);
	}

}
