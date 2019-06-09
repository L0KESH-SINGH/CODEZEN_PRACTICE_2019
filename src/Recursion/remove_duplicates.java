package Recursion;

public class remove_duplicates {
	
	public static String removeConsecutiveDuplicates(String s) {
		
		if(s.length() == 1)
		{
			return s ;
		}
		
		char ch = s.charAt(0) ;
		String myans = removeConsecutiveDuplicates(s.substring(1)) ;
		if(ch != myans.charAt(0))
		{
			myans = ch + myans ;
		}
		
		return myans ;

	}

	public static void main(String[] args) {
		
		String str = "aaabbcdee" ;
		System.out.println(removeConsecutiveDuplicates(str));

	}

}
