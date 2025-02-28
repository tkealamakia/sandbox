package com.tsunazumi.quiver;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] nums = {22,4,8,-16,32};
    for (int i = 1; i < nums.length; i++) {
//      for (int j = i; j > 0; j--) {
//        if (nums[j] < nums[j-1]) {
//          int temp = nums[j];
//          nums[j] = nums[j-1];
//          nums[j-1] = temp;
//        } else {
//          break;
//        }
        for (int j = i; j > 0 && nums[j] < nums[j-1]; j--) {
            int temp = nums[j];
            nums[j] = nums[j-1];
            nums[j-1] = temp;
        }
      }
    Arrays.stream(nums).forEach(System.out::println);
  }
}
