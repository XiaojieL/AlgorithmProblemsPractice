package leetcodeEasy;
//#198
public class HouseRobber {
	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		int[] maxValue = new int[nums.length+1];
		maxValue[0] = 0;
		maxValue[1] = nums[0];
		for (int i = 2; i < nums.length+1; i++) {
			maxValue[i] = Math.max(maxValue[i-1], maxValue[i-2]+nums[i-1]);
		}
		return maxValue[maxValue.length-1];
		
	}
}
