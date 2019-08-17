package BACKTRACK;

public class place_N_queens {
	
	public static int matrix[][] = new int[9][9] ;
	
	public static boolean ispossible(int n , int row , int col)
	{
		for(int i= row-1 ; i>=0 ; i--)
		{
			if(matrix[i][col] == 1)					//checking same column
				{return false ;}
		}
		for(int i=row-1 ,  j = col-1 ; i>=0 && j>=0 ; i-- , j--)
		{
			if(matrix[i][j]==1)
				{return false ;	}					//checking left diagonal
		}
		for(int i = row-1 , j=col+1 ; i>=0 && j <n ; i-- , j++ )
		{
			if(matrix[i][j]==1)
				{return false ;		}				//checking right diagonal
		}
		return true ;
	}
	
	public static void placeNQueens(int n, int row) {
		if (row >=n) {
			for(int i=0; i<n ; i++)				// print matrix
			{
				for(int j=0 ; j<n ; j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println();
			return ;
		}
		for (int j = 0; j < n; j++) {
			if (ispossible(n, row , j)) {
				matrix[row][j] = 1 ;
				placeNQueens(n, row+1);
				matrix[row][j] = 0 ;
			}
		}
		return ;
	}

	public static void main(String[] args) {

		placeNQueens(4, 0);
		
	}

}
