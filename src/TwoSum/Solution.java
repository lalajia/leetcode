package TwoSum;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
  public static void main(String args[]) {
    int[] nums = new int[] { 2, 3, 5, 7};
    int target = 5;
    int[] res = twoSum(nums, target);
    System.out.println(Arrays.toString(res));
  }

  /*public static int[] twoSum(int[] nums, int target) {
    Hashtable<Integer, Integer> table = new Hashtable<>();
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
    //key value
      table.put(i, nums[i]);
    }
    for (int i = 0; i < table.size(); i++) {
      if (table.contains(target - table.get(i))) {
        table.get(0);
      }
    }
    return result;
  }*/

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> table = new HashMap<>();
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      if (table.containsKey(target - nums[i])) {
        result[0] = table.get(target - nums[i]);
        result[1] = i;

      }
      table.put(nums[i], i);
    }
    return result;
  }
}
