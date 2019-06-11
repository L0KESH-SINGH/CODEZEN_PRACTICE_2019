package Recursion;

public class min_step_to_1 {
	
	public static int countStepsTo1(int n){
		
		int min=0;
		
		if(n==1)
		{
			return 0 ;
		}
		
		if(n%3==0)
		{
			int a = 1+countStepsTo1(n/3) ;
			min=Math.min(min, a);
		}
		if(n%2==0)
		{
			int b = 1+countStepsTo1(n/2);
			min=Math.min(min, b);
		}
		int c = 1+countStepsTo1(n-1) ;
		min=Math.min(min, c);
		return  min ;
		
		}

	public static void main(String[] args) {
		
		int n = 10 ;
		System.out.println(countStepsTo1(n));

	}

}
