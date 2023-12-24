package com.tsunazumi.dsa.leetcode;

import com.tsunazumi.dsa.structures.TreeNode;

public class SortedArrayToBST {

  public static void main(String[] args) {
    int[] nums = new int[] {-10, -3, 0, 5, 9};
//    int[] nums = new int[] {1, 3};
    sortedArrayToBST(nums);

  }
  static TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums, 0, nums.length -1);

  }

  static TreeNode helper(int[] nums, int left, int right) {
    if (left > right) {
      return null;
    }
    int mid = (left + right) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = helper(nums, left, mid - 1);
    root.right = helper(nums, mid + 1, right);
    return root;
  }


}
