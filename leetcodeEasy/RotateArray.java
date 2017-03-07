package leetcodeEasy;

import java.util.Stack;

//#189
public class RotateArray {
	public void rotate(int[] nums, int k) {
		if (nums == null || nums.length <= 1 ) return;
		Stack<Integer> stack = new Stack<>();
		int move = k % nums.length;
		for (int i = nums.length-1; i >= nums.length-move; i--) {
			stack.push(nums[i]);
		}
		for (int i = nums.length-1-move; i >= 0; i--) {
			nums[i+move] = nums[i];
		}
		for (int i = stack.size()-1; i >= 0; i--) {
			nums[i] = stack.pop();
		}
		return;

	}
}
