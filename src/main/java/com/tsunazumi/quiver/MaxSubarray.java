package com.tsunazumi.quiver;

public class MaxSubarray {
  public static void main(String[] args) {
//    int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
    int[] input = new int[]{-1};
//    int[] input = new int[]{5,4,-1,7,8};
    int result = maxSubArray(input);
    System.out.println(result);

  }
  static int maxSubArray(int[] nums) {
    int currentMax = 0;
    int maxSubArray = nums[0];
    for (int i = 0; i < nums.length; i++) {
      currentMax = Math.max(nums[i], nums[i] + currentMax);
      maxSubArray = Math.max(currentMax, maxSubArray);
    }
    return maxSubArray;
  }
}
