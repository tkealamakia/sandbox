package com.tsunazumi.algorithms.crackingCodingInterview;

import com.tsunazumi.algorithms.structures.TreeNode;

public class Cc45b {

  static int index = 0;
  static Integer last_printed = null;

  public static void main(String[] args) {
    int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    TreeNode node = Cc42.createMinimalBST(values);
    /*
    node.left.left.left = new TreeNode(20);
    node.left.left.left.left = new TreeNode(30);
    node.left.left.left.right = new TreeNode(40);
    node.left.left.left.right.left = new TreeNode(40);
    node.left.left.left.right.left.left = new TreeNode(50);
    */
    System.out.println(checkBST(node));

  }

  static boolean checkBST(TreeNode n) {
    return checkBST(n, null, null);
  }

  static boolean checkBST(TreeNode n, Integer min, Integer max) {
    if (n == null) {
      return true;
    }
    if ((min != null && n.value <=min) || (max != null && n.value > max)) {
      return false;
    }
    if (!checkBST(n.left, min, n.value) || !checkBST(n.right, n.value, max)) {
      return false;
    }
    return true;
  }

}
