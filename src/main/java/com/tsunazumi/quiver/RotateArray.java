package com.tsunazumi.quiver;

public class RotateArray {
  public static void main(String[] args) {
    int[] array = {1,2,3,4};
    int[] result = rotate(array, 6);
    for (int i : result) {
      System.out.println(i);
    }
  }

  private static int[] rotate(int[] array, int i) {
    if (array == null || array.length == 0 || i % array.length == 0) {
      return array;
    }

    int n = array.length;
    i = i % n;  // Normalize the rotation amount

    // reverse the whole array
    reverse(array, 0, n - 1);
    // reverse the first partition (start to rotation amount)
    reverse(array, 0, i - 1);
    // reverse the other partiation (rotation amount to length)
    reverse(array, i, n - 1);

    return array;
  }

  private static void reverse(int[] array, int start, int end) {
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }
  }

}
