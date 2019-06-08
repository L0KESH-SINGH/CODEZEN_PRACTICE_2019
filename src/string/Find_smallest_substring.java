package string;

public class Find_smallest_substring {
	
	public static String findMinSubstringContainingString(String large, String small)
	{
        
		String ans = "" ;
		int j =0 ;
		for(int i=0 ; i<large.length() && j<small.length(); i++)
		{
			if((large.charAt(i) == small.charAt(j)) || (large.charAt(i) == ' '))
			{
				ans += large.charAt(i) ;
				if(!(large.charAt(i) == ' '))
				{
					j++ ;
				}
				
			}
			else
			{
				j = 0 ;
				ans = "" ;
			}
		}
		if(ans == "")
			return null ;
        return ans ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String large = "Looks for minimum string" ;
		String small = "rof" ;
		System.out.print(findMinSubstringContainingString(large, small));

	}

}
