package leetcodeEasy;
//#104
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
	}
}
