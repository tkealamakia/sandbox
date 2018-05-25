package com.tsunazumi.algorithms.crackingCodingInterview;

import java.util.ArrayList;
import java.util.LinkedList;

import com.tsunazumi.algorithms.structures.TreeNode;

public class Cc43 {

  public static void main(String[] args) {
    int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    TreeNode node = Cc42.createMinimalBST(values);
    ArrayList<LinkedList<TreeNode>> createLevelLinkedList = Cc43.createLevelLinkedListBreadth(node);
    System.out.println(createLevelLinkedList);

  }
  
  public static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
    if (root == null) return;
    
    LinkedList<TreeNode> list = null;
    if (lists.size() == level) { // level not contained in list
      list = new LinkedList<TreeNode>();
      lists.add(list);
    }
    else {
      list = lists.get(level);
    }
    list.add(root);
    createLevelLinkedList(root.left, lists, level + 1);
    createLevelLinkedList(root.right, lists, level + 1);
  }
  
  public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
    ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
    createLevelLinkedList(root, lists, 0);
    return lists;
  }
  
  public static ArrayList<LinkedList<TreeNode>> createLevelLinkedListBreadth(TreeNode root) {
    ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
    LinkedList<TreeNode> current = new LinkedList<TreeNode>();
    if (root != null) {
      current.add(root);
    }
    while (current.size() > 0) {
      result.add(current);
      LinkedList<TreeNode> parents = current; // Go to next level
      current = new LinkedList<TreeNode>();
      for (TreeNode parent : parents) {
        /* Visit the children */
        if (parent.left != null) {
          current.add(parent.left);
        }
        if (parent.right != null) {
          current.add(parent.right);
        }
      }
    }
    return result;
  }

}
