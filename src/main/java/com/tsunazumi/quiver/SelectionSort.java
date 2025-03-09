package com.tsunazumi.quiver;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] nums = {22,4,8,-16,32};

    // Outer loop keeps the sorted partition
    // doing minus 1 here because the last element will already be in place
    // and this will save us one loop on the outer loop
    for (int i = 0; i < nums.length - 1; i++) {
      // Start with assuming the first item in the array is the min
      int minValueIndex = i;
      // Loop through the full unsorted partition to find the min value index
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[minValueIndex]) {
          minValueIndex = j;
        }
      }
      // Now we are through the full un-partitioned search
      // Swap value in the min index into the sorted partition
      // ony if the min index is different than i
      if (minValueIndex != i) {
        int temp = nums[i];
        nums[i] = nums[minValueIndex];
        nums[minValueIndex] = temp;
      }
    }

    Arrays.stream(nums).forEach(System.out::println);

  }
}
