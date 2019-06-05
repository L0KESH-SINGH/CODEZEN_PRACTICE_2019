package Arrays;

public class stock_profitable {
	
	public static int maxProfit(int stockprices[])
	{
		int max = 0 ;
        for(int i=stockprices.length-1 ; i>0 ; i--)
        {
        	for(int j = 0 ; j<i-1 ; j++)
        	{
        		int temp = stockprices[i]-stockprices[j] ;
        		if(temp > max )
        		{
        			max = temp ;
        			//break ;
        		}
        	}
        	//System.out.println(max);
        }
        return max ;
	}
	
	public static void main(String[] args) {
		int arr[] = { } ;
		System.out.println(maxProfit(arr));
	}
}
