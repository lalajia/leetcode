package MaximumSubarray;

/*Given an integer array nums, find the subarray with the largest sum, and return its sum.
* Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.*/
public class Solution {
  public static void main(String args[]) {
    int[] nums1 = new int[] { -2, -1 };
    int[] nums2 = new int[] { 1 };
    int res = maxSubArray(nums1);
    System.out.println(res);
  }

  /*贪心算法*/
  public static int maxSubArray(int[] nums) {
    //需要主意在max值的时候一般都要等于最小值
    int res = 0, max = Integer.MIN_VALUE;
    if (nums.length == 0) {
      return 0;
    } else if (nums.length == 1) {
      return nums[0];
    }
    for (int i = 0; i < nums.length; i++) {
      //      if (res < 0){
      //        res = 0;
      //      }
      //      else if (res >= 0) {
      //        res += nums[i];
      //      }
      //保留nums[i]和前面的数加nums[i]最大的，如果不如之前的大，就全部放弃
      res = Math.max(res + nums[i], nums[i]);
      max = Math.max(max, res);

    }
    return max;
  }
}
