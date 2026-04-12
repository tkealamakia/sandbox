package com.tsunazumi.quiver;

public class TwoSumTwoPointers {
  public static void main(String[] args) {
    int[] nums = {1,2,4,4};
    System.out.println(isTwoSumSorted(nums, 8));
  }

  public static boolean isTwoSumSorted(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int sum = nums[left] + nums[right];
      if (sum == target) {
        return true;
      } else if (sum < target) {
        left++; // need a bigger sum
      } else {
        right--; // need a smaller sum
      }

    }
    return false;
  }
}
