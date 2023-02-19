package ContainerWithMostWater;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the
 * two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains
 * the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 */
public class Solution {
  public static void main(String args[]) {
    int[] height = new int[] { 2, 3, 10, 5, 7, 8, 9 };
    int res = maxArea(height);
    System.out.println(res);
  }

  public static int maxArea(int[] height) {
    //    int left = 0;
    //    int right = height.length - 1;
    //    int maxOne = 0;
    //    int maxTwo = 0;
    //    int res = 0;
    //    while (left < right) {
    //      if (height[left] < height[right]) {
    //        maxOne = Math.max(maxOne, Math.min(height[left], height[right]) * (right - left));
    //        left ++;
    //      }
    //      maxTwo = Math.max(maxTwo, Math.min(height[left], height[right]) * (right - left));
    //      res = Math.max(maxOne, maxTwo);
    /**
     * right -- 一定要放在if condition里面不然每次while都会right --
     */
    //      right --;
    //    }
    //    return res;

    if (height.length < 2)
      return 0;
    int left = 0;
    int right = height.length - 1;
    int max = 0;
    //不用等号也行
    while (left < right) {
      //      max = Math.max(height[left], max);
      //      left++;
      max = Math.max((right - left) * Math.min(height[left], height[right]), max);
      /**
       * 哪边更差动哪边
       */
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return max;
    //超时
    //    if (height.length < 2)
    //      return 0;
    //    int res = 0;
    //    for (int i = 0; i < height.length; i++) {
    //      for (int j = 0; j < height.length; j++) {
    //        res = Math.max((j - i) * Math.min(height[i], height[j]), res);
    //      }
    //    }
    //    return res;
  }
}
