package Recursion;

public class CHeck_AB {
	
	
	public static boolean checkAB(String input) {
		
		if(input.length() == 0)
		{
			return true ;
		}
		
		if(input.charAt(0)=='a')
		{
			if(input.length()>2 && input.substring(1,3).equals("bb"))
			{
				return checkAB(input.substring(3)) ;
			}
			else
				return checkAB(input.substring(1)) ;
		}
		return false ;

	}

	public static void main(String[] args) {
		
		

	}

}
