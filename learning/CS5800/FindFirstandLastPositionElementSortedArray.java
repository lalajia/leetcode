package CS5800;

import java.util.Arrays;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending
 * position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
 */
public class FindFirstandLastPositionElementSortedArray {
  public static void main(String args[]) {
    int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
    int[] res = searchRange(nums, 8);
    System.out.println(Arrays.toString(res));
  }

//  public static int[] searchRange(int[] nums, int target) {
//    int l = search(nums, target);
//    //找不到9也没关系因为return left会显示下一位
//    int r = search(nums, target + 1);
//    if (l == nums.length || nums[l] != target)
//      return new int[] { -1, -1 };
//    return new int[] { l, r - 1 };
//  }
//
//  //找>=target的第一个
//  public static int search(int[] nums, int target) {
//    int l = 0, r = nums.length;
//    while (l < r) {
//      int mid = (r + l) >> 1;
//      if (nums[mid] >= target)
//        r = mid;
//      else
//        l = mid + 1;
//    }
//    return l;
//  }

  public static int[] searchRange(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    /**
     * 初始设置为-1
     */
    int leftIndex = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        leftIndex = mid;
        right = mid - 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    left = 0;
    right = nums.length - 1;
    int rightIndex = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        rightIndex = mid;
        left = mid + 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    int[] res = new int[2];
    res[0] = leftIndex;
    res[1] = rightIndex;

    //if (res[0] != 0 && res[1] != 0)
    return res;
    // else
    // return new int[] {-1,-1};
  }

}
