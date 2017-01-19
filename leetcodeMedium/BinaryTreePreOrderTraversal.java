package leetcodeMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//#144
public class BinaryTreePreOrderTraversal {
	public List<Integer> preOrderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null) return result;
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			TreeNode cur = s.pop();
			result.add(cur.val);
			if (cur.right != null) {
				s.push(cur.right);
			}
			if (cur.left != null) {
				s.push(cur.left);
			}
		}
		return result;
	}
}
