package Recursion;

public class Return_all_Codes {
	
	public static char helper(int num){
	      return (char)(num+96);
	    }
	
	public static  String[] getCode(String str){
		
		if(str.length() == 0)
		{
			return new String[1] ;
		}
		int num1 = str.charAt(0) - '0' ;
		char ch = helper(num1) ;
		String myans1[] = getCode(str.substring(1)) ;
		int x = 0 ;
		String myans2[] = {} ;
		
		if(str.length()>1) {
		int num2 = str.charAt(1) - '0' ;
		x = (num1*10) + num2 ;
		if(x<=26)
		{
			myans2 = getCode(str.substring(2)) ; 
		}
		}
		String ans[] = new String[myans1.length + myans2.length] ;
		char ch2 = helper(x) ;
		int i=0  ;
		
		for(; i<myans1.length ; i++)
		{
			if(myans1[i]!=null) {
			ans[i] = ch + myans1[i] ;
			}
			else
				ans[i] = ch + "" ;
		}
		if(myans2.length>0) {
		for( int j=0 ; j<myans2.length ; j++)
		{
			if(myans2[j]!=null) 
			ans[i] = ch2 + myans2[j] ;
			else
				ans[i] = ch2 + "";
			i++ ;
		}}
		return ans ;
	}

	public static void main(String[] args) {
		
		String str = "112" ;
		String ans[] = getCode(str) ;
		for(int i=0 ; i<ans.length ;i++)
		{
			System.out.println(ans[i]);
		}

	}

}
