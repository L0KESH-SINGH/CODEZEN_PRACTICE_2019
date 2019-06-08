
package string;
import java.util.* ;

public class Two_substring {

	public static void twoSubstrings(String str)
	{
		// Write your code here
		int count = 0 ;
		String a="AB" , b = "BA" ;
		for(int i=0 ; i<str.length()-1 ; i++)
		{
			String temp = str.substring(i, i+2) ;
			if( temp.equals(a) || temp.equals(b))
			{
				count++ ;
			}
		}
		//System.out.println(count);
		if(count == 2)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BACFAB" ;
		//System.out.println(str.substring(0, 2));
		twoSubstrings(str);
	}

}
