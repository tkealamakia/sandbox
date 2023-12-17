package com.tsunazumi.dsa.leetcode;

public class MaxSubarray {
  public static void main(String[] args) {
    int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
    int result = maxSubArray(input);
    System.out.println(result);

  }
  static int maxSubArray(int[] nums) {
    // loop through and keep track of the largest contiguous
    // result.
    int maxSum = 0;
    int currentSum = 0;
    for (int i = 0; i < nums.length; i++) {
      currentSum = Math.max(nums[i], currentSum + nums[i]);
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;

  }
}
