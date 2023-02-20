package CoinChange;

import java.util.Arrays;

/**
 * You are given an integer array coins representing coins of different denominations and an integer
 * amount representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money
 * cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 */
public class Solution {

  public static void main(String args[]) {
    int[] coins = new int[] { 1, 2, 5};
    int res = coinChange(coins, 11);
    System.out.println(res);
  }

  //DP
  public static int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0;
    //如果amount是0就不行了 dp[1] = 1;
    for (int i = 0; i < dp.length; i++) {
      for (int coin : coins) {
        if (i - coin >= 0) {
          dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
        }
      }
    }
    //判断amount要求比coins多1
    return (dp[amount] == amount + 1) ? -1 : dp[amount];
  }
}
