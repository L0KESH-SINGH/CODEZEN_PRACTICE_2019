package HASHMAPS;

import java.util.LinkedHashMap;

public class longest_substring_without_repeat {
	
	public static int longestSubstringLength(String str) 
	{
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>() ;
		int max = 0 ;
		char ch = str.charAt(str.length()-1) ;
		str += ch ;
		int si = 0 ;
		for(int i=0 ; i<str.length() ; i++)
		{
			if(!(map.containsKey(str.charAt(i)))) {
				map.put(str.charAt(i),i) ;
			}
			else
			{
				//System.out.println(i);
				if(i-si>max )
				{
					max = i - si  ;
				}

				map.clear();
				
				i = si ;
				si++ ;
				
			}
		}
		return max ;
	}

	public static void main(String[] args) {
		
		String str = "edpxuejtnaqpokoxilnd" ;
		System.out.println(longestSubstringLength(str));
		

	}

}
