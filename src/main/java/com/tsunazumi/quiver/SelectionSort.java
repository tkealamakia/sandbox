package com.tsunazumi.quiver;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] nums = {22,4,8,-16,32};

    // Outer loop keeps the sorted partition
    for (int i = 0; i < nums.length - 1; i++) {
      int minIndex = i;
      // Loop through the full unsorted partition to find the min index
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[minIndex]) {
          minIndex = j;
        }
      }
      // Swap value in the min index into the sorted partition
      if (minIndex != i) {
        int temp = nums[i];
        nums[i] = nums[minIndex];
        nums[minIndex] = temp;
      }
    }

    Arrays.stream(nums).forEach(System.out::println);

  }
}
