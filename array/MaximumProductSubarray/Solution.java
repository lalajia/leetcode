package MaximumProductSubarray;

/**
 * Given an integer array nums, find a subarray that has the largest product, and return the
 * product.
 *
 * Input: nums = [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product 6.
 */
public class Solution {
  public static void main(String args[]) {
    int[] nums = new int[] { -1, 0, -2 };
    int res = maxProduct(nums);
    System.out.println(res);
  }

  public static int maxProduct(int[] nums) {
    /*int max = nums[0];
    int min = nums[0];
    int res = nums[0];
    for (int i = 1; i < nums.length; i++) {
      //      if (nums[i] == 0) {
      //        return 0;
      //      }
      //用x代替max防止min的时候重复相乘
      int x = max;
      //当nums中有0的时候选择更大的值
      //从i=1开始，max和min是i-1等同于nums[i-1]* nums[i]
      max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
      min = Math.min(Math.min(min * nums[i], x * nums[i]), nums[i]);
      res = Math.max(max, res);

    }
    return res;*/

    //brute force from lancy
    int result = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int product = 1;
      int max = Integer.MIN_VALUE;
      for (int j = i; j < nums.length; j++) {
        product *= nums[j];
        max = Math.max(product, max);
      }
      result = Math.max(result, max);
    }
    return result;
  }
}
