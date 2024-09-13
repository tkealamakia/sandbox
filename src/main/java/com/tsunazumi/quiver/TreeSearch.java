package com.tsunazumi.quiver;

import com.sun.source.tree.Tree;
import com.tsunazumi.dsa.structures.TreeNode;

import java.util.*;


public class TreeSearch {
  public static void main(String[]args){

    // Balanced
    TreeNode fifteen = new TreeNode(15);
    TreeNode seven = new TreeNode(7);
    TreeNode eight = new TreeNode(8);
    TreeNode five = new TreeNode(5);

    TreeNode twenty = new TreeNode(20);
    TreeNode nine = new TreeNode(9);

    TreeNode root = new TreeNode(3);
    root.left = nine;
    root.right = twenty;
    twenty.left = seven;
    twenty.right = fifteen;
    nine.left = five;
    nine.right = eight;

    // Un-Balanced
//    TreeNode six = new TreeNode(6);
//    TreeNode four = new TreeNode(4);
//    TreeNode five = new TreeNode(5);
//    TreeNode two = new TreeNode(2);
//    TreeNode three = new TreeNode(3);
//
//    TreeNode root = new TreeNode(1);
//
//    four.left = six;
//    two.left = four;
//    two.right = five;
//    root.left = two;
//    root.right = three;

//    System.out.println(depthFirstSearch(root, 4));
//    System.out.println(breadthFirstSearch(root, 21));

//    List<Integer> list = new ArrayList<>();
//    depthFirstWalk(three, list);
//    list.forEach(System.out::println);

//    System.out.println(maxDepth(three));
//    System.out.println(isTreeBalanced(root));

//    findLowestCommonAncestor(root, 5, 15);
    System.out.println(findLowestCommonAncestor(root, 7, 15));
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
  public static TreeNode findLowestCommonAncestor(TreeNode root, int a, int b) {
    if (root == null) {
      return null;
    }

    // If we find either a or b, return this node (base case)
    if (root.value == a || root.value == b) {
      return root;
    }

    // Traverse left and right subtrees
    TreeNode left = findLowestCommonAncestor(root.left, a, b);
    TreeNode right = findLowestCommonAncestor(root.right, a, b);

    // If both left and right are non-null, we've found the LCA
    if (left != null && right != null) {
      return root;
    }

    // If only one side is non-null, return the non-null value
    return left != null ? left : right;
  }

  public static int findLowestCommonAncestor2(TreeNode root, int a, int b) {
    if (root == null) {
      return 0;
    }
    // get a set of all the nodes visited to get a
    List<Integer> aList = new ArrayList<>();
    depthFirstSearchWalk(root, a, aList);
    // get a set of all the nodes visited to get b
    List<Integer> bList = new ArrayList<>();
    depthFirstSearchWalk(root, b, bList);

    aList.retainAll(bList);
    return Collections.max(aList);

  }
  public static boolean depthFirstSearchWalk(TreeNode root, int needle, List<Integer> col) {
    if (root == null) {
      return false;
    }

    if (root.value == needle) {
      return true;  // Found the value
    }

    if (depthFirstSearchWalk(root.left, needle, col)) {
      col.add(root.value);
      return true;
    }
    if (depthFirstSearchWalk(root.right, needle, col)) {
      col.add(root.value);
      return true;
    }
    return false;
  }


}