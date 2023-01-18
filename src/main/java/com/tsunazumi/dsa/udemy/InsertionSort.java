package com.tsunazumi.dsa.udemy;

public class InsertionSort {

  public static void main(String[] args) {
    int[] array = {20, 35, -15, 7, 55, 1, -22, };

    for (int firstUnsorted = 1; firstUnsorted < array.length; firstUnsorted++) {
      int newElement = array[firstUnsorted];

      int i;
      for (i = firstUnsorted; i > 0 && array[i - 1] > newElement; i--) {
        array[i] = array[i -1];
      }

      array[i] = newElement;
    }

    for (int j = 0; j < array.length; j++) {
      System.out.println(array[j]);
    }
  }
}
