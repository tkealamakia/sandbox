package com.tsunazumi.quiver;

public class MaxSumSubArray {
  public static void main(String[] args) {
    int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//    int[] input = new int[]{-1};
//    int[] input = new int[]{5,4,-1,7,8};
    int result = maxSumSubArray(input, 4);
    System.out.println(result);

  }

  public static int maxSumSubArray(int[] nums, int k) {
    int windowSum = 0;
    int max = 0;

    // build the first window
    for (int i=0; i < k; i++) {
      windowSum += nums[i];
    }

    max = windowSum;

    // slide the window: add the next element, drop the leftmost
    for (int i=k; i < nums.length; i++) {
      // take the new number in the widow and subtract the old number
      // Add that result to the windowSum
      windowSum += nums[i] - nums[i-k];
      max = Math.max(max, windowSum);
    }
    return max;

  }
}
