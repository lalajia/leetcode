package MissingNumber;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in
 * the range that is missing from the array.
 */
public class Solution {
  public static void main(String args[]) {
    int[] nums = new int[] { 3, 0, 1 };
    int res = missingNumber(nums);
    System.out.println(res);
  }


  public static int missingNumber(int[] nums) {
    int res = 0;
    //    Method 1 sort and find
    //    Arrays.sort(nums);
    //    for (int i = 0; i < nums.length; i++) {
    //      if (nums[i] != i) {
    //        res = i;
    //      }
    //    }

    //    Method 2 HashSet
    //    Set<Integer> set = new HashSet<>();
    //    for (int i = 0; i < nums.length; i++) {
    //      set.add(nums[i]);
    //    }
    //    for (int i = 0; i < nums.length; i++) {
    //      if (!set.contains(i)) {
    //        res = i;
    //      }
    //    }

    //    Method 3 XOR
    //    for (int i = 0; i < nums.length; i++) {
    //      res ^= nums[i];
    //    }
    //    for (int i = 0; i <= nums.length; i++) {
    //      res ^= i;
    //    }


    // Method 4 Math Calculation
    int n = nums.length;
    int sum = n * (n + 1) / 2;
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += nums[i];
    }
    res = sum - total;
    return res;
  }
}
