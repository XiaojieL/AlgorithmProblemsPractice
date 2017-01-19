package leetcodeEasy;

import javax.swing.tree.TreeNode;

//#110 method1: use a helper function to measure each node's height,
//              compare height at each level, O(N^2)
//     method2: dfs, return the height of the current node
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		return helper(root) != -1;
		
	}
	private int helper(TreeNode root) {
		if (root == null) return 0;
		int leftHeight = helper(root.left);
		if (leftHeight == -1) return -1;
		int rightHeight = helper(root.right);
		if (rightHeight == -1) return -1;
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return -1;
		}
		return Math.max(leftHeight, rightHeight) + 1;		
	}

}
