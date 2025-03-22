package com.tsunazumi.quiver;

import java.util.Arrays;

public class CountingSort {
  public static void main(String[] args) {
    int[] arr = {5, 2, 7, 4, -2, 2 };

    int min = Arrays.stream(arr).min().orElse(0);
    int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);

    // create the new array
    int[] countArray = new int[max - min + 1];
    // fill the new array up with occurrences of the numbers
    // at each position
    for (int value : arr) {
      countArray[value - min]++;
    }

    int arrayIndex = 0;
    // Loop through the new Array
    for (int i = 0; i < max - min + 1; i++) {
      // Need to operate on each count in the count array
      // So if a certain position has a count of 3, we need to
      // place 3 numbers into the original array
      while (countArray[i] > 0) {
        // place the value into the original array
        arr[arrayIndex] = i + min;
        // increment arrayIndex since we just placed one in that slot
        arrayIndex++;
        // remove one count
        countArray[i]--;
      }
    }

    Arrays.stream(arr).forEach(System.out::println);
  }
}
