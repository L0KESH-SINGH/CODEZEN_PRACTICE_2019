package linkedlist;

import java.util.Scanner;


public class sort_LL {
	
	public static ListNode<Integer> changeList( ListNode<Integer> head , ListNode<Integer> ans ) 
	{
			if(head == null )
			{
				return ans ;
			}
			ListNode<Integer> u = new ListNode(0) ;
			ListNode<Integer> temp = ans ;
			int x = head.data ;
			if(x<temp.data || head.data == 0)
			{
				ListNode<Integer> p = new ListNode(x) ;
				p.next = temp ;
				temp = p ;
			}
			else if( temp.next == null )
			{
				ListNode<Integer> p = new ListNode(x) ;
				temp.next = p ;
			}
			else {
			while( x  > temp.next.data )
			{
				temp = temp.next ;
			}
			ListNode<Integer> p = new ListNode(x) ;
			ListNode<Integer> o = temp.next ;
			temp.next = p ;
			p.next = o ;
			}
			u = changeList(head.next , ans) ;
			return u ;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		ListNode<Integer> list = new ListNode(0);
		ListNode<Integer> list2 = new ListNode(0);
		ListNode<Integer> list3 = new ListNode(0);
		ListNode<Integer> list4 = new ListNode(0);
		int h = 0 , i = 0; 
		while(h!=-1)
		{
			h = s.nextInt() ;
			ListNode<Integer> p = new ListNode(h) ;
			if(i==0)
			{
				list = p ;
				list3 = list ;
			}
			else {
			list.next = p ; 
			list = list.next ;
			}
			i++ ;
		}
		
		list4 = changeList( list , list2 ) ;
		while (list4.next != null) {
			System.out.print(list4.data + " ") ;
			list4 = list4.next ;
		}
	}

}
