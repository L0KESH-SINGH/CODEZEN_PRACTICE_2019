package Recursion;

public class lexicographical_order {
	static int count=1;
	
	public static void lexicographicalOrder(int n , int x)
	{
		
		if(x<=n && count<=n)
		{
			if(x%10!=0)
			System.out.println(x);
			count++ ;
			
			
			lexicographicalOrder(n, x*10);
			if(x!=n-1)
			lexicographicalOrder(n, x+1);
			
		}
		return ;
		
	}
	
	public static void lexicographicalOrder(int num){
		lexicographicalOrder(num, 1);
	}

	public static void main(String[] args) {
		
		lexicographicalOrder(30);

	}

}
