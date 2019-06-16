package Recursion;

public class floor_value {
	
	public static int findFloor(int[] array, int x , int i)
	{
		if(i==array.length)
		{
			return 0 ;
		}
		int temp = 0 ;
		if(array[i]==x)
		{
			return x ;
		}
		else if(array[i]<x)
		{
			temp = array[i] ;
		}
		return Math.max(temp, findFloor(array, x, i+1)) ;
	}
	
	public static int findFloor(int[] array, int element){
		//Write your code here
		return findFloor( array,  element , 0) ;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 10 ,  20 ,30,  40 ,50 } ;
		int temp = findFloor(array, 25) ;
		System.out.println(temp);
	}

}
