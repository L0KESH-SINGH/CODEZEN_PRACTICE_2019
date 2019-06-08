package HASHMAPS;

import java.util.LinkedHashMap;
import java.util.Map;

public class non_repeating_character {

	public static char firstNonRepeatingChar(String str)
	{
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>() ;
		for(int i=0 ; i <str.length() ; i++)
		{
			if(!(map.containsKey(str.charAt(i))))
			{
				map.put(str.charAt(i), 1) ;
			}
			else
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1) ;
			}
		}
		for (Map.Entry<Character, Integer> it: map.entrySet()){ 
            if(it.getValue() == 1) 
                 return it.getKey();
        } 

		return str.charAt(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
