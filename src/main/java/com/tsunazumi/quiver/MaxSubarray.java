package com.tsunazumi.quiver;

public class MaxSubarray {
  public static void main(String[] args) {
    int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//    int[] input = new int[]{-1};
//    int[] input = new int[]{5,4,-1,7,8};
    int result = maxSubArray(input);
    System.out.println(result);

  }

  // Given an integer array, find the contiguous subarray with the largest sum
  // and return that sum. (Kadane's Algorithm)
  static int maxSubArray(int[] nums) {
    int max = nums[0];
    int runningSum = 0;

    for (int i = 0; i < nums.length; i++) {
      // check if the current number is greater than itself plus the current max.  If it is
      // then we restart the runningSum
      runningSum = Math.max(nums[i], nums[i] + runningSum);
      // keep track of the highest ever seen subarray sum
      // by checking if the current runningSum is greater than the max
      max = Math.max(runningSum, max);
    }
    return max;
  }
}
