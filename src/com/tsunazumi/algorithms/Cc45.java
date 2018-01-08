package com.tsunazumi.algorithms;

import com.tsunazumi.algorithms.structures.TreeNode;

public class Cc45 {

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
    if (n == null) return true;

    if (!checkBST(n.left)) return false;

    if (last_printed != null && n.value <= last_printed) {
      return false;
    }
    last_printed = n.value;

    if (!checkBST(n.right)) return false;

    return true;
  }

  /*
  static boolean checkBST(TreeNode root) {
    int[] array = new int[root.getSize()];
    copyBST(root, array);
    for (int i = 1; i < array.length; i++) {
      if (array[i] <= array[i-1]) return false;
    }
    return true;
  }

  static void copyBST(TreeNode root, int[] array) {
    if (root == null) return;
    copyBST(root.left, array);
    array[index] = root.value;
    index++;
    copyBST(root.right, array);
  }
  */
}
