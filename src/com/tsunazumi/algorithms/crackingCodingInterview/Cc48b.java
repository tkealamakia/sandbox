package com.tsunazumi.algorithms.crackingCodingInterview;

import com.tsunazumi.algorithms.structures.TreeNode;

public class Cc48b {

  public static void main(String [] args) {
    TreeNode three = new TreeNode(3);
    TreeNode seven = new TreeNode(7);
    TreeNode five = new TreeNode(5);
    five.left = three;
    five.right = seven;
    three.parent = five;
    seven.parent = five;

    TreeNode seventeen = new TreeNode(17);
    TreeNode fifteen = new TreeNode(15);
    fifteen.right = seventeen;
    seventeen.parent = fifteen;

    TreeNode ten = new TreeNode(10);
    ten.left = five;
    ten.right = fifteen;
    five.parent = ten;
    fifteen.parent = ten;

    TreeNode twenty = new TreeNode(20);
    TreeNode thirty = new TreeNode(30);
    twenty.left = ten;
    twenty.right = thirty;
    thirty.parent = twenty;
    ten.parent = twenty;

    TreeNode common = commonAncestor(twenty, seven, seventeen);
    System.out.println(common);
  }

  public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    /* check if either node is not in the tree, or if one covers the other. */
    if (!covers(root, p) || !covers(root, q)) {
      return null;
    }
    else if (covers(p, q)) {
      return p;
    }
    else if (covers(q, p)) {
      return q;
    }

    /* Traverse upwards until you find a node that covers q. */
    TreeNode sibling = getSibling(p);
    TreeNode parent = p.parent;
    while (!covers(sibling, q)) {
      sibling = getSibling(parent);
      parent = parent.parent;
    }
    return parent;
  }

  public static boolean covers(TreeNode root, TreeNode p) {
    if (root == null) return false;
    if (root == p) return true;
    return covers(root.left, p) || covers(root.right, p);
  }

  public static TreeNode getSibling(TreeNode node) {
    if (node == null || node.parent == null) {
      return null;
    }
    TreeNode parent = node.parent;
    return parent.left == node ? parent.right : parent.left;
  }

}
