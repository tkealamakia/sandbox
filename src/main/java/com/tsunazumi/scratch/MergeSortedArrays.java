package com.tsunazumi.scratch;

public class MergeSortedArrays {
  public static void main(String[] args) {
//    int[] ar1 = { 0, 3, 4, 31 };
//    int[] ar2 = { 4, 6, 30 };
    Integer[] ar1 = { 5, 7, 9, 31 };
    Integer[] ar2 = { 1, 2, 30 };
    int[] result = mergeSortedArrays(ar1, ar2);
    for (int i: result) {
      System.out.println(i);
    }

  }
  public static int[] mergeSortedArrays(Integer[] ar1, Integer[] ar2) {
    int ar1Length = ar1.length;
    int ar2Length = ar2.length;
    int[] result = new int[ar1Length + ar2Length];

    int i = 0, j = 0, k = 0;

    while (i < ar1Length && j < ar2Length) {
      if (ar1[i] < ar2[j]) {
        result[k++] = ar1[i++];
      } else {
        result[k++] = ar2[j++];
      }
    }

    while (i < ar1Length) {
      result[k] = ar1[i++];
    }

    while (j < ar2Length) {
      result[k++] = ar2[j++];
    }

    return result;

  }
}
