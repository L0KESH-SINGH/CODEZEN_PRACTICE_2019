package HASHMAPS;

import java.util.*;
import java.util.HashSet;

public class max_freq_number {

	public static int maxFrequencyNumber(int[] arr){
		
		LinkedHashMap<Integer, Integer> h = new LinkedHashMap<>() ;
		for(int i=0 ; i<arr.length ; i++)
		{
			if(!(h.containsKey(arr[i])))
			{
				h.put(arr[i],1) ;
			}
			else
			{
				h.put(arr[i], h.get(arr[i])+1) ;
			}
		}
		int max = Integer.MIN_VALUE ;
		int ans = 0 ;
		for (Map.Entry<Integer, Integer> it: h.entrySet()){ 
            if(it.getValue() > max) {
                max = it.getValue() ; 
            	ans = it.getKey() ;}
        } 
		return ans ;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2 ,12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6  } ;
		System.out.println(maxFrequencyNumber(arr));
	}

}
