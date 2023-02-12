package SumofTwoIntegers;

/**
 * Given two integers a and b, return the sum of the two integers without using the operators + and
 * -.
 */
public class Solution {
  public static void main(String args[]) {
    int a = 4;
    int b = 9;
    int res = getSum(a, b);
    System.out.println(res);
  }

  public static int getSum(int a, int b) {

    while (b != 0) {
      int temp = (a & b) << 1;
      a = a ^ b;
      b = temp;
    }
    return a;
  }
}
