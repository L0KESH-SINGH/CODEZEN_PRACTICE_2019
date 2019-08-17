package BACKTRACK;
import java.util.* ;

class ListNode<t> {
	public t data;
	 public ListNode<t> next;
	 public ListNode(t data)
	 {
		 this.data=data;
	 }
}

public class merge_two_linked_list {
	
	
	
	public static ListNode<Integer> merge(ListNode<Integer> head1, ListNode<Integer> head2 , ListNode<Integer> ans , int anslen , int x) {
		
		if(anslen == x || (head1 == null && head2 == null))
		{
			return ans ;
		}
		ListNode<Integer> temp1 = head1 ;
		ListNode<Integer> temp2 = head2 ;
		if(temp1.data < temp2.data)
		{
			ListNode<Integer> loki = new ListNode<Integer>(temp1.data) ;
			loki.next = ans ;
			ans = loki ;
			temp1 = temp1.next ;
			return merge(temp1, temp2, ans, anslen+1, x) ;
		}
		else
		{
			ListNode<Integer> loki = new ListNode<Integer>(head2.data);
			loki.next = ans ;
			ans = loki ;
			temp2 = temp2.next ;
			return merge(temp1, temp2, ans, anslen+1, x) ;
		}
	}


	public static void main(String[] args) {
		
		

	}

}
