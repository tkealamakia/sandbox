package com.tsunazumi.dsa.leetcode;

import com.tsunazumi.dsa.structures.TreeNode;


public class MaxDepth {
  public static void main(String[]args){
    TreeNode fifteen = new TreeNode(15);
    TreeNode seven = new TreeNode(7);
    TreeNode twenty = new TreeNode(20);
    TreeNode nine = new TreeNode(9);
    TreeNode three = new TreeNode(3);
    three.left = nine;
    three.right = twenty;
    twenty.left = seven;
    twenty.right = fifteen;
    System.out.println(maxDepth(three));
  }

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    if (left > right) {
      return left + 1;
    }
    return right + 1;
  }

}
