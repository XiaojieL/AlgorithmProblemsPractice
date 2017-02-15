package lintcode;

import leetcodeEasy.TreeNode;

public class MinimumSubtree {
	private class ResultType {
		public int sum;
		public ResultType(int sum) {
			this.sum = sum;
		}
	}
	
	private TreeNode sub = null;
	private ResultType subResult = null;
	
	public TreeNode findSubtree(TreeNode root) {
		helper(root);
		return sub;
	}
	
	private ResultType helper(TreeNode root) {
		if (root == null) {
			return new ResultType(0);
		}
		ResultType left = helper(root.left);
		ResultType right = helper(root.right);
		ResultType cur = new ResultType(left.sum + right.sum + root.val);
		if (sub == null || subResult.sum > cur.sum) {
			sub = root;
			subResult = cur;
		}
		return cur;
	}

}
