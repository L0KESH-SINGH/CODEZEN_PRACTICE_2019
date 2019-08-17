package dynamic_programming;

public class fibonacciSeries {
	
	public static int[] FIB(int n)
	{
		int arr[] = new int[n+1] ;
		arr[0] = 1 ; arr[1] = 1 ;
		for(int i = 2 ; i<=n ; i++)
		{
			arr[i] = arr[i-1] + arr[i-2] ;
		}
		return arr ;
	}
	
	public static void FIB2(int n , int ans[]){
		if(n==0 || n==1) {
			ans[n] = 1 ;
			return ;
		}
		if(ans[n]>0) {
			return ;
		}
		FIB2(n-1,ans);
		FIB2(n-2,ans);
		ans[n] = ans[n-1]+ans[n-2] ;
		return ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5 ;
		int ans[] = FIB(n) ;
		for(int i : ans) {
			System.out.print(i+" ");
		}
		System.out.println();
		int ans2[] = new int[n+1] ;
		FIB2(5, ans2);
		for(int i : ans2) {
			System.out.print(i+" ");
		}
	}

}
