package string;

public class removeConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length()==1)
		{
			return s ;
		}
		String ch = "" ;
		ch += s.charAt(0) ;
		String myans = removeConsecutiveDuplicates(s.substring(1)) ;
		if(!(ch.charAt(0) == myans.charAt(0)))
		{
			String temp = ch ;
			temp += myans ;
			myans = temp ;
		}
		return myans ;
	}

	public static void main(String[] args) {
		
		String str = "aaabbcdddxx" ;

		System.out.println(removeConsecutiveDuplicates(str));

	}

}
