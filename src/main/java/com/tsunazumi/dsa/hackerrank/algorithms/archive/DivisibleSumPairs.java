package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class DivisibleSumPairs {

  public static void main(String[] args) {
    int[] ar = { 1, 2, 3, 4, 5, 6};
    int num = 5;
    System.out.println(divisibleSumPairs(0, num, ar));

  }


  static int divisibleSumPairs(int n, int k, int[] ar) {
    int count = 0;
    for (int i = 0; i < ar.length ; i++) {
      for (int j = 0; j < ar.length; j++) {
        if (i == j) {
          continue;
        }
        if ((ar[i] + ar[j]) % k == 0) {
          count++;
        }
      }
    }
    return count/2;
  }
}
