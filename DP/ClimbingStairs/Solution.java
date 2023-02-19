package ClimbingStairs;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class Solution {

  public static void main(String args[]) {
    int n = 0;
    int res = climbStairs(n);
    System.out.println(res);
  }

  //  //optimal
  //  public static int climbStairs(int n) {

  //  }
  //
  //bottom up

  public static int climbStairs(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i < dp.length; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  //  //top down with memo[]
  //  public static int climbStairs(int n) {
  //    return 1;
  //  }
  //
  //  private static int climbStairs(int n, int[] memo) {
  //    return 1;
  //  }

}
