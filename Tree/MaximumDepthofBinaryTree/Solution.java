package MaximumDepthofBinaryTree;

/**
 * Definition for a binary tree node.
 */

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node
 * down to the farthest leaf node.
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
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = null;
    root.left.right = null;
    root.right = new TreeNode(20);
    root.right.right = new TreeNode(15);
    root.right.right = new TreeNode(12);
    System.out.println(maxDepth(root));
  }

  public static int maxDepth(TreeNode root) {
    if (root == null)
      return 0;
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return 1 + Math.max(left, right);
  }

}
