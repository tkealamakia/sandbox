package com.tsunazumi.algorithms.udemy;

public class BubbleSort {

  public static void main(String[] args) {

    int[] array = {20, 35, -15, 7, 55, 1, -22};

    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j+1]) {
          swap(array, j, j+1);
        }
      }

    }

  }

  private static void swap(int[] array, int i, int i1) {
    int temp = array[i];
    array[i] = array[i1];
    array[i1] = temp;
  }
}
