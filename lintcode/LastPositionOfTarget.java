package lintcode;

public class LastPositionOfTarget {
	public int lastPosition(int[] nums, int target) {
		if (nums == null || nums.length == 0) return -1;
		int left = 0;
		int right = nums.length-1;
		while (left + 1 < right) {
			int mid = left + (right-left)/2;
			if (nums[mid] < target) {
				left = mid+1;
			} if (nums[mid] > target) {
				right = mid-1;
			} if (nums[mid] == target) {
				left = mid;
			}
		}
		if (nums[right] == target) {
			return right;
		}
		if (nums[left] == target) {
			return left;
		}
		return -1;	
	}
}
