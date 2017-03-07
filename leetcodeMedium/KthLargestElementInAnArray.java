package leetcodeMedium;
import java.util.*;
//#215
public class KthLargestElementInAnArray {
	public static int findKthLargest(int[] nums, int k) {
		if (nums == null || nums.length == 0) return -1;
		PriorityQueue<Integer> pq = new PriorityQueue<>(3);
		for (int num : nums) {
			pq.offer(num);
//			System.out.println(pq.peek());
//			if (pq.size() > k) {
//				pq.poll();
//			}
		}
		System.out.println("size" + pq.size());
		return pq.peek();
	}
	public static void main(String[] args) {
		int[] nums = new int[] {5,1,4,3,9,2};
		System.out.print(findKthLargest(nums, 3));
	}
}
