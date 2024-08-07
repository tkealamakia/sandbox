package com.tsunazumi.scratch;

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
    System.out.println(breadthFirstSearch(three, 8));

    List<Integer> list = new ArrayList<>();
//    depthFirstWalk(three, list);
    list.forEach(System.out::println);

//    System.out.println(maxDepth(three));

  }

  public static int maxDepth(TreeNode root) {
    return -1;
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
