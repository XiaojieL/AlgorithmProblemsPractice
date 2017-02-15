package leetcodeMedium;

public class JumpGame {
	public boolean canJump(int[] nums) {
		if (nums == null || nums.length == 0) return true;
		int reachable = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > reachable) {
				return false;
			}
			reachable = Math.max(reachable, i+nums[i]);
		}
		return true;
	}

}
