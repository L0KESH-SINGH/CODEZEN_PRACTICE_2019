
package string;
import java.util.* ;

public class Internet_Address {
	
	public static void sol(String str) {
		String ans = "" ;
		int count = 0 ;
		for(int i=0 ; i<str.length() ; i++)
		{
			//System.out.println(i);
			if(str.charAt(0) == 'f' && i == 0)
			{
				i++ ;
				continue ;
			}
			else if(str.charAt(0) == 'h' && i == 0 )
			{
				i = i+2 ;
				continue ;
			}
			if(count == 0) {
			ans = str.substring(0, i+1) + "://" ; count++ ; continue ;}
			if(str.charAt(i)=='r' && count == 1)
			{
				ans += ".ru/" ;
				i++ ;
				count++ ;
				continue ;
			}
			else 
				ans += str.charAt(i) ;	
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		
		String str = "ftphttprururu" ;
		sol(str);
	}

}
