package leetcodeEasy;
import java.util.*;
//#169
public class MajorityElement {
  public int majorityElement(int[] nums) {
    if (nums == null || nums.length == 0) return -1;
    Arrays.sort(nums);
    int len = nums.length;
    if (len % 2 != 0) return nums[len/2];
    else {
        int mid = len / 2;
        if (nums[mid] == nums[mid-1]) return nums[mid];
        else if (nums[mid] == nums[mid+1]) return nums[mid];
        else return nums[mid-1];
    }        
  }
}
