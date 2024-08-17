package com.tsunazumi.quiver;

import com.tsunazumi.misc.BinarySearchTree;

public class FindMissingNumber {
  public static void main(String[] args) {
    int[] nums = {1,3,4,5,6,7};
    int result = findMissingNumber(nums);
    System.out.println(result);
  }

  public static int findMissingNumber(int[] nums) {
    int lastNum = 0;
    for (int i : nums) {
      if (i - 1 != lastNum) {
        return i - 1;
      }
      lastNum = i;
    }
    return 0;
  }
}
