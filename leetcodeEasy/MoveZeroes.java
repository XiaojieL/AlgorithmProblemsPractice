package leetcodeEasy;
//#283
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0) return;
		int j = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
	}
}