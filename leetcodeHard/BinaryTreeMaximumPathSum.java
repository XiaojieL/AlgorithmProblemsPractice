package leetcodeHard;

import leetcodeEasy.TreeNode;

public class BinaryTreeMaximumPathSum {
	public int maxPathSum(TreeNode root) {
		if (root == null) return 0;
		int max = Integer.MIN_VALUE;
		helper(root, max);
		return max;
	}
	private void helper(TreeNode node, int max) {
		if (node == null) return;
		int left = Math.max(0, helper(node.left));
		int right = Math.max(0, helper(node.right));
		max = Math.max(max, left+right+node.val);
		return;
	}

}
