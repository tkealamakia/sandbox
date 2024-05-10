package com.tsunazumi.quiver;

import com.sun.source.tree.Tree;
import com.tsunazumi.dsa.structures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class TreeSearch {
  public static void main(String[]args){
    TreeNode fifteen = new TreeNode(15);
    TreeNode seven = new TreeNode(7);
    TreeNode eight = new TreeNode(8);
    TreeNode five = new TreeNode(5);

    TreeNode twenty = new TreeNode(20);
    TreeNode nine = new TreeNode(9);

    TreeNode three = new TreeNode(3);
    three.left = nine;
    three.right = twenty;
    twenty.left = seven;
    twenty.right = fifteen;
    nine.left = five;
    nine.right = eight;

//    System.out.println(maxDepth(three));

//    List<Integer> list = new ArrayList<>();
//    depthFirstWalk(three, list);
//    list.forEach(System.out::println);

//    System.out.println(depthFirstSearch(three, 9));
    System.out.println(levelOrder(three));
  }

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    if (left > right) {
      return left + 1;
    }
    return right + 1;
  }

  public static void depthFirstWalk(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    depthFirstWalk(root.left, list);
    depthFirstWalk(root.right, list);
    list.add(root.value);
  }

  public static boolean depthFirstSearch(TreeNode root, int needle) {
    if (root == null) {
      return false; // Tree is empty or we've reached a leaf with no value
    }
    if (root.value == needle) {
      return true;  // Found the value
    }

    // Recurse on left and right subtrees:
    return depthFirstSearch(root.left, needle) || depthFirstSearch(root.right, needle);
  }

  public static boolean breadthFirstSearch(TreeNode root, int needle) {
    if (root == null) {
      return false;
    }
    if (root.value == needle) {
      return true;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      if (current.value == needle) {
        return true;
      }

      if (current.left != null) {
        queue.add(current.left);
      }

      if (current.right != null) {
        queue.add(current.right);
      }
    }
    return false;

  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int qlength = queue.size();
      List<Integer> level = new ArrayList<>();

      for (int i = 0; i < qlength; i++) {
        TreeNode node = queue.poll();
        level.add(node.value);
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      result.add(level);
    }
    return result;
  }

}