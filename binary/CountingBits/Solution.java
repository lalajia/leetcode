package CountingBits;

import java.util.Arrays;

/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i. Input: n = 5 Output: [0,1,1,2,1,2]
 * Explanation: 0 --> 0 1 --> 1 2 --> 10 3 --> 11 4 --> 100 5 --> 101
 */
public class Solution {
  public static void main(String args[]) {
    int n = 5;
    int[] res = countBits(n);
    System.out.println(Arrays.toString(res));
  }

  public static int[] countBits(int n) {
    int[] res = new int[n + 1];
    int count = 0;
    int temp = n;
    for (int i = 0; i < res.length; i++) {
      n = temp - i;
      while (n != 0) {
        n = n & (n - 1);
        count++;
      }
      res[res.length - 1 - i] = count;
      count = 0;
    }
    return res;
  }

//  int[] ones = new int[n+1];
// 	for(int i=0;i<n+1;i++){
//    ones[i] = ones[i/2] + i%2;
//  }
// 	return ones;

}
