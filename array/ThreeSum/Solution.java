package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i !=
 * j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 */
public class Solution {
  public static void main(String args[]) {
    int[] nums = new int[] { -1, -2, -1, 2, 0, 1 };
    List<List<Integer>> res = threeSum(nums);
    System.out.println(res);
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums); //[-2 ,-1, -1, 0, 1, 2]

    List<List<Integer>> list = new ArrayList<>();
    //List<Integer> intList = new ArrayList<>();
    if (nums[0] > 0) {
      return list;
    }
    for (int i = 0; i < nums.length; i++) {
      if (i == 0 || nums[i - 1] != nums[i]) {

        int target = 0 - nums[i];
        int left = i + 1;
        int right = nums.length - 1;
        //left不能等于right因为到中心的时候会重复如果相同的数字会重复
        while (left < right) {
          if (nums[left] + nums[right] == target) {
            //每一次要刷新
            List<Integer> intList = new ArrayList<>();
            //。。。是nums[i]不是i
            intList.add(nums[i]);
            intList.add(nums[left]);
            intList.add(nums[right]);
            list.add(intList);
            //第一次没有考虑后续数字重复的问题。
            while (left < right && nums[left] == nums[left + 1]) {
              left++;
            }
            while (left < right && nums[right] == nums[right - 1]) {
              right--;
            }
            //要继续挪左右指针到下一个位置
            left++;
            right--;
          } else if (nums[left] + nums[right] < target) {
            left++;
          } else {
            right--;
          }
        }
      }
    }
    return list;
  }
}
