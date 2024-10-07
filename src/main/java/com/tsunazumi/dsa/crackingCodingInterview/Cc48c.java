package com.tsunazumi.dsa.crackingCodingInterview;

import com.tsunazumi.structures.Result;
import com.tsunazumi.structures.TreeNode;

public class Cc48c {

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
    Result r = commonAncestorHelper(root, p, q);
    if (r.isAncestor) {
      return r.node;
    }
    return null;
  }

  public static Result commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return new Result(null, false);

    if (root == p && root == q) {
      return new Result(root, true);
    }

    Result rx = commonAncestorHelper(root.left, p, q);
    if (rx.isAncestor) {
      return rx;
    }

    Result ry = commonAncestorHelper(root.right, p, q);
    if (ry.isAncestor) {
      return ry;
    }

    if (rx.node != null && ry.node != null) {
      return new Result(root, true);
    }
    else if (root == p || root == q) {
      /* If we're currently at p or q, and we also found one of those nodes in a
       * subtree, then this is truly an ancestor and the flag should be true.
       */
      boolean isAncestor = rx.node != null || ry.node != null;
      return new Result(root, isAncestor);
    }
    else {
      return new Result(rx.node != null ? rx.node : ry.node, false);
    }
  }

}
