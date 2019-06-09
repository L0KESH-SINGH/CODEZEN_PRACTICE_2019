package HASHMAPS;

import java.util.*;
import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class remove_duplicates {
	
	public static int[] removeDuplicates(int arr[])
	{
		int count = 0 ; 
		
		LinkedHashSet<Integer> h = new LinkedHashSet<>() ;
		//LinkedHashSet<Integer> h = new LinkedHashSet<>() ;
		for(int i=0 ; i <arr.length ; i++)
		{
			if(!(h.contains(arr[i])))
			{
				h.add(arr[i]) ;
				count++ ;
			}
		}
		int ans[] = new int[count] ;
//		Iterator i = h.iterator();
//		int j =0 ; 
//		while (i.hasNext()) { 
//            ans[j] = i.next();
//            j++ ;
//        } 
		return ans ;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
