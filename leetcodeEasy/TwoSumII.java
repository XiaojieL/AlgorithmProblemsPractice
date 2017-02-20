package leetcodeEasy;

public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		if (numbers == null || numbers.length <= 0){
			return result;
		}
		int left = 0, right = numbers.length-1;
		while (left < right) {
			if (numbers[left] + numbers[right] > target) {
				right--;
			}
			if (numbers[left] + numbers[right] < target) {
				left++;
			}
			if (numbers[left] + numbers[right] == target) {
				result[0] = left;
				result[1] = right;
				return result;
			}
		}
		return result;
	}
}
