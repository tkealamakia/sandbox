package com.tsunazumi.algorithms.hackerrank;

public class MinSwaps {
  public static void main(String[] args) {

    //keep the biggest number, swap when it goes down
    int[] arr = { 7, 1, 3, 2, 4, 5, 6 };
    //int[] arr = { 2, 3, 4, 1, 5 };
    System.out.println(minimumSwaps(arr));


  }
  static int minimumSwaps(int[] array) {
    int n = array.length - 1;
    int minSwaps = 0;
    for (int i = 0; i < n; i++) {
      if (i < array[i] - 1) {
        swap(array, i, Math.min(n, array[i] -1));
        minSwaps++;
        i--;
      }
    }
    return minSwaps;
  }

  private static void swap(int[] array, int i, int i1) {
    int temp = array[i];
    array[i] = array[i1];
    array[i1] = temp;
  }
}
