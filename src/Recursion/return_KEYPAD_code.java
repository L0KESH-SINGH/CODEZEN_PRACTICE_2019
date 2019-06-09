package Recursion;

public class return_KEYPAD_code {

	public static String keywords(int n)
	{
		String ans = "" ;
		switch (n) {
		case 2 : ans = "abc" ; return ans ;
			
		case 3 : ans = "def" ; return ans ;
			
		case 4 : ans = "ghi" ; return ans ;
		
		case 5 : ans = "jkl" ; return ans ;
		
		case 6 : ans = "mno" ; return ans ;
		
		case 7 : ans = "pqrs" ; return ans ;
		
		case 8 : ans = "tuv" ; return ans ;
		
		case 9 : ans = "wxyz" ; return ans ;

		default: return "" ;
			
		}
	}
	
	public static String[] keypad(int n){
		
		if(n==0)
		{
			String ans[] = {""} ;
			return ans ;
		}
		int lastdigit = n%10 ;
		int num = n/10 ;
		String myans[] = keypad(num) ;
		String option = keywords(lastdigit) ;
		
		int size = myans.length * option.length() ;
		String ans[] = new String[size];
		
		int k=0; 
		for(int i=0 ; i<option.length() ; i++)
		{
			for(int j=0 ; j<myans.length ; j++)
			{
				ans[k] =  myans[j] + option.charAt(i) ;
				k++ ;
			}
		}
		return ans ;

	}
	
	public static void main(String[] args) {
		
		int n = 23 ;
		String ans [] = keypad(n) ;
		for(int i=0 ; i<ans.length ; i++)
		{
			System.out.println(ans[i]);
		}

	}

}
