package leetcodeMedium;
//#162 compare nums at mid versus nums at mid-1 and mid+1
//return index
public class FindPeakElement {
	public int findPeakElement(int[] nums) {
		if (nums == null || nums.length == 0) return -1;
		int left = 0;
		int right = nums.length - 1;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] > nums[mid-1]) {
				left = mid;
			}
			else if (nums[mid] > nums[mid+1]) {
				right = mid;
			}
			//when nums[mid] is smaller than both its left and right side
			else {
				right = mid;
			}
		}
		if (nums[left] > nums[right]) {
			return left;
		}
		return right;
	}
}
