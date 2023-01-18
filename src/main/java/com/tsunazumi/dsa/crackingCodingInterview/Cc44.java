package com.tsunazumi.dsa.crackingCodingInterview;

import com.tsunazumi.dsa.structures.TreeNode;

public class Cc44 {

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
    System.out.println(node.getSize());
    System.out.println(isBalanced(node));

  }
  
  static boolean isBalanced(TreeNode root) {
    return checkHeight(root) != Integer.MIN_VALUE;
  }
  
  static int checkHeight(TreeNode root) {
    if (root == null) return -1;
    
    int leftHeight = checkHeight(root.left);
    if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
    
    int rightHeight = checkHeight(root.right);
    if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
    
    int heightDiff = leftHeight - rightHeight;
    if (Math.abs(heightDiff) > 1) {
      return Integer.MIN_VALUE;
    }
    else {
      return Math.max(leftHeight, rightHeight) + 1;
    }
  }
  
  /*
  public static int getHeight(TreeNode root) {
    if (root == null) return -1;
    return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
  }
  
  public static boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    
    int heightDiff = getHeight(root.left) - getHeight(root.right);
    if (Math.abs(heightDiff) > 1) {
      return false;
    }
    else {
      return isBalanced(root.left) && isBalanced(root.right);
    }
  }
  */

}
