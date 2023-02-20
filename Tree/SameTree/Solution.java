package SameTree;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or
 * not.
 *
 * Two binary trees are considered the same if they are structurally identical, and the nodes have
 * the same value.
 */
public class Solution {
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static void main(String args[]) {
    TreeNode rootOne = new TreeNode(3);
//    rootOne.left = new TreeNode(9);
//    rootOne.right = new TreeNode(20);
    TreeNode rootTwo = new TreeNode(3);
//    rootTwo.left = new TreeNode(9);
//    rootTwo.right = new TreeNode(20);
    System.out.println(isSameTree(rootOne, rootTwo));
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    //对比到头的时候需要两者相等
    if (p == null && q == null)
      return true;
    if (p == null || q == null)
      return false;
    //compare value
    if (p.val != q.val)
      return false;
    //一个一个对比的node和val，先走完左边的再走右边的
    Boolean typeLeft = isSameTree(p.left, q.left);
    Boolean typeRight = isSameTree(p.right, q.right);
    if (typeRight && typeLeft) {
      return true;
    } else {
      return false;
    }
  }
}
