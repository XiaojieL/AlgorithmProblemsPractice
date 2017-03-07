package leetcodeEasy;
import java.util.*;
//#496
public class NextGreaterElementI {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] result = new int[findNums.length];
		if (findNums == null || nums == null || nums.length == 0) {
			return result;
		}
		//map is used to store a given num and its next greater num when exists
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		for (int n : nums) {
			while (!stack.isEmpty() && n > stack.peek()) {
				map.put(stack.pop(), n);
			}
			stack.push(n);
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = map.getOrDefault(findNums[i], -1);
		}
		return result;
	}
}
