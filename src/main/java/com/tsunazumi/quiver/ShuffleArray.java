package com.tsunazumi.quiver;

import java.util.Random;

public class ShuffleArray {
  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};
    shuffleArray(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }

  public static void shuffleArray(int[] arr) {
    Random rand = new Random();
    for (int i = arr.length - 1; i > 0; i--) {
      int j = rand.nextInt(i + 1);
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }

}
