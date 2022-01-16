package com.tsunazumi.algorithms.hackerrank.interviewprep;

public class MaxArraySum {

  public static void main(String[] args) {
    int[] arr = {-2,1,3,-4,5};
//    int[] arr = {3,7,4,6,5};
    int result = maxSubsetSum(arr);
    System.out.println(result);
  }
  static int maxSubsetSum(int[] arr) {
    int length = arr.length;
    if (length == 0) return 0;
    if (length == 1) return arr[1];

    int[] dp = new int[length];
    dp[0] = Math.max(0, arr[0]);
    dp[1] = Math.max(dp[0], arr[1]);
    for (int i = 2; i < length; i++) {
      dp[i] = Math.max(dp[i-1], arr[i] + dp[i-2]);
    }
    return dp[length-1];
  }
}
