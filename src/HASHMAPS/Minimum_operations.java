package HASHMAPS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Minimum_operations {
	
	public static int ReturnMinOperationCount(int[] arr, int n) {
		int count = 0 ;
		HashMap<Integer, Integer> map = new HashMap<>() ;
		for(int i=0 ; i<n ; i++)
		{
			if(!(map.containsKey(arr[i]))) 
			{
				map.put(arr[i], 1) ;
			}
			else
			{
				count++ ;
				map.put(arr[i],map.get(arr[i])+1) ;
			}
		}
		int max = 0 ;
		for (Map.Entry<Integer, Integer> it: map.entrySet()){ 
            if(it.getValue() > max) 
                 max = it.getValue() ;
        } 
		if(count == 0)
		{
			return n-1 ;
		}
		else if(count == n-1)
			return 0 ;
		else
			return n - max ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,3,3,4,4,5,5} ;
		System.out.println(ReturnMinOperationCount(arr, arr.length));

	}

}
