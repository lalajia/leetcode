package CS5800;

// Java program to print Longest Path
// from root to leaf in a Binary tree

import java.util.ArrayList;

public class Diameter {
  public static int res;

  // Driver Code
  public static void main(String[] args) {
    Node root = newNode('a');
//    root.left = newNode('b');
    root.right = newNode('c');
//    root.left.left = newNode('d');
//    root.left.right = newNode('e');
//    root.left.right.left = newNode('x');
    root.right.left = newNode('f');
    root.right.right = newNode('g');
    root.right.right.right = newNode('k');
    root.right.right.right.right = newNode('p');
    root.right.left.left = newNode('h');
    root.right.left.right = newNode('i');
    root.right.left.left.left = newNode('m');
    root.right.left.left.left.right = newNode('q');
    root.right.left.left.left.right.left = newNode('l');

    int output = longestPath(root);
    System.out.print(output);
  }

  // Binary tree node
  static class Node {
    Node left;
    Node right;
    char data;
  }

  ;

  // Function to create a new
  // Binary node
  static Node newNode(char data) {
    Node temp = new Node();

    temp.data = data;
    temp.left = null;
    temp.right = null;

    return temp;
  }

  // Function to find and return the
  // longest path
  public static ArrayList<Character> longestPathNode(Node root) {

    // If root is null means there
    // is no binary tree so
    // return a empty vector
    if (root == null) {
      ArrayList<Character> output = new ArrayList<>();
      return output;
    }

    // Recursive call on root.right
    ArrayList<Character> right = longestPathNode(root.right);

    // Recursive call on root.left
    ArrayList<Character> left = longestPathNode(root.left);

    // Compare the size of the two ArrayList
    // and insert current node accordingly
    if (right.size() < left.size()) {
      left.add(root.data);
    } else {
      right.add(root.data);
    }

    // Return the appropriate ArrayList
    return (left.size() > right.size() ? left : right);
  }

  public static int longestPath(Node node) {

    if (node != null) {
      longestPath(node.left);
      int left = longestPathNode(node.left).size();
      longestPath(node.right);
      int right = longestPathNode(node.right).size();
      int temp = left + right;
//      System.out.println(temp);
      res = Math.max(temp, res);
    }
    return res;
  }

}


