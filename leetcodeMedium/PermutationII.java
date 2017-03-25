package leetcodeMedium;
import java.util.*;
//#47

public class PermutationII {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0) return result;
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
		helper(result, list, nums, new boolean[nums.length]);
		return result;
	}
	private void helper(List<List<Integer>> result, List<Integer> list, int[] nums, boolean[] used) {
		if (list.size() == nums.length) {
			result.add(new ArrayList<Integer> (list));
		} else {
  		for (int i = 0; i < nums.length; i++) {
  			if (used[i] || i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;
  			used[i] = true;
  			list.add(nums[i]);
  			helper(result, list, nums, used);
  			used[i] = false;
  			list.remove(list.size()-1);
  		}
		}
	}

}
