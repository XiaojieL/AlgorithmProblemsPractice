package leetcodeMedium;

import java.util.Stack;

//#255
public class VerifyPreOrderInBST {
	public boolean verifyPreorder(int[] preorder) {
		if (preorder == null || preorder.length == 0) {
			return true;
		}
		Stack<Integer> stack = new Stack<>();
		int min = Integer.MIN_VALUE;
	
		for (int num : preorder) {
			if (num < min) {
				return false;
			}
			while (!stack.isEmpty() && num > stack.peek()) {
				min = stack.pop();
			}
			stack.push(num);
		}
		return true;
	}
}
