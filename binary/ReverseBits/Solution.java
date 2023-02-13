package ReverseBits;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Note:
 *
 * Note that in some languages, such as Java, there is no unsigned integer type. In this case, both
 * input and output will be given as a signed integer type. They should not affect your
 * implementation, as the integer's internal binary representation is the same, whether it is signed
 * or unsigned. In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 2 above, the input represents the signed integer -3 and the output
 * represents the signed integer -1073741825.
 */

public class Solution {
  public static void main(String args[]) {
    int n = 00000000000000000000001010011100;
    int res = reverseBits(n);
    System.out.println(res);
  }

  public static int reverseBits(int n) {

    int ans = 0;

    for (int i = 0; i < 32; i++) {
      //ans往前进一位
      ans <<= 1;
      //如果n这一位有1的话给ans最后一位加1
      ans |= (n & 1);
      //n往后消一位
      n >>= 1;
    }
    return ans;

  }
}
