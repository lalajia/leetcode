package ClimbingStairs;

import java.util.Arrays;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class Solution {

  public static void main(String args[]) {
    int n = 5;
    int res = climbStairs(n);
    System.out.println(res);
  }

//  //optimal
//  public static int climbStairs(int n) {

//  }
//
  //bottom up

  public static int climbStairs(int n) {
    return 1;
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
