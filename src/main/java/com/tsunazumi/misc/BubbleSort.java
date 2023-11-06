package com.tsunazumi.misc;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] list = {3,2,1,5,4};
    // 2,3,1,5,4
    sort(list);
    Arrays.stream(list).forEach(System.out::println);

  }
  public static void sort(int[] list) {
    int len = list.length;
    // outer loop is only meant to move the sorted boundary to the left
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len - i - 1; j++) {
        // check
        if (list[j] > list[j+1]) {
          // swap
          int temp = list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
        }
      }
    }
  }
}
