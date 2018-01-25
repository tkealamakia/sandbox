package com.tsunazumi.algorithms;

import com.tsunazumi.algorithms.structures.TreeNode;

public class Cc46 {

  public static void main(String[] args) {
    int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    //TreeNode node = Cc42.createMinimalBST(values);
    TreeNode node = new TreeNode(100);
    node.right = new TreeNode(200);
    node.right.parent = node;
    node.right.left = new TreeNode(150);
    node.right.left.parent = node.right;
    node.right.right = new TreeNode(201);
    node.right.right.parent = node.right;
    node.left = new TreeNode(50);
    node.left.parent = node;
    node.left.left = new TreeNode(20);
    node.left.left.parent = node.left;
    node.left.right = new TreeNode(51);
    node.left.right.parent = node.left;
    /*
    node.left.left.left = new TreeNode(20);
    node.left.left.left.left = new TreeNode(30);
    node.left.left.left.right = new TreeNode(40);
    node.left.left.left.right.left = new TreeNode(40);
    node.left.left.left.right.left.left = new TreeNode(50);
    */
    System.out.println(inorderSucc(node));
    System.out.println(inorderSucc(node.left.right));

  }

  public static TreeNode inorderSucc(TreeNode n) {
    if (n == null) return null;
    if (n.right != null) {
      return leftMostChild(n.right);
    }
    else {
      TreeNode q = n;
      TreeNode x = q.parent;
      while (x != null && x.left != q) {
        q = x;
        x = x.parent;
      }
      return x;
    }
  }

  public static TreeNode leftMostChild(TreeNode n) {
    if (n == null) {
      return null;
    }
    while (n.left != null) {
      n = n.left;
    }
    return n;
  }
}
