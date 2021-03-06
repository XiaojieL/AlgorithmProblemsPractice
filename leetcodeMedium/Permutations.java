package leetcodeMedium;
import java.util.*;
//#46
public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0) return result;
		List<Integer> list = new ArrayList<Integer>();
		helper(result, list, nums);
		return result;
	}
	private void helper(List<List<Integer>> result, List<Integer> list, int[] nums) {
		if (list.size() == nums.length) {
			result.add(new ArrayList<Integer> (list));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (list.contains(nums[i])) continue;
				list.add(nums[i]);
				helper(result, list, nums);
				list.remove(list.size()-1);
			}
		}
	}
}
