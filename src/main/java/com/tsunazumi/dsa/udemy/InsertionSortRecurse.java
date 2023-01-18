package com.tsunazumi.dsa.udemy;

public class InsertionSortRecurse {

//  public static void main(String[] args) {
//    int[] array = {20, 35, -15, 7, 55, 1, -22, };
//
//    for (int firstUnsorted = 1; firstUnsorted < array.length; firstUnsorted++) {
//      int newElement = array[firstUnsorted];
//
//      int i;
//      for (i = firstUnsorted; i > 0 && array[i - 1] > newElement; i--) {
//        array[i] = array[i -1];
//      }
//
//      array[i] = newElement;
//    }
//
//    for (int j = 0; j < array.length; j++) {
//      System.out.println(array[j]);
//    }
//  }

  public static void main(String[] args) {
    int[] array = {20, 35, -15, 7, 55, 1, -22, };

    sort(array, 1);

    for (int j = 0; j < array.length; j++) {
      System.out.println(array[j]);
    }
  }

  public static void sort(int[] array, int i) {
    if (i >= array.length) {
      return;
    }
    int newElement = array[i];

    int j;
    for (j=i ; j > 0 && array[j - 1] > newElement; j--) {
      array[j] = array[j -1];
    }

    array[j] = newElement;

    sort(array, ++i);

  }
}
