package leetcodeEasy;
//#141, two pointers
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) return false;
		ListNode p1 = head;
		ListNode p2 = head;
		//To avoid null pointer exception, we should always make
		//sure the next and the next's next of the fast moving pointer
		//are both not null
		while (p2.next != null && p2.next.next != null ) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2) {
				return true;
			}
		}
		return false;
	}
}
