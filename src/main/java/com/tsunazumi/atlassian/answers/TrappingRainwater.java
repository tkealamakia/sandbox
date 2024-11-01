package com.tsunazumi.atlassian.answers;

public class TrappingRainwater {
  public static void main(String[] args) {
    int[] arr = {3,0,1,0,4,0,2};

    int result = calculate(arr);
    System.out.println(result);
  }

  private static int calculate(int[] arr) {
    int res = 0;
    for (int i = 1; i < arr.length - 1; i++) {
      // Find the max element on the current item's left
      int left = arr[i];
      for (int j = 0; j < i; j++) {
        left = Math.max(left, arr[j]);
      }
      // Find the max element on the current item's right
      int right = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        right = Math.max(right, arr[j]);
      }

      // Update the max water
      res += Math.min(left, right) - arr[i];
    }
    return res;
  }
}
