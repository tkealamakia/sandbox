package com.tsunazumi.dsa.crackingCodingInterview;

import com.tsunazumi.structures.TreeNode;

public class Cc48 {

  public static void main(String [] args) {
    TreeNode r1l = new TreeNode(2);
    TreeNode r1r = new TreeNode(3);
    TreeNode l1l = new TreeNode(4);
    TreeNode l1r = new TreeNode(5);

    TreeNode r1 = new TreeNode(6, r1r, r1l);
    r1r.parent = r1;
    r1l.parent = r1;
    TreeNode l1 = new TreeNode(7, l1r, l1l);
    l1r.parent = l1;
    l1l.parent = l1;


    TreeNode t1 = new TreeNode(1, r1, l1);
    r1.parent = t1;
    l1.parent = t1;

    TreeNode common = commonAncestor(r1l, r1r);
    System.out.println(common);
  }

  public static TreeNode commonAncestor(TreeNode p, TreeNode q) {
    int delta = depth(p) - depth(q); // get difference in depths
    TreeNode first = delta > 0 ? q : p; // get Shallower node
    TreeNode second = delta > 0 ? p : q; // get deeper node
    second = goUpBy(second, Math.abs(delta)); // move deeper node up

    // Find where paths intersect
    while (first != second && first != null && second != null) {
      first = first.parent;
      second = second.parent;
    }
    return first == null || second == null ? null : first;
  }

  public static TreeNode goUpBy(TreeNode node, int delta) {
    while (delta > 0 && node != null) {
      node = node.parent;
      delta--;
    }
    return node;
  }

  public static int depth(TreeNode node) {
    int depth = 0;
    while (node != null) {
      node = node.parent;
      depth++;
    }
    return depth;
  }
}
