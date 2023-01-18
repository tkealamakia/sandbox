package com.tsunazumi.dsa.crackingCodingInterview;

import com.tsunazumi.dsa.structures.TreeNode;

public class Cc42 {

  public static void main(String[] args) {
    int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    TreeNode node = createMinimalBST(values);
    System.out.println(node);
    System.out.println(node.getTreeDepth());
  }
  
  public static TreeNode createMinimalBST(int array[]) {
    return createMinimalBST(array, 0, array.length - 1, null);
  }

  public static TreeNode createMinimalBST(int arr[], int start, int end, TreeNode parent) {
    if (end < start) {
      return null;
    }
    int mid = (start + end) / 2;
    TreeNode n = new TreeNode(arr[mid]);
    n.parent = parent;
    n.left = createMinimalBST(arr, start, mid - 1, n);
    n.right = createMinimalBST(arr, mid + 1, end, n);
    return n;
  }

}
