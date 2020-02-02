package com.tsunazumi.algorithms.udemy;

public class BubbleSort2 {

  public static void main(String[] args) {
    int[] values = {55, -15, -22, 3, 7, 1};

    int sortedIndex = 1;
    while (sortedIndex != values.length-1) {
      for (int i = 0; i < values.length - sortedIndex ; i++) {
        if (values[i] > values[i+1]) {
          int temp = values[i+1];
          values[i+1] = values[i];
          values[i] = temp;
        }
      }
      sortedIndex++;
    }

    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }
  }
}
