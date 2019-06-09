package Recursion;

public class replace_char_recursive {

	public static String replaceCharacter(String str, char c1, char c2) {
		
		if(str.length() == 0)
		{
			return "" ;
		}
		char ch = str.charAt(0) ;
		if(ch==c1)
			ch = c2 ;
		String myans = replaceCharacter(str.substring(1), c1, c2) ;
		myans = ch + myans ;
		return myans ;
		
	}
	
	public static void main(String[] args) {
		
		String str= "abcad" ;
		System.out.println(replaceCharacter(str, 'a', 'x'));

	}

}
