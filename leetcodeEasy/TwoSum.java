package leetcodeEasy;
import java.util.*;
//#1 time: O(n)
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		if (nums == null || nums.length == 0) return result;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target-nums[i])) {
				result[0] = i;
				result[1] = map.get(target-nums[i]);
			}
			map.put(nums[i], i);
		}
		return result;
	}
}
