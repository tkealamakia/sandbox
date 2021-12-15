package com.tsunazumi.algorithms.structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {

  public int value;
  public TreeNode left;
  public TreeNode right;
  public TreeNode parent;

  public TreeNode(int value, TreeNode right, TreeNode left) {
    this.value = value;
    this.right = right;
    this.left = left;
  }

  public TreeNode(int value, TreeNode right, TreeNode left, TreeNode parent) {
    this.value = value;
    this.right = right;
    this.left = left;
    this.parent = parent;
  }

  public TreeNode(int value) {
    this.value = value;
  }

  public int getSize() {
    int size = 0;
    return findSize(this, size);
  }

  public int findSize(TreeNode node, int size) {
    if (node != null) {
      size++;
    }
    else {
      return size;
    }
    size = findSize(node.left, size);
    size = findSize(node.right, size);
    return size;
  }
  
  public int getTreeDepth() {
    int countRight = 0;
    int countRightTotal = depthCountRight(this, countRight);
    int countLeft = 0;
    int countLeftTotal = depthCountLeft(this, countLeft);
    if (countRightTotal > countLeftTotal) {
      return countRightTotal;
    }
    return countLeftTotal;

  }
  
  public int depthCountRight(TreeNode node, int count) {
    if (node != null && node.right != null) {
      count++;
      return (depthCountRight(node.right, count));
    }
    return count;
  }

  public int depthCountLeft(TreeNode node, int count) {
    if (node != null && node.right != null) {
      count++;
      return (depthCountLeft(node.left, count));
    }
    return count;
  }
  
  @Override
  public String toString() {
    return String.valueOf(this.value);
    /*
    StringBuffer sb = new StringBuffer();
    return toStringTree(this, sb, "");
    */
  }
  
  public static String toStringTree(TreeNode node, StringBuffer sb, String indent) {
    if (node != null) {
      sb.append(indent);
      sb.append(node.value);
      sb.append("-");
      sb.append("\n");
      sb.append("  " + indent);
      sb.append("|\n");
    }
    if (node.right != null) {
      return toStringTree(node.right, sb, indent + "  ");
    }
    return sb.toString();
  }
  
}
