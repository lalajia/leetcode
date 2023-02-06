package FindMinimuminRotatedSortedArray;

/**
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For
 * example, the array nums = [0,1,2,4,5,6,7] might become:
 *
 * [4,5,6,7,0,1,2] if it was rotated 4 times. [0,1,2,4,5,6,7] if it was rotated 7 times. Notice that
 * rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0],
 * a[1], a[2], ..., a[n-2]].
 *
 * Given the sorted rotated array nums of unique elements, return the minimum element of this
 * array.
 *
 * You must write an algorithm that runs in O(log n) time.
 */
public class Solution {
  public static void main(String args[]) {
    int[] nums = new int[] { 8, 0, 1, 2 };
    int res = findMinimumInRotatedSortedArray(nums);
    System.out.println(res);
  }

  public static int findMinimumInRotatedSortedArray(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int left = 0;
    int right = nums.length - 1;
    /* 不应该用for loop
    for (int i = 0; i < nums.length; i++) {

      int mid = left + (right - left)/2;
      if (nums[mid] > nums[right]) {
        left = mid;
      } else if (nums[mid] < nums[right]) {
        right = mid;
      } else {
        return nums[right];
      }*/
    /*while (left < right) {
      //在最小值右侧的元素（不包括最后一个元素本身），它们的值一定都严格小于x；而在最小值左侧的元素，它们的值一定都严格大于x。
      int mid = left + (right - left) / 2;
      if (nums[mid] < nums[right]) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return nums[left];*/
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] < nums[right]) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return nums[left - 1];

  }
}
