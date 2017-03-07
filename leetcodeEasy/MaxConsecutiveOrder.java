package leetcodeEasy;
//#485 as long as the current num is 1, count++
// if current num is not 1, reset count to zero
//result is the max of current count or result
public class MaxConsecutiveOrder {
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		int count = 0;
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				result = Math.max(result, count);
			} else {
				count = 0;
			}
		}
		return result;
	}
}
