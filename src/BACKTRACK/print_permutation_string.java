package BACKTRACK;

public class print_permutation_string {

	public static void permutations(String input , String output )
	{
		
		if(input.length()==0)
		{
			System.out.println(output);
			//output = "" ;
			return ;
		}
		
		for(int i = 0 ; i < input.length() ; i++)
		{
			output += input.charAt(i) ;
			String temp = "" ;
			{
				if(i!=0) {
				temp = input.substring(0, i) + input.substring(i+1) ;
				}
				else
					temp = input.substring(1) ;
			}
			//System.out.println("*" + input + "*"+ output);
			permutations( temp , output ) ;
			int x = output.length() ;
			output = output.substring(0, x-1) ;
		}
	}
	
	public static void main(String[] args) {
		
		String input = "abc" ;
		permutations(input , "");
		
	}

}
