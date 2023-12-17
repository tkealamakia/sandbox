package com.tsunazumi.quiver;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] list = {3,2,1,5,4};
    // 2,3,1,5,4
    sort(list);
    Arrays.stream(list).forEach(System.out::println);

  }
  public static void sort(int[] list) {
    for (int i = 0; i < list.length; i++) {
      for (int j = 0; j < list.length - 1 - i; j++) {
        if (list[j] > list[j+1]) {
          int temp = list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
        }
      }
    }
  }

}
