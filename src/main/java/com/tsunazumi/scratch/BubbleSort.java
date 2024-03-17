package com.tsunazumi.scratch;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] numbers = new int[] {7,4,3,1,5};

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length - 1 - i; j++) {
        if (numbers[j] > numbers[j+1]) {
          int temp = numbers[j];
          numbers[j] = numbers[j+1];
          numbers[j+1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(numbers));
  }
}
