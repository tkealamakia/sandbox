package com.tsunazumi.dsa.leetcode;

import com.tsunazumi.structures.TreeNode;

public class ValidateBinarySearchTree {
  public static void main(String[] args) {
//    TreeNode one = new TreeNode(1);
//    TreeNode three = new TreeNode(3);
//    TreeNode six = new TreeNode(6);
//    TreeNode four = new TreeNode(4, six, three);
//    TreeNode five = new TreeNode(5, four, one);
//    System.out.println(isValidBST(five));
    TreeNode var1 = new TreeNode(2);
    TreeNode var2 = new TreeNode(2);
    TreeNode var3 = new TreeNode(2, var1, var2);
    System.out.println(isValidBST(var3));
  }

  public static boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (root.left != null && root.value <= root.left.value) {
      return false;
    } else {
      isValidBST(root.left);
    }
    if (root.right != null && root.value >= root.right.value) {
      return false;
    } else {
      isValidBST(root.right);
    }
    return true;
  }
}

