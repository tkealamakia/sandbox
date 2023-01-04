package com.tsunazumi.misc;

public class Practice {

  public static void main(String[] args) {
    int[] list = new int[]{3,4,5,2,1};
    int[] result = new int[5];

    // **** Bubble Sort ****
    // outer loop used to exclude the sorted elements from the inner loop
    for (int i = 0; i < list.length - 1; i++) {
      // i from the outer loop is removed from the while condition
      for (int j = 0; j < list.length - i - 1; j++) {
        if (list[j] > list[j+1]) {
          int temp = list[j];
          list[j] = list[j+1];
          list[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i]);
    }
    System.out.println();

    // **** Reverse Array ****
    for (int i = 0; i < list.length / 2; i++) {
      int temp = list[i];
      list[i] = list[list.length - i - 1];
      list[list.length-i-1] = temp;
    }

    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i]);
    }




  }
}
