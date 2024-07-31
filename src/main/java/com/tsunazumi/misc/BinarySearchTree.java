package com.tsunazumi.misc;

import com.tsunazumi.dsa.structures.TreeNode;

public class BinarySearchTree {

  TreeNode root;

  public BinarySearchTree() {
    this.root = null;
  }

  public TreeNode insert(int value) {
    if (root == null) {
      root = new TreeNode(value);
      return root;
    }
    TreeNode current = this.root;
    while (true) {
      if (value < current.value) {
        if (current.left == null) {
          current.left = new TreeNode(value);
          return current.left;
        }
        current= current.left;
      } else {
        if (current.right == null) {
          current.right = new TreeNode(value);
          return current.right;
        }
        current = current.right;
      }
    }
  }

  public boolean insert2(int value) {
    // traverse to find the insertion point
    if (root == null) {
      root = new TreeNode(value);
    } else {
      if (value < root.value) {
        // navigate left
        if (root.left != null) {
          return recurse (value, root.left);
        } else {
          root.left = new TreeNode(value);
          return true;
        }
      } else {
        if (root.right != null) {
          return recurse (value, root.right);
        } else {
          root.right = new TreeNode(value);
          return true;
        }
      }
    }
    return false;
  }

  private boolean recurse(int value, TreeNode node) {
    if (value < node.value) {
      if (node.left != null) {
        recurse(value, node.left);
      } else {
        node.left = new TreeNode(value);
        return true;
      }
    } else  {
      if (node.right != null) {
        recurse (value, node.right);
      } else {
        node.right = new TreeNode(value);
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(9);
    bst.insert(4);
    bst.insert(6);
    bst.insert(20);
    bst.insert(170);
    bst.insert(15);
    bst.insert(1);
    System.out.println("all done");
  }


}
