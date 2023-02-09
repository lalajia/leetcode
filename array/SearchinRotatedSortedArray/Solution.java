package SearchinRotatedSortedArray;

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1
 * <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1],
 * nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at
 * pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of
 * target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4
 */
public class Solution {
  public static void main(String args[]) {
    int[] array = new int[] { 3, 1 };
    int target = 1;
    int res = searchInRotatedSortedArray(array, target);
    System.out.println(res);
  }

  public static int searchInRotatedSortedArray(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      //想不明白为什么一定是等号在前面
      if (nums[left] <= nums[mid]) {
        //第一次等号没有
        if (nums[left] <= target && target < nums[mid]) {
          right = mid - 1;
        }
        else {
          left = mid + 1;
        }
      }
      //等号在这里不行比如【3，1】target = 1
      else if (nums[left] > nums[mid]) {
        //第一次等号没有
        if (nums[mid] < target && target <= nums[right]) {
          left = mid + 1;
        }
        else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}
