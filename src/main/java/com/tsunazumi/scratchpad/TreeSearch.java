package com.tsunazumi.scratchpad;

import com.tsunazumi.structures.TreeNode;

import java.util.List;


public class TreeSearch {
  public static void main(String[]args){
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

//    System.out.println(depthFirstSearch(root, 5));
//    System.out.println(breadthFirstSearch(root, 20));

//    System.out.println(maxDepth(root));
//    System.out.println(isTreeBalanced(root));

//    List<Integer> list = new ArrayList<>();
//    depthFirstWalk(root, list);
//    list.forEach(System.out::println);

  }

  public static int maxDepth(TreeNode root) {
    return 0;
  }

  public static boolean isTreeBalanced(TreeNode root) {
    return checkHeight(root) != -1;
  }

  public static int checkHeight(TreeNode node) {
    return 0;
  }

  public static void depthFirstWalk(TreeNode root, List<Integer> list) {
  }

  public static boolean depthFirstSearch(TreeNode root, int needle) {
    return false;
  }

  public static boolean breadthFirstSearch(TreeNode root, int needle) {
    return false;
  }

}
