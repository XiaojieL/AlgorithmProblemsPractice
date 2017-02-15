package leetcodeEasy;

//#206 iteratively or recursively
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null) return null;
		ListNode newHead = null;
		while (head != null) {
			ListNode oldNext = head.next;
			head.next = newHead;
			newHead = head;
			head = oldNext;
		}
		return newHead;
	}
	
	public ListNode reverseList(ListNode head) {
		return helper(head, null);
	}
	private ListNode helper(ListNode head, ListNode newHead) {
		if (head == null) return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return helper(next, head);
	}
}
