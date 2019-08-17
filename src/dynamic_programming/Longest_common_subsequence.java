package dynamic_programming;

public class Longest_common_subsequence {
	
	public static int LCS(String s1 , String s2) {
		 int lcs[][] = new int[s1.length()+1][s2.length()+1] ;
		 
		 for(int i=0; i<=s1.length() ; i++) {
			 for(int j=0 ; j<=s2.length() ; j++) {
				 if(i==0 || j==0) {
					 lcs[i][j] = 0 ;
				 }
				 else if(s1.charAt(i-1) == s2.charAt(j-1)) {
					 lcs[i][j] = lcs[i-1][j-1]+1 ;
					 //ans = s1.charAt(i-1) + ans ;
				 }
				 else {
					 lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]) ;
				 }
			 }
		 }
		 return lcs[s1.length()][s2.length()] ;
	}

	public static void main(String[] args) {
		
		String s1 = "GXTXAYB" , s2 = "AGGTAB" ;
		System.out.println(LCS(s1, s2));
		

	}

}
