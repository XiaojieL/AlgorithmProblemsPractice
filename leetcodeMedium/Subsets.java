package leetcodeMedium;
import java.util.*;
public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0) return result;
		Arrays.sort(nums);
		helper(result, new ArrayList<Integer>(), nums, 0);
		return result;
		
	}
	private void helper(List<List<Integer>> result,
											ArrayList<Integer> subset, int[] nums, int start){
	
		//new -> deep copy, without new, just add reference->soft copy
		result.add(new ArrayList<Integer> (subset));
		
		for (int i = start; i < nums.length; i++) {
			subset.add(nums[i]);
			helper(result, subset, nums, i+1);
			subset.remove(subset.size()-1);
		}
	}
}
