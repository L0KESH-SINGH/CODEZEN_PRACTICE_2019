package BACKTRACK;

import java.util.Scanner;

public class Rat_in_a_MAZE {
	
	public static void ratInAMaze(int maze[][], int i, int j, int xmaze[][]) {

		if (i == maze.length - 1 && j == maze.length - 1) {
			xmaze[i][j] = 1;
			for (int a = 0; a < xmaze.length; a++) {
				for (int b = 0; b < xmaze.length; b++) {
					System.out.print(xmaze[a][b] + " ");
				}
			}
			System.out.println();
			return;
		}

		if (i > maze.length - 1 || i < 0 || j > maze.length - 1 || j < 0 || maze[i][j] == 0 || xmaze[i][j] == 1) {
			return;
		}

		xmaze[i][j] = 1;
		ratInAMaze(maze, i - 1, j, xmaze);
		ratInAMaze(maze, i + 1, j, xmaze);
		ratInAMaze(maze, i, j - 1, xmaze);
		ratInAMaze(maze, i, j + 1, xmaze);

		xmaze[i][j] = 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		int n = s.nextInt() ;
		int maze[][] = new int[n][n] ;
		for(int i=0; i<n ; i++)
		{
			for(int j=0 ; j <n ; j++)
			{
				maze[i][j] = s.nextInt() ;
			}
		}
		int xmaze[][] = new int[maze.length][maze.length] ;
		ratInAMaze(maze, 0, 0 , xmaze);
	}

}
