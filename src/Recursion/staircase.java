package Recursion;

public class staircase {
	
	public static int staircase(int n)
	{
		if(n==0)
	    {
	        return 1 ;
	    }
	         int a =  staircase(n-1) ;
	         int b =0 , c=0 ;
	         if(n>1)
	         {
	             b =   staircase(n-2) ;
	         }
	         if(n>2)
	         {
	             c =    staircase(n-3) ;
	         }
	        return a+b+c ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(staircase(4));

	}

}
