package com.tsunazumi.dsa.crackingCodingInterview;

import com.tsunazumi.structures.TreeNode;

public class Cc40 {

  public static void main(String[] args) {
    TreeNode l2rightl1right = new TreeNode(1, null, null);
    TreeNode l2leftl1right = new TreeNode(2, null, null);
    TreeNode l1right = new TreeNode(3, l2rightl1right, l2leftl1right);

    TreeNode l2rightl1left = new TreeNode(4, null, null);
    TreeNode l2leftl1left = new TreeNode(5, null, null);
    TreeNode l1left = new TreeNode(6, l2rightl1left, l2leftl1left);
    TreeNode node1 = new TreeNode(0, l1right, l1left);
    inOrderTraversal(node1);
    System.out.println();
    preOrderTraversal(node1);
    System.out.println();
    postOrderTraversal(node1);
  }

  public static void inOrderTraversal(TreeNode node) {
    if (node != null) {
      inOrderTraversal(node.left);
      System.out.println(node);
      inOrderTraversal(node.right);
    }
  }

  public static void preOrderTraversal(TreeNode node) {
    if (node != null) {
      System.out.println(node);
      inOrderTraversal(node.left);
      inOrderTraversal(node.right);
    }
  }

  public static void postOrderTraversal(TreeNode node) {
    if (node != null) {
      inOrderTraversal(node.left);
      inOrderTraversal(node.right);
      System.out.println(node);
    }
  }
}
