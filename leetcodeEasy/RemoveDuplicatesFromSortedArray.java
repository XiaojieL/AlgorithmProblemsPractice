package leetcodeEasy;
//#26
public class RemoveDuplicatesFromSortedArray {
 public int removeDuplicates(int[] nums) {
	 if (nums == null || nums.length == 0) return -1;
	 int j = 0;
	 int count = 0;
	 for (int i = 0; i < nums.length; i++) {
		 if (nums[i] != nums[j]) {
			 count++;
			 j = i;
		 }
	 }
	 return count;
 }
}
