package com.tsunazumi.algorithms.hackerrank.interviewprep;

public class MaxArraySum {

  public static void main(String[] args) {
    //int[] arr = {-2,1,3,-4,5};
    int[] arr = {3,7,4,6,5};
    int result = maxSubsetSum(arr);
    System.out.println(result);
  }

  static int maxSubsetSum(int[] arr) {
    int localMax = 0;
    int globalMax = 0;

    for (int i=0; i<arr.length; i++) {
      localMax = Math.max(arr[i], arr[i] + localMax);
      if (localMax > globalMax) {
        globalMax = localMax;
      }
    }
    return globalMax;
  }
}
