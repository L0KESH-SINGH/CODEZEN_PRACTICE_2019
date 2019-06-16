package Recursion;

import java.util.ArrayList;

public class break_numbers {
	
	public static void printCombination(int num , int sum , String ans , int si)
	{
	
		if(sum == num)
		{
			System.out.println(ans);
		}
		if(sum>num)
		{
			return ;
		}
		for(int i=si ; i<=num ; i++ )
		{
			si = i ;
			if(ans.length()==0)
			{
				printCombination(num, sum+i, ans+i, si);
			}
			else
				printCombination(num, sum+i, ans +" "+ i , si);
		}
		
	}

	public static void printCombination(int num){
	
		printCombination( num , 0 , "" , 1);
		
	}
	
	public static void main(String[] args) {
		//System.out.println(4);
		printCombination(3);

	}

}
