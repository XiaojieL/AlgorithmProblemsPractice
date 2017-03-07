package leetcodeEasy;

import java.util.*;

//#448
public class FindAllNumbersDisappearedInAnArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		if (nums == null || nums.length == 0) return result;
		for (int i = 0; i < nums.length; i++) {
			int index = nums[i];
			if (nums[index-1] > 0) {
				nums[index-1] = -nums[index-1];
			}
		}
		for (int j = 1; j <= nums.length; j++) {
			if (nums[j-1] > 0) {
				result.add(j);
			}
		}
		return result;
	}
}
