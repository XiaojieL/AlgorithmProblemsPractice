package leetcodeMedium;

public class MaxConsecutiveOnesII {
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		int l = 0, zero = 0, max = 0;
		for (int r = 0; r < nums.length; r++) {
			if (nums[r] == 0) {
				zero++;
			}
			while (zero > 1) {
				//as long as zero is bigger than 1, left point should move to next
				//if put l++ in the if () {}, whenever nums[l] = 1, won't move to next num
				//stuck in while loop
				//eg: [1,0,0]
				l++;
				if (nums[l-1] == 0) {
					zero--;
				}
			}
			max = Math.max(max, r-l+1);
		}
		return max;
	}
}
