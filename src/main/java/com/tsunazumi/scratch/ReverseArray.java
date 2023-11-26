package com.tsunazumi.scratch;


import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    Integer[] array = new Integer[] {1,2,3,4,5};
    System.out.println(Arrays.toString(array));
    reverseArray(array);
    System.out.println(Arrays.toString(array));


  }

  public static void reverseArray(Integer[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }
  }
}
