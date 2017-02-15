package leetcodeMedium;

import leetcodeEasy.TreeNode;
//#105, the first item in preorder is the root of the tree
//in inorder, left of the root item should be left-subtree
//right, of the root item should be right-subtree
//recursively build left-subtree and right-subtree
//pay attention to the starting, ending and condition indexes
public class ConstructBinaryTree {
  public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder == null || inorder == null) return null;
		return helper(0, 0, inorder.length-1, preorder, inorder);
	}
	private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
		if (preStart > preorder.length-1 || inStart > inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[preStart]);
		int index = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == root.val) {
				index = i;
			}
		}
		root.left = helper(preStart+1, inStart, index-1, preorder, inorder);
		root.right = helper(preStart+(index-inStart)+1,index+1,inEnd, preorder, inorder);
		return root;
	}        
}
