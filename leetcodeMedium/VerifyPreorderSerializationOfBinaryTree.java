package leetcodeMedium;

import java.util.Stack;

public class VerifyPreorderSerializationOfBinaryTree {
	public boolean isValidSerialization(String preorder) {
		if (preorder == null || preorder.length() == 0) return false;
		String[] nodes = preorder.split(",");
		Stack<String> stack = new Stack<>();
		for (String s : nodes) {
			while (s.equals("#") && !stack.isEmpty() && s.equals(stack.peek())) {
				stack.pop();
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
			stack.push(s);
		}
		return stack.size() == 1 && stack.peek().equals("#");
	}
}
