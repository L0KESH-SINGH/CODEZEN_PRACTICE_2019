package string;

public class compress_the_string {

	public static String compress(String inputString) {
		// Write your code here
		inputString += "," ;
		int count = 0 ;
		String str = "" ;
		char ch = '.' ;
		for(int i=0 ; i<inputString.length() ; i++)
		{
			if(i==0)
			{
				count++ ;
				ch = inputString.charAt(i) ;
			}
			else if(inputString.charAt(i)==ch)
			{
				count++ ;
			}
			else
			{
				str += ch ;
				if(count>1)
				str += count ;
				count = 1 ;
				ch = inputString.charAt(i) ;
			}
		}
		return str ;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbcdddxx" ;
		System.out.println(compress(str));
		
	}

}
