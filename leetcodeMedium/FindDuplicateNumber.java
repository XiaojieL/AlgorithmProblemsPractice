package leetcodeMedium;
//#287
public class FindDuplicateNumber {
	public int findDuplicate(int[] nums) {
		int slow = nums.length-1;
		int fast = nums.length-1;
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);
		return slow;
	}

}
