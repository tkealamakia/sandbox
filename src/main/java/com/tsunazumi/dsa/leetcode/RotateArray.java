package com.tsunazumi.dsa.leetcode;

public class RotateArray {

  public static void main(String[] args) {
//    int[] nums = new int[] {1,2,3,4,5,6,7};
    int[] nums = new int[] {1,2};
    rotate(nums, 5);
    for (int i=0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }

  public static void rotate(int[] nums, int k) {
    if (nums.length == 1) {
      return;
    }
    k = k % nums.length;
    int[] arraycopy = nums.clone();
    for (int i=0; i < arraycopy.length; i++) {
      // Find target index of current item
      int targetIndex = i + k;
      if (targetIndex > arraycopy.length -1) {
        targetIndex = targetIndex - arraycopy.length;
      }
      nums[targetIndex] = arraycopy[i];
    }
  }

}
