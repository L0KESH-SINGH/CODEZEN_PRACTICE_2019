package string;

public class Amazing_Strings {

	public static void ans(int n, String str) {
		//Write your code here
        if(!(n<26))
        {
            boolean[] mark = new boolean[26]; 
  
        // For indexing in mark[] 
        int index = 0; 
  
        // Traverse all characters 
        for (int i = 0; i < str.length(); i++) 
        { 
            // If uppercase character, subtract 'A' 
            // to find index. 
            if ('A' <= str.charAt(i) &&  
                    str.charAt(i) <= 'Z') 
                          
                index = str.charAt(i) - 'A'; 
  
                // If lowercase character, subtract 'a' 
                // to find index. 
            else if('a' <= str.charAt(i) &&  
                        str.charAt(i) <= 'z') 
                              
                index = str.charAt(i) - 'a'; 
  
            // Mark current character 
            mark[index] = true; 
        } 
  
        // Return false if any character is unmarked 
        for (int i = 0; i <= 25; i++) {
            if (mark[i] == false) {
                System.out.println("NO");
                return ; }
        }
        // If all characters were present 
        System.out.println("YES"); 
        }
        else
            System.out.println("NO");
	}
	
	public static void answer(String s1,String s2,String s3)
	{
		
		if(s3.length() == s1.length() + s2.length())
		{
			String temp = s1 + s2 ;
			for(int i=0 ; i <s3.length() ; i++)
			{
				boolean flag = false ;
				for(int j = 0 ; j < s3.length() ; j++)
				{
					if(temp.charAt(i) == s3.charAt(j))
					{
						flag = true ;
					}
				}
				if(flag == false)
				{
					System.out.println("NO");
					return ;
				}
			}
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SANTACLAUS" , s2 = "DEDMOROZ" , s3 = "SANTAMOROZDEDCLAUS" ;
		//answer(s1, s2, s3);
		
		String str = "TheQuickBrownFoxJumpsOverTheLazDog" ;
		ans(35, str);

	}

}
