package Recursion;

public class create_sequence {
	
	public static void printSequence(int range , int si){
		//Write your code here
		if(si>range)
		{
			return ;
		}
		int i = si ;
		//System.out.println(i);
		boolean check = true ;
		while(i>0)
		{
			int x = i%10 ;
			if(!(x==2 || x==5))
			{
				check = false ;
				break ;
			}
			i = i/10 ;
		}
		if(check == true )
		{
			System.out.println(si);
		}
		printSequence(range , si+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSequence(25 , 1);
	}

}
