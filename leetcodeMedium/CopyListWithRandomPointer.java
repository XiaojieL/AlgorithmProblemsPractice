package leetcodeMedium;
//#138
public class CopyListWithRandomPointer {
	public RandomListNode copyRandomListNode (RandomListNode head) {
		if (head == null) return null;
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		RandomListNode temp = head;
		while (temp != null) {
			map.put(temp, new RandomListNode(temp.label));
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			map.get(temp).random = map.get(temp.random);
			map.get(temp).next = map.get(temp.next);
			temp = temp.next;
		}
		return map.get(head);
	}

}
