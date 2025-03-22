package com.tsunazumi.quiver;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] nums = {22,4,8,-16,32};
    // Loop through starting at second element
    for (int i = 1; i < nums.length; i++) {
      // start at the i'th position and work backwards
      // keep moving the i'th position number down toward the front
      // as long as it's smaller than the one in front of it
      for (int j = i; j > 0 && nums[j] < nums[j-1]; j--) {
          int temp = nums[j];
          nums[j] = nums[j-1];
          nums[j-1] = temp;
      }
    }
    Arrays.stream(nums).forEach(System.out::println);
  }
}
