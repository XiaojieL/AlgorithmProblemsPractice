package leetcodeMedium;
import java.util.*;
public class SubsetsII {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0) return result;
		List<Integer> list = new ArrayList<>();
		//sort helps repetitive numbers crowded together
		Arrays.sort(nums);
		helper(result, list, nums, 0);
		return result;
	}
	private void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int pos) {
		//deep copy subset & add to result
		result.add(new ArrayList<Integer> (list));
		for (int i = pos; i < nums.length; i++) {
			if (i != 0 && i != pos && nums[i] == nums[i-1]){
				continue;
			}
			list.add(nums[i]);
			helper(result, list,nums, i+1);
			list.remove(list.size()-1);
		}
	}
}
