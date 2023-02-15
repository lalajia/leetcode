package CoinChange;

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
    int[] coins = new int[] { 1, 2, 5 };
    int res = coinChange(coins, 11);
    System.out.println(res);
  }

  public static int coinChange(int[] coins, int amount) {
    return 0;
  }
}
