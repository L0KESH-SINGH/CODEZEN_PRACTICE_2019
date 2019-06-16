package Recursion;

public class Edit_distance {
	
	public static int editDistance(String s1, String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return  Math.max(s1.length() , s2.length()) ;
		}

		if(s1.charAt(0)==s2.charAt(0))
		{
			return editDistance(s1.substring(1), s2.substring(1)) ;
		}
		
		//String a = s1.substring(1) ;
		int x = 1 + editDistance(s1.substring(1), s2) ;
		//String b = s2.charAt(0) + s1.substring(1) ;
		int y = 1 + editDistance(s1.substring(1), s2.substring(1)) ;
		//String c = s2.charAt(0) + s1 ;
		int z = 1 + editDistance(s1, s2.substring(1)) ;
		
		
		return Math.min(x, Math.min(y, z)) ;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "" , b = "a" ;
		System.out.println(editDistance(a, b));
	}

}
