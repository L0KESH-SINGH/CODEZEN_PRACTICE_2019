package Arrays;

public class Special_sum_of_array {
	
	public static int sum(int arr[])
	{
         //Write code here 
        int temp = 0 ; 
        int sum = 0 ;
        for(int i = 0 ; i<arr.length ; i++)
        {
            sum += arr[i] ;
            if(sum>9)
            {
                temp = sum%10 ;
                sum = sum/10 ;
                temp += sum ;
                sum = temp ;
			}
		}
        return sum ;
	}

	public static void main(String[] args) {
		
		int arr[] = {9,9,9} ;
		System.out.println(sum(arr));

	}

}
