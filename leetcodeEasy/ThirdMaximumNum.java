package leetcodeEasy;


import java.util.HashSet;
import java.util.PriorityQueue;

//#414
public class ThirdMaximumNum {
	public int thirdMax(int[] nums){
		if (nums == null || nums.length == 0) return 0;
		HashSet<Integer> hash = new HashSet<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : nums) {
			if (!hash.contains(i)) {
				pq.add(i);
				hash.add(i);
				if (pq.size() > 3) {
					hash.remove(pq.poll());
				}
			}
		}
		
		
		if (pq.size() <= 2) {
			while (pq.size() > 1) {
				pq.poll();
			}
		}
		return pq.peek();
	}
}
