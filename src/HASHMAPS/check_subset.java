package HASHMAPS;

import java.util.HashSet;

public class check_subset {
	
	public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {
		
		HashSet<Integer> map = new HashSet<>() ;
		for(int i=0 ; i<n1 ; i++)
		{
			if(!(map.contains(arr1[i])))
			map.add(arr1[i]) ;
		}
		for(int i=0 ; i<n2 ; i++)
		{
			if(!(map.contains(arr2[i])))
			{
				return false ;
			}
			else
			{
				map.remove(arr1[i]);
			}
		}
		return true ;
		
	}

	public static void main(String[] args) {
		

	}

}
