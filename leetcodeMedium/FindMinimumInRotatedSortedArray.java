package leetcodeMedium;
//#153 keep in mind the comparison should always be between
//the num at mid position versus the num at the end of array
public class FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
		if (nums == null || nums.length == 0) return -1;
		int left = 0;
		int right = nums.length-1;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			//should always compare mid versus the last item in array
			if (nums[mid] > nums[nums.length-1]) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (nums[left] > nums[right]) {
			return nums[right];
		}
		return nums[left];
	}

}
