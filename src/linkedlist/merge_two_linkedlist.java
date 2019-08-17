package linkedlist;
import java.util.* ;

class ListNode<t> {
	public t data;
	 public ListNode<t> next;
	 public ListNode(t data)
	 {
		 this.data=data;
	 }
}

public class merge_two_linkedlist {
	
	
	
	public static ListNode<Integer> merge(ListNode<Integer> head1, ListNode<Integer> head2, ListNode<Integer> ans,
			int anslen, int x) {

		if (anslen == x) {
			return ans;
		}
		ListNode<Integer> temp1 = head1;
		ListNode<Integer> temp2 = head2;
		if (!(head1.data == -1 || head2.data == -1)) {
			if (temp1.data < temp2.data) {
				ListNode<Integer> loki = new ListNode<Integer>(temp1.data);
				loki.next = ans;
				ans = loki;
				temp1 = temp1.next;
				return merge(temp1, temp2, ans, anslen + 1, x);
			} else {
				ListNode<Integer> loki = new ListNode<Integer>(temp2.data);
				loki.next = ans;
				ans = loki;
				temp2 = temp2.next;
				return merge(temp1, temp2, ans, anslen + 1, x);
			}
		} else if (head1.data == -1) {
			ListNode<Integer> loki = new ListNode<Integer>(temp2.data);
			loki.next = ans;
			return merge(head1, head2.next, loki, anslen + 1, x);
		} else {
			//ListNode
			ListNode<Integer> loki = new ListNode<Integer>(temp1.data);
			loki.next = ans;
			ans = loki;
			return merge(head1.next, head2, ans, anslen + 1, x);
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ListNode<Integer> list = new ListNode(0);
		ListNode<Integer> list2 = new ListNode(0);
		ListNode<Integer> list3 = new ListNode(0);
		ListNode<Integer> list4 = new ListNode(0);
		ListNode<Integer> ans = new ListNode(0);
		int a = 0 ;
		int b = 0 ;
		int i = 0;
		int h = 0 ;
		while (h != -1) {
			 h = s.nextInt();
			 a++ ;
			if (i == 0) {
				list3 = list;
				list.data = h;
			} else {
				ListNode<Integer> temp = new ListNode(h);
				list.next = temp;
				list = list.next;
			}
			i++;
		}
		i = 0; h = 0;
		while ( h!= -1 ) {
			h = s.nextInt();
			b++ ;
			if (i == 0) {
				list4 = list2;
				list2.data = h;
			} else {
				ListNode<Integer> temp = new ListNode(h);
				list2.next = temp;
				list2 = list2.next;
			}
			i++;
		}
		list = merge(list3, list4, ans, 0, a + b -2);
		while (list.next != null) {
			System.out.print(list.data + " ");
			list = list.next;
		}

	}
}
