package ProductofArrayExceptSelf;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product
 * of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class Solution {
  public static void main(String args[]) {
    int[] array = new int[] { 3, 4, 1, 3 };
    int[] res = productOfArrayExceptSelf(array);
    System.out.println(Arrays.toString(res));
  }

  public static int[] productOfArrayExceptSelf(int[] nums) {
    //想到了记录左边的数，记录右边的数，两者相乘
    int length = nums.length;
    int[] left = new int[length];
    int[] right = new int[length];
    int[] res = new int[length];
    left[0] = 1;
    for (int i = 1; i < length; i++) {
      //left[i] = nums[i] * left[i-1];
      left[i] = nums[i - 1] * left[i - 1];
    }
    right[length - 1] = 1;
    for (int i = length - 2; i >= 0; i--) {
      //right[i] = nums[i] * right[i+1];
      right[i] = nums[i + 1] * right[i + 1];
    }

    for (int i = 0; i < length; i++) {
      res[i] = left[i] * right[i];
    }

    return res;
  }

  public static int[] productOfArrayExceptSelf2(int[] nums) {
    //想到了记录左边的数，记录右边的数，两者相乘
    int length = nums.length;
    int[] left = new int[length];
    int R = 1;
    int[] res = new int[length];
    left[0] = 1;
    for (int i = 1; i < length; i++) {
      left[i] = nums[i - 1] * left[i - 1];
    }
    for (int i = length - 1; i >= 0; i--) {

      res[i] = res[i] * R;
      R = R * nums[i];
    }

    return res;
  }
}