package MaximumProductSubarray;

/**
 * Given an integer array nums, find a subarray that has the largest product, and return the
 * product.
 *
 * Input: nums = [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product 6.
 */
public class Solution {
  public static void main(String args[]) {
    int[] nums = new int[] { -2, 3, -2, 4 };
    int res = maxProduct(nums);
    System.out.println(res);
  }

  public static int maxProduct(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int res = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == 0) {
        return 0;
      } else if (nums[i] > 0) {
        max = Math.max(max * nums[i], min * nums[i]);
      } else {
        min = Math.min(min * nums[i], max * nums[i]);
      }
      res = Math.max(max, res);

    }
    return res;
  }
}
