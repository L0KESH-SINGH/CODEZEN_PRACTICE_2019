package Arrays;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;

public class smallest_subarray_with_required_sum {

	public static ArrayList<Integer> smallestSubarray(int sum, ArrayList<Integer> input) {
		
		ArrayList<Integer> ans = new ArrayList<>() ;
		//int size = 10000 ;
		int si=0 , ei =10000 ;
		for(int i=0 ; i<input.size()-1 ; i++)
		{
			//ArrayList<Integer> list = new ArrayList<>() ;
			int a = i ;
			int s = input.get(i) ;
			//list.add(input.get(i)) ;
			for(int j=i+1 ; j<input.size() ; j++)
			{
				s += input.get(j) ;
				//list.add(input.get(j)) ;
				if(s>sum && (j-a)<(ei-si))
				{
					//ans = list ;
					//size = j-a ;
					si = a ;
					ei = j ;
					break ;
				}
			}
		}
		for(int i=si ; i<=ei ; i++)
		{
			ans.add(input.get(i)) ;
		}
		//System.out.println(si + " " + ei);
		return ans ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>() ;
		list.add(1); list.add(3); list.add(5); list.add(6); list.add(4); list.add(3);
		ArrayList<Integer> ans = smallestSubarray(9,list) ;
		
		for(int i=0 ; i<ans.size() ; i++)
		{
			System.out.print(ans.get(i)+" ");
		}
		

	}

}
