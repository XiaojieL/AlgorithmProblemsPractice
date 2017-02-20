package leetcodeEasy;
import java.util.*;

//#506
public class RelativeRank {
	public String[] findRelativeRanks(int[] nums) {
		String[] result = new String[nums.length];
		if (nums == null || nums.length == 0) {
			return result;
		}
		Map<Integer, String> map = new HashMap<>();
		int[] tempCopy = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			tempCopy[i] = nums[i];
		}
		
		Arrays.sort(tempCopy);
		for (int i = tempCopy.length-1; i >= 0; i--) {
			if (i == tempCopy.length-1) {
				map.put(tempCopy[i], "Gold Medal");
			}
			if (i == tempCopy.length-2) {
				map.put(tempCopy[i], "Silver Medal");
			}
			if (i == tempCopy.length-3) {
				map.put(tempCopy[i], "Bronze Medal");
			}
			map.put(tempCopy[i], String.valueOf(tempCopy.length-i));
		}
		
		for (int i = 0; i < nums.length; i++) {
			result[i] = map.get(nums[i]);
		}
		return result;
	}
}
