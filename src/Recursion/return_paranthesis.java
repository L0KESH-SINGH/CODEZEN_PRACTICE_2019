package Recursion;

import java.util.ArrayList;

public class return_paranthesis {
	
	public static void findParenthesis(int n ,int open , int close , String str , ArrayList<String> list)
	{
		if(close == n)
		{
			list.add(str) ;
			return ;
		}
		if(open>close)
		{
			
			findParenthesis(n,open , close+1 , str+")" ,list) ;
		}
		if(open<n)
		{
			
			findParenthesis(n, open+1, close, str+"(", list);
		}
	}
	
	public static String[] findParenthesis(int n){
		
		ArrayList<String> list = new ArrayList<>() ;
		findParenthesis(n, 0, 0, "", list);
		String ans[] = new String[list.size()];
		list.toArray(ans);
		return ans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans[] = findParenthesis(3) ;
		for(int i=0 ; i<ans.length ; i++)
		{
			System.out.println(ans[i]);
		}

	}

}
