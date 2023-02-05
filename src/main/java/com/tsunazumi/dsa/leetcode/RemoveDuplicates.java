package com.tsunazumi.dsa.leetcode;

public class RemoveDuplicates {
  public static void main(String[] args) {
//    int[] nums = new int[] {1,1,2};
    int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
    int result = removeDuplicates(nums);
    System.out.println(result);
  }

  public static int removeDuplicates(int[] nums) {
    int res = 1;
    for (int i=1; i < nums.length; i++) {
      if (nums[res-1] != nums[i]) {
        nums[res] = nums[i];
        res++;
      }
    }
    return res;
  }

}
