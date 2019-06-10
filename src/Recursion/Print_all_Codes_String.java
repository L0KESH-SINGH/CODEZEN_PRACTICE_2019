package Recursion;

public class Print_all_Codes_String {
	
	public static char helper(int num){
	      return (char)(num+96);
	    }
	
	public static void printAllPossibleCodes(String str , String output ) 
	{
		if(str.length() == 0)
		{
			System.out.println(output);
			return ;
		}
		
		int num1 = str.charAt(0) - '0' ;
		char ch = helper(num1) ;
		
		
		int x =0 ;
		if(str.length()>1){
		int num2 = str.charAt(1) - '0' ;
		x = (num1*10) + num2 ;
		}
		char ch2  ;
		printAllPossibleCodes(str.substring(1) , output + ch );
		if(x!=0 && x<=26) {
			ch2 = helper(x) ;
			printAllPossibleCodes(str.substring(2) , output + ch2);
		}
		
	}
	
	public static void printAllPossibleCodes(String input) {
		String a = "" ;
		printAllPossibleCodes(input , a ) ;

	}
	public static void main(String[] args) {
		String str = "112" ;
		printAllPossibleCodes(str);
	}
}

