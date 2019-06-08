package HASHMAPS;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class maximum_distance {
	
	public static int maxDistance(int arr[])
	{
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>() ;
		int start = 0 , distance = 0 ;
		for(int i=0 ; i<arr.length ; i++)
		{	
			if(!(map.containsKey(arr[i])))
			{
				map.put(arr[i], i) ;
			}
			else
			{
				start = map.get(arr[i]) ;
				if(i-start>distance)
				{
					distance = i-start ;
				}
			}
		}
		return distance ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1 , 3,  1,  4,  5,  6,  4,  8,  3} ;
		System.out.println(maxDistance(arr));
		

	}

}
