package lintcode;

import leetcodeEasy.TreeNode;

public class BinaryTreeLongestConsecutiveSequence {
	public int longestConsecutive(TreeNode root) {
		int longest = 0;
		helper(root);
		return longest;
	}
	private int longest;
	private int helper(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = helper(root.left);
		int right = helper(root.right);
		int sublongest = 1;
		if (root.left != null && root.val + 1 == root.left.val) {
			sublongest = Math.max(sublongest, left+1);
		}
		if (root.right != null && root.val + 1 == root.right.val) {
			sublongest = Math.max(sublongest, right+1);
		}
		if (sublongest > longest) {
			longest = sublongest;
		}
		return sublongest;
	}
}
