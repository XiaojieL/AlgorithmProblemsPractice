package leetcodeMedium;

import leetcodeEasy.TreeNode;
//#116, the condition is it's perfect binary tree
public class PopulatingNextRightPointersInEachNode {
	public void connect(TreeNode root) {
		if (root == null) return;
		if (root != null) {
			if (root.left != null) {
				//since root.left is not null, it's perfect binary tree, root.right
				//must not be null, set root.left.next = root.right
				root.left.next = root.right;
				if (root.next != null) {
					//since root.next is not null, and root has next level,
					//as perfect binary tree, root.next also has next level
					root.right.next = root.next.left;
				}
			}
		}
		connect(root.left);
		connect(root.right);
	}
}
