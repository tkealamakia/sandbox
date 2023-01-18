package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class mixMaxSum {
  public static void main(String[] args) {
    int[] arr = { 5, 5, 5, 5, 5};
    miniMaxSum(arr);

  }

  static void miniMaxSum(int[] arr) {
    long min = arr[0];
    long max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    long minSum = 0;
    long maxSum = 0;
    boolean alreadyExcludedMin = false;
    boolean alreadyExcludedMax = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == min && !alreadyExcludedMin) {
        alreadyExcludedMin = true;
      } else {
        maxSum += arr[i];
      }
      if (arr[i] == max && !alreadyExcludedMax) {
        alreadyExcludedMax = true;
      } else {
        minSum += arr[i];
      }
    }

    System.out.println(minSum + " " + maxSum);

  }
}