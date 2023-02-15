package CS5800;

import java.util.Arrays;

public class CoutingSort {
  public static void main(String args[]) {
    int[] nums = new int[] { 6, 0, 3, 2, 7, 9 };
    int[] res = countingSort(nums);
    System.out.println(Arrays.toString(res));
  }

  public static int[] countingSort(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int num : nums) {
      if (num >= max)
        max = num + 1;
    }


    //count array all 0
    // 0 0 0 0
    int[] count = new int[max];

    for (int i = 0; i < max; i++) {
      count[i] = 0;
    }

    //count how many each nums in nums array put them in the count arrqy with correspond index
    //1 3 1 1
    for (int i = 0; i < nums.length; i++) {
      count[nums[i]]++;
    }

    //add them together
    //1 4 5 6
    for (int i = 1; i < max; i++) {
      count[i] += count[i - 1];
    }

    int[] output = new int[nums.length];
    //0 - 1-1 1 - 4-1 2 - 5-1 3 - 6-1
    for (int i = output.length - 1; i >= 0; i--) {
      output[count[nums[i]] - 1] = nums[i];
      count[nums[i]]--;
    }

    return output;
  }
}
