package com.tsunazumi.quiver;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] nums = {22,4,8,-16,32};
    // Loop through starting at second element
    for (int i = 1; i < nums.length; i++) {
      // inner loop is responsible for taking the i'th element and
      // moving it lower in the array as long as it's value is
      // less than the value of the one before it)
      for (int j = i; j > 0 && nums[j] < nums[j-1]; j--) {
          int temp = nums[j];
          nums[j] = nums[j-1];
          nums[j-1] = temp;
      }
    }
    Arrays.stream(nums).forEach(System.out::println);
  }
}
