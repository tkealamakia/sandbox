package com.tsunazumi.quiver;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int[] ar = { 5, 7, 9, 31, 1, 2, 30};
    int[] result = mergeSort(ar);
    for (int i: result) {
      System.out.println(i);
    }

  }

  public static int[] mergeSort(int[] ar) {
    if (ar.length <= 1) {
      return ar;
    }

    int length = ar.length;
    int middle = length / 2;
    int[] left = Arrays.copyOfRange(ar, 0, middle);
    int[] right = Arrays.copyOfRange(ar, middle, length);

    return merge(
        mergeSort(left), mergeSort(right)
    );
  }


  public static int[] merge(int[] ar1, int[] ar2) {
    int[] result = new int[ar1.length + ar2.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < ar1.length && j < ar2.length) {
      if (ar1[i] > ar2[j]) {
        result[k++] = ar2[j++];
      } else {
        result[k++] = ar1[i++];
      }
    }

    while (i < ar1.length) {
      result[k++] = ar1[i++];
    }

    while (j < ar2.length) {
      result[k++] = ar2[j++];
    }

    return result;
  }

}
