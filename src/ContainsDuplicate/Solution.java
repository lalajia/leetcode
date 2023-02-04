package ContainsDuplicate;

/*Given an integer array nums, return true if any value appears at least twice in the array, and
return false if every element is distinct.
Example 1:

Input: nums = [2,3,1,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public static void main(String args[]) {
    int[] pieces = new int[] { 1, 2, 3, 1 };
    Boolean res = containsDuplicate(pieces);
    System.out.println(res);
  }

  public static boolean containsDuplicate(int[] nums) {
    int res = 0;
    //ArrayList<Integer> list = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      //set.add(nums[i]);
      //不需要重复的add
      if (!set.add(nums[i])) {
        return true;
      }
      //      res = nums[i];
      //      if(list.contains(res) ) {
      //        return true;
      //      }
      //      list.remove(i);
    }
    return false;
  }
}
