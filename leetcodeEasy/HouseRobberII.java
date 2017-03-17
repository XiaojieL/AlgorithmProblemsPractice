package leetcodeEasy;
//#213 -> the first house is linked to the last one, a circle
public class HouseRobberII {
	private int maxValue(int[] nums, int startIndex, int endIndex) {
		int curInclude = 0;
		int curExclude = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			int preInclude = curInclude, preExclude = curExclude;
			curInclude = preExclude + nums[i];
			curExclude = Math.max(preExclude, preInclude);
		}
		return Math.max(curInclude, curExclude);
	}
	
	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		if (nums.length == 1) return nums[0];
		return Math.max(maxValue(nums, 0, nums.length-2), maxValue(nums, 1, nums.length-1));
	}

}
