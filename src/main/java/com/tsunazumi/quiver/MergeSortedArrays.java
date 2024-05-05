package com.tsunazumi.quiver;

public class MergeSortedArrays {
  public static void main(String[] args) {
//    int[] ar1 = { 0, 3, 4, 31 };
//    int[] ar2 = { 4, 6, 30 };
    int[] ar1 = { 5, 7, 9, 31 };
    int[] ar2 = { 1, 2, 30 };
    int[] result = mergeSortedArrays(ar1, ar2);
    for (int i: result) {
      System.out.println(i);
    }

  }
  public static int[] mergeSortedArrays(int[] ar1, int[] ar2) {
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
      result[k++] = ar2[k++];
    }

    return result;
  }

}
