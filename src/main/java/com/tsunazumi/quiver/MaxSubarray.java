package com.tsunazumi.quiver;

public class MaxSubarray {
  public static void main(String[] args) {
    int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//    int[] input = new int[]{-1};
//    int[] input = new int[]{5,4,-1,7,8};
    int result = maxSubArray(input);
    System.out.println(result);

  }
  static int maxSubArray(int[] nums) {
    int max = nums[0];
    int slidingWindow = 0;

    for (int i = 0; i < nums.length; i++) {
      // check if the current number is greater than itself plus the current max.  If it is
      // then we restart the sliding window and make the current number our new max
      slidingWindow = Math.max(nums[i], nums[i] + slidingWindow);
      // keep track of the highest ever seen subarray sum
      // by checking if the current sliding window is greater than the maxSubArray
      max = Math.max(slidingWindow, max);
    }
    return max;
  }
}
