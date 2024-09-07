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

//    System.out.println(depthFirstSearch(three, 4));
//    System.out.println(breadthFirstSearch(three, 21));

    List<Integer> list = new ArrayList<>();
//    depthFirstWalk(three, list);
    list.forEach(System.out::println);

//    System.out.println(maxDepth(three));
    System.out.println(isTreeBalanced(three));

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

  public static boolean isTreeBalanced(TreeNode root) {
    return checkHeight(root) != -1;
  }

  private static int checkHeight(TreeNode node) {
    if (node == null) {
      return 0;  // A null node has height 0, so it's balanced
    }

    // Recursively get the height of the left subtree
    int leftHeight = checkHeight(node.left);
    if (leftHeight == -1) {
      return -1;  // Left subtree is not balanced
    }

    // Recursively get the height of the right subtree
    int rightHeight = checkHeight(node.right);
    if (rightHeight == -1) {
      return -1;  // Right subtree is not balanced
    }

    // If the difference in heights is greater than 1, the tree is not balanced
    if (Math.abs(leftHeight - rightHeight) > 1) {
      return -1;  // Tree is not balanced
    }

    // Return the height of the current node
    return Math.max(leftHeight, rightHeight) + 1;
  }

  public static void depthFirstWalk(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    list.add(root.value);
    depthFirstWalk(root.left, list);
    depthFirstWalk(root.right, list);
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

}